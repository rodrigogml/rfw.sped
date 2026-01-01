package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO 9900: REGISTROS DO ARQUIVO.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContrib9900 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  public SPEDContrib9900(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 REG_BLC Registro que será totalizado no próximo campo. C 004 - O
   */
  @SPEDField(maxLength = 4, minLength = 4)
  private String r02_REG_BLC = null;

  /**
   * 03 QTD_REG_BLC Total de registros do tipo informado no campo anterior. N - - O
   */
  @SPEDField(maxLength = 255)
  private Integer r03_QTD_REG_BLC = null;

  @Override
  public String get01_Register() {
    return "9900";
  }

  /**
   * Recupera o 02 REG_BLC Registro que será totalizado no próximo campo. C 004 - O.
   *
   * @return the 02 REG_BLC Registro que será totalizado no próximo campo
   */
  public String getR02_REG_BLC() {
    return r02_REG_BLC;
  }

  /**
   * Define o 02 REG_BLC Registro que será totalizado no próximo campo. C 004 - O.
   *
   * @param r02_REG_BLC the new 02 REG_BLC Registro que será totalizado no próximo campo
   */
  public void setR02_REG_BLC(String r02_REG_BLC) {
    this.r02_REG_BLC = r02_REG_BLC;
  }

  /**
   * Recupera o 03 QTD_REG_BLC Total de registros do tipo informado no campo anterior. N - - O.
   *
   * @return the 03 QTD_REG_BLC Total de registros do tipo informado no campo anterior
   */
  public Integer getR03_QTD_REG_BLC() {
    return r03_QTD_REG_BLC;
  }

  /**
   * Define o 03 QTD_REG_BLC Total de registros do tipo informado no campo anterior. N - - O.
   *
   * @param r03_QTD_REG_BLC the new 03 QTD_REG_BLC Total de registros do tipo informado no campo anterior
   */
  public void setR03_QTD_REG_BLC(Integer r03_QTD_REG_BLC) {
    this.r03_QTD_REG_BLC = r03_QTD_REG_BLC;
  }

}