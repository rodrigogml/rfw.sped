package br.eng.rodrigogml.rfw.sped.structure.contrib;

import java.time.LocalDate;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO 0000: ABERTURA DO ARQUIVO DIGITAL E IDENTIFICAÇÃO DA ENTIDADE.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContrib0000 extends SPEDRegister {

  /**
   * Código da versão do leiaute conforme a tabela 3.1.1. N 003* - S
   */
  @SPEDField(maxLength = 3, minLength = 3, required = true)
  private String r02_COD_VER = null;

  /**
   * Tipo de escrituração: 0 - Original; 1 – Retificadora. N 001* - S
   */
  @SPEDField(maxLength = 1, minLength = 1, required = true)
  private Integer r03_TIPO_ESCRIT = null;

  /**
   * Indicador de situação especial: <br>
   * 0 - Abertura<br>
   * 1 - Cisão<br>
   * 2 - Fusão<br>
   * 3 - Incorporação<br>
   * 4 – Encerramento<br>
   * N 001* - N
   */
  @SPEDField(minLength = 1, maxLength = 1, required = false)
  private String r04_IND_SIT_ESP = null;

  /**
   * Número do Recibo da Escrituração anterior a ser retificada, utilizado quando TIPO_ESCRIT for igual a 1 C 041* - N
   */
  @SPEDField(minLength = 41, maxLength = 41, required = false)
  private String r05_NUM_REC_ANTERIOR = null;

  /**
   * Data inicial das informações contidas no arquivo. N 008* - S
   */
  @SPEDField(minLength = 8, maxLength = 8, required = true)
  private LocalDate r06_DT_INI = null;

  /**
   * Data final das informações contidas no arquivo. N 008* - S
   */
  @SPEDField(minLength = 8, maxLength = 8, required = true)
  private LocalDate r07_DT_FIN = null;

  /**
   * Nome empresarial da pessoa jurídica C 100 - S
   */
  @SPEDField(maxLength = 100, required = true)
  private String r08_NOME = null;

  /**
   * Número de inscrição do estabelecimento matriz da pessoa jurídica no CNPJ. N 014* - S
   */
  @SPEDField(maxLength = 14, minLength = 14, required = true)
  private String r09_CNPJ = null;

  /**
   * Sigla da Unidade da Federação da pessoa jurídica. C 002* - S
   */
  @SPEDField(maxLength = 2, minLength = 2, required = true)
  private String r10_UF = null;

  /**
   * Código do município do domicílio fiscal da pessoa jurídica, conforme a tabela IBGE N 007* - S
   */
  @SPEDField(maxLength = 7, required = true)
  private String r11_COD_MUN = null;

  /**
   * Inscrição da pessoa jurídica na Suframa C 009* - N
   */
  @SPEDField(maxLength = 9, minLength = 9, required = false)
  private String r12_SUFRAMA = null;

  /**
   * <ul>
   * Indicador da natureza da pessoa jurídica:
   * <li>00 – Pessoa jurídica em geral
   * <li>01 – Sociedade cooperativa
   * <li>02 – Entidade sujeita ao PIS/Pasep exclusivamente com base na Folha de Salários
   * </ul>
   * <ul>
   * Indicador da natureza da pessoa jurídica, a partir do ano-calendário de 2014:
   * <li>00 – Pessoa jurídica em geral (não participante de SCP como sócia ostensiva)
   * <li>01 – Sociedade cooperativa (não participante de SCP como sócia ostensiva)
   * <li>02 – Entidade sujeita ao PIS/Pasep exclusivamente com base na Folha de Salários
   * <li>03 - Pessoa jurídica em geral participante de SCP como sócia ostensiva
   * <li>04 – Sociedade cooperativa participante de SCP como sócia ostensiva
   * <li>05 – Sociedade em Conta de Participação - SCP<br>
   * N 002* - N
   */
  @SPEDField(maxLength = 2, minLength = 2, required = false)
  private String r13_IND_NAT_PJ = null;

  /**
   * Indicador de tipo de atividade preponderante:
   * <li>0 – Industrial ou equiparado a industrial;
   * <li>1 – Prestador de serviços;
   * <li>2 - Atividade de comércio;
   * <li>3 – Pessoas jurídicas referidas nos §§ 6º, 8º e 9º do art. 3º da Lei nº 9.718, de 1998;
   * <li>4 – Atividade imobiliária;
   * <li>9 – Outros.<br>
   * N 001 - S
   */
  @SPEDField(maxLength = 1, minLength = 1, required = true)
  private String r14_IND_ATIV = null;

  @Override
  public String get01_Register() {
    return "0000";
  }

  /**
   * Recupera o código da versão do leiaute conforme a tabela 3.1.1. N 003* - S.
   *
   * @return the código da versão do leiaute conforme a tabela 3
   */
  public String getR02_COD_VER() {
    return r02_COD_VER;
  }

  /**
   * Define o código da versão do leiaute conforme a tabela 3.1.1. N 003* - S.
   *
   * @param r02_COD_VER the new código da versão do leiaute conforme a tabela 3
   */
  public void setR02_COD_VER(String r02_COD_VER) {
    this.r02_COD_VER = r02_COD_VER;
  }

  /**
   * Recupera o tipo de escrituração: 0 - Original; 1 – Retificadora. N 001* - S.
   *
   * @return the tipo de escrituração: 0 - Original; 1 – Retificadora
   */
  public Integer getR03_TIPO_ESCRIT() {
    return r03_TIPO_ESCRIT;
  }

  /**
   * Define o tipo de escrituração: 0 - Original; 1 – Retificadora. N 001* - S.
   *
   * @param r03_TIPO_ESCRIT the new tipo de escrituração: 0 - Original; 1 – Retificadora
   */
  public void setR03_TIPO_ESCRIT(Integer r03_TIPO_ESCRIT) {
    this.r03_TIPO_ESCRIT = r03_TIPO_ESCRIT;
  }

  /**
   * Recupera o indicador de situação especial: <br>
   * 0 - Abertura<br>
   * 1 - Cisão<br>
   * 2 - Fusão<br>
   * 3 - Incorporação<br>
   * 4 – Encerramento<br>
   * N 001* - N.
   *
   * @return the indicador de situação especial: <br>
   *         0 - Abertura<br>
   *         1 - Cisão<br>
   *         2 - Fusão<br>
   *         3 - Incorporação<br>
   *         4 – Encerramento<br>
   *         N 001* - N
   */
  public String getR04_IND_SIT_ESP() {
    return r04_IND_SIT_ESP;
  }

  /**
   * Define o indicador de situação especial: <br>
   * 0 - Abertura<br>
   * 1 - Cisão<br>
   * 2 - Fusão<br>
   * 3 - Incorporação<br>
   * 4 – Encerramento<br>
   * N 001* - N.
   *
   * @param r04_IND_SIT_ESP the new indicador de situação especial: <br>
   *          0 - Abertura<br>
   *          1 - Cisão<br>
   *          2 - Fusão<br>
   *          3 - Incorporação<br>
   *          4 – Encerramento<br>
   *          N 001* - N
   */
  public void setR04_IND_SIT_ESP(String r04_IND_SIT_ESP) {
    this.r04_IND_SIT_ESP = r04_IND_SIT_ESP;
  }

  /**
   * Recupera o número do Recibo da Escrituração anterior a ser retificada, utilizado quando TIPO_ESCRIT for igual a 1 C 041* - N.
   *
   * @return the número do Recibo da Escrituração anterior a ser retificada, utilizado quando TIPO_ESCRIT for igual a 1 C 041* - N
   */
  public String getR05_NUM_REC_ANTERIOR() {
    return r05_NUM_REC_ANTERIOR;
  }

  /**
   * Define o número do Recibo da Escrituração anterior a ser retificada, utilizado quando TIPO_ESCRIT for igual a 1 C 041* - N.
   *
   * @param r05_NUM_REC_ANTERIOR the new número do Recibo da Escrituração anterior a ser retificada, utilizado quando TIPO_ESCRIT for igual a 1 C 041* - N
   */
  public void setR05_NUM_REC_ANTERIOR(String r05_NUM_REC_ANTERIOR) {
    this.r05_NUM_REC_ANTERIOR = r05_NUM_REC_ANTERIOR;
  }

  /**
   * Recupera o data inicial das informações contidas no arquivo. N 008* - S.
   *
   * @return the data inicial das informações contidas no arquivo
   */
  public LocalDate getR06_DT_INI() {
    return r06_DT_INI;
  }

  /**
   * Define o data inicial das informações contidas no arquivo. N 008* - S.
   *
   * @param r06_DT_INI the new data inicial das informações contidas no arquivo
   */
  public void setR06_DT_INI(LocalDate r06_DT_INI) {
    this.r06_DT_INI = r06_DT_INI;
  }

  /**
   * Recupera o data final das informações contidas no arquivo. N 008* - S.
   *
   * @return the data final das informações contidas no arquivo
   */
  public LocalDate getR07_DT_FIN() {
    return r07_DT_FIN;
  }

  /**
   * Define o data final das informações contidas no arquivo. N 008* - S.
   *
   * @param r07_DT_FIN the new data final das informações contidas no arquivo
   */
  public void setR07_DT_FIN(LocalDate r07_DT_FIN) {
    this.r07_DT_FIN = r07_DT_FIN;
  }

  /**
   * Recupera o nome empresarial da pessoa jurídica C 100 - S.
   *
   * @return the nome empresarial da pessoa jurídica C 100 - S
   */
  public String getR08_NOME() {
    return r08_NOME;
  }

  /**
   * Define o nome empresarial da pessoa jurídica C 100 - S.
   *
   * @param r08_NOME the new nome empresarial da pessoa jurídica C 100 - S
   */
  public void setR08_NOME(String r08_NOME) {
    this.r08_NOME = r08_NOME;
  }

  /**
   * Recupera o número de inscrição do estabelecimento matriz da pessoa jurídica no CNPJ. N 014* - S.
   *
   * @return the número de inscrição do estabelecimento matriz da pessoa jurídica no CNPJ
   */
  public String getR09_CNPJ() {
    return r09_CNPJ;
  }

  /**
   * Define o número de inscrição do estabelecimento matriz da pessoa jurídica no CNPJ. N 014* - S.
   *
   * @param r09_CNPJ the new número de inscrição do estabelecimento matriz da pessoa jurídica no CNPJ
   */
  public void setR09_CNPJ(String r09_CNPJ) {
    this.r09_CNPJ = r09_CNPJ;
  }

  /**
   * Recupera o sigla da Unidade da Federação da pessoa jurídica. C 002* - S.
   *
   * @return the sigla da Unidade da Federação da pessoa jurídica
   */
  public String getR10_UF() {
    return r10_UF;
  }

  /**
   * Define o sigla da Unidade da Federação da pessoa jurídica. C 002* - S.
   *
   * @param r10_UF the new sigla da Unidade da Federação da pessoa jurídica
   */
  public void setR10_UF(String r10_UF) {
    this.r10_UF = r10_UF;
  }

  /**
   * Recupera o código do município do domicílio fiscal da pessoa jurídica, conforme a tabela IBGE N 007* - S.
   *
   * @return the código do município do domicílio fiscal da pessoa jurídica, conforme a tabela IBGE N 007* - S
   */
  public String getR11_COD_MUN() {
    return r11_COD_MUN;
  }

  /**
   * Define o código do município do domicílio fiscal da pessoa jurídica, conforme a tabela IBGE N 007* - S.
   *
   * @param r11_COD_MUN the new código do município do domicílio fiscal da pessoa jurídica, conforme a tabela IBGE N 007* - S
   */
  public void setR11_COD_MUN(String r11_COD_MUN) {
    this.r11_COD_MUN = r11_COD_MUN;
  }

  /**
   * Recupera o inscrição da pessoa jurídica na Suframa C 009* - N.
   *
   * @return the inscrição da pessoa jurídica na Suframa C 009* - N
   */
  public String getR12_SUFRAMA() {
    return r12_SUFRAMA;
  }

  /**
   * Define o inscrição da pessoa jurídica na Suframa C 009* - N.
   *
   * @param r12_SUFRAMA the new inscrição da pessoa jurídica na Suframa C 009* - N
   */
  public void setR12_SUFRAMA(String r12_SUFRAMA) {
    this.r12_SUFRAMA = r12_SUFRAMA;
  }

  /**
   * Recupera o
   * <ul>
   * Indicador da natureza da pessoa jurídica:
   * <li>00 – Pessoa jurídica em geral
   * <li>01 – Sociedade cooperativa
   * <li>02 – Entidade sujeita ao PIS/Pasep exclusivamente com base na Folha de Salários
   * </ul>
   * <ul>
   * Indicador da natureza da pessoa jurídica, a partir do ano-calendário de 2014:
   * <li>00 – Pessoa jurídica em geral (não participante de SCP como sócia ostensiva)
   * <li>01 – Sociedade cooperativa (não participante de SCP como sócia ostensiva)
   * <li>02 – Entidade sujeita ao PIS/Pasep exclusivamente com base na Folha de Salários
   * <li>03 - Pessoa jurídica em geral participante de SCP como sócia ostensiva
   * <li>04 – Sociedade cooperativa participante de SCP como sócia ostensiva
   * <li>05 – Sociedade em Conta de Participação - SCP<br>
   * N 002* - N.
   *
   * @return the
   *         <ul>
   *         Indicador da natureza da pessoa jurídica:
   *         <li>00 – Pessoa jurídica em geral
   *         <li>01 – Sociedade cooperativa
   *         <li>02 – Entidade sujeita ao PIS/Pasep exclusivamente com base na Folha de Salários
   *         </ul>
   *         <ul>
   *         Indicador da natureza da pessoa jurídica, a partir do ano-calendário de 2014:
   *         <li>00 – Pessoa jurídica em geral (não participante de SCP como sócia ostensiva)
   *         <li>01 – Sociedade cooperativa (não participante de SCP como sócia ostensiva)
   *         <li>02 – Entidade sujeita ao PIS/Pasep exclusivamente com base na Folha de Salários
   *         <li>03 - Pessoa jurídica em geral participante de SCP como sócia ostensiva
   *         <li>04 – Sociedade cooperativa participante de SCP como sócia ostensiva
   *         <li>05 – Sociedade em Conta de Participação - SCP<br>
   *         N 002* - N
   */
  public String getR13_IND_NAT_PJ() {
    return r13_IND_NAT_PJ;
  }

  /**
   * Define o
   * <ul>
   * Indicador da natureza da pessoa jurídica:
   * <li>00 – Pessoa jurídica em geral
   * <li>01 – Sociedade cooperativa
   * <li>02 – Entidade sujeita ao PIS/Pasep exclusivamente com base na Folha de Salários
   * </ul>
   * <ul>
   * Indicador da natureza da pessoa jurídica, a partir do ano-calendário de 2014:
   * <li>00 – Pessoa jurídica em geral (não participante de SCP como sócia ostensiva)
   * <li>01 – Sociedade cooperativa (não participante de SCP como sócia ostensiva)
   * <li>02 – Entidade sujeita ao PIS/Pasep exclusivamente com base na Folha de Salários
   * <li>03 - Pessoa jurídica em geral participante de SCP como sócia ostensiva
   * <li>04 – Sociedade cooperativa participante de SCP como sócia ostensiva
   * <li>05 – Sociedade em Conta de Participação - SCP<br>
   * N 002* - N.
   *
   * @param r13_IND_NAT_PJ the new
   *          <ul>
   *          Indicador da natureza da pessoa jurídica:
   *          <li>00 – Pessoa jurídica em geral
   *          <li>01 – Sociedade cooperativa
   *          <li>02 – Entidade sujeita ao PIS/Pasep exclusivamente com base na Folha de Salários
   *          </ul>
   *          <ul>
   *          Indicador da natureza da pessoa jurídica, a partir do ano-calendário de 2014:
   *          <li>00 – Pessoa jurídica em geral (não participante de SCP como sócia ostensiva)
   *          <li>01 – Sociedade cooperativa (não participante de SCP como sócia ostensiva)
   *          <li>02 – Entidade sujeita ao PIS/Pasep exclusivamente com base na Folha de Salários
   *          <li>03 - Pessoa jurídica em geral participante de SCP como sócia ostensiva
   *          <li>04 – Sociedade cooperativa participante de SCP como sócia ostensiva
   *          <li>05 – Sociedade em Conta de Participação - SCP<br>
   *          N 002* - N
   */
  public void setR13_IND_NAT_PJ(String r13_IND_NAT_PJ) {
    this.r13_IND_NAT_PJ = r13_IND_NAT_PJ;
  }

  /**
   * Recupera o indicador de tipo de atividade preponderante:
   * <li>0 – Industrial ou equiparado a industrial;
   * <li>1 – Prestador de serviços;
   * <li>2 - Atividade de comércio;
   * <li>3 – Pessoas jurídicas referidas nos §§ 6º, 8º e 9º do art. 3º da Lei nº 9.718, de 1998;
   * <li>4 – Atividade imobiliária;
   * <li>9 – Outros.<br>
   * N 001 - S.
   *
   * @return the indicador de tipo de atividade preponderante:
   *         <li>0 – Industrial ou equiparado a industrial;
   *         <li>1 – Prestador de serviços;
   *         <li>2 - Atividade de comércio;
   *         <li>3 – Pessoas jurídicas referidas nos §§ 6º, 8º e 9º do art
   */
  public String getR14_IND_ATIV() {
    return r14_IND_ATIV;
  }

  /**
   * Define o indicador de tipo de atividade preponderante:
   * <li>0 – Industrial ou equiparado a industrial;
   * <li>1 – Prestador de serviços;
   * <li>2 - Atividade de comércio;
   * <li>3 – Pessoas jurídicas referidas nos §§ 6º, 8º e 9º do art. 3º da Lei nº 9.718, de 1998;
   * <li>4 – Atividade imobiliária;
   * <li>9 – Outros.<br>
   * N 001 - S.
   *
   * @param r14_IND_ATIV the new indicador de tipo de atividade preponderante:
   *          <li>0 – Industrial ou equiparado a industrial;
   *          <li>1 – Prestador de serviços;
   *          <li>2 - Atividade de comércio;
   *          <li>3 – Pessoas jurídicas referidas nos §§ 6º, 8º e 9º do art
   */
  public void setR14_IND_ATIV(String r14_IND_ATIV) {
    this.r14_IND_ATIV = r14_IND_ATIV;
  }

}