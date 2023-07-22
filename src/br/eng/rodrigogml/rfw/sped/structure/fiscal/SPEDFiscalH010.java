package br.eng.rodrigogml.rfw.sped.structure.fiscal;

import java.math.BigDecimal;
import java.util.ArrayList;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * REGISTRO H010: INVENTÁRIO
 */
public class SPEDFiscalH010 extends SPEDRegister {

  /**
   * REGISTRO H020: Informação complementar do Inventário
   */
  private final ArrayList<SPEDFiscalH020> rh020 = new ArrayList<SPEDFiscalH020>();

  /**
   * 02 COD_ITEM Código do item (campo 02 do Registro 0200) C 060 - O
   */
  @SPEDField(maxLength = 60)
  private String r02_COD_ITEM = null;

  /**
   * 03 UNID Unidade do item C 006 - O
   */
  @SPEDField(maxLength = 6)
  private String r03_UNID = null;

  /**
   * 04 QTD Quantidade do item N - 03 O
   */
  @SPEDField(maxLength = 255, decimals = 3)
  private BigDecimal r04_QTD = null;

  /**
   * 05 VL_UNIT Valor unitário do item N - 06 O
   */
  @SPEDField(maxLength = 255, decimals = 6)
  private BigDecimal r05_VL_UNIT = null;

  /**
   * 06 VL_ITEM Valor do item N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r06_VL_ITEM = null;

  /**
   * 07 IND_PROP Indicador de propriedade/posse do item:<br>
   * 0- Item de propriedade do informante e em seu poder;<br>
   * 1- Item de propriedade do informante em posse de terceiros;<br>
   * 2- Item de propriedade de terceiros em posse do informante<br>
   * C 001* - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r07_IND_PROP = null;

  /**
   * 08 COD_PART Código do participante (campo 02 do Registro 0150): proprietário/possuidor que não seja o informante do arquivo C 060 - OC
   */
  @SPEDField(maxLength = 60, required = false)
  private String r08_COD_PART = null;

  /**
   * 09 TXT_COMPL Descrição complementar. C - - OC
   */
  @SPEDField(maxLength = 5000, required = false)
  private String r09_TXT_COMPL = null;

  /**
   * 10 COD_CTA Código da conta analítica contábil debitada/creditada C - - OC
   */
  @SPEDField(maxLength = 200, required = false)
  private String r10_COD_CTA = null;

  /**
   * 11 VL_ITEM_IR Valor do item para efeitos do Imposto de Renda. N - 02 OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r11_VL_ITEM_IR = null;

  @Override
  public String get01_Register() {
    return "H010";
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
   * Recupera o 03 UNID Unidade do item C 006 - O.
   *
   * @return the 03 UNID Unidade do item C 006 - O
   */
  public String getR03_UNID() {
    return r03_UNID;
  }

  /**
   * Define o 03 UNID Unidade do item C 006 - O.
   *
   * @param r03_UNID the new 03 UNID Unidade do item C 006 - O
   */
  public void setR03_UNID(String r03_UNID) {
    this.r03_UNID = r03_UNID;
  }

  /**
   * Recupera o 04 QTD Quantidade do item N - 03 O.
   *
   * @return the 04 QTD Quantidade do item N - 03 O
   */
  public BigDecimal getR04_QTD() {
    return r04_QTD;
  }

  /**
   * Define o 04 QTD Quantidade do item N - 03 O.
   *
   * @param r04_QTD the new 04 QTD Quantidade do item N - 03 O
   */
  public void setR04_QTD(BigDecimal r04_QTD) {
    this.r04_QTD = r04_QTD;
  }

  /**
   * Recupera o 05 VL_UNIT Valor unitário do item N - 06 O.
   *
   * @return the 05 VL_UNIT Valor unitário do item N - 06 O
   */
  public BigDecimal getR05_VL_UNIT() {
    return r05_VL_UNIT;
  }

  /**
   * Define o 05 VL_UNIT Valor unitário do item N - 06 O.
   *
   * @param r05_VL_UNIT the new 05 VL_UNIT Valor unitário do item N - 06 O
   */
  public void setR05_VL_UNIT(BigDecimal r05_VL_UNIT) {
    this.r05_VL_UNIT = r05_VL_UNIT;
  }

  /**
   * Recupera o 06 VL_ITEM Valor do item N - 02 O.
   *
   * @return the 06 VL_ITEM Valor do item N - 02 O
   */
  public BigDecimal getR06_VL_ITEM() {
    return r06_VL_ITEM;
  }

  /**
   * Define o 06 VL_ITEM Valor do item N - 02 O.
   *
   * @param r06_VL_ITEM the new 06 VL_ITEM Valor do item N - 02 O
   */
  public void setR06_VL_ITEM(BigDecimal r06_VL_ITEM) {
    this.r06_VL_ITEM = r06_VL_ITEM;
  }

