package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.kernel.exceptions.RFWCriticalException;
import br.eng.rodrigogml.rfw.kernel.exceptions.RFWException;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO 9001: ABERTURA DO BLOCO 9.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscal9001 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscal9001(SPEDFile spedFile) {
    super(spedFile);
  }

  private final LinkedHashMap<String, SPEDFiscal9900> r9900_AUTO = new LinkedHashMap<String, SPEDFiscal9900>();

  /**
   * 02 IND_MOV Indicador de movimento:<br>
   * 0- Bloco com dados informados;<br>
   * 1- Bloco sem dados informados.<Br>
   * N 001 - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r02_IND_MOV_AUTO = null;

  @Override
  public String get01_Register() {
    return "9001";
  }

  /**
   * Recupera o 02 IND_MOV Indicador de movimento:<br>
   * 0- Bloco com dados informados;<br>
   * 1- Bloco sem dados informados.<Br>
   * N 001 - O.
   *
   * @return the 02 IND_MOV Indicador de movimento:<br>
   *         0- Bloco com dados informados;<br>
   *         1- Bloco sem dados informados
   */
  public String getR02_IND_MOV_AUTO() {
    return r02_IND_MOV_AUTO;
  }

  /**
   * Define o 02 IND_MOV Indicador de movimento:<br>
   * 0- Bloco com dados informados;<br>
   * 1- Bloco sem dados informados.<Br>
   * N 001 - O.
   *
   * @param r02_IND_MOV the new 02 IND_MOV Indicador de movimento:<br>
   *          0- Bloco com dados informados;<br>
   *          1- Bloco sem dados informados
   */
  public void setR02_IND_MOV_AUTO(String r02_IND_MOV) {
    this.r02_IND_MOV_AUTO = r02_IND_MOV;
  }

  /**
   * Gets the r9900.
   *
   * @return the r9900
   */
  public LinkedHashMap<String, SPEDFiscal9900> getR9900_AUTO() {
    return r9900_AUTO;
  }

  @Override
  public void calculate(String uuid) throws RFWException {
    if (uuid == null || !uuid.equals(this.getLastUUID())) {
      // Limpa os registros filhos, pois serão gerados automaticamente de acordo com o conteúdo do arquivo
      this.r9900_AUTO.clear();
      super.calculate(uuid); // Sem filhos, a chamada ao pai só trava o uuid.

      Field[] fields = this.getSpedFile().getClass().getDeclaredFields();
      Arrays.sort(fields, fieldComparator);

      createR9900ForFields(this.getSpedFile(), fields);

      // Depois de contabilizar todos os registros, criamos o 9900 para este registro
      SPEDFiscal9900 r9900_9001 = new SPEDFiscal9900(this.getSpedFile());
      r9900_9001.setR02_REG_BLC("9001");
      r9900_9001.setR03_QTD_REG_BLC_AUTO(1);
      this.getR9900_AUTO().put("9001", r9900_9001);

      SPEDFiscal9900 r9900_9900 = new SPEDFiscal9900(this.getSpedFile());
      r9900_9900.setR02_REG_BLC("9900");
      r9900_9900.setR03_QTD_REG_BLC_AUTO(this.r9900_AUTO.size() + 1); // Soma 1 pq este objeto conta e ainda não está na coleção
      this.getR9900_AUTO().put("9900", r9900_9900);

      // Verifica se há conteúdo nos registros
      boolean hasContent = !r9900_AUTO.isEmpty();
      r02_IND_MOV_AUTO = hasContent ? "0" : "1";
    }
  }

  /**
   * Recebe uma lista de 'Fields' e itera em busca de métodos get com o padrão 'r????'.<br>
   * Ao encontrar calcula a quantidade e adiciona um registro 0990.<br>
   * Ignora o próprio registro 9001, que é adicionado manualmente ao final.
   *
   * @param fieldList
   * @throws RFWException
   */
  private void createR9900ForFields(Object obj, Field[] fields) throws RFWException {
    for (int i = 0; i < fields.length; i++) {
      Field f = fields[i];
      if (f.getName().matches("r[A-Za-z0-9]{4}(\\Q_AUTO\\E)?") && !f.getName().equals("r9001")) {
        Object value = null;
        try {
          Method mGet = obj.getClass().getMethod("getR" + f.getName().substring(1));
          value = mGet.invoke(obj);
        } catch (Exception e) {
          throw new RFWCriticalException("BISModules_000263", new String[] { f.getName() }, e);
        }
        if (value != null) {
          SPEDFiscal9900 r9900 = new SPEDFiscal9900(this.getSpedFile());
          r9900.setR02_REG_BLC(f.getName().substring(1).toUpperCase());
          this.getR9900_AUTO().put(r9900.getR02_REG_BLC(), r9900);

          if (value instanceof LinkedHashMap) {
            r9900.setR03_QTD_REG_BLC_AUTO(((LinkedHashMap<?, ?>) value).size());
            for (Object spedReg : ((LinkedHashMap<?, ?>) value).values()) {
              Field[] fields2 = spedReg.getClass().getDeclaredFields();
              Arrays.sort(fields2, fieldComparator);
              createR9900ForFields(spedReg, fields2);
            }
          } else if (value instanceof ArrayList) {
            r9900.setR03_QTD_REG_BLC_AUTO(((ArrayList<?>) value).size());
            for (Object spedReg : (ArrayList<?>) value) {
              Field[] fields2 = spedReg.getClass().getDeclaredFields();
              Arrays.sort(fields2, fieldComparator);
              createR9900ForFields(spedReg, fields2);
            }
          } else if (value instanceof SPEDRegister) {
            r9900.setR03_QTD_REG_BLC_AUTO(1);
            Field[] fields2 = value.getClass().getDeclaredFields();
            Arrays.sort(fields2, fieldComparator);
            createR9900ForFields(value, fields2);
          }
        }
      }
    }
  }
}