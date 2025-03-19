package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField.SPEDFIELDTYPE;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO 0150: TABELA DE CADASTRO DO PARTICIPANTE.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscal0150 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscal0150(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 COD_PART Código de identificação do participante no arquivo. C 060 - O
   */
  @SPEDField(maxLength = 60)
  private String r02_COD_PART = null;

  /**
   * 03 NOME Nome pessoal ou empresarial do participante. C 100 - O
   */
  @SPEDField(maxLength = 100)
  private String r03_NOME = null;

  /**
   * 04 COD_PAIS Código do país do participante, conforme a tabela indicada no item 3.2.1 N 005 - O
   */
  @SPEDField(maxLength = 5)
  private String r04_COD_PAIS = null;

  /**
   * 05 CNPJ CNPJ do participante. N 014* - OC
   */
  @SPEDField(maxLength = 14, minLength = 14, required = false, type = SPEDFIELDTYPE.CNPJ)
  private String r05_CNPJ = null;

  /**
   * 06 CPF CPF do participante. N 011* - OC
   */
  @SPEDField(maxLength = 11, minLength = 11, required = false, type = SPEDFIELDTYPE.CPF)
  private String r06_CPF = null;

  /**
   * 07 IE Inscrição Estadual do participante. C 014 - OC
   */
  @SPEDField(maxLength = 14, required = false, type = SPEDFIELDTYPE.IE)
  private String r07_IE = null;

  /**
   * 08 COD_MUN Código do município, conforme a tabela IBGE N 007* - OC
   */
  @SPEDField(maxLength = 7, minLength = 7, required = false)
  private String r08_COD_MUN = null;

  /**
   * 09 SUFRAMA Número de inscrição do participante na SUFRAMA. C 009* - OC
   */
  @SPEDField(maxLength = 9, minLength = 9, required = false)
  private String r09_SUFRAMA = null;

  /**
   * 10 END Logradouro e endereço do imóvel C 060 - O
   */
  @SPEDField(maxLength = 60)
  private String r10_END = null;

  /**
   * 11 NUM Número do imóvel C 010 - OC
   */
  @SPEDField(maxLength = 10, required = false)
  private String r11_NUM = null;

  /**
   * 12 COMPL Dados complementares do endereço C 060 - OC
   */
  @SPEDField(maxLength = 60, required = false)
  private String r12_COMPL = null;

  /**
   * 13 BAIRRO Bairro em que o imóvel está situado C 060 - OC
   */
  @SPEDField(maxLength = 60)
  private String r13_BAIRRO = null;

  @Override
  public String get01_Register() {
    return "0150";
  }

  /**
   * Recupera o 02 COD_PART Código de identificação do participante no arquivo. C 060 - O.
   *
   * @return the 02 COD_PART Código de identificação do participante no arquivo
   */
  public String getR02_COD_PART() {
    return r02_COD_PART;
  }

  /**
   * Define o 02 COD_PART Código de identificação do participante no arquivo. C 060 - O.
   *
   * @param r02_COD_PART the new 02 COD_PART Código de identificação do participante no arquivo
   */
  public void setR02_COD_PART(String r02_COD_PART) {
    this.r02_COD_PART = r02_COD_PART;
  }

  /**
   * Recupera o 03 NOME Nome pessoal ou empresarial do participante. C 100 - O.
   *
   * @return the 03 NOME Nome pessoal ou empresarial do participante
   */
  public String getR03_NOME() {
    return r03_NOME;
  }

  /**
   * Define o 03 NOME Nome pessoal ou empresarial do participante. C 100 - O.
   *
   * @param r03_NOME the new 03 NOME Nome pessoal ou empresarial do participante
   */
  public void setR03_NOME(String r03_NOME) {
    this.r03_NOME = r03_NOME;
  }

  /**
   * Recupera o 04 COD_PAIS Código do país do participante, conforme a tabela indicada no item 3.2.1 N 005 - O.
   *
   * @return the 04 COD_PAIS Código do país do participante, conforme a tabela indicada no item 3
   */
  public String getR04_COD_PAIS() {
    return r04_COD_PAIS;
  }

  /**
   * Define o 04 COD_PAIS Código do país do participante, conforme a tabela indicada no item 3.2.1 N 005 - O.
   *
   * @param r04_COD_PAIS the new 04 COD_PAIS Código do país do participante, conforme a tabela indicada no item 3
   */
  public void setR04_COD_PAIS(String r04_COD_PAIS) {
    this.r04_COD_PAIS = r04_COD_PAIS;
  }

  /**
   * Recupera o 05 CNPJ CNPJ do participante. N 014* - OC.
   *
   * @return the 05 CNPJ CNPJ do participante
   */
  public String getR05_CNPJ() {
    return r05_CNPJ;
  }

  /**
   * Define o 05 CNPJ CNPJ do participante. N 014* - OC.
   *
   * @param r05_CNPJ the new 05 CNPJ CNPJ do participante
   */
  public void setR05_CNPJ(String r05_CNPJ) {
    this.r05_CNPJ = r05_CNPJ;
  }

  /**
   * Recupera o 06 CPF CPF do participante. N 011* - OC.
   *
   * @return the 06 CPF CPF do participante
   */
  public String getR06_CPF() {
    return r06_CPF;
  }

  /**
   * Define o 06 CPF CPF do participante. N 011* - OC.
   *
   * @param r06_CPF the new 06 CPF CPF do participante
   */
  public void setR06_CPF(String r06_CPF) {
    this.r06_CPF = r06_CPF;
  }

  /**
   * Recupera o 07 IE Inscrição Estadual do participante. C 014 - OC.
   *
   * @return the 07 IE Inscrição Estadual do participante
   */
  public String getR07_IE() {
    return r07_IE;
  }

  /**
   * Define o 07 IE Inscrição Estadual do participante. C 014 - OC.
   *
   * @param r07_IE the new 07 IE Inscrição Estadual do participante
   */
  public void setR07_IE(String r07_IE) {
    this.r07_IE = r07_IE;
  }

  /**
   * Recupera o 08 COD_MUN Código do município, conforme a tabela IBGE N 007* - OC.
   *
   * @return the 08 COD_MUN Código do município, conforme a tabela IBGE N 007* - OC
   */
  public String getR08_COD_MUN() {
    return r08_COD_MUN;
  }

  /**
   * Define o 08 COD_MUN Código do município, conforme a tabela IBGE N 007* - OC.
   *
   * @param r08_COD_MUN the new 08 COD_MUN Código do município, conforme a tabela IBGE N 007* - OC
   */
  public void setR08_COD_MUN(String r08_COD_MUN) {
    this.r08_COD_MUN = r08_COD_MUN;
  }

  /**
   * Recupera o 09 SUFRAMA Número de inscrição do participante na SUFRAMA. C 009* - OC.
   *
   * @return the 09 SUFRAMA Número de inscrição do participante na SUFRAMA
   */
  public String getR09_SUFRAMA() {
    return r09_SUFRAMA;
  }

  /**
   * Define o 09 SUFRAMA Número de inscrição do participante na SUFRAMA. C 009* - OC.
   *
   * @param r09_SUFRAMA the new 09 SUFRAMA Número de inscrição do participante na SUFRAMA
   */
  public void setR09_SUFRAMA(String r09_SUFRAMA) {
    this.r09_SUFRAMA = r09_SUFRAMA;
  }

  /**
   * Recupera o 10 END Logradouro e endereço do imóvel C 060 - O.
   *
   * @return the 10 END Logradouro e endereço do imóvel C 060 - O
   */
  public String getR10_END() {
    return r10_END;
  }

  /**
   * Define o 10 END Logradouro e endereço do imóvel C 060 - O.
   *
   * @param r10_END the new 10 END Logradouro e endereço do imóvel C 060 - O
   */
  public void setR10_END(String r10_END) {
    this.r10_END = r10_END;
  }

  /**
   * Recupera o 11 NUM Número do imóvel C 010 - OC.
   *
   * @return the 11 NUM Número do imóvel C 010 - OC
   */
  public String getR11_NUM() {
    return r11_NUM;
  }

  /**
   * Define o 11 NUM Número do imóvel C 010 - OC.
   *
   * @param r11_NUM the new 11 NUM Número do imóvel C 010 - OC
   */
  public void setR11_NUM(String r11_NUM) {
    this.r11_NUM = r11_NUM;
  }

  /**
   * Recupera o 12 COMPL Dados complementares do endereço C 060 - OC.
   *
   * @return the 12 COMPL Dados complementares do endereço C 060 - OC
   */
  public String getR12_COMPL() {
    return r12_COMPL;
  }

  /**
   * Define o 12 COMPL Dados complementares do endereço C 060 - OC.
   *
   * @param r12_COMPL the new 12 COMPL Dados complementares do endereço C 060 - OC
   */
  public void setR12_COMPL(String r12_COMPL) {
    this.r12_COMPL = r12_COMPL;
  }

  /**
   * Recupera o 13 BAIRRO Bairro em que o imóvel está situado C 060 - OC.
   *
   * @return the 13 BAIRRO Bairro em que o imóvel está situado C 060 - OC
   */
  public String getR13_BAIRRO() {
    return r13_BAIRRO;
  }

  /**
   * Define o 13 BAIRRO Bairro em que o imóvel está situado C 060 - OC.
   *
   * @param r13_BAIRRO the new 13 BAIRRO Bairro em que o imóvel está situado C 060 - OC
   */
  public void setR13_BAIRRO(String r13_BAIRRO) {
    this.r13_BAIRRO = r13_BAIRRO;
  }

}