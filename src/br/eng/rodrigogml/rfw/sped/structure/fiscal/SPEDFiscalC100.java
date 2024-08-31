package br.eng.rodrigogml.rfw.sped.structure.fiscal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO C100: NOTA FISCAL (CÓDIGO 01), NOTA FISCAL AVULSA (CÓDIGO 1B), NOTA FISCAL DE PRODUTOR (CÓDIGO 04), NF-e (CÓDIGO 55) e NFC-e (CÓDIGO 65)..<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalC100 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  /**
   * REGISTRO C110: INFORMAÇÃO COMPLEMENTAR DA NOTA FISCAL (CÓDIGO 01, 1B, 04 e 55).<br>
   * Chave: COD_INF
   */
  private final LinkedHashMap<String, SPEDFiscalC110> rc110 = new LinkedHashMap<String, SPEDFiscalC110>();

  /**
   * REGISTRO C170: ITENS DO DOCUMENTO (CÓDIGO 01, 1B, 04 e 55)
   */
  private final ArrayList<SPEDFiscalC170> rc170 = new ArrayList<SPEDFiscalC170>();

  /**
   * REGISTRO C190: REGISTRO ANALÍTICO DO DOCUMENTO (CÓDIGO 01, 1B, 04, 55 e 65)
   */
  private final LinkedHashMap<String, SPEDFiscalC190> rc190 = new LinkedHashMap<String, SPEDFiscalC190>();

  /**
   * REGISTRO C195: OBSERVAÇOES DO LANÇAMENTO FISCAL (CÓDIGO 01, 1B, 04 E 55)
   */
  private final LinkedHashMap<String, SPEDFiscalC195> rc195 = new LinkedHashMap<String, SPEDFiscalC195>();

  /**
   * 02 IND_OPER Indicador do tipo de operação:<br>
   * 0- Entrada;<bR>
   * 1 - Saída<br>
   * C 001* - O O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r02_IND_OPER = null;

  /**
   * 03 IND_EMIT Indicador do emitente do documento fiscal:<br>
   * 0- Emissão própria;<br>
   * 1 - Terceiros<br>
   * C 001* - O O<br>
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r03_IND_EMIT = null;

  /**
   * 04 COD_PART Código do participante (campo 02 do Registro 0150):<br>
   * - do emitente do documento ou do remetente das mercadorias, no caso de entradas;<br>
   * - do adquirente, no caso de saídas<br>
   * C 060 - O O
   */
  @SPEDField(maxLength = 60)
  private String r04_COD_PART = null;

  /**
   * 05 COD_MOD Código do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002* - O O
   */
  @SPEDField(maxLength = 2, minLength = 2)
  private String r05_COD_MOD = null;

  /**
   * 06 COD_SIT Código da situação do documento fiscal, conforme a Tabela 4.1.2 N 002* - O O
   */
  @SPEDField(maxLength = 2, minLength = 2)
  private String r06_COD_SIT = null;

  /**
   * 07 SER Série do documento fiscal C 003 - OC OC
   */
  @SPEDField(maxLength = 3, required = false)
  private String r07_SER = null;

  /**
   * 08 NUM_DOC Número do documento fiscal N 009 - O O
   */
  @SPEDField(maxLength = 9)
  private String r08_NUM_DOC = null;

  /**
   * 09 CHV_NFE Chave da Nota Fiscal Eletrônica N 044* - OC OC
   */
  @SPEDField(maxLength = 44, minLength = 44, required = false)
  private String r09_CHV_NFE = null;

  /**
   * 10 DT_DOC Data da emissão do documento fiscal N 008* - O O
   */
  @SPEDField(maxLength = 8)
  private LocalDate r10_DT_DOC = null;

  /**
   * 11 DT_E_S Data da entrada ou da saída N 008* - O OC
   */
  @SPEDField(maxLength = 8, required = false)
  private LocalDate r11_DT_E_S = null;

  /**
   * 12 VL_DOC Valor total do documento fiscal N - 02 O O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r12_VL_DOC = null;

  /**
   * 13 IND_PGTO Indicador do tipo de pagamento:<br>
   * 0- À vista;<br>
   * 1 - A prazo;<br>
   * 9- Sem pagamento.<br>
   * Obs.: A partir de 01/07/2012 passará a ser:<br>
   * Indicador do tipo de pagamento:<br>
   * 0- À vista;<br>
   * 1 - A prazo;<br>
   * 2 - Outros<br>
   * C 001* - O O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r13_IND_PGTO = null;

  /**
   * 14 VL_DESC Valor total do desconto N - 02 OC OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r14_VL_DESC = null;

  /**
   * 15 VL_ABAT_NT Abatimento não tributado e não comercial Ex. desconto ICMS nas remessas para ZFM. N - 02 OC OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r15_VL_ABAT_NT = null;

  /**
   * 16 VL_MERC Valor total das mercadorias e serviços N - 02 O OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r16_VL_MERC = null;

  /**
   * 17 IND_FRT Indicador do tipo do frete:<br>
   * 0- Por conta de terceiros;<br>
   * 1 - Por conta do emitente;<br>
   * 2- Por conta do destinatário;<br>
   * 9- Sem cobrança de frete.<br>
   * Obs.: A partir de 01/01/2012 passará a ser:<br>
   * Indicador do tipo do frete:<br>
   * 0- Por conta do emitente;<br>
   * 1 - Por conta do destinatário/remetente;<br>
   * 2- Por conta de terceiros;<br>
   * 9- Sem cobrança de frete. <br>
   * C 001* - O O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r17_IND_FRT = null;

  /**
   * 18 VL_FRT Valor do frete indicado no documento fiscal N - 02 OC OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r18_VL_FRT = null;

  /**
   * 19 VL_SEG Valor do seguro indicado no documento fiscal N - 02 OC OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r19_VL_SEG = null;

  /**
   * 20 VL_OUT_DA Valor de outras despesas acessórias N - 02 OC OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r20_VL_OUT_DA = null;

  /**
   * 21 VL_BC_ICMS Valor da base de cálculo do ICMS N - 02 OC OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r21_VL_BC_ICMS = null;

  /**
   * 22 VL_ICMS Valor do ICMS N - 02 OC OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r22_VL_ICMS = null;

  /**
   * 23 VL_BC_ICMS_ST Valor da base de cálculo do ICMS substituição tributária N - 02 OC OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r23_VL_BC_ICMS_ST = null;

  /**
   * 24 VL_ICMS_ST Valor do ICMS retido por substituição tributária N - 02 OC OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r24_VL_ICMS_ST = null;

  /**
   * 25 VL_IPI Valor total do IPI N - 02 OC OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r25_VL_IPI = null;

  /**
   * 26 VL_PIS Valor total do PIS N - 02 OC OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r26_VL_PIS = null;

  /**
   * 27 VL_COFINS Valor total da COFINS N - 02 OC OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r27_VL_COFINS = null;

  /**
   * 28 VL_PIS_ST Valor total do PIS retido por substituição tributária N - 02 OC OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r28_VL_PIS_ST = null;

  /**
   * 29 VL_COFINS_ST Valor total da COFINS retido por substituição tributária N - 02 OC OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r29_VL_COFINS_ST = null;

  @Override
  public String get01_Register() {
    return "C100";
  }

  /**
   * Recupera o 02 IND_OPER Indicador do tipo de operação:<br>
   * 0- Entrada;<bR>
   * 1 - Saída<br>
   * C 001* - O O.
   *
   * @return the 02 IND_OPER Indicador do tipo de operação:<br>
   *         0- Entrada;<bR>
   *         1 - Saída<br>
   *         C 001* - O O
   */
  public String getR02_IND_OPER() {
    return r02_IND_OPER;
  }

  /**
   * Define o 02 IND_OPER Indicador do tipo de operação:<br>
   * 0- Entrada;<bR>
   * 1 - Saída<br>
   * C 001* - O O.
   *
   * @param r02_IND_OPER the new 02 IND_OPER Indicador do tipo de operação:<br>
   *          0- Entrada;<bR>
   *          1 - Saída<br>
   *          C 001* - O O
   */
  public void setR02_IND_OPER(String r02_IND_OPER) {
    this.r02_IND_OPER = r02_IND_OPER;
  }

  /**
   * Recupera o 03 IND_EMIT Indicador do emitente do documento fiscal:<br>
   * 0- Emissão própria;<br>
   * 1 - Terceiros<br>
   * C 001* - O O<br>
   * .
   *
   * @return the 03 IND_EMIT Indicador do emitente do documento fiscal:<br>
   *         0- Emissão própria;<br>
   *         1 - Terceiros<br>
   *         C 001* - O O<br>
   */
  public String getR03_IND_EMIT() {
    return r03_IND_EMIT;
  }

  /**
   * Define o 03 IND_EMIT Indicador do emitente do documento fiscal:<br>
   * 0- Emissão própria;<br>
   * 1 - Terceiros<br>
   * C 001* - O O<br>
   * .
   *
   * @param r03_IND_EMIT the new 03 IND_EMIT Indicador do emitente do documento fiscal:<br>
   *          0- Emissão própria;<br>
   *          1 - Terceiros<br>
   *          C 001* - O O<br>
   */
  public void setR03_IND_EMIT(String r03_IND_EMIT) {
    this.r03_IND_EMIT = r03_IND_EMIT;
  }

  /**
   * Recupera o 04 COD_PART Código do participante (campo 02 do Registro 0150):<br>
   * - do emitente do documento ou do remetente das mercadorias, no caso de entradas;<br>
   * - do adquirente, no caso de saídas<br>
   * C 060 - O O.
   *
   * @return the 04 COD_PART Código do participante (campo 02 do Registro 0150):<br>
   *         - do emitente do documento ou do remetente das mercadorias, no caso de entradas;<br>
   *         - do adquirente, no caso de saídas<br>
   *         C 060 - O O
   */
  public String getR04_COD_PART() {
    return r04_COD_PART;
  }

  /**
   * Define o 04 COD_PART Código do participante (campo 02 do Registro 0150):<br>
   * - do emitente do documento ou do remetente das mercadorias, no caso de entradas;<br>
   * - do adquirente, no caso de saídas<br>
   * C 060 - O O.
   *
   * @param r04_COD_PART the new 04 COD_PART Código do participante (campo 02 do Registro 0150):<br>
   *          - do emitente do documento ou do remetente das mercadorias, no caso de entradas;<br>
   *          - do adquirente, no caso de saídas<br>
   *          C 060 - O O
   */
  public void setR04_COD_PART(String r04_COD_PART) {
    this.r04_COD_PART = r04_COD_PART;
  }

  /**
   * Recupera o 05 COD_MOD Código do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002* - O O.
   *
   * @return the 05 COD_MOD Código do modelo do documento fiscal, conforme a Tabela 4
   */
  public String getR05_COD_MOD() {
    return r05_COD_MOD;
  }

  /**
   * Define o 05 COD_MOD Código do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002* - O O.
   *
   * @param r05_COD_MOD the new 05 COD_MOD Código do modelo do documento fiscal, conforme a Tabela 4
   */
  public void setR05_COD_MOD(String r05_COD_MOD) {
    this.r05_COD_MOD = r05_COD_MOD;
  }

  /**
   * Recupera o 06 COD_SIT Código da situação do documento fiscal, conforme a Tabela 4.1.2 N 002* - O O.
   *
   * @return the 06 COD_SIT Código da situação do documento fiscal, conforme a Tabela 4
   */
  public String getR06_COD_SIT() {
    return r06_COD_SIT;
  }

  /**
   * Define o 06 COD_SIT Código da situação do documento fiscal, conforme a Tabela 4.1.2 N 002* - O O.
   *
   * @param r06_COD_SIT the new 06 COD_SIT Código da situação do documento fiscal, conforme a Tabela 4
   */
  public void setR06_COD_SIT(String r06_COD_SIT) {
    this.r06_COD_SIT = r06_COD_SIT;
  }

  /**
   * Recupera o 07 SER Série do documento fiscal C 003 - OC OC.
   *
   * @return the 07 SER Série do documento fiscal C 003 - OC OC
   */
  public String getR07_SER() {
    return r07_SER;
  }

  /**
   * Define o 07 SER Série do documento fiscal C 003 - OC OC.
   *
   * @param r07_SER the new 07 SER Série do documento fiscal C 003 - OC OC
   */
  public void setR07_SER(String r07_SER) {
    this.r07_SER = r07_SER;
  }

  /**
   * Recupera o 08 NUM_DOC Número do documento fiscal N 009 - O O.
   *
   * @return the 08 NUM_DOC Número do documento fiscal N 009 - O O
   */
  public String getR08_NUM_DOC() {
    return r08_NUM_DOC;
  }

  /**
   * Define o 08 NUM_DOC Número do documento fiscal N 009 - O O.
   *
   * @param r08_NUM_DOC the new 08 NUM_DOC Número do documento fiscal N 009 - O O
   */
  public void setR08_NUM_DOC(String r08_NUM_DOC) {
    this.r08_NUM_DOC = r08_NUM_DOC;
  }

  /**
   * Recupera o 09 CHV_NFE Chave da Nota Fiscal Eletrônica N 044* - OC OC.
   *
   * @return the 09 CHV_NFE Chave da Nota Fiscal Eletrônica N 044* - OC OC
   */
  public String getR09_CHV_NFE() {
    return r09_CHV_NFE;
  }

  /**
   * Define o 09 CHV_NFE Chave da Nota Fiscal Eletrônica N 044* - OC OC.
   *
   * @param r09_CHV_NFE the new 09 CHV_NFE Chave da Nota Fiscal Eletrônica N 044* - OC OC
   */
  public void setR09_CHV_NFE(String r09_CHV_NFE) {
    this.r09_CHV_NFE = r09_CHV_NFE;
  }

  /**
   * Recupera o 10 DT_DOC Data da emissão do documento fiscal N 008* - O O.
   *
   * @return the 10 DT_DOC Data da emissão do documento fiscal N 008* - O O
   */
  public LocalDate getR10_DT_DOC() {
    return r10_DT_DOC;
  }

  /**
   * Define o 10 DT_DOC Data da emissão do documento fiscal N 008* - O O.
   *
   * @param r10_DT_DOC the new 10 DT_DOC Data da emissão do documento fiscal N 008* - O O
   */
  public void setR10_DT_DOC(LocalDate r10_DT_DOC) {
    this.r10_DT_DOC = r10_DT_DOC;
  }

  /**
   * Recupera o 11 DT_E_S Data da entrada ou da saída N 008* - O OC.
   *
   * @return the 11 DT_E_S Data da entrada ou da saída N 008* - O OC
   */
  public LocalDate getR11_DT_E_S() {
    return r11_DT_E_S;
  }

  /**
   * Define o 11 DT_E_S Data da entrada ou da saída N 008* - O OC.
   *
   * @param r11_DT_E_S the new 11 DT_E_S Data da entrada ou da saída N 008* - O OC
   */
  public void setR11_DT_E_S(LocalDate r11_DT_E_S) {
    this.r11_DT_E_S = r11_DT_E_S;
  }

  /**
   * Recupera o 12 VL_DOC Valor total do documento fiscal N - 02 O O.
   *
   * @return the 12 VL_DOC Valor total do documento fiscal N - 02 O O
   */
  public BigDecimal getR12_VL_DOC() {
    return r12_VL_DOC;
  }

  /**
   * Define o 12 VL_DOC Valor total do documento fiscal N - 02 O O.
   *
   * @param r12_VL_DOC the new 12 VL_DOC Valor total do documento fiscal N - 02 O O
   */
  public void setR12_VL_DOC(BigDecimal r12_VL_DOC) {
    this.r12_VL_DOC = r12_VL_DOC;
  }

  /**
   * Recupera o 13 IND_PGTO Indicador do tipo de pagamento:<br>
   * 0- À vista;<br>
   * 1 - A prazo;<br>
   * 9- Sem pagamento.<br>
   * Obs.: A partir de 01/07/2012 passará a ser:<br>
   * Indicador do tipo de pagamento:<br>
   * 0- À vista;<br>
   * 1 - A prazo;<br>
   * 2 - Outros<br>
   * C 001* - O O.
   *
   * @return the 13 IND_PGTO Indicador do tipo de pagamento:<br>
   *         0- À vista;<br>
   *         1 - A prazo;<br>
   *         9- Sem pagamento
   */
  public String getR13_IND_PGTO() {
    return r13_IND_PGTO;
  }

  /**
   * Define o 13 IND_PGTO Indicador do tipo de pagamento:<br>
   * 0- À vista;<br>
   * 1 - A prazo;<br>
   * 9- Sem pagamento.<br>
   * Obs.: A partir de 01/07/2012 passará a ser:<br>
   * Indicador do tipo de pagamento:<br>
   * 0- À vista;<br>
   * 1 - A prazo;<br>
   * 2 - Outros<br>
   * C 001* - O O.
   *
   * @param r13_IND_PGTO the new 13 IND_PGTO Indicador do tipo de pagamento:<br>
   *          0- À vista;<br>
   *          1 - A prazo;<br>
   *          9- Sem pagamento
   */
  public void setR13_IND_PGTO(String r13_IND_PGTO) {
    this.r13_IND_PGTO = r13_IND_PGTO;
  }

  /**
   * Recupera o 14 VL_DESC Valor total do desconto N - 02 OC OC.
   *
   * @return the 14 VL_DESC Valor total do desconto N - 02 OC OC
   */
  public BigDecimal getR14_VL_DESC() {
    return r14_VL_DESC;
  }

  /**
   * Define o 14 VL_DESC Valor total do desconto N - 02 OC OC.
   *
   * @param r14_VL_DESC the new 14 VL_DESC Valor total do desconto N - 02 OC OC
   */
  public void setR14_VL_DESC(BigDecimal r14_VL_DESC) {
    this.r14_VL_DESC = r14_VL_DESC;
  }

  /**
   * Recupera o 15 VL_ABAT_NT Abatimento não tributado e não comercial Ex. desconto ICMS nas remessas para ZFM. N - 02 OC OC.
   *
   * @return the 15 VL_ABAT_NT Abatimento não tributado e não comercial Ex
   */
  public BigDecimal getR15_VL_ABAT_NT() {
    return r15_VL_ABAT_NT;
  }

  /**
   * Define o 15 VL_ABAT_NT Abatimento não tributado e não comercial Ex. desconto ICMS nas remessas para ZFM. N - 02 OC OC.
   *
   * @param r15_VL_ABAT_NT the new 15 VL_ABAT_NT Abatimento não tributado e não comercial Ex
   */
  public void setR15_VL_ABAT_NT(BigDecimal r15_VL_ABAT_NT) {
    this.r15_VL_ABAT_NT = r15_VL_ABAT_NT;
  }

  /**
   * Recupera o 16 VL_MERC Valor total das mercadorias e serviços N - 02 O OC.
   *
   * @return the 16 VL_MERC Valor total das mercadorias e serviços N - 02 O OC
   */
  public BigDecimal getR16_VL_MERC() {
    return r16_VL_MERC;
  }

  /**
   * Define o 16 VL_MERC Valor total das mercadorias e serviços N - 02 O OC.
   *
   * @param r16_VL_MERC the new 16 VL_MERC Valor total das mercadorias e serviços N - 02 O OC
   */
  public void setR16_VL_MERC(BigDecimal r16_VL_MERC) {
    this.r16_VL_MERC = r16_VL_MERC;
  }

  /**
   * Recupera o 17 IND_FRT Indicador do tipo do frete:<br>
   * 0- Por conta de terceiros;<br>
   * 1 - Por conta do emitente;<br>
   * 2- Por conta do destinatário;<br>
   * 9- Sem cobrança de frete.<br>
   * Obs.: A partir de 01/01/2012 passará a ser:<br>
   * Indicador do tipo do frete:<br>
   * 0- Por conta do emitente;<br>
   * 1 - Por conta do destinatário/remetente;<br>
   * 2- Por conta de terceiros;<br>
   * 9- Sem cobrança de frete. <br>
   * C 001* - O O.
   *
   * @return the 17 IND_FRT Indicador do tipo do frete:<br>
   *         0- Por conta de terceiros;<br>
   *         1 - Por conta do emitente;<br>
   *         2- Por conta do destinatário;<br>
   *         9- Sem cobrança de frete
   */
  public String getR17_IND_FRT() {
    return r17_IND_FRT;
  }

  /**
   * Define o 17 IND_FRT Indicador do tipo do frete:<br>
   * 0- Por conta de terceiros;<br>
   * 1 - Por conta do emitente;<br>
   * 2- Por conta do destinatário;<br>
   * 9- Sem cobrança de frete.<br>
   * Obs.: A partir de 01/01/2012 passará a ser:<br>
   * Indicador do tipo do frete:<br>
   * 0- Por conta do emitente;<br>
   * 1 - Por conta do destinatário/remetente;<br>
   * 2- Por conta de terceiros;<br>
   * 9- Sem cobrança de frete. <br>
   * C 001* - O O.
   *
   * @param r17_IND_FRT the new 17 IND_FRT Indicador do tipo do frete:<br>
   *          0- Por conta de terceiros;<br>
   *          1 - Por conta do emitente;<br>
   *          2- Por conta do destinatário;<br>
   *          9- Sem cobrança de frete
   */
  public void setR17_IND_FRT(String r17_IND_FRT) {
    this.r17_IND_FRT = r17_IND_FRT;
  }

  /**
   * Recupera o 18 VL_FRT Valor do frete indicado no documento fiscal N - 02 OC OC.
   *
   * @return the 18 VL_FRT Valor do frete indicado no documento fiscal N - 02 OC OC
   */
  public BigDecimal getR18_VL_FRT() {
    return r18_VL_FRT;
  }

  /**
   * Define o 18 VL_FRT Valor do frete indicado no documento fiscal N - 02 OC OC.
   *
   * @param r18_VL_FRT the new 18 VL_FRT Valor do frete indicado no documento fiscal N - 02 OC OC
   */
  public void setR18_VL_FRT(BigDecimal r18_VL_FRT) {
    this.r18_VL_FRT = r18_VL_FRT;
  }

  /**
   * Recupera o 19 VL_SEG Valor do seguro indicado no documento fiscal N - 02 OC OC.
   *
   * @return the 19 VL_SEG Valor do seguro indicado no documento fiscal N - 02 OC OC
   */
  public BigDecimal getR19_VL_SEG() {
    return r19_VL_SEG;
  }

  /**
   * Define o 19 VL_SEG Valor do seguro indicado no documento fiscal N - 02 OC OC.
   *
   * @param r19_VL_SEG the new 19 VL_SEG Valor do seguro indicado no documento fiscal N - 02 OC OC
   */
  public void setR19_VL_SEG(BigDecimal r19_VL_SEG) {
    this.r19_VL_SEG = r19_VL_SEG;
  }

  /**
   * Recupera o 20 VL_OUT_DA Valor de outras despesas acessórias N - 02 OC OC.
   *
   * @return the 20 VL_OUT_DA Valor de outras despesas acessórias N - 02 OC OC
   */
  public BigDecimal getR20_VL_OUT_DA() {
    return r20_VL_OUT_DA;
  }

  /**
   * Define o 20 VL_OUT_DA Valor de outras despesas acessórias N - 02 OC OC.
   *
   * @param r20_VL_OUT_DA the new 20 VL_OUT_DA Valor de outras despesas acessórias N - 02 OC OC
   */
  public void setR20_VL_OUT_DA(BigDecimal r20_VL_OUT_DA) {
    this.r20_VL_OUT_DA = r20_VL_OUT_DA;
  }

  /**
   * Recupera o 21 VL_BC_ICMS Valor da base de cálculo do ICMS N - 02 OC OC.
   *
   * @return the 21 VL_BC_ICMS Valor da base de cálculo do ICMS N - 02 OC OC
   */
  public BigDecimal getR21_VL_BC_ICMS() {
    return r21_VL_BC_ICMS;
  }

  /**
   * Define o 21 VL_BC_ICMS Valor da base de cálculo do ICMS N - 02 OC OC.
   *
   * @param r21_VL_BC_ICMS the new 21 VL_BC_ICMS Valor da base de cálculo do ICMS N - 02 OC OC
   */
  public void setR21_VL_BC_ICMS(BigDecimal r21_VL_BC_ICMS) {
    this.r21_VL_BC_ICMS = r21_VL_BC_ICMS;
  }

  /**
   * Recupera o 22 VL_ICMS Valor do ICMS N - 02 OC OC.
   *
   * @return the 22 VL_ICMS Valor do ICMS N - 02 OC OC
   */
  public BigDecimal getR22_VL_ICMS() {
    return r22_VL_ICMS;
  }

  /**
   * Define o 22 VL_ICMS Valor do ICMS N - 02 OC OC.
   *
   * @param r22_VL_ICMS the new 22 VL_ICMS Valor do ICMS N - 02 OC OC
   */
  public void setR22_VL_ICMS(BigDecimal r22_VL_ICMS) {
    this.r22_VL_ICMS = r22_VL_ICMS;
  }

  /**
   * Recupera o 23 VL_BC_ICMS_ST Valor da base de cálculo do ICMS substituição tributária N - 02 OC OC.
   *
   * @return the 23 VL_BC_ICMS_ST Valor da base de cálculo do ICMS substituição tributária N - 02 OC OC
   */
  public BigDecimal getR23_VL_BC_ICMS_ST() {
    return r23_VL_BC_ICMS_ST;
  }

  /**
   * Define o 23 VL_BC_ICMS_ST Valor da base de cálculo do ICMS substituição tributária N - 02 OC OC.
   *
   * @param r23_VL_BC_ICMS_ST the new 23 VL_BC_ICMS_ST Valor da base de cálculo do ICMS substituição tributária N - 02 OC OC
   */
  public void setR23_VL_BC_ICMS_ST(BigDecimal r23_VL_BC_ICMS_ST) {
    this.r23_VL_BC_ICMS_ST = r23_VL_BC_ICMS_ST;
  }

  /**
   * Recupera o 24 VL_ICMS_ST Valor do ICMS retido por substituição tributária N - 02 OC OC.
   *
   * @return the 24 VL_ICMS_ST Valor do ICMS retido por substituição tributária N - 02 OC OC
   */
  public BigDecimal getR24_VL_ICMS_ST() {
    return r24_VL_ICMS_ST;
  }

  /**
   * Define o 24 VL_ICMS_ST Valor do ICMS retido por substituição tributária N - 02 OC OC.
   *
   * @param r24_VL_ICMS_ST the new 24 VL_ICMS_ST Valor do ICMS retido por substituição tributária N - 02 OC OC
   */
  public void setR24_VL_ICMS_ST(BigDecimal r24_VL_ICMS_ST) {
    this.r24_VL_ICMS_ST = r24_VL_ICMS_ST;
  }

  /**
   * Recupera o 25 VL_IPI Valor total do IPI N - 02 OC OC.
   *
   * @return the 25 VL_IPI Valor total do IPI N - 02 OC OC
   */
  public BigDecimal getR25_VL_IPI() {
    return r25_VL_IPI;
  }

  /**
   * Define o 25 VL_IPI Valor total do IPI N - 02 OC OC.
   *
   * @param r25_VL_IPI the new 25 VL_IPI Valor total do IPI N - 02 OC OC
   */
  public void setR25_VL_IPI(BigDecimal r25_VL_IPI) {
    this.r25_VL_IPI = r25_VL_IPI;
  }

  /**
   * Recupera o 26 VL_PIS Valor total do PIS N - 02 OC OC.
   *
   * @return the 26 VL_PIS Valor total do PIS N - 02 OC OC
   */
  public BigDecimal getR26_VL_PIS() {
    return r26_VL_PIS;
  }

  /**
   * Define o 26 VL_PIS Valor total do PIS N - 02 OC OC.
   *
   * @param r26_VL_PIS the new 26 VL_PIS Valor total do PIS N - 02 OC OC
   */
  public void setR26_VL_PIS(BigDecimal r26_VL_PIS) {
    this.r26_VL_PIS = r26_VL_PIS;
  }

  /**
   * Recupera o 27 VL_COFINS Valor total da COFINS N - 02 OC OC.
   *
   * @return the 27 VL_COFINS Valor total da COFINS N - 02 OC OC
   */
  public BigDecimal getR27_VL_COFINS() {
    return r27_VL_COFINS;
  }

  /**
   * Define o 27 VL_COFINS Valor total da COFINS N - 02 OC OC.
   *
   * @param r27_VL_COFINS the new 27 VL_COFINS Valor total da COFINS N - 02 OC OC
   */
  public void setR27_VL_COFINS(BigDecimal r27_VL_COFINS) {
    this.r27_VL_COFINS = r27_VL_COFINS;
  }

  /**
   * Recupera o 28 VL_PIS_ST Valor total do PIS retido por substituição tributária N - 02 OC OC.
   *
   * @return the 28 VL_PIS_ST Valor total do PIS retido por substituição tributária N - 02 OC OC
   */
  public BigDecimal getR28_VL_PIS_ST() {
    return r28_VL_PIS_ST;
  }

  /**
   * Define o 28 VL_PIS_ST Valor total do PIS retido por substituição tributária N - 02 OC OC.
   *
   * @param r28_VL_PIS_ST the new 28 VL_PIS_ST Valor total do PIS retido por substituição tributária N - 02 OC OC
   */
  public void setR28_VL_PIS_ST(BigDecimal r28_VL_PIS_ST) {
    this.r28_VL_PIS_ST = r28_VL_PIS_ST;
  }

  /**
   * Recupera o 29 VL_COFINS_ST Valor total da COFINS retido por substituição tributária N - 02 OC OC.
   *
   * @return the 29 VL_COFINS_ST Valor total da COFINS retido por substituição tributária N - 02 OC OC
   */
  public BigDecimal getR29_VL_COFINS_ST() {
    return r29_VL_COFINS_ST;
  }

  /**
   * Define o 29 VL_COFINS_ST Valor total da COFINS retido por substituição tributária N - 02 OC OC.
   *
   * @param r29_VL_COFINS_ST the new 29 VL_COFINS_ST Valor total da COFINS retido por substituição tributária N - 02 OC OC
   */
  public void setR29_VL_COFINS_ST(BigDecimal r29_VL_COFINS_ST) {
    this.r29_VL_COFINS_ST = r29_VL_COFINS_ST;
  }

  /**
   * Recupera o rEGISTRO C110: INFORMAÇÃO COMPLEMENTAR DA NOTA FISCAL (CÓDIGO 01, 1B, 04 e 55).<br>
   * Chave: COD_INF.
   *
   * @return the rEGISTRO C110: INFORMAÇÃO COMPLEMENTAR DA NOTA FISCAL (CÓDIGO 01, 1B, 04 e 55)
   */
  public LinkedHashMap<String, SPEDFiscalC110> getRc110() {
    return rc110;
  }

  /**
   * Recupera o rEGISTRO C170: ITENS DO DOCUMENTO (CÓDIGO 01, 1B, 04 e 55).
   *
   * @return the rEGISTRO C170: ITENS DO DOCUMENTO (CÓDIGO 01, 1B, 04 e 55)
   */
  public ArrayList<SPEDFiscalC170> getRc170() {
    return rc170;
  }

  /**
   * Recupera o rEGISTRO C190: REGISTRO ANALÍTICO DO DOCUMENTO (CÓDIGO 01, 1B, 04, 55 e 65).
   *
   * @return the rEGISTRO C190: REGISTRO ANALÍTICO DO DOCUMENTO (CÓDIGO 01, 1B, 04, 55 e 65)
   */
  public LinkedHashMap<String, SPEDFiscalC190> getRc190() {
    return rc190;
  }

  /**
   * Recupera o rEGISTRO C195: OBSERVAÇOES DO LANÇAMENTO FISCAL (CÓDIGO 01, 1B, 04 E 55).
   *
   * @return the rEGISTRO C195: OBSERVAÇOES DO LANÇAMENTO FISCAL (CÓDIGO 01, 1B, 04 E 55)
   */
  public LinkedHashMap<String, SPEDFiscalC195> getRc195() {
    return rc195;
  }

}