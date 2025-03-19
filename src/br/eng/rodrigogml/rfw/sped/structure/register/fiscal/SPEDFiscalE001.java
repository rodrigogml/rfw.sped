package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO E001: ABERTURA DO BLOCO E.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalE001 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscalE001(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * REGISTRO E100: PERÍODO DA APURAÇÃO DO ICMS.
   */
  // TODO rodrigogml o relacionamento do registro E100 com o E001 é de 1:N, foi mal feito esta estrutura, necessário alterar para uma hash, a chave de unicidade é ambas as datas de início e fim do período do registro filho.
  private SPEDFiscalE100 re100 = null;

  /**
   * 02 IND_MOV Indicador de movimento:<br>
   * 0- Bloco com dados informados;<br>
   * 1- Bloco sem dados informados.<Br>
   * N 001 - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r02_IND_MOV = null;

  @Override
  public String get01_Register() {
    return "E001";
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
   * Recupera o rEGISTRO E100: PERÍODO DA APURAÇÃO DO ICMS.
   *
   * @return the rEGISTRO E100: PERÍODO DA APURAÇÃO DO ICMS
   */
  public SPEDFiscalE100 getRe100() {
    return re100;
  }

  /**
   * Define o rEGISTRO E100: PERÍODO DA APURAÇÃO DO ICMS.
   *
   * @param re100 the new rEGISTRO E100: PERÍODO DA APURAÇÃO DO ICMS
   */
  public void setRe100(SPEDFiscalE100 re100) {
    this.re100 = re100;
  }

}