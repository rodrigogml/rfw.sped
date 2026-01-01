package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO 0005: DADOS COMPLEMENTARES DA ENTIDADE.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscal0005 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscal0005(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 FANTASIA Nome de fantasia associado ao nome empresarial. C 060 - O
   */
  @SPEDField(maxLength = 60)
  private String r02_FANTASIA = null;

  /**
   * 03 CEP Código de Endereçamento Postal. N 008* - O
   */
  @SPEDField(maxLength = 8, minLength = 8)
  private String r03_CEP = null;

  /**
   * 04 END Logradouro e endereço do imóvel. C 060 - O
   */
  @SPEDField(maxLength = 60)
  private String r04_END = null;

  /**
   * 05 NUM Número do imóvel. C 010 - OC
   */
  @SPEDField(maxLength = 10, required = false)
  private String r05_NUM = null;

  /**
   * 06 COMPL Dados complementares do endereço. C 060 - OC
   */
  @SPEDField(maxLength = 60, required = false)
  private String r06_COMPL = null;

  /**
   * 07 BAIRRO Bairro em que o imóvel está situado. C 060 - O
   */
  @SPEDField(maxLength = 60)
  private String r07_BAIRRO = null;

  /**
   * 08 FONE Número do telefone (DDD+FONE). C 11 - OC
   */
  @SPEDField(maxLength = 11, required = false)
  private String r08_FONE = null;

  /**
   * 09 FAX Número do fax. C 11 - OC
   */
  @SPEDField(maxLength = 11, required = false)
  private String r09_FAX = null;

  /**
   * 10 EMAIL Endereço do correio eletrônico. C - - OC
   */
  @SPEDField(maxLength = 255, required = false)
  private String r10_EMAIL = null;

  @Override
  public String get01_Register() {
    return "0005";
  }

  /**
   * Recupera o 02 FANTASIA Nome de fantasia associado ao nome empresarial. C 060 - O.
   *
   * @return the 02 FANTASIA Nome de fantasia associado ao nome empresarial
   */
  public String getR02_FANTASIA() {
    return r02_FANTASIA;
  }

  /**
   * Define o 02 FANTASIA Nome de fantasia associado ao nome empresarial. C 060 - O.
   *
   * @param r02_FANTASIA the new 02 FANTASIA Nome de fantasia associado ao nome empresarial
   */
  public void setR02_FANTASIA(String r02_FANTASIA) {
    this.r02_FANTASIA = r02_FANTASIA;
  }

  /**
   * Recupera o 03 CEP Código de Endereçamento Postal. N 008* - O.
   *
   * @return the 03 CEP Código de Endereçamento Postal
   */
  public String getR03_CEP() {
    return r03_CEP;
  }

  /**
   * Define o 03 CEP Código de Endereçamento Postal. N 008* - O.
   *
   * @param r03_CEP the new 03 CEP Código de Endereçamento Postal
   */
  public void setR03_CEP(String r03_CEP) {
    this.r03_CEP = r03_CEP;
  }

  /**
   * Recupera o 04 END Logradouro e endereço do imóvel. C 060 - O.
   *
   * @return the 04 END Logradouro e endereço do imóvel
   */
  public String getR04_END() {
    return r04_END;
  }

  /**
   * Define o 04 END Logradouro e endereço do imóvel. C 060 - O.
   *
   * @param r04_END the new 04 END Logradouro e endereço do imóvel
   */
  public void setR04_END(String r04_END) {
    this.r04_END = r04_END;
  }

  /**
   * Recupera o 05 NUM Número do imóvel. C 010 - OC.
   *
   * @return the 05 NUM Número do imóvel
   */
  public String getR05_NUM() {
    return r05_NUM;
  }

  /**
   * Define o 05 NUM Número do imóvel. C 010 - OC.
   *
   * @param r05_NUM the new 05 NUM Número do imóvel
   */
  public void setR05_NUM(String r05_NUM) {
    this.r05_NUM = r05_NUM;
  }

  /**
   * Recupera o 06 COMPL Dados complementares do endereço. C 060 - OC.
   *
   * @return the 06 COMPL Dados complementares do endereço
   */
  public String getR06_COMPL() {
    return r06_COMPL;
  }

  /**
   * Define o 06 COMPL Dados complementares do endereço. C 060 - OC.
   *
   * @param r06_COMPL the new 06 COMPL Dados complementares do endereço
   */
  public void setR06_COMPL(String r06_COMPL) {
    this.r06_COMPL = r06_COMPL;
  }

  /**
   * Recupera o 07 BAIRRO Bairro em que o imóvel está situado. C 060 - O.
   *
   * @return the 07 BAIRRO Bairro em que o imóvel está situado
   */
  public String getR07_BAIRRO() {
    return r07_BAIRRO;
  }

  /**
   * Define o 07 BAIRRO Bairro em que o imóvel está situado. C 060 - O.
   *
   * @param r07_BAIRRO the new 07 BAIRRO Bairro em que o imóvel está situado
   */
  public void setR07_BAIRRO(String r07_BAIRRO) {
    this.r07_BAIRRO = r07_BAIRRO;
  }

  /**
   * Recupera o 08 FONE Número do telefone (DDD+FONE). C 11 - OC.
   *
   * @return the 08 FONE Número do telefone (DDD+FONE)
   */
  public String getR08_FONE() {
    return r08_FONE;
  }

  /**
   * Define o 08 FONE Número do telefone (DDD+FONE). C 11 - OC.
   *
   * @param r08_FONE the new 08 FONE Número do telefone (DDD+FONE)
   */
  public void setR08_FONE(String r08_FONE) {
    this.r08_FONE = r08_FONE;
  }

  /**
   * Recupera o 09 FAX Número do fax. C 11 - OC.
   *
   * @return the 09 FAX Número do fax
   */
  public String getR09_FAX() {
    return r09_FAX;
  }

  /**
   * Define o 09 FAX Número do fax. C 11 - OC.
   *
   * @param r09_FAX the new 09 FAX Número do fax
   */
  public void setR09_FAX(String r09_FAX) {
    this.r09_FAX = r09_FAX;
  }

  /**
   * Recupera o 10 EMAIL Endereço do correio eletrônico. C - - OC.
   *
   * @return the 10 EMAIL Endereço do correio eletrônico
   */
  public String getR10_EMAIL() {
    return r10_EMAIL;
  }

  /**
   * Define o 10 EMAIL Endereço do correio eletrônico. C - - OC.
   *
   * @param r10_EMAIL the new 10 EMAIL Endereço do correio eletrônico
   */
  public void setR10_EMAIL(String r10_EMAIL) {
    this.r10_EMAIL = r10_EMAIL;
  }

}