package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C490: REGISTRO ANAL�TICO DO MOVIMENTO DI�RIO (C�DIGO 02, 2D e 60).<br>
 *
 * @author Rodrigo Leit�o
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalC490 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  /**
   * 02 CST_ICMS C�digo da Situa��o Tribut�ria, conforme a Tabela indicada no item 4.3.1 N 003* - O
   */
  @SPEDField(maxLength = 3, minLength = 3)
  private String r02_CST_ICMS = null;

  /**
   * 03 CFOP C�digo Fiscal de Opera��o e Presta��o N 004* - O
   */
  @SPEDField(maxLength = 4, minLength = 4)
  private String r03_CFOP = null;

  /**
   * 04 ALIQ_ICMS Al�quota do ICMS N 006 02 OC
   */
  @SPEDField(maxLength = 6, decimals = 2, required = false)
  private BigDecimal r04_ALIQ_ICMS = null;

  /**
   * 05 VL_OPR Valor da opera��o correspondente � combina��o de CST_ICMS, CFOP, e al�quota do ICMS, inclu�das as despesas acess�rias e acr�scimos N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r05_VL_OPR = null;

  /**
   * 06 VL_BC_ICMS Valor acumulado da base de c�lculo do ICMS, referente � combina��o de CST_ICMS, CFOP, e al�quota do ICMS. N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r06_VL_BC_ICMS = null;

  /**
   * 07 VL_ICMS Valor acumulado do ICMS, referente � combina��o de CST_ICMS, CFOP e al�quota do ICMS. N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r07_VL_ICMS = null;

  /**
   * 08 COD_OBS C�digo da observa��o do lan�amento fiscal (campo 02 do Registro 0460) C 006 - OC
   */
  @SPEDField(maxLength = 6, required = false)
  private String r08_COD_OBS = null;

  @Override
  public String get01_Register() {
    return "C490";
  }

  /**
   * Recupera o 02 CST_ICMS C�digo da Situa��o Tribut�ria, conforme a Tabela indicada no item 4.3.1 N 003* - O.
   *
   * @return the 02 CST_ICMS C�digo da Situa��o Tribut�ria, conforme a Tabela indicada no item 4
   */
  public String getR02_CST_ICMS() {
    return r02_CST_ICMS;
  }

  /**
   * Define o 02 CST_ICMS C�digo da Situa��o Tribut�ria, conforme a Tabela indicada no item 4.3.1 N 003* - O.
   *
   * @param r02_CST_ICMS the new 02 CST_ICMS C�digo da Situa��o Tribut�ria, conforme a Tabela indicada no item 4
   */
  public void setR02_CST_ICMS(String r02_CST_ICMS) {
    this.r02_CST_ICMS = r02_CST_ICMS;
  }

  /**
   * Recupera o 03 CFOP C�digo Fiscal de Opera��o e Presta��o N 004* - O.
   *
   * @return the 03 CFOP C�digo Fiscal de Opera��o e Presta��o N 004* - O
   */
  public String getR03_CFOP() {
    return r03_CFOP;
  }

  /**
   * Define o 03 CFOP C�digo Fiscal de Opera��o e Presta��o N 004* - O.
   *
   * @param r03_CFOP the new 03 CFOP C�digo Fiscal de Opera��o e Presta��o N 004* - O
   */
  public void setR03_CFOP(String r03_CFOP) {
    this.r03_CFOP = r03_CFOP;
  }

  /**
   * Recupera o 04 ALIQ_ICMS Al�quota do ICMS N 006 02 OC.
   *
   * @return the 04 ALIQ_ICMS Al�quota do ICMS N 006 02 OC
   */
  public BigDecimal getR04_ALIQ_ICMS() {
    return r04_ALIQ_ICMS;
  }

  /**
   * Define o 04 ALIQ_ICMS Al�quota do ICMS N 006 02 OC.
   *
   * @param r04_ALIQ_ICMS the new 04 ALIQ_ICMS Al�quota do ICMS N 006 02 OC
   */
  public void setR04_ALIQ_ICMS(BigDecimal r04_ALIQ_ICMS) {
    this.r04_ALIQ_ICMS = r04_ALIQ_ICMS;
  }

  /**
   * Recupera o 05 VL_OPR Valor da opera��o correspondente � combina��o de CST_ICMS, CFOP, e al�quota do ICMS, inclu�das as despesas acess�rias e acr�scimos N - 02 O.
   *
   * @return the 05 VL_OPR Valor da opera��o correspondente � combina��o de CST_ICMS, CFOP, e al�quota do ICMS, inclu�das as despesas acess�rias e acr�scimos N - 02 O
   */
  public BigDecimal getR05_VL_OPR() {
    return r05_VL_OPR;
  }

  /**
   * Define o 05 VL_OPR Valor da opera��o correspondente � combina��o de CST_ICMS, CFOP, e al�quota do ICMS, inclu�das as despesas acess�rias e acr�scimos N - 02 O.
   *
   * @param r05_VL_OPR the new 05 VL_OPR Valor da opera��o correspondente � combina��o de CST_ICMS, CFOP, e al�quota do ICMS, inclu�das as despesas acess�rias e acr�scimos N - 02 O
   */
  public void setR05_VL_OPR(BigDecimal r05_VL_OPR) {
    this.r05_VL_OPR = r05_VL_OPR;
  }

  /**
   * Recupera o 06 VL_BC_ICMS Valor acumulado da base de c�lculo do ICMS, referente � combina��o de CST_ICMS, CFOP, e al�quota do ICMS. N - 02 O.
   *
   * @return the 06 VL_BC_ICMS Valor acumulado da base de c�lculo do ICMS, referente � combina��o de CST_ICMS, CFOP, e al�quota do ICMS
   */
  public BigDecimal getR06_VL_BC_ICMS() {
    return r06_VL_BC_ICMS;
  }

  /**
   * Define o 06 VL_BC_ICMS Valor acumulado da base de c�lculo do ICMS, referente � combina��o de CST_ICMS, CFOP, e al�quota do ICMS. N - 02 O.
   *
   * @param r06_VL_BC_ICMS the new 06 VL_BC_ICMS Valor acumulado da base de c�lculo do ICMS, referente � combina��o de CST_ICMS, CFOP, e al�quota do ICMS
   */
  public void setR06_VL_BC_ICMS(BigDecimal r06_VL_BC_ICMS) {
    this.r06_VL_BC_ICMS = r06_VL_BC_ICMS;
  }

  /**
   * Recupera o 07 VL_ICMS Valor acumulado do ICMS, referente � combina��o de CST_ICMS, CFOP e al�quota do ICMS. N - 02 O.
   *
   * @return the 07 VL_ICMS Valor acumulado do ICMS, referente � combina��o de CST_ICMS, CFOP e al�quota do ICMS
   */
  public BigDecimal getR07_VL_ICMS() {
    return r07_VL_ICMS;
  }

  /**
   * Define o 07 VL_ICMS Valor acumulado do ICMS, referente � combina��o de CST_ICMS, CFOP e al�quota do ICMS. N - 02 O.
   *
   * @param r07_VL_ICMS the new 07 VL_ICMS Valor acumulado do ICMS, referente � combina��o de CST_ICMS, CFOP e al�quota do ICMS
   */
  public void setR07_VL_ICMS(BigDecimal r07_VL_ICMS) {
    this.r07_VL_ICMS = r07_VL_ICMS;
  }

  /**
   * Recupera o 08 COD_OBS C�digo da observa��o do lan�amento fiscal (campo 02 do Registro 0460) C 006 - OC.
   *
   * @return the 08 COD_OBS C�digo da observa��o do lan�amento fiscal (campo 02 do Registro 0460) C 006 - OC
   */
  public String getR08_COD_OBS() {
    return r08_COD_OBS;
  }

  /**
   * Define o 08 COD_OBS C�digo da observa��o do lan�amento fiscal (campo 02 do Registro 0460) C 006 - OC.
   *
   * @param r08_COD_OBS the new 08 COD_OBS C�digo da observa��o do lan�amento fiscal (campo 02 do Registro 0460) C 006 - OC
   */
  public void setR08_COD_OBS(String r08_COD_OBS) {
    this.r08_COD_OBS = r08_COD_OBS;
  }

}