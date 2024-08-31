package br.eng.rodrigogml.rfw.sped.structure.contrib;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO I990: ENCERRAMENTO DO BLOCO I.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribI990 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * Quantidade total de linhas do Bloco I N - - S
   */
  @SPEDField(maxLength = 20, required = true)
  private Integer r02_QTD_LIN_I = null;

  @Override
  public String get01_Register() {
    return "I990";
  }

  /**
   * Recupera o quantidade total de linhas do Bloco I N - - S.
   *
   * @return the quantidade total de linhas do Bloco I N - - S
   */
  public Integer getR02_QTD_LIN_I() {
    return r02_QTD_LIN_I;
  }

  /**
   * Define o quantidade total de linhas do Bloco I N - - S.
   *
   * @param r02_QTD_LIN_I the new quantidade total de linhas do Bloco I N - - S
   */
  public void setR02_QTD_LIN_I(Integer r02_QTD_LIN_I) {
    this.r02_QTD_LIN_I = r02_QTD_LIN_I;
  }
}