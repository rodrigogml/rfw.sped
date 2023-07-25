package br.eng.rodrigogml.rfw.sped.structure.contrib;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO M100: CRÉDITO DE PIS/PASEP RELATIVO AO PERÍODO.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribM100 extends SPEDRegister {

  /**
   * REGISTRO M105: DETALHAMENTO DA BASE DE CALCULO DO CRÉDITO APURADO NO PERÍODO – PIS/PASEP<br>
   * Chave: CST do PIS
   */
  private final LinkedHashMap<String, SPEDContribM105> rm105 = new LinkedHashMap<String, SPEDContribM105>();

  /**
   * Código de Tipo de Crédito apurado no período, conforme a Tabela 4.3.6. C 003* - S
   */
  @SPEDField(maxLength = 3, minLength = 3, required = true)
  private String r02_COD_CRED = null;

  /**
   * Indicador de Crédito Oriundo de:
   * <li>0 – Operações próprias;
   * <li>1 – Evento de incorporação, cisão ou fusão<br>
   * N 001* - S
   */
  @SPEDField(maxLength = 1, minLength = 1, required = true)
  private String r03_IND_CRED_ORI = null;

  /**
   * Valor da Base de Cálculo do Crédito N - 02 N
   */
  @SPEDField(maxLength = 20, decimals = 2, required = false)
  private BigDecimal r04_VL_BC_PIS = null;

  /**
   * Alíquota do PIS/PASEP (em percentual) N 008 04 N
   */
  @SPEDField(maxLength = 8, decimals = 4, required = false)
  private BigDecimal r05_ALIQ_PIS = null;

  /**
   * Quantidade – Base de cálculo PIS N - 03 N
   */
  @SPEDField(maxLength = 20, decimals = 3, required = false)
  private BigDecimal r06_QUANT_BC_PIS = null;

  /**
   * Alíquota do PIS (em reais) N - 04 N
   */
  @SPEDField(maxLength = 20, decimals = 4, required = false)
  private BigDecimal r07_ALIQ_PIS_QUANT = null;

  /**
   * Valor total do crédito apurado no período N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = false)
  private BigDecimal r08_VL_CRED = null;

  /**
   * Valor total dos ajustes de acréscimo N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r09_VL_AJUS_ACRES = null;

  /**
   * Valor total dos ajustes de redução N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r10_VL_AJUS_REDUC = null;

  /**
   * Valor total do crédito diferido no período N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r11_VL_CRED_DIF = null;

  /**
   * Valor Total do Crédito Disponível relativo ao Período (08 + 09 – 10 – 11) N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r12_VL_CRED_DISP = null;

  /**
   * Indicador de opção de utilização do crédito disponível no período:
   * <li>0 – Utilização do valor total para desconto da contribuição apurada no período, no Registro M200;
   * <li>1 – Utilização de valor parcial para desconto dacontribuição apurada no período, no Registro M200.<br>
   * C 001* - S
   */
  @SPEDField(maxLength = 1, minLength = 1, required = true)
  private String r13_IND_DESC_CRED = null;

  /**
   * Valor do Crédito disponível, descontado da contribuição apurada no próprio período.
   * <li>Se IND_DESC_CRED=0, informar o valor total do Campo 12;
   * <li>Se IND_DESC_CRED=1, informar o valor parcial do Campo 12.<br>
   * N - 02 N
   */
  @SPEDField(maxLength = 20, decimals = 2, required = false)
  private BigDecimal r14_VL_CRED_DESC = null;

  /**
   * Saldo de créditos a utilizar em períodos futuros (12 – 14) N - 02 S
   */
  @SPEDField(decimals = 2, maxLength = 20, required = true)
  private BigDecimal r15_SLD_CRED = null;

  @Override
  public String get01_Register() {
    return "M100";
  }

  /**
   * Recupera o código de Tipo de Crédito apurado no período, conforme a Tabela 4.3.6. C 003* - S.
   *
   * @return the código de Tipo de Crédito apurado no período, conforme a Tabela 4
   */
  public String getR02_COD_CRED() {
    return r02_COD_CRED;
  }

  /**
   * Define o código de Tipo de Crédito apurado no período, conforme a Tabela 4.3.6. C 003* - S.
   *
   * @param r02_COD_CRED the new código de Tipo de Crédito apurado no período, conforme a Tabela 4
   */
  public void setR02_COD_CRED(String r02_COD_CRED) {
    this.r02_COD_CRED = r02_COD_CRED;
  }

  /**
   * Recupera o indicador de Crédito Oriundo de:
   * <li>0 – Operações próprias;
   * <li>1 – Evento de incorporação, cisão ou fusão<br>
   * N 001* - S.
   *
   * @return the indicador de Crédito Oriundo de:
   *         <li>0 – Operações próprias;
   *         <li>1 – Evento de incorporação, cisão ou fusão<br>
   *         N 001* - S
   */
  public String getR03_IND_CRED_ORI() {
    return r03_IND_CRED_ORI;
  }

  /**
   * Define o indicador de Crédito Oriundo de:
   * <li>0 – Operações próprias;
   * <li>1 – Evento de incorporação, cisão ou fusão<br>
   * N 001* - S.
   *
   * @param r03_IND_CRED_ORI the new indicador de Crédito Oriundo de:
   *          <li>0 – Operações próprias;
   *          <li>1 – Evento de incorporação, cisão ou fusão<br>
   *          N 001* - S
   */
  public void setR03_IND_CRED_ORI(String r03_IND_CRED_ORI) {
    this.r03_IND_CRED_ORI = r03_IND_CRED_ORI;
  }

  /**
   * Recupera o valor da Base de Cálculo do Crédito N - 02 N.
   *
   * @return the valor da Base de Cálculo do Crédito N - 02 N
   */
  public BigDecimal getR04_VL_BC_PIS() {
    return r04_VL_BC_PIS;
  }

  /**
   * Define o valor da Base de Cálculo do Crédito N - 02 N.
   *
   * @param r04_VL_BC_PIS the new valor da Base de Cálculo do Crédito N - 02 N
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
   * Recupera o quantidade – Base de cálculo PIS N - 03 N.
   *
   * @return the quantidade – Base de cálculo PIS N - 03 N
   */
  public BigDecimal getR06_QUANT_BC_PIS() {
    return r06_QUANT_BC_PIS;
  }

  /**
   * Define o quantidade – Base de cálculo PIS N - 03 N.
   *
   * @param r06_QUANT_BC_PIS the new quantidade – Base de cálculo PIS N - 03 N
   */
  public void setR06_QUANT_BC_PIS(BigDecimal r06_QUANT_BC_PIS) {
    this.r06_QUANT_BC_PIS = r06_QUANT_BC_PIS;
  }

  /**
   * Recupera o alíquota do PIS (em reais) N - 04 N.
   *
   * @return the alíquota do PIS (em reais) N - 04 N
   */
  public BigDecimal getR07_ALIQ_PIS_QUANT() {
    return r07_ALIQ_PIS_QUANT;
  }

  /**
   * Define o alíquota do PIS (em reais) N - 04 N.
   *
   * @param r07_ALIQ_PIS_QUANT the new alíquota do PIS (em reais) N - 04 N
   */
  public void setR07_ALIQ_PIS_QUANT(BigDecimal r07_ALIQ_PIS_QUANT) {
    this.r07_ALIQ_PIS_QUANT = r07_ALIQ_PIS_QUANT;
  }

  /**
   * Recupera o valor total do crédito apurado no período N - 02 S.
   *
   * @return the valor total do crédito apurado no período N - 02 S
   */
  public BigDecimal getR08_VL_CRED() {
    return r08_VL_CRED;
  }

  /**
   * Define o valor total do crédito apurado no período N - 02 S.
   *
   * @param r08_VL_CRED the new valor total do crédito apurado no período N - 02 S
   */
  public void setR08_VL_CRED(BigDecimal r08_VL_CRED) {
    this.r08_VL_CRED = r08_VL_CRED;
  }

  /**
   * Recupera o valor total dos ajustes de acréscimo N - 02 S.
   *
   * @return the valor total dos ajustes de acréscimo N - 02 S
   */
  public BigDecimal getR09_VL_AJUS_ACRES() {
    return r09_VL_AJUS_ACRES;
  }

  /**
   * Define o valor total dos ajustes de acréscimo N - 02 S.
   *
   * @param r09_VL_AJUS_ACRES the new valor total dos ajustes de acréscimo N - 02 S
   */
  public void setR09_VL_AJUS_ACRES(BigDecimal r09_VL_AJUS_ACRES) {
    this.r09_VL_AJUS_ACRES = r09_VL_AJUS_ACRES;
  }

  /**
   * Recupera o valor total dos ajustes de redução N - 02 S.
   *
   * @return the valor total dos ajustes de redução N - 02 S
   */
  public BigDecimal getR10_VL_AJUS_REDUC() {
    return r10_VL_AJUS_REDUC;
  }

  /**
   * Define o valor total dos ajustes de redução N - 02 S.
   *
   * @param r10_VL_AJUS_REDUC the new valor total dos ajustes de redução N - 02 S
   */
  public void setR10_VL_AJUS_REDUC(BigDecimal r10_VL_AJUS_REDUC) {
    this.r10_VL_AJUS_REDUC = r10_VL_AJUS_REDUC;
  }

  /**
   * Recupera o valor total do crédito diferido no período N - 02 S.
   *
   * @return the valor total do crédito diferido no período N - 02 S
   */
  public BigDecimal getR11_VL_CRED_DIF() {
    return r11_VL_CRED_DIF;
  }

  /**
   * Define o valor total do crédito diferido no período N - 02 S.
   *
   * @param r11_VL_CRED_DIF the new valor total do crédito diferido no período N - 02 S
   */
  public void setR11_VL_CRED_DIF(BigDecimal r11_VL_CRED_DIF) {
    this.r11_VL_CRED_DIF = r11_VL_CRED_DIF;
  }

  /**
   * Recupera o valor Total do Crédito Disponível relativo ao Período (08 + 09 – 10 – 11) N - 02 S.
   *
   * @return the valor Total do Crédito Disponível relativo ao Período (08 + 09 – 10 – 11) N - 02 S
   */
  public BigDecimal getR12_VL_CRED_DISP() {
    return r12_VL_CRED_DISP;
  }

  /**
   * Define o valor Total do Crédito Disponível relativo ao Período (08 + 09 – 10 – 11) N - 02 S.
   *
   * @param r12_VL_CRED_DISP the new valor Total do Crédito Disponível relativo ao Período (08 + 09 – 10 – 11) N - 02 S
   */
  public void setR12_VL_CRED_DISP(BigDecimal r12_VL_CRED_DISP) {
    this.r12_VL_CRED_DISP = r12_VL_CRED_DISP;
  }

  /**
   * Recupera o indicador de opção de utilização do crédito disponível no período:
   * <li>0 – Utilização do valor total para desconto da contribuição apurada no período, no Registro M200;
   * <li>1 – Utilização de valor parcial para desconto dacontribuição apurada no período, no Registro M200.<br>
   * C 001* - S.
   *
   * @return the indicador de opção de utilização do crédito disponível no período:
   *         <li>0 – Utilização do valor total para desconto da contribuição apurada no período, no Registro M200;
   *         <li>1 – Utilização de valor parcial para desconto dacontribuição apurada no período, no Registro M200
   */
  public String getR13_IND_DESC_CRED() {
    return r13_IND_DESC_CRED;
  }

  /**
   * Define o indicador de opção de utilização do crédito disponível no período:
   * <li>0 – Utilização do valor total para desconto da contribuição apurada no período, no Registro M200;
   * <li>1 – Utilização de valor parcial para desconto dacontribuição apurada no período, no Registro M200.<br>
   * C 001* - S.
   *
   * @param r13_IND_DESC_CRED the new indicador de opção de utilização do crédito disponível no período:
   *          <li>0 – Utilização do valor total para desconto da contribuição apurada no período, no Registro M200;
   *          <li>1 – Utilização de valor parcial para desconto dacontribuição apurada no período, no Registro M200
   */
  public void setR13_IND_DESC_CRED(String r13_IND_DESC_CRED) {
    this.r13_IND_DESC_CRED = r13_IND_DESC_CRED;
  }

  /**
   * Recupera o valor do Crédito disponível, descontado da contribuição apurada no próprio período.
   * <li>Se IND_DESC_CRED=0, informar o valor total do Campo 12;
   * <li>Se IND_DESC_CRED=1, informar o valor parcial do Campo 12.<br>
   * N - 02 N.
   *
   * @return the valor do Crédito disponível, descontado da contribuição apurada no próprio período
   */
  public BigDecimal getR14_VL_CRED_DESC() {
    return r14_VL_CRED_DESC;
  }

  /**
   * Define o valor do Crédito disponível, descontado da contribuição apurada no próprio período.
   * <li>Se IND_DESC_CRED=0, informar o valor total do Campo 12;
   * <li>Se IND_DESC_CRED=1, informar o valor parcial do Campo 12.<br>
   * N - 02 N.
   *
   * @param r14_VL_CRED_DESC the new valor do Crédito disponível, descontado da contribuição apurada no próprio período
   */
  public void setR14_VL_CRED_DESC(BigDecimal r14_VL_CRED_DESC) {
    this.r14_VL_CRED_DESC = r14_VL_CRED_DESC;
  }

  /**
   * Recupera o saldo de créditos a utilizar em períodos futuros (12 – 14) N - 02 S.
   *
   * @return the saldo de créditos a utilizar em períodos futuros (12 – 14) N - 02 S
   */
  public BigDecimal getR15_SLD_CRED() {
    return r15_SLD_CRED;
  }

  /**
   * Define o saldo de créditos a utilizar em períodos futuros (12 – 14) N - 02 S.
   *
   * @param r15_SLD_CRED the new saldo de créditos a utilizar em períodos futuros (12 – 14) N - 02 S
   */
  public void setR15_SLD_CRED(BigDecimal r15_SLD_CRED) {
    this.r15_SLD_CRED = r15_SLD_CRED;
  }

  /**
   * Recupera o rEGISTRO M105: DETALHAMENTO DA BASE DE CALCULO DO CRÉDITO APURADO NO PERÍODO – PIS/PASEP<br>
   * Chave: CST do PIS.
   *
   * @return the rEGISTRO M105: DETALHAMENTO DA BASE DE CALCULO DO CRÉDITO APURADO NO PERÍODO – PIS/PASEP<br>
   *         Chave: CST do PIS
   */
  public LinkedHashMap<String, SPEDContribM105> getRm105() {
    return rm105;
  }

}