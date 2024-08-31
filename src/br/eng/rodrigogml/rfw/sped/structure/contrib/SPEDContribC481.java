package br.eng.rodrigogml.rfw.sped.structure.contrib;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO C481: RESUMO DIÁRIO DE DOCUMENTOS EMITIDOS POR ECF – PIS/PASEP (CÓDIGOS 02 e 2D)..<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribC481 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * Código da Situação Tributária referente ao PIS/PASEP N 002* - S
   */
  @SPEDField(maxLength = 2, minLength = 2, required = true)
  private String r02_CST_PIS = null;

  /**
   * Valor total dos itens N - 02 S
   */
  @SPEDField(decimals = 2, maxLength = 20, required = true)
  private BigDecimal r03_VL_ITEM = null;

  /**
   * Valor da base de cálculo do PIS/PASEP N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = true)
  private BigDecimal r04_VL_BC_PIS = null;

  /**
   * Alíquota do PIS/PASEP (em percentual) N 008 04 N
   */
  @SPEDField(decimals = 4, maxLength = 8, required = false)
  private BigDecimal r05_ALIQ_PIS = null;

  /**
   * Quantidade – Base de cálculo PIS/PASEP N - 03 N
   */
  @SPEDField(decimals = 3, maxLength = 20, required = false)
  private BigDecimal r06_QUANT_BC_PIS = null;

  /**
   * Alíquota do PIS/PASEP (em reais) N - 04 N
   */
  @SPEDField(decimals = 4, maxLength = 20, required = false)
  private BigDecimal r07_ALIQ_PIS_QUANT = null;

  /**
   * Valor do PIS/PASEP N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = false)
  private BigDecimal r08_VL_PIS = null;

  /**
   * Código do item (campo 02 do Registro 0200) C 060 - N
   */
  @SPEDField(maxLength = 60, required = false)
  private String r09_COD_ITEM = null;

  /**
   * Código da conta analítica contábil debitada/creditada C 060 - N
   */
  @SPEDField(maxLength = 60, required = false)
  private String r10_COD_CTA = null;

  @Override
  public String get01_Register() {
    return "C481";
  }

  /**
   * Recupera o código da Situação Tributária referente ao PIS/PASEP N 002* - S.
   *
   * @return the código da Situação Tributária referente ao PIS/PASEP N 002* - S
   */
  public String getR02_CST_PIS() {
    return r02_CST_PIS;
  }

  /**
   * Define o código da Situação Tributária referente ao PIS/PASEP N 002* - S.
   *
   * @param r02_CST_PIS the new código da Situação Tributária referente ao PIS/PASEP N 002* - S
   */
  public void setR02_CST_PIS(String r02_CST_PIS) {
    this.r02_CST_PIS = r02_CST_PIS;
  }

  /**
   * Recupera o valor total dos itens N - 02 S.
   *
   * @return the valor total dos itens N - 02 S
   */
  public BigDecimal getR03_VL_ITEM() {
    return r03_VL_ITEM;
  }

  /**
   * Define o valor total dos itens N - 02 S.
   *
   * @param r03_VL_ITEM the new valor total dos itens N - 02 S
   */
  public void setR03_VL_ITEM(BigDecimal r03_VL_ITEM) {
    this.r03_VL_ITEM = r03_VL_ITEM;
  }

  /**
   * Recupera o valor da base de cálculo do PIS/PASEP N - 02 N.
   *
   * @return the valor da base de cálculo do PIS/PASEP N - 02 N
   */
  public BigDecimal getR04_VL_BC_PIS() {
    return r04_VL_BC_PIS;
  }

  /**
   * Define o valor da base de cálculo do PIS/PASEP N - 02 N.
   *
   * @param r04_VL_BC_PIS the new valor da base de cálculo do PIS/PASEP N - 02 N
   */
  public void setR04_VL_BC_PIS(BigDecimal r04_VL_BC_PIS) {
    this.r04_VL_BC_PIS = r04_VL_BC_PIS;
  }

  /**
   * Recupera o alíquota do PIS/PASEP (em percentual) N 008 04 N.
   *
   * @return the alíquota do PIS/PASEP (em percentual) N 008 04 N
   */
  public BigDecimal getR05_ALIQ_PIS() {
    return r05_ALIQ_PIS;
  }

  /**
   * Define o alíquota do PIS/PASEP (em percentual) N 008 04 N.
   *
   * @param r05_ALIQ_PIS the new alíquota do PIS/PASEP (em percentual) N 008 04 N
   */
  public void setR05_ALIQ_PIS(BigDecimal r05_ALIQ_PIS) {
    this.r05_ALIQ_PIS = r05_ALIQ_PIS;
  }

  /**
   * Recupera o quantidade – Base de cálculo PIS/PASEP N - 03 N.
   *
   * @return the quantidade – Base de cálculo PIS/PASEP N - 03 N
   */
  public BigDecimal getR06_QUANT_BC_PIS() {
    return r06_QUANT_BC_PIS;
  }

  /**
   * Define o quantidade – Base de cálculo PIS/PASEP N - 03 N.
   *
   * @param r06_QUANT_BC_PIS the new quantidade – Base de cálculo PIS/PASEP N - 03 N
   */
  public void setR06_QUANT_BC_PIS(BigDecimal r06_QUANT_BC_PIS) {
    this.r06_QUANT_BC_PIS = r06_QUANT_BC_PIS;
  }

  /**
   * Recupera o alíquota do PIS/PASEP (em reais) N - 04 N.
   *
   * @return the alíquota do PIS/PASEP (em reais) N - 04 N
   */
  public BigDecimal getR07_ALIQ_PIS_QUANT() {
    return r07_ALIQ_PIS_QUANT;
  }

  /**
   * Define o alíquota do PIS/PASEP (em reais) N - 04 N.
   *
   * @param r07_ALIQ_PIS_QUANT the new alíquota do PIS/PASEP (em reais) N - 04 N
   */
  public void setR07_ALIQ_PIS_QUANT(BigDecimal r07_ALIQ_PIS_QUANT) {
    this.r07_ALIQ_PIS_QUANT = r07_ALIQ_PIS_QUANT;
  }

  /**
   * Recupera o valor do PIS/PASEP N - 02 N.
   *
   * @return the valor do PIS/PASEP N - 02 N
   */
  public BigDecimal getR08_VL_PIS() {
    return r08_VL_PIS;
  }

  /**
   * Define o valor do PIS/PASEP N - 02 N.
   *
   * @param r08_VL_PIS the new valor do PIS/PASEP N - 02 N
   */
  public void setR08_VL_PIS(BigDecimal r08_VL_PIS) {
    this.r08_VL_PIS = r08_VL_PIS;
  }

  /**
   * Recupera o código do item (campo 02 do Registro 0200) C 060 - N.
   *
   * @return the código do item (campo 02 do Registro 0200) C 060 - N
   */
  public String getR09_COD_ITEM() {
    return r09_COD_ITEM;
  }

  /**
   * Define o código do item (campo 02 do Registro 0200) C 060 - N.
   *
   * @param r09_COD_ITEM the new código do item (campo 02 do Registro 0200) C 060 - N
   */
  public void setR09_COD_ITEM(String r09_COD_ITEM) {
    this.r09_COD_ITEM = r09_COD_ITEM;
  }

  /**
   * Recupera o código da conta analítica contábil debitada/creditada C 060 - N.
   *
   * @return the código da conta analítica contábil debitada/creditada C 060 - N
   */
  public String getR10_COD_CTA() {
    return r10_COD_CTA;
  }

  /**
   * Define o código da conta analítica contábil debitada/creditada C 060 - N.
   *
   * @param r10_COD_CTA the new código da conta analítica contábil debitada/creditada C 060 - N
   */
  public void setR10_COD_CTA(String r10_COD_CTA) {
    this.r10_COD_CTA = r10_COD_CTA;
  }

}