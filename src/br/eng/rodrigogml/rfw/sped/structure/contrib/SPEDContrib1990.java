package br.eng.rodrigogml.rfw.sped.structure.contrib;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO 1990: ENCERRAMENTO DO BLOCO 1.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContrib1990 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * Quantidade total de linhas do Bloco 1 N - - S
   */
  @SPEDField(maxLength = 20, required = true)
  private Integer r02_QTD_LIN_1 = null;

  @Override
  public String get01_Register() {
    return "1990";
  }

  /**
   * Recupera o quantidade total de linhas do Bloco 1 N - - S.
   *
   * @return the quantidade total de linhas do Bloco 1 N - - S
   */
  public Integer getR02_QTD_LIN_1() {
    return r02_QTD_LIN_1;
  }

  /**
   * Define o quantidade total de linhas do Bloco 1 N - - S.
   *
   * @param r02_QTD_LIN_1 the new quantidade total de linhas do Bloco 1 N - - S
   */
  public void setR02_QTD_LIN_1(Integer r02_QTD_LIN_1) {
    this.r02_QTD_LIN_1 = r02_QTD_LIN_1;
  }
}