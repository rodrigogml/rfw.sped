package br.eng.rodrigogml.rfw.sped.structure.contrib;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO 0150: TABELA DE CADASTRO DO PARTICIPANTE.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContrib0150 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * C�digo de identifica��o do participante no arquivo. C 060 - S
   */
  @SPEDField(maxLength = 60, required = true)
  private String r02_COD_PART = null;

  /**
   * Nome pessoal ou empresarial do participante. C 100 - S
   */
  @SPEDField(maxLength = 100, required = true)
  private String r03_NOME = null;

  /**
   * C�digo do pa�s do participante, conforme a tabela indicada no item 3.2.1. N 005 - S
   */
  @SPEDField(maxLength = 5, required = true)
  private String r04_COD_PAIS = null;

  /**
   * CNPJ do participante. N 014* - N
   */
  @SPEDField(maxLength = 14, minLength = 14, required = false)
  private String r05_CNPJ = null;

  /**
   * CPF do participante. N 011* - N
   */
  @SPEDField(maxLength = 11, minLength = 11, required = false)
  private String r06_CPF = null;

  /**
   * Inscri��o Estadual do participante. C 014 - N
   */
  @SPEDField(maxLength = 14, required = false)
  private String r07_IE = null;

  /**
   * C�digo do munic�pio, conforme a tabela IBGE N 007* - N
   */
  @SPEDField(maxLength = 7, minLength = 7, required = false)
  private String r08_COD_MUN = null;

  /**
   * N�mero de inscri��o do participante na Suframa C 009* - N
   */
  @SPEDField(maxLength = 9, minLength = 9, required = false)
  private String r09_SUFRAMA = null;

  /**
   * Logradouro e endere�o do im�vel C 060 - N
   */
  @SPEDField(maxLength = 60, required = false)
  private String r10_END = null;

  /**
   * N�mero do im�vel C - - N
   */
  @SPEDField(maxLength = 10, required = false)
  private String r11_NUM = null;

  /**
   * Dados complementares do endere�o C 060 - N
   */
  @SPEDField(maxLength = 60, required = false)
  private String r12_COMPL = null;

  /**
   * Bairro em que o im�vel est� situado C 060 - N
   */
  @SPEDField(maxLength = 060, required = false)
  private String r13_BAIRRO = null;

  @Override
  public String get01_Register() {
    return "0150";
  }

  /**
   * Recupera o c�digo de identifica��o do participante no arquivo. C 060 - S.
   *
   * @return the c�digo de identifica��o do participante no arquivo
   */
  public String getR02_COD_PART() {
    return r02_COD_PART;
  }

  /**
   * Define o c�digo de identifica��o do participante no arquivo. C 060 - S.
   *
   * @param r02_COD_PART the new c�digo de identifica��o do participante no arquivo
   */
  public void setR02_COD_PART(String r02_COD_PART) {
    this.r02_COD_PART = r02_COD_PART;
  }

  /**
   * Recupera o nome pessoal ou empresarial do participante. C 100 - S.
   *
   * @return the nome pessoal ou empresarial do participante
   */
  public String getR03_NOME() {
    return r03_NOME;
  }

  /**
   * Define o nome pessoal ou empresarial do participante. C 100 - S.
   *
   * @param r03_NOME the new nome pessoal ou empresarial do participante
   */
  public void setR03_NOME(String r03_NOME) {
    this.r03_NOME = r03_NOME;
  }

  /**
   * Recupera o c�digo do pa�s do participante, conforme a tabela indicada no item 3.2.1. N 005 - S.
   *
   * @return the c�digo do pa�s do participante, conforme a tabela indicada no item 3
   */
  public String getR04_COD_PAIS() {
    return r04_COD_PAIS;
  }

  /**
   * Define o c�digo do pa�s do participante, conforme a tabela indicada no item 3.2.1. N 005 - S.
   *
   * @param r04_COD_PAIS the new c�digo do pa�s do participante, conforme a tabela indicada no item 3
   */
  public void setR04_COD_PAIS(String r04_COD_PAIS) {
    this.r04_COD_PAIS = r04_COD_PAIS;
  }

  /**
   * Recupera o cNPJ do participante. N 014* - N.
   *
   * @return the cNPJ do participante
   */
  public String getR05_CNPJ() {
    return r05_CNPJ;
  }

  /**
   * Define o cNPJ do participante. N 014* - N.
   *
   * @param r05_CNPJ the new cNPJ do participante
   */
  public void setR05_CNPJ(String r05_CNPJ) {
    this.r05_CNPJ = r05_CNPJ;
  }

  /**
   * Recupera o cPF do participante. N 011* - N.
   *
   * @return the cPF do participante
   */
  public String getR06_CPF() {
    return r06_CPF;
  }

  /**
   * Define o cPF do participante. N 011* - N.
   *
   * @param r06_CPF the new cPF do participante
   */
  public void setR06_CPF(String r06_CPF) {
    this.r06_CPF = r06_CPF;
  }

  /**
   * Recupera o inscri��o Estadual do participante. C 014 - N.
   *
   * @return the inscri��o Estadual do participante
   */
  public String getR07_IE() {
    return r07_IE;
  }

  /**
   * Define o inscri��o Estadual do participante. C 014 - N.
   *
   * @param r07_IE the new inscri��o Estadual do participante
   */
  public void setR07_IE(String r07_IE) {
    this.r07_IE = r07_IE;
  }

  /**
   * Recupera o c�digo do munic�pio, conforme a tabela IBGE N 007* - N.
   *
   * @return the c�digo do munic�pio, conforme a tabela IBGE N 007* - N
   */
  public String getR08_COD_MUN() {
    return r08_COD_MUN;
  }

  /**
   * Define o c�digo do munic�pio, conforme a tabela IBGE N 007* - N.
   *
   * @param r08_COD_MUN the new c�digo do munic�pio, conforme a tabela IBGE N 007* - N
   */
  public void setR08_COD_MUN(String r08_COD_MUN) {
    this.r08_COD_MUN = r08_COD_MUN;
  }

  /**
   * Recupera o n�mero de inscri��o do participante na Suframa C 009* - N.
   *
   * @return the n�mero de inscri��o do participante na Suframa C 009* - N
   */
  public String getR09_SUFRAMA() {
    return r09_SUFRAMA;
  }

  /**
   * Define o n�mero de inscri��o do participante na Suframa C 009* - N.
   *
   * @param r09_SUFRAMA the new n�mero de inscri��o do participante na Suframa C 009* - N
   */
  public void setR09_SUFRAMA(String r09_SUFRAMA) {
    this.r09_SUFRAMA = r09_SUFRAMA;
  }

  /**
   * Recupera o logradouro e endere�o do im�vel C 060 - N.
   *
   * @return the logradouro e endere�o do im�vel C 060 - N
   */
  public String getR10_END() {
    return r10_END;
  }

  /**
   * Define o logradouro e endere�o do im�vel C 060 - N.
   *
   * @param r10_END the new logradouro e endere�o do im�vel C 060 - N
   */
  public void setR10_END(String r10_END) {
    this.r10_END = r10_END;
  }

  /**
   * Recupera o n�mero do im�vel C - - N.
   *
   * @return the n�mero do im�vel C - - N
   */
  public String getR11_NUM() {
    return r11_NUM;
  }

  /**
   * Define o n�mero do im�vel C - - N.
   *
   * @param r11_NUM the new n�mero do im�vel C - - N
   */
  public void setR11_NUM(String r11_NUM) {
    this.r11_NUM = r11_NUM;
  }

  /**
   * Recupera o dados complementares do endere�o C 060 - N.
   *
   * @return the dados complementares do endere�o C 060 - N
   */
  public String getR12_COMPL() {
    return r12_COMPL;
  }

  /**
   * Define o dados complementares do endere�o C 060 - N.
   *
   * @param r12_COMPL the new dados complementares do endere�o C 060 - N
   */
  public void setR12_COMPL(String r12_COMPL) {
    this.r12_COMPL = r12_COMPL;
  }

  /**
   * Recupera o bairro em que o im�vel est� situado C 060 - N.
   *
   * @return the bairro em que o im�vel est� situado C 060 - N
   */
  public String getR13_BAIRRO() {
    return r13_BAIRRO;
  }

  /**
   * Define o bairro em que o im�vel est� situado C 060 - N.
   *
   * @param r13_BAIRRO the new bairro em que o im�vel est� situado C 060 - N
   */
  public void setR13_BAIRRO(String r13_BAIRRO) {
    this.r13_BAIRRO = r13_BAIRRO;
  }
}