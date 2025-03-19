package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C190: REGISTRO ANALÍTICO DO DOCUMENTO (CÓDIGO 01, 1B, 04, 55 e 65).<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalC190 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscalC190(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 CST_ICMS Código da Situação Tributária, conforme a Tabela indicada no item 4.3.1 N 003* - O O
   */
  @SPEDField(maxLength = 3, minLength = 3)
  private String r02_CST_ICMS = null;

  /**
   * 03 CFOP Código Fiscal de Operação e Prestação do agrupamento de itens N 004* - O O
   */
  @SPEDField(maxLength = 4, minLength = 4)
  private String r03_CFOP = null;

  /**
   * 04 ALIQ_ICMS Alíquota do ICMS N 006 02 OC OC
   */
  @SPEDField(maxLength = 6, decimals = 2, required = false)
  private BigDecimal r04_ALIQ_ICMS = null;

  /**
   * 05 VL_OPR Valor da operação na combinação de CST_ICMS, CFOP e alíquota do ICMS, correspondente ao somatório do valor das mercadorias, despesas acessórias (frete, seguros e outras despesas acessórias), ICMS_ST e IPI. N - 02 O O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r05_VL_OPR = null;

  /**
   * 06 VL_BC_ICMS Parcela correspondente ao "Valor da base de cálculo do ICMS" referente à combinação de CST_ICMS, CFOP e alíquota do ICMS. N - 02 O O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r06_VL_BC_ICMS = null;

  /**
   * 07 VL_ICMS Parcela correspondente ao "Valor do ICMS" referente à combinação de CST_ICMS, CFOP e alíquota do ICMS. N - 02 O O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r07_VL_ICMS = null;

  /**
   * 08 VL_BC_ICMS_ST Parcela correspondente ao "Valor da base de cálculo do ICMS" da substituição tributária referente à combinação de CST_ICMS, CFOP e alíquota do ICMS. N - 02 O O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r08_VL_BC_ICMS_ST = null;

  /**
   * 09 VL_ICMS_ST Parcela correspondente ao valor creditado/debitado do ICMS da substituição tributária, referente à combinação de CST_ICMS, CFOP, e alíquota do ICMS. N - 02 O O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r09_VL_ICMS_ST = null;

  /**
   * 10 VL_RED_BC Valor não tributado em função da redução da base de cálculo do ICMS, referente à combinação de CST_ICMS, CFOP e alíquota do ICMS. N - 02 O O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r10_VL_RED_BC = null;

  /**
   * 11 VL_IPI Parcela correspondente ao "Valor do IPI" referente à combinação CST_ICMS, CFOP e alíquota do ICMS.class N - 02 O O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r11_VL_IPI = null;

  /**
   * 12 COD_OBS Código da observação do lançamento fiscal (campo 02 do Registro 0460) C 006 - OC OC
   */
  @SPEDField(maxLength = 6, required = false)
  private String r12_COD_OBS = null;

  @Override
  public String get01_Register() {
    return "C190";
  }

  /**
   * Recupera o 02 CST_ICMS Código da Situação Tributária, conforme a Tabela indicada no item 4.3.1 N 003* - O O.
   *
   * @return the 02 CST_ICMS Código da Situação Tributária, conforme a Tabela indicada no item 4
   */
  public String getR02_CST_ICMS() {
    return r02_CST_ICMS;
  }

  /**
   * Define o 02 CST_ICMS Código da Situação Tributária, conforme a Tabela indicada no item 4.3.1 N 003* - O O.
   *
   * @param r02_CST_ICMS the new 02 CST_ICMS Código da Situação Tributária, conforme a Tabela indicada no item 4
   */
  public void setR02_CST_ICMS(String r02_CST_ICMS) {
    this.r02_CST_ICMS = r02_CST_ICMS;
  }

  /**
   * Recupera o 03 CFOP Código Fiscal de Operação e Prestação do agrupamento de itens N 004* - O O.
   *
   * @return the 03 CFOP Código Fiscal de Operação e Prestação do agrupamento de itens N 004* - O O
   */
  public String getR03_CFOP() {
    return r03_CFOP;
  }

  /**
   * Define o 03 CFOP Código Fiscal de Operação e Prestação do agrupamento de itens N 004* - O O.
   *
   * @param r03_CFOP the new 03 CFOP Código Fiscal de Operação e Prestação do agrupamento de itens N 004* - O O
   */
  public void setR03_CFOP(String r03_CFOP) {
    this.r03_CFOP = r03_CFOP;
  }

  /**
   * Recupera o 04 ALIQ_ICMS Alíquota do ICMS N 006 02 OC OC.
   *
   * @return the 04 ALIQ_ICMS Alíquota do ICMS N 006 02 OC OC
   */
  public BigDecimal getR04_ALIQ_ICMS() {
    return r04_ALIQ_ICMS;
  }

  /**
   * Define o 04 ALIQ_ICMS Alíquota do ICMS N 006 02 OC OC.
   *
   * @param r04_ALIQ_ICMS the new 04 ALIQ_ICMS Alíquota do ICMS N 006 02 OC OC
   */
  public void setR04_ALIQ_ICMS(BigDecimal r04_ALIQ_ICMS) {
    this.r04_ALIQ_ICMS = r04_ALIQ_ICMS;
  }

  /**
   * Recupera o 05 VL_OPR Valor da operação na combinação de CST_ICMS, CFOP e alíquota do ICMS, correspondente ao somatório do valor das mercadorias, despesas acessórias (frete, seguros e outras despesas acessórias), ICMS_ST e IPI. N - 02 O O.
   *
   * @return the 05 VL_OPR Valor da operação na combinação de CST_ICMS, CFOP e alíquota do ICMS, correspondente ao somatório do valor das mercadorias, despesas acessórias (frete, seguros e outras despesas acessórias), ICMS_ST e IPI
   */
  public BigDecimal getR05_VL_OPR() {
    return r05_VL_OPR;
  }

  /**
   * Define o 05 VL_OPR Valor da operação na combinação de CST_ICMS, CFOP e alíquota do ICMS, correspondente ao somatório do valor das mercadorias, despesas acessórias (frete, seguros e outras despesas acessórias), ICMS_ST e IPI. N - 02 O O.
   *
   * @param r05_VL_OPR the new 05 VL_OPR Valor da operação na combinação de CST_ICMS, CFOP e alíquota do ICMS, correspondente ao somatório do valor das mercadorias, despesas acessórias (frete, seguros e outras despesas acessórias), ICMS_ST e IPI
   */
  public void setR05_VL_OPR(BigDecimal r05_VL_OPR) {
    this.r05_VL_OPR = r05_VL_OPR;
  }

  /**
   * Recupera o 06 VL_BC_ICMS Parcela correspondente ao "Valor da base de cálculo do ICMS" referente à combinação de CST_ICMS, CFOP e alíquota do ICMS. N - 02 O O.
   *
   * @return the 06 VL_BC_ICMS Parcela correspondente ao "Valor da base de cálculo do ICMS" referente à combinação de CST_ICMS, CFOP e alíquota do ICMS
   */
  public BigDecimal getR06_VL_BC_ICMS() {
    return r06_VL_BC_ICMS;
  }

  /**
   * Define o 06 VL_BC_ICMS Parcela correspondente ao "Valor da base de cálculo do ICMS" referente à combinação de CST_ICMS, CFOP e alíquota do ICMS. N - 02 O O.
   *
   * @param r06_VL_BC_ICMS the new 06 VL_BC_ICMS Parcela correspondente ao "Valor da base de cálculo do ICMS" referente à combinação de CST_ICMS, CFOP e alíquota do ICMS
   */
  public void setR06_VL_BC_ICMS(BigDecimal r06_VL_BC_ICMS) {
    this.r06_VL_BC_ICMS = r06_VL_BC_ICMS;
  }

  /**
   * Recupera o 07 VL_ICMS Parcela correspondente ao "Valor do ICMS" referente à combinação de CST_ICMS, CFOP e alíquota do ICMS. N - 02 O O.
   *
   * @return the 07 VL_ICMS Parcela correspondente ao "Valor do ICMS" referente à combinação de CST_ICMS, CFOP e alíquota do ICMS
   */
  public BigDecimal getR07_VL_ICMS() {
    return r07_VL_ICMS;
  }

  /**
   * Define o 07 VL_ICMS Parcela correspondente ao "Valor do ICMS" referente à combinação de CST_ICMS, CFOP e alíquota do ICMS. N - 02 O O.
   *
   * @param r07_VL_ICMS the new 07 VL_ICMS Parcela correspondente ao "Valor do ICMS" referente à combinação de CST_ICMS, CFOP e alíquota do ICMS
   */
  public void setR07_VL_ICMS(BigDecimal r07_VL_ICMS) {
    this.r07_VL_ICMS = r07_VL_ICMS;
  }

  /**
   * Recupera o 08 VL_BC_ICMS_ST Parcela correspondente ao "Valor da base de cálculo do ICMS" da substituição tributária referente à combinação de CST_ICMS, CFOP e alíquota do ICMS. N - 02 O O.
   *
   * @return the 08 VL_BC_ICMS_ST Parcela correspondente ao "Valor da base de cálculo do ICMS" da substituição tributária referente à combinação de CST_ICMS, CFOP e alíquota do ICMS
   */
  public BigDecimal getR08_VL_BC_ICMS_ST() {
    return r08_VL_BC_ICMS_ST;
  }

  /**
   * Define o 08 VL_BC_ICMS_ST Parcela correspondente ao "Valor da base de cálculo do ICMS" da substituição tributária referente à combinação de CST_ICMS, CFOP e alíquota do ICMS. N - 02 O O.
   *
   * @param r08_VL_BC_ICMS_ST the new 08 VL_BC_ICMS_ST Parcela correspondente ao "Valor da base de cálculo do ICMS" da substituição tributária referente à combinação de CST_ICMS, CFOP e alíquota do ICMS
   */
  public void setR08_VL_BC_ICMS_ST(BigDecimal r08_VL_BC_ICMS_ST) {
    this.r08_VL_BC_ICMS_ST = r08_VL_BC_ICMS_ST;
  }

  /**
   * Recupera o 09 VL_ICMS_ST Parcela correspondente ao valor creditado/debitado do ICMS da substituição tributária, referente à combinação de CST_ICMS, CFOP, e alíquota do ICMS. N - 02 O O.
   *
   * @return the 09 VL_ICMS_ST Parcela correspondente ao valor creditado/debitado do ICMS da substituição tributária, referente à combinação de CST_ICMS, CFOP, e alíquota do ICMS
   */
  public BigDecimal getR09_VL_ICMS_ST() {
    return r09_VL_ICMS_ST;
  }

  /**
   * Define o 09 VL_ICMS_ST Parcela correspondente ao valor creditado/debitado do ICMS da substituição tributária, referente à combinação de CST_ICMS, CFOP, e alíquota do ICMS. N - 02 O O.
   *
   * @param r09_VL_ICMS_ST the new 09 VL_ICMS_ST Parcela correspondente ao valor creditado/debitado do ICMS da substituição tributária, referente à combinação de CST_ICMS, CFOP, e alíquota do ICMS
   */
  public void setR09_VL_ICMS_ST(BigDecimal r09_VL_ICMS_ST) {
    this.r09_VL_ICMS_ST = r09_VL_ICMS_ST;
  }

  /**
   * Recupera o 10 VL_RED_BC Valor não tributado em função da redução da base de cálculo do ICMS, referente à combinação de CST_ICMS, CFOP e alíquota do ICMS. N - 02 O O.
   *
   * @return the 10 VL_RED_BC Valor não tributado em função da redução da base de cálculo do ICMS, referente à combinação de CST_ICMS, CFOP e alíquota do ICMS
   */
  public BigDecimal getR10_VL_RED_BC() {
    return r10_VL_RED_BC;
  }

  /**
   * Define o 10 VL_RED_BC Valor não tributado em função da redução da base de cálculo do ICMS, referente à combinação de CST_ICMS, CFOP e alíquota do ICMS. N - 02 O O.
   *
   * @param r10_VL_RED_BC the new 10 VL_RED_BC Valor não tributado em função da redução da base de cálculo do ICMS, referente à combinação de CST_ICMS, CFOP e alíquota do ICMS
   */
  public void setR10_VL_RED_BC(BigDecimal r10_VL_RED_BC) {
    this.r10_VL_RED_BC = r10_VL_RED_BC;
  }

  /**
   * Recupera o 11 VL_IPI Parcela correspondente ao "Valor do IPI" referente à combinação CST_ICMS, CFOP e alíquota do ICMS.class N - 02 O O.
   *
   * @return the 11 VL_IPI Parcela correspondente ao "Valor do IPI" referente à combinação CST_ICMS, CFOP e alíquota do ICMS
   */
  public BigDecimal getR11_VL_IPI() {
    return r11_VL_IPI;
  }

  /**
   * Define o 11 VL_IPI Parcela correspondente ao "Valor do IPI" referente à combinação CST_ICMS, CFOP e alíquota do ICMS.class N - 02 O O.
   *
   * @param r11_VL_IPI the new 11 VL_IPI Parcela correspondente ao "Valor do IPI" referente à combinação CST_ICMS, CFOP e alíquota do ICMS
   */
  public void setR11_VL_IPI(BigDecimal r11_VL_IPI) {
    this.r11_VL_IPI = r11_VL_IPI;
  }

  /**
   * Recupera o 12 COD_OBS Código da observação do lançamento fiscal (campo 02 do Registro 0460) C 006 - OC OC.
   *
   * @return the 12 COD_OBS Código da observação do lançamento fiscal (campo 02 do Registro 0460) C 006 - OC OC
   */
  public String getR12_COD_OBS() {
    return r12_COD_OBS;
  }

  /**
   * Define o 12 COD_OBS Código da observação do lançamento fiscal (campo 02 do Registro 0460) C 006 - OC OC.
   *
   * @param r12_COD_OBS the new 12 COD_OBS Código da observação do lançamento fiscal (campo 02 do Registro 0460) C 006 - OC OC
   */
  public void setR12_COD_OBS(String r12_COD_OBS) {
    this.r12_COD_OBS = r12_COD_OBS;
  }

}