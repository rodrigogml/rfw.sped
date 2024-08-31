package br.eng.rodrigogml.rfw.sped.structure.contrib;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO M990: ENCERRAMENTO DO BLOCO M.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribM990 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * Quantidade total de linhas do Bloco M N - - S
   */
  @SPEDField(maxLength = 20, required = true)
  private Integer r02_QTD_LIN_M = null;

  @Override
  public String get01_Register() {
    return "M990";
  }

  /**
   * Recupera o quantidade total de linhas do Bloco M N - - S.
   *
   * @return the quantidade total de linhas do Bloco M N - - S
   */
  public Integer getR02_QTD_LIN_M() {
    return r02_QTD_LIN_M;
  }

  /**
   * Define o quantidade total de linhas do Bloco M N - - S.
   *
   * @param r02_QTD_LIN_M the new quantidade total de linhas do Bloco M N - - S
   */
  public void setR02_QTD_LIN_M(Integer r02_QTD_LIN_M) {
    this.r02_QTD_LIN_M = r02_QTD_LIN_M;
  }
}