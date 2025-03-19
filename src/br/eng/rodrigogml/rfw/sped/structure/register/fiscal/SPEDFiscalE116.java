package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO E116: OBRIGAÇÕES DO ICMS RECOLHIDO OU A RECOLHER – OPERAÇÕES PRÓPRIAS<Br>
 * <br>
 * 5.4- TABELA DE CÓDIGOS DAS OBRIGAÇÕES DE ICMS A RECOLHER<br>
 * Cód Descrição<br>
 * 000 ICMS a recolher<br>
 * 001 ICMS da substituição tributária pelas entradas<br>
 * 002 ICMS da S.T pelas saídas para o Estado<br>
 * 003 Antecipação do diferencial de alíquotas do ICMS<br>
 * 004 Antecipação do ICMS da importação<br>
 * 005 Antecipação tributária<br>
 * 006 ICMS da alíq. adic. dos itens incluídos no Fundo de Combate à Pobreza<br>
 * 090 Outras obrigações do ICMS<br>
 * 999 ICMS da substituição tributária pelas saídas para outro Estado<br>
 * <br>
 * Códigos Recolhimento GARE ICMS:<br>
 * 046-2 ICMS - Regime periódico de apuração<br>
 * 060-7 ICMS - Regime de Estimativa<br>
 * 063-2 ICMS - Outros recolhimentos especiais<br>
 * 075-9 ICMS - Dívida Ativa - Cob. amigável - liq. integral ou parcial<br>
 * 077-2 ICMS - Dívida Ativa ajuizada - parcelamento<br>
 * 078-4 ICMS - Dívida Ativa ajuizada - liq. integral ou parcial<br>
 * 081-4 ICMS - Parcelamento de débito fiscal não inscrito<br>
 * 106-5 ICMS - Exigido em auto de infração e imposição de multa - AIIM<br>
 * 110-7 ICMS - Transporte (transportador autônomo do estado de São Paulo)<br>
 * 112-0 ICMS - Comunicação (no estado de São Paulo)<br>
 * 114-4 ICMS - Mercadorias destinadas a consumo ou ativo fixo<br>
 * 115-6 ICMS - Energia elétrica (no estado de São Paulo)<br>
 * 117-0 ICMS - Combustível (no estado de São Paulo)<br>
 * 120-0 ICMS - Mercadoria importada (desembaraçada no estado de São Paulo)<br>
 * 123-5 ICMS - Exportação de café cru<br>
 * 128-4 ICMS - Operações internas e interestaduais com café cru<br>
 * 137-5 ICMS - Abate de gado<br>
 * 141-7 ICMS - Operações com feijão<br>
 * 146-6 ICMS - Substituição tributária (contribuinte do estado de São Paulo)<br>
 * 154-5 ICMS - Diferença de estimativa<br>
 * 640-3 Multa por infração à legislação do ICMS<br>
 * 892-8 Outros valores não discriminados<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalE116 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscalE116(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 COD_OR Código da obrigação a recolher, conforme a Tabela 5.4 C 003* - O
   */
  @SPEDField(maxLength = 3, minLength = 3)
  private String r02_COD_OR = null;

  /**
   * 03 VL_OR Valor da obrigação a recolher N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r03_VL_OR = null;

  /**
   * 04 DT_VCTO Data de vencimento da obrigação N 008* - O
   */
  @SPEDField(maxLength = 8)
  private LocalDate r04_DT_VCTO = null;

  /**
   * 05 COD_REC Código de receita referente à obrigação, próprio da unidade da federação, conforme legislação estadual. C - - O
   */
  @SPEDField(maxLength = 255)
  private String r05_COD_REC = null;

  /**
   * 06 NUM_PROC Número do processo ou auto de infração ao qual a obrigação está vinculada, se houver. C 015 - OC
   */
  @SPEDField(maxLength = 15, required = false)
  private String r06_NUM_PROC = null;

  /**
   * 07 IND_PROC Indicador da origem do processo: 0- SEFAZ; 1- Justiça Federal; 2- Justiça Estadual; 9- Outros C 001* - OC
   */
  @SPEDField(maxLength = 1, minLength = 1, required = false)
  private String r07_IND_PROC = null;

  /**
   * 08 PROC Descrição resumida do processo que embasou o lançamento C - - OC
   */
  @SPEDField(maxLength = 5000, required = false)
  private String r08_PROC = null;

  /**
   * 09 TXT_COMPL Descrição complementar das obrigações a recolher. C - - OC
   */
  @SPEDField(maxLength = 50000, required = false)
  private String r09_TXT_COMPL = null;

  /**
   * 10 MES_REF* Informe o mês de referência no formato “mmaaaa” N 006* - O
   */
  @SPEDField(maxLength = 6)
  private LocalDate r10_MES_REF = null;

  @Override
  public String get01_Register() {
    return "E116";
  }

  /**
   * Recupera o 02 COD_OR Código da obrigação a recolher, conforme a Tabela 5.4 C 003* - O.
   *
   * @return the 02 COD_OR Código da obrigação a recolher, conforme a Tabela 5
   */
  public String getR02_COD_OR() {
    return r02_COD_OR;
  }

  /**
   * Define o 02 COD_OR Código da obrigação a recolher, conforme a Tabela 5.4 C 003* - O.
   *
   * @param r02_COD_OR the new 02 COD_OR Código da obrigação a recolher, conforme a Tabela 5
   */
  public void setR02_COD_OR(String r02_COD_OR) {
    this.r02_COD_OR = r02_COD_OR;
  }

  /**
   * Recupera o 03 VL_OR Valor da obrigação a recolher N - 02 O.
   *
   * @return the 03 VL_OR Valor da obrigação a recolher N - 02 O
   */
  public BigDecimal getR03_VL_OR() {
    return r03_VL_OR;
  }

  /**
   * Define o 03 VL_OR Valor da obrigação a recolher N - 02 O.
   *
   * @param r03_VL_OR the new 03 VL_OR Valor da obrigação a recolher N - 02 O
   */
  public void setR03_VL_OR(BigDecimal r03_VL_OR) {
    this.r03_VL_OR = r03_VL_OR;
  }

  /**
   * Recupera o 04 DT_VCTO Data de vencimento da obrigação N 008* - O.
   *
   * @return the 04 DT_VCTO Data de vencimento da obrigação N 008* - O
   */
  public LocalDate getR04_DT_VCTO() {
    return r04_DT_VCTO;
  }

  /**
   * Define o 04 DT_VCTO Data de vencimento da obrigação N 008* - O.
   *
   * @param r04_DT_VCTO the new 04 DT_VCTO Data de vencimento da obrigação N 008* - O
   */
  public void setR04_DT_VCTO(LocalDate r04_DT_VCTO) {
    this.r04_DT_VCTO = r04_DT_VCTO;
  }

  /**
   * Recupera o 05 COD_REC Código de receita referente à obrigação, próprio da unidade da federação, conforme legislação estadual. C - - O.
   *
   * @return the 05 COD_REC Código de receita referente à obrigação, próprio da unidade da federação, conforme legislação estadual
   */
  public String getR05_COD_REC() {
    return r05_COD_REC;
  }

  /**
   * Define o 05 COD_REC Código de receita referente à obrigação, próprio da unidade da federação, conforme legislação estadual. C - - O.
   *
   * @param r05_COD_REC the new 05 COD_REC Código de receita referente à obrigação, próprio da unidade da federação, conforme legislação estadual
   */
  public void setR05_COD_REC(String r05_COD_REC) {
    this.r05_COD_REC = r05_COD_REC;
  }

  /**
   * Recupera o 06 NUM_PROC Número do processo ou auto de infração ao qual a obrigação está vinculada, se houver. C 015 - OC.
   *
   * @return the 06 NUM_PROC Número do processo ou auto de infração ao qual a obrigação está vinculada, se houver
   */
  public String getR06_NUM_PROC() {
    return r06_NUM_PROC;
  }

  /**
   * Define o 06 NUM_PROC Número do processo ou auto de infração ao qual a obrigação está vinculada, se houver. C 015 - OC.
   *
   * @param r06_NUM_PROC the new 06 NUM_PROC Número do processo ou auto de infração ao qual a obrigação está vinculada, se houver
   */
  public void setR06_NUM_PROC(String r06_NUM_PROC) {
    this.r06_NUM_PROC = r06_NUM_PROC;
  }

  /**
   * Recupera o 07 IND_PROC Indicador da origem do processo: 0- SEFAZ; 1- Justiça Federal; 2- Justiça Estadual; 9- Outros C 001* - OC.
   *
   * @return the 07 IND_PROC Indicador da origem do processo: 0- SEFAZ; 1- Justiça Federal; 2- Justiça Estadual; 9- Outros C 001* - OC
   */
  public String getR07_IND_PROC() {
    return r07_IND_PROC;
  }

  /**
   * Define o 07 IND_PROC Indicador da origem do processo: 0- SEFAZ; 1- Justiça Federal; 2- Justiça Estadual; 9- Outros C 001* - OC.
   *
   * @param r07_IND_PROC the new 07 IND_PROC Indicador da origem do processo: 0- SEFAZ; 1- Justiça Federal; 2- Justiça Estadual; 9- Outros C 001* - OC
   */
  public void setR07_IND_PROC(String r07_IND_PROC) {
    this.r07_IND_PROC = r07_IND_PROC;
  }

  /**
   * Recupera o 08 PROC Descrição resumida do processo que embasou o lançamento C - - OC.
   *
   * @return the 08 PROC Descrição resumida do processo que embasou o lançamento C - - OC
   */
  public String getR08_PROC() {
    return r08_PROC;
  }

  /**
   * Define o 08 PROC Descrição resumida do processo que embasou o lançamento C - - OC.
   *
   * @param r08_PROC the new 08 PROC Descrição resumida do processo que embasou o lançamento C - - OC
   */
  public void setR08_PROC(String r08_PROC) {
    this.r08_PROC = r08_PROC;
  }

  /**
   * Recupera o 09 TXT_COMPL Descrição complementar das obrigações a recolher. C - - OC.
   *
   * @return the 09 TXT_COMPL Descrição complementar das obrigações a recolher
   */
  public String getR09_TXT_COMPL() {
    return r09_TXT_COMPL;
  }

  /**
   * Define o 09 TXT_COMPL Descrição complementar das obrigações a recolher. C - - OC.
   *
   * @param r09_TXT_COMPL the new 09 TXT_COMPL Descrição complementar das obrigações a recolher
   */
  public void setR09_TXT_COMPL(String r09_TXT_COMPL) {
    this.r09_TXT_COMPL = r09_TXT_COMPL;
  }

  /**
   * Recupera o 10 MES_REF* Informe o mês de referência no formato “mmaaaa” N 006* - O.
   *
   * @return the 10 MES_REF* Informe o mês de referência no formato “mmaaaa” N 006* - O
   */
  public LocalDate getR10_MES_REF() {
    return r10_MES_REF;
  }

  /**
   * Define o 10 MES_REF* Informe o mês de referência no formato “mmaaaa” N 006* - O.
   *
   * @param r10_MES_REF the new 10 MES_REF* Informe o mês de referência no formato “mmaaaa” N 006* - O
   */
  public void setR10_MES_REF(LocalDate r10_MES_REF) {
    this.r10_MES_REF = r10_MES_REF;
  }

}