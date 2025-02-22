package br.eng.rodrigogml.rfw.sped.structure;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;

import br.eng.rodrigogml.rfw.kernel.bundle.RFWBundle;
import br.eng.rodrigogml.rfw.kernel.dataformatters.LocaleConverter;
import br.eng.rodrigogml.rfw.kernel.dataformatters.RFWCPFOrCNPJDataFormatter;
import br.eng.rodrigogml.rfw.kernel.exceptions.RFWCriticalException;
import br.eng.rodrigogml.rfw.kernel.exceptions.RFWException;
import br.eng.rodrigogml.rfw.kernel.exceptions.RFWValidationException;
import br.eng.rodrigogml.rfw.kernel.utils.RUDV;
import br.eng.rodrigogml.rfw.kernel.utils.RUMail;
import br.eng.rodrigogml.rfw.kernel.utils.RUTypes;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: Esta classe cria a sistem�tica de base para criar os registros dos arquivos do SPED. Permite montar o arquivo de forma estrutural, campo a campo, at� o momento da escrita. Permitindo sua manipula��o e valida��o pelas annotations de defini��o.<br>
 *
 * @author Rodrigo Leit�o
 * @since 7.1.0 (30 de mai de 2017)
 */
public abstract class SPEDRegister implements Serializable {

  private static final long serialVersionUID = -136773754833764622L;

  private static final Locale SPEDLOCALE = new Locale("pt", "BR");

  public static final Comparator<Field> fieldComparator = new Comparator<Field>() {
    @Override
    public int compare(Field o1, Field o2) {
      return o1.getName().compareTo(o2.getName());
    }
  };

  public abstract String get01_Register();

  /**
   * Este m�todo deve ser sobreescrito pelas implementa��es dos registros que t�m campos que podem ser calculados automaticamente a partir do valor de outros.<br>
   * Os c�lculos desses campos devem ser feitos dentro deste m�todo e, seguindo a conve��o, os campos que t�m seu valor calculado por este m�todo devem ter o sufixo '''_AUTO''', conforme documentado em: https://wiki.rodrigogml.eng.br/index.php/Estrutura_de_Classes#SPEDRegister.<br>
   * Este m�todo tamb�m deve calcular o valor dos seus registros filhos recursivamente.
   */
  public void calculateFields() {
  }

