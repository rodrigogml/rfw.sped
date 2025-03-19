package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO 9999: ENCERRAMENTO DO ARQUIVO DIGITAL.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContrib9999 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  public SPEDContrib9999(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * Quantidade total de linhas do arquivo digital. N - - S
   */
  @SPEDField(maxLength = 20, required = true)
  private Integer r02_QTD_LIN = null;

  @Override
  public String get01_Register() {
    return "9999";
  }

  /**
   * Recupera o quantidade total de linhas do arquivo digital. N - - S.
   *
   * @return the quantidade total de linhas do arquivo digital
   */
  public Integer getR02_QTD_LIN() {
    return r02_QTD_LIN;
  }

  /**
   * Define o quantidade total de linhas do arquivo digital. N - - S.
   *
   * @param r02_QTD_LIN the new quantidade total de linhas do arquivo digital
   */
  public void setR02_QTD_LIN(Integer r02_QTD_LIN) {
    this.r02_QTD_LIN = r02_QTD_LIN;
  }
}