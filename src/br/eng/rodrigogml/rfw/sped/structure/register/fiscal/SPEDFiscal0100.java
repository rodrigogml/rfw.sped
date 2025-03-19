package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField.SPEDFIELDTYPE;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO 0100: DADOS DO CONTABILISTA.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscal0100 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscal0100(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 NOME Nome do contabilista. C 100 - O
   */
  @SPEDField(maxLength = 100)
  private String r02_NOME = null;

  /**
   * 03 CPF Número de inscrição do contabilista no CPF. N 011* - O
   */
  @SPEDField(maxLength = 11, minLength = 11, type = SPEDFIELDTYPE.CPF)
  private String r03_CPF = null;

  /**
   * 04 CRC Número de inscrição do contabilista no Conselho Regional de Contabilidade. C 015 - O
   */
  @SPEDField(maxLength = 015)
  private String r04_CRC = null;

  /**
   * 05 CNPJ Número de inscrição do escritório de contabilidade no CNPJ, se houver. N 014* - OC
   *
   */
  @SPEDField(maxLength = 14, minLength = 14, type = SPEDFIELDTYPE.CNPJ, required = false)
  private String r05_CNPJ = null;

  /**
   * 06 CEP Código de Endereçamento Postal. N 008* - OC
   */
  @SPEDField(maxLength = 8, minLength = 8, required = false)
  private String r06_CEP = null;

  /**
   * 07 END Logradouro e endereço do imóvel. C 060 - OC
   */
  @SPEDField(maxLength = 60, required = false)
  private String r07_END = null;

  /**
   * 08 NUM Número do imóvel. C 010 - OC
   */
  @SPEDField(maxLength = 10, required = false)
  private String r08_NUM = null;

  /**
   * 09 COMPL Dados complementares do endereço. C 060 - OC
   */
  @SPEDField(maxLength = 60, required = false)
  private String r09_COMPL = null;

  /**
   * 10 BAIRRO Bairro em que o imóvel está situado. C 060 - OC
   */
  @SPEDField(maxLength = 60, required = false)
  private String r10_BAIRRO = null;

  /**
   * 11 FONE Número do telefone (DDD+FONE). C 11 - OC
   */
  @SPEDField(maxLength = 11, required = false)
  private String r11_FONE = null;

  /**
   * 12 FAX Número do fax. C 11 - OC
   */
  @SPEDField(maxLength = 11, required = false)
  private String r12_FAX = null;

  /**
   * 13 EMAIL Endereço do correio eletrônico. C - - O
   */
  @SPEDField(maxLength = 255, type = SPEDFIELDTYPE.EMAIL)
  private String r13_EMAIL = null;

  /**
   * 14 COD_MUN Código do município, conforme tabela IBGE. N 007* - OC
   */
  @SPEDField(maxLength = 7, minLength = 7, required = true)
  private String r14_COD_MUN = null;

  @Override
  public String get01_Register() {
    return "0100";
  }

  /**
   * Recupera o 02 NOME Nome do contabilista. C 100 - O.
   *
   * @return the 02 NOME Nome do contabilista
   */
  public String getR02_NOME() {
    return r02_NOME;
  }

  /**
   * Define o 02 NOME Nome do contabilista. C 100 - O.
   *
   * @param r02_NOME the new 02 NOME Nome do contabilista
   */
  public void setR02_NOME(String r02_NOME) {
    this.r02_NOME = r02_NOME;
  }

  /**
   * Recupera o 03 CPF Número de inscrição do contabilista no CPF. N 011* - O.
   *
   * @return the 03 CPF Número de inscrição do contabilista no CPF
   */
  public String getR03_CPF() {
    return r03_CPF;
  }

  /**
   * Define o 03 CPF Número de inscrição do contabilista no CPF. N 011* - O.
   *
   * @param r03_CPF the new 03 CPF Número de inscrição do contabilista no CPF
   */
  public void setR03_CPF(String r03_CPF) {
    this.r03_CPF = r03_CPF;
  }

  /**
   * Recupera o 04 CRC Número de inscrição do contabilista no Conselho Regional de Contabilidade. C 015 - O.
   *
   * @return the 04 CRC Número de inscrição do contabilista no Conselho Regional de Contabilidade
   */
  public String getR04_CRC() {
    return r04_CRC;
  }

  /**
   * Define o 04 CRC Número de inscrição do contabilista no Conselho Regional de Contabilidade. C 015 - O.
   *
   * @param r04_CRC the new 04 CRC Número de inscrição do contabilista no Conselho Regional de Contabilidade
   */
  public void setR04_CRC(String r04_CRC) {
    this.r04_CRC = r04_CRC;
  }

  /**
   * Recupera o 05 CNPJ Número de inscrição do escritório de contabilidade no CNPJ, se houver. N 014* - OC.
   *
   * @return the 05 CNPJ Número de inscrição do escritório de contabilidade no CNPJ, se houver
   */
  public String getR05_CNPJ() {
    return r05_CNPJ;
  }

  /**
   * Define o 05 CNPJ Número de inscrição do escritório de contabilidade no CNPJ, se houver. N 014* - OC.
   *
   * @param r05_CNPJ the new 05 CNPJ Número de inscrição do escritório de contabilidade no CNPJ, se houver
   */
  public void setR05_CNPJ(String r05_CNPJ) {
    this.r05_CNPJ = r05_CNPJ;
  }

  /**
   * Recupera o 06 CEP Código de Endereçamento Postal. N 008* - OC.
   *
   * @return the 06 CEP Código de Endereçamento Postal
   */
  public String getR06_CEP() {
    return r06_CEP;
  }

  /**
   * Define o 06 CEP Código de Endereçamento Postal. N 008* - OC.
   *
   * @param r06_CEP the new 06 CEP Código de Endereçamento Postal
   */
  public void setR06_CEP(String r06_CEP) {
    this.r06_CEP = r06_CEP;
  }

  /**
   * Recupera o 07 END Logradouro e endereço do imóvel. C 060 - OC.
   *
   * @return the 07 END Logradouro e endereço do imóvel
   */
  public String getR07_END() {
    return r07_END;
  }

  /**
   * Define o 07 END Logradouro e endereço do imóvel. C 060 - OC.
   *
   * @param r07_END the new 07 END Logradouro e endereço do imóvel
   */
  public void setR07_END(String r07_END) {
    this.r07_END = r07_END;
  }

  /**
   * Recupera o 08 NUM Número do imóvel. C 010 - OC.
   *
   * @return the 08 NUM Número do imóvel
   */
  public String getR08_NUM() {
    return r08_NUM;
  }

  /**
   * Define o 08 NUM Número do imóvel. C 010 - OC.
   *
   * @param r08_NUM the new 08 NUM Número do imóvel
   */
  public void setR08_NUM(String r08_NUM) {
    this.r08_NUM = r08_NUM;
  }

  /**
   * Recupera o 09 COMPL Dados complementares do endereço. C 060 - OC.
   *
   * @return the 09 COMPL Dados complementares do endereço
   */
  public String getR09_COMPL() {
    return r09_COMPL;
  }

  /**
   * Define o 09 COMPL Dados complementares do endereço. C 060 - OC.
   *
   * @param r09_COMPL the new 09 COMPL Dados complementares do endereço
   */
  public void setR09_COMPL(String r09_COMPL) {
    this.r09_COMPL = r09_COMPL;
  }

  /**
   * Recupera o 10 BAIRRO Bairro em que o imóvel está situado. C 060 - OC.
   *
   * @return the 10 BAIRRO Bairro em que o imóvel está situado
   */
  public String getR10_BAIRRO() {
    return r10_BAIRRO;
  }

  /**
   * Define o 10 BAIRRO Bairro em que o imóvel está situado. C 060 - OC.
   *
   * @param r10_BAIRRO the new 10 BAIRRO Bairro em que o imóvel está situado
   */
  public void setR10_BAIRRO(String r10_BAIRRO) {
    this.r10_BAIRRO = r10_BAIRRO;
  }

  /**
   * Recupera o 11 FONE Número do telefone (DDD+FONE). C 11 - OC.
   *
   * @return the 11 FONE Número do telefone (DDD+FONE)
   */
  public String getR11_FONE() {
    return r11_FONE;
  }

  /**
   * Define o 11 FONE Número do telefone (DDD+FONE). C 11 - OC.
   *
   * @param r11_FONE the new 11 FONE Número do telefone (DDD+FONE)
   */
  public void setR11_FONE(String r11_FONE) {
    this.r11_FONE = r11_FONE;
  }

  /**
   * Recupera o 12 FAX Número do fax. C 11 - OC.
   *
   * @return the 12 FAX Número do fax
   */
  public String getR12_FAX() {
    return r12_FAX;
  }

  /**
   * Define o 12 FAX Número do fax. C 11 - OC.
   *
   * @param r12_FAX the new 12 FAX Número do fax
   */
  public void setR12_FAX(String r12_FAX) {
    this.r12_FAX = r12_FAX;
  }

  /**
   * Recupera o 13 EMAIL Endereço do correio eletrônico. C - - O.
   *
   * @return the 13 EMAIL Endereço do correio eletrônico
   */
  public String getR13_EMAIL() {
    return r13_EMAIL;
  }

  /**
   * Define o 13 EMAIL Endereço do correio eletrônico. C - - O.
   *
   * @param r13_EMAIL the new 13 EMAIL Endereço do correio eletrônico
   */
  public void setR13_EMAIL(String r13_EMAIL) {
    this.r13_EMAIL = r13_EMAIL;
  }

  /**
   * Recupera o 14 COD_MUN Código do município, conforme tabela IBGE. N 007* - OC.
   *
   * @return the 14 COD_MUN Código do município, conforme tabela IBGE
   */
  public String getR14_COD_MUN() {
    return r14_COD_MUN;
  }

  /**
   * Define o 14 COD_MUN Código do município, conforme tabela IBGE. N 007* - OC.
   *
   * @param r14_COD_MUN the new 14 COD_MUN Código do município, conforme tabela IBGE
   */
  public void setR14_COD_MUN(String r14_COD_MUN) {
    this.r14_COD_MUN = r14_COD_MUN;
  }

}