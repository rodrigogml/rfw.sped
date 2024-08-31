package br.eng.rodrigogml.rfw.sped.structure.fiscal;

import java.time.LocalDate;
import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO C860: IDENTIFICAÇÃO DO EQUIPAMENTO SAT-CF-E.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalC860 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  /**
   * REGISTRO C890: RESUMO DIÁRIO DO CF-E-SAT (CÓDIGO 59) POR EQUIPAMENTO SAT-CF-E<br>
   * Chave: CST_ICMS, CFOP e ALIQ_ICMS. Separados por "|". O registro c890 é agrupado dentro do C860 e deve ser único de acordo com as mesmas condições do C860 e mais CST do ICMS, CFOP e Alíquota do ICMS.
   */
  private final LinkedHashMap<String, SPEDFiscalC890> rc890 = new LinkedHashMap<String, SPEDFiscalC890>();

  /**
   * Código do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002 -
   */
  @SPEDField(minLength = 2, maxLength = 2, required = true)
  private String r02_COD_MOD = null;

  /**
   * Número de Série do equipamento SAT N 009 - O
   */
  @SPEDField(maxLength = 9, required = true)
  private String r03_NR_SAT = null;

  /**
   * Data de emissão dos documentos fiscais N 008 - O
   */
  @SPEDField(required = true, maxLength = 8)
  private LocalDate r04_DT_DOC = null;

  /**
   * Número do documento inicial N 006 - O
   */
  @SPEDField(maxLength = 6, required = true)
  private Long r05_DOC_INI = null;

  /**
   * Número do documento final N 006 - O
   */
  @SPEDField(required = true, maxLength = 6)
  private Long r06_DOC_FIM = null;

  @Override
  public String get01_Register() {
    return "C860";
  }

  /**
   * Recupera o código do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002 -.
   *
   * @return the código do modelo do documento fiscal, conforme a Tabela 4
   */
  public String getR02_COD_MOD() {
    return r02_COD_MOD;
  }

  /**
   * Define o código do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002 -.
   *
   * @param r02_COD_MOD the new código do modelo do documento fiscal, conforme a Tabela 4
   */
  public void setR02_COD_MOD(String r02_COD_MOD) {
    this.r02_COD_MOD = r02_COD_MOD;
  }

  /**
   * Recupera o número de Série do equipamento SAT N 009 - O.
   *
   * @return the número de Série do equipamento SAT N 009 - O
   */
  public String getR03_NR_SAT() {
    return r03_NR_SAT;
  }

  /**
   * Define o número de Série do equipamento SAT N 009 - O.
   *
   * @param r03_NR_SAT the new número de Série do equipamento SAT N 009 - O
   */
  public void setR03_NR_SAT(String r03_NR_SAT) {
    this.r03_NR_SAT = r03_NR_SAT;
  }

  /**
   * Recupera o data de emissão dos documentos fiscais N 008 - O.
   *
   * @return the data de emissão dos documentos fiscais N 008 - O
   */
  public LocalDate getR04_DT_DOC() {
    return r04_DT_DOC;
  }

  /**
   * Define o data de emissão dos documentos fiscais N 008 - O.
   *
   * @param r04_DT_DOC the new data de emissão dos documentos fiscais N 008 - O
   */
  public void setR04_DT_DOC(LocalDate r04_DT_DOC) {
    this.r04_DT_DOC = r04_DT_DOC;
  }

  /**
   * Recupera o número do documento inicial N 006 - O.
   *
   * @return the número do documento inicial N 006 - O
   */
  public Long getR05_DOC_INI() {
    return r05_DOC_INI;
  }

  /**
   * Define o número do documento inicial N 006 - O.
   *
   * @param r05_DOC_INI the new número do documento inicial N 006 - O
   */
  public void setR05_DOC_INI(Long r05_DOC_INI) {
    this.r05_DOC_INI = r05_DOC_INI;
  }

  /**
   * Recupera o número do documento final N 006 - O.
   *
   * @return the número do documento final N 006 - O
   */
  public Long getR06_DOC_FIM() {
    return r06_DOC_FIM;
  }

  /**
   * Define o número do documento final N 006 - O.
   *
   * @param r06_DOC_FIM the new número do documento final N 006 - O
   */
  public void setR06_DOC_FIM(Long r06_DOC_FIM) {
    this.r06_DOC_FIM = r06_DOC_FIM;
  }

  /**
   * Recupera o rEGISTRO C890: RESUMO DIÁRIO DO CF-E-SAT (CÓDIGO 59) POR EQUIPAMENTO SAT-CF-E<br>
   * Chave: CST_ICMS, CFOP e ALIQ_ICMS. Separados por "|". O registro c890 é agrupado dentro do C860 e deve ser único de acordo com as mesmas condições do C860 e mais CST do ICMS, CFOP e Alíquota do ICMS.
   *
   * @return the rEGISTRO C890: RESUMO DIÁRIO DO CF-E-SAT (CÓDIGO 59) POR EQUIPAMENTO SAT-CF-E<br>
   *         Chave: CST_ICMS, CFOP e ALIQ_ICMS
   */
  public LinkedHashMap<String, SPEDFiscalC890> getRc890() {
    return rc890;
  }

}