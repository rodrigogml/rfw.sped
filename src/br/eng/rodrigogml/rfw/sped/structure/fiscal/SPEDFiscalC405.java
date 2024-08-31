package br.eng.rodrigogml.rfw.sped.structure.fiscal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO C405: REDUÇÃO Z (CÓDIGO 02, 2D e 60).<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalC405 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  /**
   * REGISTRO C410: PIS E COFINS TOTALIZADOS NO DIA (CÓDIGO 02 e 2D)
   */
  private SPEDFiscalC410 rc410 = null;

  /**
   * REGISTRO C420: REGISTRO DOS TOTALIZADORES PARCIAIS DA REDUÇÃO Z (COD 02, 2D e 60)<br>
   * Chave: COD_TOT_PAR e NR_TOT. Separados por "|".
   */
  private final LinkedHashMap<String, SPEDFiscalC420> rc420 = new LinkedHashMap<String, SPEDFiscalC420>();

  /**
   * REGISTRO C460: DOCUMENTO FISCAL EMITIDO POR ECF (CÓDIGO 02, 2D e 60).<br>
   * Chave: COD_MOD, NUM_DOC e DT_DOC. Separados por "|".
   */
  private final LinkedHashMap<String, SPEDFiscalC460> rc460 = new LinkedHashMap<String, SPEDFiscalC460>();

  /**
   * REGISTRO C490: REGISTRO ANALÍTICO DO MOVIMENTO DIÁRIO (CÓDIGO 02, 2D e 60)<br>
   * Chave: CST_ICMS, CFOP e ALIQ_ICMS. Separados por "|".
   */
  private final LinkedHashMap<String, SPEDFiscalC490> rc490 = new LinkedHashMap<String, SPEDFiscalC490>();

  /**
   * 02 DT_DOC Data do movimento a que se refere a Redução Z N 008* - O
   */
  @SPEDField(maxLength = 8)
  private LocalDate r02_DT_DOC = null;

  /**
   * 03 CRO Posição do Contador de Reinício de Operação N 003 - O
   */
  @SPEDField(maxLength = 3)
  private Integer r03_CRO = null;

  /**
   * 04 CRZ Posição do Contador de Redução Z N 006 - O
   */
  @SPEDField(maxLength = 6)
  private Integer r04_CRZ = null;

  /**
   * 05 NUM_COO_FIN Número do Contador de Ordem de Operação do último documento emitido no dia. (Número do COO na Redução Z) N 009 - O
   */
  @SPEDField(maxLength = 9)
  private Integer r05_NUM_COO_FIN = null;

  /**
   * 06 GT_FIN Valor do Grande Total final N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r06_GT_FIN = null;

  /**
   * 07 VL_BRT Valor da venda bruta N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r07_VL_BRT = null;

  @Override
  public String get01_Register() {
    return "C405";
  }

  /**
   * Recupera o 02 DT_DOC Data do movimento a que se refere a Redução Z N 008* - O.
   *
   * @return the 02 DT_DOC Data do movimento a que se refere a Redução Z N 008* - O
   */
  public LocalDate getR02_DT_DOC() {
    return r02_DT_DOC;
  }

  /**
   * Define o 02 DT_DOC Data do movimento a que se refere a Redução Z N 008* - O.
   *
   * @param r02_DT_DOC the new 02 DT_DOC Data do movimento a que se refere a Redução Z N 008* - O
   */
  public void setR02_DT_DOC(LocalDate r02_DT_DOC) {
    this.r02_DT_DOC = r02_DT_DOC;
  }

  /**
   * Recupera o 03 CRO Posição do Contador de Reinício de Operação N 003 - O.
   *
   * @return the 03 CRO Posição do Contador de Reinício de Operação N 003 - O
   */
  public Integer getR03_CRO() {
    return r03_CRO;
  }

  /**
   * Define o 03 CRO Posição do Contador de Reinício de Operação N 003 - O.
   *
   * @param r03_CRO the new 03 CRO Posição do Contador de Reinício de Operação N 003 - O
   */
  public void setR03_CRO(Integer r03_CRO) {
    this.r03_CRO = r03_CRO;
  }

  /**
   * Recupera o 04 CRZ Posição do Contador de Redução Z N 006 - O.
   *
   * @return the 04 CRZ Posição do Contador de Redução Z N 006 - O
   */
  public Integer getR04_CRZ() {
    return r04_CRZ;
  }

  /**
   * Define o 04 CRZ Posição do Contador de Redução Z N 006 - O.
   *
   * @param r04_CRZ the new 04 CRZ Posição do Contador de Redução Z N 006 - O
   */
  public void setR04_CRZ(Integer r04_CRZ) {
    this.r04_CRZ = r04_CRZ;
  }

  /**
   * Recupera o 05 NUM_COO_FIN Número do Contador de Ordem de Operação do último documento emitido no dia. (Número do COO na Redução Z) N 009 - O.
   *
   * @return the 05 NUM_COO_FIN Número do Contador de Ordem de Operação do último documento emitido no dia
   */
  public Integer getR05_NUM_COO_FIN() {
    return r05_NUM_COO_FIN;
  }

  /**
   * Define o 05 NUM_COO_FIN Número do Contador de Ordem de Operação do último documento emitido no dia. (Número do COO na Redução Z) N 009 - O.
   *
   * @param r05_NUM_COO_FIN the new 05 NUM_COO_FIN Número do Contador de Ordem de Operação do último documento emitido no dia
   */
  public void setR05_NUM_COO_FIN(Integer r05_NUM_COO_FIN) {
    this.r05_NUM_COO_FIN = r05_NUM_COO_FIN;
  }

  /**
   * Recupera o 06 GT_FIN Valor do Grande Total final N - 02 O.
   *
   * @return the 06 GT_FIN Valor do Grande Total final N - 02 O
   */
  public BigDecimal getR06_GT_FIN() {
    return r06_GT_FIN;
  }

  /**
   * Define o 06 GT_FIN Valor do Grande Total final N - 02 O.
   *
   * @param r06_GT_FIN the new 06 GT_FIN Valor do Grande Total final N - 02 O
   */
  public void setR06_GT_FIN(BigDecimal r06_GT_FIN) {
    this.r06_GT_FIN = r06_GT_FIN;
  }

  /**
   * Recupera o 07 VL_BRT Valor da venda bruta N - 02 O.
   *
   * @return the 07 VL_BRT Valor da venda bruta N - 02 O
   */
  public BigDecimal getR07_VL_BRT() {
    return r07_VL_BRT;
  }

  /**
   * Define o 07 VL_BRT Valor da venda bruta N - 02 O.
   *
   * @param r07_VL_BRT the new 07 VL_BRT Valor da venda bruta N - 02 O
   */
  public void setR07_VL_BRT(BigDecimal r07_VL_BRT) {
    this.r07_VL_BRT = r07_VL_BRT;
  }

  /**
   * Recupera o rEGISTRO C420: REGISTRO DOS TOTALIZADORES PARCIAIS DA REDUÇÃO Z (COD 02, 2D e 60)<br>
   * Chave: COD_TOT_PAR e NR_TOT. Separados por "|".
   *
   * @return the rEGISTRO C420: REGISTRO DOS TOTALIZADORES PARCIAIS DA REDUÇÃO Z (COD 02, 2D e 60)<br>
   *         Chave: COD_TOT_PAR e NR_TOT
   */
  public LinkedHashMap<String, SPEDFiscalC420> getRc420() {
    return rc420;
  }

  /**
   * Recupera o rEGISTRO C460: DOCUMENTO FISCAL EMITIDO POR ECF (CÓDIGO 02, 2D e 60).<br>
   * Chave: COD_MOD, NUM_DOC e DT_DOC. Separados por "|".
   *
   * @return the rEGISTRO C460: DOCUMENTO FISCAL EMITIDO POR ECF (CÓDIGO 02, 2D e 60)
   */
  public LinkedHashMap<String, SPEDFiscalC460> getRc460() {
    return rc460;
  }

  /**
   * Recupera o rEGISTRO C490: REGISTRO ANALÍTICO DO MOVIMENTO DIÁRIO (CÓDIGO 02, 2D e 60)<br>
   * Chave: CST_ICMS, CFOP e ALIQ_ICMS. Separados por "|".
   *
   * @return the rEGISTRO C490: REGISTRO ANALÍTICO DO MOVIMENTO DIÁRIO (CÓDIGO 02, 2D e 60)<br>
   *         Chave: CST_ICMS, CFOP e ALIQ_ICMS
   */
  public LinkedHashMap<String, SPEDFiscalC490> getRc490() {
    return rc490;
  }

  /**
   * Recupera o rEGISTRO C410: PIS E COFINS TOTALIZADOS NO DIA (CÓDIGO 02 e 2D).
   *
   * @return the rEGISTRO C410: PIS E COFINS TOTALIZADOS NO DIA (CÓDIGO 02 e 2D)
   */
  public SPEDFiscalC410 getRc410() {
    return rc410;
  }

  /**
   * Define o rEGISTRO C410: PIS E COFINS TOTALIZADOS NO DIA (CÓDIGO 02 e 2D).
   *
   * @param rc410 the new rEGISTRO C410: PIS E COFINS TOTALIZADOS NO DIA (CÓDIGO 02 e 2D)
   */
  public void setRc410(SPEDFiscalC410 rc410) {
    this.rc410 = rc410;
  }
}