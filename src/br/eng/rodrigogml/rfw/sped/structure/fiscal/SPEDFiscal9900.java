package br.eng.rodrigogml.rfw.sped.structure.fiscal;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO 9900: REGISTROS DO ARQUIVO.<br>
 *
 * @author Rodrigo Leit�o
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscal9900 extends SPEDRegister {

  /**
   * 02 REG_BLC Registro que ser� totalizado no pr�ximo campo. C 004 - O
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
   * Recupera o 02 REG_BLC Registro que ser� totalizado no pr�ximo campo. C 004 - O.
   *
   * @return the 02 REG_BLC Registro que ser� totalizado no pr�ximo campo
   */
  public String getR02_REG_BLC() {
    return r02_REG_BLC;
  }

  /**
   * Define o 02 REG_BLC Registro que ser� totalizado no pr�ximo campo. C 004 - O.
   *
   * @param r02_REG_BLC the new 02 REG_BLC Registro que ser� totalizado no pr�ximo campo
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