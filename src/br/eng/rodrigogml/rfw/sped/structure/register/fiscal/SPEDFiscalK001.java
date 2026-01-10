package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.kernel.exceptions.RFWException;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFiscalFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO K001: ABERTURA DO BLOCO K.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalK001 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscalK001(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 IND_MOV Indicador de movimento:<br>
   * 0- Bloco com dados informados;<br>
   * 1- Bloco sem dados informados.<Br>
   * N 001 - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r02_IND_MOV = null;

  /**
   * REGISTRO K010: INDICADOR DO TIPO DE LEIAUTE ADOTADO NA INFORMAÇÃO DO BLOCO K.<br>
   * Ocorrência: um por arquivo (nível 2).
   */
  private SPEDFiscalK010 rk010 = null;

  /**
   * REGISTRO K100: PERÍODO DE APURAÇÃO DO ICMS/IPI<br>
   * Chave: Campos DT_INI + '|' + DT_FIN contatenados no formato "long" do objeto Date.
   */
  private final LinkedHashMap<String, SPEDFiscalK100> rk100 = new LinkedHashMap<String, SPEDFiscalK100>();

  @Override
  public String get01_Register() {
    return "K001";
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
  public String getR02_IND_MOV() {
    return r02_IND_MOV;
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
  public void setR02_IND_MOV(String r02_IND_MOV) {
    this.r02_IND_MOV = r02_IND_MOV;
  }

  /**
   * Recupera o rEGISTRO K100: PERÍODO DE APURAÇÃO DO ICMS/IPI<br>
   * Chave: Campos DT_INI + '|' + DT_FIN contatenados no formato "long" do objeto Date.
   *
   * @return the rEGISTRO K100: PERÍODO DE APURAÇÃO DO ICMS/IPI<br>
   *         Chave: Campos DT_INI + '|' + DT_FIN contatenados no formato "long" do objeto Date
   */
  public LinkedHashMap<String, SPEDFiscalK100> getRk100() {
    return rk100;
  }

  public SPEDFiscalK010 getRk010() {
    return rk010;
  }

  public void setRk010(SPEDFiscalK010 rk010) {
    this.rk010 = rk010;
  }

  @Override
  public void calculate(String uuid) throws RFWException {
    if (uuid == null || !uuid.equals(this.getLastUUID())) {
      super.calculate(uuid);
      // Verifica se há conteúdo nos registros
      boolean hasContent = !this.rk100.isEmpty();
      r02_IND_MOV = hasContent ? "0" : "1";

      // A partir de 2023 o K010 passa a ser obrigatório se IND_MOV=0.
      // Como a biblioteca nem sempre tem a versão do layout explicitamente aqui,
      // usamos a data inicial do arquivo (0000) como referência quando disponível.
      if ("0".equals(r02_IND_MOV)) {
        try {
          SPEDFiscalFile sped = (SPEDFiscalFile) this.getSpedFile();
          if (sped.getR0000() != null && sped.getR0000().getR04_DT_INI() != null && sped.getR0000().getR04_DT_INI().getYear() >= 2023) {
            if (this.rk010 == null) this.rk010 = new SPEDFiscalK010(this.getSpedFile());
          }
        } catch (ClassCastException ignore) {
          // Ignora caso o SPEDFile não seja SPEDFiscalFile.
        }
      }

      if (this.rk010 != null) this.rk010.calculate(uuid);
    }
  }
}