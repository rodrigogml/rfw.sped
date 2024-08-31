package br.eng.rodrigogml.rfw.sped.structure.contrib;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO C405: REDUÇÃO Z (CÓDIGOS 02 e 2D).<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribC405 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * REGISTRO C481: RESUMO DIÁRIO DE DOCUMENTOS EMITIDOS POR ECF – PIS/PASEP (CÓDIGOS 02 e 2D)<br>
   * Chave: COD_ITEM, CST_PIS. Separados por "|"
   */
  private final LinkedHashMap<String, SPEDContribC481> rc481 = new LinkedHashMap<String, SPEDContribC481>();

  /**
   * REGISTRO C485: RESUMO DIÁRIO DE DOCUMENTOS EMITIDOS POR ECF – COFINS (CÓDIGOS 02 e 2D)<br>
   * Chave: COD_ITEM, CST_COFINS. Separados por "|"
   */
  private final LinkedHashMap<String, SPEDContribC485> rc485 = new LinkedHashMap<String, SPEDContribC485>();

  /**
   * Data do movimento a que se refere a Redução Z N 008* - S
   */
  @SPEDField(maxLength = 8, required = true)
  private LocalDate r02_DT_DOC = null;

  /**
   * Posição do Contador de Reinício de Operação N 003 - S
   */
  @SPEDField(maxLength = 3, required = true)
  private Integer r03_CRO = null;

  /**
   * Posição do Contador de Redução Z N 006 - S
   */
  @SPEDField(maxLength = 6, required = true)
  private Integer r04_CRZ = null;

  /**
   * Número do Contador de Ordem de Operação do último documento emitido no dia (Número do COO na Redução Z) N 006 - S
   */
  @SPEDField(maxLength = 6, required = true)
  private Integer r05_NUM_COO_FIN = null;

  /**
   * Valor do Grande Total final N - 02 S
   */
  @SPEDField(decimals = 2, maxLength = 20, required = true)
  private BigDecimal r06_GT_FIN = null;

  /**
   * Valor da venda bruta N - 02 S
   */
  @SPEDField(decimals = 2, maxLength = 20, required = true)
  private BigDecimal r07_VL_BRT = null;

  @Override
  public String get01_Register() {
    return "C405";
  }

  /**
   * Recupera o data do movimento a que se refere a Redução Z N 008* - S.
   *
   * @return the data do movimento a que se refere a Redução Z N 008* - S
   */
  public LocalDate getR02_DT_DOC() {
    return r02_DT_DOC;
  }

  /**
   * Define o data do movimento a que se refere a Redução Z N 008* - S.
   *
   * @param r02_DT_DOC the new data do movimento a que se refere a Redução Z N 008* - S
   */
  public void setR02_DT_DOC(LocalDate r02_DT_DOC) {
    this.r02_DT_DOC = r02_DT_DOC;
  }

  /**
   * Recupera o posição do Contador de Reinício de Operação N 003 - S.
   *
   * @return the posição do Contador de Reinício de Operação N 003 - S
   */
  public Integer getR03_CRO() {
    return r03_CRO;
  }

  /**
   * Define o posição do Contador de Reinício de Operação N 003 - S.
   *
   * @param r03_CRO the new posição do Contador de Reinício de Operação N 003 - S
   */
  public void setR03_CRO(Integer r03_CRO) {
    this.r03_CRO = r03_CRO;
  }

  /**
   * Recupera o posição do Contador de Redução Z N 006 - S.
   *
   * @return the posição do Contador de Redução Z N 006 - S
   */
  public Integer getR04_CRZ() {
    return r04_CRZ;
  }

  /**
   * Define o posição do Contador de Redução Z N 006 - S.
   *
   * @param r04_CRZ the new posição do Contador de Redução Z N 006 - S
   */
  public void setR04_CRZ(Integer r04_CRZ) {
    this.r04_CRZ = r04_CRZ;
  }

  /**
   * Recupera o número do Contador de Ordem de Operação do último documento emitido no dia (Número do COO na Redução Z) N 006 - S.
   *
   * @return the número do Contador de Ordem de Operação do último documento emitido no dia (Número do COO na Redução Z) N 006 - S
   */
  public Integer getR05_NUM_COO_FIN() {
    return r05_NUM_COO_FIN;
  }

  /**
   * Define o número do Contador de Ordem de Operação do último documento emitido no dia (Número do COO na Redução Z) N 006 - S.
   *
   * @param r05_NUM_COO_FIN the new número do Contador de Ordem de Operação do último documento emitido no dia (Número do COO na Redução Z) N 006 - S
   */
  public void setR05_NUM_COO_FIN(Integer r05_NUM_COO_FIN) {
    this.r05_NUM_COO_FIN = r05_NUM_COO_FIN;
  }

  /**
   * Recupera o valor do Grande Total final N - 02 S.
   *
   * @return the valor do Grande Total final N - 02 S
   */
  public BigDecimal getR06_GT_FIN() {
    return r06_GT_FIN;
  }

  /**
   * Define o valor do Grande Total final N - 02 S.
   *
   * @param r06_GT_FIN the new valor do Grande Total final N - 02 S
   */
  public void setR06_GT_FIN(BigDecimal r06_GT_FIN) {
    this.r06_GT_FIN = r06_GT_FIN;
  }

  /**
   * Recupera o valor da venda bruta N - 02 S.
   *
   * @return the valor da venda bruta N - 02 S
   */
  public BigDecimal getR07_VL_BRT() {
    return r07_VL_BRT;
  }

  /**
   * Define o valor da venda bruta N - 02 S.
   *
   * @param r07_VL_BRT the new valor da venda bruta N - 02 S
   */
  public void setR07_VL_BRT(BigDecimal r07_VL_BRT) {
    this.r07_VL_BRT = r07_VL_BRT;
  }

  /**
   * Recupera o rEGISTRO C481: RESUMO DIÁRIO DE DOCUMENTOS EMITIDOS POR ECF – PIS/PASEP (CÓDIGOS 02 e 2D)<br>
   * Chave: COD_ITEM, CST_PIS. Separados por "|".
   *
   * @return the rEGISTRO C481: RESUMO DIÁRIO DE DOCUMENTOS EMITIDOS POR ECF – PIS/PASEP (CÓDIGOS 02 e 2D)<br>
   *         Chave: COD_ITEM, CST_PIS
   */
  public LinkedHashMap<String, SPEDContribC481> getRc481() {
    return rc481;
  }

  /**
   * Recupera o rEGISTRO C485: RESUMO DIÁRIO DE DOCUMENTOS EMITIDOS POR ECF – COFINS (CÓDIGOS 02 e 2D)<br>
   * Chave: COD_ITEM, CST_COFINS. Separados por "|".
   *
   * @return the rEGISTRO C485: RESUMO DIÁRIO DE DOCUMENTOS EMITIDOS POR ECF – COFINS (CÓDIGOS 02 e 2D)<br>
   *         Chave: COD_ITEM, CST_COFINS
   */
  public LinkedHashMap<String, SPEDContribC485> getRc485() {
    return rc485;
  }

}