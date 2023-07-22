package br.eng.rodrigogml.rfw.sped.structure.fiscal;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO 0190: IDENTIFICAÇÃO DAS UNIDADES DE MEDIDA.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscal0190 extends SPEDRegister {

  /**
   * 02 UNID Código da unidade de medida C 006 - O
   */
  @SPEDField(maxLength = 6)
  private String r02_UNID = null;

  /**
   * 03 DESCR Descrição da unidade de medida C - - O
   */
  @SPEDField(maxLength = 5000)
  private String r03_DESCR = null;

  @Override
  public String get01_Register() {
    return "0190";
  }

  /**
   * Recupera o 02 UNID Código da unidade de medida C 006 - O.
   *
   * @return the 02 UNID Código da unidade de medida C 006 - O
   */
  public String getR02_UNID() {
    return r02_UNID;
  }

  /**
   * Define o 02 UNID Código da unidade de medida C 006 - O.
   *
   * @param r02_UNID the new 02 UNID Código da unidade de medida C 006 - O
   */
  public void setR02_UNID(String r02_UNID) {
    this.r02_UNID = r02_UNID;
  }

  /**
   * Recupera o 03 DESCR Descrição da unidade de medida C - - O.
   *
   * @return the 03 DESCR Descrição da unidade de medida C - - O
   */
  public String getR03_DESCR() {
    return r03_DESCR;
  }

  /**
   * Define o 03 DESCR Descrição da unidade de medida C - - O.
   *
   * @param r03_DESCR the new 03 DESCR Descrição da unidade de medida C - - O
   */
  public void setR03_DESCR(String r03_DESCR) {
    this.r03_DESCR = r03_DESCR;
  }

}