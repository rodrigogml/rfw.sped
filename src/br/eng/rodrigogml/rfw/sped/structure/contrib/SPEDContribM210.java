package br.eng.rodrigogml.rfw.sped.structure.contrib;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO M210: DETALHAMENTO DA CONTRIBUI��O PARA O PIS/PASEP DO PER�ODO.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribM210 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * C�digo da contribui��o social apurada no per�odo, conforme a Tabela 4.3.5. C 002* - S
   */
  @SPEDField(maxLength = 2, minLength = 2, required = true)
  private String r02_COD_CONT = null;

  /**
   * Valor da Receita Bruta N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r03_VL_REC_BRT = null;

  /**
   * Valor da Base de C�lculo da Contribui��o N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r04_VL_BC_CONT = null;

  /**
   * Al�quota do PIS/PASEP (em percentual) N 008 04 N
   */
  @SPEDField(maxLength = 8, decimals = 4, required = false)
  private BigDecimal r05_ALIQ_PIS = null;

  /**
   * Quantidade � Base de c�lculo PIS N - 03 N
   */
  @SPEDField(maxLength = 20, decimals = 3, required = false)
  private BigDecimal r06_QUANT_BC_PIS = null;

  /**
   * Al�quota do PIS (em reais) N - 04 N
   */
  @SPEDField(maxLength = 20, decimals = 4, required = false)
  private BigDecimal r07_ALIQ_PIS_QUANT = null;

  /**
   * Valor total da contribui��o social apurada N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r08_VL_CONT_APUR = null;

  /**
   * Valor total dos ajustes de acr�scimo N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r09_VL_AJUS_ACRES = null;

  /**
   * Valor total dos ajustes de redu��o N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r10_VL_AJUS_REDUC = null;

  /**
   * Valor da contribui��o a diferir no per�odo N - 02 N
   */
  @SPEDField(maxLength = 20, decimals = 2, required = false)
  private BigDecimal r11_VL_CONT_DIFER = null;

  /**
   * Valor da contribui��o diferida em per�odos anteriores N - 02 N
   */
  @SPEDField(maxLength = 20, decimals = 2, required = false)
  private BigDecimal r12_VL_CONT_DIFER_ANT = null;

  /**
   * Valor Total da Contribui��o do Per�odo (08 + 09 � 10 � 11+12) N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r13_VL_CONT_PER = null;

  @Override
  public String get01_Register() {
    return "M210";
  }

  /**
   * Recupera o c�digo da contribui��o social apurada no per�odo, conforme a Tabela 4.3.5. C 002* - S.
   *
   * @return the c�digo da contribui��o social apurada no per�odo, conforme a Tabela 4
   */
  public String getR02_COD_CONT() {
    return r02_COD_CONT;
  }

  /**
   * Define o c�digo da contribui��o social apurada no per�odo, conforme a Tabela 4.3.5. C 002* - S.
   *
   * @param r02_COD_CONT the new c�digo da contribui��o social apurada no per�odo, conforme a Tabela 4
   */
  public void setR02_COD_CONT(String r02_COD_CONT) {
    this.r02_COD_CONT = r02_COD_CONT;
  }

  /**
   * Recupera o valor da Receita Bruta N - 02 S.
   *
   * @return the valor da Receita Bruta N - 02 S
   */
  public BigDecimal getR03_VL_REC_BRT() {
    return r03_VL_REC_BRT;
  }

  /**
   * Define o valor da Receita Bruta N - 02 S.
   *
   * @param r03_VL_REC_BRT the new valor da Receita Bruta N - 02 S
   */
  public void setR03_VL_REC_BRT(BigDecimal r03_VL_REC_BRT) {
    this.r03_VL_REC_BRT = r03_VL_REC_BRT;
  }

  /**
   * Recupera o valor da Base de C�lculo da Contribui��o N - 02 S.
   *
   * @return the valor da Base de C�lculo da Contribui��o N - 02 S
   */
  public BigDecimal getR04_VL_BC_CONT() {
    return r04_VL_BC_CONT;
  }

  /**
   * Define o valor da Base de C�lculo da Contribui��o N - 02 S.
   *
   * @param r04_VL_BC_CONT the new valor da Base de C�lculo da Contribui��o N - 02 S
   */
  public void setR04_VL_BC_CONT(BigDecimal r04_VL_BC_CONT) {
    this.r04_VL_BC_CONT = r04_VL_BC_CONT;
  }

  /**
   * Recupera o al�quota do PIS/PASEP (em percentual) N 008 04 N.
   *
   * @return the al�quota do PIS/PASEP (em percentual) N 008 04 N
   */
  public BigDecimal getR05_ALIQ_PIS() {
    return r05_ALIQ_PIS;
  }

  /**
   * Define o al�quota do PIS/PASEP (em percentual) N 008 04 N.
   *
   * @param r05_ALIQ_PIS the new al�quota do PIS/PASEP (em percentual) N 008 04 N
   */
  public void setR05_ALIQ_PIS(BigDecimal r05_ALIQ_PIS) {
    this.r05_ALIQ_PIS = r05_ALIQ_PIS;
  }

  /**
   * Recupera o quantidade � Base de c�lculo PIS N - 03 N.
   *
   * @return the quantidade � Base de c�lculo PIS N - 03 N
   */
  public BigDecimal getR06_QUANT_BC_PIS() {
    return r06_QUANT_BC_PIS;
  }

  /**
   * Define o quantidade � Base de c�lculo PIS N - 03 N.
   *
   * @param r06_QUANT_BC_PIS the new quantidade � Base de c�lculo PIS N - 03 N
   */
  public void setR06_QUANT_BC_PIS(BigDecimal r06_QUANT_BC_PIS) {
    this.r06_QUANT_BC_PIS = r06_QUANT_BC_PIS;
  }

  /**
   * Recupera o al�quota do PIS (em reais) N - 04 N.
   *
   * @return the al�quota do PIS (em reais) N - 04 N
   */
  public BigDecimal getR07_ALIQ_PIS_QUANT() {
    return r07_ALIQ_PIS_QUANT;
  }

  /**
   * Define o al�quota do PIS (em reais) N - 04 N.
   *
   * @param r07_ALIQ_PIS_QUANT the new al�quota do PIS (em reais) N - 04 N
   */
  public void setR07_ALIQ_PIS_QUANT(BigDecimal r07_ALIQ_PIS_QUANT) {
    this.r07_ALIQ_PIS_QUANT = r07_ALIQ_PIS_QUANT;
  }

  /**
   * Recupera o valor total da contribui��o social apurada N - 02 S.
   *
   * @return the valor total da contribui��o social apurada N - 02 S
   */
  public BigDecimal getR08_VL_CONT_APUR() {
    return r08_VL_CONT_APUR;
  }

  /**
   * Define o valor total da contribui��o social apurada N - 02 S.
   *
   * @param r08_VL_CONT_APUR the new valor total da contribui��o social apurada N - 02 S
   */
  public void setR08_VL_CONT_APUR(BigDecimal r08_VL_CONT_APUR) {
    this.r08_VL_CONT_APUR = r08_VL_CONT_APUR;
  }

  /**
   * Recupera o valor total dos ajustes de acr�scimo N - 02 S.
   *
   * @return the valor total dos ajustes de acr�scimo N - 02 S
   */
  public BigDecimal getR09_VL_AJUS_ACRES() {
    return r09_VL_AJUS_ACRES;
  }

  /**
   * Define o valor total dos ajustes de acr�scimo N - 02 S.
   *
   * @param r09_VL_AJUS_ACRES the new valor total dos ajustes de acr�scimo N - 02 S
   */
  public void setR09_VL_AJUS_ACRES(BigDecimal r09_VL_AJUS_ACRES) {
    this.r09_VL_AJUS_ACRES = r09_VL_AJUS_ACRES;
  }

  /**
   * Recupera o valor total dos ajustes de redu��o N - 02 S.
   *
   * @return the valor total dos ajustes de redu��o N - 02 S
   */
  public BigDecimal getR10_VL_AJUS_REDUC() {
    return r10_VL_AJUS_REDUC;
  }

  /**
   * Define o valor total dos ajustes de redu��o N - 02 S.
   *
   * @param r10_VL_AJUS_REDUC the new valor total dos ajustes de redu��o N - 02 S
   */
  public void setR10_VL_AJUS_REDUC(BigDecimal r10_VL_AJUS_REDUC) {
    this.r10_VL_AJUS_REDUC = r10_VL_AJUS_REDUC;
  }

  /**
   * Recupera o valor da contribui��o a diferir no per�odo N - 02 N.
   *
   * @return the valor da contribui��o a diferir no per�odo N - 02 N
   */
  public BigDecimal getR11_VL_CONT_DIFER() {
    return r11_VL_CONT_DIFER;
  }

  /**
   * Define o valor da contribui��o a diferir no per�odo N - 02 N.
   *
   * @param r11_VL_CONT_DIFER the new valor da contribui��o a diferir no per�odo N - 02 N
   */
  public void setR11_VL_CONT_DIFER(BigDecimal r11_VL_CONT_DIFER) {
    this.r11_VL_CONT_DIFER = r11_VL_CONT_DIFER;
  }

  /**
   * Recupera o valor da contribui��o diferida em per�odos anteriores N - 02 N.
   *
   * @return the valor da contribui��o diferida em per�odos anteriores N - 02 N
   */
  public BigDecimal getR12_VL_CONT_DIFER_ANT() {
    return r12_VL_CONT_DIFER_ANT;
  }

  /**
   * Define o valor da contribui��o diferida em per�odos anteriores N - 02 N.
   *
   * @param r12_VL_CONT_DIFER_ANT the new valor da contribui��o diferida em per�odos anteriores N - 02 N
   */
  public void setR12_VL_CONT_DIFER_ANT(BigDecimal r12_VL_CONT_DIFER_ANT) {
    this.r12_VL_CONT_DIFER_ANT = r12_VL_CONT_DIFER_ANT;
  }

  /**
   * Recupera o valor Total da Contribui��o do Per�odo (08 + 09 � 10 � 11+12) N - 02 S.
   *
   * @return the valor Total da Contribui��o do Per�odo (08 + 09 � 10 � 11+12) N - 02 S
   */
  public BigDecimal getR13_VL_CONT_PER() {
    return r13_VL_CONT_PER;
  }

  /**
   * Define o valor Total da Contribui��o do Per�odo (08 + 09 � 10 � 11+12) N - 02 S.
   *
   * @param r13_VL_CONT_PER the new valor Total da Contribui��o do Per�odo (08 + 09 � 10 � 11+12) N - 02 S
   */
  public void setR13_VL_CONT_PER(BigDecimal r13_VL_CONT_PER) {
    this.r13_VL_CONT_PER = r13_VL_CONT_PER;
  }

}