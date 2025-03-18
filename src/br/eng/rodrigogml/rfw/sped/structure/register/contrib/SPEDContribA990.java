package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO A990: ENCERRAMENTO DO BLOCO A.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribA990 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * Quantidade total de linhas do Bloco A N - - S
   */
  @SPEDField(maxLength = 20, required = true)
  private Integer r02_QTD_LIN_A = null;

  @Override
  public String get01_Register() {
    return "A990";
  }

  /**
   * Recupera o quantidade total de linhas do Bloco A N - - S.
   *
   * @return the quantidade total de linhas do Bloco A N - - S
   */
  public Integer getR02_QTD_LIN_A() {
    return r02_QTD_LIN_A;
  }

  /**
   * Define o quantidade total de linhas do Bloco A N - - S.
   *
   * @param r02_QTD_LIN_A the new quantidade total de linhas do Bloco A N - - S
   */
  public void setR02_QTD_LIN_A(Integer r02_QTD_LIN_A) {
    this.r02_QTD_LIN_A = r02_QTD_LIN_A;
  }
}