package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO 0190: IDENTIFICAÇÃO DAS UNIDADES DE MEDIDA.<br>
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
   * Código da unidade de medida C 006 - S
   */
  @SPEDField(maxLength = 6, required = true)
  private String r02_UNID = null;

  /**
   * Descrição da unidade de medida C - - S
   */
  @SPEDField(maxLength = 100, required = true)
  private String r03_DESCR = null;

  @Override
  public String get01_Register() {
    return "0190";
  }

  /**
   * Recupera o código da unidade de medida C 006 - S.
   *
   * @return the código da unidade de medida C 006 - S
   */
  public String getR02_UNID() {
    return r02_UNID;
  }

  /**
   * Define o código da unidade de medida C 006 - S.
   *
   * @param r02_UNID the new código da unidade de medida C 006 - S
   */
  public void setR02_UNID(String r02_UNID) {
    this.r02_UNID = r02_UNID;
  }

  /**
   * Recupera o descrição da unidade de medida C - - S.
   *
   * @return the descrição da unidade de medida C - - S
   */
  public String getR03_DESCR() {
    return r03_DESCR;
  }

  /**
   * Define o descrição da unidade de medida C - - S.
   *
   * @param r03_DESCR the new descrição da unidade de medida C - - S
   */
  public void setR03_DESCR(String r03_DESCR) {
    this.r03_DESCR = r03_DESCR;
  }

}