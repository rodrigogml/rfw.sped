package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO G990: ENCERRAMENTO DO BLOCO G.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalG990 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  /**
   * 02 QTD_LIN_G Quantidade total de linhas do Bloco G N - - O O
   */
  @SPEDField(maxLength = 255)
  private Integer r02_QTD_LIN_G = null;

  @Override
  public String get01_Register() {
    return "G990";
  }

  /**
   * Recupera o 02 QTD_LIN_G Quantidade total de linhas do Bloco G N - - O O.
   *
   * @return the 02 QTD_LIN_G Quantidade total de linhas do Bloco G N - - O O
   */
  public Integer getR02_QTD_LIN_G() {
    return r02_QTD_LIN_G;
  }

  /**
   * Define o 02 QTD_LIN_G Quantidade total de linhas do Bloco G N - - O O.
   *
   * @param r02_QTD_LIN_0 the new 02 QTD_LIN_G Quantidade total de linhas do Bloco G N - - O O
   */
  public void setR02_QTD_LIN_G(Integer r02_QTD_LIN_0) {
    this.r02_QTD_LIN_G = r02_QTD_LIN_0;
  }

}