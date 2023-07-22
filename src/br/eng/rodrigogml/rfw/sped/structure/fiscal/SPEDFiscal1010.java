package br.eng.rodrigogml.rfw.sped.structure.fiscal;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO 1010: OBRIGATORIEDADE DE REGISTROS DO BLOCO 1.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscal1010 extends SPEDRegister {

  /**
   * 02 IND_EXP Reg. 1100 - Ocorreu averbação (conclusão) de exportação no período: S – Sim N - Não C 001* - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r02_IND_EXP = null;

  /**
   * 03 IND_CCRF Reg 1200 – Existem informações acerca de créditos de ICMS a serem controlados, definidos pela Sefaz: S – Sim N - Não C 001* - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r03_IND_CCRF = null;

  /**
   * 04 IND_COMB Reg. 1300 – É comercio varejista de combustíveis com movimentação e/ou estoque no período: S – Sim N - Não C 001* - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r04_IND_COMB = null;

  /**
   * 05 IND_USINA Reg. 1390 – Usinas de açúcar e/álcool – O estabelecimento é produtor de açúcar e/ou álcool carburante com movimentação e/ou estoque no período: S – Sim N - Não C 001* - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r05_IND_USINA = null;

  /**
   * 06 IND_VA Reg 1400 – Sendo o registro obrigatório em sua Unidade de Federação, existem informações a serem prestadas neste registro: S – Sim; N - Não C 001* - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r06_IND_VA = null;

  /**
   * 07 IND_EE Reg 1500 - A empresa é distribuidora de energia e ocorreu fornecimento de energia elétrica para consumidores de outra UF: S – Sim; N - Não C 001* - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r07_IND_EE = null;

  /**
   * 08 IND_CART Reg 1600 - Realizou vendas com Cartão de Crédito ou de débito: S – Sim; N - Não C 001* - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r08_IND_CART = null;

  /**
   * 09 IND_FORM Reg. 1700 – Foram emitidos documentos fiscais em papel no período em unidade da federação que exija o controle de utilização de documentos fiscais: S – Sim N - Não C 001* - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r09_IND_FORM = null;

  /**
   * 10 IND_AER Reg 1800 – A empresa prestou serviços de transporte aéreo de cargas e de passageiros: S – Sim N - Não C 001* - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r10_IND_AER = null;

  /**
   * 11 IND_GIAF1 Reg. 1960 - Possui informações GIAF1? S – Sim; N – Não - C 001* - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r11_IND_GIAF1 = null;

  /**
   * 12 IND_GIAF3 Reg. 1970 - Possui informações GIAF3? S – Sim; N – Não. C 001* - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r12_IND_GIAF3 = null;

  /**
   * 13 IND_GIAF4 Reg. 1980 - Possui informações GIAF4? S – Sim; N – Não. C 001* - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r13_IND_GIAF4 = null;

  /**
   * 14 IND_REST_RESSARC_COMPL_ICMS<br>
   * Reg. 1250 – Possui informações consolidadas de saldos de restituição, ressarcimento e complementação do ICMS? S – Sim; N – Não. C 001* - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r14_IND_REST_RESSARC_COMPL_ICMS = null;

  @Override
  public String get01_Register() {
    return "1010";
  }

  /**
   * Recupera o 03 IND_CCRF Reg 1200 – Existem informações acerca de créditos de ICMS a serem controlados, definidos pela Sefaz: S – Sim N - Não C 001* - O.
   *
   * @return the 03 IND_CCRF Reg 1200 – Existem informações acerca de créditos de ICMS a serem controlados, definidos pela Sefaz: S – Sim N - Não C 001* - O
   */
  public String getR03_IND_CCRF() {
    return r03_IND_CCRF;
  }

  /**
   * Define o 03 IND_CCRF Reg 1200 – Existem informações acerca de créditos de ICMS a serem controlados, definidos pela Sefaz: S – Sim N - Não C 001* - O.
   *
   * @param r03_IND_CCRF the new 03 IND_CCRF Reg 1200 – Existem informações acerca de créditos de ICMS a serem controlados, definidos pela Sefaz: S – Sim N - Não C 001* - O
   */
  public void setR03_IND_CCRF(String r03_IND_CCRF) {
    this.r03_IND_CCRF = r03_IND_CCRF;
  }

  /**
   * Recupera o 04 IND_COMB Reg. 1300 – É comercio varejista de combustíveis com movimentação e/ou estoque no período: S – Sim N - Não C 001* - O.
   *
   * @return the 04 IND_COMB Reg
   */
  public String getR04_IND_COMB() {
    return r04_IND_COMB;
  }

  /**
   * Define o 04 IND_COMB Reg. 1300 – É comercio varejista de combustíveis com movimentação e/ou estoque no período: S – Sim N - Não C 001* - O.
   *
   * @param r04_IND_COMB the new 04 IND_COMB Reg
   */
  public void setR04_IND_COMB(String r04_IND_COMB) {
    this.r04_IND_COMB = r04_IND_COMB;
  }

  /**
   * Recupera o 05 IND_USINA Reg. 1390 – Usinas de açúcar e/álcool – O estabelecimento é produtor de açúcar e/ou álcool carburante com movimentação e/ou estoque no período: S – Sim N - Não C 001* - O.
   *
   * @return the 05 IND_USINA Reg
   */
  public String getR05_IND_USINA() {
    return r05_IND_USINA;
  }

  /**
   * Define o 05 IND_USINA Reg. 1390 – Usinas de açúcar e/álcool – O estabelecimento é produtor de açúcar e/ou álcool carburante com movimentação e/ou estoque no período: S – Sim N - Não C 001* - O.
   *
   * @param r05_IND_USINA the new 05 IND_USINA Reg
   */
  public void setR05_IND_USINA(String r05_IND_USINA) {
    this.r05_IND_USINA = r05_IND_USINA;
  }

  /**
   * Recupera o 06 IND_VA Reg 1400 – Sendo o registro obrigatório em sua Unidade de Federação, existem informações a serem prestadas neste registro: S – Sim; N - Não C 001* - O.
   *
   * @return the 06 IND_VA Reg 1400 – Sendo o registro obrigatório em sua Unidade de Federação, existem informações a serem prestadas neste registro: S – Sim; N - Não C 001* - O
   */
  public String getR06_IND_VA() {
    return r06_IND_VA;
  }

  /**
   * Define o 06 IND_VA Reg 1400 – Sendo o registro obrigatório em sua Unidade de Federação, existem informações a serem prestadas neste registro: S – Sim; N - Não C 001* - O.
   *
   * @param r06_IND_VA the new 06 IND_VA Reg 1400 – Sendo o registro obrigatório em sua Unidade de Federação, existem informações a serem prestadas neste registro: S – Sim; N - Não C 001* - O
   */
  public void setR06_IND_VA(String r06_IND_VA) {
    this.r06_IND_VA = r06_IND_VA;
  }

  /**
   * Recupera o 07 IND_EE Reg 1500 - A empresa é distribuidora de energia e ocorreu fornecimento de energia elétrica para consumidores de outra UF: S – Sim; N - Não C 001* - O.
   *
   * @return the 07 IND_EE Reg 1500 - A empresa é distribuidora de energia e ocorreu fornecimento de energia elétrica para consumidores de outra UF: S – Sim; N - Não C 001* - O
   */
  public String getR07_IND_EE() {
    return r07_IND_EE;
  }

  /**
   * Define o 07 IND_EE Reg 1500 - A empresa é distribuidora de energia e ocorreu fornecimento de energia elétrica para consumidores de outra UF: S – Sim; N - Não C 001* - O.
   *
   * @param r07_IND_EE the new 07 IND_EE Reg 1500 - A empresa é distribuidora de energia e ocorreu fornecimento de energia elétrica para consumidores de outra UF: S – Sim; N - Não C 001* - O
   */
  public void setR07_IND_EE(String r07_IND_EE) {
    this.r07_IND_EE = r07_IND_EE;
  }

  /**
   * Recupera o 08 IND_CART Reg 1600 - Realizou vendas com Cartão de Crédito ou de débito: S – Sim; N - Não C 001* - O.
   *
   * @return the 08 IND_CART Reg 1600 - Realizou vendas com Cartão de Crédito ou de débito: S – Sim; N - Não C 001* - O
   */
  public String getR08_IND_CART() {
    return r08_IND_CART;
  }

  /**
   * Define o 08 IND_CART Reg 1600 - Realizou vendas com Cartão de Crédito ou de débito: S – Sim; N - Não C 001* - O.
   *
   * @param r08_IND_CART the new 08 IND_CART Reg 1600 - Realizou vendas com Cartão de Crédito ou de débito: S – Sim; N - Não C 001* - O
   */
  public void setR08_IND_CART(String r08_IND_CART) {
    this.r08_IND_CART = r08_IND_CART;
  }

  /**
   * Recupera o 09 IND_FORM Reg. 1700 – Foram emitidos documentos fiscais em papel no período em unidade da federação que exija o controle de utilização de documentos fiscais: S – Sim N - Não C 001* - O.
   *
   * @return the 09 IND_FORM Reg
   */
  public String getR09_IND_FORM() {
    return r09_IND_FORM;
  }

  /**
   * Define o 09 IND_FORM Reg. 1700 – Foram emitidos documentos fiscais em papel no período em unidade da federação que exija o controle de utilização de documentos fiscais: S – Sim N - Não C 001* - O.
   *
   * @param r09_IND_FORM the new 09 IND_FORM Reg
   */
  public void setR09_IND_FORM(String r09_IND_FORM) {
    this.r09_IND_FORM = r09_IND_FORM;
  }

  /**
   * Recupera o 10 IND_AER Reg 1800 – A empresa prestou serviços de transporte aéreo de cargas e de passageiros: S – Sim N - Não C 001* - O.
   *
   * @return the 10 IND_AER Reg 1800 – A empresa prestou serviços de transporte aéreo de cargas e de passageiros: S – Sim N - Não C 001* - O
   */
  public String getR10_IND_AER() {
    return r10_IND_AER;
  }

  /**
   * Define o 10 IND_AER Reg 1800 – A empresa prestou serviços de transporte aéreo de cargas e de passageiros: S – Sim N - Não C 001* - O.
   *
   * @param r10_IND_AER the new 10 IND_AER Reg 1800 – A empresa prestou serviços de transporte aéreo de cargas e de passageiros: S – Sim N - Não C 001* - O
   */
  public void setR10_IND_AER(String r10_IND_AER) {
    this.r10_IND_AER = r10_IND_AER;
  }

  /**
   * Recupera o 02 IND_EXP Reg. 1100 - Ocorreu averbação (conclusão) de exportação no período: S – Sim N - Não C 001* - O.
   *
   * @return the 02 IND_EXP Reg
   */
  public String getR02_IND_EXP() {
    return r02_IND_EXP;
  }

  /**
   * Define o 02 IND_EXP Reg. 1100 - Ocorreu averbação (conclusão) de exportação no período: S – Sim N - Não C 001* - O.
   *
   * @param r02_IND_EXP the new 02 IND_EXP Reg
   */
  public void setR02_IND_EXP(String r02_IND_EXP) {
    this.r02_IND_EXP = r02_IND_EXP;
  }

  /**
   * # 11 IND_GIAF1 Reg.
   *
   * @return 11 IND_GIAF1 Reg
   */
  public String getR11_IND_GIAF1() {
    return r11_IND_GIAF1;
  }

  /**
   * # 12 IND_GIAF3 Reg.
   *
   * @return 12 IND_GIAF3 Reg
   */
  public String getR12_IND_GIAF3() {
    return r12_IND_GIAF3;
  }

  /**
   * # 13 IND_GIAF4 Reg.
   *
   * @return 13 IND_GIAF4 Reg
   */
  public String getR13_IND_GIAF4() {
    return r13_IND_GIAF4;
  }

  /**
   * # 14 IND_REST_RESSARC_COMPL_ICMS<br>
   * Reg.
   *
   * @return 14 IND_REST_RESSARC_COMPL_ICMS<br>
   *         Reg
   */
  public String getR14_IND_REST_RESSARC_COMPL_ICMS() {
    return r14_IND_REST_RESSARC_COMPL_ICMS;
  }

  /**
   * # 11 IND_GIAF1 Reg.
   *
   * @param r11_IND_GIAF1 11 IND_GIAF1 Reg
   */
  public void setR11_IND_GIAF1(String r11_IND_GIAF1) {
    this.r11_IND_GIAF1 = r11_IND_GIAF1;
  }

  /**
   * # 12 IND_GIAF3 Reg.
   *
   * @param r12_IND_GIAF3 12 IND_GIAF3 Reg
   */
  public void setR12_IND_GIAF3(String r12_IND_GIAF3) {
    this.r12_IND_GIAF3 = r12_IND_GIAF3;
  }

  /**
   * # 13 IND_GIAF4 Reg.
   *
   * @param r13_IND_GIAF4 13 IND_GIAF4 Reg
   */
  public void setR13_IND_GIAF4(String r13_IND_GIAF4) {
    this.r13_IND_GIAF4 = r13_IND_GIAF4;
  }

  /**
   * # 14 IND_REST_RESSARC_COMPL_ICMS<br>
   * Reg.
   *
   * @param r14_IND_REST_RESSARC_COMPL_ICMS 14 IND_REST_RESSARC_COMPL_ICMS<br>
   *          Reg
   */
  public void setR14_IND_REST_RESSARC_COMPL_ICMS(String r14_IND_REST_RESSARC_COMPL_ICMS) {
    this.r14_IND_REST_RESSARC_COMPL_ICMS = r14_IND_REST_RESSARC_COMPL_ICMS;
  }

}