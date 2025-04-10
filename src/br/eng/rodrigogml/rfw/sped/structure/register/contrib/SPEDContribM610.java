package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

// TODO: Auto-generated Javadoc
/**
 * Description: REGISTRO M610: DETALHAMENTO DA CONTRIBUI��O PARA A SEGURIDADE SOCIAL - COFINS DO PER�ODO.<br>
 *
 * @author Rodrigo GML
 * @version 1.0.0 - Rodrigo GML-(...)
 * @since 1.0.0 (25 de jul. de 2023)
 */
public class SPEDContribM610 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  public SPEDContribM610(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * C�digo da contribui��o social apurada no per�odo, conforme a Tabela 4.3.5. C 002 - S
   */
  @SPEDField(maxLength = 2, required = true)
  private String r02_COD_CONT = null;

  /** Valor da Receita Bruta N - 02 S. */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r03_VL_REC_BRT = null;

  /** Valor da Base de C�lculo da Contribui��o N - 02 S. */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r04_VL_BC_CONT = null;

  /** Valor do total dos ajustes de acr�scimo da base de c�lculo da contribui��o a que se refere o Campo 04 N - 02 S. */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r05_VL_AJUS_ACRES_BC_COFINS = null;

  /** Valor do total dos ajustes de redu��o da base de c�lculo da contribui��o a que se refere o Campo 04 N - 02 S. */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r06_VL_AJUS_REDUC_BC_COFINS = null;

  /**
   * Valor da Base de C�lculo da Contribui��o, ap�s os ajustes. (Campo 07 = Campo 04 + Campo 05 - Campo 06) N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r07_VL_BC_CONT_AJUS = null;

  /** Al�quota do COFINS (em percentual) N 008 04 N. */
  @SPEDField(maxLength = 8, decimals = 4, required = false)
  private BigDecimal r08_ALIQ_COFINS = null;

  /** Quantidade � Base de c�lculo COFINS N - 03 N. */
  @SPEDField(maxLength = 20, decimals = 3, required = false)
  private BigDecimal r09_QUANT_BC_COFINS = null;

  /** Al�quota do COFINS (em reais) N - 04 N. */
  @SPEDField(maxLength = 20, decimals = 4, required = false)
  private BigDecimal r10_ALIQ_COFINS_QUANT = null;

  /** Valor total da contribui��o social apurada N - 02 S. */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r11_VL_CONT_APUR = null;

  /** Valor total dos ajustes de acr�scimo N - 02 S. */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r12_VL_AJUS_ACRES = null;

  /** Valor total dos ajustes de redu��o N - 02 S. */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r13_VL_AJUS_REDUC = null;

  /** Valor da contribui��o a diferir no per�odo N - 02 N. */
  @SPEDField(maxLength = 20, decimals = 2, required = false)
  private BigDecimal r14_VL_CONT_DIFER = null;

  /** Valor da contribui��o diferida em per�odos anteriores N - 02 N. */
  @SPEDField(maxLength = 20, decimals = 2, required = false)
  private BigDecimal r15_VL_CONT_DIFER_ANT = null;

  /** Valor Total da Contribui��o do Per�odo (08 + 09 � 10 � 11 +12) N - 02 S. */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r16_VL_CONT_PER = null;

  /**
   * Gets the 01 register.
   *
   * @return the 01 register
   */
  @Override
  public String get01_Register() {
    return "M610";
  }

  /**
   * # c�digo da contribui��o social apurada no per�odo, conforme a Tabela 4.3.5. C 002 - S.
   *
   * @return the c�digo da contribui��o social apurada no per�odo, conforme a Tabela 4
   */
  public String getR02_COD_CONT() {
    return r02_COD_CONT;
  }

  /**
   * # c�digo da contribui��o social apurada no per�odo, conforme a Tabela 4.3.5. C 002 - S.
   *
   * @param r02_COD_CONT the new c�digo da contribui��o social apurada no per�odo, conforme a Tabela 4
   */
  public void setR02_COD_CONT(String r02_COD_CONT) {
    this.r02_COD_CONT = r02_COD_CONT;
  }

  /**
   * # valor da Receita Bruta N - 02 S.
   *
   * @return the valor da Receita Bruta N - 02 S
   */
  public BigDecimal getR03_VL_REC_BRT() {
    return r03_VL_REC_BRT;
  }

  /**
   * # valor da Receita Bruta N - 02 S.
   *
   * @param r03_VL_REC_BRT the new valor da Receita Bruta N - 02 S
   */
  public void setR03_VL_REC_BRT(BigDecimal r03_VL_REC_BRT) {
    this.r03_VL_REC_BRT = r03_VL_REC_BRT;
  }

  /**
   * # valor da Base de C�lculo da Contribui��o N - 02 S.
   *
   * @return the valor da Base de C�lculo da Contribui��o N - 02 S
   */
  public BigDecimal getR04_VL_BC_CONT() {
    return r04_VL_BC_CONT;
  }

  /**
   * # valor da Base de C�lculo da Contribui��o N - 02 S.
   *
   * @param r04_VL_BC_CONT the new valor da Base de C�lculo da Contribui��o N - 02 S
   */
  public void setR04_VL_BC_CONT(BigDecimal r04_VL_BC_CONT) {
    this.r04_VL_BC_CONT = r04_VL_BC_CONT;
  }

  /**
   * # valor do total dos ajustes de acr�scimo da base de c�lculo da contribui��o a que se refere o Campo 04 N - 02 S.
   *
   * @return the valor do total dos ajustes de acr�scimo da base de c�lculo da contribui��o a que se refere o Campo 04 N - 02 S
   */
  public BigDecimal getR05_VL_AJUS_ACRES_BC_COFINS() {
    return r05_VL_AJUS_ACRES_BC_COFINS;
  }

  /**
   * # valor do total dos ajustes de acr�scimo da base de c�lculo da contribui��o a que se refere o Campo 04 N - 02 S.
   *
   * @param r05_VL_AJUS_ACRES_BC_COFINS the new valor do total dos ajustes de acr�scimo da base de c�lculo da contribui��o a que se refere o Campo 04 N - 02 S
   */
  public void setR05_VL_AJUS_ACRES_BC_COFINS(BigDecimal r05_VL_AJUS_ACRES_BC_COFINS) {
    this.r05_VL_AJUS_ACRES_BC_COFINS = r05_VL_AJUS_ACRES_BC_COFINS;
  }

  /**
   * # valor do total dos ajustes de redu��o da base de c�lculo da contribui��o a que se refere o Campo 04 N - 02 S.
   *
   * @return the valor do total dos ajustes de redu��o da base de c�lculo da contribui��o a que se refere o Campo 04 N - 02 S
   */
  public BigDecimal getR06_VL_AJUS_REDUC_BC_COFINS() {
    return r06_VL_AJUS_REDUC_BC_COFINS;
  }

  /**
   * # valor do total dos ajustes de redu��o da base de c�lculo da contribui��o a que se refere o Campo 04 N - 02 S.
   *
   * @param r06_VL_AJUS_REDUC_BC_COFINS the new valor do total dos ajustes de redu��o da base de c�lculo da contribui��o a que se refere o Campo 04 N - 02 S
   */
  public void setR06_VL_AJUS_REDUC_BC_COFINS(BigDecimal r06_VL_AJUS_REDUC_BC_COFINS) {
    this.r06_VL_AJUS_REDUC_BC_COFINS = r06_VL_AJUS_REDUC_BC_COFINS;
  }

  /**
   * # valor da Base de C�lculo da Contribui��o, ap�s os ajustes. (Campo 07 = Campo 04 + Campo 05 - Campo 06) N - 02 S.
   *
   * @return the valor da Base de C�lculo da Contribui��o, ap�s os ajustes
   */
  public BigDecimal getR07_VL_BC_CONT_AJUS() {
    return r07_VL_BC_CONT_AJUS;
  }

  /**
   * # valor da Base de C�lculo da Contribui��o, ap�s os ajustes. (Campo 07 = Campo 04 + Campo 05 - Campo 06) N - 02 S.
   *
   * @param r07_VL_BC_CONT_AJUS the new valor da Base de C�lculo da Contribui��o, ap�s os ajustes
   */
  public void setR07_VL_BC_CONT_AJUS(BigDecimal r07_VL_BC_CONT_AJUS) {
    this.r07_VL_BC_CONT_AJUS = r07_VL_BC_CONT_AJUS;
  }

  /**
   * # al�quota do COFINS (em percentual) N 008 04 N.
   *
   * @return the al�quota do COFINS (em percentual) N 008 04 N
   */
  public BigDecimal getR08_ALIQ_COFINS() {
    return r08_ALIQ_COFINS;
  }

  /**
   * # al�quota do COFINS (em percentual) N 008 04 N.
   *
   * @param r08_ALIQ_COFINS the new al�quota do COFINS (em percentual) N 008 04 N
   */
  public void setR08_ALIQ_COFINS(BigDecimal r08_ALIQ_COFINS) {
    this.r08_ALIQ_COFINS = r08_ALIQ_COFINS;
  }

  /**
   * # quantidade � Base de c�lculo COFINS N - 03 N.
   *
   * @return the quantidade � Base de c�lculo COFINS N - 03 N
   */
  public BigDecimal getR09_QUANT_BC_COFINS() {
    return r09_QUANT_BC_COFINS;
  }

  /**
   * # quantidade � Base de c�lculo COFINS N - 03 N.
   *
   * @param r09_QUANT_BC_COFINS the new quantidade � Base de c�lculo COFINS N - 03 N
   */
  public void setR09_QUANT_BC_COFINS(BigDecimal r09_QUANT_BC_COFINS) {
    this.r09_QUANT_BC_COFINS = r09_QUANT_BC_COFINS;
  }

  /**
   * # al�quota do COFINS (em reais) N - 04 N.
   *
   * @return the al�quota do COFINS (em reais) N - 04 N
   */
  public BigDecimal getR10_ALIQ_COFINS_QUANT() {
    return r10_ALIQ_COFINS_QUANT;
  }

  /**
   * # al�quota do COFINS (em reais) N - 04 N.
   *
   * @param r10_ALIQ_COFINS_QUANT the new al�quota do COFINS (em reais) N - 04 N
   */
  public void setR10_ALIQ_COFINS_QUANT(BigDecimal r10_ALIQ_COFINS_QUANT) {
    this.r10_ALIQ_COFINS_QUANT = r10_ALIQ_COFINS_QUANT;
  }

  /**
   * # valor total da contribui��o social apurada N - 02 S.
   *
   * @return the valor total da contribui��o social apurada N - 02 S
   */
  public BigDecimal getR11_VL_CONT_APUR() {
    return r11_VL_CONT_APUR;
  }

  /**
   * # valor total da contribui��o social apurada N - 02 S.
   *
   * @param r11_VL_CONT_APUR the new valor total da contribui��o social apurada N - 02 S
   */
  public void setR11_VL_CONT_APUR(BigDecimal r11_VL_CONT_APUR) {
    this.r11_VL_CONT_APUR = r11_VL_CONT_APUR;
  }

  /**
   * # valor total dos ajustes de acr�scimo N - 02 S.
   *
   * @return the valor total dos ajustes de acr�scimo N - 02 S
   */
  public BigDecimal getR12_VL_AJUS_ACRES() {
    return r12_VL_AJUS_ACRES;
  }

  /**
   * # valor total dos ajustes de acr�scimo N - 02 S.
   *
   * @param r12_VL_AJUS_ACRES the new valor total dos ajustes de acr�scimo N - 02 S
   */
  public void setR12_VL_AJUS_ACRES(BigDecimal r12_VL_AJUS_ACRES) {
    this.r12_VL_AJUS_ACRES = r12_VL_AJUS_ACRES;
  }

  /**
   * # valor total dos ajustes de redu��o N - 02 S.
   *
   * @return the valor total dos ajustes de redu��o N - 02 S
   */
  public BigDecimal getR13_VL_AJUS_REDUC() {
    return r13_VL_AJUS_REDUC;
  }

  /**
   * # valor total dos ajustes de redu��o N - 02 S.
   *
   * @param r13_VL_AJUS_REDUC the new valor total dos ajustes de redu��o N - 02 S
   */
  public void setR13_VL_AJUS_REDUC(BigDecimal r13_VL_AJUS_REDUC) {
    this.r13_VL_AJUS_REDUC = r13_VL_AJUS_REDUC;
  }

  /**
   * # valor da contribui��o a diferir no per�odo N - 02 N.
   *
   * @return the valor da contribui��o a diferir no per�odo N - 02 N
   */
  public BigDecimal getR14_VL_CONT_DIFER() {
    return r14_VL_CONT_DIFER;
  }

  /**
   * # valor da contribui��o a diferir no per�odo N - 02 N.
   *
   * @param r14_VL_CONT_DIFER the new valor da contribui��o a diferir no per�odo N - 02 N
   */
  public void setR14_VL_CONT_DIFER(BigDecimal r14_VL_CONT_DIFER) {
    this.r14_VL_CONT_DIFER = r14_VL_CONT_DIFER;
  }

  /**
   * # valor da contribui��o diferida em per�odos anteriores N - 02 N.
   *
   * @return the valor da contribui��o diferida em per�odos anteriores N - 02 N
   */
  public BigDecimal getR15_VL_CONT_DIFER_ANT() {
    return r15_VL_CONT_DIFER_ANT;
  }

  /**
   * # valor da contribui��o diferida em per�odos anteriores N - 02 N.
   *
   * @param r15_VL_CONT_DIFER_ANT the new valor da contribui��o diferida em per�odos anteriores N - 02 N
   */
  public void setR15_VL_CONT_DIFER_ANT(BigDecimal r15_VL_CONT_DIFER_ANT) {
    this.r15_VL_CONT_DIFER_ANT = r15_VL_CONT_DIFER_ANT;
  }

  /**
   * # valor Total da Contribui��o do Per�odo (08 + 09 � 10 � 11 +12) N - 02 S.
   *
   * @return the valor Total da Contribui��o do Per�odo (08 + 09 � 10 � 11 +12) N - 02 S
   */
  public BigDecimal getR16_VL_CONT_PER() {
    return r16_VL_CONT_PER;
  }

  /**
   * # valor Total da Contribui��o do Per�odo (08 + 09 � 10 � 11 +12) N - 02 S.
   *
   * @param r16_VL_CONT_PER the new valor Total da Contribui��o do Per�odo (08 + 09 � 10 � 11 +12) N - 02 S
   */
  public void setR16_VL_CONT_PER(BigDecimal r16_VL_CONT_PER) {
    this.r16_VL_CONT_PER = r16_VL_CONT_PER;
  }

}