package br.eng.rodrigogml.rfw.sped.structure.contrib;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO 0400: TABELA DE NATUREZA DA OPERA��O/PRESTA��O.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContrib0400 extends SPEDRegister {

  /**
   * C�digo da natureza da opera��o/presta��o C 010 - S
   */
  @SPEDField(maxLength = 10, required = true)
  private String r02_COD_NAT = null;

  /**
   * Descri��o da natureza da opera��o/presta��o C - - S
   */
  @SPEDField(maxLength = 100, required = true)
  private String r03_DESCR_NAT = null;

  @Override
  public String get01_Register() {
    return "0400";
  }

  /**
   * Recupera o c�digo da natureza da opera��o/presta��o C 010 - S.
   *
   * @return the c�digo da natureza da opera��o/presta��o C 010 - S
   */
  public String getR02_COD_NAT() {
    return r02_COD_NAT;
  }

  /**
   * Define o c�digo da natureza da opera��o/presta��o C 010 - S.
   *
   * @param r02_COD_NAT the new c�digo da natureza da opera��o/presta��o C 010 - S
   */
  public void setR02_COD_NAT(String r02_COD_NAT) {
    this.r02_COD_NAT = r02_COD_NAT;
  }

  /**
   * Recupera o descri��o da natureza da opera��o/presta��o C - - S.
   *
   * @return the descri��o da natureza da opera��o/presta��o C - - S
   */
  public String getR03_DESCR_NAT() {
    return r03_DESCR_NAT;
  }

  /**
   * Define o descri��o da natureza da opera��o/presta��o C - - S.
   *
   * @param r03_DESCR_NAT the new descri��o da natureza da opera��o/presta��o C - - S
   */
  public void setR03_DESCR_NAT(String r03_DESCR_NAT) {
    this.r03_DESCR_NAT = r03_DESCR_NAT;
  }
}