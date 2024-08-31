package br.eng.rodrigogml.rfw.sped.structure.contrib;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO M810: DETALHAMENTO DAS RECEITAS ISENTAS, N�O ALCAN�ADAS PELA INCID�NCIA DA CONTRIBUI��O, SUJEITAS A AL�QUOTA ZERO OU DE VENDAS COM SUSPENS�O � COFINS.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribM810 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * Natureza da Receita, conforme rela��o constante nas Tabelas de Detalhamento da Natureza da Receita por Situa��o Tribut�ria abaixo:
   * <li>Tabela 4.3.10: Produtos Sujeitos � Incid�ncia Monof�sica da Contribui��o Social � Al�quotas Diferenciadas (CST 04 - Revenda);
   * <li>Tabela 4.3.11: Produtos Sujeitos � Incid�ncia Monof�sica da Contribui��o Social � Al�quotas por Unidade de Medida de Produto (CST 04 - Revenda);
   * <li>Tabela 4.3.12: Produtos Sujeitos � Substitui��o Tribut�ria da Contribui��o Social (CST 05 - Revenda);
   * <li>Tabela 4.3.13: Produtos Sujeitos � Al�quota Zero da Contribui��o Social (CST 06);
   * <li>Tabela 4.3.14: Opera��es com Isen��o da Contribui��o Social (CST 07);
   * <li>Tabela 4.3.15: Opera��es sem Incid�ncia da Contribui��o Social (CST 08);
   * <li>Tabela 4.3.16: Opera��es com Suspens�o da Contribui��o Social (CST 09).<br>
   * C 003* - S
   */
  @SPEDField(maxLength = 3, minLength = 3, required = true)
  private String r02_NAT_REC = null;

  /**
   * Valor da receita bruta no per�odo, relativo a natureza da receita (NAT_REC) N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r03_VL_REC = null;

  /**
   * C�digo da conta anal�tica cont�bil debitada/creditada. C 060 - N
   */
  @SPEDField(maxLength = 60, required = false)
  private String r04_COD_CTA = null;

  /**
   * Descri��o Complementar da Natureza da Receita. C - - N
   */
  @SPEDField(maxLength = 500, required = false)
  private String r05_DESC_COMPL = null;

  @Override
  public String get01_Register() {
    return "M810";
  }

  /**
   * Recupera o natureza da Receita, conforme rela��o constante nas Tabelas de Detalhamento da Natureza da Receita por Situa��o Tribut�ria abaixo:
   * <li>Tabela 4.3.10: Produtos Sujeitos � Incid�ncia Monof�sica da Contribui��o Social � Al�quotas Diferenciadas (CST 04 - Revenda);
   * <li>Tabela 4.3.11: Produtos Sujeitos � Incid�ncia Monof�sica da Contribui��o Social � Al�quotas por Unidade de Medida de Produto (CST 04 - Revenda);
   * <li>Tabela 4.3.12: Produtos Sujeitos � Substitui��o Tribut�ria da Contribui��o Social (CST 05 - Revenda);
   * <li>Tabela 4.3.13: Produtos Sujeitos � Al�quota Zero da Contribui��o Social (CST 06);
   * <li>Tabela 4.3.14: Opera��es com Isen��o da Contribui��o Social (CST 07);
   * <li>Tabela 4.3.15: Opera��es sem Incid�ncia da Contribui��o Social (CST 08);
   * <li>Tabela 4.3.16: Opera��es com Suspens�o da Contribui��o Social (CST 09).<br>
   * C 003* - S.
   *
   * @return the natureza da Receita, conforme rela��o constante nas Tabelas de Detalhamento da Natureza da Receita por Situa��o Tribut�ria abaixo:
   *         <li>Tabela 4
   */
  public String getR02_NAT_REC() {
    return r02_NAT_REC;
  }

  /**
   * Define o natureza da Receita, conforme rela��o constante nas Tabelas de Detalhamento da Natureza da Receita por Situa��o Tribut�ria abaixo:
   * <li>Tabela 4.3.10: Produtos Sujeitos � Incid�ncia Monof�sica da Contribui��o Social � Al�quotas Diferenciadas (CST 04 - Revenda);
   * <li>Tabela 4.3.11: Produtos Sujeitos � Incid�ncia Monof�sica da Contribui��o Social � Al�quotas por Unidade de Medida de Produto (CST 04 - Revenda);
   * <li>Tabela 4.3.12: Produtos Sujeitos � Substitui��o Tribut�ria da Contribui��o Social (CST 05 - Revenda);
   * <li>Tabela 4.3.13: Produtos Sujeitos � Al�quota Zero da Contribui��o Social (CST 06);
   * <li>Tabela 4.3.14: Opera��es com Isen��o da Contribui��o Social (CST 07);
   * <li>Tabela 4.3.15: Opera��es sem Incid�ncia da Contribui��o Social (CST 08);
   * <li>Tabela 4.3.16: Opera��es com Suspens�o da Contribui��o Social (CST 09).<br>
   * C 003* - S.
   *
   * @param r02_NAT_REC the new natureza da Receita, conforme rela��o constante nas Tabelas de Detalhamento da Natureza da Receita por Situa��o Tribut�ria abaixo:
   *          <li>Tabela 4
   */
  public void setR02_NAT_REC(String r02_NAT_REC) {
    this.r02_NAT_REC = r02_NAT_REC;
  }

  /**
   * Recupera o valor da receita bruta no per�odo, relativo a natureza da receita (NAT_REC) N - 02 S.
   *
   * @return the valor da receita bruta no per�odo, relativo a natureza da receita (NAT_REC) N - 02 S
   */
  public BigDecimal getR03_VL_REC() {
    return r03_VL_REC;
  }

  /**
   * Define o valor da receita bruta no per�odo, relativo a natureza da receita (NAT_REC) N - 02 S.
   *
   * @param r03_VL_REC the new valor da receita bruta no per�odo, relativo a natureza da receita (NAT_REC) N - 02 S
   */
  public void setR03_VL_REC(BigDecimal r03_VL_REC) {
    this.r03_VL_REC = r03_VL_REC;
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

}