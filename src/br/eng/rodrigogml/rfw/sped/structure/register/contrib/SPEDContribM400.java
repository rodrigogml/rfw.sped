package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO M400: RECEITAS ISENTAS, N�O ALCAN�ADAS PELA INCID�NCIA DA CONTRIBUI��O, SUJEITAS A AL�QUOTA ZERO OU DE VENDAS COM SUSPENS�O � PIS/PASEP.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribM400 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  public SPEDContribM400(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * REGISTRO M410: DETALHAMENTO DAS RECEITAS ISENTAS, N�O ALCAN�ADAS PELA INCID�NCIA DA CONTRIBUI��O, SUJEITAS A AL�QUOTA ZERO OU DE VENDAS COM SUSPENS�O � PIS/PASEP<br>
   * <b>ATEN��O:</B> Note que este registro deve ser distinto para cada "NAT_REC + COD_CTA + DESC_COMPL" conforme a documenta��o. Mas como BIS ainda n�o tem suporte para o n�mero da conta nem desconto complementar, estamos usando como chave apenas a NAT_REC<br>
   * Chave: NAT_REC
   */
  private final LinkedHashMap<String, SPEDContribM410> rm410 = new LinkedHashMap<>();

  /**
   * C�digo de Situa��o Tribut�ria � CST das demais receitas auferidas no per�odo, sem incid�ncia da contribui��o, ou sem contribui��o apurada a pagar, conforme a Tabela 4.3.3. C 002* - S
   */
  @SPEDField(maxLength = 2, minLength = 2, required = true)
  private String r02_CST_PIS = null;

  /**
   * Valor total da receita bruta no per�odo. N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r03_VL_TOT_REC = null;

  /**
   * C�digo da conta anal�tica cont�bil debitada/creditada. C 060 - N
   */
  @SPEDField(maxLength = 60, required = false)
  private String r04_COD_CTA = null;

  /**
   * Descri��o Complementar da Natureza da Receita. C - - N
   */
  @SPEDField(maxLength = 200, required = false)
  private String r05_DESC_COMPL = null;

  @Override
  public String get01_Register() {
    return "M400";
  }

  /**
   * Recupera o c�digo de Situa��o Tribut�ria � CST das demais receitas auferidas no per�odo, sem incid�ncia da contribui��o, ou sem contribui��o apurada a pagar, conforme a Tabela 4.3.3. C 002* - S.
   *
   * @return the c�digo de Situa��o Tribut�ria � CST das demais receitas auferidas no per�odo, sem incid�ncia da contribui��o, ou sem contribui��o apurada a pagar, conforme a Tabela 4
   */
  public String getR02_CST_PIS() {
    return r02_CST_PIS;
  }

  /**
   * Define o c�digo de Situa��o Tribut�ria � CST das demais receitas auferidas no per�odo, sem incid�ncia da contribui��o, ou sem contribui��o apurada a pagar, conforme a Tabela 4.3.3. C 002* - S.
   *
   * @param r02_CST_PIS the new c�digo de Situa��o Tribut�ria � CST das demais receitas auferidas no per�odo, sem incid�ncia da contribui��o, ou sem contribui��o apurada a pagar, conforme a Tabela 4
   */
  public void setR02_CST_PIS(String r02_CST_PIS) {
    this.r02_CST_PIS = r02_CST_PIS;
  }

  /**
   * Recupera o valor total da receita bruta no per�odo. N - 02 S.
   *
   * @return the valor total da receita bruta no per�odo
   */
  public BigDecimal getR03_VL_TOT_REC() {
    return r03_VL_TOT_REC;
  }

  /**
   * Define o valor total da receita bruta no per�odo. N - 02 S.
   *
   * @param r03_VL_TOT_REC the new valor total da receita bruta no per�odo
   */
  public void setR03_VL_TOT_REC(BigDecimal r03_VL_TOT_REC) {
    this.r03_VL_TOT_REC = r03_VL_TOT_REC;
  }

  /**
   * Recupera o c�digo da conta anal�tica cont�bil debitada/creditada. C 060 - N.
   *
   * @return the c�digo da conta anal�tica cont�bil debitada/creditada
   */
  public String getR04_COD_CTA() {
    return r04_COD_CTA;
  }

  /**
   * Define o c�digo da conta anal�tica cont�bil debitada/creditada. C 060 - N.
   *
   * @param r04_COD_CTA the new c�digo da conta anal�tica cont�bil debitada/creditada
   */
  public void setR04_COD_CTA(String r04_COD_CTA) {
    this.r04_COD_CTA = r04_COD_CTA;
  }

  /**
   * Recupera o descri��o Complementar da Natureza da Receita. C - - N.
   *
   * @return the descri��o Complementar da Natureza da Receita
   */
  public String getR05_DESC_COMPL() {
    return r05_DESC_COMPL;
  }

  /**
   * Define o descri��o Complementar da Natureza da Receita. C - - N.
   *
   * @param r05_DESC_COMPL the new descri��o Complementar da Natureza da Receita
   */
  public void setR05_DESC_COMPL(String r05_DESC_COMPL) {
    this.r05_DESC_COMPL = r05_DESC_COMPL;
  }

  /**
   * Recupera o rEGISTRO M410: DETALHAMENTO DAS RECEITAS ISENTAS, N�O ALCAN�ADAS PELA INCID�NCIA DA CONTRIBUI��O, SUJEITAS A AL�QUOTA ZERO OU DE VENDAS COM SUSPENS�O � PIS/PASEP<br>
   * <b>ATEN��O:</B> Note que este registro deve ser distinto para cada "NAT_REC + COD_CTA + DESC_COMPL" conforme a documenta��o. Mas como BIS ainda n�o tem suporte para o n�mero da conta nem desconto complementar, estamos usando como chave apenas a NAT_REC<br>
   * Chave: NAT_REC.
   *
   * @return the rEGISTRO M410: DETALHAMENTO DAS RECEITAS ISENTAS, N�O ALCAN�ADAS PELA INCID�NCIA DA CONTRIBUI��O, SUJEITAS A AL�QUOTA ZERO OU DE VENDAS COM SUSPENS�O � PIS/PASEP<br>
   *         <b>ATEN��O:</B> Note que este registro deve ser distinto para cada "NAT_REC + COD_CTA + DESC_COMPL" conforme a documenta��o
   */
  public LinkedHashMap<String, SPEDContribM410> getRm410() {
    return rm410;
  }

}