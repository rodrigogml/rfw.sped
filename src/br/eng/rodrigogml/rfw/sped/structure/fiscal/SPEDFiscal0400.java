package br.eng.rodrigogml.rfw.sped.structure.fiscal;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO 0400: TABELA DE NATUREZA DA OPERAÇÃO/PRESTAÇÃO.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscal0400 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  /**
   * 02 COD_NAT Código da natureza da operação/prestação C 010 - O
   */
  @SPEDField(maxLength = 10)
  private String r02_COD_NAT = null;

  /**
   * 03 DESCR_NAT Descrição da natureza da operação/prestação C - - O
   */
  @SPEDField(maxLength = 5000)
  private String r03_DESCR_NAT = null;

  @Override
  public String get01_Register() {
    return "0400";
  }

  /**
   * Recupera o 02 COD_NAT Código da natureza da operação/prestação C 010 - O.
   *
   * @return the 02 COD_NAT Código da natureza da operação/prestação C 010 - O
   */
  public String getR02_COD_NAT() {
    return r02_COD_NAT;
  }

  /**
   * Define o 02 COD_NAT Código da natureza da operação/prestação C 010 - O.
   *
   * @param r02_COD_NAT the new 02 COD_NAT Código da natureza da operação/prestação C 010 - O
   */
  public void setR02_COD_NAT(String r02_COD_NAT) {
    this.r02_COD_NAT = r02_COD_NAT;
  }

  /**
   * Recupera o 03 DESCR_NAT Descrição da natureza da operação/prestação C - - O.
   *
   * @return the 03 DESCR_NAT Descrição da natureza da operação/prestação C - - O
   */
  public String getR03_DESCR_NAT() {
    return r03_DESCR_NAT;
  }

  /**
   * Define o 03 DESCR_NAT Descrição da natureza da operação/prestação C - - O.
   *
   * @param r03_DESCR_NAT the new 03 DESCR_NAT Descrição da natureza da operação/prestação C - - O
   */
  public void setR03_DESCR_NAT(String r03_DESCR_NAT) {
    this.r03_DESCR_NAT = r03_DESCR_NAT;
  }
}