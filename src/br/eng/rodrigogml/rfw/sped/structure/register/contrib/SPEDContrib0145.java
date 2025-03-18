package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO 0145: REGIME DE APURAÇÃO DA CONTRIBUIÇÃO PREVIDENCIÁRIA SOBRE A RECEITA BRUTA.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContrib0145 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * Código indicador da incidência tributária no período:
   * <li>1 – Contribuição Previdenciária apurada no período, exclusivamente com base na Receita Bruta;
   * <li>2 – Contribuição Previdenciária apurada no período, com base na Receita Bruta e com base nas Remunerações pagas, na forma dos nos incisos I e III do art. 22 da Lei no 8.212, de 1991. N 001* - S
   */
  @SPEDField(maxLength = 1, minLength = 1, required = true)
  private String r02_COD_INC_TRIB = null;
  /**
   * Valor da Receita Bruta Total da Pessoa Jurídica no Período N - 02 S
   */
  @SPEDField(decimals = 2, maxLength = 20, required = true)
  private BigDecimal r03_VL_REC_TOT = null;

  /**
   * Valor da Receita Bruta da(s) Atividade(s) Sujeita(s) à Contribuição Previdenciária sobre a Receita Bruta N - 02 S
   */
  @SPEDField(decimals = 2, maxLength = 20, required = true)
  private BigDecimal r04_VL_REC_ATIV = null;

  /**
   * Valor da Receita Bruta da(s) Atividade(s) não Sujeita(s) à Contribuição Previdenciária sobre a Receita Bruta N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = false)
  private BigDecimal r05_VL_REC_DEMAIS_ATIV = null;

  /**
   * Informação complementar C - - N
   */
  @SPEDField(maxLength = 500, required = false)
  private String r06_INFO_COMPL = null;

  @Override
  public String get01_Register() {
    return "0145";
  }

  /**
   * Recupera o código indicador da incidência tributária no período:
   * <li>1 – Contribuição Previdenciária apurada no período, exclusivamente com base na Receita Bruta;
   * <li>2 – Contribuição Previdenciária apurada no período, com base na Receita Bruta e com base nas Remunerações pagas, na forma dos nos incisos I e III do art. 22 da Lei no 8.212, de 1991. N 001* - S.
   *
   * @return the código indicador da incidência tributária no período:
   *         <li>1 – Contribuição Previdenciária apurada no período, exclusivamente com base na Receita Bruta;
   *         <li>2 – Contribuição Previdenciária apurada no período, com base na Receita Bruta e com base nas Remunerações pagas, na forma dos nos incisos I e III do art
   */
  public String getR02_COD_INC_TRIB() {
    return r02_COD_INC_TRIB;
  }

  /**
   * Define o código indicador da incidência tributária no período:
   * <li>1 – Contribuição Previdenciária apurada no período, exclusivamente com base na Receita Bruta;
   * <li>2 – Contribuição Previdenciária apurada no período, com base na Receita Bruta e com base nas Remunerações pagas, na forma dos nos incisos I e III do art. 22 da Lei no 8.212, de 1991. N 001* - S.
   *
   * @param r02_COD_INC_TRIB the new código indicador da incidência tributária no período:
   *          <li>1 – Contribuição Previdenciária apurada no período, exclusivamente com base na Receita Bruta;
   *          <li>2 – Contribuição Previdenciária apurada no período, com base na Receita Bruta e com base nas Remunerações pagas, na forma dos nos incisos I e III do art
   */
  public void setR02_COD_INC_TRIB(String r02_COD_INC_TRIB) {
    this.r02_COD_INC_TRIB = r02_COD_INC_TRIB;
  }

  /**
   * Recupera o valor da Receita Bruta Total da Pessoa Jurídica no Período N - 02 S.
   *
   * @return the valor da Receita Bruta Total da Pessoa Jurídica no Período N - 02 S
   */
  public BigDecimal getR03_VL_REC_TOT() {
    return r03_VL_REC_TOT;
  }

  /**
   * Define o valor da Receita Bruta Total da Pessoa Jurídica no Período N - 02 S.
   *
   * @param r03_VL_REC_TOT the new valor da Receita Bruta Total da Pessoa Jurídica no Período N - 02 S
   */
  public void setR03_VL_REC_TOT(BigDecimal r03_VL_REC_TOT) {
    this.r03_VL_REC_TOT = r03_VL_REC_TOT;
  }

  /**
   * Recupera o valor da Receita Bruta da(s) Atividade(s) Sujeita(s) à Contribuição Previdenciária sobre a Receita Bruta N - 02 S.
   *
   * @return the valor da Receita Bruta da(s) Atividade(s) Sujeita(s) à Contribuição Previdenciária sobre a Receita Bruta N - 02 S
   */
  public BigDecimal getR04_VL_REC_ATIV() {
    return r04_VL_REC_ATIV;
  }

  /**
   * Define o valor da Receita Bruta da(s) Atividade(s) Sujeita(s) à Contribuição Previdenciária sobre a Receita Bruta N - 02 S.
   *
   * @param r04_VL_REC_ATIV the new valor da Receita Bruta da(s) Atividade(s) Sujeita(s) à Contribuição Previdenciária sobre a Receita Bruta N - 02 S
   */
  public void setR04_VL_REC_ATIV(BigDecimal r04_VL_REC_ATIV) {
    this.r04_VL_REC_ATIV = r04_VL_REC_ATIV;
  }

  /**
   * Recupera o valor da Receita Bruta da(s) Atividade(s) não Sujeita(s) à Contribuição Previdenciária sobre a Receita Bruta N - 02 N.
   *
   * @return the valor da Receita Bruta da(s) Atividade(s) não Sujeita(s) à Contribuição Previdenciária sobre a Receita Bruta N - 02 N
   */
  public BigDecimal getR05_VL_REC_DEMAIS_ATIV() {
    return r05_VL_REC_DEMAIS_ATIV;
  }

  /**
   * Define o valor da Receita Bruta da(s) Atividade(s) não Sujeita(s) à Contribuição Previdenciária sobre a Receita Bruta N - 02 N.
   *
   * @param r05_VL_REC_DEMAIS_ATIV the new valor da Receita Bruta da(s) Atividade(s) não Sujeita(s) à Contribuição Previdenciária sobre a Receita Bruta N - 02 N
   */
  public void setR05_VL_REC_DEMAIS_ATIV(BigDecimal r05_VL_REC_DEMAIS_ATIV) {
    this.r05_VL_REC_DEMAIS_ATIV = r05_VL_REC_DEMAIS_ATIV;
  }

  /**
   * Recupera o informação complementar C - - N.
   *
   * @return the informação complementar C - - N
   */
  public String getR06_INFO_COMPL() {
    return r06_INFO_COMPL;
  }

  /**
   * Define o informação complementar C - - N.
   *
   * @param r06_INFO_COMPL the new informação complementar C - - N
   */
  public void setR06_INFO_COMPL(String r06_INFO_COMPL) {
    this.r06_INFO_COMPL = r06_INFO_COMPL;
  }

}