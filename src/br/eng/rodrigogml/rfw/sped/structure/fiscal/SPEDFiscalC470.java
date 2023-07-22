package br.eng.rodrigogml.rfw.sped.structure.fiscal;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO C470: ITENS DO DOCUMENTO FISCAL EMITIDO POR ECF (CÓDIGO 02 e 2D.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalC470 extends SPEDRegister {

  /**
   * 02 COD_ITEM Código do item (campo 02 do Registro 0200) C 060 - O
   */
  @SPEDField(maxLength = 60)
  private String r02_COD_ITEM = null;

  /**
   * 03 QTD Quantidade do item N - 03 O
   */
  @SPEDField(maxLength = 255, decimals = 3)
  private BigDecimal r03_QTD = null;

  /**
   * 04 QTD_CANC Quantidade cancelada, no caso de cancelamento parcial de item N - 03 OC
   */
  @SPEDField(maxLength = 255, decimals = 3, required = false)
  private BigDecimal r04_QTD_CANC = null;

  /**
   * 05 UNID Unidade do item (Campo 02 do registro 0190) C 006 - O
   */
  @SPEDField(maxLength = 6)
  private String r05_UNID = null;

  /**
   * 06 VL_ITEM Valor total do item N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r06_VL_ITEM = null;

  /**
   * 07 CST_ICMS Código da Situação Tributária, conforme a Tabela indicada no item 4.3.1. N 003* - O
   */
  @SPEDField(maxLength = 3, minLength = 3)
  private String r07_CST_ICMS = null;

  /**
   * 08 CFOP Código Fiscal de Operação e Prestação N 004* - O
   */
  @SPEDField(maxLength = 4, minLength = 4)
  private String r08_CFOP = null;

  /**
   * 09 ALIQ_ICMS Alíquota do ICMS – Carga tributária efetiva em percentual N 006 02 OC
   */
  @SPEDField(maxLength = 6, decimals = 2, required = false)
  private BigDecimal r09_ALIQ_ICMS = null;

  /**
   * 10 VL_PIS Valor do PIS N - 02 OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r10_VL_PIS = null;

  /**
   * 11 VL_COFINS Valor da COFINS N - 02 OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r11_VL_COFINS = null;

  @Override
  public String get01_Register() {
    return "C470";
  }

  /**
   * Recupera o 02 COD_ITEM Código do item (campo 02 do Registro 0200) C 060 - O.
   *
   * @return the 02 COD_ITEM Código do item (campo 02 do Registro 0200) C 060 - O
   */
  public String getR02_COD_ITEM() {
    return r02_COD_ITEM;
  }

  /**
   * Define o 02 COD_ITEM Código do item (campo 02 do Registro 0200) C 060 - O.
   *
   * @param r02_COD_ITEM the new 02 COD_ITEM Código do item (campo 02 do Registro 0200) C 060 - O
   */
  public void setR02_COD_ITEM(String r02_COD_ITEM) {
    this.r02_COD_ITEM = r02_COD_ITEM;
  }

  /**
   * Recupera o 03 QTD Quantidade do item N - 03 O.
   *
   * @return the 03 QTD Quantidade do item N - 03 O
   */
  public BigDecimal getR03_QTD() {
    return r03_QTD;
  }

  /**
   * Define o 03 QTD Quantidade do item N - 03 O.
   *
   * @param r03_QTD the new 03 QTD Quantidade do item N - 03 O
   */
  public void setR03_QTD(BigDecimal r03_QTD) {
    this.r03_QTD = r03_QTD;
  }

  /**
   * Recupera o 04 QTD_CANC Quantidade cancelada, no caso de cancelamento parcial de item N - 03 OC.
   *
   * @return the 04 QTD_CANC Quantidade cancelada, no caso de cancelamento parcial de item N - 03 OC
   */
  public BigDecimal getR04_QTD_CANC() {
    return r04_QTD_CANC;
  }

  /**
   * Define o 04 QTD_CANC Quantidade cancelada, no caso de cancelamento parcial de item N - 03 OC.
   *
   * @param r04_QTD_CANC the new 04 QTD_CANC Quantidade cancelada, no caso de cancelamento parcial de item N - 03 OC
   */
  public void setR04_QTD_CANC(BigDecimal r04_QTD_CANC) {
    this.r04_QTD_CANC = r04_QTD_CANC;
  }

  /**
   * Recupera o 05 UNID Unidade do item (Campo 02 do registro 0190) C 006 - O.
   *
   * @return the 05 UNID Unidade do item (Campo 02 do registro 0190) C 006 - O
   */
  public String getR05_UNID() {
    return r05_UNID;
  }

  /**
   * Define o 05 UNID Unidade do item (Campo 02 do registro 0190) C 006 - O.
   *
   * @param r05_UNID the new 05 UNID Unidade do item (Campo 02 do registro 0190) C 006 - O
   */
  public void setR05_UNID(String r05_UNID) {
    this.r05_UNID = r05_UNID;
  }

  /**
   * Recupera o 06 VL_ITEM Valor total do item N - 02 O.
   *
   * @return the 06 VL_ITEM Valor total do item N - 02 O
   */
  public BigDecimal getR06_VL_ITEM() {
    return r06_VL_ITEM;
  }

  /**
   * Define o 06 VL_ITEM Valor total do item N - 02 O.
   *
   * @param r06_VL_ITEM the new 06 VL_ITEM Valor total do item N - 02 O
   */
  public void setR06_VL_ITEM(BigDecimal r06_VL_ITEM) {
    this.r06_VL_ITEM = r06_VL_ITEM;
  }

  /**
   * Recupera o 07 CST_ICMS Código da Situação Tributária, conforme a Tabela indicada no item 4.3.1. N 003* - O.
   *
   * @return the 07 CST_ICMS Código da Situação Tributária, conforme a Tabela indicada no item 4
   */
  public String getR07_CST_ICMS() {
    return r07_CST_ICMS;
  }

  /**
   * Define o 07 CST_ICMS Código da Situação Tributária, conforme a Tabela indicada no item 4.3.1. N 003* - O.
   *
   * @param r07_CST_ICMS the new 07 CST_ICMS Código da Situação Tributária, conforme a Tabela indicada no item 4
   */
  public void setR07_CST_ICMS(String r07_CST_ICMS) {
    this.r07_CST_ICMS = r07_CST_ICMS;
  }

  /**
   * Recupera o 08 CFOP Código Fiscal de Operação e Prestação N 004* - O.
   *
   * @return the 08 CFOP Código Fiscal de Operação e Prestação N 004* - O
   */
  public String getR08_CFOP() {
    return r08_CFOP;
  }

  /**
   * Define o 08 CFOP Código Fiscal de Operação e Prestação N 004* - O.
   *
   * @param r08_CFOP the new 08 CFOP Código Fiscal de Operação e Prestação N 004* - O
   */
  public void setR08_CFOP(String r08_CFOP) {
    this.r08_CFOP = r08_CFOP;
  }

  /**
   * Recupera o 09 ALIQ_ICMS Alíquota do ICMS – Carga tributária efetiva em percentual N 006 02 OC.
   *
   * @return the 09 ALIQ_ICMS Alíquota do ICMS – Carga tributária efetiva em percentual N 006 02 OC
   */
  public BigDecimal getR09_ALIQ_ICMS() {
    return r09_ALIQ_ICMS;
  }

  /**
   * Define o 09 ALIQ_ICMS Alíquota do ICMS – Carga tributária efetiva em percentual N 006 02 OC.
   *
   * @param r09_ALIQ_ICMS the new 09 ALIQ_ICMS Alíquota do ICMS – Carga tributária efetiva em percentual N 006 02 OC
   */
  public void setR09_ALIQ_ICMS(BigDecimal r09_ALIQ_ICMS) {
    this.r09_ALIQ_ICMS = r09_ALIQ_ICMS;
  }

  /**
   * Recupera o 10 VL_PIS Valor do PIS N - 02 OC.
   *
   * @return the 10 VL_PIS Valor do PIS N - 02 OC
   */
  public BigDecimal getR10_VL_PIS() {
    return r10_VL_PIS;
  }

  /**
   * Define o 10 VL_PIS Valor do PIS N - 02 OC.
   *
   * @param r10_VL_PIS the new 10 VL_PIS Valor do PIS N - 02 OC
   */
  public void setR10_VL_PIS(BigDecimal r10_VL_PIS) {
    this.r10_VL_PIS = r10_VL_PIS;
  }

  /**
   * Recupera o 11 VL_COFINS Valor da COFINS N - 02 OC.
   *
   * @return the 11 VL_COFINS Valor da COFINS N - 02 OC
   */
  public BigDecimal getR11_VL_COFINS() {
    return r11_VL_COFINS;
  }

  /**
   * Define o 11 VL_COFINS Valor da COFINS N - 02 OC.
   *
   * @param r11_VL_COFINS the new 11 VL_COFINS Valor da COFINS N - 02 OC
   */
  public void setR11_VL_COFINS(BigDecimal r11_VL_COFINS) {
    this.r11_VL_COFINS = r11_VL_COFINS;
  }

}