package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO K200: ESTOQUE ESCRITURADO.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalK200 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscalK200(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 DT_EST Data do estoque final N 8 - O
   */
  @SPEDField(maxLength = 8, required = true)
  private LocalDate r02_DT_EST = null;

  /**
   * 03 COD_ITEM Código do item (campo 02 do Registro 0200) C 60 - O
   */
  @SPEDField(maxLength = 60, required = true)
  private String r03_COD_ITEM = null;

  /**
   * 04 QTD Quantidade em estoque N - 3 O
   */
  @SPEDField(maxLength = 100, decimals = 3, required = true)
  private BigDecimal r04_QTD = null;

  /**
   * 05 IND_EST Indicador do tipo de estoque:<br>
   * <li>0 - Estoque de propriedade do informante e em seu poder;
   * <li>1 - Estoque de propriedade do informante e em posse de terceiros;
   * <li>2 - Estoque de propriedade de terceiros e em posse do informante C 1 - O
   */
  @SPEDField(maxLength = 1, required = true)
  private String r05_IND_EST = null;
  /**
   * 06 COD_PART Código do participante (campo 02 do Registro 0150):- proprietário/possuidor que não seja o informante do arquivo C 60 - OC
   */
  @SPEDField(maxLength = 60, required = false)
  private String r06_COD_PART = null;

  @Override
  public String get01_Register() {
    return "K200";
  }

  /**
   * Recupera o 02 DT_EST Data do estoque final N 8 - O.
   *
   * @return the 02 DT_EST Data do estoque final N 8 - O
   */
  public LocalDate getR02_DT_EST() {
    return r02_DT_EST;
  }

  /**
   * Define o 02 DT_EST Data do estoque final N 8 - O.
   *
   * @param r02_DT_EST the new 02 DT_EST Data do estoque final N 8 - O
   */
  public void setR02_DT_EST(LocalDate r02_DT_EST) {
    this.r02_DT_EST = r02_DT_EST;
  }

  /**
   * Recupera o 03 COD_ITEM Código do item (campo 02 do Registro 0200) C 60 - O.
   *
   * @return the 03 COD_ITEM Código do item (campo 02 do Registro 0200) C 60 - O
   */
  public String getR03_COD_ITEM() {
    return r03_COD_ITEM;
  }

  /**
   * Define o 03 COD_ITEM Código do item (campo 02 do Registro 0200) C 60 - O.
   *
   * @param r03_COD_ITEM the new 03 COD_ITEM Código do item (campo 02 do Registro 0200) C 60 - O
   */
  public void setR03_COD_ITEM(String r03_COD_ITEM) {
    this.r03_COD_ITEM = r03_COD_ITEM;
  }

  /**
   * Recupera o 04 QTD Quantidade em estoque N - 3 O.
   *
   * @return the 04 QTD Quantidade em estoque N - 3 O
   */
  public BigDecimal getR04_QTD() {
    return r04_QTD;
  }

  /**
   * Define o 04 QTD Quantidade em estoque N - 3 O.
   *
   * @param r04_QTD the new 04 QTD Quantidade em estoque N - 3 O
   */
  public void setR04_QTD(BigDecimal r04_QTD) {
    this.r04_QTD = r04_QTD;
  }

  /**
   * Recupera o 05 IND_EST Indicador do tipo de estoque:<br>
   * <li>0 - Estoque de propriedade do informante e em seu poder;
   * <li>1 - Estoque de propriedade do informante e em posse de terceiros;
   * <li>2 - Estoque de propriedade de terceiros e em posse do informante C 1 - O.
   *
   * @return the 05 IND_EST Indicador do tipo de estoque:<br>
   *         <li>0 - Estoque de propriedade do informante e em seu poder;
   *         <li>1 - Estoque de propriedade do informante e em posse de terceiros;
   *         <li>2 - Estoque de propriedade de terceiros e em posse do informante C 1 - O
   */
  public String getR05_IND_EST() {
    return r05_IND_EST;
  }

  /**
   * Define o 05 IND_EST Indicador do tipo de estoque:<br>
   * <li>0 - Estoque de propriedade do informante e em seu poder;
   * <li>1 - Estoque de propriedade do informante e em posse de terceiros;
   * <li>2 - Estoque de propriedade de terceiros e em posse do informante C 1 - O.
   *
   * @param r05_IND_EST the new 05 IND_EST Indicador do tipo de estoque:<br>
   *          <li>0 - Estoque de propriedade do informante e em seu poder;
   *          <li>1 - Estoque de propriedade do informante e em posse de terceiros;
   *          <li>2 - Estoque de propriedade de terceiros e em posse do informante C 1 - O
   */
  public void setR05_IND_EST(String r05_IND_EST) {
    this.r05_IND_EST = r05_IND_EST;
  }

  /**
   * Recupera o 06 COD_PART Código do participante (campo 02 do Registro 0150):- proprietário/possuidor que não seja o informante do arquivo C 60 - OC.
   *
   * @return the 06 COD_PART Código do participante (campo 02 do Registro 0150):- proprietário/possuidor que não seja o informante do arquivo C 60 - OC
   */
  public String getR06_COD_PART() {
    return r06_COD_PART;
  }

  /**
   * Define o 06 COD_PART Código do participante (campo 02 do Registro 0150):- proprietário/possuidor que não seja o informante do arquivo C 60 - OC.
   *
   * @param r06_COD_PART the new 06 COD_PART Código do participante (campo 02 do Registro 0150):- proprietário/possuidor que não seja o informante do arquivo C 60 - OC
   */
  public void setR06_COD_PART(String r06_COD_PART) {
    this.r06_COD_PART = r06_COD_PART;
  }

}