package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO 0990: ENCERRAMENTO DO BLOCO 0.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscal0990 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscal0990(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 QTD_LIN_0 Quantidade total de linhas do Bloco 0 N - - O
   */
  @SPEDField(maxLength = 255)
  private Integer r02_QTD_LIN_0 = null;

  @Override
  public String get01_Register() {
    return "0990";
  }

  /**
   * Recupera o 02 QTD_LIN_0 Quantidade total de linhas do Bloco 0 N - - O.
   *
   * @return the 02 QTD_LIN_0 Quantidade total de linhas do Bloco 0 N - - O
   */
  public Integer getR02_QTD_LIN_0() {
    return r02_QTD_LIN_0;
  }

  /**
   * Define o 02 QTD_LIN_0 Quantidade total de linhas do Bloco 0 N - - O.
   *
   * @param r02_QTD_LIN_0 the new 02 QTD_LIN_0 Quantidade total de linhas do Bloco 0 N - - O
   */
  public void setR02_QTD_LIN_0(Integer r02_QTD_LIN_0) {
    this.r02_QTD_LIN_0 = r02_QTD_LIN_0;
  }

}