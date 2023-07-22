package br.eng.rodrigogml.rfw.sped.structure.fiscal;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO H020: Informa��o complementar do Invent�rio..<br>
 *
 * @author Rodrigo Leit�o
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalH020 extends SPEDRegister {

  /**
   * 02 CST_ICMS C�digo da Situa��o Tribut�ria referente ao ICMS, conforme a Tabela indicada no item 4.3.1 N 003* - O
   */
  @SPEDField(maxLength = 3, minLength = 3)
  private String r02_CST_ICMS = null;

  /**
   * 03 BC_ICMS Informe a base de c�lculo do ICMS N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r03_BC_ICMS = null;

  /**
   * 04 VL_ICMS Informe o valor do ICMS a ser debitado ou creditado N 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r04_VL_ICMS = null;

  @Override
  public String get01_Register() {
    return "H020";
  }

  /**
   * Recupera o 02 CST_ICMS C�digo da Situa��o Tribut�ria referente ao ICMS, conforme a Tabela indicada no item 4.3.1 N 003* - O.
   *
   * @return the 02 CST_ICMS C�digo da Situa��o Tribut�ria referente ao ICMS, conforme a Tabela indicada no item 4
   */
  public String getR02_CST_ICMS() {
    return r02_CST_ICMS;
  }

  /**
   * Define o 02 CST_ICMS C�digo da Situa��o Tribut�ria referente ao ICMS, conforme a Tabela indicada no item 4.3.1 N 003* - O.
   *
   * @param r02_CST_ICMS the new 02 CST_ICMS C�digo da Situa��o Tribut�ria referente ao ICMS, conforme a Tabela indicada no item 4
   */
  public void setR02_CST_ICMS(String r02_CST_ICMS) {
    this.r02_CST_ICMS = r02_CST_ICMS;
  }

  /**
   * Recupera o 03 BC_ICMS Informe a base de c�lculo do ICMS N - 02 O.
   *
   * @return the 03 BC_ICMS Informe a base de c�lculo do ICMS N - 02 O
   */
  public BigDecimal getR03_BC_ICMS() {
    return r03_BC_ICMS;
  }

  /**
   * Define o 03 BC_ICMS Informe a base de c�lculo do ICMS N - 02 O.
   *
   * @param r03_BC_ICMS the new 03 BC_ICMS Informe a base de c�lculo do ICMS N - 02 O
   */
  public void setR03_BC_ICMS(BigDecimal r03_BC_ICMS) {
    this.r03_BC_ICMS = r03_BC_ICMS;
  }

  /**
   * Recupera o 04 VL_ICMS Informe o valor do ICMS a ser debitado ou creditado N 02 O.
   *
   * @return the 04 VL_ICMS Informe o valor do ICMS a ser debitado ou creditado N 02 O
   */
  public BigDecimal getR04_VL_ICMS() {
    return r04_VL_ICMS;
  }

  /**
   * Define o 04 VL_ICMS Informe o valor do ICMS a ser debitado ou creditado N 02 O.
   *
   * @param r04_VL_ICMS the new 04 VL_ICMS Informe o valor do ICMS a ser debitado ou creditado N 02 O
   */
  public void setR04_VL_ICMS(BigDecimal r04_VL_ICMS) {
    this.r04_VL_ICMS = r04_VL_ICMS;
  }

}