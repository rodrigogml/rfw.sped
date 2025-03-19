package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO E116: OBRIGA��ES DO ICMS RECOLHIDO OU A RECOLHER � OPERA��ES PR�PRIAS<Br>
 * <br>
 * 5.4- TABELA DE C�DIGOS DAS OBRIGA��ES DE ICMS A RECOLHER<br>
 * C�d Descri��o<br>
 * 000 ICMS a recolher<br>
 * 001 ICMS da substitui��o tribut�ria pelas entradas<br>
 * 002 ICMS da S.T pelas sa�das para o Estado<br>
 * 003 Antecipa��o do diferencial de al�quotas do ICMS<br>
 * 004 Antecipa��o do ICMS da importa��o<br>
 * 005 Antecipa��o tribut�ria<br>
 * 006 ICMS da al�q. adic. dos itens inclu�dos no Fundo de Combate � Pobreza<br>
 * 090 Outras obriga��es do ICMS<br>
 * 999 ICMS da substitui��o tribut�ria pelas sa�das para outro Estado<br>
 * <br>
 * C�digos Recolhimento GARE ICMS:<br>
 * 046-2 ICMS - Regime peri�dico de apura��o<br>
 * 060-7 ICMS - Regime de Estimativa<br>
 * 063-2 ICMS - Outros recolhimentos especiais<br>
 * 075-9 ICMS - D�vida Ativa - Cob. amig�vel - liq. integral ou parcial<br>
 * 077-2 ICMS - D�vida Ativa ajuizada - parcelamento<br>
 * 078-4 ICMS - D�vida Ativa ajuizada - liq. integral ou parcial<br>
 * 081-4 ICMS - Parcelamento de d�bito fiscal n�o inscrito<br>
 * 106-5 ICMS - Exigido em auto de infra��o e imposi��o de multa - AIIM<br>
 * 110-7 ICMS - Transporte (transportador aut�nomo do estado de S�o Paulo)<br>
 * 112-0 ICMS - Comunica��o (no estado de S�o Paulo)<br>
 * 114-4 ICMS - Mercadorias destinadas a consumo ou ativo fixo<br>
 * 115-6 ICMS - Energia el�trica (no estado de S�o Paulo)<br>
 * 117-0 ICMS - Combust�vel (no estado de S�o Paulo)<br>
 * 120-0 ICMS - Mercadoria importada (desembara�ada no estado de S�o Paulo)<br>
 * 123-5 ICMS - Exporta��o de caf� cru<br>
 * 128-4 ICMS - Opera��es internas e interestaduais com caf� cru<br>
 * 137-5 ICMS - Abate de gado<br>
 * 141-7 ICMS - Opera��es com feij�o<br>
 * 146-6 ICMS - Substitui��o tribut�ria (contribuinte do estado de S�o Paulo)<br>
 * 154-5 ICMS - Diferen�a de estimativa<br>
 * 640-3 Multa por infra��o � legisla��o do ICMS<br>
 * 892-8 Outros valores n�o discriminados<br>
 *
 * @author Rodrigo Leit�o
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalE116 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscalE116(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 COD_OR C�digo da obriga��o a recolher, conforme a Tabela 5.4 C 003* - O
   */
  @SPEDField(maxLength = 3, minLength = 3)
  private String r02_COD_OR = null;

  /**
   * 03 VL_OR Valor da obriga��o a recolher N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r03_VL_OR = null;

  /**
   * 04 DT_VCTO Data de vencimento da obriga��o N 008* - O
   */
  @SPEDField(maxLength = 8)
  private LocalDate r04_DT_VCTO = null;

  /**
   * 05 COD_REC C�digo de receita referente � obriga��o, pr�prio da unidade da federa��o, conforme legisla��o estadual. C - - O
   */
  @SPEDField(maxLength = 255)
  private String r05_COD_REC = null;

  /**
   * 06 NUM_PROC N�mero do processo ou auto de infra��o ao qual a obriga��o est� vinculada, se houver. C 015 - OC
   */
  @SPEDField(maxLength = 15, required = false)
  private String r06_NUM_PROC = null;

  /**
   * 07 IND_PROC Indicador da origem do processo: 0- SEFAZ; 1- Justi�a Federal; 2- Justi�a Estadual; 9- Outros C 001* - OC
   */
  @SPEDField(maxLength = 1, minLength = 1, required = false)
  private String r07_IND_PROC = null;

  /**
   * 08 PROC Descri��o resumida do processo que embasou o lan�amento C - - OC
   */
  @SPEDField(maxLength = 5000, required = false)
  private String r08_PROC = null;

  /**
   * 09 TXT_COMPL Descri��o complementar das obriga��es a recolher. C - - OC
   */
  @SPEDField(maxLength = 50000, required = false)
  private String r09_TXT_COMPL = null;

  /**
   * 10 MES_REF* Informe o m�s de refer�ncia no formato �mmaaaa� N 006* - O
   */
  @SPEDField(maxLength = 6)
  private LocalDate r10_MES_REF = null;

  @Override
  public String get01_Register() {
    return "E116";
  }

  /**
   * Recupera o 02 COD_OR C�digo da obriga��o a recolher, conforme a Tabela 5.4 C 003* - O.
   *
   * @return the 02 COD_OR C�digo da obriga��o a recolher, conforme a Tabela 5
   */
  public String getR02_COD_OR() {
    return r02_COD_OR;
  }

  /**
   * Define o 02 COD_OR C�digo da obriga��o a recolher, conforme a Tabela 5.4 C 003* - O.
   *
   * @param r02_COD_OR the new 02 COD_OR C�digo da obriga��o a recolher, conforme a Tabela 5
   */
  public void setR02_COD_OR(String r02_COD_OR) {
    this.r02_COD_OR = r02_COD_OR;
  }

  /**
   * Recupera o 03 VL_OR Valor da obriga��o a recolher N - 02 O.
   *
   * @return the 03 VL_OR Valor da obriga��o a recolher N - 02 O
   */
  public BigDecimal getR03_VL_OR() {
    return r03_VL_OR;
  }

  /**
   * Define o 03 VL_OR Valor da obriga��o a recolher N - 02 O.
   *
   * @param r03_VL_OR the new 03 VL_OR Valor da obriga��o a recolher N - 02 O
   */
  public void setR03_VL_OR(BigDecimal r03_VL_OR) {
    this.r03_VL_OR = r03_VL_OR;
  }

  /**
   * Recupera o 04 DT_VCTO Data de vencimento da obriga��o N 008* - O.
   *
   * @return the 04 DT_VCTO Data de vencimento da obriga��o N 008* - O
   */
  public LocalDate getR04_DT_VCTO() {
    return r04_DT_VCTO;
  }

  /**
   * Define o 04 DT_VCTO Data de vencimento da obriga��o N 008* - O.
   *
   * @param r04_DT_VCTO the new 04 DT_VCTO Data de vencimento da obriga��o N 008* - O
   */
  public void setR04_DT_VCTO(LocalDate r04_DT_VCTO) {
    this.r04_DT_VCTO = r04_DT_VCTO;
  }

  /**
   * Recupera o 05 COD_REC C�digo de receita referente � obriga��o, pr�prio da unidade da federa��o, conforme legisla��o estadual. C - - O.
   *
   * @return the 05 COD_REC C�digo de receita referente � obriga��o, pr�prio da unidade da federa��o, conforme legisla��o estadual
   */
  public String getR05_COD_REC() {
    return r05_COD_REC;
  }

  /**
   * Define o 05 COD_REC C�digo de receita referente � obriga��o, pr�prio da unidade da federa��o, conforme legisla��o estadual. C - - O.
   *
   * @param r05_COD_REC the new 05 COD_REC C�digo de receita referente � obriga��o, pr�prio da unidade da federa��o, conforme legisla��o estadual
   */
  public void setR05_COD_REC(String r05_COD_REC) {
    this.r05_COD_REC = r05_COD_REC;
  }

  /**
   * Recupera o 06 NUM_PROC N�mero do processo ou auto de infra��o ao qual a obriga��o est� vinculada, se houver. C 015 - OC.
   *
   * @return the 06 NUM_PROC N�mero do processo ou auto de infra��o ao qual a obriga��o est� vinculada, se houver
   */
  public String getR06_NUM_PROC() {
    return r06_NUM_PROC;
  }

  /**
   * Define o 06 NUM_PROC N�mero do processo ou auto de infra��o ao qual a obriga��o est� vinculada, se houver. C 015 - OC.
   *
   * @param r06_NUM_PROC the new 06 NUM_PROC N�mero do processo ou auto de infra��o ao qual a obriga��o est� vinculada, se houver
   */
  public void setR06_NUM_PROC(String r06_NUM_PROC) {
    this.r06_NUM_PROC = r06_NUM_PROC;
  }

  /**
   * Recupera o 07 IND_PROC Indicador da origem do processo: 0- SEFAZ; 1- Justi�a Federal; 2- Justi�a Estadual; 9- Outros C 001* - OC.
   *
   * @return the 07 IND_PROC Indicador da origem do processo: 0- SEFAZ; 1- Justi�a Federal; 2- Justi�a Estadual; 9- Outros C 001* - OC
   */
  public String getR07_IND_PROC() {
    return r07_IND_PROC;
  }

  /**
   * Define o 07 IND_PROC Indicador da origem do processo: 0- SEFAZ; 1- Justi�a Federal; 2- Justi�a Estadual; 9- Outros C 001* - OC.
   *
   * @param r07_IND_PROC the new 07 IND_PROC Indicador da origem do processo: 0- SEFAZ; 1- Justi�a Federal; 2- Justi�a Estadual; 9- Outros C 001* - OC
   */
  public void setR07_IND_PROC(String r07_IND_PROC) {
    this.r07_IND_PROC = r07_IND_PROC;
  }

  /**
   * Recupera o 08 PROC Descri��o resumida do processo que embasou o lan�amento C - - OC.
   *
   * @return the 08 PROC Descri��o resumida do processo que embasou o lan�amento C - - OC
   */
  public String getR08_PROC() {
    return r08_PROC;
  }

  /**
   * Define o 08 PROC Descri��o resumida do processo que embasou o lan�amento C - - OC.
   *
   * @param r08_PROC the new 08 PROC Descri��o resumida do processo que embasou o lan�amento C - - OC
   */
  public void setR08_PROC(String r08_PROC) {
    this.r08_PROC = r08_PROC;
  }

  /**
   * Recupera o 09 TXT_COMPL Descri��o complementar das obriga��es a recolher. C - - OC.
   *
   * @return the 09 TXT_COMPL Descri��o complementar das obriga��es a recolher
   */
  public String getR09_TXT_COMPL() {
    return r09_TXT_COMPL;
  }

  /**
   * Define o 09 TXT_COMPL Descri��o complementar das obriga��es a recolher. C - - OC.
   *
   * @param r09_TXT_COMPL the new 09 TXT_COMPL Descri��o complementar das obriga��es a recolher
   */
  public void setR09_TXT_COMPL(String r09_TXT_COMPL) {
    this.r09_TXT_COMPL = r09_TXT_COMPL;
  }

  /**
   * Recupera o 10 MES_REF* Informe o m�s de refer�ncia no formato �mmaaaa� N 006* - O.
   *
   * @return the 10 MES_REF* Informe o m�s de refer�ncia no formato �mmaaaa� N 006* - O
   */
  public LocalDate getR10_MES_REF() {
    return r10_MES_REF;
  }

  /**
   * Define o 10 MES_REF* Informe o m�s de refer�ncia no formato �mmaaaa� N 006* - O.
   *
   * @param r10_MES_REF the new 10 MES_REF* Informe o m�s de refer�ncia no formato �mmaaaa� N 006* - O
   */
  public void setR10_MES_REF(LocalDate r10_MES_REF) {
    this.r10_MES_REF = r10_MES_REF;
  }

}