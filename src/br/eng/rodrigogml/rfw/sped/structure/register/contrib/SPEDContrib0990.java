package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO 0990: ENCERRAMENTO DO BLOCO 0.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContrib0990 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  public SPEDContrib0990(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * Quantidade total de linhas do Bloco 0 N - - S
   */
  @SPEDField(maxLength = 10, required = true)
  private Integer r02_QTD_LIN_0 = null;

  @Override
  public String get01_Register() {
    return "0990";
  }

  /**
   * Recupera o quantidade total de linhas do Bloco 0 N - - S.
   *
   * @return the quantidade total de linhas do Bloco 0 N - - S
   */
  public Integer getR02_QTD_LIN_0() {
    return r02_QTD_LIN_0;
  }

  /**
   * Define o quantidade total de linhas do Bloco 0 N - - S.
   *
   * @param r02_QTD_LIN_0 the new quantidade total de linhas do Bloco 0 N - - S
   */
  public void setR02_QTD_LIN_0(Integer r02_QTD_LIN_0) {
    this.r02_QTD_LIN_0 = r02_QTD_LIN_0;
  }
}