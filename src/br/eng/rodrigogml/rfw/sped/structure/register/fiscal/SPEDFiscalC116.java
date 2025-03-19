package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.time.LocalDate;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C116: CUPOM FISCAL ELETR�NICO REFERENCIADO.<br>
 *
 * @author Rodrigo Leit�o
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalC116 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscalC116(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * C�digo do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002 - O O
   */
  @SPEDField(maxLength = 2, required = true)
  private String r02_COD_MOD = null;

  /**
   * N�mero de S�rie do equipamento SAT N 009 - O O
   */
  @SPEDField(maxLength = 9, required = true)
  private String r03_NR_SAT = null;

  /**
   * Chave do Cupom Fiscal Eletr�nico N 044 - O O
   */
  @SPEDField(maxLength = 44, required = true)
  private String r04_CHV_CFE = null;

  /**
   * N�mero do cupom fiscal eletr�nico N 006 - O O
   */
  @SPEDField(maxLength = 6, required = true)
  private Long r05_NUM_CFE = null;

  /**
   * Data da emiss�o do documento fiscal N 008 - O O
   */
  @SPEDField(maxLength = 8, required = true)
  private LocalDate r06_DT_DOC = null;

  @Override
  public String get01_Register() {
    return "C116";
  }

  /**
   * Recupera o c�digo do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002 - O O.
   *
   * @return the c�digo do modelo do documento fiscal, conforme a Tabela 4
   */
  public String getR02_COD_MOD() {
    return r02_COD_MOD;
  }

  /**
   * Define o c�digo do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002 - O O.
   *
   * @param r02_COD_MOD the new c�digo do modelo do documento fiscal, conforme a Tabela 4
   */
  public void setR02_COD_MOD(String r02_COD_MOD) {
    this.r02_COD_MOD = r02_COD_MOD;
  }

  /**
   * Recupera o n�mero de S�rie do equipamento SAT N 009 - O O.
   *
   * @return the n�mero de S�rie do equipamento SAT N 009 - O O
   */
  public String getR03_NR_SAT() {
    return r03_NR_SAT;
  }

  /**
   * Define o n�mero de S�rie do equipamento SAT N 009 - O O.
   *
   * @param r03_NR_SAT the new n�mero de S�rie do equipamento SAT N 009 - O O
   */
  public void setR03_NR_SAT(String r03_NR_SAT) {
    this.r03_NR_SAT = r03_NR_SAT;
  }

  /**
   * Recupera o chave do Cupom Fiscal Eletr�nico N 044 - O O.
   *
   * @return the chave do Cupom Fiscal Eletr�nico N 044 - O O
   */
  public String getR04_CHV_CFE() {
    return r04_CHV_CFE;
  }

  /**
   * Define o chave do Cupom Fiscal Eletr�nico N 044 - O O.
   *
   * @param r04_CHV_CFE the new chave do Cupom Fiscal Eletr�nico N 044 - O O
   */
  public void setR04_CHV_CFE(String r04_CHV_CFE) {
    this.r04_CHV_CFE = r04_CHV_CFE;
  }

  /**
   * Recupera o n�mero do cupom fiscal eletr�nico N 006 - O O.
   *
   * @return the n�mero do cupom fiscal eletr�nico N 006 - O O
   */
  public Long getR05_NUM_CFE() {
    return r05_NUM_CFE;
  }

  /**
   * Define o n�mero do cupom fiscal eletr�nico N 006 - O O.
   *
   * @param r05_NUM_CFE the new n�mero do cupom fiscal eletr�nico N 006 - O O
   */
  public void setR05_NUM_CFE(Long r05_NUM_CFE) {
    this.r05_NUM_CFE = r05_NUM_CFE;
  }

  /**
   * Recupera o data da emiss�o do documento fiscal N 008 - O O.
   *
   * @return the data da emiss�o do documento fiscal N 008 - O O
   */
  public LocalDate getR06_DT_DOC() {
    return r06_DT_DOC;
  }

  /**
   * Define o data da emiss�o do documento fiscal N 008 - O O.
   *
   * @param r06_DT_DOC the new data da emiss�o do documento fiscal N 008 - O O
   */
  public void setR06_DT_DOC(LocalDate r06_DT_DOC) {
    this.r06_DT_DOC = r06_DT_DOC;
  }

}