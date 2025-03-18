package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.time.LocalDate;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO E100: PER�ODO DA APURA��O DO ICMS.<br>
 *
 * @author Rodrigo Leit�o
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalE100 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  /**
   * REGISTRO E110: APURA��O DO ICMS � OPERA��ES PR�PRIAS
   */
  private SPEDFiscalE110 re110 = null;

  /**
   * 02 DT_INI Data inicial a que a apura��o se refere N 008* - O
   */
  @SPEDField(maxLength = 8, minLength = 8)
  private LocalDate r02_DT_INI = null;

  /**
   * 03 DT_FIN Data final a que a apura��o se refere N 008* - O
   */
  @SPEDField(maxLength = 8, minLength = 8)
  private LocalDate r03_DT_FIN = null;

  @Override
  public String get01_Register() {
    return "E100";
  }

  /**
   * Recupera o 02 DT_INI Data inicial a que a apura��o se refere N 008* - O.
   *
   * @return the 02 DT_INI Data inicial a que a apura��o se refere N 008* - O
   */
  public LocalDate getR02_DT_INI() {
    return r02_DT_INI;
  }

  /**
   * Define o 02 DT_INI Data inicial a que a apura��o se refere N 008* - O.
   *
   * @param r02_DT_INI the new 02 DT_INI Data inicial a que a apura��o se refere N 008* - O
   */
  public void setR02_DT_INI(LocalDate r02_DT_INI) {
    this.r02_DT_INI = r02_DT_INI;
  }

  /**
   * Recupera o 03 DT_FIN Data final a que a apura��o se refere N 008* - O.
   *
   * @return the 03 DT_FIN Data final a que a apura��o se refere N 008* - O
   */
  public LocalDate getR03_DT_FIN() {
    return r03_DT_FIN;
  }

  /**
   * Define o 03 DT_FIN Data final a que a apura��o se refere N 008* - O.
   *
   * @param r03_DT_FIN the new 03 DT_FIN Data final a que a apura��o se refere N 008* - O
   */
  public void setR03_DT_FIN(LocalDate r03_DT_FIN) {
    this.r03_DT_FIN = r03_DT_FIN;
  }

  /**
   * Recupera o rEGISTRO E110: APURA��O DO ICMS � OPERA��ES PR�PRIAS.
   *
   * @return the rEGISTRO E110: APURA��O DO ICMS � OPERA��ES PR�PRIAS
   */
  public SPEDFiscalE110 getRe110() {
    return re110;
  }

  /**
   * Define o rEGISTRO E110: APURA��O DO ICMS � OPERA��ES PR�PRIAS.
   *
   * @param re110 the new rEGISTRO E110: APURA��O DO ICMS � OPERA��ES PR�PRIAS
   */
  public void setRe110(SPEDFiscalE110 re110) {
    this.re110 = re110;
  }

}