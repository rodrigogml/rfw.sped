package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C800: CUPOM FISCAL ELETRÔNICO – SAT (CF-E-SAT) (CÓDIGO 59).<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalC800 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscalC800(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * REGISTRO C850: REGISTRO ANALÍTICO DO CF-E-SAT (CODIGO 59)<br>
   * Chave: cst + "|" + ciVO.getCfop() + "|" + taxRatio.
   */
  private final LinkedHashMap<String, SPEDFiscalC850> rc850 = new LinkedHashMap<String, SPEDFiscalC850>();

  /**
   * REGISTRO C855: OBSERVAÇÕES DO LANÇAMENTO FISCAL (CÓDIGO 59)<br>
   * Chave: COD_OBS.
   */
  private final LinkedHashMap<String, SPEDFiscalC855> rc855 = new LinkedHashMap<String, SPEDFiscalC855>();

  /**
   * Código do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002 - O
   */
  @SPEDField(maxLength = 2, minLength = 2, required = true)
  private String r02_COD_MOD = null;

  /**
   * Código da situação do documento fiscal, conforme a Tabela 4.1.2 N 002 - O
   */
  @SPEDField(maxLength = 2, minLength = 2, required = true)
  private String r03_COD_SIT = null;

  /**
   * Número do Cupom Fiscal Eletrônico N 006 - O
   */
  @SPEDField(maxLength = 6, required = true)
  private Long r04_NUM_CFE = null;

  /**
   * Data da emissão do Cupom Fiscal Eletrônico N 008 - O
   */
  @SPEDField(maxLength = 8, minLength = 8, required = false)
  private String r05_DT_DOC = null;

  /**
   * Valor total do Cupom Fiscal Eletrônico N - 02 O
   */
  @SPEDField(decimals = 2, maxLength = 10, required = false)
  private BigDecimal r06_VL_CFE = null;

  /**
   * Valor total do PIS N - 02 OC
   */
  @SPEDField(decimals = 2, maxLength = 10, required = false)
  private BigDecimal r07_VL_PIS = null;

  /**
   * Valor total da COFINS N - 02 OC
   */
  @SPEDField(decimals = 2, maxLength = 10, required = false)
  private BigDecimal r08_VL_COFINS = null;

  /**
   * CNPJ ou CPF do destinatário N 14 - OC
   */
  @SPEDField(maxLength = 14, minLength = 11, required = false)
  private String r09_CNPJ_CPF = null;

  /**
   * Número de Série do equipamento SAT N 009 - O
   */
  @SPEDField(maxLength = 9, required = true)
  private String r10_NR_SAT = null;

  /**
   * Chave do Cupom Fiscal Eletrônico N 044 - O
   */
  @SPEDField(maxLength = 44, minLength = 44, required = true)
  private String r11_CHV_CFE = null;

  /**
   * Valor total de descontos N - 02 O
   */
  @SPEDField(decimals = 2, required = false, maxLength = 10)
  private BigDecimal r12_VL_DESC = null;

  /**
   * Valor total das mercadorias e serviços N - 02 O
   */
  @SPEDField(decimals = 2, maxLength = 10, required = false)
  private BigDecimal r13_VL_MERC = null;

  /**
   * Valor total de outras despesas acessórias e acréscimos N - 02 O
   */
  @SPEDField(decimals = 2, maxLength = 10, required = false)
  private BigDecimal r14_VL_OUT_DA = null;

  /**
   * Valor do ICMS N - 02 O
   */
  @SPEDField(decimals = 2, maxLength = 10, required = false)
  private BigDecimal r15_VL_ICMS = null;

  /**
   * Valor total do PIS retido por subst. trib. N - 02 O
   */
  @SPEDField(decimals = 2, maxLength = 10, required = false)
  private BigDecimal r16_VL_PIS_ST = null;

  /**
   * Valor total da COFINS retido por subst. trib. N - 02 O
   */
  @SPEDField(decimals = 2, required = false, maxLength = 10)
  private BigDecimal r17_VL_COFINS_ST = null;

  @Override
  public String get01_Register() {
    return "C800";
  }

  /**
   * Recupera o código do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002 - O.
   *
   * @return the código do modelo do documento fiscal, conforme a Tabela 4
   */
  public String getR02_COD_MOD() {
    return r02_COD_MOD;
  }

  /**
   * Define o código do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002 - O.
   *
   * @param r02_COD_MOD the new código do modelo do documento fiscal, conforme a Tabela 4
   */
  public void setR02_COD_MOD(String r02_COD_MOD) {
    this.r02_COD_MOD = r02_COD_MOD;
  }

  /**
   * Recupera o código da situação do documento fiscal, conforme a Tabela 4.1.2 N 002 - O.
   *
   * @return the código da situação do documento fiscal, conforme a Tabela 4
   */
  public String getR03_COD_SIT() {
    return r03_COD_SIT;
  }

  /**
   * Define o código da situação do documento fiscal, conforme a Tabela 4.1.2 N 002 - O.
   *
   * @param r03_COD_SIT the new código da situação do documento fiscal, conforme a Tabela 4
   */
  public void setR03_COD_SIT(String r03_COD_SIT) {
    this.r03_COD_SIT = r03_COD_SIT;
  }

  /**
   * Recupera o número do Cupom Fiscal Eletrônico N 006 - O.
   *
   * @return the número do Cupom Fiscal Eletrônico N 006 - O
   */
  public Long getR04_NUM_CFE() {
    return r04_NUM_CFE;
  }

  /**
   * Define o número do Cupom Fiscal Eletrônico N 006 - O.
   *
   * @param r04_NUM_CFE the new número do Cupom Fiscal Eletrônico N 006 - O
   */
  public void setR04_NUM_CFE(Long r04_NUM_CFE) {
    this.r04_NUM_CFE = r04_NUM_CFE;
  }

  /**
   * Recupera o data da emissão do Cupom Fiscal Eletrônico N 008 - O.
   *
   * @return the data da emissão do Cupom Fiscal Eletrônico N 008 - O
   */
  public String getR05_DT_DOC() {
    return r05_DT_DOC;
  }

  /**
   * Define o data da emissão do Cupom Fiscal Eletrônico N 008 - O.
   *
   * @param r05_DT_DOC the new data da emissão do Cupom Fiscal Eletrônico N 008 - O
   */
  public void setR05_DT_DOC(String r05_DT_DOC) {
    this.r05_DT_DOC = r05_DT_DOC;
  }

  /**
   * Recupera o valor total do Cupom Fiscal Eletrônico N - 02 O.
   *
   * @return the valor total do Cupom Fiscal Eletrônico N - 02 O
   */
  public BigDecimal getR06_VL_CFE() {
    return r06_VL_CFE;
  }

  /**
   * Define o valor total do Cupom Fiscal Eletrônico N - 02 O.
   *
   * @param r06_VL_CFE the new valor total do Cupom Fiscal Eletrônico N - 02 O
   */
  public void setR06_VL_CFE(BigDecimal r06_VL_CFE) {
    this.r06_VL_CFE = r06_VL_CFE;
  }

  /**
   * Recupera o valor total do PIS N - 02 OC.
   *
   * @return the valor total do PIS N - 02 OC
   */
  public BigDecimal getR07_VL_PIS() {
    return r07_VL_PIS;
  }

  /**
   * Define o valor total do PIS N - 02 OC.
   *
   * @param r07_VL_PIS the new valor total do PIS N - 02 OC
   */
  public void setR07_VL_PIS(BigDecimal r07_VL_PIS) {
    this.r07_VL_PIS = r07_VL_PIS;
  }

  /**
   * Recupera o valor total da COFINS N - 02 OC.
   *
   * @return the valor total da COFINS N - 02 OC
   */
  public BigDecimal getR08_VL_COFINS() {
    return r08_VL_COFINS;
  }

  /**
   * Define o valor total da COFINS N - 02 OC.
   *
   * @param r08_VL_COFINS the new valor total da COFINS N - 02 OC
   */
  public void setR08_VL_COFINS(BigDecimal r08_VL_COFINS) {
    this.r08_VL_COFINS = r08_VL_COFINS;
  }

  /**
   * Recupera o cNPJ ou CPF do destinatário N 14 - OC.
   *
   * @return the cNPJ ou CPF do destinatário N 14 - OC
   */
  public String getR09_CNPJ_CPF() {
    return r09_CNPJ_CPF;
  }

  /**
   * Define o cNPJ ou CPF do destinatário N 14 - OC.
   *
   * @param r09_CNPJ_CPF the new cNPJ ou CPF do destinatário N 14 - OC
   */
  public void setR09_CNPJ_CPF(String r09_CNPJ_CPF) {
    this.r09_CNPJ_CPF = r09_CNPJ_CPF;
  }

  /**
   * Recupera o número de Série do equipamento SAT N 009 - O.
   *
   * @return the número de Série do equipamento SAT N 009 - O
   */
  public String getR10_NR_SAT() {
    return r10_NR_SAT;
  }

  /**
   * Define o número de Série do equipamento SAT N 009 - O.
   *
   * @param r10_NR_SAT the new número de Série do equipamento SAT N 009 - O
   */
  public void setR10_NR_SAT(String r10_NR_SAT) {
    this.r10_NR_SAT = r10_NR_SAT;
  }

  /**
   * Recupera o chave do Cupom Fiscal Eletrônico N 044 - O.
   *
   * @return the chave do Cupom Fiscal Eletrônico N 044 - O
   */
  public String getR11_CHV_CFE() {
    return r11_CHV_CFE;
  }

  /**
   * Define o chave do Cupom Fiscal Eletrônico N 044 - O.
   *
   * @param r11_CHV_CFE the new chave do Cupom Fiscal Eletrônico N 044 - O
   */
  public void setR11_CHV_CFE(String r11_CHV_CFE) {
    this.r11_CHV_CFE = r11_CHV_CFE;
  }

  /**
   * Recupera o valor total de descontos N - 02 O.
   *
   * @return the valor total de descontos N - 02 O
   */
  public BigDecimal getR12_VL_DESC() {
    return r12_VL_DESC;
  }

  /**
   * Define o valor total de descontos N - 02 O.
   *
   * @param r12_VL_DESC the new valor total de descontos N - 02 O
   */
  public void setR12_VL_DESC(BigDecimal r12_VL_DESC) {
    this.r12_VL_DESC = r12_VL_DESC;
  }

  /**
   * Recupera o valor total das mercadorias e serviços N - 02 O.
   *
   * @return the valor total das mercadorias e serviços N - 02 O
   */
  public BigDecimal getR13_VL_MERC() {
    return r13_VL_MERC;
  }

  /**
   * Define o valor total das mercadorias e serviços N - 02 O.
   *
   * @param r13_VL_MERC the new valor total das mercadorias e serviços N - 02 O
   */
  public void setR13_VL_MERC(BigDecimal r13_VL_MERC) {
    this.r13_VL_MERC = r13_VL_MERC;
  }

  /**
   * Recupera o valor total de outras despesas acessórias e acréscimos N - 02 O.
   *
   * @return the valor total de outras despesas acessórias e acréscimos N - 02 O
   */
  public BigDecimal getR14_VL_OUT_DA() {
    return r14_VL_OUT_DA;
  }

  /**
   * Define o valor total de outras despesas acessórias e acréscimos N - 02 O.
   *
   * @param r14_VL_OUT_DA the new valor total de outras despesas acessórias e acréscimos N - 02 O
   */
  public void setR14_VL_OUT_DA(BigDecimal r14_VL_OUT_DA) {
    this.r14_VL_OUT_DA = r14_VL_OUT_DA;
  }

  /**
   * Recupera o valor do ICMS N - 02 O.
   *
   * @return the valor do ICMS N - 02 O
   */
  public BigDecimal getR15_VL_ICMS() {
    return r15_VL_ICMS;
  }

  /**
   * Define o valor do ICMS N - 02 O.
   *
   * @param r15_VL_ICMS the new valor do ICMS N - 02 O
   */
  public void setR15_VL_ICMS(BigDecimal r15_VL_ICMS) {
    this.r15_VL_ICMS = r15_VL_ICMS;
  }

  /**
   * Recupera o valor total do PIS retido por subst. trib. N - 02 O.
   *
   * @return the valor total do PIS retido por subst
   */
  public BigDecimal getR16_VL_PIS_ST() {
    return r16_VL_PIS_ST;
  }

  /**
   * Define o valor total do PIS retido por subst. trib. N - 02 O.
   *
   * @param r16_VL_PIS_ST the new valor total do PIS retido por subst
   */
  public void setR16_VL_PIS_ST(BigDecimal r16_VL_PIS_ST) {
    this.r16_VL_PIS_ST = r16_VL_PIS_ST;
  }

  /**
   * Recupera o valor total da COFINS retido por subst. trib. N - 02 O.
   *
   * @return the valor total da COFINS retido por subst
   */
  public BigDecimal getR17_VL_COFINS_ST() {
    return r17_VL_COFINS_ST;
  }

  /**
   * Define o valor total da COFINS retido por subst. trib. N - 02 O.
   *
   * @param r17_VL_COFINS_ST the new valor total da COFINS retido por subst
   */
  public void setR17_VL_COFINS_ST(BigDecimal r17_VL_COFINS_ST) {
    this.r17_VL_COFINS_ST = r17_VL_COFINS_ST;
  }

  /**
   * Recupera o c405: REDUÇÃO Z (CÓDIGO 02, 2D e 60)<br>
   * Chave: CRZ.
   *
   * @return the c405: REDUÇÃO Z (CÓDIGO 02, 2D e 60)<br>
   *         Chave: CRZ
   */
  public LinkedHashMap<String, SPEDFiscalC850> getRc850() {
    return rc850;
  }

  /**
   * # rEGISTRO C855: OBSERVAÇÕES DO LANÇAMENTO FISCAL (CÓDIGO 59)<br>
   * Chave: COD_OBS.
   *
   * @return the rEGISTRO C855: OBSERVAÇÕES DO LANÇAMENTO FISCAL (CÓDIGO 59)<br>
   *         Chave: COD_OBS
   */
  public LinkedHashMap<String, SPEDFiscalC855> getRc855() {
    return rc855;
  }

}