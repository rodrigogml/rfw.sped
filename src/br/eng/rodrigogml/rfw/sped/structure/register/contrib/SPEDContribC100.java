package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C100: DOCUMENTO - NOTA FISCAL (CÓDIGO 01), NOTA FISCAL AVULSA (CÓDIGO 1B), NOTA FISCAL DE PRODUTOR (CÓDIGO 04), NF-e (CÓDIGO 55) e NFC-e (CÓDIGO 65)..<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribC100 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * REGISTRO C170: ITENS DO DOCUMENTO (CÓDIGO 01, 1B, 04 e 55)
   */
  private final ArrayList<SPEDContribC170> rc170 = new ArrayList<SPEDContribC170>();

  /**
   * Indicador do tipo de operação:
   * <li>0- Entrada;
   * <li>1- Saída<br>
   * C 001* - S
   */
  @SPEDField(maxLength = 1, minLength = 1, required = true)
  private String r02_IND_OPER = null;

  /**
   * Indicador do emitente do documento fiscal:
   * <li>0- Emissão própria;
   * <li>1- Terceiros<br>
   * C 001* - S
   */
  @SPEDField(maxLength = 1, minLength = 1, required = true)
  private String r03_IND_EMIT = null;

  /**
   * Código do participante (campo 02 do Registro 0150):
   * <li>do emitente do documento ou do remetente das mercadorias, no caso de entradas;
   * <li>do adquirente, no caso de saídas<br>
   * C 060 - S
   */
  @SPEDField(maxLength = 60, required = true)
  private String r04_COD_PART = null;

  /**
   * Código do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002* - S
   */
  @SPEDField(maxLength = 2, minLength = 2, required = true)
  private String r05_COD_MOD = null;

  /**
   * Código da situação do documento fiscal, conforme a Tabela 4.1.2 N 002* - S
   */
  @SPEDField(maxLength = 2, minLength = 2, required = true)
  private String r06_COD_SIT = null;

  /**
   * Série do documento fiscal C 003 - N
   */
  @SPEDField(maxLength = 3, required = false)
  private String r07_SER = null;

  /**
   * Número do documento fiscal N 009 - S
   */
  @SPEDField(maxLength = 9, required = true)
  private String r08_NUM_DOC = null;

  /**
   * Chave da Nota Fiscal Eletrônica ou da NFC-e N 044* - N
   */
  @SPEDField(maxLength = 44, minLength = 44, required = false)
  private String r09_CHV_NFE = null;

  /**
   * Data da emissão do documento fiscal N 008* - S
   */
  @SPEDField(maxLength = 8, minLength = 8, required = true)
  private LocalDate r10_DT_DOC = null;

  /**
   * Data da entrada ou da saída N 008* - N
   */
  @SPEDField(maxLength = 8, required = false)
  private LocalDate r11_DT_E_S = null;

  /**
   * Valor total do documento fiscal N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r12_VL_DOC = null;

  /**
   * Indicador do tipo de pagamento:
   * <li>0- À vista;
   * <li>1- A prazo;
   * <li>9- Sem pagamento.<br>
   * Obs.: A partir de 01/07/2012 passará a ser:<br>
   * Indicador do tipo de pagamento:
   * <li>0- À vista;
   * <li>1- A prazo;
   * <li>2 - Outros
   * <li>C 001* - S
   */
  @SPEDField(maxLength = 1, minLength = 1, required = true)
  private String r13_IND_PGTO = null;

  /**
   * Valor total do desconto N - 02 N
   */
  @SPEDField(maxLength = 20, decimals = 2, required = false)
  private BigDecimal r14_VL_DESC = null;

  /**
   * Abatimento não tributado e não comercial Ex. desconto ICMS nas remessas para ZFM. N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = false)
  private BigDecimal r15_VL_ABAT_NT = null;

  /**
   * Valor total das mercadorias e serviços N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = false)
  private BigDecimal r16_VL_MERC = null;

  /**
   * Indicador do tipo do frete:
   * <li>0- Por conta de terceiros;
   * <li>1- Por conta do emitente;
   * <li>2- Por conta do destinatário;
   * <li>9- Sem cobrança de frete.<br>
   * Obs.: A partir de 01/01/2012 passará a ser<br>
   * Indicador do tipo do frete:
   * <li>0- Por conta do emitente;
   * <li>1- Por conta do destinatário/remetente;
   * <li>2- Por conta de terceiros;
   * <li>9- Sem cobrança de frete.<br>
   * C 001* - S
   */
  @SPEDField(maxLength = 1, minLength = 1, required = true)
  private String r17_IND_FRT = null;

  /**
   * Valor do frete indicado no documento fiscal N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = true)
  private BigDecimal r18_VL_FRT = null;

  /**
   * Valor do seguro indicado no documento fiscal N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = true)
  private BigDecimal r19_VL_SEG = null;

  /**
   * Valor de outras despesas acessórias N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = false)
  private BigDecimal r20_VL_OUT_DA = null;

  /**
   * Valor da base de cálculo do ICMS N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = false)
  private BigDecimal r21_VL_BC_ICMS = null;

  /**
   * Valor do ICMS N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = false)
  private BigDecimal r22_VL_ICMS = null;

  /**
   * Valor da base de cálculo do ICMS substituição tributária N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = false)
  private BigDecimal r23_VL_BC_ICMS_ST = null;

  /**
   * Valor do ICMS retido por substituição tributária N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = false)
  private BigDecimal r24_VL_ICMS_ST = null;

  /**
   * Valor total do IPI N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 2, required = false)
  private BigDecimal r25_VL_IPI = null;

  /**
   * Valor total do PIS N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = false)
  private BigDecimal r26_VL_PIS = null;

  /**
   * Valor total da COFINS N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = false)
  private BigDecimal r27_VL_COFINS = null;

  /**
   * Valor total do PIS retido por substituição tributária N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = true)
  private BigDecimal r28_VL_PIS_ST = null;

  /**
   * Valor total da COFINS retido por substituição tributária N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = false)
  private BigDecimal r29_VL_COFINS_ST = null;

  @Override
  public String get01_Register() {
    return "C100";
  }

  /**
   * Recupera o indicador do tipo de operação:
   * <li>0- Entrada;
   * <li>1- Saída<br>
   * C 001* - S.
   *
   * @return the indicador do tipo de operação:
   *         <li>0- Entrada;
   *         <li>1- Saída<br>
   *         C 001* - S
   */
  public String getR02_IND_OPER() {
    return r02_IND_OPER;
  }

  /**
   * Define o indicador do tipo de operação:
   * <li>0- Entrada;
   * <li>1- Saída<br>
   * C 001* - S.
   *
   * @param r02_IND_OPER the new indicador do tipo de operação:
   *          <li>0- Entrada;
   *          <li>1- Saída<br>
   *          C 001* - S
   */
  public void setR02_IND_OPER(String r02_IND_OPER) {
    this.r02_IND_OPER = r02_IND_OPER;
  }

  /**
   * Recupera o indicador do emitente do documento fiscal:
   * <li>0- Emissão própria;
   * <li>1- Terceiros<br>
   * C 001* - S.
   *
   * @return the indicador do emitente do documento fiscal:
   *         <li>0- Emissão própria;
   *         <li>1- Terceiros<br>
   *         C 001* - S
   */
  public String getR03_IND_EMIT() {
    return r03_IND_EMIT;
  }

  /**
   * Define o indicador do emitente do documento fiscal:
   * <li>0- Emissão própria;
   * <li>1- Terceiros<br>
   * C 001* - S.
   *
   * @param r03_IND_EMIT the new indicador do emitente do documento fiscal:
   *          <li>0- Emissão própria;
   *          <li>1- Terceiros<br>
   *          C 001* - S
   */
  public void setR03_IND_EMIT(String r03_IND_EMIT) {
    this.r03_IND_EMIT = r03_IND_EMIT;
  }

  /**
   * Recupera o código do participante (campo 02 do Registro 0150):
   * <li>do emitente do documento ou do remetente das mercadorias, no caso de entradas;
   * <li>do adquirente, no caso de saídas<br>
   * C 060 - S.
   *
   * @return the código do participante (campo 02 do Registro 0150):
   *         <li>do emitente do documento ou do remetente das mercadorias, no caso de entradas;
   *         <li>do adquirente, no caso de saídas<br>
   *         C 060 - S
   */
  public String getR04_COD_PART() {
    return r04_COD_PART;
  }

  /**
   * Define o código do participante (campo 02 do Registro 0150):
   * <li>do emitente do documento ou do remetente das mercadorias, no caso de entradas;
   * <li>do adquirente, no caso de saídas<br>
   * C 060 - S.
   *
   * @param r04_COD_PART the new código do participante (campo 02 do Registro 0150):
   *          <li>do emitente do documento ou do remetente das mercadorias, no caso de entradas;
   *          <li>do adquirente, no caso de saídas<br>
   *          C 060 - S
   */
  public void setR04_COD_PART(String r04_COD_PART) {
    this.r04_COD_PART = r04_COD_PART;
  }

  /**
   * Recupera o código do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002* - S.
   *
   * @return the código do modelo do documento fiscal, conforme a Tabela 4
   */
  public String getR05_COD_MOD() {
    return r05_COD_MOD;
  }

  /**
   * Define o código do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002* - S.
   *
   * @param r05_COD_MOD the new código do modelo do documento fiscal, conforme a Tabela 4
   */
  public void setR05_COD_MOD(String r05_COD_MOD) {
    this.r05_COD_MOD = r05_COD_MOD;
  }

  /**
   * Recupera o código da situação do documento fiscal, conforme a Tabela 4.1.2 N 002* - S.
   *
   * @return the código da situação do documento fiscal, conforme a Tabela 4
   */
  public String getR06_COD_SIT() {
    return r06_COD_SIT;
  }

  /**
   * Define o código da situação do documento fiscal, conforme a Tabela 4.1.2 N 002* - S.
   *
   * @param r06_COD_SIT the new código da situação do documento fiscal, conforme a Tabela 4
   */
  public void setR06_COD_SIT(String r06_COD_SIT) {
    this.r06_COD_SIT = r06_COD_SIT;
  }

  /**
   * Recupera o série do documento fiscal C 003 - N.
   *
   * @return the série do documento fiscal C 003 - N
   */
  public String getR07_SER() {
    return r07_SER;
  }

  /**
   * Define o série do documento fiscal C 003 - N.
   *
   * @param r07_SER the new série do documento fiscal C 003 - N
   */
  public void setR07_SER(String r07_SER) {
    this.r07_SER = r07_SER;
  }

  /**
   * Recupera o número do documento fiscal N 009 - S.
   *
   * @return the número do documento fiscal N 009 - S
   */
  public String getR08_NUM_DOC() {
    return r08_NUM_DOC;
  }

  /**
   * Define o número do documento fiscal N 009 - S.
   *
   * @param r08_NUM_DOC the new número do documento fiscal N 009 - S
   */
  public void setR08_NUM_DOC(String r08_NUM_DOC) {
    this.r08_NUM_DOC = r08_NUM_DOC;
  }

  /**
   * Recupera o chave da Nota Fiscal Eletrônica ou da NFC-e N 044* - N.
   *
   * @return the chave da Nota Fiscal Eletrônica ou da NFC-e N 044* - N
   */
  public String getR09_CHV_NFE() {
    return r09_CHV_NFE;
  }

  /**
   * Define o chave da Nota Fiscal Eletrônica ou da NFC-e N 044* - N.
   *
   * @param r09_CHV_NFE the new chave da Nota Fiscal Eletrônica ou da NFC-e N 044* - N
   */
  public void setR09_CHV_NFE(String r09_CHV_NFE) {
    this.r09_CHV_NFE = r09_CHV_NFE;
  }

  /**
   * Recupera o data da emissão do documento fiscal N 008* - S.
   *
   * @return the data da emissão do documento fiscal N 008* - S
   */
  public LocalDate getR10_DT_DOC() {
    return r10_DT_DOC;
  }

  /**
   * Define o data da emissão do documento fiscal N 008* - S.
   *
   * @param r10_DT_DOC the new data da emissão do documento fiscal N 008* - S
   */
  public void setR10_DT_DOC(LocalDate r10_DT_DOC) {
    this.r10_DT_DOC = r10_DT_DOC;
  }

  /**
   * Recupera o data da entrada ou da saída N 008* - N.
   *
   * @return the data da entrada ou da saída N 008* - N
   */
  public LocalDate getR11_DT_E_S() {
    return r11_DT_E_S;
  }

  /**
   * Define o data da entrada ou da saída N 008* - N.
   *
   * @param r11_DT_E_S the new data da entrada ou da saída N 008* - N
   */
  public void setR11_DT_E_S(LocalDate r11_DT_E_S) {
    this.r11_DT_E_S = r11_DT_E_S;
  }

  /**
   * Recupera o valor total do documento fiscal N - 02 S.
   *
   * @return the valor total do documento fiscal N - 02 S
   */
  public BigDecimal getR12_VL_DOC() {
    return r12_VL_DOC;
  }

  /**
   * Define o valor total do documento fiscal N - 02 S.
   *
   * @param r12_VL_DOC the new valor total do documento fiscal N - 02 S
   */
  public void setR12_VL_DOC(BigDecimal r12_VL_DOC) {
    this.r12_VL_DOC = r12_VL_DOC;
  }

  /**
   * Recupera o indicador do tipo de pagamento:
   * <li>0- À vista;
   * <li>1- A prazo;
   * <li>9- Sem pagamento.<br>
   * Obs.: A partir de 01/07/2012 passará a ser:<br>
   * Indicador do tipo de pagamento:
   * <li>0- À vista;
   * <li>1- A prazo;
   * <li>2 - Outros
   * <li>C 001* - S.
   *
   * @return the indicador do tipo de pagamento:
   *         <li>0- À vista;
   *         <li>1- A prazo;
   *         <li>9- Sem pagamento
   */
  public String getR13_IND_PGTO() {
    return r13_IND_PGTO;
  }

  /**
   * Define o indicador do tipo de pagamento:
   * <li>0- À vista;
   * <li>1- A prazo;
   * <li>9- Sem pagamento.<br>
   * Obs.: A partir de 01/07/2012 passará a ser:<br>
   * Indicador do tipo de pagamento:
   * <li>0- À vista;
   * <li>1- A prazo;
   * <li>2 - Outros
   * <li>C 001* - S.
   *
   * @param r13_IND_PGTO the new indicador do tipo de pagamento:
   *          <li>0- À vista;
   *          <li>1- A prazo;
   *          <li>9- Sem pagamento
   */
  public void setR13_IND_PGTO(String r13_IND_PGTO) {
    this.r13_IND_PGTO = r13_IND_PGTO;
  }

  /**
   * Recupera o valor total do desconto N - 02 N.
   *
   * @return the valor total do desconto N - 02 N
   */
  public BigDecimal getR14_VL_DESC() {
    return r14_VL_DESC;
  }

  /**
   * Define o valor total do desconto N - 02 N.
   *
   * @param r14_VL_DESC the new valor total do desconto N - 02 N
   */
  public void setR14_VL_DESC(BigDecimal r14_VL_DESC) {
    this.r14_VL_DESC = r14_VL_DESC;
  }

  /**
   * Recupera o abatimento não tributado e não comercial Ex. desconto ICMS nas remessas para ZFM. N - 02 N.
   *
   * @return the abatimento não tributado e não comercial Ex
   */
  public BigDecimal getR15_VL_ABAT_NT() {
    return r15_VL_ABAT_NT;
  }

  /**
   * Define o abatimento não tributado e não comercial Ex. desconto ICMS nas remessas para ZFM. N - 02 N.
   *
   * @param r15_VL_ABAT_NT the new abatimento não tributado e não comercial Ex
   */
  public void setR15_VL_ABAT_NT(BigDecimal r15_VL_ABAT_NT) {
    this.r15_VL_ABAT_NT = r15_VL_ABAT_NT;
  }

  /**
   * Recupera o valor total das mercadorias e serviços N - 02 N.
   *
   * @return the valor total das mercadorias e serviços N - 02 N
   */
  public BigDecimal getR16_VL_MERC() {
    return r16_VL_MERC;
  }

  /**
   * Define o valor total das mercadorias e serviços N - 02 N.
   *
   * @param r16_VL_MERC the new valor total das mercadorias e serviços N - 02 N
   */
  public void setR16_VL_MERC(BigDecimal r16_VL_MERC) {
    this.r16_VL_MERC = r16_VL_MERC;
  }

  /**
   * Recupera o indicador do tipo do frete:
   * <li>0- Por conta de terceiros;
   * <li>1- Por conta do emitente;
   * <li>2- Por conta do destinatário;
   * <li>9- Sem cobrança de frete.<br>
   * Obs.: A partir de 01/01/2012 passará a ser<br>
   * Indicador do tipo do frete:
   * <li>0- Por conta do emitente;
   * <li>1- Por conta do destinatário/remetente;
   * <li>2- Por conta de terceiros;
   * <li>9- Sem cobrança de frete.<br>
   * C 001* - S.
   *
   * @return the indicador do tipo do frete:
   *         <li>0- Por conta de terceiros;
   *         <li>1- Por conta do emitente;
   *         <li>2- Por conta do destinatário;
   *         <li>9- Sem cobrança de frete
   */
  public String getR17_IND_FRT() {
    return r17_IND_FRT;
  }

  /**
   * Define o indicador do tipo do frete:
   * <li>0- Por conta de terceiros;
   * <li>1- Por conta do emitente;
   * <li>2- Por conta do destinatário;
   * <li>9- Sem cobrança de frete.<br>
   * Obs.: A partir de 01/01/2012 passará a ser<br>
   * Indicador do tipo do frete:
   * <li>0- Por conta do emitente;
   * <li>1- Por conta do destinatário/remetente;
   * <li>2- Por conta de terceiros;
   * <li>9- Sem cobrança de frete.<br>
   * C 001* - S.
   *
   * @param r17_IND_FRT the new indicador do tipo do frete:
   *          <li>0- Por conta de terceiros;
   *          <li>1- Por conta do emitente;
   *          <li>2- Por conta do destinatário;
   *          <li>9- Sem cobrança de frete
   */
  public void setR17_IND_FRT(String r17_IND_FRT) {
    this.r17_IND_FRT = r17_IND_FRT;
  }

  /**
   * Recupera o valor do frete indicado no documento fiscal N - 02 N.
   *
   * @return the valor do frete indicado no documento fiscal N - 02 N
   */
  public BigDecimal getR18_VL_FRT() {
    return r18_VL_FRT;
  }

  /**
   * Define o valor do frete indicado no documento fiscal N - 02 N.
   *
   * @param r18_VL_FRT the new valor do frete indicado no documento fiscal N - 02 N
   */
  public void setR18_VL_FRT(BigDecimal r18_VL_FRT) {
    this.r18_VL_FRT = r18_VL_FRT;
  }

  /**
   * Recupera o valor de outras despesas acessórias N - 02 N.
   *
   * @return the valor de outras despesas acessórias N - 02 N
   */
  public BigDecimal getR20_VL_OUT_DA() {
    return r20_VL_OUT_DA;
  }

  /**
   * Define o valor de outras despesas acessórias N - 02 N.
   *
   * @param r20_VL_OUT_DA the new valor de outras despesas acessórias N - 02 N
   */
  public void setR20_VL_OUT_DA(BigDecimal r20_VL_OUT_DA) {
    this.r20_VL_OUT_DA = r20_VL_OUT_DA;
  }

  /**
   * Recupera o valor da base de cálculo do ICMS N - 02 N.
   *
   * @return the valor da base de cálculo do ICMS N - 02 N
   */
  public BigDecimal getR21_VL_BC_ICMS() {
    return r21_VL_BC_ICMS;
  }

  /**
   * Define o valor da base de cálculo do ICMS N - 02 N.
   *
   * @param r21_VL_BC_ICMS the new valor da base de cálculo do ICMS N - 02 N
   */
  public void setR21_VL_BC_ICMS(BigDecimal r21_VL_BC_ICMS) {
    this.r21_VL_BC_ICMS = r21_VL_BC_ICMS;
  }

  /**
   * Recupera o valor do ICMS N - 02 N.
   *
   * @return the valor do ICMS N - 02 N
   */
  public BigDecimal getR22_VL_ICMS() {
    return r22_VL_ICMS;
  }

  /**
   * Define o valor do ICMS N - 02 N.
   *
   * @param r22_VL_ICMS the new valor do ICMS N - 02 N
   */
  public void setR22_VL_ICMS(BigDecimal r22_VL_ICMS) {
    this.r22_VL_ICMS = r22_VL_ICMS;
  }

  /**
   * Recupera o valor da base de cálculo do ICMS substituição tributária N - 02 N.
   *
   * @return the valor da base de cálculo do ICMS substituição tributária N - 02 N
   */
  public BigDecimal getR23_VL_BC_ICMS_ST() {
    return r23_VL_BC_ICMS_ST;
  }

  /**
   * Define o valor da base de cálculo do ICMS substituição tributária N - 02 N.
   *
   * @param r23_VL_BC_ICMS_ST the new valor da base de cálculo do ICMS substituição tributária N - 02 N
   */
  public void setR23_VL_BC_ICMS_ST(BigDecimal r23_VL_BC_ICMS_ST) {
    this.r23_VL_BC_ICMS_ST = r23_VL_BC_ICMS_ST;
  }

  /**
   * Recupera o valor do ICMS retido por substituição tributária N - 02 N.
   *
   * @return the valor do ICMS retido por substituição tributária N - 02 N
   */
  public BigDecimal getR24_VL_ICMS_ST() {
    return r24_VL_ICMS_ST;
  }

  /**
   * Define o valor do ICMS retido por substituição tributária N - 02 N.
   *
   * @param r24_VL_ICMS_ST the new valor do ICMS retido por substituição tributária N - 02 N
   */
  public void setR24_VL_ICMS_ST(BigDecimal r24_VL_ICMS_ST) {
    this.r24_VL_ICMS_ST = r24_VL_ICMS_ST;
  }

  /**
   * Recupera o valor total do IPI N - 02 N.
   *
   * @return the valor total do IPI N - 02 N
   */
  public BigDecimal getR25_VL_IPI() {
    return r25_VL_IPI;
  }

  /**
   * Define o valor total do IPI N - 02 N.
   *
   * @param r25_VL_IPI the new valor total do IPI N - 02 N
   */
  public void setR25_VL_IPI(BigDecimal r25_VL_IPI) {
    this.r25_VL_IPI = r25_VL_IPI;
  }

  /**
   * Recupera o valor total da COFINS N - 02 N.
   *
   * @return the valor total da COFINS N - 02 N
   */
  public BigDecimal getR27_VL_COFINS() {
    return r27_VL_COFINS;
  }

  /**
   * Define o valor total da COFINS N - 02 N.
   *
   * @param r27_VL_COFINS the new valor total da COFINS N - 02 N
   */
  public void setR27_VL_COFINS(BigDecimal r27_VL_COFINS) {
    this.r27_VL_COFINS = r27_VL_COFINS;
  }

  /**
   * Recupera o valor total do PIS retido por substituição tributária N - 02 N.
   *
   * @return the valor total do PIS retido por substituição tributária N - 02 N
   */
  public BigDecimal getR28_VL_PIS_ST() {
    return r28_VL_PIS_ST;
  }

  /**
   * Define o valor total do PIS retido por substituição tributária N - 02 N.
   *
   * @param r28_VL_PIS_ST the new valor total do PIS retido por substituição tributária N - 02 N
   */
  public void setR28_VL_PIS_ST(BigDecimal r28_VL_PIS_ST) {
    this.r28_VL_PIS_ST = r28_VL_PIS_ST;
  }

  /**
   * Recupera o valor total da COFINS retido por substituição tributária N - 02 N.
   *
   * @return the valor total da COFINS retido por substituição tributária N - 02 N
   */
  public BigDecimal getR29_VL_COFINS_ST() {
    return r29_VL_COFINS_ST;
  }

  /**
   * Define o valor total da COFINS retido por substituição tributária N - 02 N.
   *
   * @param r29_VL_COFINS_ST the new valor total da COFINS retido por substituição tributária N - 02 N
   */
  public void setR29_VL_COFINS_ST(BigDecimal r29_VL_COFINS_ST) {
    this.r29_VL_COFINS_ST = r29_VL_COFINS_ST;
  }

  /**
   * Recupera o valor do seguro indicado no documento fiscal N - 02 N.
   *
   * @return the valor do seguro indicado no documento fiscal N - 02 N
   */
  public BigDecimal getR19_VL_SEG() {
    return r19_VL_SEG;
  }

  /**
   * Define o valor do seguro indicado no documento fiscal N - 02 N.
   *
   * @param r19_VL_SEG the new valor do seguro indicado no documento fiscal N - 02 N
   */
  public void setR19_VL_SEG(BigDecimal r19_VL_SEG) {
    this.r19_VL_SEG = r19_VL_SEG;
  }

  /**
   * Recupera o valor total do PIS N - 02 N.
   *
   * @return the valor total do PIS N - 02 N
   */
  public BigDecimal getR26_VL_PIS() {
    return r26_VL_PIS;
  }

  /**
   * Define o valor total do PIS N - 02 N.
   *
   * @param r26_VL_PIS the new valor total do PIS N - 02 N
   */
  public void setR26_VL_PIS(BigDecimal r26_VL_PIS) {
    this.r26_VL_PIS = r26_VL_PIS;
  }

  /**
   * Recupera o rEGISTRO C170: ITENS DO DOCUMENTO (CÓDIGO 01, 1B, 04 e 55).
   *
   * @return the rEGISTRO C170: ITENS DO DOCUMENTO (CÓDIGO 01, 1B, 04 e 55)
   */
  public ArrayList<SPEDContribC170> getRc170() {
    return rc170;
  }

}