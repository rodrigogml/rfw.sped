package br.eng.rodrigogml.rfw.sped.structure.contrib;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO 0100: DADOS DO CONTABILISTA.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContrib0100 extends SPEDRegister {

  /**
   * Nome do contabilista. C 100 - S
   */
  @SPEDField(maxLength = 100, required = true)
  private String r02_NOME = null;

  /**
   * N�mero de inscri��o do contabilista no CPF. N 011* - S
   */
  @SPEDField(maxLength = 11, minLength = 11, required = true)
  private String r03_CPF = null;

  /**
   * N�mero de inscri��o do contabilista no Conselho Regional de Contabilidade. C 015 - S
   */
  @SPEDField(maxLength = 15, required = true)
  private String r04_CRC = null;

  /**
   * N�mero de inscri��o do escrit�rio de contabilidade no CNPJ, se houver. N 014* - N
   */
  @SPEDField(maxLength = 14, minLength = 14, required = false)
  private String r05_CNPJ = null;

  /**
   * C�digo de Endere�amento Postal. N 008* - N
   */
  @SPEDField(maxLength = 8, minLength = 8, required = false)
  private String r06_CEP = null;

  /**
   * Logradouro e endere�o do im�vel. C 060 - N
   */
  @SPEDField(maxLength = 60, required = false)
  private String r07_END = null;

  /**
   * N�mero do im�vel. C - - N
   */
  @SPEDField(maxLength = 6, required = true)
  private Integer r08_NUM = null;

  /**
   * Dados complementares do endere�o. C 060 - N
   */
  @SPEDField(maxLength = 60, required = false)
  private String r09_COMPL = null;

  /**
   * Bairro em que o im�vel est� situado. C 060 - N
   */
  @SPEDField(maxLength = 60, required = false)
  private String r10_BAIRRO = null;

  /**
   * N�mero do telefone. C 11 - N
   */
  @SPEDField(maxLength = 11, required = false)
  private String r11_FONE = null;

  /**
   * N�mero do fax. C 11 - N
   */
  @SPEDField(maxLength = 11, required = false)
  private String r12_FAX = null;

  /**
   * Endere�o do correio eletr�nico. C - - N
   */
  @SPEDField(maxLength = 100, required = false)
  private String r13_EMAIL = null;

  /**
   * C�digo do munic�pio, conforme tabela IBGE. N 007* - N
   */
  @SPEDField(maxLength = 7, minLength = 7, required = false)
  private String r14_COD_MUN = null;

  @Override
  public String get01_Register() {
    return "0100";
  }

  /**
   * Recupera o nome do contabilista. C 100 - S.
   *
   * @return the nome do contabilista
   */
  public String getR02_NOME() {
    return r02_NOME;
  }

  /**
   * Define o nome do contabilista. C 100 - S.
   *
   * @param r02_NOME the new nome do contabilista
   */
  public void setR02_NOME(String r02_NOME) {
    this.r02_NOME = r02_NOME;
  }

  /**
   * Recupera o n�mero de inscri��o do contabilista no CPF. N 011* - S.
   *
   * @return the n�mero de inscri��o do contabilista no CPF
   */
  public String getR03_CPF() {
    return r03_CPF;
  }

  /**
   * Define o n�mero de inscri��o do contabilista no CPF. N 011* - S.
   *
   * @param r03_CPF the new n�mero de inscri��o do contabilista no CPF
   */
  public void setR03_CPF(String r03_CPF) {
    this.r03_CPF = r03_CPF;
  }

  /**
   * Recupera o n�mero de inscri��o do contabilista no Conselho Regional de Contabilidade. C 015 - S.
   *
   * @return the n�mero de inscri��o do contabilista no Conselho Regional de Contabilidade
   */
  public String getR04_CRC() {
    return r04_CRC;
  }

  /**
   * Define o n�mero de inscri��o do contabilista no Conselho Regional de Contabilidade. C 015 - S.
   *
   * @param r04_CRC the new n�mero de inscri��o do contabilista no Conselho Regional de Contabilidade
   */
  public void setR04_CRC(String r04_CRC) {
    this.r04_CRC = r04_CRC;
  }

  /**
   * Recupera o n�mero de inscri��o do escrit�rio de contabilidade no CNPJ, se houver. N 014* - N.
   *
   * @return the n�mero de inscri��o do escrit�rio de contabilidade no CNPJ, se houver
   */
  public String getR05_CNPJ() {
    return r05_CNPJ;
  }

  /**
   * Define o n�mero de inscri��o do escrit�rio de contabilidade no CNPJ, se houver. N 014* - N.
   *
   * @param r05_CNPJ the new n�mero de inscri��o do escrit�rio de contabilidade no CNPJ, se houver
   */
  public void setR05_CNPJ(String r05_CNPJ) {
    this.r05_CNPJ = r05_CNPJ;
  }

  /**
   * Recupera o c�digo de Endere�amento Postal. N 008* - N.
   *
   * @return the c�digo de Endere�amento Postal
   */
  public String getR06_CEP() {
    return r06_CEP;
  }

  /**
   * Define o c�digo de Endere�amento Postal. N 008* - N.
   *
   * @param r06_CEP the new c�digo de Endere�amento Postal
   */
  public void setR06_CEP(String r06_CEP) {
    this.r06_CEP = r06_CEP;
  }

  /**
   * Recupera o logradouro e endere�o do im�vel. C 060 - N.
   *
   * @return the logradouro e endere�o do im�vel
   */
  public String getR07_END() {
    return r07_END;
  }

  /**
   * Define o logradouro e endere�o do im�vel. C 060 - N.
   *
   * @param r07_END the new logradouro e endere�o do im�vel
   */
  public void setR07_END(String r07_END) {
    this.r07_END = r07_END;
  }

  /**
   * Recupera o n�mero do im�vel. C - - N.
   *
   * @return the n�mero do im�vel
   */
  public Integer getR08_NUM() {
    return r08_NUM;
  }

  /**
   * Define o n�mero do im�vel. C - - N.
   *
   * @param r08_NUM the new n�mero do im�vel
   */
  public void setR08_NUM(Integer r08_NUM) {
    this.r08_NUM = r08_NUM;
  }

  /**
   * Recupera o dados complementares do endere�o. C 060 - N.
   *
   * @return the dados complementares do endere�o
   */
  public String getR09_COMPL() {
    return r09_COMPL;
  }

  /**
   * Define o dados complementares do endere�o. C 060 - N.
   *
   * @param r09_COMPL the new dados complementares do endere�o
   */
  public void setR09_COMPL(String r09_COMPL) {
    this.r09_COMPL = r09_COMPL;
  }

  /**
   * Recupera o bairro em que o im�vel est� situado. C 060 - N.
   *
   * @return the bairro em que o im�vel est� situado
   */
  public String getR10_BAIRRO() {
    return r10_BAIRRO;
  }

  /**
   * Define o bairro em que o im�vel est� situado. C 060 - N.
   *
   * @param r10_BAIRRO the new bairro em que o im�vel est� situado
   */
  public void setR10_BAIRRO(String r10_BAIRRO) {
    this.r10_BAIRRO = r10_BAIRRO;
  }

  /**
   * Recupera o n�mero do telefone. C 11 - N.
   *
   * @return the n�mero do telefone
   */
  public String getR11_FONE() {
    return r11_FONE;
  }

  /**
   * Define o n�mero do telefone. C 11 - N.
   *
   * @param r11_FONE the new n�mero do telefone
   */
  public void setR11_FONE(String r11_FONE) {
    this.r11_FONE = r11_FONE;
  }

  /**
   * Recupera o n�mero do fax. C 11 - N.
   *
   * @return the n�mero do fax
   */
  public String getR12_FAX() {
    return r12_FAX;
  }

  /**
   * Define o n�mero do fax. C 11 - N.
   *
   * @param r12_FAX the new n�mero do fax
   */
  public void setR12_FAX(String r12_FAX) {
    this.r12_FAX = r12_FAX;
  }

  /**
   * Recupera o endere�o do correio eletr�nico. C - - N.
   *
   * @return the endere�o do correio eletr�nico
   */
  public String getR13_EMAIL() {
    return r13_EMAIL;
  }

  /**
   * Define o endere�o do correio eletr�nico. C - - N.
   *
   * @param r13_EMAIL the new endere�o do correio eletr�nico
   */
  public void setR13_EMAIL(String r13_EMAIL) {
    this.r13_EMAIL = r13_EMAIL;
  }

  /**
   * Recupera o c�digo do munic�pio, conforme tabela IBGE. N 007* - N.
   *
   * @return the c�digo do munic�pio, conforme tabela IBGE
   */
  public String getR14_COD_MUN() {
    return r14_COD_MUN;
  }

  /**
   * Define o c�digo do munic�pio, conforme tabela IBGE. N 007* - N.
   *
   * @param r14_COD_MUN the new c�digo do munic�pio, conforme tabela IBGE
   */
  public void setR14_COD_MUN(String r14_COD_MUN) {
    this.r14_COD_MUN = r14_COD_MUN;
  }
}