  /**
   * M�todo respons�vel por escrever o conte�do deste (clase que estedeu esta classe) no formado texto para exportar no arquivo do SPED.
   *
   * @param buff StringBuilder para escrita do conte�do desse registro no formado texto (formato do SPED)
   * @throws RFWException Lan�ado em caso de falha
   */
  public void writeFileRegister(StringBuilder buff) throws RFWException {
    // Obtemos os campos/atributos da classe e organizamos ele de forma alfab�tica para garantir que teremos eles na ordem para escrever no arquivo.
    Field[] fields = this.getClass().getDeclaredFields();
    Arrays.sort(fields, fieldComparator);

    // Come�amos o registro com o c�digo do Registro
    buff.append('|').append(this.get01_Register());

    // Iteramos os m�todos encontrados, e se estiverem no padr�o "r##_" escrevemos no Buffer de acordo com as defini��es da sua annotation
    for (int i = 0; i < fields.length; i++) {
      Field f = fields[i];
      if (f.getName().matches("r[0-9]{2}\\_.*")) { // S� os atributos tipo r##_CAMPO
        Object value = null;
        try {
          Method mGet = this.getClass().getMethod("getR" + f.getName().substring(1));
          value = mGet.invoke(this);
        } catch (Exception e) {
          throw new RFWCriticalException("BISModules_000263", new String[] { f.getName() }, e);
        }
        SPEDField ann = f.getAnnotation(SPEDField.class);
        if (ann == null) throw new RFWCriticalException("BISModules_000262", new String[] { f.getName() });

        // Valida se o conte�do for nulo e o campo obrigat�rio lan�amos exce��o
        if (ann.required() && value == null) {
          throw new RFWValidationException("BISModules_000264", new String[] { f.getName(), this.get01_Register() });
        }

        String convValue = null; // Armazena o valor j� convertido para String para ser validado e colocado no Buffer
        if (value != null) {
          if (f.getType().equals(String.class)) {
            convValue = value.toString();
          } else if (f.getType().equals(Integer.class)) {
            convValue = value.toString();
          } else if (f.getType().equals(Long.class)) {
            convValue = value.toString();
          } else if (f.getType().equals(BigDecimal.class)) {
            // Verifica se temos mais decimais do que o indicado
            if (ann.decimals() > -1 && ((BigDecimal) value).scale() > ann.decimals()) {
              throw new RFWValidationException("BISModules_000268", new String[] { f.getName(), this.get01_Register(), "" + value, "" + ann.decimals() });
            }
            convValue = LocaleConverter.formatBigDecimal((BigDecimal) value, SPEDLOCALE, 0, (ann.decimals() >= 0 ? ann.decimals() : 0), false);
            convValue = convValue.replaceAll("\\.", ","); // Troca o . de decimal para ,
          } else if (f.getType().equals(LocalDate.class)) {
            if (ann.maxLength() == 8) {
              convValue = RUTypes.formatToddMMyyyy((LocalDate) value);
            } else if (ann.maxLength() == 6) {
              convValue = RUTypes.formatLocalDate((LocalDate) value, "MMyyyy");
            } else {
              throw new RFWValidationException("RFW_000004", new String[] { f.getName(), this.get01_Register(), "" + ann.decimals() });
            }
          } else if (f.getType().equals(Date.class)) {
            if (ann.maxLength() == 8) {
              convValue = new SimpleDateFormat("ddMMyyyy").format((Date) value);
            } else if (ann.maxLength() == 6) {
              convValue = new SimpleDateFormat("MMyyyy").format((Date) value);
            } else {
              throw new RFWValidationException("BISModules_000269", new String[] { f.getName(), this.get01_Register(), "" + ann.decimals() });
            }
          } else {
            throw new RFWCriticalException("BISModules_000265", new String[] { f.getName(), this.get01_Register() });
          }

          // Valida se o conte�do n�o passou do tamanho m�ximo
          if (convValue.length() > ann.maxLength()) {
            throw new RFWValidationException("BISModules_000266", new String[] { f.getName(), this.get01_Register(), convValue, "" + ann.maxLength() });
          }

          // Se tiver um tamanho m�nimo definido, validamos o mesmo
          if (ann.minLength() >= 0 && convValue.length() < ann.minLength()) throw new RFWValidationException("BISModules_000267", new String[] { f.getName(), this.get01_Register(), convValue, "" + ann.minLength() });

          // Valida��es especiais
          switch (ann.type()) {
            case NONE:
              break;
            case CNPJ:
              try {
                RUDV.validateCNPJ(convValue);
              } catch (Exception e) {
                throw new RFWValidationException("BISModules_000270", new String[] { convValue, f.getName(), this.get01_Register() });
              }
              break;
            case CPF:
              try {
                RUDV.validateCPF(convValue);
              } catch (Exception e) {
                throw new RFWValidationException("BISModules_000271", new String[] { convValue, f.getName(), this.get01_Register() });
              }
              break;
            case EMAIL:
              try {
                RUMail.validateMailAddress(convValue);
              } catch (Exception e) {
                throw new RFWValidationException("BISModules_000272", new String[] { convValue, f.getName(), this.get01_Register() });
              }
              break;
            case IE:
              try {
                RUDV.validateIE(convValue);
              } catch (Exception e) {
                throw new RFWValidationException("BISModules_000273", new String[] { convValue, f.getName(), this.get01_Register() });
              }
              break;
            case UF:
              try {
                RUDV.validateUF(convValue);
              } catch (Exception e) {
                throw new RFWValidationException("BISModules_000274", new String[] { convValue, f.getName(), this.get01_Register() });
              }
              break;
            case CNPJCPF:
              try {
                RFWCPFOrCNPJDataFormatter.getInstance().validate(convValue, null);
              } catch (Exception e) {
                throw new RFWValidationException("BISModules_000271", new String[] { convValue, f.getName(), this.get01_Register() });
              }
              break;
          }
        }

        buff.append('|');
        if (convValue != null) {
          // Remove qualquer caracter pro�bido que tenha passado
          convValue = convValue.replaceAll("\\|", "").replaceAll("\r", "").replaceAll("\n", "");
          // Removemos tamb�m as arrobas, embora n�o seja pro�bido, atrapalha a vida do Lucas rs
          // convValue = convValue.replaceAll("\\@", ""); //N�o podemos remover as arrobas por conta do e-mail do contador
          buff.append(convValue.trim());
        }
      }
    }
    // Finalizamos o registro, Inclui o | final e quebra de linha e j� retorna
    buff.append("|\r\n");

    // Iteramos os m�todos de atributos de subregistros, padr�o "r????"
    for (int i = 0; i < fields.length; i++) {
      Field f = fields[i];
      if (f.getName().matches("r[A-Za-z0-9]{4}")) {
        Object value = null;
        try {
          Method mGet = this.getClass().getMethod("getR" + f.getName().substring(1));
          value = mGet.invoke(this);
        } catch (Exception e) {
          throw new RFWCriticalException("BISModules_000263", new String[] { f.getName() }, e);
        }
        if (value instanceof LinkedHashMap) {
          for (Object spedReg : ((LinkedHashMap<?, ?>) value).values()) {
            ((SPEDRegister) spedReg).writeFileRegister(buff);
          }
        } else if (value instanceof ArrayList) {
          for (Object spedReg : (ArrayList<?>) value) {
            ((SPEDRegister) spedReg).writeFileRegister(buff);
          }
        } else if (value instanceof SPEDRegister) {
          ((SPEDRegister) value).writeFileRegister(buff);
        }
      }
    }
  }

  public int countRegisters() throws RFWException {
    int count = 1; // Come�a em 1 porque � o pr�prio registro.

    final Field[] fields = this.getClass().getDeclaredFields();

    // Iteramos os m�todos encontrados, e se estiverem no padr�o "r##_" escrevemos no Buffer de acordo com as defini��es da sua annotation
    for (int i = 0; i < fields.length; i++) {
      Field f = fields[i];
      if (f.getName().matches("r[A-Za-z0-9]{4}")) { // Atributos de subatributos
        Object value = null;
        try {
          Method mGet = this.getClass().getMethod("getR" + f.getName().substring(1));
          value = mGet.invoke(this);
        } catch (Exception e) {
          throw new RFWCriticalException("BISModules_000263", new String[] { f.getName() }, e);
        }
        if (value instanceof LinkedHashMap) {
          for (Object spedReg : ((LinkedHashMap<?, ?>) value).values()) {
            count += ((SPEDRegister) spedReg).countRegisters();
          }
        } else if (value instanceof ArrayList) {
          for (Object spedReg : (ArrayList<?>) value) {
            count += ((SPEDRegister) spedReg).countRegisters();
          }
        } else if (value instanceof SPEDRegister) {
          count += ((SPEDRegister) value).countRegisters();
        }
      }
    }
    return count;
  }

  @Override
  public String toString() {
    try {
      final StringBuilder b = new StringBuilder();
      writeFileRegister(b);
      return b.toString();
    } catch (RFWException e) {
      return RFWBundle.get(e);
    }
  }
}