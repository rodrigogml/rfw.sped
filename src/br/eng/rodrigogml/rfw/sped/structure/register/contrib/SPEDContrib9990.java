package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO 9990: ENCERRAMENTO DO BLOCO 9.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContrib9990 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * Quantidade total de linhas do Bloco 9 N - - S
   */
  @SPEDField(maxLength = 20, required = true)
  private Integer r02_QTD_LIN_9 = null;

  @Override
  public String get01_Register() {
    return "9990";
  }

  /**
   * Recupera o quantidade total de linhas do Bloco 9 N - - S.
   *
   * @return the quantidade total de linhas do Bloco 9 N - - S
   */
  public Integer getR02_QTD_LIN_9() {
    return r02_QTD_LIN_9;
  }

  /**
   * Define o quantidade total de linhas do Bloco 9 N - - S.
   *
   * @param r02_QTD_LIN_9 the new quantidade total de linhas do Bloco 9 N - - S
   */
  public void setR02_QTD_LIN_9(Integer r02_QTD_LIN_9) {
    this.r02_QTD_LIN_9 = r02_QTD_LIN_9;
  }
}