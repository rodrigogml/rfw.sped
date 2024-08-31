package br.eng.rodrigogml.rfw.sped.structure.fiscal;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO 1990: ENCERRAMENTO DO BLOCO 1.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscal1990 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  /**
   * 02 QTD_LIN_1 Quantidade total de linhas do Bloco 1 N - - O O
   */
  @SPEDField(maxLength = 255)
  private Integer r02_QTD_LIN_1 = null;

  @Override
  public String get01_Register() {
    return "1990";
  }

  /**
   * Recupera o 02 QTD_LIN_1 Quantidade total de linhas do Bloco 1 N - - O O.
   *
   * @return the 02 QTD_LIN_1 Quantidade total de linhas do Bloco 1 N - - O O
   */
  public Integer getR02_QTD_LIN_1() {
    return r02_QTD_LIN_1;
  }

  /**
   * Define o 02 QTD_LIN_1 Quantidade total de linhas do Bloco 1 N - - O O.
   *
   * @param r02_QTD_LIN_0 the new 02 QTD_LIN_1 Quantidade total de linhas do Bloco 1 N - - O O
   */
  public void setR02_QTD_LIN_1(Integer r02_QTD_LIN_0) {
    this.r02_QTD_LIN_1 = r02_QTD_LIN_0;
  }

}