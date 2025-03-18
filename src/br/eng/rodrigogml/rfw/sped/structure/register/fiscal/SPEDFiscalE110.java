package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO E110: APURAÇÃO DO ICMS – OPERAÇÕES PRÓPRIAS.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalE110 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  private SPEDFiscalE116 re116 = null;

  /**
   * 02 VL_TOT_DEBITOS Valor total dos débitos por "Saídas e prestações com débito do imposto" N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r02_VL_TOT_DEBITOS = null;

  /**
   * 03 VL_AJ_DEBITOS Valor total dos ajustes a débito decorrentes do documento fiscal. N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r03_VL_AJ_DEBITOS = null;

  /**
   * 04 VL_TOT_AJ_DEBITOS Valor total de "Ajustes a débito" N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r04_VL_TOT_AJ_DEBITOS = null;

  /**
   * 05 VL_ESTORNOS_CRED Valor total de Ajustes “Estornos de créditos” N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r05_VL_ESTORNOS_CRED = null;

  /**
   * 06 VL_TOT_CREDITOS Valor total dos créditos por "Entradas e aquisições com crédito do imposto" N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r06_VL_TOT_CREDITOS = null;

  /**
   * 07 VL_AJ_CREDITOS Valor total dos ajustes a crédito decorrentes do documento fiscal. N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r07_VL_AJ_CREDITOS = null;

  /**
   * 08 VL_TOT_AJ_CREDITOS Valor total de "Ajustes a crédito" N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r08_VL_TOT_AJ_CREDITOS = null;

  /**
   * 09 VL_ESTORNOS_DEB Valor total de Ajustes “Estornos de Débitos” N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r09_VL_ESTORNOS_DEB = null;

  /**
   * 10 VL_SLD_CREDOR_ANT Valor total de "Saldo credor do período anterior" N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r10_VL_SLD_CREDOR_ANT = null;

  /**
   * 11 VL_SLD_APURADO Valor do saldo devedor apurado N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r11_VL_SLD_APURADO = null;

  /**
   * 12 VL_TOT_DED Valor total de "Deduções" N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r12_VL_TOT_DED = null;

  /**
   * 13 VL_ICMS_RECOLHER Valor total de "ICMS a recolher (11-12) N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r13_VL_ICMS_RECOLHER = null;

  /**
   * 14 VL_SLD_CREDOR_TRANSPORTAR Valor total de "Saldo credor a transportar para o período seguinte” N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r14_VL_SLD_CREDOR_TRANSPORTAR = null;

  /**
   * 15 DEB_ESP Valores recolhidos ou a recolher, extraapuração. N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r15_DEB_ESP = null;

  @Override
  public String get01_Register() {
    return "E110";
  }

  /**
   * Recupera o 02 VL_TOT_DEBITOS Valor total dos débitos por "Saídas e prestações com débito do imposto" N - 02 O.
   *
   * @return the 02 VL_TOT_DEBITOS Valor total dos débitos por "Saídas e prestações com débito do imposto" N - 02 O
   */
  public BigDecimal getR02_VL_TOT_DEBITOS() {
    return r02_VL_TOT_DEBITOS;
  }

  /**
   * Define o 02 VL_TOT_DEBITOS Valor total dos débitos por "Saídas e prestações com débito do imposto" N - 02 O.
   *
   * @param r02_VL_TOT_DEBITOS the new 02 VL_TOT_DEBITOS Valor total dos débitos por "Saídas e prestações com débito do imposto" N - 02 O
   */
  public void setR02_VL_TOT_DEBITOS(BigDecimal r02_VL_TOT_DEBITOS) {
    this.r02_VL_TOT_DEBITOS = r02_VL_TOT_DEBITOS;
  }

  /**
   * Recupera o 03 VL_AJ_DEBITOS Valor total dos ajustes a débito decorrentes do documento fiscal. N - 02 O.
   *
   * @return the 03 VL_AJ_DEBITOS Valor total dos ajustes a débito decorrentes do documento fiscal
   */
  public BigDecimal getR03_VL_AJ_DEBITOS() {
    return r03_VL_AJ_DEBITOS;
  }

  /**
   * Define o 03 VL_AJ_DEBITOS Valor total dos ajustes a débito decorrentes do documento fiscal. N - 02 O.
   *
   * @param r03_VL_AJ_DEBITOS the new 03 VL_AJ_DEBITOS Valor total dos ajustes a débito decorrentes do documento fiscal
   */
  public void setR03_VL_AJ_DEBITOS(BigDecimal r03_VL_AJ_DEBITOS) {
    this.r03_VL_AJ_DEBITOS = r03_VL_AJ_DEBITOS;
  }

  /**
   * Recupera o 04 VL_TOT_AJ_DEBITOS Valor total de "Ajustes a débito" N - 02 O.
   *
   * @return the 04 VL_TOT_AJ_DEBITOS Valor total de "Ajustes a débito" N - 02 O
   */
  public BigDecimal getR04_VL_TOT_AJ_DEBITOS() {
    return r04_VL_TOT_AJ_DEBITOS;
  }

  /**
   * Define o 04 VL_TOT_AJ_DEBITOS Valor total de "Ajustes a débito" N - 02 O.
   *
   * @param r04_VL_TOT_AJ_DEBITOS the new 04 VL_TOT_AJ_DEBITOS Valor total de "Ajustes a débito" N - 02 O
   */
  public void setR04_VL_TOT_AJ_DEBITOS(BigDecimal r04_VL_TOT_AJ_DEBITOS) {
    this.r04_VL_TOT_AJ_DEBITOS = r04_VL_TOT_AJ_DEBITOS;
  }

  /**
   * Recupera o 05 VL_ESTORNOS_CRED Valor total de Ajustes “Estornos de créditos” N - 02 O.
   *
   * @return the 05 VL_ESTORNOS_CRED Valor total de Ajustes “Estornos de créditos” N - 02 O
   */
  public BigDecimal getR05_VL_ESTORNOS_CRED() {
    return r05_VL_ESTORNOS_CRED;
  }

  /**
   * Define o 05 VL_ESTORNOS_CRED Valor total de Ajustes “Estornos de créditos” N - 02 O.
   *
   * @param r05_VL_ESTORNOS_CRED the new 05 VL_ESTORNOS_CRED Valor total de Ajustes “Estornos de créditos” N - 02 O
   */
  public void setR05_VL_ESTORNOS_CRED(BigDecimal r05_VL_ESTORNOS_CRED) {
    this.r05_VL_ESTORNOS_CRED = r05_VL_ESTORNOS_CRED;
  }

  /**
   * Recupera o 06 VL_TOT_CREDITOS Valor total dos créditos por "Entradas e aquisições com crédito do imposto" N - 02 O.
   *
   * @return the 06 VL_TOT_CREDITOS Valor total dos créditos por "Entradas e aquisições com crédito do imposto" N - 02 O
   */
  public BigDecimal getR06_VL_TOT_CREDITOS() {
    return r06_VL_TOT_CREDITOS;
  }

  /**
   * Define o 06 VL_TOT_CREDITOS Valor total dos créditos por "Entradas e aquisições com crédito do imposto" N - 02 O.
   *
   * @param r06_VL_TOT_CREDITOS the new 06 VL_TOT_CREDITOS Valor total dos créditos por "Entradas e aquisições com crédito do imposto" N - 02 O
   */
  public void setR06_VL_TOT_CREDITOS(BigDecimal r06_VL_TOT_CREDITOS) {
    this.r06_VL_TOT_CREDITOS = r06_VL_TOT_CREDITOS;
  }

  /**
   * Recupera o 07 VL_AJ_CREDITOS Valor total dos ajustes a crédito decorrentes do documento fiscal. N - 02 O.
   *
   * @return the 07 VL_AJ_CREDITOS Valor total dos ajustes a crédito decorrentes do documento fiscal
   */
  public BigDecimal getR07_VL_AJ_CREDITOS() {
    return r07_VL_AJ_CREDITOS;
  }

  /**
   * Define o 07 VL_AJ_CREDITOS Valor total dos ajustes a crédito decorrentes do documento fiscal. N - 02 O.
   *
   * @param r07_VL_AJ_CREDITOS the new 07 VL_AJ_CREDITOS Valor total dos ajustes a crédito decorrentes do documento fiscal
   */
  public void setR07_VL_AJ_CREDITOS(BigDecimal r07_VL_AJ_CREDITOS) {
    this.r07_VL_AJ_CREDITOS = r07_VL_AJ_CREDITOS;
  }

  /**
   * Recupera o 08 VL_TOT_AJ_CREDITOS Valor total de "Ajustes a crédito" N - 02 O.
   *
   * @return the 08 VL_TOT_AJ_CREDITOS Valor total de "Ajustes a crédito" N - 02 O
   */
  public BigDecimal getR08_VL_TOT_AJ_CREDITOS() {
    return r08_VL_TOT_AJ_CREDITOS;
  }

  /**
   * Define o 08 VL_TOT_AJ_CREDITOS Valor total de "Ajustes a crédito" N - 02 O.
   *
   * @param r08_VL_TOT_AJ_CREDITOS the new 08 VL_TOT_AJ_CREDITOS Valor total de "Ajustes a crédito" N - 02 O
   */
  public void setR08_VL_TOT_AJ_CREDITOS(BigDecimal r08_VL_TOT_AJ_CREDITOS) {
    this.r08_VL_TOT_AJ_CREDITOS = r08_VL_TOT_AJ_CREDITOS;
  }

  /**
   * Recupera o 09 VL_ESTORNOS_DEB Valor total de Ajustes “Estornos de Débitos” N - 02 O.
   *
   * @return the 09 VL_ESTORNOS_DEB Valor total de Ajustes “Estornos de Débitos” N - 02 O
   */
  public BigDecimal getR09_VL_ESTORNOS_DEB() {
    return r09_VL_ESTORNOS_DEB;
  }

  /**
   * Define o 09 VL_ESTORNOS_DEB Valor total de Ajustes “Estornos de Débitos” N - 02 O.
   *
   * @param r09_VL_ESTORNOS_DEB the new 09 VL_ESTORNOS_DEB Valor total de Ajustes “Estornos de Débitos” N - 02 O
   */
  public void setR09_VL_ESTORNOS_DEB(BigDecimal r09_VL_ESTORNOS_DEB) {
    this.r09_VL_ESTORNOS_DEB = r09_VL_ESTORNOS_DEB;
  }

  /**
   * Recupera o 10 VL_SLD_CREDOR_ANT Valor total de "Saldo credor do período anterior" N - 02 O.
   *
   * @return the 10 VL_SLD_CREDOR_ANT Valor total de "Saldo credor do período anterior" N - 02 O
   */
  public BigDecimal getR10_VL_SLD_CREDOR_ANT() {
    return r10_VL_SLD_CREDOR_ANT;
  }

  /**
   * Define o 10 VL_SLD_CREDOR_ANT Valor total de "Saldo credor do período anterior" N - 02 O.
   *
   * @param r10_VL_SLD_CREDOR_ANT the new 10 VL_SLD_CREDOR_ANT Valor total de "Saldo credor do período anterior" N - 02 O
   */
  public void setR10_VL_SLD_CREDOR_ANT(BigDecimal r10_VL_SLD_CREDOR_ANT) {
    this.r10_VL_SLD_CREDOR_ANT = r10_VL_SLD_CREDOR_ANT;
  }

  /**
   * Recupera o 11 VL_SLD_APURADO Valor do saldo devedor apurado N - 02 O.
   *
   * @return the 11 VL_SLD_APURADO Valor do saldo devedor apurado N - 02 O
   */
  public BigDecimal getR11_VL_SLD_APURADO() {
    return r11_VL_SLD_APURADO;
  }

  /**
   * Define o 11 VL_SLD_APURADO Valor do saldo devedor apurado N - 02 O.
   *
   * @param r11_VL_SLD_APURADO the new 11 VL_SLD_APURADO Valor do saldo devedor apurado N - 02 O
   */
  public void setR11_VL_SLD_APURADO(BigDecimal r11_VL_SLD_APURADO) {
    this.r11_VL_SLD_APURADO = r11_VL_SLD_APURADO;
  }

  /**
   * Recupera o 12 VL_TOT_DED Valor total de "Deduções" N - 02 O.
   *
   * @return the 12 VL_TOT_DED Valor total de "Deduções" N - 02 O
   */
  public BigDecimal getR12_VL_TOT_DED() {
    return r12_VL_TOT_DED;
  }

  /**
   * Define o 12 VL_TOT_DED Valor total de "Deduções" N - 02 O.
   *
   * @param r12_VL_TOT_DED the new 12 VL_TOT_DED Valor total de "Deduções" N - 02 O
   */
  public void setR12_VL_TOT_DED(BigDecimal r12_VL_TOT_DED) {
    this.r12_VL_TOT_DED = r12_VL_TOT_DED;
  }

  /**
   * Recupera o 13 VL_ICMS_RECOLHER Valor total de "ICMS a recolher (11-12) N - 02 O.
   *
   * @return the 13 VL_ICMS_RECOLHER Valor total de "ICMS a recolher (11-12) N - 02 O
   */
  public BigDecimal getR13_VL_ICMS_RECOLHER() {
    return r13_VL_ICMS_RECOLHER;
  }

  /**
   * Define o 13 VL_ICMS_RECOLHER Valor total de "ICMS a recolher (11-12) N - 02 O.
   *
   * @param r13_VL_ICMS_RECOLHER the new 13 VL_ICMS_RECOLHER Valor total de "ICMS a recolher (11-12) N - 02 O
   */
  public void setR13_VL_ICMS_RECOLHER(BigDecimal r13_VL_ICMS_RECOLHER) {
    this.r13_VL_ICMS_RECOLHER = r13_VL_ICMS_RECOLHER;
  }

  /**
   * Recupera o 14 VL_SLD_CREDOR_TRANSPORTAR Valor total de "Saldo credor a transportar para o período seguinte” N - 02 O.
   *
   * @return the 14 VL_SLD_CREDOR_TRANSPORTAR Valor total de "Saldo credor a transportar para o período seguinte” N - 02 O
   */
  public BigDecimal getR14_VL_SLD_CREDOR_TRANSPORTAR() {
    return r14_VL_SLD_CREDOR_TRANSPORTAR;
  }

  /**
   * Define o 14 VL_SLD_CREDOR_TRANSPORTAR Valor total de "Saldo credor a transportar para o período seguinte” N - 02 O.
   *
   * @param r14_VL_SLD_CREDOR_TRANSPORTAR the new 14 VL_SLD_CREDOR_TRANSPORTAR Valor total de "Saldo credor a transportar para o período seguinte” N - 02 O
   */
  public void setR14_VL_SLD_CREDOR_TRANSPORTAR(BigDecimal r14_VL_SLD_CREDOR_TRANSPORTAR) {
    this.r14_VL_SLD_CREDOR_TRANSPORTAR = r14_VL_SLD_CREDOR_TRANSPORTAR;
  }

  /**
   * Recupera o 15 DEB_ESP Valores recolhidos ou a recolher, extraapuração. N - 02 O.
   *
   * @return the 15 DEB_ESP Valores recolhidos ou a recolher, extraapuração
   */
  public BigDecimal getR15_DEB_ESP() {
    return r15_DEB_ESP;
  }

  /**
   * Define o 15 DEB_ESP Valores recolhidos ou a recolher, extraapuração. N - 02 O.
   *
   * @param r15_DEB_ESP the new 15 DEB_ESP Valores recolhidos ou a recolher, extraapuração
   */
  public void setR15_DEB_ESP(BigDecimal r15_DEB_ESP) {
    this.r15_DEB_ESP = r15_DEB_ESP;
  }

  /**
   * Gets the re 116.
   *
   * @return the re 116
   */
  public SPEDFiscalE116 getRe116() {
    return re116;
  }

  /**
   * Sets the re 116.
   *
   * @param re116 the new re 116
   */
  public void setRe116(SPEDFiscalE116 re116) {
    this.re116 = re116;
  }

}