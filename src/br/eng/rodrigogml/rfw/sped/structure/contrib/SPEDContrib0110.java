package br.eng.rodrigogml.rfw.sped.structure.contrib;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO 0110: REGIMES DE APURA��O DA CONTRIBUI��O SOCIAL E DE APROPRIA��O DE CR�DITO.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContrib0110 extends SPEDRegister {

  /**
   * REGISTRO 0111: TABELA DE RECEITA BRUTA MENSAL PARA FINS DE RATEIO DE CR�DITOS COMUNS
   */
  private SPEDContrib0111 r0111 = null;

  /**
   * C�digo indicador da incid�ncia tribut�ria no per�odo:<br>
   * <ul
   * <li>1 � Escritura��o de opera��es com incid�ncia exclusivamente no regime n�o-cumulativo;
   * <li>2 � Escritura��o de opera��es com incid�ncia exclusivamente no regime cumulativo;
   * <li>3 � Escritura��o de opera��es com incid�ncia nos regimes n�o-cumulativo e cumulativo.
   * </ul>
   * <br>
   * N 001* - S
   */
  @SPEDField(maxLength = 1, minLength = 1, required = true)
  private String r02_COD_INC_TRIB = null;

  /**
   * C�digo indicador de m�todo de apropria��o de cr�ditos comuns, no caso de incid�ncia no regime n�ocumulativo (COD_INC_TRIB = 1 ou 3):<br>
   * <ul>
   * <li>1 � M�todo de Apropria��o Direta;
   * <li>2 � M�todo de Rateio Proporcional (Receita Bruta)</ul<br>
   * N 001* - N
   */
  @SPEDField(maxLength = 1, minLength = 1, required = false)
  private String r03_IND_APRO_CRED = null;

  /**
   * C�digo indicador do Tipo de Contribui��o Apurada no Per�odo
   * <ul>
   * <li>1 � Apura��o da Contribui��o Exclusivamente a Al�quota B�sica
   * <li>2 � Apura��o da Contribui��o a Al�quotas Espec�ficas (Diferenciadas e/ou por Unidade de Medida de Produto)
   * </ul>
   * <br>
   * N 001* - N
   */
  @SPEDField(maxLength = 1, minLength = 1, required = false)
  private String r04_COD_TIPO_CONT = null;

  /**
   * C�digo indicador do crit�rio de escritura��o e apura��o adotado, no caso de incid�ncia exclusivamente no regime cumulativo (COD_INC_TRIB = 2), pela pessoa jur�dica submetida ao regime de tributa��o com base no lucro presumido:
   * <li>1 � Regime de Caixa � Escritura��o consolidada (Registro F500);
   * <li>2 � Regime de Compet�ncia - Escritura��o consolidada (Registro F550);
   * <li>9 � Regime de Compet�ncia - Escritura��o detalhada, com base nos registros dos Blocos �A�, �C�, �D� e �F�.<br>
   * N 001* - N
   */
  @SPEDField(maxLength = 1, minLength = 1, required = false)
  private String r05_IND_REG_CUM = null;

  @Override
  public String get01_Register() {
    return "0110";
  }

  /**
   * Recupera o c�digo indicador da incid�ncia tribut�ria no per�odo:<br>
   * <ul
   * <li>1 � Escritura��o de opera��es com incid�ncia exclusivamente no regime n�o-cumulativo;
   * <li>2 � Escritura��o de opera��es com incid�ncia exclusivamente no regime cumulativo;
   * <li>3 � Escritura��o de opera��es com incid�ncia nos regimes n�o-cumulativo e cumulativo.
   * </ul>
   * <br>
   * N 001* - S.
   *
   * @return the c�digo indicador da incid�ncia tribut�ria no per�odo:<br>
   *         <ul
   *         <li>1 � Escritura��o de opera��es com incid�ncia exclusivamente no regime n�o-cumulativo;
   *         <li>2 � Escritura��o de opera��es com incid�ncia exclusivamente no regime cumulativo;
   *         <li>3 � Escritura��o de opera��es com incid�ncia nos regimes n�o-cumulativo e cumulativo
   */
  public String getR02_COD_INC_TRIB() {
    return r02_COD_INC_TRIB;
  }

  /**
   * Recupera o c�digo indicador de m�todo de apropria��o de cr�ditos comuns, no caso de incid�ncia no regime n�ocumulativo (COD_INC_TRIB = 1 ou 3):<br>
   * <ul>
   * <li>1 � M�todo de Apropria��o Direta;
   * <li>2 � M�todo de Rateio Proporcional (Receita Bruta)</ul<br>
   * N 001* - N.
   *
   * @return the c�digo indicador de m�todo de apropria��o de cr�ditos comuns, no caso de incid�ncia no regime n�ocumulativo (COD_INC_TRIB = 1 ou 3):<br>
   *         <ul>
   *         <li>1 � M�todo de Apropria��o Direta;
   *         <li>2 � M�todo de Rateio Proporcional (Receita Bruta)</ul<br>
   *         N 001* - N
   */
  public String getR03_IND_APRO_CRED() {
    return r03_IND_APRO_CRED;
  }

  /**
   * Recupera o c�digo indicador do Tipo de Contribui��o Apurada no Per�odo
   * <ul>
   * <li>1 � Apura��o da Contribui��o Exclusivamente a Al�quota B�sica
   * <li>2 � Apura��o da Contribui��o a Al�quotas Espec�ficas (Diferenciadas e/ou por Unidade de Medida de Produto)
   * </ul>
   * <br>
   * N 001* - N.
   *
   * @return the c�digo indicador do Tipo de Contribui��o Apurada no Per�odo
   *         <ul>
   *         <li>1 � Apura��o da Contribui��o Exclusivamente a Al�quota B�sica
   *         <li>2 � Apura��o da Contribui��o a Al�quotas Espec�ficas (Diferenciadas e/ou por Unidade de Medida de Produto)
   *         </ul>
   *         <br>
   *         N 001* - N
   */
  public String getR04_COD_TIPO_CONT() {
    return r04_COD_TIPO_CONT;
  }

  /**
   * Recupera o c�digo indicador do crit�rio de escritura��o e apura��o adotado, no caso de incid�ncia exclusivamente no regime cumulativo (COD_INC_TRIB = 2), pela pessoa jur�dica submetida ao regime de tributa��o com base no lucro presumido:
   * <li>1 � Regime de Caixa � Escritura��o consolidada (Registro F500);
   * <li>2 � Regime de Compet�ncia - Escritura��o consolidada (Registro F550);
   * <li>9 � Regime de Compet�ncia - Escritura��o detalhada, com base nos registros dos Blocos �A�, �C�, �D� e �F�.<br>
   * N 001* - N.
   *
   * @return the c�digo indicador do crit�rio de escritura��o e apura��o adotado, no caso de incid�ncia exclusivamente no regime cumulativo (COD_INC_TRIB = 2), pela pessoa jur�dica submetida ao regime de tributa��o com base no lucro presumido:
   *         <li>1 � Regime de Caixa � Escritura��o consolidada (Registro F500);
   *         <li>2 � Regime de Compet�ncia - Escritura��o consolidada (Registro F550);
   *         <li>9 � Regime de Compet�ncia - Escritura��o detalhada, com base nos registros dos Blocos �A�, �C�, �D� e �F�
   */
  public String getR05_IND_REG_CUM() {
    return r05_IND_REG_CUM;
  }

  /**
   * Define o c�digo indicador da incid�ncia tribut�ria no per�odo:<br>
   * <ul
   * <li>1 � Escritura��o de opera��es com incid�ncia exclusivamente no regime n�o-cumulativo;
   * <li>2 � Escritura��o de opera��es com incid�ncia exclusivamente no regime cumulativo;
   * <li>3 � Escritura��o de opera��es com incid�ncia nos regimes n�o-cumulativo e cumulativo.
   * </ul>
   * <br>
   * N 001* - S.
   *
   * @param r02_COD_INC_TRIB the new c�digo indicador da incid�ncia tribut�ria no per�odo:<br>
   *          <ul
   *          <li>1 � Escritura��o de opera��es com incid�ncia exclusivamente no regime n�o-cumulativo;
   *          <li>2 � Escritura��o de opera��es com incid�ncia exclusivamente no regime cumulativo;
   *          <li>3 � Escritura��o de opera��es com incid�ncia nos regimes n�o-cumulativo e cumulativo
   */
  public void setR02_COD_INC_TRIB(String r02_COD_INC_TRIB) {
    this.r02_COD_INC_TRIB = r02_COD_INC_TRIB;
  }

  /**
   * Define o c�digo indicador de m�todo de apropria��o de cr�ditos comuns, no caso de incid�ncia no regime n�ocumulativo (COD_INC_TRIB = 1 ou 3):<br>
   * <ul>
   * <li>1 � M�todo de Apropria��o Direta;
   * <li>2 � M�todo de Rateio Proporcional (Receita Bruta)</ul<br>
   * N 001* - N.
   *
   * @param r03_IND_APRO_CRED the new c�digo indicador de m�todo de apropria��o de cr�ditos comuns, no caso de incid�ncia no regime n�ocumulativo (COD_INC_TRIB = 1 ou 3):<br>
   *          <ul>
   *          <li>1 � M�todo de Apropria��o Direta;
   *          <li>2 � M�todo de Rateio Proporcional (Receita Bruta)</ul<br>
   *          N 001* - N
   */
  public void setR03_IND_APRO_CRED(String r03_IND_APRO_CRED) {
    this.r03_IND_APRO_CRED = r03_IND_APRO_CRED;
  }

  /**
   * Define o c�digo indicador do Tipo de Contribui��o Apurada no Per�odo
   * <ul>
   * <li>1 � Apura��o da Contribui��o Exclusivamente a Al�quota B�sica
   * <li>2 � Apura��o da Contribui��o a Al�quotas Espec�ficas (Diferenciadas e/ou por Unidade de Medida de Produto)
   * </ul>
   * <br>
   * N 001* - N.
   *
   * @param r04_COD_TIPO_CONT the new c�digo indicador do Tipo de Contribui��o Apurada no Per�odo
   *          <ul>
   *          <li>1 � Apura��o da Contribui��o Exclusivamente a Al�quota B�sica
   *          <li>2 � Apura��o da Contribui��o a Al�quotas Espec�ficas (Diferenciadas e/ou por Unidade de Medida de Produto)
   *          </ul>
   *          <br>
   *          N 001* - N
   */
  public void setR04_COD_TIPO_CONT(String r04_COD_TIPO_CONT) {
    this.r04_COD_TIPO_CONT = r04_COD_TIPO_CONT;
  }

  /**
   * Define o c�digo indicador do crit�rio de escritura��o e apura��o adotado, no caso de incid�ncia exclusivamente no regime cumulativo (COD_INC_TRIB = 2), pela pessoa jur�dica submetida ao regime de tributa��o com base no lucro presumido:
   * <li>1 � Regime de Caixa � Escritura��o consolidada (Registro F500);
   * <li>2 � Regime de Compet�ncia - Escritura��o consolidada (Registro F550);
   * <li>9 � Regime de Compet�ncia - Escritura��o detalhada, com base nos registros dos Blocos �A�, �C�, �D� e �F�.<br>
   * N 001* - N.
   *
   * @param r05_IND_REG_CUM the new c�digo indicador do crit�rio de escritura��o e apura��o adotado, no caso de incid�ncia exclusivamente no regime cumulativo (COD_INC_TRIB = 2), pela pessoa jur�dica submetida ao regime de tributa��o com base no lucro presumido:
   *          <li>1 � Regime de Caixa � Escritura��o consolidada (Registro F500);
   *          <li>2 � Regime de Compet�ncia - Escritura��o consolidada (Registro F550);
   *          <li>9 � Regime de Compet�ncia - Escritura��o detalhada, com base nos registros dos Blocos �A�, �C�, �D� e �F�
   */
  public void setR05_IND_REG_CUM(String r05_IND_REG_CUM) {
    this.r05_IND_REG_CUM = r05_IND_REG_CUM;
  }

  /**
   * Recupera o rEGISTRO 0111: TABELA DE RECEITA BRUTA MENSAL PARA FINS DE RATEIO DE CR�DITOS COMUNS.
   *
   * @return the rEGISTRO 0111: TABELA DE RECEITA BRUTA MENSAL PARA FINS DE RATEIO DE CR�DITOS COMUNS
   */
  public SPEDContrib0111 getR0111() {
    return r0111;
  }

  /**
   * Define o rEGISTRO 0111: TABELA DE RECEITA BRUTA MENSAL PARA FINS DE RATEIO DE CR�DITOS COMUNS.
   *
   * @param r0111 the new rEGISTRO 0111: TABELA DE RECEITA BRUTA MENSAL PARA FINS DE RATEIO DE CR�DITOS COMUNS
   */
  public void setR0111(SPEDContrib0111 r0111) {
    this.r0111 = r0111;
  }

}