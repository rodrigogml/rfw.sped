package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C175: REGISTRO ANALÍTICO DO DOCUMENTO (CÓDIGO 65).<br>
 *
 * Registro filho de C100, utilizado para a escrituração analítica das receitas de NFC-e (modelo 65) segmentado por CFOP, CST e alíquotas de PIS/Pasep e COFINS.
 *
 * @author Rodrigo Leitão
 * @since 2026-01-01
 */
public class SPEDContribC175 extends SPEDRegister {

  private static final long serialVersionUID = 1L;

  public SPEDContribC175(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * Código fiscal de operação e prestação
   */
  @SPEDField(maxLength = 4, minLength = 4, required = true)
  private String r02_CFOP = null;

  /**
   * Valor da operação na combinação de CFOP, CST e alíquotas
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r03_VL_OPR = null;

  /**
   * Valor do desconto comercial / exclusão da base de cálculo
   */
  @SPEDField(maxLength = 20, decimals = 2, required = false)
  private BigDecimal r04_VL_DESC = null;

  /**
   * CST PIS
   */
  @SPEDField(maxLength = 2, minLength = 2, required = false)
  private String r05_CST_PIS = null;

  /**
   * Base de cálculo do PIS (em valor)
   */
  @SPEDField(maxLength = 20, decimals = 2, required = false)
  private BigDecimal r06_VL_BC_PIS = null;

  /**
   * Alíquota do PIS (percentual)
   */
  @SPEDField(maxLength = 8, decimals = 4, required = false)
  private BigDecimal r07_ALIQ_PIS = null;

  /**
   * Base de cálculo do PIS (em quantidade)
   */
  @SPEDField(maxLength = 20, decimals = 3, required = false)
  private BigDecimal r08_QUANT_BC_PIS = null;

  /**
   * Alíquota do PIS (em reais)
   */
  @SPEDField(maxLength = 20, decimals = 4, required = false)
  private BigDecimal r09_ALIQ_PIS_QUANT = null;

  /**
   * Valor do PIS
   */
  @SPEDField(maxLength = 20, decimals = 2, required = false)
  private BigDecimal r10_VL_PIS = null;

  /**
   * CST COFINS
   */
  @SPEDField(maxLength = 2, minLength = 2, required = true)
  private String r11_CST_COFINS = null;

  /**
   * Base de cálculo da COFINS (em valor)
   */
  @SPEDField(maxLength = 20, decimals = 2, required = false)
  private BigDecimal r12_VL_BC_COFINS = null;

  /**
   * Alíquota da COFINS (percentual)
   */
  @SPEDField(maxLength = 8, decimals = 4, required = false)
  private BigDecimal r13_ALIQ_COFINS = null;

  /**
   * Base de cálculo da COFINS (em quantidade)
   */
  @SPEDField(maxLength = 20, decimals = 3, required = false)
  private BigDecimal r14_QUANT_BC_COFINS = null;

  /**
   * Alíquota da COFINS (em reais)
   */
  @SPEDField(maxLength = 20, decimals = 4, required = false)
  private BigDecimal r15_ALIQ_COFINS_QUANT = null;

  /**
   * Valor da COFINS
   */
  @SPEDField(maxLength = 20, decimals = 2, required = false)
  private BigDecimal r16_VL_COFINS = null;

  /**
   * Código da conta analítica contábil
   */
  @SPEDField(maxLength = 255, required = false)
  private String r17_COD_CTA = null;

  /**
   * Informação complementar
   */
  @SPEDField(maxLength = 255, required = false)
  private String r18_INFO_COMPL = null;

  @Override
  public String get01_Register() {
    return "C175";
  }

  public String getR02_CFOP() {
    return r02_CFOP;
  }

  public void setR02_CFOP(String r02_CFOP) {
    this.r02_CFOP = r02_CFOP;
  }

  public BigDecimal getR03_VL_OPR() {
    return r03_VL_OPR;
  }

  public void setR03_VL_OPR(BigDecimal r03_VL_OPR) {
    this.r03_VL_OPR = r03_VL_OPR;
  }

  public BigDecimal getR04_VL_DESC() {
    return r04_VL_DESC;
  }

  public void setR04_VL_DESC(BigDecimal r04_VL_DESC) {
    this.r04_VL_DESC = r04_VL_DESC;
  }

  public String getR05_CST_PIS() {
    return r05_CST_PIS;
  }

  public void setR05_CST_PIS(String r05_CST_PIS) {
    this.r05_CST_PIS = r05_CST_PIS;
  }

  public BigDecimal getR06_VL_BC_PIS() {
    return r06_VL_BC_PIS;
  }

  public void setR06_VL_BC_PIS(BigDecimal r06_VL_BC_PIS) {
    this.r06_VL_BC_PIS = r06_VL_BC_PIS;
  }

  public BigDecimal getR07_ALIQ_PIS() {
    return r07_ALIQ_PIS;
  }

  public void setR07_ALIQ_PIS(BigDecimal r07_ALIQ_PIS) {
    this.r07_ALIQ_PIS = r07_ALIQ_PIS;
  }

  public BigDecimal getR08_QUANT_BC_PIS() {
    return r08_QUANT_BC_PIS;
  }

  public void setR08_QUANT_BC_PIS(BigDecimal r08_QUANT_BC_PIS) {
    this.r08_QUANT_BC_PIS = r08_QUANT_BC_PIS;
  }

  public BigDecimal getR09_ALIQ_PIS_QUANT() {
    return r09_ALIQ_PIS_QUANT;
  }

  public void setR09_ALIQ_PIS_QUANT(BigDecimal r09_ALIQ_PIS_QUANT) {
    this.r09_ALIQ_PIS_QUANT = r09_ALIQ_PIS_QUANT;
  }

  public BigDecimal getR10_VL_PIS() {
    return r10_VL_PIS;
  }

  public void setR10_VL_PIS(BigDecimal r10_VL_PIS) {
    this.r10_VL_PIS = r10_VL_PIS;
  }

  public String getR11_CST_COFINS() {
    return r11_CST_COFINS;
  }

  public void setR11_CST_COFINS(String r11_CST_COFINS) {
    this.r11_CST_COFINS = r11_CST_COFINS;
  }

  public BigDecimal getR12_VL_BC_COFINS() {
    return r12_VL_BC_COFINS;
  }

  public void setR12_VL_BC_COFINS(BigDecimal r12_VL_BC_COFINS) {
    this.r12_VL_BC_COFINS = r12_VL_BC_COFINS;
  }

  public BigDecimal getR13_ALIQ_COFINS() {
    return r13_ALIQ_COFINS;
  }

  public void setR13_ALIQ_COFINS(BigDecimal r13_ALIQ_COFINS) {
    this.r13_ALIQ_COFINS = r13_ALIQ_COFINS;
  }

  public BigDecimal getR14_QUANT_BC_COFINS() {
    return r14_QUANT_BC_COFINS;
  }

  public void setR14_QUANT_BC_COFINS(BigDecimal r14_QUANT_BC_COFINS) {
    this.r14_QUANT_BC_COFINS = r14_QUANT_BC_COFINS;
  }

  public BigDecimal getR15_ALIQ_COFINS_QUANT() {
    return r15_ALIQ_COFINS_QUANT;
  }

  public void setR15_ALIQ_COFINS_QUANT(BigDecimal r15_ALIQ_COFINS_QUANT) {
    this.r15_ALIQ_COFINS_QUANT = r15_ALIQ_COFINS_QUANT;
  }

  public BigDecimal getR16_VL_COFINS() {
    return r16_VL_COFINS;
  }

  public void setR16_VL_COFINS(BigDecimal r16_VL_COFINS) {
    this.r16_VL_COFINS = r16_VL_COFINS;
  }

  public String getR17_COD_CTA() {
    return r17_COD_CTA;
  }

  public void setR17_COD_CTA(String r17_COD_CTA) {
    this.r17_COD_CTA = r17_COD_CTA;
  }

  public String getR18_INFO_COMPL() {
    return r18_INFO_COMPL;
  }

  public void setR18_INFO_COMPL(String r18_INFO_COMPL) {
    this.r18_INFO_COMPL = r18_INFO_COMPL;
  }
}
