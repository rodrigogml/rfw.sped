package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO F990: ENCERRAMENTO DO BLOCO F.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribF990 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  public SPEDContribF990(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * Quantidade total de linhas do Bloco F N - - S
   */
  @SPEDField(maxLength = 20, required = true)
  private Integer r02_QTD_LIN_F = null;

  @Override
  public String get01_Register() {
    return "F990";
  }

  /**
   * Recupera o quantidade total de linhas do Bloco F N - - S.
   *
   * @return the quantidade total de linhas do Bloco F N - - S
   */
  public Integer getR02_QTD_LIN_F() {
    return r02_QTD_LIN_F;
  }

  /**
   * Define o quantidade total de linhas do Bloco F N - - S.
   *
   * @param r02_QTD_LIN_F the new quantidade total de linhas do Bloco F N - - S
   */
  public void setR02_QTD_LIN_F(Integer r02_QTD_LIN_F) {
    this.r02_QTD_LIN_F = r02_QTD_LIN_F;
  }
}