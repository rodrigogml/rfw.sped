package br.eng.rodrigogml.rfw.sped.structure.fiscal;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO K990: ENCERRAMENTO DO BLOCO K.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalK990 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  /**
   * 02 QTD_LIN_K Quantidade total de linhas do Bloco K N - - O O
   */
  @SPEDField(maxLength = 255)
  private Integer r02_QTD_LIN_K = null;

  @Override
  public String get01_Register() {
    return "K990";
  }

  /**
   * Recupera o 02 QTD_LIN_K Quantidade total de linhas do Bloco K N - - O O.
   *
   * @return the 02 QTD_LIN_K Quantidade total de linhas do Bloco K N - - O O
   */
  public Integer getR02_QTD_LIN_K() {
    return r02_QTD_LIN_K;
  }

  /**
   * Define o 02 QTD_LIN_K Quantidade total de linhas do Bloco K N - - O O.
   *
   * @param r02_QTD_LIN_0 the new 02 QTD_LIN_K Quantidade total de linhas do Bloco K N - - O O
   */
  public void setR02_QTD_LIN_K(Integer r02_QTD_LIN_0) {
    this.r02_QTD_LIN_K = r02_QTD_LIN_0;
  }

}