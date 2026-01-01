package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO H020: Informação complementar do Inventário..<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalH020 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscalH020(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 CST_ICMS Código da Situação Tributária referente ao ICMS, conforme a Tabela indicada no item 4.3.1 N 003* - O
   */
  @SPEDField(maxLength = 3, minLength = 3)
  private String r02_CST_ICMS = null;

  /**
   * 03 BC_ICMS Informe a base de cálculo do ICMS N - 02 O
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
   * Recupera o 02 CST_ICMS Código da Situação Tributária referente ao ICMS, conforme a Tabela indicada no item 4.3.1 N 003* - O.
   *
   * @return the 02 CST_ICMS Código da Situação Tributária referente ao ICMS, conforme a Tabela indicada no item 4
   */
  public String getR02_CST_ICMS() {
    return r02_CST_ICMS;
  }

  /**
   * Define o 02 CST_ICMS Código da Situação Tributária referente ao ICMS, conforme a Tabela indicada no item 4.3.1 N 003* - O.
   *
   * @param r02_CST_ICMS the new 02 CST_ICMS Código da Situação Tributária referente ao ICMS, conforme a Tabela indicada no item 4
   */
  public void setR02_CST_ICMS(String r02_CST_ICMS) {
    this.r02_CST_ICMS = r02_CST_ICMS;
  }

  /**
   * Recupera o 03 BC_ICMS Informe a base de cálculo do ICMS N - 02 O.
   *
   * @return the 03 BC_ICMS Informe a base de cálculo do ICMS N - 02 O
   */
  public BigDecimal getR03_BC_ICMS() {
    return r03_BC_ICMS;
  }

  /**
   * Define o 03 BC_ICMS Informe a base de cálculo do ICMS N - 02 O.
   *
   * @param r03_BC_ICMS the new 03 BC_ICMS Informe a base de cálculo do ICMS N - 02 O
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