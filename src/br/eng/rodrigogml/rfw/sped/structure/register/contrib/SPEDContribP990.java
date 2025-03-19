package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO P990: ENCERRAMENTO DO BLOCO P.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribP990 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  public SPEDContribP990(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * Quantidade total de linhas do Bloco P N - - S
   */
  @SPEDField(maxLength = 20, required = true)
  private Integer r02_QTD_LIN_P = null;

  @Override
  public String get01_Register() {
    return "P990";
  }

  /**
   * Recupera o quantidade total de linhas do Bloco P N - - S.
   *
   * @return the quantidade total de linhas do Bloco P N - - S
   */
  public Integer getR02_QTD_LIN_P() {
    return r02_QTD_LIN_P;
  }

  /**
   * Define o quantidade total de linhas do Bloco P N - - S.
   *
   * @param r02_QTD_LIN_P the new quantidade total de linhas do Bloco P N - - S
   */
  public void setR02_QTD_LIN_P(Integer r02_QTD_LIN_P) {
    this.r02_QTD_LIN_P = r02_QTD_LIN_P;
  }
}