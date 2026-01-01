package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.time.LocalDate;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C114: CUPOM FISCAL REFERENCIADO.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalC114 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscalC114(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 COD_MOD Código do modelo do documento fiscal, conforme a tabela indicada no item 4.1.1 C 002* - O O
   */
  @SPEDField(maxLength = 2, minLength = 2)
  private String r02_COD_MOD = null;

  /**
   * 03 ECF_FAB Número de série de fabricação do ECF C 021 - O O
   */
  @SPEDField(maxLength = 21)
  private String r03_ECF_FAB = null;

  /**
   * 04 ECF_CX Número do caixa atribuído ao ECF N 003 - O O
   */
  @SPEDField(maxLength = 3)
  private Integer r04_ECF_CX = null;

  /**
   * 05 NUM_DOC Número do documento fiscal N 009 O O
   */
  @SPEDField(maxLength = 9)
  private Long r05_NUM_DOC = null;

  /**
   * 06 DT_DOC Data da emissão do documento fiscal N 008* - O O
   */
  @SPEDField(maxLength = 8, minLength = 8)
  private LocalDate r06_DT_DOC = null;

  @Override
  public String get01_Register() {
    return "C114";
  }

  /**
   * Recupera o 02 COD_MOD Código do modelo do documento fiscal, conforme a tabela indicada no item 4.1.1 C 002* - O O.
   *
   * @return the 02 COD_MOD Código do modelo do documento fiscal, conforme a tabela indicada no item 4
   */
  public String getR02_COD_MOD() {
    return r02_COD_MOD;
  }

  /**
   * Define o 02 COD_MOD Código do modelo do documento fiscal, conforme a tabela indicada no item 4.1.1 C 002* - O O.
   *
   * @param r02_COD_MOD the new 02 COD_MOD Código do modelo do documento fiscal, conforme a tabela indicada no item 4
   */
  public void setR02_COD_MOD(String r02_COD_MOD) {
    this.r02_COD_MOD = r02_COD_MOD;
  }

  /**
   * Recupera o 03 ECF_FAB Número de série de fabricação do ECF C 021 - O O.
   *
   * @return the 03 ECF_FAB Número de série de fabricação do ECF C 021 - O O
   */
  public String getR03_ECF_FAB() {
    return r03_ECF_FAB;
  }

  /**
   * Define o 03 ECF_FAB Número de série de fabricação do ECF C 021 - O O.
   *
   * @param r03ecf_FAB the new 03 ECF_FAB Número de série de fabricação do ECF C 021 - O O
   */
  public void setR03_ECF_FAB(String r03ecf_FAB) {
    r03_ECF_FAB = r03ecf_FAB;
  }

  /**
   * Recupera o 04 ECF_CX Número do caixa atribuído ao ECF N 003 - O O.
   *
   * @return the 04 ECF_CX Número do caixa atribuído ao ECF N 003 - O O
   */
  public Integer getR04_ECF_CX() {
    return r04_ECF_CX;
  }

  /**
   * Define o 04 ECF_CX Número do caixa atribuído ao ECF N 003 - O O.
   *
   * @param r04_ECF_CX the new 04 ECF_CX Número do caixa atribuído ao ECF N 003 - O O
   */
  public void setR04_ECF_CX(Integer r04_ECF_CX) {
    this.r04_ECF_CX = r04_ECF_CX;
  }

  /**
   * Recupera o 05 NUM_DOC Número do documento fiscal N 009 O O.
   *
   * @return the 05 NUM_DOC Número do documento fiscal N 009 O O
   */
  public Long getR05_NUM_DOC() {
    return r05_NUM_DOC;
  }

  /**
   * Define o 05 NUM_DOC Número do documento fiscal N 009 O O.
   *
   * @param r05_NUM_DOC the new 05 NUM_DOC Número do documento fiscal N 009 O O
   */
  public void setR05_NUM_DOC(Long r05_NUM_DOC) {
    this.r05_NUM_DOC = r05_NUM_DOC;
  }

  /**
   * Recupera o 06 DT_DOC Data da emissão do documento fiscal N 008* - O O.
   *
   * @return the 06 DT_DOC Data da emissão do documento fiscal N 008* - O O
   */
  public LocalDate getR06_DT_DOC() {
    return r06_DT_DOC;
  }

  /**
   * Define o 06 DT_DOC Data da emissão do documento fiscal N 008* - O O.
   *
   * @param r06_DT_DOC the new 06 DT_DOC Data da emissão do documento fiscal N 008* - O O
   */
  public void setR06_DT_DOC(LocalDate r06_DT_DOC) {
    this.r06_DT_DOC = r06_DT_DOC;
  }

}