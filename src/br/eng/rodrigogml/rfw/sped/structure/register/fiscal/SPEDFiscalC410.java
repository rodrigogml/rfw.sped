package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C410: PIS E COFINS TOTALIZADOS NO DIA (CÓDIGO 02 e 2D).<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalC410 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscalC410(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 VL_PIS Valor total do PIS N - 02 OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r02_VL_PIS = null;

  /**
   * 03 VL_COFINS Valor total da COFINS N - 02 OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r03_VL_COFINS = null;

  @Override
  public String get01_Register() {
    return "C410";
  }

  /**
   * Recupera o 02 VL_PIS Valor total do PIS N - 02 OC.
   *
   * @return the 02 VL_PIS Valor total do PIS N - 02 OC
   */
  public BigDecimal getR02_VL_PIS() {
    return r02_VL_PIS;
  }

  /**
   * Define o 02 VL_PIS Valor total do PIS N - 02 OC.
   *
   * @param r02_VL_PIS the new 02 VL_PIS Valor total do PIS N - 02 OC
   */
  public void setR02_VL_PIS(BigDecimal r02_VL_PIS) {
    this.r02_VL_PIS = r02_VL_PIS;
  }

  /**
   * Recupera o 03 VL_COFINS Valor total da COFINS N - 02 OC.
   *
   * @return the 03 VL_COFINS Valor total da COFINS N - 02 OC
   */
  public BigDecimal getR03_VL_COFINS() {
    return r03_VL_COFINS;
  }

  /**
   * Define o 03 VL_COFINS Valor total da COFINS N - 02 OC.
   *
   * @param r03_VL_COFINS the new 03 VL_COFINS Valor total da COFINS N - 02 OC
   */
  public void setR03_VL_COFINS(BigDecimal r03_VL_COFINS) {
    this.r03_VL_COFINS = r03_VL_COFINS;
  }
}