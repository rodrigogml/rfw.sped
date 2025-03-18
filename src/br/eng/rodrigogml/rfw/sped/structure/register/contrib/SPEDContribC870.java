package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C870: RESUMO DI�RIO DE DOCUMENTOS EMITIDOS POR EQUIPAMENTO SAT-CF-E (C�DIGO 59) � PIS/PASEP E COFINS.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribC870 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * C�digo do item (campo 02 do Registro 0200) C 060 - N
   */
  @SPEDField(maxLength = 60, required = false)
  private String r02_COD_ITEM = null;

  /**
   * C�digo fiscal de opera��o e presta��o N 004* - S
   */
  @SPEDField(maxLength = 4, minLength = 4, required = true)
  private String r03_CFOP = null;

  /**
   * Valor total dos itens N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r04_VL_ITEM = null;

  /**
   * Valor da exclus�o/desconto comercial dos itens N - 02 N
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r05_VL_DESC = null;

  /**
   * C�digo da Situa��o Tribut�ria referente ao PIS/PASEP N 002* - S
   */
  @SPEDField(maxLength = 2, minLength = 2, required = true)
  private String r06_CST_PIS = null;

  /**
   * Valor da base de c�lculo do PIS/PASEP N 02 N
   */
  @SPEDField(maxLength = 20, decimals = 2, required = false)
  private BigDecimal r07_VL_BC_PIS = null;

  /**
   * Al�quota do PIS/PASEP (em percentual) N 008 04 N
   */
  @SPEDField(maxLength = 8, decimals = 4, required = false)
  private BigDecimal r08_ALIQ_PIS = null;

  /**
   * Valor do PIS/PASEP N - 02 N
   */
  @SPEDField(maxLength = 20, decimals = 2, required = false)
  private BigDecimal r09_VL_PIS = null;

  /**
   * C�digo da Situa��o Tribut�ria referente a COFINS N 002* - S
   */
  @SPEDField(maxLength = 2, minLength = 2, required = true)
  private String r10_CST_COFINS = null;

  /**
   * Valor da base de c�lculo da COFINS N 02 N
   */
  @SPEDField(maxLength = 20, decimals = 2, required = false)
  private BigDecimal r11_VL_BC_COFINS = null;

  /**
   * Al�quota da COFINS (em percentual) N 008 04 N
   */
  @SPEDField(maxLength = 8, decimals = 4, required = false)
  private BigDecimal r12_ALIQ_COFINS = null;

  /**
   * Valor da COFINS N - 02 N
   */
  @SPEDField(maxLength = 20, decimals = 2, required = false)
  private BigDecimal r13_VL_COFINS = null;

  /**
   * C�digo da conta anal�tica cont�bil debitada/creditada C 060 - N
   */
  @SPEDField(maxLength = 60, required = false)
  private String r14_COD_CTA = null;

  @Override
  public String get01_Register() {
    return "C870";
  }

  /**
   * Recupera o c�digo do item (campo 02 do Registro 0200) C 060 - N.
   *
   * @return the c�digo do item (campo 02 do Registro 0200) C 060 - N
   */
  public String getR02_COD_ITEM() {
    return r02_COD_ITEM;
  }

  /**
   * Define o c�digo do item (campo 02 do Registro 0200) C 060 - N.
   *
   * @param r02_COD_ITEM the new c�digo do item (campo 02 do Registro 0200) C 060 - N
   */
  public void setR02_COD_ITEM(String r02_COD_ITEM) {
    this.r02_COD_ITEM = r02_COD_ITEM;
  }

  /**
   * Recupera o c�digo fiscal de opera��o e presta��o N 004* - S.
   *
   * @return the c�digo fiscal de opera��o e presta��o N 004* - S
   */
  public String getR03_CFOP() {
    return r03_CFOP;
  }

  /**
   * Define o c�digo fiscal de opera��o e presta��o N 004* - S.
   *
   * @param r03_CFOP the new c�digo fiscal de opera��o e presta��o N 004* - S
   */
  public void setR03_CFOP(String r03_CFOP) {
    this.r03_CFOP = r03_CFOP;
  }

  /**
   * Recupera o valor total dos itens N - 02 S.
   *
   * @return the valor total dos itens N - 02 S
   */
  public BigDecimal getR04_VL_ITEM() {
    return r04_VL_ITEM;
  }

  /**
   * Define o valor total dos itens N - 02 S.
   *
   * @param r04_VL_ITEM the new valor total dos itens N - 02 S
   */
  public void setR04_VL_ITEM(BigDecimal r04_VL_ITEM) {
    this.r04_VL_ITEM = r04_VL_ITEM;
  }

  /**
   * Recupera o valor da exclus�o/desconto comercial dos itens N - 02 N.
   *
   * @return the valor da exclus�o/desconto comercial dos itens N - 02 N
   */
  public BigDecimal getR05_VL_DESC() {
    return r05_VL_DESC;
  }

  /**
   * Define o valor da exclus�o/desconto comercial dos itens N - 02 N.
   *
   * @param r05_VL_DESC the new valor da exclus�o/desconto comercial dos itens N - 02 N
   */
  public void setR05_VL_DESC(BigDecimal r05_VL_DESC) {
    this.r05_VL_DESC = r05_VL_DESC;
  }

  /**
   * Recupera o c�digo da Situa��o Tribut�ria referente ao PIS/PASEP N 002* - S.
   *
   * @return the c�digo da Situa��o Tribut�ria referente ao PIS/PASEP N 002* - S
   */
  public String getR06_CST_PIS() {
    return r06_CST_PIS;
  }

  /**
   * Define o c�digo da Situa��o Tribut�ria referente ao PIS/PASEP N 002* - S.
   *
   * @param r06_CST_PIS the new c�digo da Situa��o Tribut�ria referente ao PIS/PASEP N 002* - S
   */
  public void setR06_CST_PIS(String r06_CST_PIS) {
    this.r06_CST_PIS = r06_CST_PIS;
  }

  /**
   * Recupera o valor da base de c�lculo do PIS/PASEP N 02 N.
   *
   * @return the valor da base de c�lculo do PIS/PASEP N 02 N
   */
  public BigDecimal getR07_VL_BC_PIS() {
    return r07_VL_BC_PIS;
  }

  /**
   * Define o valor da base de c�lculo do PIS/PASEP N 02 N.
   *
   * @param r07_VL_BC_PIS the new valor da base de c�lculo do PIS/PASEP N 02 N
   */
  public void setR07_VL_BC_PIS(BigDecimal r07_VL_BC_PIS) {
    this.r07_VL_BC_PIS = r07_VL_BC_PIS;
  }

  /**
   * Recupera o al�quota do PIS/PASEP (em percentual) N 008 04 N.
   *
   * @return the al�quota do PIS/PASEP (em percentual) N 008 04 N
   */
  public BigDecimal getR08_ALIQ_PIS() {
    return r08_ALIQ_PIS;
  }

  /**
   * Define o al�quota do PIS/PASEP (em percentual) N 008 04 N.
   *
   * @param r08_ALIQ_PIS the new al�quota do PIS/PASEP (em percentual) N 008 04 N
   */
  public void setR08_ALIQ_PIS(BigDecimal r08_ALIQ_PIS) {
    this.r08_ALIQ_PIS = r08_ALIQ_PIS;
  }

  /**
   * Recupera o valor do PIS/PASEP N - 02 N.
   *
   * @return the valor do PIS/PASEP N - 02 N
   */
  public BigDecimal getR09_VL_PIS() {
    return r09_VL_PIS;
  }

  /**
   * Define o valor do PIS/PASEP N - 02 N.
   *
   * @param r09_VL_PIS the new valor do PIS/PASEP N - 02 N
   */
  public void setR09_VL_PIS(BigDecimal r09_VL_PIS) {
    this.r09_VL_PIS = r09_VL_PIS;
  }

  /**
   * Recupera o c�digo da Situa��o Tribut�ria referente a COFINS N 002* - S.
   *
   * @return the c�digo da Situa��o Tribut�ria referente a COFINS N 002* - S
   */
  public String getR10_CST_COFINS() {
    return r10_CST_COFINS;
  }

  /**
   * Define o c�digo da Situa��o Tribut�ria referente a COFINS N 002* - S.
   *
   * @param r10_CST_COFINS the new c�digo da Situa��o Tribut�ria referente a COFINS N 002* - S
   */
  public void setR10_CST_COFINS(String r10_CST_COFINS) {
    this.r10_CST_COFINS = r10_CST_COFINS;
  }

  /**
   * Recupera o valor da base de c�lculo da COFINS N 02 N.
   *
   * @return the valor da base de c�lculo da COFINS N 02 N
   */
  public BigDecimal getR11_VL_BC_COFINS() {
    return r11_VL_BC_COFINS;
  }

  /**
   * Define o valor da base de c�lculo da COFINS N 02 N.
   *
   * @param r11_VL_BC_COFINS the new valor da base de c�lculo da COFINS N 02 N
   */
  public void setR11_VL_BC_COFINS(BigDecimal r11_VL_BC_COFINS) {
    this.r11_VL_BC_COFINS = r11_VL_BC_COFINS;
  }

  /**
   * Recupera o al�quota da COFINS (em percentual) N 008 04 N.
   *
   * @return the al�quota da COFINS (em percentual) N 008 04 N
   */
  public BigDecimal getR12_ALIQ_COFINS() {
    return r12_ALIQ_COFINS;
  }

  /**
   * Define o al�quota da COFINS (em percentual) N 008 04 N.
   *
   * @param r12_ALIQ_COFINS the new al�quota da COFINS (em percentual) N 008 04 N
   */
  public void setR12_ALIQ_COFINS(BigDecimal r12_ALIQ_COFINS) {
    this.r12_ALIQ_COFINS = r12_ALIQ_COFINS;
  }

  /**
   * Recupera o valor da COFINS N - 02 N.
   *
   * @return the valor da COFINS N - 02 N
   */
  public BigDecimal getR13_VL_COFINS() {
    return r13_VL_COFINS;
  }

  /**
   * Define o valor da COFINS N - 02 N.
   *
   * @param r13_VL_COFINS the new valor da COFINS N - 02 N
   */
  public void setR13_VL_COFINS(BigDecimal r13_VL_COFINS) {
    this.r13_VL_COFINS = r13_VL_COFINS;
  }

  /**
   * Recupera o c�digo da conta anal�tica cont�bil debitada/creditada C 060 - N.
   *
   * @return the c�digo da conta anal�tica cont�bil debitada/creditada C 060 - N
   */
  public String getR14_COD_CTA() {
    return r14_COD_CTA;
  }

  /**
   * Define o c�digo da conta anal�tica cont�bil debitada/creditada C 060 - N.
   *
   * @param r14_COD_CTA the new c�digo da conta anal�tica cont�bil debitada/creditada C 060 - N
   */
  public void setR14_COD_CTA(String r14_COD_CTA) {
    this.r14_COD_CTA = r14_COD_CTA;
  }

}