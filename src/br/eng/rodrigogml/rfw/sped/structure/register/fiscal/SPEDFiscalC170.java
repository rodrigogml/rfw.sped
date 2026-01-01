package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C170: ITENS DO DOCUMENTO (CÓDIGO 01, 1B, 04 e 55).<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalC170 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscalC170(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 NUM_ITEM Número sequencial do item no documento fiscal N 003 - O O
   */
  @SPEDField(maxLength = 3)
  private Integer r02_NUM_ITEM = null;

  /**
   * 03 COD_ITEM Código do item (campo 02 do Registro 0200) C 060 - O O
   */
  @SPEDField(maxLength = 60)
  private String r03_COD_ITEM = null;

  /**
   * 04 DESCR_COMPL Descrição complementar do item como adotado no documento fiscal C - - OC OC
   */
  @SPEDField(maxLength = 255, required = false)
  private String r04_DESCR_COMPL = null;

  /**
   * 05 QTD Quantidade do item N - 05 O O
   */
  @SPEDField(maxLength = 255, decimals = 5)
  private BigDecimal r05_QTD = null;

  /**
   * 06 UNID Unidade do item (Campo 02 do registro 0190) C 006 - O O
   */
  @SPEDField(maxLength = 6)
  private String r06_UNID = null;

  /**
   * 07 VL_ITEM Valor total do item (mercadorias ou serviços) N - 02 O O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r07_VL_ITEM = null;

  /**
   * 08 VL_DESC Valor do desconto comercial N - 02 OC OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r08_VL_DESC = null;

  /**
   * 09 IND_MOV Movimentação física do ITEM/PRODUTO:<br>
   * 0. SIM<br>
   * 1. NÃO<br>
   * C 001* - O O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r09_IND_MOV = null;

  /**
   * 10 CST_ICMS Código da Situação Tributária referente ao ICMS, conforme a Tabela indicada no item 4.3.1 N 003* - O O
   */
  @SPEDField(maxLength = 3, minLength = 3)
  private String r10_CST_ICMS = null;

  /**
   * 11 CFOP Código Fiscal de Operação e Prestação N 004* - O O
   */
  @SPEDField(maxLength = 4, minLength = 4)
  private String r11_CFOP = null;

  /**
   * 12 COD_NAT Código da natureza da operação (campo 02 do Registro 0400) C 010 - OC OC
   */
  @SPEDField(maxLength = 10, required = false)
  private String r12_COD_NAT = null;

  /**
   * 13 VL_BC_ICMS Valor da base de cálculo do ICMS N - 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   */
  @SPEDField(maxLength = 255, decimals = 2, required = true)
  private BigDecimal r13_VL_BC_ICMS = null;

  /**
   * 14 ALIQ_ICMS Alíquota do ICMS N 006 02 OC OC
   */
  @SPEDField(maxLength = 6, decimals = 2, required = false)
  private BigDecimal r14_ALIQ_ICMS = null;

  /**
   * 15 VL_ICMS Valor do ICMS creditado/debitado N - 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   */
  @SPEDField(maxLength = 255, decimals = 2, required = true)
  private BigDecimal r15_VL_ICMS = null;

  /**
   * 16 VL_BC_ICMS_ST Valor da base de cálculo referente à substituição tributária N - 02 OC OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r16_VL_BC_ICMS_ST = null;

  /**
   * 17 ALIQ_ST Alíquota do ICMS da substituição tributária na unidade da federação de destino N - 02 OC OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r17_ALIQ_ST = null;

  /**
   * 18 VL_ICMS_ST Valor do ICMS referente à substituição tributária N - 02 OC OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r18_VL_ICMS_ST = null;

  /**
   * 19 IND_APUR Indicador de período de apuração do IPI:<br>
   * 0 - Mensal;<br>
   * 1 - Decendial<br>
   * C 001* - OC OC
   */
  @SPEDField(maxLength = 1, minLength = 1, required = false)
  private String r19_IND_APUR = null;

  /**
   * 20 CST_IPI Código da Situação Tributária referente ao IPI, conforme a Tabela indicada no item 4.3.2. C 002* - OC OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private String r20_CST_IPI = null;

  /**
   * 21 COD_ENQ Código de enquadramento legal do IPI, conforme tabela indicada no item 4.5.3. C 003* - OC OC
   */
  @SPEDField(maxLength = 3, minLength = 3, required = false)
  private String r21_COD_ENQ = null;

  /**
   * 22 VL_BC_IPI Valor da base de cálculo do IPI N - 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   */
  @SPEDField(maxLength = 255, decimals = 2, required = true)
  private BigDecimal r22_VL_BC_IPI = null;

  /**
   * 23 ALIQ_IPI Alíquota do IPI N 006 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   */
  @SPEDField(maxLength = 6, decimals = 2, required = true)
  private BigDecimal r23_ALIQ_IPI = null;

  /**
   * 24 VL_IPI Valor do IPI creditado/debitado N - 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   */
  @SPEDField(maxLength = 255, decimals = 2, required = true)
  private BigDecimal r24_VL_IPI = null;

  /**
   * 25 CST_PIS Código da Situação Tributária referente ao PIS. N 002* - OC OC
   */
  @SPEDField(maxLength = 2, minLength = 2, required = false)
  private String r25_CST_PIS = null;

  /**
   * 26 VL_BC_PIS Valor da base de cálculo do PIS N 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   */
  @SPEDField(maxLength = 255, decimals = 2, required = true)
  private BigDecimal r26_VL_BC_PIS = null;

  /**
   * 27 ALIQ_PIS Alíquota do PIS (em percentual) N 008 04 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   */
  @SPEDField(maxLength = 8, decimals = 4, required = true)
  private BigDecimal r27_ALIQ_PIS = null;

  /**
   * 28 QUANT_BC_PIS Quantidade – Base de cálculo PIS N 03 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   */
  @SPEDField(maxLength = 255, decimals = 3, required = false)
  private BigDecimal r28_QUANT_BC_PIS = null;

  /**
   * 29 ALIQ_PIS Alíquota do PIS (em reais) N 04 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r29_ALIQ_PIS = null;

  /**
   * 30 VL_PIS Valor do PIS N - 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   */
  @SPEDField(maxLength = 255, decimals = 2, required = true)
  private BigDecimal r30_VL_PIS = null;

  /**
   * 31 CST_COFINS Código da Situação Tributária referente ao COFINS. N 002* - OC OC
   */
  @SPEDField(maxLength = 2, minLength = 2, required = false)
  private String r31_CST_COFINS = null;

  /**
   * 32 VL_BC_COFINS Valor da base de cálculo da COFINS N 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   */
  @SPEDField(maxLength = 255, decimals = 2, required = true)
  private BigDecimal r32_VL_BC_COFINS = null;

  /**
   * 33 ALIQ_COFINS Alíquota do COFINS (em percentual) N 008 04 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   */
  @SPEDField(maxLength = 255, decimals = 2, required = true)
  private BigDecimal r33_ALIQ_COFINS = null;

  /**
   * 34 QUANT_BC_COFINS Quantidade – Base de cálculo COFINS N 03 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   */
  @SPEDField(maxLength = 255, decimals = 3, required = false)
  private BigDecimal r34_QUANT_BC_COFINS = null;

  /**
   * 35 ALIQ_COFINS Alíquota da COFINS (em reais) N 04 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   */
  @SPEDField(maxLength = 255, decimals = 4, required = false)
  private BigDecimal r35_ALIQ_COFINS = null;

  /**
   * 36 VL_COFINS Valor da COFINS N - 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   */
  @SPEDField(maxLength = 255, decimals = 2, required = true)
  private BigDecimal r36_VL_COFINS = null;

  /**
   * 37 COD_CTA Código da conta analítica contábil debitada/creditada C - - OC OC
   */
  @SPEDField(maxLength = 255, required = false)
  private String r37_COD_CTA = null;

  /**
   * 38 VL_ABAT_NT Valor do abatimento não tributado e não comercial N - 02 OC OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = true)
  private BigDecimal r38_VL_ABAT_NT = null;

  @Override
  public String get01_Register() {
    return "C170";
  }

  /**
   * Recupera o 10 CST_ICMS Código da Situação Tributária referente ao ICMS, conforme a Tabela indicada no item 4.3.1 N 003* - O O.
   *
   * @return the 10 CST_ICMS Código da Situação Tributária referente ao ICMS, conforme a Tabela indicada no item 4
   */
  public String getR10_CST_ICMS() {
    return r10_CST_ICMS;
  }

  /**
   * Define o 10 CST_ICMS Código da Situação Tributária referente ao ICMS, conforme a Tabela indicada no item 4.3.1 N 003* - O O.
   *
   * @param r10_CST_ICMS the new 10 CST_ICMS Código da Situação Tributária referente ao ICMS, conforme a Tabela indicada no item 4
   */
  public void setR10_CST_ICMS(String r10_CST_ICMS) {
    this.r10_CST_ICMS = r10_CST_ICMS;
  }

  /**
   * Recupera o 11 CFOP Código Fiscal de Operação e Prestação N 004* - O O.
   *
   * @return the 11 CFOP Código Fiscal de Operação e Prestação N 004* - O O
   */
  public String getR11_CFOP() {
    return r11_CFOP;
  }

  /**
   * Define o 11 CFOP Código Fiscal de Operação e Prestação N 004* - O O.
   *
   * @param r11_CFOP the new 11 CFOP Código Fiscal de Operação e Prestação N 004* - O O
   */
  public void setR11_CFOP(String r11_CFOP) {
    this.r11_CFOP = r11_CFOP;
  }

  /**
   * Recupera o 12 COD_NAT Código da natureza da operação (campo 02 do Registro 0400) C 010 - OC OC.
   *
   * @return the 12 COD_NAT Código da natureza da operação (campo 02 do Registro 0400) C 010 - OC OC
   */
  public String getR12_COD_NAT() {
    return r12_COD_NAT;
  }

  /**
   * Define o 12 COD_NAT Código da natureza da operação (campo 02 do Registro 0400) C 010 - OC OC.
   *
   * @param r12_COD_NAT the new 12 COD_NAT Código da natureza da operação (campo 02 do Registro 0400) C 010 - OC OC
   */
  public void setR12_COD_NAT(String r12_COD_NAT) {
    this.r12_COD_NAT = r12_COD_NAT;
  }

  /**
   * Recupera o 13 VL_BC_ICMS Valor da base de cálculo do ICMS N - 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @return the 13 VL_BC_ICMS Valor da base de cálculo do ICMS N - 02 OC OC<br>
   *         Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public BigDecimal getR13_VL_BC_ICMS() {
    return r13_VL_BC_ICMS;
  }

  /**
   * Define o 13 VL_BC_ICMS Valor da base de cálculo do ICMS N - 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @param r13_VL_BC_ICMS the new 13 VL_BC_ICMS Valor da base de cálculo do ICMS N - 02 OC OC<br>
   *          Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public void setR13_VL_BC_ICMS(BigDecimal r13_VL_BC_ICMS) {
    this.r13_VL_BC_ICMS = r13_VL_BC_ICMS;
  }

  /**
   * Recupera o 02 NUM_ITEM Número sequencial do item no documento fiscal N 003 - O O.
   *
   * @return the 02 NUM_ITEM Número sequencial do item no documento fiscal N 003 - O O
   */
  public Integer getR02_NUM_ITEM() {
    return r02_NUM_ITEM;
  }

  /**
   * Recupera o 03 COD_ITEM Código do item (campo 02 do Registro 0200) C 060 - O O.
   *
   * @return the 03 COD_ITEM Código do item (campo 02 do Registro 0200) C 060 - O O
   */
  public String getR03_COD_ITEM() {
    return r03_COD_ITEM;
  }

  /**
   * Recupera o 04 DESCR_COMPL Descrição complementar do item como adotado no documento fiscal C - - OC OC.
   *
   * @return the 04 DESCR_COMPL Descrição complementar do item como adotado no documento fiscal C - - OC OC
   */
  public String getR04_DESCR_COMPL() {
    return r04_DESCR_COMPL;
  }

  /**
   * Recupera o 05 QTD Quantidade do item N - 05 O O.
   *
   * @return the 05 QTD Quantidade do item N - 05 O O
   */
  public BigDecimal getR05_QTD() {
    return r05_QTD;
  }

  /**
   * Recupera o 06 UNID Unidade do item (Campo 02 do registro 0190) C 006 - O O.
   *
   * @return the 06 UNID Unidade do item (Campo 02 do registro 0190) C 006 - O O
   */
  public String getR06_UNID() {
    return r06_UNID;
  }

  /**
   * Recupera o 07 VL_ITEM Valor total do item (mercadorias ou serviços) N - 02 O O.
   *
   * @return the 07 VL_ITEM Valor total do item (mercadorias ou serviços) N - 02 O O
   */
  public BigDecimal getR07_VL_ITEM() {
    return r07_VL_ITEM;
  }

  /**
   * Recupera o 08 VL_DESC Valor do desconto comercial N - 02 OC OC.
   *
   * @return the 08 VL_DESC Valor do desconto comercial N - 02 OC OC
   */
  public BigDecimal getR08_VL_DESC() {
    return r08_VL_DESC;
  }

  /**
   * Recupera o 09 IND_MOV Movimentação física do ITEM/PRODUTO:<br>
   * 0. SIM<br>
   * 1. NÃO<br>
   * C 001* - O O.
   *
   * @return the 09 IND_MOV Movimentação física do ITEM/PRODUTO:<br>
   *         0
   */
  public String getR09_IND_MOV() {
    return r09_IND_MOV;
  }

  /**
   * Recupera o 14 ALIQ_ICMS Alíquota do ICMS N 006 02 OC OC.
   *
   * @return the 14 ALIQ_ICMS Alíquota do ICMS N 006 02 OC OC
   */
  public BigDecimal getR14_ALIQ_ICMS() {
    return r14_ALIQ_ICMS;
  }

  /**
   * Define o 14 ALIQ_ICMS Alíquota do ICMS N 006 02 OC OC.
   *
   * @param r14_ALIQ_ICMS the new 14 ALIQ_ICMS Alíquota do ICMS N 006 02 OC OC
   */
  public void setR14_ALIQ_ICMS(BigDecimal r14_ALIQ_ICMS) {
    this.r14_ALIQ_ICMS = r14_ALIQ_ICMS;
  }

  /**
   * Recupera o 16 VL_BC_ICMS_ST Valor da base de cálculo referente à substituição tributária N - 02 OC OC.
   *
   * @return the 16 VL_BC_ICMS_ST Valor da base de cálculo referente à substituição tributária N - 02 OC OC
   */
  public BigDecimal getR16_VL_BC_ICMS_ST() {
    return r16_VL_BC_ICMS_ST;
  }

  /**
   * Define o 16 VL_BC_ICMS_ST Valor da base de cálculo referente à substituição tributária N - 02 OC OC.
   *
   * @param r16_VL_BC_ICMS_ST the new 16 VL_BC_ICMS_ST Valor da base de cálculo referente à substituição tributária N - 02 OC OC
   */
  public void setR16_VL_BC_ICMS_ST(BigDecimal r16_VL_BC_ICMS_ST) {
    this.r16_VL_BC_ICMS_ST = r16_VL_BC_ICMS_ST;
  }

  /**
   * Recupera o 17 ALIQ_ST Alíquota do ICMS da substituição tributária na unidade da federação de destino N - 02 OC OC.
   *
   * @return the 17 ALIQ_ST Alíquota do ICMS da substituição tributária na unidade da federação de destino N - 02 OC OC
   */
  public BigDecimal getR17_ALIQ_ST() {
    return r17_ALIQ_ST;
  }

  /**
   * Define o 17 ALIQ_ST Alíquota do ICMS da substituição tributária na unidade da federação de destino N - 02 OC OC.
   *
   * @param r17_ALIQ_ST the new 17 ALIQ_ST Alíquota do ICMS da substituição tributária na unidade da federação de destino N - 02 OC OC
   */
  public void setR17_ALIQ_ST(BigDecimal r17_ALIQ_ST) {
    this.r17_ALIQ_ST = r17_ALIQ_ST;
  }

  /**
   * Recupera o 18 VL_ICMS_ST Valor do ICMS referente à substituição tributária N - 02 OC OC.
   *
   * @return the 18 VL_ICMS_ST Valor do ICMS referente à substituição tributária N - 02 OC OC
   */
  public BigDecimal getR18_VL_ICMS_ST() {
    return r18_VL_ICMS_ST;
  }

  /**
   * Define o 18 VL_ICMS_ST Valor do ICMS referente à substituição tributária N - 02 OC OC.
   *
   * @param r18_VL_ICMS_ST the new 18 VL_ICMS_ST Valor do ICMS referente à substituição tributária N - 02 OC OC
   */
  public void setR18_VL_ICMS_ST(BigDecimal r18_VL_ICMS_ST) {
    this.r18_VL_ICMS_ST = r18_VL_ICMS_ST;
  }

  /**
   * Recupera o 19 IND_APUR Indicador de período de apuração do IPI:<br>
   * 0 - Mensal;<br>
   * 1 - Decendial<br>
   * C 001* - OC OC.
   *
   * @return the 19 IND_APUR Indicador de período de apuração do IPI:<br>
   *         0 - Mensal;<br>
   *         1 - Decendial<br>
   *         C 001* - OC OC
   */
  public String getR19_IND_APUR() {
    return r19_IND_APUR;
  }

  /**
   * Define o 19 IND_APUR Indicador de período de apuração do IPI:<br>
   * 0 - Mensal;<br>
   * 1 - Decendial<br>
   * C 001* - OC OC.
   *
   * @param r19_IND_APUR the new 19 IND_APUR Indicador de período de apuração do IPI:<br>
   *          0 - Mensal;<br>
   *          1 - Decendial<br>
   *          C 001* - OC OC
   */
  public void setR19_IND_APUR(String r19_IND_APUR) {
    this.r19_IND_APUR = r19_IND_APUR;
  }

  /**
   * Recupera o 20 CST_IPI Código da Situação Tributária referente ao IPI, conforme a Tabela indicada no item 4.3.2. C 002* - OC OC.
   *
   * @return the 20 CST_IPI Código da Situação Tributária referente ao IPI, conforme a Tabela indicada no item 4
   */
  public String getR20_CST_IPI() {
    return r20_CST_IPI;
  }

  /**
   * Define o 20 CST_IPI Código da Situação Tributária referente ao IPI, conforme a Tabela indicada no item 4.3.2. C 002* - OC OC.
   *
   * @param r20_CST_IPI the new 20 CST_IPI Código da Situação Tributária referente ao IPI, conforme a Tabela indicada no item 4
   */
  public void setR20_CST_IPI(String r20_CST_IPI) {
    this.r20_CST_IPI = r20_CST_IPI;
  }

  /**
   * Recupera o 21 COD_ENQ Código de enquadramento legal do IPI, conforme tabela indicada no item 4.5.3. C 003* - OC OC.
   *
   * @return the 21 COD_ENQ Código de enquadramento legal do IPI, conforme tabela indicada no item 4
   */
  public String getR21_COD_ENQ() {
    return r21_COD_ENQ;
  }

  /**
   * Define o 21 COD_ENQ Código de enquadramento legal do IPI, conforme tabela indicada no item 4.5.3. C 003* - OC OC.
   *
   * @param r21_COD_ENQ the new 21 COD_ENQ Código de enquadramento legal do IPI, conforme tabela indicada no item 4
   */
  public void setR21_COD_ENQ(String r21_COD_ENQ) {
    this.r21_COD_ENQ = r21_COD_ENQ;
  }

  /**
   * Recupera o 22 VL_BC_IPI Valor da base de cálculo do IPI N - 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @return the 22 VL_BC_IPI Valor da base de cálculo do IPI N - 02 OC OC<br>
   *         Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public BigDecimal getR22_VL_BC_IPI() {
    return r22_VL_BC_IPI;
  }

  /**
   * Define o 22 VL_BC_IPI Valor da base de cálculo do IPI N - 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @param r22_VL_BC_IPI the new 22 VL_BC_IPI Valor da base de cálculo do IPI N - 02 OC OC<br>
   *          Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public void setR22_VL_BC_IPI(BigDecimal r22_VL_BC_IPI) {
    this.r22_VL_BC_IPI = r22_VL_BC_IPI;
  }

  /**
   * Recupera o 23 ALIQ_IPI Alíquota do IPI N 006 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @return the 23 ALIQ_IPI Alíquota do IPI N 006 02 OC OC<br>
   *         Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public BigDecimal getR23_ALIQ_IPI() {
    return r23_ALIQ_IPI;
  }

  /**
   * Define o 23 ALIQ_IPI Alíquota do IPI N 006 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @param r23_ALIQ_IPI the new 23 ALIQ_IPI Alíquota do IPI N 006 02 OC OC<br>
   *          Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public void setR23_ALIQ_IPI(BigDecimal r23_ALIQ_IPI) {
    this.r23_ALIQ_IPI = r23_ALIQ_IPI;
  }

  /**
   * Recupera o 15 VL_ICMS Valor do ICMS creditado/debitado N - 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @return the 15 VL_ICMS Valor do ICMS creditado/debitado N - 02 OC OC<br>
   *         Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public BigDecimal getR15_VL_ICMS() {
    return r15_VL_ICMS;
  }

  /**
   * Define o 15 VL_ICMS Valor do ICMS creditado/debitado N - 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @param r15_VL_ICMS the new 15 VL_ICMS Valor do ICMS creditado/debitado N - 02 OC OC<br>
   *          Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public void setR15_VL_ICMS(BigDecimal r15_VL_ICMS) {
    this.r15_VL_ICMS = r15_VL_ICMS;
  }

  /**
   * Recupera o 24 VL_IPI Valor do IPI creditado/debitado N - 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @return the 24 VL_IPI Valor do IPI creditado/debitado N - 02 OC OC<br>
   *         Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public BigDecimal getR24_VL_IPI() {
    return r24_VL_IPI;
  }

  /**
   * Define o 24 VL_IPI Valor do IPI creditado/debitado N - 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @param r24_VL_IPI the new 24 VL_IPI Valor do IPI creditado/debitado N - 02 OC OC<br>
   *          Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public void setR24_VL_IPI(BigDecimal r24_VL_IPI) {
    this.r24_VL_IPI = r24_VL_IPI;
  }

  /**
   * Recupera o 25 CST_PIS Código da Situação Tributária referente ao PIS. N 002* - OC OC.
   *
   * @return the 25 CST_PIS Código da Situação Tributária referente ao PIS
   */
  public String getR25_CST_PIS() {
    return r25_CST_PIS;
  }

  /**
   * Define o 25 CST_PIS Código da Situação Tributária referente ao PIS. N 002* - OC OC.
   *
   * @param r25_CST_PIS the new 25 CST_PIS Código da Situação Tributária referente ao PIS
   */
  public void setR25_CST_PIS(String r25_CST_PIS) {
    this.r25_CST_PIS = r25_CST_PIS;
  }

  /**
   * Recupera o 26 VL_BC_PIS Valor da base de cálculo do PIS N 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @return the 26 VL_BC_PIS Valor da base de cálculo do PIS N 02 OC OC<br>
   *         Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public BigDecimal getR26_VL_BC_PIS() {
    return r26_VL_BC_PIS;
  }

  /**
   * Define o 26 VL_BC_PIS Valor da base de cálculo do PIS N 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @param r26_VL_BC_PIS the new 26 VL_BC_PIS Valor da base de cálculo do PIS N 02 OC OC<br>
   *          Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public void setR26_VL_BC_PIS(BigDecimal r26_VL_BC_PIS) {
    this.r26_VL_BC_PIS = r26_VL_BC_PIS;
  }

  /**
   * Recupera o 27 ALIQ_PIS Alíquota do PIS (em percentual) N 008 04 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @return the 27 ALIQ_PIS Alíquota do PIS (em percentual) N 008 04 OC OC<br>
   *         Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public BigDecimal getR27_ALIQ_PIS() {
    return r27_ALIQ_PIS;
  }

  /**
   * Define o 27 ALIQ_PIS Alíquota do PIS (em percentual) N 008 04 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @param r27_ALIQ_PIS the new 27 ALIQ_PIS Alíquota do PIS (em percentual) N 008 04 OC OC<br>
   *          Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public void setR27_ALIQ_PIS(BigDecimal r27_ALIQ_PIS) {
    this.r27_ALIQ_PIS = r27_ALIQ_PIS;
  }

  /**
   * Recupera o 30 VL_PIS Valor do PIS N - 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @return the 30 VL_PIS Valor do PIS N - 02 OC OC<br>
   *         Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public BigDecimal getR30_VL_PIS() {
    return r30_VL_PIS;
  }

  /**
   * Define o 30 VL_PIS Valor do PIS N - 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @param r30_VL_PIS the new 30 VL_PIS Valor do PIS N - 02 OC OC<br>
   *          Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public void setR30_VL_PIS(BigDecimal r30_VL_PIS) {
    this.r30_VL_PIS = r30_VL_PIS;
  }

  /**
   * Recupera o 31 CST_COFINS Código da Situação Tributária referente ao COFINS. N 002* - OC OC.
   *
   * @return the 31 CST_COFINS Código da Situação Tributária referente ao COFINS
   */
  public String getR31_CST_COFINS() {
    return r31_CST_COFINS;
  }

  /**
   * Define o 31 CST_COFINS Código da Situação Tributária referente ao COFINS. N 002* - OC OC.
   *
   * @param r31_CST_COFINS the new 31 CST_COFINS Código da Situação Tributária referente ao COFINS
   */
  public void setR31_CST_COFINS(String r31_CST_COFINS) {
    this.r31_CST_COFINS = r31_CST_COFINS;
  }

  /**
   * Recupera o 32 VL_BC_COFINS Valor da base de cálculo da COFINS N 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @return the 32 VL_BC_COFINS Valor da base de cálculo da COFINS N 02 OC OC<br>
   *         Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public BigDecimal getR32_VL_BC_COFINS() {
    return r32_VL_BC_COFINS;
  }

  /**
   * Define o 32 VL_BC_COFINS Valor da base de cálculo da COFINS N 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @param r32_VL_BC_COFINS the new 32 VL_BC_COFINS Valor da base de cálculo da COFINS N 02 OC OC<br>
   *          Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public void setR32_VL_BC_COFINS(BigDecimal r32_VL_BC_COFINS) {
    this.r32_VL_BC_COFINS = r32_VL_BC_COFINS;
  }

  /**
   * Recupera o 33 ALIQ_COFINS Alíquota do COFINS (em percentual) N 008 04 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @return the 33 ALIQ_COFINS Alíquota do COFINS (em percentual) N 008 04 OC OC<br>
   *         Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public BigDecimal getR33_ALIQ_COFINS() {
    return r33_ALIQ_COFINS;
  }

  /**
   * Define o 33 ALIQ_COFINS Alíquota do COFINS (em percentual) N 008 04 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @param r33_ALIQ_COFINS the new 33 ALIQ_COFINS Alíquota do COFINS (em percentual) N 008 04 OC OC<br>
   *          Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public void setR33_ALIQ_COFINS(BigDecimal r33_ALIQ_COFINS) {
    this.r33_ALIQ_COFINS = r33_ALIQ_COFINS;
  }

  /**
   * Recupera o 34 QUANT_BC_COFINS Quantidade – Base de cálculo COFINS N 03 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @return the 34 QUANT_BC_COFINS Quantidade – Base de cálculo COFINS N 03 OC OC<br>
   *         Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public BigDecimal getR34_QUANT_BC_COFINS() {
    return r34_QUANT_BC_COFINS;
  }

  /**
   * Define o 34 QUANT_BC_COFINS Quantidade – Base de cálculo COFINS N 03 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @param r34_QUANT_BC_COFINS the new 34 QUANT_BC_COFINS Quantidade – Base de cálculo COFINS N 03 OC OC<br>
   *          Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public void setR34_QUANT_BC_COFINS(BigDecimal r34_QUANT_BC_COFINS) {
    this.r34_QUANT_BC_COFINS = r34_QUANT_BC_COFINS;
  }

  /**
   * Recupera o 35 ALIQ_COFINS Alíquota da COFINS (em reais) N 04 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @return the 35 ALIQ_COFINS Alíquota da COFINS (em reais) N 04 OC OC<br>
   *         Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public BigDecimal getR35_ALIQ_COFINS() {
    return r35_ALIQ_COFINS;
  }

  /**
   * Define o 35 ALIQ_COFINS Alíquota da COFINS (em reais) N 04 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @param r35_ALIQ_COFINS the new 35 ALIQ_COFINS Alíquota da COFINS (em reais) N 04 OC OC<br>
   *          Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public void setR35_ALIQ_COFINS(BigDecimal r35_ALIQ_COFINS) {
    this.r35_ALIQ_COFINS = r35_ALIQ_COFINS;
  }

  /**
   * Recupera o 36 VL_COFINS Valor da COFINS N - 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @return the 36 VL_COFINS Valor da COFINS N - 02 OC OC<br>
   *         Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public BigDecimal getR36_VL_COFINS() {
    return r36_VL_COFINS;
  }

  /**
   * Define o 36 VL_COFINS Valor da COFINS N - 02 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @param r36_VL_COFINS the new 36 VL_COFINS Valor da COFINS N - 02 OC OC<br>
   *          Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public void setR36_VL_COFINS(BigDecimal r36_VL_COFINS) {
    this.r36_VL_COFINS = r36_VL_COFINS;
  }

  /**
   * Recupera o 37 COD_CTA Código da conta analítica contábil debitada/creditada C - - OC OC.
   *
   * @return the 37 COD_CTA Código da conta analítica contábil debitada/creditada C - - OC OC
   */
  public String getR37_COD_CTA() {
    return r37_COD_CTA;
  }

  /**
   * Define o 37 COD_CTA Código da conta analítica contábil debitada/creditada C - - OC OC.
   *
   * @param r37_COD_CTA the new 37 COD_CTA Código da conta analítica contábil debitada/creditada C - - OC OC
   */
  public void setR37_COD_CTA(String r37_COD_CTA) {
    this.r37_COD_CTA = r37_COD_CTA;
  }

  /**
   * Define o 02 NUM_ITEM Número sequencial do item no documento fiscal N 003 - O O.
   *
   * @param r02_NUM_ITEM the new 02 NUM_ITEM Número sequencial do item no documento fiscal N 003 - O O
   */
  public void setR02_NUM_ITEM(Integer r02_NUM_ITEM) {
    this.r02_NUM_ITEM = r02_NUM_ITEM;
  }

  /**
   * Define o 03 COD_ITEM Código do item (campo 02 do Registro 0200) C 060 - O O.
   *
   * @param r03_COD_ITEM the new 03 COD_ITEM Código do item (campo 02 do Registro 0200) C 060 - O O
   */
  public void setR03_COD_ITEM(String r03_COD_ITEM) {
    this.r03_COD_ITEM = r03_COD_ITEM;
  }

  /**
   * Define o 04 DESCR_COMPL Descrição complementar do item como adotado no documento fiscal C - - OC OC.
   *
   * @param r04_DESCR_COMPL the new 04 DESCR_COMPL Descrição complementar do item como adotado no documento fiscal C - - OC OC
   */
  public void setR04_DESCR_COMPL(String r04_DESCR_COMPL) {
    this.r04_DESCR_COMPL = r04_DESCR_COMPL;
  }

  /**
   * Define o 05 QTD Quantidade do item N - 05 O O.
   *
   * @param r05_QTD the new 05 QTD Quantidade do item N - 05 O O
   */
  public void setR05_QTD(BigDecimal r05_QTD) {
    this.r05_QTD = r05_QTD;
  }

  /**
   * Define o 06 UNID Unidade do item (Campo 02 do registro 0190) C 006 - O O.
   *
   * @param r06_UNID the new 06 UNID Unidade do item (Campo 02 do registro 0190) C 006 - O O
   */
  public void setR06_UNID(String r06_UNID) {
    this.r06_UNID = r06_UNID;
  }

  /**
   * Define o 07 VL_ITEM Valor total do item (mercadorias ou serviços) N - 02 O O.
   *
   * @param r07_VL_ITEM the new 07 VL_ITEM Valor total do item (mercadorias ou serviços) N - 02 O O
   */
  public void setR07_VL_ITEM(BigDecimal r07_VL_ITEM) {
    this.r07_VL_ITEM = r07_VL_ITEM;
  }

  /**
   * Define o 08 VL_DESC Valor do desconto comercial N - 02 OC OC.
   *
   * @param r08_VL_DESC the new 08 VL_DESC Valor do desconto comercial N - 02 OC OC
   */
  public void setR08_VL_DESC(BigDecimal r08_VL_DESC) {
    this.r08_VL_DESC = r08_VL_DESC;
  }

  /**
   * Define o 09 IND_MOV Movimentação física do ITEM/PRODUTO:<br>
   * 0. SIM<br>
   * 1. NÃO<br>
   * C 001* - O O.
   *
   * @param r09_IND_MOV the new 09 IND_MOV Movimentação física do ITEM/PRODUTO:<br>
   *          0
   */
  public void setR09_IND_MOV(String r09_IND_MOV) {
    this.r09_IND_MOV = r09_IND_MOV;
  }

  /**
   * Recupera o 28 QUANT_BC_PIS Quantidade – Base de cálculo PIS N 03 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @return the 28 QUANT_BC_PIS Quantidade – Base de cálculo PIS N 03 OC OC<br>
   *         Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public BigDecimal getR28_QUANT_BC_PIS() {
    return r28_QUANT_BC_PIS;
  }

  /**
   * Define o 28 QUANT_BC_PIS Quantidade – Base de cálculo PIS N 03 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @param r28_QUANT_BC_PIS the new 28 QUANT_BC_PIS Quantidade – Base de cálculo PIS N 03 OC OC<br>
   *          Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public void setR28_QUANT_BC_PIS(BigDecimal r28_QUANT_BC_PIS) {
    this.r28_QUANT_BC_PIS = r28_QUANT_BC_PIS;
  }

  /**
   * Recupera o 29 ALIQ_PIS Alíquota do PIS (em reais) N 04 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @return the 29 ALIQ_PIS Alíquota do PIS (em reais) N 04 OC OC<br>
   *         Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public BigDecimal getR29_ALIQ_PIS() {
    return r29_ALIQ_PIS;
  }

  /**
   * Define o 29 ALIQ_PIS Alíquota do PIS (em reais) N 04 OC OC<br>
   * Objeto obrigatório, segundo o Israel é obrigatório no estado de SP.
   *
   * @param r29_ALIQ_PIS the new 29 ALIQ_PIS Alíquota do PIS (em reais) N 04 OC OC<br>
   *          Objeto obrigatório, segundo o Israel é obrigatório no estado de SP
   */
  public void setR29_ALIQ_PIS(BigDecimal r29_ALIQ_PIS) {
    this.r29_ALIQ_PIS = r29_ALIQ_PIS;
  }

  /**
   * # 38 VL_ABAT_NT Valor do abatimento não tributado e não comercial N - 02 OC OC.
   *
   * @return 38 VL_ABAT_NT Valor do abatimento não tributado e não comercial N - 02 OC OC
   */
  public BigDecimal getR38_VL_ABAT_NT() {
    return r38_VL_ABAT_NT;
  }

  /**
   * # 38 VL_ABAT_NT Valor do abatimento não tributado e não comercial N - 02 OC OC.
   *
   * @param r38_VL_ABAT_NT 38 VL_ABAT_NT Valor do abatimento não tributado e não comercial N - 02 OC OC
   */
  public void setR38_VL_ABAT_NT(BigDecimal r38_VL_ABAT_NT) {
    this.r38_VL_ABAT_NT = r38_VL_ABAT_NT;
  }

}