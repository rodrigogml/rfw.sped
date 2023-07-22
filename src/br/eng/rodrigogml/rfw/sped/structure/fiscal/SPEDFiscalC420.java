package br.eng.rodrigogml.rfw.sped.structure.fiscal;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO C420: REGISTRO DOS TOTALIZADORES PARCIAIS DA REDUÇÃO Z (COD 02, 2D e 60).<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalC420 extends SPEDRegister {

  /**
   * REGISTRO C425: RESUMO DE ITENS DO MOVIMENTO DIÁRIO (CÓDIGO 02 e 2D)<br>
   * Chave: COD_ITEM e UNID. Separados por "|".
   */
  private final LinkedHashMap<String, SPEDFiscalC425> rc425 = new LinkedHashMap<String, SPEDFiscalC425>();

  /**
   * 02 COD_TOT_PAR Código do totalizador, conforme Tabela 4.4.6 C 007 - O
   */
  @SPEDField(maxLength = 7)
  private String r02_COD_TOT_PAR = null;

  /**
   * 03 VLR_ACUM_TOT Valor acumulado no totalizador, relativo à respectiva Redução Z. N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r03_VLR_ACUM_TOT = null;

  /**
   * 04 NR_TOT Número do totalizador quando ocorrer mais de uma situação com a mesma carga tributária efetiva. N 002 - OC
   */
  @SPEDField(maxLength = 2, required = false)
  private String r04_NR_TOT = null;

  /**
   * 05 DESCR_NR_TOT Descrição da situação tributária relativa ao totalizador parcial, quando houver mais de um com a mesma carga tributária efetiva. C - - OC
   */
  @SPEDField(maxLength = 1000, required = false)
  private String r05_DESCR_NR_TOT = null;

  @Override
  public String get01_Register() {
    return "C420";
  }

  /**
   * Recupera o 02 COD_TOT_PAR Código do totalizador, conforme Tabela 4.4.6 C 007 - O.
   *
   * @return the 02 COD_TOT_PAR Código do totalizador, conforme Tabela 4
   */
  public String getR02_COD_TOT_PAR() {
    return r02_COD_TOT_PAR;
  }

  /**
   * Define o 02 COD_TOT_PAR Código do totalizador, conforme Tabela 4.4.6 C 007 - O.
   *
   * @param r02_COD_TOT_PAR the new 02 COD_TOT_PAR Código do totalizador, conforme Tabela 4
   */
  public void setR02_COD_TOT_PAR(String r02_COD_TOT_PAR) {
    this.r02_COD_TOT_PAR = r02_COD_TOT_PAR;
  }

  /**
   * Recupera o 03 VLR_ACUM_TOT Valor acumulado no totalizador, relativo à respectiva Redução Z. N - 02 O.
   *
   * @return the 03 VLR_ACUM_TOT Valor acumulado no totalizador, relativo à respectiva Redução Z
   */
  public BigDecimal getR03_VLR_ACUM_TOT() {
    return r03_VLR_ACUM_TOT;
  }

  /**
   * Define o 03 VLR_ACUM_TOT Valor acumulado no totalizador, relativo à respectiva Redução Z. N - 02 O.
   *
   * @param r03_VLR_ACUM_TOT the new 03 VLR_ACUM_TOT Valor acumulado no totalizador, relativo à respectiva Redução Z
   */
  public void setR03_VLR_ACUM_TOT(BigDecimal r03_VLR_ACUM_TOT) {
    this.r03_VLR_ACUM_TOT = r03_VLR_ACUM_TOT;
  }

  /**
   * Recupera o 04 NR_TOT Número do totalizador quando ocorrer mais de uma situação com a mesma carga tributária efetiva. N 002 - OC.
   *
   * @return the 04 NR_TOT Número do totalizador quando ocorrer mais de uma situação com a mesma carga tributária efetiva
   */
  public String getR04_NR_TOT() {
    return r04_NR_TOT;
  }

  /**
   * Define o 04 NR_TOT Número do totalizador quando ocorrer mais de uma situação com a mesma carga tributária efetiva. N 002 - OC.
   *
   * @param r04_NR_TOT the new 04 NR_TOT Número do totalizador quando ocorrer mais de uma situação com a mesma carga tributária efetiva
   */
  public void setR04_NR_TOT(String r04_NR_TOT) {
    this.r04_NR_TOT = r04_NR_TOT;
  }

  /**
   * Recupera o 05 DESCR_NR_TOT Descrição da situação tributária relativa ao totalizador parcial, quando houver mais de um com a mesma carga tributária efetiva. C - - OC.
   *
   * @return the 05 DESCR_NR_TOT Descrição da situação tributária relativa ao totalizador parcial, quando houver mais de um com a mesma carga tributária efetiva
   */
  public String getR05_DESCR_NR_TOT() {
    return r05_DESCR_NR_TOT;
  }

  /**
   * Define o 05 DESCR_NR_TOT Descrição da situação tributária relativa ao totalizador parcial, quando houver mais de um com a mesma carga tributária efetiva. C - - OC.
   *
   * @param r05_DESCR_NR_TOT the new 05 DESCR_NR_TOT Descrição da situação tributária relativa ao totalizador parcial, quando houver mais de um com a mesma carga tributária efetiva
   */
  public void setR05_DESCR_NR_TOT(String r05_DESCR_NR_TOT) {
    this.r05_DESCR_NR_TOT = r05_DESCR_NR_TOT;
  }

  /**
   * Recupera o rEGISTRO C425: RESUMO DE ITENS DO MOVIMENTO DIÁRIO (CÓDIGO 02 e 2D)<br>
   * Chave: COD_ITEM e UNID. Separados por "|".
   *
   * @return the rEGISTRO C425: RESUMO DE ITENS DO MOVIMENTO DIÁRIO (CÓDIGO 02 e 2D)<br>
   *         Chave: COD_ITEM e UNID
   */
  public LinkedHashMap<String, SPEDFiscalC425> getRc425() {
    return rc425;
  }

}