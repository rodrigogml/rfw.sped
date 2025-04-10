package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import java.time.LocalDate;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField.SPEDFIELDTYPE;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO 0500: PLANO DE CONTAS CONT�BEIS.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContrib0500 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  public SPEDContrib0500(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 DT_ALT Data da inclus�o/altera��o N 008* - O
   */
  @SPEDField(maxLength = 8, minLength = 8, required = true)
  private LocalDate r02_DT_ALT = null;

  /**
   * 03 COD_NAT_CC C�digo da natureza da conta/grupo de contas:<br>
   * 01 - Contas de ativo;<br>
   * 02 - Contas de passivo;<br>
   * 03 - Patrim�nio l�quido;<br>
   * 04 - Contas de resultado;<br>
   * 05 - Contas de compensa��o;<br>
   * 09 - Outras.<br>
   * C 002* - O
   */
  @SPEDField(minLength = 2, maxLength = 2, required = true)
  private String r03_COD_NAT_CC = null;

  /**
   * 04 IND_CTA Indicador do tipo de conta:<br>
   * S - Sint�tica (grupo de contas);<br>
   * A - Anal�tica (conta).<br>
   * C 001* - O
   */
  @SPEDField(maxLength = 1, minLength = 1, required = true)
  private String r04_IND_CTA = null;

  /**
   * 05 N�VEL N�vel da conta anal�tica/grupo de contas. N 005 - O
   */
  @SPEDField(maxLength = 5, required = true)
  private String r05_N�VEL = null;

  /**
   * 06 COD_CTA C�digo da conta anal�tica/grupo de contas. C 60 - O
   */
  @SPEDField(maxLength = 60, required = true)
  private String r06_COD_CTA = null;

  /**
   * 07 NOME_CTA Nome da conta anal�tica/grupo de contas. C 60 - O
   */
  @SPEDField(maxLength = 60, required = true)
  private String r07_NOME_CTA = null;

  /**
   * 08 COD_CTA_REF C�digo da conta correlacionada no Plano de Contas Referenciado, publicado pela RFB. C 060 - N
   */
  @SPEDField(maxLength = 60, required = false)
  private String r08_COD_CTA_REF = null;

  /**
   * 09 CNPJ_EST CNPJ do estabelecimento, no caso da conta informadano campo COD_CTA ser espec�fica de um estabelecimento. N 014* - N
   */
  @SPEDField(maxLength = 14, required = false, type = SPEDFIELDTYPE.CNPJ)
  private String r09_CNPJ_EST = null;

  @Override
  public String get01_Register() {
    return "0500";
  }

  /**
   * Recupera o 02 DT_ALT Data da inclus�o/altera��o N 008* - O.
   *
   * @return the 02 DT_ALT Data da inclus�o/altera��o N 008* - O
   */
  public LocalDate getR02_DT_ALT() {
    return r02_DT_ALT;
  }

  /**
   * Define o 02 DT_ALT Data da inclus�o/altera��o N 008* - O.
   *
   * @param r02_DT_ALT the new 02 DT_ALT Data da inclus�o/altera��o N 008* - O
   */
  public void setR02_DT_ALT(LocalDate r02_DT_ALT) {
    this.r02_DT_ALT = r02_DT_ALT;
  }

  /**
   * Recupera o 03 COD_NAT_CC C�digo da natureza da conta/grupo de contas:<br>
   * 01 - Contas de ativo;<br>
   * 02 - Contas de passivo;<br>
   * 03 - Patrim�nio l�quido;<br>
   * 04 - Contas de resultado;<br>
   * 05 - Contas de compensa��o;<br>
   * 09 - Outras.<br>
   * C 002* - O.
   *
   * @return the 03 COD_NAT_CC C�digo da natureza da conta/grupo de contas:<br>
   *         01 - Contas de ativo;<br>
   *         02 - Contas de passivo;<br>
   *         03 - Patrim�nio l�quido;<br>
   *         04 - Contas de resultado;<br>
   *         05 - Contas de compensa��o;<br>
   *         09 - Outras
   */
  public String getR03_COD_NAT_CC() {
    return r03_COD_NAT_CC;
  }

  /**
   * Define o 03 COD_NAT_CC C�digo da natureza da conta/grupo de contas:<br>
   * 01 - Contas de ativo;<br>
   * 02 - Contas de passivo;<br>
   * 03 - Patrim�nio l�quido;<br>
   * 04 - Contas de resultado;<br>
   * 05 - Contas de compensa��o;<br>
   * 09 - Outras.<br>
   * C 002* - O.
   *
   * @param r03_COD_NAT_CC the new 03 COD_NAT_CC C�digo da natureza da conta/grupo de contas:<br>
   *          01 - Contas de ativo;<br>
   *          02 - Contas de passivo;<br>
   *          03 - Patrim�nio l�quido;<br>
   *          04 - Contas de resultado;<br>
   *          05 - Contas de compensa��o;<br>
   *          09 - Outras
   */
  public void setR03_COD_NAT_CC(String r03_COD_NAT_CC) {
    this.r03_COD_NAT_CC = r03_COD_NAT_CC;
  }

  /**
   * Recupera o 04 IND_CTA Indicador do tipo de conta:<br>
   * S - Sint�tica (grupo de contas);<br>
   * A - Anal�tica (conta).<br>
   * C 001* - O.
   *
   * @return the 04 IND_CTA Indicador do tipo de conta:<br>
   *         S - Sint�tica (grupo de contas);<br>
   *         A - Anal�tica (conta)
   */
  public String getR04_IND_CTA() {
    return r04_IND_CTA;
  }

  /**
   * Define o 04 IND_CTA Indicador do tipo de conta:<br>
   * S - Sint�tica (grupo de contas);<br>
   * A - Anal�tica (conta).<br>
   * C 001* - O.
   *
   * @param r04_IND_CTA the new 04 IND_CTA Indicador do tipo de conta:<br>
   *          S - Sint�tica (grupo de contas);<br>
   *          A - Anal�tica (conta)
   */
  public void setR04_IND_CTA(String r04_IND_CTA) {
    this.r04_IND_CTA = r04_IND_CTA;
  }

  /**
   * Recupera o 05 N�VEL N�vel da conta anal�tica/grupo de contas. N 005 - O.
   *
   * @return the 05 N�VEL N�vel da conta anal�tica/grupo de contas
   */
  public String getR05_N�VEL() {
    return r05_N�VEL;
  }

  /**
   * Define o 05 N�VEL N�vel da conta anal�tica/grupo de contas. N 005 - O.
   *
   * @param r05_N�VEL the new 05 N�VEL N�vel da conta anal�tica/grupo de contas
   */
  public void setR05_N�VEL(String r05_N�VEL) {
    this.r05_N�VEL = r05_N�VEL;
  }

  /**
   * Recupera o 06 COD_CTA C�digo da conta anal�tica/grupo de contas. C 60 - O.
   *
   * @return the 06 COD_CTA C�digo da conta anal�tica/grupo de contas
   */
  public String getR06_COD_CTA() {
    return r06_COD_CTA;
  }

  /**
   * Define o 06 COD_CTA C�digo da conta anal�tica/grupo de contas. C 60 - O.
   *
   * @param r06_COD_CTA the new 06 COD_CTA C�digo da conta anal�tica/grupo de contas
   */
  public void setR06_COD_CTA(String r06_COD_CTA) {
    this.r06_COD_CTA = r06_COD_CTA;
  }

  /**
   * Recupera o 07 NOME_CTA Nome da conta anal�tica/grupo de contas. C 60 - O.
   *
   * @return the 07 NOME_CTA Nome da conta anal�tica/grupo de contas
   */
  public String getR07_NOME_CTA() {
    return r07_NOME_CTA;
  }

  /**
   * Define o 07 NOME_CTA Nome da conta anal�tica/grupo de contas. C 60 - O.
   *
   * @param r07_NOME_CTA the new 07 NOME_CTA Nome da conta anal�tica/grupo de contas
   */
  public void setR07_NOME_CTA(String r07_NOME_CTA) {
    this.r07_NOME_CTA = r07_NOME_CTA;
  }

  /**
   * Recupera o 08 COD_CTA_REF C�digo da conta correlacionada no Plano de Contas Referenciado, publicado pela RFB. C 060 - N.
   *
   * @return the 08 COD_CTA_REF C�digo da conta correlacionada no Plano de Contas Referenciado, publicado pela RFB
   */
  public String getR08_COD_CTA_REF() {
    return r08_COD_CTA_REF;
  }

  /**
   * Define o 08 COD_CTA_REF C�digo da conta correlacionada no Plano de Contas Referenciado, publicado pela RFB. C 060 - N.
   *
   * @param r08_COD_CTA_REF the new 08 COD_CTA_REF C�digo da conta correlacionada no Plano de Contas Referenciado, publicado pela RFB
   */
  public void setR08_COD_CTA_REF(String r08_COD_CTA_REF) {
    this.r08_COD_CTA_REF = r08_COD_CTA_REF;
  }

  /**
   * Recupera o 09 CNPJ_EST CNPJ do estabelecimento, no caso da conta informadano campo COD_CTA ser espec�fica de um estabelecimento. N 014* - N.
   *
   * @return the 09 CNPJ_EST CNPJ do estabelecimento, no caso da conta informadano campo COD_CTA ser espec�fica de um estabelecimento
   */
  public String getR09_CNPJ_EST() {
    return r09_CNPJ_EST;
  }

  /**
   * Define o 09 CNPJ_EST CNPJ do estabelecimento, no caso da conta informadano campo COD_CTA ser espec�fica de um estabelecimento. N 014* - N.
   *
   * @param r09_CNPJ_EST the new 09 CNPJ_EST CNPJ do estabelecimento, no caso da conta informadano campo COD_CTA ser espec�fica de um estabelecimento
   */
  public void setR09_CNPJ_EST(String r09_CNPJ_EST) {
    this.r09_CNPJ_EST = r09_CNPJ_EST;
  }
}