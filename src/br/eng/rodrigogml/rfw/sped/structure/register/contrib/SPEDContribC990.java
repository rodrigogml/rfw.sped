package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C990: ENCERRAMENTO DO BLOCO C.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribC990 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * Quantidade total de linhas do Bloco C N - - S
   */
  @SPEDField(maxLength = 20, required = true)
  private Integer r02_QTD_LIN_C = null;

  @Override
  public String get01_Register() {
    return "C990";
  }

  /**
   * Recupera o quantidade total de linhas do Bloco C N - - S.
   *
   * @return the quantidade total de linhas do Bloco C N - - S
   */
  public Integer getR02_QTD_LIN_C() {
    return r02_QTD_LIN_C;
  }

  /**
   * Define o quantidade total de linhas do Bloco C N - - S.
   *
   * @param r02_QTD_LIN_C the new quantidade total de linhas do Bloco C N - - S
   */
  public void setR02_QTD_LIN_C(Integer r02_QTD_LIN_C) {
    this.r02_QTD_LIN_C = r02_QTD_LIN_C;
  }
}