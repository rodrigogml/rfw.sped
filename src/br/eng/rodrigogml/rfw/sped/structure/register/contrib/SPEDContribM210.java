package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

// TODO: Auto-generated Javadoc
/**
 * Description: REGISTRO M210: DETALHAMENTO DA CONTRIBUIÇÃO PARA O PIS/PASEP DO PERÍODO.<br>
 *
 * @author Rodrigo GML
 * @version 1.0.0 - Rodrigo GML-(...)
 * @since 1.0.0 (25 de jul. de 2023)
 */
public class SPEDContribM210 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  public SPEDContribM210(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * Código da contribuição social apurada no período, conforme a Tabela 4.3.5. C 002* - S
   */
  @SPEDField(maxLength = 2, minLength = 2, required = true)
  private String r02_COD_CONT = null;

  /** Valor da Receita Bruta N - 02 S. */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r03_VL_REC_BRT = null;

  /** Valor da Base de Cálculo da Contribuição N - 02 S. */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r04_VL_BC_CONT = null;

  /** Valor do total dos ajustes de acréscimo da base de cálculo da contribuição a que se refere o Campo 04 N - 02 S. */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r05_VL_AJUS_ACRES_BC_PIS = null;

  /** Valor do total dos ajustes de redução da base de cálculo da contribuição a que se refere o Campo 04 N - 02 S. */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r06_VL_AJUS_REDUC_BC_PIS = null;

  /**
   * Valor da Base de Cálculo da Contribuição, após os ajustes. (Campo 07 = Campo 04 + Campo 05 - Campo 06) N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r07_VL_BC_CONT_AJUS = null;

  /** Alíquota do PIS/PASEP (em percentual) N 008 04 N. */
  @SPEDField(maxLength = 8, decimals = 4, required = false)
  private BigDecimal r08_ALIQ_PIS = null;

  /** Quantidade – Base de cálculo PIS N - 03 N. */
  @SPEDField(maxLength = 20, decimals = 3, required = false)
  private BigDecimal r09_QUANT_BC_PIS = null;

  /** Alíquota do PIS (em reais) N - 04 N. */
  @SPEDField(maxLength = 20, decimals = 4, required = false)
  private BigDecimal r10_ALIQ_PIS_QUANT = null;

  /** Valor total da contribuição social apurada N - 02 S. */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r11_VL_CONT_APUR = null;

  /** Valor total dos ajustes de acréscimo N - 02 S. */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r12_VL_AJUS_ACRES = null;

  /** Valor total dos ajustes de redução N - 02 S. */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r13_VL_AJUS_REDUC = null;

  /** Valor da contribuição a diferir no período N - 02 N. */
  @SPEDField(maxLength = 20, decimals = 2, required = false)
  private BigDecimal r14_VL_CONT_DIFER = null;

  /** Valor da contribuição diferida em períodos anteriores N - 02 N. */
  @SPEDField(maxLength = 20, decimals = 2, required = false)
  private BigDecimal r15_VL_CONT_DIFER_ANT = null;

  /** Valor Total da Contribuição do Período (08 + 09 – 10 – 11+12) N - 02 S. */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r16_VL_CONT_PER = null;

  @Override
  public String get01_Register() {
    return "M210";
  }

  /**
   * # código da contribuição social apurada no período, conforme a Tabela 4.3.5. C 002* - S.
   *
   * @return the código da contribuição social apurada no período, conforme a Tabela 4
   */
  public String getR02_COD_CONT() {
    return r02_COD_CONT;
  }

  /**
   * # código da contribuição social apurada no período, conforme a Tabela 4.3.5. C 002* - S.
   *
   * @param r02_COD_CONT the new código da contribuição social apurada no período, conforme a Tabela 4
   */
  public void setR02_COD_CONT(String r02_COD_CONT) {
    this.r02_COD_CONT = r02_COD_CONT;
  }

  /**
   * # valor da Receita Bruta N - 02 S.
   *
   * @return the valor da Receita Bruta N - 02 S
   */
  public BigDecimal getR03_VL_REC_BRT() {
    return r03_VL_REC_BRT;
  }

  /**
   * # valor da Receita Bruta N - 02 S.
   *
   * @param r03_VL_REC_BRT the new valor da Receita Bruta N - 02 S
   */
  public void setR03_VL_REC_BRT(BigDecimal r03_VL_REC_BRT) {
    this.r03_VL_REC_BRT = r03_VL_REC_BRT;
  }

  /**
   * # valor da Base de Cálculo da Contribuição N - 02 S.
   *
   * @return the valor da Base de Cálculo da Contribuição N - 02 S
   */
  public BigDecimal getR04_VL_BC_CONT() {
    return r04_VL_BC_CONT;
  }

  /**
   * # valor da Base de Cálculo da Contribuição N - 02 S.
   *
   * @param r04_VL_BC_CONT the new valor da Base de Cálculo da Contribuição N - 02 S
   */
  public void setR04_VL_BC_CONT(BigDecimal r04_VL_BC_CONT) {
    this.r04_VL_BC_CONT = r04_VL_BC_CONT;
  }

  /**
   * # valor do total dos ajustes de acréscimo da base de cálculo da contribuição a que se refere o Campo 04 N - 02 S.
   *
   * @return the valor do total dos ajustes de acréscimo da base de cálculo da contribuição a que se refere o Campo 04 N - 02 S
   */
  public BigDecimal getR05_VL_AJUS_ACRES_BC_PIS() {
    return r05_VL_AJUS_ACRES_BC_PIS;
  }

  /**
   * # valor do total dos ajustes de acréscimo da base de cálculo da contribuição a que se refere o Campo 04 N - 02 S.
   *
   * @param r05_VL_AJUS_ACRES_BC_PIS the new valor do total dos ajustes de acréscimo da base de cálculo da contribuição a que se refere o Campo 04 N - 02 S
   */
  public void setR05_VL_AJUS_ACRES_BC_PIS(BigDecimal r05_VL_AJUS_ACRES_BC_PIS) {
    this.r05_VL_AJUS_ACRES_BC_PIS = r05_VL_AJUS_ACRES_BC_PIS;
  }

  /**
   * # valor do total dos ajustes de redução da base de cálculo da contribuição a que se refere o Campo 04 N - 02 S.
   *
   * @return the valor do total dos ajustes de redução da base de cálculo da contribuição a que se refere o Campo 04 N - 02 S
   */
  public BigDecimal getR06_VL_AJUS_REDUC_BC_PIS() {
    return r06_VL_AJUS_REDUC_BC_PIS;
  }

  /**
   * # valor do total dos ajustes de redução da base de cálculo da contribuição a que se refere o Campo 04 N - 02 S.
   *
   * @param r06_VL_AJUS_REDUC_BC_PIS the new valor do total dos ajustes de redução da base de cálculo da contribuição a que se refere o Campo 04 N - 02 S
   */
  public void setR06_VL_AJUS_REDUC_BC_PIS(BigDecimal r06_VL_AJUS_REDUC_BC_PIS) {
    this.r06_VL_AJUS_REDUC_BC_PIS = r06_VL_AJUS_REDUC_BC_PIS;
  }

  /**
   * # valor da Base de Cálculo da Contribuição, após os ajustes. (Campo 07 = Campo 04 + Campo 05 - Campo 06) N - 02 S.
   *
   * @return the valor da Base de Cálculo da Contribuição, após os ajustes
   */
  public BigDecimal getR07_VL_BC_CONT_AJUS() {
    return r07_VL_BC_CONT_AJUS;
  }

  /**
   * # valor da Base de Cálculo da Contribuição, após os ajustes. (Campo 07 = Campo 04 + Campo 05 - Campo 06) N - 02 S.
   *
   * @param r07_VL_BC_CONT_AJUS the new valor da Base de Cálculo da Contribuição, após os ajustes
   */
  public void setR07_VL_BC_CONT_AJUS(BigDecimal r07_VL_BC_CONT_AJUS) {
    this.r07_VL_BC_CONT_AJUS = r07_VL_BC_CONT_AJUS;
  }

  /**
   * # alíquota do PIS/PASEP (em percentual) N 008 04 N.
   *
   * @return the alíquota do PIS/PASEP (em percentual) N 008 04 N
   */
  public BigDecimal getR08_ALIQ_PIS() {
    return r08_ALIQ_PIS;
  }

  /**
   * # alíquota do PIS/PASEP (em percentual) N 008 04 N.
   *
   * @param r08_ALIQ_PIS the new alíquota do PIS/PASEP (em percentual) N 008 04 N
   */
  public void setR08_ALIQ_PIS(BigDecimal r08_ALIQ_PIS) {
    this.r08_ALIQ_PIS = r08_ALIQ_PIS;
  }

  /**
   * # quantidade – Base de cálculo PIS N - 03 N.
   *
   * @return the quantidade – Base de cálculo PIS N - 03 N
   */
  public BigDecimal getR09_QUANT_BC_PIS() {
    return r09_QUANT_BC_PIS;
  }

  /**
   * # quantidade – Base de cálculo PIS N - 03 N.
   *
   * @param r09_QUANT_BC_PIS the new quantidade – Base de cálculo PIS N - 03 N
   */
  public void setR09_QUANT_BC_PIS(BigDecimal r09_QUANT_BC_PIS) {
    this.r09_QUANT_BC_PIS = r09_QUANT_BC_PIS;
  }

  /**
   * # alíquota do PIS (em reais) N - 04 N.
   *
   * @return the alíquota do PIS (em reais) N - 04 N
   */
  public BigDecimal getR10_ALIQ_PIS_QUANT() {
    return r10_ALIQ_PIS_QUANT;
  }

  /**
   * # alíquota do PIS (em reais) N - 04 N.
   *
   * @param r10_ALIQ_PIS_QUANT the new alíquota do PIS (em reais) N - 04 N
   */
  public void setR10_ALIQ_PIS_QUANT(BigDecimal r10_ALIQ_PIS_QUANT) {
    this.r10_ALIQ_PIS_QUANT = r10_ALIQ_PIS_QUANT;
  }

  /**
   * # valor total da contribuição social apurada N - 02 S.
   *
   * @return the valor total da contribuição social apurada N - 02 S
   */
  public BigDecimal getR11_VL_CONT_APUR() {
    return r11_VL_CONT_APUR;
  }

  /**
   * # valor total da contribuição social apurada N - 02 S.
   *
   * @param r11_VL_CONT_APUR the new valor total da contribuição social apurada N - 02 S
   */
  public void setR11_VL_CONT_APUR(BigDecimal r11_VL_CONT_APUR) {
    this.r11_VL_CONT_APUR = r11_VL_CONT_APUR;
  }

  /**
   * # valor total dos ajustes de acréscimo N - 02 S.
   *
   * @return the valor total dos ajustes de acréscimo N - 02 S
   */
  public BigDecimal getR12_VL_AJUS_ACRES() {
    return r12_VL_AJUS_ACRES;
  }

  /**
   * # valor total dos ajustes de acréscimo N - 02 S.
   *
   * @param r12_VL_AJUS_ACRES the new valor total dos ajustes de acréscimo N - 02 S
   */
  public void setR12_VL_AJUS_ACRES(BigDecimal r12_VL_AJUS_ACRES) {
    this.r12_VL_AJUS_ACRES = r12_VL_AJUS_ACRES;
  }

  /**
   * # valor total dos ajustes de redução N - 02 S.
   *
   * @return the valor total dos ajustes de redução N - 02 S
   */
  public BigDecimal getR13_VL_AJUS_REDUC() {
    return r13_VL_AJUS_REDUC;
  }

  /**
   * # valor total dos ajustes de redução N - 02 S.
   *
   * @param r13_VL_AJUS_REDUC the new valor total dos ajustes de redução N - 02 S
   */
  public void setR13_VL_AJUS_REDUC(BigDecimal r13_VL_AJUS_REDUC) {
    this.r13_VL_AJUS_REDUC = r13_VL_AJUS_REDUC;
  }

  /**
   * # valor da contribuição a diferir no período N - 02 N.
   *
   * @return the valor da contribuição a diferir no período N - 02 N
   */
  public BigDecimal getR14_VL_CONT_DIFER() {
    return r14_VL_CONT_DIFER;
  }

  /**
   * # valor da contribuição a diferir no período N - 02 N.
   *
   * @param r14_VL_CONT_DIFER the new valor da contribuição a diferir no período N - 02 N
   */
  public void setR14_VL_CONT_DIFER(BigDecimal r14_VL_CONT_DIFER) {
    this.r14_VL_CONT_DIFER = r14_VL_CONT_DIFER;
  }

  /**
   * # valor da contribuição diferida em períodos anteriores N - 02 N.
   *
   * @return the valor da contribuição diferida em períodos anteriores N - 02 N
   */
  public BigDecimal getR15_VL_CONT_DIFER_ANT() {
    return r15_VL_CONT_DIFER_ANT;
  }

  /**
   * # valor da contribuição diferida em períodos anteriores N - 02 N.
   *
   * @param r15_VL_CONT_DIFER_ANT the new valor da contribuição diferida em períodos anteriores N - 02 N
   */
  public void setR15_VL_CONT_DIFER_ANT(BigDecimal r15_VL_CONT_DIFER_ANT) {
    this.r15_VL_CONT_DIFER_ANT = r15_VL_CONT_DIFER_ANT;
  }

  /**
   * # valor Total da Contribuição do Período (08 + 09 – 10 – 11+12) N - 02 S.
   *
   * @return the valor Total da Contribuição do Período (08 + 09 – 10 – 11+12) N - 02 S
   */
  public BigDecimal getR16_VL_CONT_PER() {
    return r16_VL_CONT_PER;
  }

  /**
   * # valor Total da Contribuição do Período (08 + 09 – 10 – 11+12) N - 02 S.
   *
   * @param r16_VL_CONT_PER the new valor Total da Contribuição do Período (08 + 09 – 10 – 11+12) N - 02 S
   */
  public void setR16_VL_CONT_PER(BigDecimal r16_VL_CONT_PER) {
    this.r16_VL_CONT_PER = r16_VL_CONT_PER;
  }

}