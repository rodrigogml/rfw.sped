package br.eng.rodrigogml.rfw.sped.structure.fiscal;

import java.time.LocalDate;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField.SPEDFIELDTYPE;

/**
 * Description: REGISTRO 0000: ABERTURA DO ARQUIVO DIGITAL E IDENTIFICAÇÃO DA ENTIDADE
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscal0000 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  /**
   * 02 COD_VER Código da versão do leiaute conforme a tabela indicada no Ato COTEPE. N 003* - O<br>
   * Tabela:<br>
   * cod|ver.|data ini |data final|<br>
   * 002|1.01|01 01 2009|31 12 2009<Br>
   * 003|1.02|01 01 2010|31 12 2010<Br>
   * 004|1.03|01 01 2011|31 12 2011<Br>
   * 005|1.04|01 01 2012|30 06 2012<Br>
   * 006|1.05|01 07 2012|31 12 2012<Br>
   * 007|1.06|01 01 2013|31 12 2013<Br>
   * 008|1.07|01 01 2014|31 12 2014<Br>
   * 009|1.08|01 01 2015|31 12 2015<Br>
   * 010|1.09|01 01 2016|31 12 2016<Br>
   * 011|1.10|01 01 2017|31 12 2017<Br>
   * 012|1.11|01 01 2018|
   */
  @SPEDField(maxLength = 3, minLength = 3)
  private String r02_COD_VER = null;

  /**
   * 03 COD_FIN Código da finalidade do arquivo: 0 - Remessa do arquivo original; 1 - Remessa do arquivo substituto. N 001 - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private Integer r03_COD_FIN = null;

  /**
   * 04 DT_INI Data inicial das informações contidas no arquivo. N 008* - O
   */
  @SPEDField(maxLength = 8)
  private LocalDate r04_DT_INI = null;

  /**
   * 05 DT_FIN Data final das informações contidas no arquivo. N 008* - O
   */
  @SPEDField(maxLength = 8)
  private LocalDate r05_DT_FIN = null;

  /**
   * 06 NOME Nome empresarial da entidade. C 100 - O
   */
  @SPEDField(maxLength = 100)
  private String r06_NOME = null;

  /**
   * 07 CNPJ Número de inscrição da entidade no CNPJ. N 014* - OC
   */
  @SPEDField(type = SPEDFIELDTYPE.CNPJ, maxLength = 14, minLength = 14, required = false)
  private String r07_CNPJ = null;

  /**
   * 08 CPF Número de inscrição da entidade no CPF. N 011* OC
   */
  @SPEDField(type = SPEDFIELDTYPE.CPF, maxLength = 11, minLength = 11, required = false)
  private String r08_CPF = null;

  /**
   * 09 UF Sigla da unidade da federação da entidade. C 002* - O
   */
  @SPEDField(type = SPEDFIELDTYPE.UF, maxLength = 2, minLength = 2)
  private String r09_UF = null;

  /**
   * 10 IE Inscrição Estadual da entidade. C 014 - O
   */
  @SPEDField(type = SPEDFIELDTYPE.IE, maxLength = 14)
  private String r10_IE = null;

  /**
   * 11 COD_MUN Código do município do domicílio fiscal da entidade, conforme a tabela IBGE N 007* - O
   */
  @SPEDField(maxLength = 7, minLength = 7)
  private String r11_COD_MUN = null;

  /**
   * 12 IM Inscrição Municipal da entidade. C - - OC
   */
  @SPEDField(maxLength = 255, required = false)
  private String r12_IM = null;

  /**
   * 13 SUFRAMA Inscrição da entidade na SUFRAMA C 009* - OC
   */
  @SPEDField(maxLength = 9, minLength = 9, required = false)
  private String r13_SUFRAMA = null;

  /**
   * 14 IND_PERFIL Perfil de apresentação do arquivo fiscal; A – Perfil A; B – Perfil B.; C – Perfil C. C 001 - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r14_IND_PERFIL = null;

  /**
   * 15 IND_ATIV Indicador de tipo de atividade: 0 – Industrial ou equiparado a industrial; 1 – Outros. N 001 - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r15_IND_ATIV = null;

  @Override
  public String get01_Register() {
    return "0000";
  }

  /**
   * Recupera o 02 COD_VER Código da versão do leiaute conforme a tabela indicada no Ato COTEPE. N 003* - O<br>
   * Tabela:<br>
   * cod|ver.|data ini |data final|<br>
   * 002|1.01|01 01 2009|31 12 2009<Br>
   * 003|1.02|01 01 2010|31 12 2010<Br>
   * 004|1.03|01 01 2011|31 12 2011<Br>
   * 005|1.04|01 01 2012|30 06 2012<Br>
   * 006|1.05|01 07 2012|31 12 2012<Br>
   * 007|1.06|01 01 2013|31 12 2013<Br>
   * 008|1.07|01 01 2014|31 12 2014<Br>
   * 009|1.08|01 01 2015|31 12 2015<Br>
   * 010|1.09|01 01 2016|31 12 2016<Br>
   * 011|1.10|01 01 2017|31 12 2017<Br>
   * 012|1.11|01 01 2018|.
   *
   * @return the 02 COD_VER Código da versão do leiaute conforme a tabela indicada no Ato COTEPE
   */
  public String getR02_COD_VER() {
    return r02_COD_VER;
  }

  /**
   * Define o 02 COD_VER Código da versão do leiaute conforme a tabela indicada no Ato COTEPE. N 003* - O<br>
   * Tabela:<br>
   * cod|ver.|data ini |data final|<br>
   * 002|1.01|01 01 2009|31 12 2009<Br>
   * 003|1.02|01 01 2010|31 12 2010<Br>
   * 004|1.03|01 01 2011|31 12 2011<Br>
   * 005|1.04|01 01 2012|30 06 2012<Br>
   * 006|1.05|01 07 2012|31 12 2012<Br>
   * 007|1.06|01 01 2013|31 12 2013<Br>
   * 008|1.07|01 01 2014|31 12 2014<Br>
   * 009|1.08|01 01 2015|31 12 2015<Br>
   * 010|1.09|01 01 2016|31 12 2016<Br>
   * 011|1.10|01 01 2017|31 12 2017<Br>
   * 012|1.11|01 01 2018|.
   *
   * @param r02_COD_VER the new 02 COD_VER Código da versão do leiaute conforme a tabela indicada no Ato COTEPE
   */
  public void setR02_COD_VER(String r02_COD_VER) {
    this.r02_COD_VER = r02_COD_VER;
  }

  /**
   * Recupera o 03 COD_FIN Código da finalidade do arquivo: 0 - Remessa do arquivo original; 1 - Remessa do arquivo substituto. N 001 - O.
   *
   * @return the 03 COD_FIN Código da finalidade do arquivo: 0 - Remessa do arquivo original; 1 - Remessa do arquivo substituto
   */
  public Integer getR03_COD_FIN() {
    return r03_COD_FIN;
  }

  /**
   * Define o 03 COD_FIN Código da finalidade do arquivo: 0 - Remessa do arquivo original; 1 - Remessa do arquivo substituto. N 001 - O.
   *
   * @param r03_COD_FIN the new 03 COD_FIN Código da finalidade do arquivo: 0 - Remessa do arquivo original; 1 - Remessa do arquivo substituto
   */
  public void setR03_COD_FIN(Integer r03_COD_FIN) {
    this.r03_COD_FIN = r03_COD_FIN;
  }

  /**
   * Recupera o 04 DT_INI Data inicial das informações contidas no arquivo. N 008* - O.
   *
   * @return the 04 DT_INI Data inicial das informações contidas no arquivo
   */
  public LocalDate getR04_DT_INI() {
    return r04_DT_INI;
  }

  /**
   * Define o 04 DT_INI Data inicial das informações contidas no arquivo. N 008* - O.
   *
   * @param r04_DT_INI the new 04 DT_INI Data inicial das informações contidas no arquivo
   */
  public void setR04_DT_INI(LocalDate r04_DT_INI) {
    this.r04_DT_INI = r04_DT_INI;
  }

  /**
   * Recupera o 05 DT_FIN Data final das informações contidas no arquivo. N 008* - O.
   *
   * @return the 05 DT_FIN Data final das informações contidas no arquivo
   */
  public LocalDate getR05_DT_FIN() {
    return r05_DT_FIN;
  }

  /**
   * Define o 05 DT_FIN Data final das informações contidas no arquivo. N 008* - O.
   *
   * @param r05_DT_FIN the new 05 DT_FIN Data final das informações contidas no arquivo
   */
  public void setR05_DT_FIN(LocalDate r05_DT_FIN) {
    this.r05_DT_FIN = r05_DT_FIN;
  }

  /**
   * Recupera o 06 NOME Nome empresarial da entidade. C 100 - O.
   *
   * @return the 06 NOME Nome empresarial da entidade
   */
  public String getR06_NOME() {
    return r06_NOME;
  }

  /**
   * Define o 06 NOME Nome empresarial da entidade. C 100 - O.
   *
   * @param r06_NOME the new 06 NOME Nome empresarial da entidade
   */
  public void setR06_NOME(String r06_NOME) {
    this.r06_NOME = r06_NOME;
  }

  /**
   * Recupera o 07 CNPJ Número de inscrição da entidade no CNPJ. N 014* - OC.
   *
   * @return the 07 CNPJ Número de inscrição da entidade no CNPJ
   */
  public String getR07_CNPJ() {
    return r07_CNPJ;
  }

  /**
   * Define o 07 CNPJ Número de inscrição da entidade no CNPJ. N 014* - OC.
   *
   * @param r07_CNPJ the new 07 CNPJ Número de inscrição da entidade no CNPJ
   */
  public void setR07_CNPJ(String r07_CNPJ) {
    this.r07_CNPJ = r07_CNPJ;
  }

  /**
   * Recupera o 08 CPF Número de inscrição da entidade no CPF. N 011* OC.
   *
   * @return the 08 CPF Número de inscrição da entidade no CPF
   */
  public String getR08_CPF() {
    return r08_CPF;
  }

  /**
   * Define o 08 CPF Número de inscrição da entidade no CPF. N 011* OC.
   *
   * @param r08_CPF the new 08 CPF Número de inscrição da entidade no CPF
   */
  public void setR08_CPF(String r08_CPF) {
    this.r08_CPF = r08_CPF;
  }

  /**
   * Recupera o 09 UF Sigla da unidade da federação da entidade. C 002* - O.
   *
   * @return the 09 UF Sigla da unidade da federação da entidade
   */
  public String getR09_UF() {
    return r09_UF;
  }

  /**
   * Define o 09 UF Sigla da unidade da federação da entidade. C 002* - O.
   *
   * @param r09_UF the new 09 UF Sigla da unidade da federação da entidade
   */
  public void setR09_UF(String r09_UF) {
    this.r09_UF = r09_UF;
  }

  /**
   * Recupera o 10 IE Inscrição Estadual da entidade. C 014 - O.
   *
   * @return the 10 IE Inscrição Estadual da entidade
   */
  public String getR10_IE() {
    return r10_IE;
  }

  /**
   * Define o 10 IE Inscrição Estadual da entidade. C 014 - O.
   *
   * @param r10_IE the new 10 IE Inscrição Estadual da entidade
   */
  public void setR10_IE(String r10_IE) {
    this.r10_IE = r10_IE;
  }

  /**
   * Recupera o 11 COD_MUN Código do município do domicílio fiscal da entidade, conforme a tabela IBGE N 007* - O.
   *
   * @return the 11 COD_MUN Código do município do domicílio fiscal da entidade, conforme a tabela IBGE N 007* - O
   */
  public String getR11_COD_MUN() {
    return r11_COD_MUN;
  }

  /**
   * Define o 11 COD_MUN Código do município do domicílio fiscal da entidade, conforme a tabela IBGE N 007* - O.
   *
   * @param r11_COD_MUN the new 11 COD_MUN Código do município do domicílio fiscal da entidade, conforme a tabela IBGE N 007* - O
   */
  public void setR11_COD_MUN(String r11_COD_MUN) {
    this.r11_COD_MUN = r11_COD_MUN;
  }

  /**
   * Recupera o 12 IM Inscrição Municipal da entidade. C - - OC.
   *
   * @return the 12 IM Inscrição Municipal da entidade
   */
  public String getR12_IM() {
    return r12_IM;
  }

  /**
   * Define o 12 IM Inscrição Municipal da entidade. C - - OC.
   *
   * @param r12_IM the new 12 IM Inscrição Municipal da entidade
   */
  public void setR12_IM(String r12_IM) {
    this.r12_IM = r12_IM;
  }

  /**
   * Recupera o 13 SUFRAMA Inscrição da entidade na SUFRAMA C 009* - OC.
   *
   * @return the 13 SUFRAMA Inscrição da entidade na SUFRAMA C 009* - OC
   */
  public String getR13_SUFRAMA() {
    return r13_SUFRAMA;
  }

  /**
   * Define o 13 SUFRAMA Inscrição da entidade na SUFRAMA C 009* - OC.
   *
   * @param r13_SUFRAMA the new 13 SUFRAMA Inscrição da entidade na SUFRAMA C 009* - OC
   */
  public void setR13_SUFRAMA(String r13_SUFRAMA) {
    this.r13_SUFRAMA = r13_SUFRAMA;
  }

  /**
   * Recupera o 14 IND_PERFIL Perfil de apresentação do arquivo fiscal; A – Perfil A; B – Perfil B.; C – Perfil C. C 001 - O.
   *
   * @return the 14 IND_PERFIL Perfil de apresentação do arquivo fiscal; A – Perfil A; B – Perfil B
   */
  public String getR14_IND_PERFIL() {
    return r14_IND_PERFIL;
  }

  /**
   * Define o 14 IND_PERFIL Perfil de apresentação do arquivo fiscal; A – Perfil A; B – Perfil B.; C – Perfil C. C 001 - O.
   *
   * @param r14_IND_PERFIL the new 14 IND_PERFIL Perfil de apresentação do arquivo fiscal; A – Perfil A; B – Perfil B
   */
  public void setR14_IND_PERFIL(String r14_IND_PERFIL) {
    this.r14_IND_PERFIL = r14_IND_PERFIL;
  }

  /**
   * Recupera o 15 IND_ATIV Indicador de tipo de atividade: 0 – Industrial ou equiparado a industrial; 1 – Outros. N 001 - O.
   *
   * @return the 15 IND_ATIV Indicador de tipo de atividade: 0 – Industrial ou equiparado a industrial; 1 – Outros
   */
  public String getR15_IND_ATIV() {
    return r15_IND_ATIV;
  }

  /**
   * Define o 15 IND_ATIV Indicador de tipo de atividade: 0 – Industrial ou equiparado a industrial; 1 – Outros. N 001 - O.
   *
   * @param r15_IND_ATIV the new 15 IND_ATIV Indicador de tipo de atividade: 0 – Industrial ou equiparado a industrial; 1 – Outros
   */
  public void setR15_IND_ATIV(String r15_IND_ATIV) {
    this.r15_IND_ATIV = r15_IND_ATIV;
  }
}