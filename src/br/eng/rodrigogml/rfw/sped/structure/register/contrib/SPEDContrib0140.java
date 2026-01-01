package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO 0140: TABELA DE CADASTRO DE ESTABELECIMENTO.<br>
 *
 * @author Rodrigo GML
 * @since 10.0.0 (25 de jul. de 2023)
 * @version 10.0.0 - Rodrigo GML-(...)
 */
public class SPEDContrib0140 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  public SPEDContrib0140(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * REGISTRO 0150: TABELA DE CADASTRO DO PARTICIPANTE<br>
   * Chave: CNPJ ou CPF dependendo do tipo do participante.
   */
  private final LinkedHashMap<String, SPEDContrib0150> r0150 = new LinkedHashMap<String, SPEDContrib0150>();

  /**
   * REGISTRO 0190: IDENTIFICAÇÃO DAS UNIDADES DE MEDIDA<br>
   * Chave da Hash: Unidade (campo 02 do registro)
   */
  private final LinkedHashMap<String, SPEDContrib0190> r0190 = new LinkedHashMap<String, SPEDContrib0190>();

  /**
   * REGISTRO 0200: TABELA DE IDENTIFICAÇÃO DO ITEM (PRODUTO E SERVIÇOS)<br>
   * Chave: COD_ITEM. - O Código do Item é o ID do objeto ItemVO. Não utilizaremos os códigos dos produtos, mas sim converteremos tudo para a unidade de medida padrão do Item.
   */
  private final LinkedHashMap<String, SPEDContrib0200> r0200 = new LinkedHashMap<String, SPEDContrib0200>();

  /**
   * REGISTRO 0400: TABELA DE NATUREZA DA OPERAÇÃO/PRESTAÇÃO
   */
  private final LinkedHashMap<String, SPEDContrib0400> r0400 = new LinkedHashMap<String, SPEDContrib0400>();

  /**
   * REGISTRO 0145: REGIME DE APURAÇÃO DA CONTRIBUIÇÃO PREVIDENCIÁRIA SOBRE RECEITA BRUTA
   */
  private SPEDContrib0145 r0145 = null;

  /**
   * Código de identificação do estabelecimento C 060 - N
   */
  @SPEDField(maxLength = 2, required = false)
  private String r02_COD_EST = null;
  /**
   * Nome empresarial do estabelecimento C 100 - S
   */
  @SPEDField(maxLength = 100, required = true)
  private String r03_NOME = null;

  /**
   * Número de inscrição do estabelecimento no CNPJ. N 014* - S
   */
  @SPEDField(maxLength = 14, minLength = 14, required = true)
  private String r04_CNPJ = null;

  /**
   * Sigla da unidade da federação do estabelecimento. C 002* - S
   */
  @SPEDField(maxLength = 2, minLength = 2, required = true)
  private String r05_UF = null;

  /**
   * Inscrição Estadual do estabelecimento, se contribuinte de ICMS. C 014 - N
   */
  @SPEDField(maxLength = 14, required = false)
  private String r06_IE = null;

  /**
   * Código do município do domicílio fiscal do estabelecimento, conforme a tabela IBGE N 007* - S
   */
  @SPEDField(maxLength = 7, minLength = 7, required = true)
  private String r07_COD_MUN = null;

  /**
   * Inscrição Municipal do estabelecimento, se contribuinte do ISS. C - - N
   */
  @SPEDField(maxLength = 20, required = false)
  private String r08_IM = null;

  /**
   * Inscrição do estabelecimento na Suframa C 009* - N
   */
  @SPEDField(maxLength = 9, minLength = 9, required = false)
  private String r09_SUFRAMA = null;

  @Override
  public String get01_Register() {
    return "0140";
  }

  /**
   * Recupera o código de identificação do estabelecimento C 060 - N.
   *
   * @return the código de identificação do estabelecimento C 060 - N
   */
  public String getR02_COD_EST() {
    return r02_COD_EST;
  }

  /**
   * Define o código de identificação do estabelecimento C 060 - N.
   *
   * @param r02_COD_EST the new código de identificação do estabelecimento C 060 - N
   */
  public void setR02_COD_EST(String r02_COD_EST) {
    this.r02_COD_EST = r02_COD_EST;
  }

  /**
   * Recupera o nome empresarial do estabelecimento C 100 - S.
   *
   * @return the nome empresarial do estabelecimento C 100 - S
   */
  public String getR03_NOME() {
    return r03_NOME;
  }

  /**
   * Define o nome empresarial do estabelecimento C 100 - S.
   *
   * @param r03_NOME the new nome empresarial do estabelecimento C 100 - S
   */
  public void setR03_NOME(String r03_NOME) {
    this.r03_NOME = r03_NOME;
  }

  /**
   * Recupera o número de inscrição do estabelecimento no CNPJ. N 014* - S.
   *
   * @return the número de inscrição do estabelecimento no CNPJ
   */
  public String getR04_CNPJ() {
    return r04_CNPJ;
  }

  /**
   * Define o número de inscrição do estabelecimento no CNPJ. N 014* - S.
   *
   * @param r04_CNPJ the new número de inscrição do estabelecimento no CNPJ
   */
  public void setR04_CNPJ(String r04_CNPJ) {
    this.r04_CNPJ = r04_CNPJ;
  }

  /**
   * Recupera o sigla da unidade da federação do estabelecimento. C 002* - S.
   *
   * @return the sigla da unidade da federação do estabelecimento
   */
  public String getR05_UF() {
    return r05_UF;
  }

  /**
   * Define o sigla da unidade da federação do estabelecimento. C 002* - S.
   *
   * @param r05_UF the new sigla da unidade da federação do estabelecimento
   */
  public void setR05_UF(String r05_UF) {
    this.r05_UF = r05_UF;
  }

  /**
   * Recupera o inscrição Estadual do estabelecimento, se contribuinte de ICMS. C 014 - N.
   *
   * @return the inscrição Estadual do estabelecimento, se contribuinte de ICMS
   */
  public String getR06_IE() {
    return r06_IE;
  }

  /**
   * Define o inscrição Estadual do estabelecimento, se contribuinte de ICMS. C 014 - N.
   *
   * @param r06_IE the new inscrição Estadual do estabelecimento, se contribuinte de ICMS
   */
  public void setR06_IE(String r06_IE) {
    this.r06_IE = r06_IE;
  }

  /**
   * Recupera o código do município do domicílio fiscal do estabelecimento, conforme a tabela IBGE N 007* - S.
   *
   * @return the código do município do domicílio fiscal do estabelecimento, conforme a tabela IBGE N 007* - S
   */
  public String getR07_COD_MUN() {
    return r07_COD_MUN;
  }

  /**
   * Define o código do município do domicílio fiscal do estabelecimento, conforme a tabela IBGE N 007* - S.
   *
   * @param r07_COD_MUN the new código do município do domicílio fiscal do estabelecimento, conforme a tabela IBGE N 007* - S
   */
  public void setR07_COD_MUN(String r07_COD_MUN) {
    this.r07_COD_MUN = r07_COD_MUN;
  }

  /**
   * Recupera o inscrição Municipal do estabelecimento, se contribuinte do ISS. C - - N.
   *
   * @return the inscrição Municipal do estabelecimento, se contribuinte do ISS
   */
  public String getR08_IM() {
    return r08_IM;
  }

  /**
   * Define o inscrição Municipal do estabelecimento, se contribuinte do ISS. C - - N.
   *
   * @param r08_IM the new inscrição Municipal do estabelecimento, se contribuinte do ISS
   */
  public void setR08_IM(String r08_IM) {
    this.r08_IM = r08_IM;
  }

  /**
   * Recupera o inscrição do estabelecimento na Suframa C 009* - N.
   *
   * @return the inscrição do estabelecimento na Suframa C 009* - N
   */
  public String getR09_SUFRAMA() {
    return r09_SUFRAMA;
  }

  /**
   * Define o inscrição do estabelecimento na Suframa C 009* - N.
   *
   * @param r09_SUFRAMA the new inscrição do estabelecimento na Suframa C 009* - N
   */
  public void setR09_SUFRAMA(String r09_SUFRAMA) {
    this.r09_SUFRAMA = r09_SUFRAMA;
  }

  /**
   * Recupera o rEGISTRO 0150: TABELA DE CADASTRO DO PARTICIPANTE<br>
   * Chave: CNPJ ou CPF dependendo do tipo do participante.
   *
   * @return the rEGISTRO 0150: TABELA DE CADASTRO DO PARTICIPANTE<br>
   *         Chave: CNPJ ou CPF dependendo do tipo do participante
   */
  public LinkedHashMap<String, SPEDContrib0150> getR0150() {
    return r0150;
  }

  /**
   * Recupera o rEGISTRO 0190: IDENTIFICAÇÃO DAS UNIDADES DE MEDIDA<br>
   * Chave da Hash: Unidade (campo 02 do registro).
   *
   * @return the rEGISTRO 0190: IDENTIFICAÇÃO DAS UNIDADES DE MEDIDA<br>
   *         Chave da Hash: Unidade (campo 02 do registro)
   */
  public LinkedHashMap<String, SPEDContrib0190> getR0190() {
    return r0190;
  }

  /**
   * Recupera o rEGISTRO 0200: TABELA DE IDENTIFICAÇÃO DO ITEM (PRODUTO E SERVIÇOS)<br>
   * Chave: COD_ITEM. - O Código do Item é o ID do objeto ItemVO. Não utilizaremos os códigos dos produtos, mas sim converteremos tudo para a unidade de medida padrão do Item.
   *
   * @return the rEGISTRO 0200: TABELA DE IDENTIFICAÇÃO DO ITEM (PRODUTO E SERVIÇOS)<br>
   *         Chave: COD_ITEM
   */
  public LinkedHashMap<String, SPEDContrib0200> getR0200() {
    return r0200;
  }

  /**
   * Recupera o rEGISTRO 0400: TABELA DE NATUREZA DA OPERAÇÃO/PRESTAÇÃO.
   *
   * @return the rEGISTRO 0400: TABELA DE NATUREZA DA OPERAÇÃO/PRESTAÇÃO
   */
  public LinkedHashMap<String, SPEDContrib0400> getR0400() {
    return r0400;
  }

  /**
   * Recupera o rEGISTRO 0145: REGIME DE APURAÇÃO DA CONTRIBUIÇÃO PREVIDENCIÁRIA SOBRE RECEITA BRUTA.
   *
   * @return the rEGISTRO 0145: REGIME DE APURAÇÃO DA CONTRIBUIÇÃO PREVIDENCIÁRIA SOBRE RECEITA BRUTA
   */
  public SPEDContrib0145 getR0145() {
    return r0145;
  }

  /**
   * Define o rEGISTRO 0145: REGIME DE APURAÇÃO DA CONTRIBUIÇÃO PREVIDENCIÁRIA SOBRE RECEITA BRUTA.
   *
   * @param r0145 the new rEGISTRO 0145: REGIME DE APURAÇÃO DA CONTRIBUIÇÃO PREVIDENCIÁRIA SOBRE RECEITA BRUTA
   */
  public void setR0145(SPEDContrib0145 r0145) {
    this.r0145 = r0145;
  }

}