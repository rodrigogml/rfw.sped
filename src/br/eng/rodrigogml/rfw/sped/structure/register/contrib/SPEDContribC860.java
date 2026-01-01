package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import java.time.LocalDate;
import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C860: IDENTIFICAÇÃO DO EQUIPAMENTO SAT-CF-E.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribC860 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  public SPEDContribC860(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * REGISTRO C870: RESUMO DIÁRIO DE DOCUMENTOS EMITIDOS POR EQUIPAMENTO SAT-CF-E (CÓDIGO 59) – PIS/PASEP E COFINS<br>
   * Segundo documentação: "3. No caso de ocorrência de venda com CST distintos, deve ser gerado um registro para cada CST. Como também, no caso de a operação tributável incidir a alíquotas distintas;", por tanto a chave se faz pelos campos que distinguem cada venda:<br>
   * Chave: COD_ITEM, CST_PIS, ALIQ_PIS e ALIQ_COFINS. Separados por "|"
   */
  private final LinkedHashMap<String, SPEDContribC870> rc870 = new LinkedHashMap<String, SPEDContribC870>();

  /**
   * Código do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002 - S
   */
  @SPEDField(maxLength = 2, required = true)
  private String r02_COD_MOD = null;

  /**
   * Número de Série do equipamento SAT N 009 - S
   */
  @SPEDField(maxLength = 9, required = true)
  private String r03_NR_SAT = null;

  /**
   * Data de emissão dos documentos fiscais N 008 - N
   */
  @SPEDField(maxLength = 8, required = false)
  private LocalDate r04_DT_DOC = null;

  /**
   * Número do documento inicial N 009 - N
   */
  @SPEDField(maxLength = 9, required = false)
  private Long r05_DOC_INI = null;

  /**
   * Número do documento final N 009 - N
   */
  @SPEDField(maxLength = 9, required = false)
  private Long r06_DOC_FIM = null;

  @Override
  public String get01_Register() {
    return "C860";
  }

  /**
   * Recupera o código do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002 - S.
   *
   * @return the código do modelo do documento fiscal, conforme a Tabela 4
   */
  public String getR02_COD_MOD() {
    return r02_COD_MOD;
  }

  /**
   * Define o código do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002 - S.
   *
   * @param r02_COD_MOD the new código do modelo do documento fiscal, conforme a Tabela 4
   */
  public void setR02_COD_MOD(String r02_COD_MOD) {
    this.r02_COD_MOD = r02_COD_MOD;
  }

  /**
   * Recupera o número de Série do equipamento SAT N 009 - S.
   *
   * @return the número de Série do equipamento SAT N 009 - S
   */
  public String getR03_NR_SAT() {
    return r03_NR_SAT;
  }

  /**
   * Define o número de Série do equipamento SAT N 009 - S.
   *
   * @param r03_NR_SAT the new número de Série do equipamento SAT N 009 - S
   */
  public void setR03_NR_SAT(String r03_NR_SAT) {
    this.r03_NR_SAT = r03_NR_SAT;
  }

  /**
   * Recupera o data de emissão dos documentos fiscais N 008 - N.
   *
   * @return the data de emissão dos documentos fiscais N 008 - N
   */
  public LocalDate getR04_DT_DOC() {
    return r04_DT_DOC;
  }

  /**
   * Define o data de emissão dos documentos fiscais N 008 - N.
   *
   * @param r04_DT_DOC the new data de emissão dos documentos fiscais N 008 - N
   */
  public void setR04_DT_DOC(LocalDate r04_DT_DOC) {
    this.r04_DT_DOC = r04_DT_DOC;
  }

  /**
   * Recupera o número do documento inicial N 009 - N.
   *
   * @return the número do documento inicial N 009 - N
   */
  public Long getR05_DOC_INI() {
    return r05_DOC_INI;
  }

  /**
   * Define o número do documento inicial N 009 - N.
   *
   * @param r05_DOC_INI the new número do documento inicial N 009 - N
   */
  public void setR05_DOC_INI(Long r05_DOC_INI) {
    this.r05_DOC_INI = r05_DOC_INI;
  }

  /**
   * Recupera o número do documento final N 009 - N.
   *
   * @return the número do documento final N 009 - N
   */
  public Long getR06_DOC_FIM() {
    return r06_DOC_FIM;
  }

  /**
   * Define o número do documento final N 009 - N.
   *
   * @param r06_DOC_FIM the new número do documento final N 009 - N
   */
  public void setR06_DOC_FIM(Long r06_DOC_FIM) {
    this.r06_DOC_FIM = r06_DOC_FIM;
  }

  /**
   * Recupera o rEGISTRO C870: RESUMO DIÁRIO DE DOCUMENTOS EMITIDOS POR EQUIPAMENTO SAT-CF-E (CÓDIGO 59) – PIS/PASEP E COFINS<br>
   * Segundo documentação: "3. No caso de ocorrência de venda com CST distintos, deve ser gerado um registro para cada CST. Como também, no caso de a operação tributável incidir a alíquotas distintas;", por tanto a chave se faz pelos campos que distinguem cada venda:<br>
   * Chave: COD_ITEM, CST_PIS, ALIQ_PIS e ALIQ_COFINS. Separados por "|".
   *
   * @return the rEGISTRO C870: RESUMO DIÁRIO DE DOCUMENTOS EMITIDOS POR EQUIPAMENTO SAT-CF-E (CÓDIGO 59) – PIS/PASEP E COFINS<br>
   *         Segundo documentação: "3
   */
  public LinkedHashMap<String, SPEDContribC870> getRc870() {
    return rc870;
  }

}