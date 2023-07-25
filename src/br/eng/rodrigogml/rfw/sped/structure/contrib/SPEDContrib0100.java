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
   * Número de inscrição do contabilista no CPF. N 011* - S
   */
  @SPEDField(maxLength = 11, minLength = 11, required = true)
  private String r03_CPF = null;

  /**
   * Número de inscrição do contabilista no Conselho Regional de Contabilidade. C 015 - S
   */
  @SPEDField(maxLength = 15, required = true)
  private String r04_CRC = null;

  /**
   * Número de inscrição do escritório de contabilidade no CNPJ, se houver. N 014* - N
   */
  @SPEDField(maxLength = 14, minLength = 14, required = false)
  private String r05_CNPJ = null;

  /**
   * Código de Endereçamento Postal. N 008* - N
   */
  @SPEDField(maxLength = 8, minLength = 8, required = false)
  private String r06_CEP = null;

  /**
   * Logradouro e endereço do imóvel. C 060 - N
   */
  @SPEDField(maxLength = 60, required = false)
  private String r07_END = null;

  /**
   * Número do imóvel. C - - N
   */
  @SPEDField(maxLength = 6, required = true)
  private Integer r08_NUM = null;

  /**
   * Dados complementares do endereço. C 060 - N
   */
  @SPEDField(maxLength = 60, required = false)
  private String r09_COMPL = null;

  /**
   * Bairro em que o imóvel está situado. C 060 - N
   */
  @SPEDField(maxLength = 60, required = false)
  private String r10_BAIRRO = null;

  /**
   * Número do telefone. C 11 - N
   */
  @SPEDField(maxLength = 11, required = false)
  private String r11_FONE = null;

  /**
   * Número do fax. C 11 - N
   */
  @SPEDField(maxLength = 11, required = false)
  private String r12_FAX = null;

  /**
   * Endereço do correio eletrônico. C - - N
   */
  @SPEDField(maxLength = 100, required = false)
  private String r13_EMAIL = null;

  /**
   * Código do município, conforme tabela IBGE. N 007* - N
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
   * Recupera o número de inscrição do contabilista no CPF. N 011* - S.
   *
   * @return the número de inscrição do contabilista no CPF
   */
  public String getR03_CPF() {
    return r03_CPF;
  }

  /**
   * Define o número de inscrição do contabilista no CPF. N 011* - S.
   *
   * @param r03_CPF the new número de inscrição do contabilista no CPF
   */
  public void setR03_CPF(String r03_CPF) {
    this.r03_CPF = r03_CPF;
  }

  /**
   * Recupera o número de inscrição do contabilista no Conselho Regional de Contabilidade. C 015 - S.
   *
   * @return the número de inscrição do contabilista no Conselho Regional de Contabilidade
   */
  public String getR04_CRC() {
    return r04_CRC;
  }

  /**
   * Define o número de inscrição do contabilista no Conselho Regional de Contabilidade. C 015 - S.
   *
   * @param r04_CRC the new número de inscrição do contabilista no Conselho Regional de Contabilidade
   */
  public void setR04_CRC(String r04_CRC) {
    this.r04_CRC = r04_CRC;
  }

  /**
   * Recupera o número de inscrição do escritório de contabilidade no CNPJ, se houver. N 014* - N.
   *
   * @return the número de inscrição do escritório de contabilidade no CNPJ, se houver
   */
  public String getR05_CNPJ() {
    return r05_CNPJ;
  }

  /**
   * Define o número de inscrição do escritório de contabilidade no CNPJ, se houver. N 014* - N.
   *
   * @param r05_CNPJ the new número de inscrição do escritório de contabilidade no CNPJ, se houver
   */
  public void setR05_CNPJ(String r05_CNPJ) {
    this.r05_CNPJ = r05_CNPJ;
  }

  /**
   * Recupera o código de Endereçamento Postal. N 008* - N.
   *
   * @return the código de Endereçamento Postal
   */
  public String getR06_CEP() {
    return r06_CEP;
  }

  /**
   * Define o código de Endereçamento Postal. N 008* - N.
   *
   * @param r06_CEP the new código de Endereçamento Postal
   */
  public void setR06_CEP(String r06_CEP) {
    this.r06_CEP = r06_CEP;
  }

  /**
   * Recupera o logradouro e endereço do imóvel. C 060 - N.
   *
   * @return the logradouro e endereço do imóvel
   */
  public String getR07_END() {
    return r07_END;
  }

  /**
   * Define o logradouro e endereço do imóvel. C 060 - N.
   *
   * @param r07_END the new logradouro e endereço do imóvel
   */
  public void setR07_END(String r07_END) {
    this.r07_END = r07_END;
  }

  /**
   * Recupera o número do imóvel. C - - N.
   *
   * @return the número do imóvel
   */
  public Integer getR08_NUM() {
    return r08_NUM;
  }

  /**
   * Define o número do imóvel. C - - N.
   *
   * @param r08_NUM the new número do imóvel
   */
  public void setR08_NUM(Integer r08_NUM) {
    this.r08_NUM = r08_NUM;
  }

  /**
   * Recupera o dados complementares do endereço. C 060 - N.
   *
   * @return the dados complementares do endereço
   */
  public String getR09_COMPL() {
    return r09_COMPL;
  }

  /**
   * Define o dados complementares do endereço. C 060 - N.
   *
   * @param r09_COMPL the new dados complementares do endereço
   */
  public void setR09_COMPL(String r09_COMPL) {
    this.r09_COMPL = r09_COMPL;
  }

  /**
   * Recupera o bairro em que o imóvel está situado. C 060 - N.
   *
   * @return the bairro em que o imóvel está situado
   */
  public String getR10_BAIRRO() {
    return r10_BAIRRO;
  }

  /**
   * Define o bairro em que o imóvel está situado. C 060 - N.
   *
   * @param r10_BAIRRO the new bairro em que o imóvel está situado
   */
  public void setR10_BAIRRO(String r10_BAIRRO) {
    this.r10_BAIRRO = r10_BAIRRO;
  }

  /**
   * Recupera o número do telefone. C 11 - N.
   *
   * @return the número do telefone
   */
  public String getR11_FONE() {
    return r11_FONE;
  }

  /**
   * Define o número do telefone. C 11 - N.
   *
   * @param r11_FONE the new número do telefone
   */
  public void setR11_FONE(String r11_FONE) {
    this.r11_FONE = r11_FONE;
  }

  /**
   * Recupera o número do fax. C 11 - N.
   *
   * @return the número do fax
   */
  public String getR12_FAX() {
    return r12_FAX;
  }

  /**
   * Define o número do fax. C 11 - N.
   *
   * @param r12_FAX the new número do fax
   */
  public void setR12_FAX(String r12_FAX) {
    this.r12_FAX = r12_FAX;
  }

  /**
   * Recupera o endereço do correio eletrônico. C - - N.
   *
   * @return the endereço do correio eletrônico
   */
  public String getR13_EMAIL() {
    return r13_EMAIL;
  }

  /**
   * Define o endereço do correio eletrônico. C - - N.
   *
   * @param r13_EMAIL the new endereço do correio eletrônico
   */
  public void setR13_EMAIL(String r13_EMAIL) {
    this.r13_EMAIL = r13_EMAIL;
  }

  /**
   * Recupera o código do município, conforme tabela IBGE. N 007* - N.
   *
   * @return the código do município, conforme tabela IBGE
   */
  public String getR14_COD_MUN() {
    return r14_COD_MUN;
  }

  /**
   * Define o código do município, conforme tabela IBGE. N 007* - N.
   *
   * @param r14_COD_MUN the new código do município, conforme tabela IBGE
   */
  public void setR14_COD_MUN(String r14_COD_MUN) {
    this.r14_COD_MUN = r14_COD_MUN;
  }
}