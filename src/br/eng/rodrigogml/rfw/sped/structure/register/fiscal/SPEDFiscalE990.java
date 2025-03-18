package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO E990: ENCERRAMENTO DO BLOCO E.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalE990 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  /**
   * 02 QTD_LIN_E Quantidade total de linhas do Bloco E N - - O O
   */
  @SPEDField(maxLength = 255)
  private Integer r02_QTD_LIN_E = null;

  @Override
  public String get01_Register() {
    return "E990";
  }

  /**
   * Recupera o 02 QTD_LIN_E Quantidade total de linhas do Bloco E N - - O O.
   *
   * @return the 02 QTD_LIN_E Quantidade total de linhas do Bloco E N - - O O
   */
  public Integer getR02_QTD_LIN_E() {
    return r02_QTD_LIN_E;
  }

  /**
   * Define o 02 QTD_LIN_E Quantidade total de linhas do Bloco E N - - O O.
   *
   * @param r02_QTD_LIN_0 the new 02 QTD_LIN_E Quantidade total de linhas do Bloco E N - - O O
   */
  public void setR02_QTD_LIN_E(Integer r02_QTD_LIN_0) {
    this.r02_QTD_LIN_E = r02_QTD_LIN_0;
  }

}