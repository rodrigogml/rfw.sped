package br.eng.rodrigogml.rfw.sped.structure.contrib;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO C485: RESUMO DIÁRIO DE DOCUMENTOS EMITIDOS POR ECF – COFINS (CÓDIGOS 02 e 2D).<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribC485 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * Código da Situação Tributária referente a COFINS. N 002* - S
   */
  @SPEDField(maxLength = 2, minLength = 2, required = true)
  private String r02_CST_COFINS = null;

  /**
   * Valor total dos itens N - 02 S
   */
  @SPEDField(decimals = 2, maxLength = 20, required = true)
  private BigDecimal r03_VL_ITEM = null;

  /**
   * Valor da base de cálculo da COFINS N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = true)
  private BigDecimal r04_VL_BC_COFINS = null;

  /**
   * Alíquota da COFINS (em percentual) N 008 04 N
   */
  @SPEDField(decimals = 4, maxLength = 8, required = false)
  private BigDecimal r05_ALIQ_COFINS = null;

  /**
   * Quantidade – Base de cálculo COFINS N - 03 N
   */
  @SPEDField(decimals = 3, maxLength = 20, required = false)
  private BigDecimal r06_QUANT_BC_COFINS = null;

  /**
   * Alíquota do COFINS (em reais) N - 04 N
   */
  @SPEDField(decimals = 4, maxLength = 20, required = false)
  private BigDecimal r07_ALIQ_COFINS_QUANT = null;

  /**
   * Valor da COFINS N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = false)
  private BigDecimal r08_VL_COFINS = null;

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
    return "C485";
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
   * Recupera o valor da base de cálculo da COFINS N - 02 N.
   *
   * @return the valor da base de cálculo da COFINS N - 02 N
   */
  public BigDecimal getR04_VL_BC_COFINS() {
    return r04_VL_BC_COFINS;
  }

  /**
   * Define o valor da base de cálculo da COFINS N - 02 N.
   *
   * @param r04_VL_BC_COFINS the new valor da base de cálculo da COFINS N - 02 N
   */
  public void setR04_VL_BC_COFINS(BigDecimal r04_VL_BC_COFINS) {
    this.r04_VL_BC_COFINS = r04_VL_BC_COFINS;
  }

  /**
   * Recupera o alíquota da COFINS (em percentual) N 008 04 N.
   *
   * @return the alíquota da COFINS (em percentual) N 008 04 N
   */
  public BigDecimal getR05_ALIQ_COFINS() {
    return r05_ALIQ_COFINS;
  }

  /**
   * Define o alíquota da COFINS (em percentual) N 008 04 N.
   *
   * @param r05_ALIQ_COFINS the new alíquota da COFINS (em percentual) N 008 04 N
   */
  public void setR05_ALIQ_COFINS(BigDecimal r05_ALIQ_COFINS) {
    this.r05_ALIQ_COFINS = r05_ALIQ_COFINS;
  }

  /**
   * Recupera o quantidade – Base de cálculo COFINS N - 03 N.
   *
   * @return the quantidade – Base de cálculo COFINS N - 03 N
   */
  public BigDecimal getR06_QUANT_BC_COFINS() {
    return r06_QUANT_BC_COFINS;
  }

  /**
   * Define o quantidade – Base de cálculo COFINS N - 03 N.
   *
   * @param r06_QUANT_BC_COFINS the new quantidade – Base de cálculo COFINS N - 03 N
   */
  public void setR06_QUANT_BC_COFINS(BigDecimal r06_QUANT_BC_COFINS) {
    this.r06_QUANT_BC_COFINS = r06_QUANT_BC_COFINS;
  }

  /**
   * Recupera o alíquota do COFINS (em reais) N - 04 N.
   *
   * @return the alíquota do COFINS (em reais) N - 04 N
   */
  public BigDecimal getR07_ALIQ_COFINS_QUANT() {
    return r07_ALIQ_COFINS_QUANT;
  }

  /**
   * Define o alíquota do COFINS (em reais) N - 04 N.
   *
   * @param r07_ALIQ_COFINS_QUANT the new alíquota do COFINS (em reais) N - 04 N
   */
  public void setR07_ALIQ_COFINS_QUANT(BigDecimal r07_ALIQ_COFINS_QUANT) {
    this.r07_ALIQ_COFINS_QUANT = r07_ALIQ_COFINS_QUANT;
  }

  /**
   * Recupera o valor da COFINS N - 02 N.
   *
   * @return the valor da COFINS N - 02 N
   */
  public BigDecimal getR08_VL_COFINS() {
    return r08_VL_COFINS;
  }

  /**
   * Define o valor da COFINS N - 02 N.
   *
   * @param r08_VL_COFINS the new valor da COFINS N - 02 N
   */
  public void setR08_VL_COFINS(BigDecimal r08_VL_COFINS) {
    this.r08_VL_COFINS = r08_VL_COFINS;
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

  /**
   * Recupera o código da Situação Tributária referente a COFINS. N 002* - S.
   *
   * @return the código da Situação Tributária referente a COFINS
   */
  public String getR02_CST_COFINS() {
    return r02_CST_COFINS;
  }

  /**
   * Define o código da Situação Tributária referente a COFINS. N 002* - S.
   *
   * @param r02_CST_COFINS the new código da Situação Tributária referente a COFINS
   */
  public void setR02_CST_COFINS(String r02_CST_COFINS) {
    this.r02_CST_COFINS = r02_CST_COFINS;
  }

}