  /**
   * Recupera o 07 IND_PROP Indicador de propriedade/posse do item:<br>
   * 0- Item de propriedade do informante e em seu poder;<br>
   * 1- Item de propriedade do informante em posse de terceiros;<br>
   * 2- Item de propriedade de terceiros em posse do informante<br>
   * C 001* - O.
   *
   * @return the 07 IND_PROP Indicador de propriedade/posse do item:<br>
   *         0- Item de propriedade do informante e em seu poder;<br>
   *         1- Item de propriedade do informante em posse de terceiros;<br>
   *         2- Item de propriedade de terceiros em posse do informante<br>
   *         C 001* - O
   */
  public String getR07_IND_PROP() {
    return r07_IND_PROP;
  }

  /**
   * Define o 07 IND_PROP Indicador de propriedade/posse do item:<br>
   * 0- Item de propriedade do informante e em seu poder;<br>
   * 1- Item de propriedade do informante em posse de terceiros;<br>
   * 2- Item de propriedade de terceiros em posse do informante<br>
   * C 001* - O.
   *
   * @param r07_IND_PROP the new 07 IND_PROP Indicador de propriedade/posse do item:<br>
   *          0- Item de propriedade do informante e em seu poder;<br>
   *          1- Item de propriedade do informante em posse de terceiros;<br>
   *          2- Item de propriedade de terceiros em posse do informante<br>
   *          C 001* - O
   */
  public void setR07_IND_PROP(String r07_IND_PROP) {
    this.r07_IND_PROP = r07_IND_PROP;
  }

  /**
   * Recupera o 08 COD_PART Código do participante (campo 02 do Registro 0150): proprietário/possuidor que não seja o informante do arquivo C 060 - OC.
   *
   * @return the 08 COD_PART Código do participante (campo 02 do Registro 0150): proprietário/possuidor que não seja o informante do arquivo C 060 - OC
   */
  public String getR08_COD_PART() {
    return r08_COD_PART;
  }

  /**
   * Define o 08 COD_PART Código do participante (campo 02 do Registro 0150): proprietário/possuidor que não seja o informante do arquivo C 060 - OC.
   *
   * @param r08_COD_PART the new 08 COD_PART Código do participante (campo 02 do Registro 0150): proprietário/possuidor que não seja o informante do arquivo C 060 - OC
   */
  public void setR08_COD_PART(String r08_COD_PART) {
    this.r08_COD_PART = r08_COD_PART;
  }

  /**
   * Recupera o 09 TXT_COMPL Descrição complementar. C - - OC.
   *
   * @return the 09 TXT_COMPL Descrição complementar
   */
  public String getR09_TXT_COMPL() {
    return r09_TXT_COMPL;
  }

  /**
   * Define o 09 TXT_COMPL Descrição complementar. C - - OC.
   *
   * @param r09_TXT_COMPL the new 09 TXT_COMPL Descrição complementar
   */
  public void setR09_TXT_COMPL(String r09_TXT_COMPL) {
    this.r09_TXT_COMPL = r09_TXT_COMPL;
  }

  /**
   * Recupera o 10 COD_CTA Código da conta analítica contábil debitada/creditada C - - OC.
   *
   * @return the 10 COD_CTA Código da conta analítica contábil debitada/creditada C - - OC
   */
  public String getR10_COD_CTA() {
    return r10_COD_CTA;
  }

  /**
   * Define o 10 COD_CTA Código da conta analítica contábil debitada/creditada C - - OC.
   *
   * @param r10_COD_CTA the new 10 COD_CTA Código da conta analítica contábil debitada/creditada C - - OC
   */
  public void setR10_COD_CTA(String r10_COD_CTA) {
    this.r10_COD_CTA = r10_COD_CTA;
  }

  /**
   * Recupera o 11 VL_ITEM_IR Valor do item para efeitos do Imposto de Renda. N - 02 OC.
   *
   * @return the 11 VL_ITEM_IR Valor do item para efeitos do Imposto de Renda
   */
  public BigDecimal getR11_VL_ITEM_IR() {
    return r11_VL_ITEM_IR;
  }

  /**
   * Define o 11 VL_ITEM_IR Valor do item para efeitos do Imposto de Renda. N - 02 OC.
   *
   * @param r11_VL_ITEM_IR the new 11 VL_ITEM_IR Valor do item para efeitos do Imposto de Renda
   */
  public void setR11_VL_ITEM_IR(BigDecimal r11_VL_ITEM_IR) {
    this.r11_VL_ITEM_IR = r11_VL_ITEM_IR;
  }

  /**
   * Recupera o rEGISTRO H020: Informação complementar do Inventário.
   *
   * @return the rEGISTRO H020: Informação complementar do Inventário
   */
  public ArrayList<SPEDFiscalH020> getRh020() {
    return rh020;
  }
}