package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO D990: ENCERRAMENTO DO BLOCO D.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribD990 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * Quantidade total de linhas do Bloco D N - - S
   */
  @SPEDField(maxLength = 20, required = true)
  private Integer r02_QTD_LIN_D = null;

  @Override
  public String get01_Register() {
    return "D990";
  }

  /**
   * Recupera o quantidade total de linhas do Bloco D N - - S.
   *
   * @return the quantidade total de linhas do Bloco D N - - S
   */
  public Integer getR02_QTD_LIN_D() {
    return r02_QTD_LIN_D;
  }

  /**
   * Define o quantidade total de linhas do Bloco D N - - S.
   *
   * @param r02_QTD_LIN_D the new quantidade total de linhas do Bloco D N - - S
   */
  public void setR02_QTD_LIN_D(Integer r02_QTD_LIN_D) {
    this.r02_QTD_LIN_D = r02_QTD_LIN_D;
  }
}