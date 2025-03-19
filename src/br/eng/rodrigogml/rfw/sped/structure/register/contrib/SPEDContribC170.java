package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C170: COMPLEMENTO DO DOCUMENTO - ITENS DO DOCUMENTO (C�DIGOS 01, 1B, 04 e 55).<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribC170 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * Salva refer�ncia para o registro pai.
   */
  private final SPEDContribC100 parent;

  public SPEDContribC170(SPEDFile spedFile, SPEDContribC100 parent) {
    super(spedFile);
    this.parent = parent;
  }

  /**
   * N�mero seq�encial do item no documento fiscal N 003 - S
   */
  @SPEDField(maxLength = 3, required = true)
  private Integer r02_NUM_ITEM = null;

  /**
   * C�digo do item (campo 02 do Registro 0200) C 060 - S
   */
  @SPEDField(maxLength = 60, required = true)
  private String r03_COD_ITEM = null;

  /**
   * Descri��o complementar do item como adotado no documento fiscal C - - N
   */
  @SPEDField(maxLength = 255, required = false)
  private String r04_DESCR_COMPL = null;

  /**
   * Quantidade do item N - 05 N
   */
  @SPEDField(decimals = 5, maxLength = 20, required = false)
  private BigDecimal r05_QTD = null;

  /**
   * Unidade do item (Campo 02 do registro 0190) C 006 - N
   */
  @SPEDField(maxLength = 6, required = false)
  private String r06_UNID = null;

  /**
   * Valor total do item (mercadorias ou servi�os) N - 02 S
   */
  @SPEDField(decimals = 2, maxLength = 20, required = true)
  private BigDecimal r07_VL_ITEM = null;

  /**
   * Valor do desconto comercial N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = false)
  private BigDecimal r08_VL_DESC = null;

  /**
   * Movimenta��o f�sica do ITEM/PRODUTO:
   * <li>0. SIM
   * <li>1. N�O<br>
   * C 001 - N
   */
  @SPEDField(maxLength = 1, minLength = 1, required = false)
  private String r09_IND_MOV = null;

  /**
   * C�digo da Situa��o Tribut�ria referente ao ICMS, conforme a Tabela indicada no item 4.3.1 N 003* - N
   */
  @SPEDField(maxLength = 3, minLength = 3, required = false)
  private String r10_CST_ICMS = null;

  /**
   * C�digo Fiscal de Opera��o e Presta��o N 004* - S
   */
  @SPEDField(maxLength = 4, minLength = 4, required = true)
  private String r11_CFOP = null;

  /**
   * C�digo da natureza da opera��o (campo 02 do Registro 0400) C 010 - N
   */
  @SPEDField(maxLength = 10, required = false)
  private String r12_COD_NAT = null;

  /**
   * Valor da base de c�lculo do ICMS N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = false)
  private BigDecimal r13_VL_BC_ICMS = null;

  /**
   * Al�quota do ICMS N 006 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = true)
  private BigDecimal r14_ALIQ_ICMS = null;

  /**
   * Valor do ICMS creditado/debitado N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = false)
  private BigDecimal r15_VL_ICMS = null;

  /**
   * Valor da base de c�lculo referente � substitui��o tribut�ria N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = false)
  private BigDecimal r16_VL_BC_ICMS_ST = null;

  /**
   * Al�quota do ICMS da substitui��o tribut�ria na unidade da federa��o de destino N 006 02 N
   */
  @SPEDField(decimals = 2, maxLength = 6, required = false)
  private BigDecimal r17_ALIQ_ST = null;

  /**
   * Valor do ICMS referente � substitui��o tribut�ria N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = false)
  private BigDecimal r18_VL_ICMS_ST = null;

  /**
   * Indicador de per�odo de apura��o do IPI:
   * <li>0 - Mensal;
   * <li>1 Decendial<br>
   * C 001* - N
   */
  @SPEDField(maxLength = 1, minLength = 1, required = false)
  private String r19_IND_APUR = null;

  /**
   * C�digo da Situa��o Tribut�ria referente ao IPI, conforme a Tabela indicada no item 4.3.2. C 002* - N
   */
  @SPEDField(maxLength = 2, minLength = 2, required = false)
  private String r20_CST_IPI = null;

  /**
   * C�digo de enquadramento legal do IPI, conforme tabela indicada no item 4.5.3. C 003* - N
   */
  @SPEDField(maxLength = 3, minLength = 3, required = false)
  private String r21_COD_ENQ = null;

  /**
   * Valor da base de c�lculo do IPI N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = false)
  private BigDecimal r22_VL_BC_IPI = null;

  /**
   * Al�quota do IPI N 006 02 N
   */
  @SPEDField(decimals = 2, maxLength = 6, required = false)
  private BigDecimal r23_ALIQ_IPI = null;

  /**
   * Valor do IPI creditado/debitado N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = false)
  private BigDecimal r24_VL_IPI = null;

  /**
   * C�digo da Situa��o Tribut�ria referente ao PIS. N 002* - S
   */
  @SPEDField(maxLength = 2, minLength = 2, required = true)
  private String r25_CST_PIS = null;

  /**
   * Valor da base de c�lculo do PIS N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = false)
  private BigDecimal r26_VL_BC_PIS = null;

  /**
   * Al�quota do PIS (em percentual) N 008 04 N
   */
  @SPEDField(decimals = 4, maxLength = 8, required = false)
  private BigDecimal r27_ALIQ_PIS = null;

  /**
   * Quantidade � Base de c�lculo PIS/PASEP N - 03 N
   */
  @SPEDField(decimals = 3, maxLength = 20, required = false)
  private BigDecimal r28_QUANT_BC_PIS = null;

  /**
   * Al�quota do PIS (em reais) N - 04 N
   */
  @SPEDField(decimals = 4, maxLength = 20, required = false)
  private BigDecimal r29_ALIQ_PIS_QUANT = null;

  /**
   * Valor do PIS N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = true)
  private BigDecimal r30_VL_PIS = null;

  /**
   * C�digo da Situa��o Tribut�ria referente ao COFINS. N 002* - S
   */
  @SPEDField(maxLength = 2, minLength = 2, required = true)
  private String r31_CST_COFINS = null;

  /**
   * Valor da base de c�lculo da COFINS N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = false)
  private BigDecimal r32_VL_BC_COFINS = null;

  /**
   * Al�quota do COFINS (em percentual) N 008 04 N
   */
  @SPEDField(decimals = 4, maxLength = 8, required = false)
  private BigDecimal r33_ALIQ_COFINS = null;

  /**
   * Quantidade � Base de c�lculo COFINS N - 03 N
   */
  @SPEDField(decimals = 3, maxLength = 20, required = false)
  private BigDecimal r34_QUANT_BC_COFINS = null;

  /**
   * Al�quota da COFINS (em reais) N - 04 N
   */
  @SPEDField(decimals = 4, maxLength = 20, required = false)
  private BigDecimal r35_ALIQ_COFINS_QUANT = null;

  /**
   * Valor da COFINS N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = false)
  private BigDecimal r36_VL_COFINS = null;

  /**
   * C�digo da conta anal�tica cont�bil debitada/creditada C 060 - N
   */
  @SPEDField(maxLength = 60, required = false)
  private String r37_COD_CTA = null;

  @Override
  public String get01_Register() {
    return "C170";
  }

  /**
   * Recupera o n�mero seq�encial do item no documento fiscal N 003 - S.
   *
   * @return the n�mero seq�encial do item no documento fiscal N 003 - S
   */
  public Integer getR02_NUM_ITEM() {
    return r02_NUM_ITEM;
  }

  /**
   * Define o n�mero seq�encial do item no documento fiscal N 003 - S.
   *
   * @param r02_NUM_ITEM the new n�mero seq�encial do item no documento fiscal N 003 - S
   */
  public void setR02_NUM_ITEM(Integer r02_NUM_ITEM) {
    this.r02_NUM_ITEM = r02_NUM_ITEM;
  }

  /**
   * Recupera o c�digo do item (campo 02 do Registro 0200) C 060 - S.
   *
   * @return the c�digo do item (campo 02 do Registro 0200) C 060 - S
   */
  public String getR03_COD_ITEM() {
    return r03_COD_ITEM;
  }

  /**
   * Define o c�digo do item (campo 02 do Registro 0200) C 060 - S.
   *
   * @param r03_COD_ITEM the new c�digo do item (campo 02 do Registro 0200) C 060 - S
   */
  public void setR03_COD_ITEM(String r03_COD_ITEM) {
    this.r03_COD_ITEM = r03_COD_ITEM;
  }

  /**
   * Recupera o descri��o complementar do item como adotado no documento fiscal C - - N.
   *
   * @return the descri��o complementar do item como adotado no documento fiscal C - - N
   */
  public String getR04_DESCR_COMPL() {
    return r04_DESCR_COMPL;
  }

  /**
   * Define o descri��o complementar do item como adotado no documento fiscal C - - N.
   *
   * @param r04_DESCR_COMPL the new descri��o complementar do item como adotado no documento fiscal C - - N
   */
  public void setR04_DESCR_COMPL(String r04_DESCR_COMPL) {
    this.r04_DESCR_COMPL = r04_DESCR_COMPL;
  }

  /**
   * Recupera o quantidade do item N - 05 N.
   *
   * @return the quantidade do item N - 05 N
   */
  public BigDecimal getR05_QTD() {
    return r05_QTD;
  }

  /**
   * Define o quantidade do item N - 05 N.
   *
   * @param r05_QTD the new quantidade do item N - 05 N
   */
  public void setR05_QTD(BigDecimal r05_QTD) {
    this.r05_QTD = r05_QTD;
  }

  /**
   * Recupera o unidade do item (Campo 02 do registro 0190) C 006 - N.
   *
   * @return the unidade do item (Campo 02 do registro 0190) C 006 - N
   */
  public String getR06_UNID() {
    return r06_UNID;
  }

  /**
   * Define o unidade do item (Campo 02 do registro 0190) C 006 - N.
   *
   * @param r06_UNID the new unidade do item (Campo 02 do registro 0190) C 006 - N
   */
  public void setR06_UNID(String r06_UNID) {
    this.r06_UNID = r06_UNID;
  }

  /**
   * Recupera o valor total do item (mercadorias ou servi�os) N - 02 S.
   *
   * @return the valor total do item (mercadorias ou servi�os) N - 02 S
   */
  public BigDecimal getR07_VL_ITEM() {
    return r07_VL_ITEM;
  }

  /**
   * Define o valor total do item (mercadorias ou servi�os) N - 02 S.
   *
   * @param r07_VL_ITEM the new valor total do item (mercadorias ou servi�os) N - 02 S
   */
  public void setR07_VL_ITEM(BigDecimal r07_VL_ITEM) {
    this.r07_VL_ITEM = r07_VL_ITEM;
  }

  /**
   * Recupera o valor do desconto comercial N - 02 N.
   *
   * @return the valor do desconto comercial N - 02 N
   */
  public BigDecimal getR08_VL_DESC() {
    return r08_VL_DESC;
  }

  /**
   * Define o valor do desconto comercial N - 02 N.
   *
   * @param r08_VL_DESC the new valor do desconto comercial N - 02 N
   */
  public void setR08_VL_DESC(BigDecimal r08_VL_DESC) {
    this.r08_VL_DESC = r08_VL_DESC;
  }

  /**
   * Recupera o movimenta��o f�sica do ITEM/PRODUTO:
   * <li>0. SIM
   * <li>1. N�O<br>
   * C 001 - N.
   *
   * @return the movimenta��o f�sica do ITEM/PRODUTO:
   *         <li>0
   */
  public String getR09_IND_MOV() {
    return r09_IND_MOV;
  }

  /**
   * Define o movimenta��o f�sica do ITEM/PRODUTO:
   * <li>0. SIM
   * <li>1. N�O<br>
   * C 001 - N.
   *
   * @param r09_IND_MOV the new movimenta��o f�sica do ITEM/PRODUTO:
   *          <li>0
   */
  public void setR09_IND_MOV(String r09_IND_MOV) {
    this.r09_IND_MOV = r09_IND_MOV;
  }

  /**
   * Recupera o c�digo da Situa��o Tribut�ria referente ao ICMS, conforme a Tabela indicada no item 4.3.1 N 003* - N.
   *
   * @return the c�digo da Situa��o Tribut�ria referente ao ICMS, conforme a Tabela indicada no item 4
   */
  public String getR10_CST_ICMS() {
    return r10_CST_ICMS;
  }

  /**
   * Define o c�digo da Situa��o Tribut�ria referente ao ICMS, conforme a Tabela indicada no item 4.3.1 N 003* - N.
   *
   * @param r10_CST_ICMS the new c�digo da Situa��o Tribut�ria referente ao ICMS, conforme a Tabela indicada no item 4
   */
  public void setR10_CST_ICMS(String r10_CST_ICMS) {
    this.r10_CST_ICMS = r10_CST_ICMS;
  }

  /**
   * Recupera o c�digo Fiscal de Opera��o e Presta��o N 004* - S.
   *
   * @return the c�digo Fiscal de Opera��o e Presta��o N 004* - S
   */
  public String getR11_CFOP() {
    return r11_CFOP;
  }

  /**
   * Define o c�digo Fiscal de Opera��o e Presta��o N 004* - S.
   *
   * @param r11_CFOP the new c�digo Fiscal de Opera��o e Presta��o N 004* - S
   */
  public void setR11_CFOP(String r11_CFOP) {
    this.r11_CFOP = r11_CFOP;
  }

  /**
   * Recupera o c�digo da natureza da opera��o (campo 02 do Registro 0400) C 010 - N.
   *
   * @return the c�digo da natureza da opera��o (campo 02 do Registro 0400) C 010 - N
   */
  public String getR12_COD_NAT() {
    return r12_COD_NAT;
  }

  /**
   * Define o c�digo da natureza da opera��o (campo 02 do Registro 0400) C 010 - N.
   *
   * @param r12_COD_NAT the new c�digo da natureza da opera��o (campo 02 do Registro 0400) C 010 - N
   */
  public void setR12_COD_NAT(String r12_COD_NAT) {
    this.r12_COD_NAT = r12_COD_NAT;
  }

  /**
   * Recupera o valor da base de c�lculo do ICMS N - 02 N.
   *
   * @return the valor da base de c�lculo do ICMS N - 02 N
   */
  public BigDecimal getR13_VL_BC_ICMS() {
    return r13_VL_BC_ICMS;
  }

  /**
   * Define o valor da base de c�lculo do ICMS N - 02 N.
   *
   * @param r13_VL_BC_ICMS the new valor da base de c�lculo do ICMS N - 02 N
   */
  public void setR13_VL_BC_ICMS(BigDecimal r13_VL_BC_ICMS) {
    this.r13_VL_BC_ICMS = r13_VL_BC_ICMS;
  }

  /**
   * Recupera o al�quota do ICMS N 006 02 N.
   *
   * @return the al�quota do ICMS N 006 02 N
   */
  public BigDecimal getR14_ALIQ_ICMS() {
    return r14_ALIQ_ICMS;
  }

  /**
   * Define o al�quota do ICMS N 006 02 N.
   *
   * @param r14_ALIQ_ICMS the new al�quota do ICMS N 006 02 N
   */
  public void setR14_ALIQ_ICMS(BigDecimal r14_ALIQ_ICMS) {
    this.r14_ALIQ_ICMS = r14_ALIQ_ICMS;
  }

  /**
   * Recupera o valor do ICMS creditado/debitado N - 02 N.
   *
   * @return the valor do ICMS creditado/debitado N - 02 N
   */
  public BigDecimal getR15_VL_ICMS() {
    return r15_VL_ICMS;
  }

  /**
   * Define o valor do ICMS creditado/debitado N - 02 N.
   *
   * @param r15_VL_ICMS the new valor do ICMS creditado/debitado N - 02 N
   */
  public void setR15_VL_ICMS(BigDecimal r15_VL_ICMS) {
    this.r15_VL_ICMS = r15_VL_ICMS;
  }

  /**
   * Recupera o valor da base de c�lculo referente � substitui��o tribut�ria N - 02 N.
   *
   * @return the valor da base de c�lculo referente � substitui��o tribut�ria N - 02 N
   */
  public BigDecimal getR16_VL_BC_ICMS_ST() {
    return r16_VL_BC_ICMS_ST;
  }

  /**
   * Define o valor da base de c�lculo referente � substitui��o tribut�ria N - 02 N.
   *
   * @param r16_VL_BC_ICMS_ST the new valor da base de c�lculo referente � substitui��o tribut�ria N - 02 N
   */
  public void setR16_VL_BC_ICMS_ST(BigDecimal r16_VL_BC_ICMS_ST) {
    this.r16_VL_BC_ICMS_ST = r16_VL_BC_ICMS_ST;
  }

  /**
   * Recupera o al�quota do ICMS da substitui��o tribut�ria na unidade da federa��o de destino N 006 02 N.
   *
   * @return the al�quota do ICMS da substitui��o tribut�ria na unidade da federa��o de destino N 006 02 N
   */
  public BigDecimal getR17_ALIQ_ST() {
    return r17_ALIQ_ST;
  }

  /**
   * Define o al�quota do ICMS da substitui��o tribut�ria na unidade da federa��o de destino N 006 02 N.
   *
   * @param r17_ALIQ_ST the new al�quota do ICMS da substitui��o tribut�ria na unidade da federa��o de destino N 006 02 N
   */
  public void setR17_ALIQ_ST(BigDecimal r17_ALIQ_ST) {
    this.r17_ALIQ_ST = r17_ALIQ_ST;
  }

  /**
   * Recupera o valor do ICMS referente � substitui��o tribut�ria N - 02 N.
   *
   * @return the valor do ICMS referente � substitui��o tribut�ria N - 02 N
   */
  public BigDecimal getR18_VL_ICMS_ST() {
    return r18_VL_ICMS_ST;
  }

  /**
   * Define o valor do ICMS referente � substitui��o tribut�ria N - 02 N.
   *
   * @param r18_VL_ICMS_ST the new valor do ICMS referente � substitui��o tribut�ria N - 02 N
   */
  public void setR18_VL_ICMS_ST(BigDecimal r18_VL_ICMS_ST) {
    this.r18_VL_ICMS_ST = r18_VL_ICMS_ST;
  }

  /**
   * Recupera o indicador de per�odo de apura��o do IPI:
   * <li>0 - Mensal;
   * <li>1 Decendial<br>
   * C 001* - N.
   *
   * @return the indicador de per�odo de apura��o do IPI:
   *         <li>0 - Mensal;
   *         <li>1 Decendial<br>
   *         C 001* - N
   */
  public String getR19_IND_APUR() {
    return r19_IND_APUR;
  }

  /**
   * Define o indicador de per�odo de apura��o do IPI:
   * <li>0 - Mensal;
   * <li>1 Decendial<br>
   * C 001* - N.
   *
   * @param r19_IND_APUR the new indicador de per�odo de apura��o do IPI:
   *          <li>0 - Mensal;
   *          <li>1 Decendial<br>
   *          C 001* - N
   */
  public void setR19_IND_APUR(String r19_IND_APUR) {
    this.r19_IND_APUR = r19_IND_APUR;
  }

  /**
   * Recupera o c�digo da Situa��o Tribut�ria referente ao IPI, conforme a Tabela indicada no item 4.3.2. C 002* - N.
   *
   * @return the c�digo da Situa��o Tribut�ria referente ao IPI, conforme a Tabela indicada no item 4
   */
  public String getR20_CST_IPI() {
    return r20_CST_IPI;
  }

  /**
   * Define o c�digo da Situa��o Tribut�ria referente ao IPI, conforme a Tabela indicada no item 4.3.2. C 002* - N.
   *
   * @param r20_CST_IPI the new c�digo da Situa��o Tribut�ria referente ao IPI, conforme a Tabela indicada no item 4
   */
  public void setR20_CST_IPI(String r20_CST_IPI) {
    this.r20_CST_IPI = r20_CST_IPI;
  }

  /**
   * Recupera o c�digo de enquadramento legal do IPI, conforme tabela indicada no item 4.5.3. C 003* - N.
   *
   * @return the c�digo de enquadramento legal do IPI, conforme tabela indicada no item 4
   */
  public String getR21_COD_ENQ() {
    return r21_COD_ENQ;
  }

  /**
   * Define o c�digo de enquadramento legal do IPI, conforme tabela indicada no item 4.5.3. C 003* - N.
   *
   * @param r21_COD_ENQ the new c�digo de enquadramento legal do IPI, conforme tabela indicada no item 4
   */
  public void setR21_COD_ENQ(String r21_COD_ENQ) {
    this.r21_COD_ENQ = r21_COD_ENQ;
  }

  /**
   * Recupera o al�quota do IPI N 006 02 N.
   *
   * @return the al�quota do IPI N 006 02 N
   */
  public BigDecimal getR23_ALIQ_IPI() {
    return r23_ALIQ_IPI;
  }

  /**
   * Define o al�quota do IPI N 006 02 N.
   *
   * @param r23_ALIQ_IPI the new al�quota do IPI N 006 02 N
   */
  public void setR23_ALIQ_IPI(BigDecimal r23_ALIQ_IPI) {
    this.r23_ALIQ_IPI = r23_ALIQ_IPI;
  }

  /**
   * Recupera o valor do IPI creditado/debitado N - 02 N.
   *
   * @return the valor do IPI creditado/debitado N - 02 N
   */
  public BigDecimal getR24_VL_IPI() {
    return r24_VL_IPI;
  }

  /**
   * Define o valor do IPI creditado/debitado N - 02 N.
   *
   * @param r24_VL_IPI the new valor do IPI creditado/debitado N - 02 N
   */
  public void setR24_VL_IPI(BigDecimal r24_VL_IPI) {
    this.r24_VL_IPI = r24_VL_IPI;
  }

  /**
   * Recupera o c�digo da Situa��o Tribut�ria referente ao PIS. N 002* - S.
   *
   * @return the c�digo da Situa��o Tribut�ria referente ao PIS
   */
  public String getR25_CST_PIS() {
    return r25_CST_PIS;
  }

  /**
   * Define o c�digo da Situa��o Tribut�ria referente ao PIS. N 002* - S.
   *
   * @param r25_CST_PIS the new c�digo da Situa��o Tribut�ria referente ao PIS
   */
  public void setR25_CST_PIS(String r25_CST_PIS) {
    this.r25_CST_PIS = r25_CST_PIS;
  }

  /**
   * Recupera o valor da base de c�lculo do PIS N - 02 N.
   *
   * @return the valor da base de c�lculo do PIS N - 02 N
   */
  public BigDecimal getR26_VL_BC_PIS() {
    return r26_VL_BC_PIS;
  }

  /**
   * Define o valor da base de c�lculo do PIS N - 02 N.
   *
   * @param r26_VL_BC_PIS the new valor da base de c�lculo do PIS N - 02 N
   */
  public void setR26_VL_BC_PIS(BigDecimal r26_VL_BC_PIS) {
    this.r26_VL_BC_PIS = r26_VL_BC_PIS;
  }

  /**
   * Recupera o al�quota do PIS (em percentual) N 008 04 N.
   *
   * @return the al�quota do PIS (em percentual) N 008 04 N
   */
  public BigDecimal getR27_ALIQ_PIS() {
    return r27_ALIQ_PIS;
  }

  /**
   * Define o al�quota do PIS (em percentual) N 008 04 N.
   *
   * @param r27_ALIQ_PIS the new al�quota do PIS (em percentual) N 008 04 N
   */
  public void setR27_ALIQ_PIS(BigDecimal r27_ALIQ_PIS) {
    this.r27_ALIQ_PIS = r27_ALIQ_PIS;
  }

  /**
   * Recupera o quantidade � Base de c�lculo PIS/PASEP N - 03 N.
   *
   * @return the quantidade � Base de c�lculo PIS/PASEP N - 03 N
   */
  public BigDecimal getR28_QUANT_BC_PIS() {
    return r28_QUANT_BC_PIS;
  }

  /**
   * Define o quantidade � Base de c�lculo PIS/PASEP N - 03 N.
   *
   * @param r28_QUANT_BC_PIS the new quantidade � Base de c�lculo PIS/PASEP N - 03 N
   */
  public void setR28_QUANT_BC_PIS(BigDecimal r28_QUANT_BC_PIS) {
    this.r28_QUANT_BC_PIS = r28_QUANT_BC_PIS;
  }

  /**
   * Recupera o al�quota do PIS (em reais) N - 04 N.
   *
   * @return the al�quota do PIS (em reais) N - 04 N
   */
  public BigDecimal getR29_ALIQ_PIS_QUANT() {
    return r29_ALIQ_PIS_QUANT;
  }

  /**
   * Define o al�quota do PIS (em reais) N - 04 N.
   *
   * @param r29_ALIQ_PIS_QUANT the new al�quota do PIS (em reais) N - 04 N
   */
  public void setR29_ALIQ_PIS_QUANT(BigDecimal r29_ALIQ_PIS_QUANT) {
    this.r29_ALIQ_PIS_QUANT = r29_ALIQ_PIS_QUANT;
  }

  /**
   * Recupera o valor do PIS N - 02 N.
   *
   * @return the valor do PIS N - 02 N
   */
  public BigDecimal getR30_VL_PIS() {
    return r30_VL_PIS;
  }

  /**
   * Define o valor do PIS N - 02 N.
   *
   * @param r30_VL_PIS the new valor do PIS N - 02 N
   */
  public void setR30_VL_PIS(BigDecimal r30_VL_PIS) {
    this.r30_VL_PIS = r30_VL_PIS;
  }

  /**
   * Recupera o c�digo da Situa��o Tribut�ria referente ao COFINS. N 002* - S.
   *
   * @return the c�digo da Situa��o Tribut�ria referente ao COFINS
   */
  public String getR31_CST_COFINS() {
    return r31_CST_COFINS;
  }

  /**
   * Define o c�digo da Situa��o Tribut�ria referente ao COFINS. N 002* - S.
   *
   * @param r31_CST_COFINS the new c�digo da Situa��o Tribut�ria referente ao COFINS
   */
  public void setR31_CST_COFINS(String r31_CST_COFINS) {
    this.r31_CST_COFINS = r31_CST_COFINS;
  }

  /**
   * Recupera o valor da base de c�lculo da COFINS N - 02 N.
   *
   * @return the valor da base de c�lculo da COFINS N - 02 N
   */
  public BigDecimal getR32_VL_BC_COFINS() {
    return r32_VL_BC_COFINS;
  }

  /**
   * Define o valor da base de c�lculo da COFINS N - 02 N.
   *
   * @param r32_VL_BC_COFINS the new valor da base de c�lculo da COFINS N - 02 N
   */
  public void setR32_VL_BC_COFINS(BigDecimal r32_VL_BC_COFINS) {
    this.r32_VL_BC_COFINS = r32_VL_BC_COFINS;
  }

  /**
   * Recupera o al�quota do COFINS (em percentual) N 008 04 N.
   *
   * @return the al�quota do COFINS (em percentual) N 008 04 N
   */
  public BigDecimal getR33_ALIQ_COFINS() {
    return r33_ALIQ_COFINS;
  }

  /**
   * Define o al�quota do COFINS (em percentual) N 008 04 N.
   *
   * @param r33_ALIQ_COFINS the new al�quota do COFINS (em percentual) N 008 04 N
   */
  public void setR33_ALIQ_COFINS(BigDecimal r33_ALIQ_COFINS) {
    this.r33_ALIQ_COFINS = r33_ALIQ_COFINS;
  }

  /**
   * Recupera o quantidade � Base de c�lculo COFINS N - 03 N.
   *
   * @return the quantidade � Base de c�lculo COFINS N - 03 N
   */
  public BigDecimal getR34_QUANT_BC_COFINS() {
    return r34_QUANT_BC_COFINS;
  }

  /**
   * Define o quantidade � Base de c�lculo COFINS N - 03 N.
   *
   * @param r34_QUANT_BC_COFINS the new quantidade � Base de c�lculo COFINS N - 03 N
   */
  public void setR34_QUANT_BC_COFINS(BigDecimal r34_QUANT_BC_COFINS) {
    this.r34_QUANT_BC_COFINS = r34_QUANT_BC_COFINS;
  }

  /**
   * Recupera o al�quota da COFINS (em reais) N - 04 N.
   *
   * @return the al�quota da COFINS (em reais) N - 04 N
   */
  public BigDecimal getR35_ALIQ_COFINS_QUANT() {
    return r35_ALIQ_COFINS_QUANT;
  }

  /**
   * Define o al�quota da COFINS (em reais) N - 04 N.
   *
   * @param r35_ALIQ_COFINS_QUANT the new al�quota da COFINS (em reais) N - 04 N
   */
  public void setR35_ALIQ_COFINS_QUANT(BigDecimal r35_ALIQ_COFINS_QUANT) {
    this.r35_ALIQ_COFINS_QUANT = r35_ALIQ_COFINS_QUANT;
  }

  /**
   * Recupera o valor da COFINS N - 02 N.
   *
   * @return the valor da COFINS N - 02 N
   */
  public BigDecimal getR36_VL_COFINS() {
    return r36_VL_COFINS;
  }

  /**
   * Define o valor da COFINS N - 02 N.
   *
   * @param r36_VL_COFINS the new valor da COFINS N - 02 N
   */
  public void setR36_VL_COFINS(BigDecimal r36_VL_COFINS) {
    this.r36_VL_COFINS = r36_VL_COFINS;
  }

  /**
   * Recupera o c�digo da conta anal�tica cont�bil debitada/creditada C 060 - N.
   *
   * @return the c�digo da conta anal�tica cont�bil debitada/creditada C 060 - N
   */
  public String getR37_COD_CTA() {
    return r37_COD_CTA;
  }

  /**
   * Define o c�digo da conta anal�tica cont�bil debitada/creditada C 060 - N.
   *
   * @param r37_COD_CTA the new c�digo da conta anal�tica cont�bil debitada/creditada C 060 - N
   */
  public void setR37_COD_CTA(String r37_COD_CTA) {
    this.r37_COD_CTA = r37_COD_CTA;
  }

  /**
   * Recupera o valor da base de c�lculo do IPI N - 02 N.
   *
   * @return the valor da base de c�lculo do IPI N - 02 N
   */
  public BigDecimal getR22_VL_BC_IPI() {
    return r22_VL_BC_IPI;
  }

  /**
   * Define o valor da base de c�lculo do IPI N - 02 N.
   *
   * @param r22_VL_BC_IPI the new valor da base de c�lculo do IPI N - 02 N
   */
  public void setR22_VL_BC_IPI(BigDecimal r22_VL_BC_IPI) {
    this.r22_VL_BC_IPI = r22_VL_BC_IPI;
  }

  /**
   * Recupera o salva refer�ncia para o registro pai.
   *
   * @return the salva refer�ncia para o registro pai
   */
  public SPEDContribC100 getParent() {
    return parent;
  }
}