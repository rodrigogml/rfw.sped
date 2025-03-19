package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO 0190: IDENTIFICA��O DAS UNIDADES DE MEDIDA.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContrib0190 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  public SPEDContrib0190(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * C�digo da unidade de medida C 006 - S
   */
  @SPEDField(maxLength = 6, required = true)
  private String r02_UNID = null;

  /**
   * Descri��o da unidade de medida C - - S
   */
  @SPEDField(maxLength = 100, required = true)
  private String r03_DESCR = null;

  @Override
  public String get01_Register() {
    return "0190";
  }

  /**
   * Recupera o c�digo da unidade de medida C 006 - S.
   *
   * @return the c�digo da unidade de medida C 006 - S
   */
  public String getR02_UNID() {
    return r02_UNID;
  }

  /**
   * Define o c�digo da unidade de medida C 006 - S.
   *
   * @param r02_UNID the new c�digo da unidade de medida C 006 - S
   */
  public void setR02_UNID(String r02_UNID) {
    this.r02_UNID = r02_UNID;
  }

  /**
   * Recupera o descri��o da unidade de medida C - - S.
   *
   * @return the descri��o da unidade de medida C - - S
   */
  public String getR03_DESCR() {
    return r03_DESCR;
  }

  /**
   * Define o descri��o da unidade de medida C - - S.
   *
   * @param r03_DESCR the new descri��o da unidade de medida C - - S
   */
  public void setR03_DESCR(String r03_DESCR) {
    this.r03_DESCR = r03_DESCR;
  }

}