package br.eng.rodrigogml.rfw.sped.structure.fiscal;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO D990: ENCERRAMENTO DO BLOCO D.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalD990 extends SPEDRegister {

  /**
   * 02 QTD_LIN_D Quantidade total de linhas do Bloco D N - - O O
   */
  @SPEDField(maxLength = 255)
  private Integer r02_QTD_LIN_D = null;

  @Override
  public String get01_Register() {
    return "D990";
  }

  /**
   * Recupera o 02 QTD_LIN_D Quantidade total de linhas do Bloco D N - - O O.
   *
   * @return the 02 QTD_LIN_D Quantidade total de linhas do Bloco D N - - O O
   */
  public Integer getR02_QTD_LIN_D() {
    return r02_QTD_LIN_D;
  }

  /**
   * Define o 02 QTD_LIN_D Quantidade total de linhas do Bloco D N - - O O.
   *
   * @param r02_QTD_LIN_0 the new 02 QTD_LIN_D Quantidade total de linhas do Bloco D N - - O O
   */
  public void setR02_QTD_LIN_D(Integer r02_QTD_LIN_0) {
    this.r02_QTD_LIN_D = r02_QTD_LIN_0;
  }

}