package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C425: RESUMO DE ITENS DO MOVIMENTO DIÁRIO (CÓDIGO 02 e 2D).<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalC425 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscalC425(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 COD_ITEM Código do item (campo 02 do Registro 0200) C 060 - O
   */
  @SPEDField(maxLength = 60)
  private String r02_COD_ITEM = null;

  /**
   * 03 QTD Quantidade acumulada do item N - 03 O
   */
  @SPEDField(maxLength = 255, decimals = 3)
  private BigDecimal r03_QTD = null;

  /**
   * 04 UNID Unidade do item (Campo 02 do registro 0190) C 006 - O
   */
  @SPEDField(maxLength = 6)
  private String r04_UNID = null;

  /**
   * 05 VL_ITEM Valor acumulado do item N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r05_VL_ITEM = null;

  /**
   * 06 VL_PIS Valor do PIS N - 02 OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r06_VL_PIS = null;

  /**
   * 07 VL_COFINS Valor da COFINS N - 02 OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r07_VL_COFINS = null;

  @Override
  public String get01_Register() {
    return "C425";
  }

  /**
   * Recupera o 02 COD_ITEM Código do item (campo 02 do Registro 0200) C 060 - O.
   *
   * @return the 02 COD_ITEM Código do item (campo 02 do Registro 0200) C 060 - O
   */
  public String getR02_COD_ITEM() {
    return r02_COD_ITEM;
  }

  /**
   * Define o 02 COD_ITEM Código do item (campo 02 do Registro 0200) C 060 - O.
   *
   * @param r02_COD_ITEM the new 02 COD_ITEM Código do item (campo 02 do Registro 0200) C 060 - O
   */
  public void setR02_COD_ITEM(String r02_COD_ITEM) {
    this.r02_COD_ITEM = r02_COD_ITEM;
  }

  /**
   * Recupera o 03 QTD Quantidade acumulada do item N - 03 O.
   *
   * @return the 03 QTD Quantidade acumulada do item N - 03 O
   */
  public BigDecimal getR03_QTD() {
    return r03_QTD;
  }

  /**
   * Define o 03 QTD Quantidade acumulada do item N - 03 O.
   *
   * @param r03_QTD the new 03 QTD Quantidade acumulada do item N - 03 O
   */
  public void setR03_QTD(BigDecimal r03_QTD) {
    this.r03_QTD = r03_QTD;
  }

  /**
   * Recupera o 04 UNID Unidade do item (Campo 02 do registro 0190) C 006 - O.
   *
   * @return the 04 UNID Unidade do item (Campo 02 do registro 0190) C 006 - O
   */
  public String getR04_UNID() {
    return r04_UNID;
  }

  /**
   * Define o 04 UNID Unidade do item (Campo 02 do registro 0190) C 006 - O.
   *
   * @param r04_UNID the new 04 UNID Unidade do item (Campo 02 do registro 0190) C 006 - O
   */
  public void setR04_UNID(String r04_UNID) {
    this.r04_UNID = r04_UNID;
  }

  /**
   * Recupera o 05 VL_ITEM Valor acumulado do item N - 02 O.
   *
   * @return the 05 VL_ITEM Valor acumulado do item N - 02 O
   */
  public BigDecimal getR05_VL_ITEM() {
    return r05_VL_ITEM;
  }

  /**
   * Define o 05 VL_ITEM Valor acumulado do item N - 02 O.
   *
   * @param r05_VL_ITEM the new 05 VL_ITEM Valor acumulado do item N - 02 O
   */
  public void setR05_VL_ITEM(BigDecimal r05_VL_ITEM) {
    this.r05_VL_ITEM = r05_VL_ITEM;
  }

  /**
   * Recupera o 06 VL_PIS Valor do PIS N - 02 OC.
   *
   * @return the 06 VL_PIS Valor do PIS N - 02 OC
   */
  public BigDecimal getR06_VL_PIS() {
    return r06_VL_PIS;
  }

  /**
   * Define o 06 VL_PIS Valor do PIS N - 02 OC.
   *
   * @param r06_VL_PIS the new 06 VL_PIS Valor do PIS N - 02 OC
   */
  public void setR06_VL_PIS(BigDecimal r06_VL_PIS) {
    this.r06_VL_PIS = r06_VL_PIS;
  }

  /**
   * Recupera o 07 VL_COFINS Valor da COFINS N - 02 OC.
   *
   * @return the 07 VL_COFINS Valor da COFINS N - 02 OC
   */
  public BigDecimal getR07_VL_COFINS() {
    return r07_VL_COFINS;
  }

  /**
   * Define o 07 VL_COFINS Valor da COFINS N - 02 OC.
   *
   * @param r07_VL_COFINS the new 07 VL_COFINS Valor da COFINS N - 02 OC
   */
  public void setR07_VL_COFINS(BigDecimal r07_VL_COFINS) {
    this.r07_VL_COFINS = r07_VL_COFINS;
  }

}