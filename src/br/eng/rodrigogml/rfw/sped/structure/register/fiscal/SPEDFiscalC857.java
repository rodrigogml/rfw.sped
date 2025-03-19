package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C855: OBSERVAÇÕES DO LANÇAMENTO FISCAL (CÓDIGO 59).<br>
 *
 * @author Rodrigo Leitão
 * @since (24 de out. de 2024)
 */
public class SPEDFiscalC857 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscalC857(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * Código do ajustes/benefício/incentivo, conforme tabela indicada no item 5.3. C 010* - O O
   */
  @SPEDField(maxLength = 10, required = true)
  private String r02_COD_AJ = null;

  /**
   * Descrição complementar do ajuste do documento fiscal C - - OC OC
   */
  @SPEDField(maxLength = 200, required = true)
  private String r03_DESCR_COMPL_AJ = null;

  /**
   * Código do item (campo 02 do Registro 0200) C 060 - OC OC
   */
  @SPEDField(maxLength = 90, required = false)
  private String r04_COD_ITEM = null;

  /**
   * Base de cálculo do ICMS ou do ICMS ST N - 02 OC OC
   */
  @SPEDField(decimals = 2, maxLength = 10, required = false)
  private BigDecimal r05_VL_BC_ICMS = null;

  /**
   * Alíquota do ICMS N 006 02 OC OC
   */
  @SPEDField(decimals = 2, maxLength = 6, required = false)
  private BigDecimal r06_ALIQ_ICMS = null;

  /**
   * Valor do ICMS ou do ICMS ST N - 02 OC OC
   */
  @SPEDField(decimals = 2, maxLength = 10, required = false)
  private BigDecimal r07_VL_ICMS = null;

  /**
   * Outros valores N - 02 OC OC
   */
  @SPEDField(decimals = 2, maxLength = 10, required = false)
  private BigDecimal r08_VL_OUTROS = null;

  public String getR02_COD_AJ() {
    return r02_COD_AJ;
  }

  public void setR02_COD_AJ(String r02_COD_AJ) {
    this.r02_COD_AJ = r02_COD_AJ;
  }

  public String getR03_DESCR_COMPL_AJ() {
    return r03_DESCR_COMPL_AJ;
  }

  public void setR03_DESCR_COMPL_AJ(String r03_DESCR_COMPL_AJ) {
    this.r03_DESCR_COMPL_AJ = r03_DESCR_COMPL_AJ;
  }

  public String getR04_COD_ITEM() {
    return r04_COD_ITEM;
  }

  public void setR04_COD_ITEM(String r04_COD_ITEM) {
    this.r04_COD_ITEM = r04_COD_ITEM;
  }

  public BigDecimal getR05_VL_BC_ICMS() {
    return r05_VL_BC_ICMS;
  }

  public void setR05_VL_BC_ICMS(BigDecimal r05_VL_BC_ICMS) {
    this.r05_VL_BC_ICMS = r05_VL_BC_ICMS;
  }

  public BigDecimal getR06_ALIQ_ICMS() {
    return r06_ALIQ_ICMS;
  }

  public void setR06_ALIQ_ICMS(BigDecimal r06_ALIQ_ICMS) {
    this.r06_ALIQ_ICMS = r06_ALIQ_ICMS;
  }

  public BigDecimal getR07_VL_ICMS() {
    return r07_VL_ICMS;
  }

  public void setR07_VL_ICMS(BigDecimal r07_VL_ICMS) {
    this.r07_VL_ICMS = r07_VL_ICMS;
  }

  public BigDecimal getR08_VL_OUTROS() {
    return r08_VL_OUTROS;
  }

  public void setR08_VL_OUTROS(BigDecimal r08_VL_OUTROS) {
    this.r08_VL_OUTROS = r08_VL_OUTROS;
  }

  @Override
  public String get01_Register() {
    return "C857";
  }

}