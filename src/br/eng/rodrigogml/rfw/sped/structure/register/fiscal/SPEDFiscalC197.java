package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C197: OUTRAS OBRIGAÇÕES TRIBUTÁRIAS, AJUSTES E INFORMAÇÕES DE VALORES PROVENIENTES DE DOCUMENTO FISCAL.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (03 de mar. de 2026)
 */
public class SPEDFiscalC197 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscalC197(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 COD_AJ Código dos ajustes/benefício/incentivo, conforme tabela indicada no item 5.3. C 010* - O O
   */
  @SPEDField(maxLength = 10, minLength = 10)
  private String r02_COD_AJ = null;

  /**
   * 03 DESCR_COMPL_AJ Descrição complementar do ajuste do documento fiscal C - - OC OC
   */
  @SPEDField(maxLength = 5000, required = false)
  private String r03_DESCR_COMPL_AJ = null;

  /**
   * 04 COD_ITEM Código do item (campo 02 do Registro 0200) C 060 - OC OC
   */
  @SPEDField(maxLength = 60, required = false)
  private String r04_COD_ITEM = null;

  /**
   * 05 VL_BC_ICMS Base de cálculo do ICMS ou do ICMS ST N - 02 OC OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r05_VL_BC_ICMS = null;

  /**
   * 06 ALIQ_ICMS Alíquota do ICMS N 006 02 OC OC
   */
  @SPEDField(maxLength = 6, decimals = 2, required = false)
  private BigDecimal r06_ALIQ_ICMS = null;

  /**
   * 07 VL_ICMS Valor do ICMS ou do ICMS ST N - 02 OC OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r07_VL_ICMS = null;

  /**
   * 08 VL_OUTROS Outros valores N - 02 OC OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r08_VL_OUTROS = null;

  @Override
  public String get01_Register() {
    return "C197";
  }

  /**
   * Recupera o 02 COD_AJ Código dos ajustes/benefício/incentivo, conforme tabela indicada no item 5.3. C 010* - O O.
   *
   * @return the 02 COD_AJ Código dos ajustes/benefício/incentivo, conforme tabela indicada no item 5.3. C 010* - O O
   */
  public String getR02_COD_AJ() {
    return r02_COD_AJ;
  }

  /**
   * Define o 02 COD_AJ Código dos ajustes/benefício/incentivo, conforme tabela indicada no item 5.3. C 010* - O O.
   *
   * @param r02_COD_AJ the new 02 COD_AJ Código dos ajustes/benefício/incentivo, conforme tabela indicada no item 5.3. C 010* - O O
   */
  public void setR02_COD_AJ(String r02_COD_AJ) {
    this.r02_COD_AJ = r02_COD_AJ;
  }

  /**
   * Recupera o 03 DESCR_COMPL_AJ Descrição complementar do ajuste do documento fiscal C - - OC OC.
   *
   * @return the 03 DESCR_COMPL_AJ Descrição complementar do ajuste do documento fiscal
   */
  public String getR03_DESCR_COMPL_AJ() {
    return r03_DESCR_COMPL_AJ;
  }

  /**
   * Define o 03 DESCR_COMPL_AJ Descrição complementar do ajuste do documento fiscal C - - OC OC.
   *
   * @param r03_DESCR_COMPL_AJ the new 03 DESCR_COMPL_AJ Descrição complementar do ajuste do documento fiscal
   */
  public void setR03_DESCR_COMPL_AJ(String r03_DESCR_COMPL_AJ) {
    this.r03_DESCR_COMPL_AJ = r03_DESCR_COMPL_AJ;
  }

  /**
   * Recupera o 04 COD_ITEM Código do item (campo 02 do Registro 0200) C 060 - OC OC.
   *
   * @return the 04 COD_ITEM Código do item (campo 02 do Registro 0200) C 060 - OC OC
   */
  public String getR04_COD_ITEM() {
    return r04_COD_ITEM;
  }

  /**
   * Define o 04 COD_ITEM Código do item (campo 02 do Registro 0200) C 060 - OC OC.
   *
   * @param r04_COD_ITEM the new 04 COD_ITEM Código do item (campo 02 do Registro 0200) C 060 - OC OC
   */
  public void setR04_COD_ITEM(String r04_COD_ITEM) {
    this.r04_COD_ITEM = r04_COD_ITEM;
  }

  /**
   * Recupera o 05 VL_BC_ICMS Base de cálculo do ICMS ou do ICMS ST N - 02 OC OC.
   *
   * @return the 05 VL_BC_ICMS Base de cálculo do ICMS ou do ICMS ST N - 02 OC OC
   */
  public BigDecimal getR05_VL_BC_ICMS() {
    return r05_VL_BC_ICMS;
  }

  /**
   * Define o 05 VL_BC_ICMS Base de cálculo do ICMS ou do ICMS ST N - 02 OC OC.
   *
   * @param r05_VL_BC_ICMS the new 05 VL_BC_ICMS Base de cálculo do ICMS ou do ICMS ST N - 02 OC OC
   */
  public void setR05_VL_BC_ICMS(BigDecimal r05_VL_BC_ICMS) {
    this.r05_VL_BC_ICMS = r05_VL_BC_ICMS;
  }

  /**
   * Recupera o 06 ALIQ_ICMS Alíquota do ICMS N 006 02 OC OC.
   *
   * @return the 06 ALIQ_ICMS Alíquota do ICMS N 006 02 OC OC
   */
  public BigDecimal getR06_ALIQ_ICMS() {
    return r06_ALIQ_ICMS;
  }

  /**
   * Define o 06 ALIQ_ICMS Alíquota do ICMS N 006 02 OC OC.
   *
   * @param r06_ALIQ_ICMS the new 06 ALIQ_ICMS Alíquota do ICMS N 006 02 OC OC
   */
  public void setR06_ALIQ_ICMS(BigDecimal r06_ALIQ_ICMS) {
    this.r06_ALIQ_ICMS = r06_ALIQ_ICMS;
  }

  /**
   * Recupera o 07 VL_ICMS Valor do ICMS ou do ICMS ST N - 02 OC OC.
   *
   * @return the 07 VL_ICMS Valor do ICMS ou do ICMS ST N - 02 OC OC
   */
  public BigDecimal getR07_VL_ICMS() {
    return r07_VL_ICMS;
  }

  /**
   * Define o 07 VL_ICMS Valor do ICMS ou do ICMS ST N - 02 OC OC.
   *
   * @param r07_VL_ICMS the new 07 VL_ICMS Valor do ICMS ou do ICMS ST N - 02 OC OC
   */
  public void setR07_VL_ICMS(BigDecimal r07_VL_ICMS) {
    this.r07_VL_ICMS = r07_VL_ICMS;
  }

  /**
   * Recupera o 08 VL_OUTROS Outros valores N - 02 OC OC.
   *
   * @return the 08 VL_OUTROS Outros valores N - 02 OC OC
   */
  public BigDecimal getR08_VL_OUTROS() {
    return r08_VL_OUTROS;
  }

  /**
   * Define o 08 VL_OUTROS Outros valores N - 02 OC OC.
   *
   * @param r08_VL_OUTROS the new 08 VL_OUTROS Outros valores N - 02 OC OC
   */
  public void setR08_VL_OUTROS(BigDecimal r08_VL_OUTROS) {
    this.r08_VL_OUTROS = r08_VL_OUTROS;
  }

}
