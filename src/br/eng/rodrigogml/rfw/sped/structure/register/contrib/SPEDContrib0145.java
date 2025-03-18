package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO 0145: REGIME DE APURA��O DA CONTRIBUI��O PREVIDENCI�RIA SOBRE A RECEITA BRUTA.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContrib0145 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * C�digo indicador da incid�ncia tribut�ria no per�odo:
   * <li>1 � Contribui��o Previdenci�ria apurada no per�odo, exclusivamente com base na Receita Bruta;
   * <li>2 � Contribui��o Previdenci�ria apurada no per�odo, com base na Receita Bruta e com base nas Remunera��es pagas, na forma dos nos incisos I e III do art. 22 da Lei no 8.212, de 1991. N 001* - S
   */
  @SPEDField(maxLength = 1, minLength = 1, required = true)
  private String r02_COD_INC_TRIB = null;
  /**
   * Valor da Receita Bruta Total da Pessoa Jur�dica no Per�odo N - 02 S
   */
  @SPEDField(decimals = 2, maxLength = 20, required = true)
  private BigDecimal r03_VL_REC_TOT = null;

  /**
   * Valor da Receita Bruta da(s) Atividade(s) Sujeita(s) � Contribui��o Previdenci�ria sobre a Receita Bruta N - 02 S
   */
  @SPEDField(decimals = 2, maxLength = 20, required = true)
  private BigDecimal r04_VL_REC_ATIV = null;

  /**
   * Valor da Receita Bruta da(s) Atividade(s) n�o Sujeita(s) � Contribui��o Previdenci�ria sobre a Receita Bruta N - 02 N
   */
  @SPEDField(decimals = 2, maxLength = 20, required = false)
  private BigDecimal r05_VL_REC_DEMAIS_ATIV = null;

  /**
   * Informa��o complementar C - - N
   */
  @SPEDField(maxLength = 500, required = false)
  private String r06_INFO_COMPL = null;

  @Override
  public String get01_Register() {
    return "0145";
  }

  /**
   * Recupera o c�digo indicador da incid�ncia tribut�ria no per�odo:
   * <li>1 � Contribui��o Previdenci�ria apurada no per�odo, exclusivamente com base na Receita Bruta;
   * <li>2 � Contribui��o Previdenci�ria apurada no per�odo, com base na Receita Bruta e com base nas Remunera��es pagas, na forma dos nos incisos I e III do art. 22 da Lei no 8.212, de 1991. N 001* - S.
   *
   * @return the c�digo indicador da incid�ncia tribut�ria no per�odo:
   *         <li>1 � Contribui��o Previdenci�ria apurada no per�odo, exclusivamente com base na Receita Bruta;
   *         <li>2 � Contribui��o Previdenci�ria apurada no per�odo, com base na Receita Bruta e com base nas Remunera��es pagas, na forma dos nos incisos I e III do art
   */
  public String getR02_COD_INC_TRIB() {
    return r02_COD_INC_TRIB;
  }

  /**
   * Define o c�digo indicador da incid�ncia tribut�ria no per�odo:
   * <li>1 � Contribui��o Previdenci�ria apurada no per�odo, exclusivamente com base na Receita Bruta;
   * <li>2 � Contribui��o Previdenci�ria apurada no per�odo, com base na Receita Bruta e com base nas Remunera��es pagas, na forma dos nos incisos I e III do art. 22 da Lei no 8.212, de 1991. N 001* - S.
   *
   * @param r02_COD_INC_TRIB the new c�digo indicador da incid�ncia tribut�ria no per�odo:
   *          <li>1 � Contribui��o Previdenci�ria apurada no per�odo, exclusivamente com base na Receita Bruta;
   *          <li>2 � Contribui��o Previdenci�ria apurada no per�odo, com base na Receita Bruta e com base nas Remunera��es pagas, na forma dos nos incisos I e III do art
   */
  public void setR02_COD_INC_TRIB(String r02_COD_INC_TRIB) {
    this.r02_COD_INC_TRIB = r02_COD_INC_TRIB;
  }

  /**
   * Recupera o valor da Receita Bruta Total da Pessoa Jur�dica no Per�odo N - 02 S.
   *
   * @return the valor da Receita Bruta Total da Pessoa Jur�dica no Per�odo N - 02 S
   */
  public BigDecimal getR03_VL_REC_TOT() {
    return r03_VL_REC_TOT;
  }

  /**
   * Define o valor da Receita Bruta Total da Pessoa Jur�dica no Per�odo N - 02 S.
   *
   * @param r03_VL_REC_TOT the new valor da Receita Bruta Total da Pessoa Jur�dica no Per�odo N - 02 S
   */
  public void setR03_VL_REC_TOT(BigDecimal r03_VL_REC_TOT) {
    this.r03_VL_REC_TOT = r03_VL_REC_TOT;
  }

  /**
   * Recupera o valor da Receita Bruta da(s) Atividade(s) Sujeita(s) � Contribui��o Previdenci�ria sobre a Receita Bruta N - 02 S.
   *
   * @return the valor da Receita Bruta da(s) Atividade(s) Sujeita(s) � Contribui��o Previdenci�ria sobre a Receita Bruta N - 02 S
   */
  public BigDecimal getR04_VL_REC_ATIV() {
    return r04_VL_REC_ATIV;
  }

  /**
   * Define o valor da Receita Bruta da(s) Atividade(s) Sujeita(s) � Contribui��o Previdenci�ria sobre a Receita Bruta N - 02 S.
   *
   * @param r04_VL_REC_ATIV the new valor da Receita Bruta da(s) Atividade(s) Sujeita(s) � Contribui��o Previdenci�ria sobre a Receita Bruta N - 02 S
   */
  public void setR04_VL_REC_ATIV(BigDecimal r04_VL_REC_ATIV) {
    this.r04_VL_REC_ATIV = r04_VL_REC_ATIV;
  }

  /**
   * Recupera o valor da Receita Bruta da(s) Atividade(s) n�o Sujeita(s) � Contribui��o Previdenci�ria sobre a Receita Bruta N - 02 N.
   *
   * @return the valor da Receita Bruta da(s) Atividade(s) n�o Sujeita(s) � Contribui��o Previdenci�ria sobre a Receita Bruta N - 02 N
   */
  public BigDecimal getR05_VL_REC_DEMAIS_ATIV() {
    return r05_VL_REC_DEMAIS_ATIV;
  }

  /**
   * Define o valor da Receita Bruta da(s) Atividade(s) n�o Sujeita(s) � Contribui��o Previdenci�ria sobre a Receita Bruta N - 02 N.
   *
   * @param r05_VL_REC_DEMAIS_ATIV the new valor da Receita Bruta da(s) Atividade(s) n�o Sujeita(s) � Contribui��o Previdenci�ria sobre a Receita Bruta N - 02 N
   */
  public void setR05_VL_REC_DEMAIS_ATIV(BigDecimal r05_VL_REC_DEMAIS_ATIV) {
    this.r05_VL_REC_DEMAIS_ATIV = r05_VL_REC_DEMAIS_ATIV;
  }

  /**
   * Recupera o informa��o complementar C - - N.
   *
   * @return the informa��o complementar C - - N
   */
  public String getR06_INFO_COMPL() {
    return r06_INFO_COMPL;
  }

  /**
   * Define o informa��o complementar C - - N.
   *
   * @param r06_INFO_COMPL the new informa��o complementar C - - N
   */
  public void setR06_INFO_COMPL(String r06_INFO_COMPL) {
    this.r06_INFO_COMPL = r06_INFO_COMPL;
  }

}