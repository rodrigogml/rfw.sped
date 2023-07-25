package br.eng.rodrigogml.rfw.sped.structure.contrib;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO 0110: REGIMES DE APURAÇÃO DA CONTRIBUIÇÃO SOCIAL E DE APROPRIAÇÃO DE CRÉDITO.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContrib0110 extends SPEDRegister {

  /**
   * REGISTRO 0111: TABELA DE RECEITA BRUTA MENSAL PARA FINS DE RATEIO DE CRÉDITOS COMUNS
   */
  private SPEDContrib0111 r0111 = null;

  /**
   * Código indicador da incidência tributária no período:<br>
   * <ul
   * <li>1 – Escrituração de operações com incidência exclusivamente no regime não-cumulativo;
   * <li>2 – Escrituração de operações com incidência exclusivamente no regime cumulativo;
   * <li>3 – Escrituração de operações com incidência nos regimes não-cumulativo e cumulativo.
   * </ul>
   * <br>
   * N 001* - S
   */
  @SPEDField(maxLength = 1, minLength = 1, required = true)
  private String r02_COD_INC_TRIB = null;

  /**
   * Código indicador de método de apropriação de créditos comuns, no caso de incidência no regime nãocumulativo (COD_INC_TRIB = 1 ou 3):<br>
   * <ul>
   * <li>1 – Método de Apropriação Direta;
   * <li>2 – Método de Rateio Proporcional (Receita Bruta)</ul<br>
   * N 001* - N
   */
  @SPEDField(maxLength = 1, minLength = 1, required = false)
  private String r03_IND_APRO_CRED = null;

  /**
   * Código indicador do Tipo de Contribuição Apurada no Período
   * <ul>
   * <li>1 – Apuração da Contribuição Exclusivamente a Alíquota Básica
   * <li>2 – Apuração da Contribuição a Alíquotas Específicas (Diferenciadas e/ou por Unidade de Medida de Produto)
   * </ul>
   * <br>
   * N 001* - N
   */
  @SPEDField(maxLength = 1, minLength = 1, required = false)
  private String r04_COD_TIPO_CONT = null;

  /**
   * Código indicador do critério de escrituração e apuração adotado, no caso de incidência exclusivamente no regime cumulativo (COD_INC_TRIB = 2), pela pessoa jurídica submetida ao regime de tributação com base no lucro presumido:
   * <li>1 – Regime de Caixa – Escrituração consolidada (Registro F500);
   * <li>2 – Regime de Competência - Escrituração consolidada (Registro F550);
   * <li>9 – Regime de Competência - Escrituração detalhada, com base nos registros dos Blocos “A”, “C”, “D” e “F”.<br>
   * N 001* - N
   */
  @SPEDField(maxLength = 1, minLength = 1, required = false)
  private String r05_IND_REG_CUM = null;

  @Override
  public String get01_Register() {
    return "0110";
  }

  /**
   * Recupera o código indicador da incidência tributária no período:<br>
   * <ul
   * <li>1 – Escrituração de operações com incidência exclusivamente no regime não-cumulativo;
   * <li>2 – Escrituração de operações com incidência exclusivamente no regime cumulativo;
   * <li>3 – Escrituração de operações com incidência nos regimes não-cumulativo e cumulativo.
   * </ul>
   * <br>
   * N 001* - S.
   *
   * @return the código indicador da incidência tributária no período:<br>
   *         <ul
   *         <li>1 – Escrituração de operações com incidência exclusivamente no regime não-cumulativo;
   *         <li>2 – Escrituração de operações com incidência exclusivamente no regime cumulativo;
   *         <li>3 – Escrituração de operações com incidência nos regimes não-cumulativo e cumulativo
   */
  public String getR02_COD_INC_TRIB() {
    return r02_COD_INC_TRIB;
  }

  /**
   * Recupera o código indicador de método de apropriação de créditos comuns, no caso de incidência no regime nãocumulativo (COD_INC_TRIB = 1 ou 3):<br>
   * <ul>
   * <li>1 – Método de Apropriação Direta;
   * <li>2 – Método de Rateio Proporcional (Receita Bruta)</ul<br>
   * N 001* - N.
   *
   * @return the código indicador de método de apropriação de créditos comuns, no caso de incidência no regime nãocumulativo (COD_INC_TRIB = 1 ou 3):<br>
   *         <ul>
   *         <li>1 – Método de Apropriação Direta;
   *         <li>2 – Método de Rateio Proporcional (Receita Bruta)</ul<br>
   *         N 001* - N
   */
  public String getR03_IND_APRO_CRED() {
    return r03_IND_APRO_CRED;
  }

  /**
   * Recupera o código indicador do Tipo de Contribuição Apurada no Período
   * <ul>
   * <li>1 – Apuração da Contribuição Exclusivamente a Alíquota Básica
   * <li>2 – Apuração da Contribuição a Alíquotas Específicas (Diferenciadas e/ou por Unidade de Medida de Produto)
   * </ul>
   * <br>
   * N 001* - N.
   *
   * @return the código indicador do Tipo de Contribuição Apurada no Período
   *         <ul>
   *         <li>1 – Apuração da Contribuição Exclusivamente a Alíquota Básica
   *         <li>2 – Apuração da Contribuição a Alíquotas Específicas (Diferenciadas e/ou por Unidade de Medida de Produto)
   *         </ul>
   *         <br>
   *         N 001* - N
   */
  public String getR04_COD_TIPO_CONT() {
    return r04_COD_TIPO_CONT;
  }

  /**
   * Recupera o código indicador do critério de escrituração e apuração adotado, no caso de incidência exclusivamente no regime cumulativo (COD_INC_TRIB = 2), pela pessoa jurídica submetida ao regime de tributação com base no lucro presumido:
   * <li>1 – Regime de Caixa – Escrituração consolidada (Registro F500);
   * <li>2 – Regime de Competência - Escrituração consolidada (Registro F550);
   * <li>9 – Regime de Competência - Escrituração detalhada, com base nos registros dos Blocos “A”, “C”, “D” e “F”.<br>
   * N 001* - N.
   *
   * @return the código indicador do critério de escrituração e apuração adotado, no caso de incidência exclusivamente no regime cumulativo (COD_INC_TRIB = 2), pela pessoa jurídica submetida ao regime de tributação com base no lucro presumido:
   *         <li>1 – Regime de Caixa – Escrituração consolidada (Registro F500);
   *         <li>2 – Regime de Competência - Escrituração consolidada (Registro F550);
   *         <li>9 – Regime de Competência - Escrituração detalhada, com base nos registros dos Blocos “A”, “C”, “D” e “F”
   */
  public String getR05_IND_REG_CUM() {
    return r05_IND_REG_CUM;
  }

  /**
   * Define o código indicador da incidência tributária no período:<br>
   * <ul
   * <li>1 – Escrituração de operações com incidência exclusivamente no regime não-cumulativo;
   * <li>2 – Escrituração de operações com incidência exclusivamente no regime cumulativo;
   * <li>3 – Escrituração de operações com incidência nos regimes não-cumulativo e cumulativo.
   * </ul>
   * <br>
   * N 001* - S.
   *
   * @param r02_COD_INC_TRIB the new código indicador da incidência tributária no período:<br>
   *          <ul
   *          <li>1 – Escrituração de operações com incidência exclusivamente no regime não-cumulativo;
   *          <li>2 – Escrituração de operações com incidência exclusivamente no regime cumulativo;
   *          <li>3 – Escrituração de operações com incidência nos regimes não-cumulativo e cumulativo
   */
  public void setR02_COD_INC_TRIB(String r02_COD_INC_TRIB) {
    this.r02_COD_INC_TRIB = r02_COD_INC_TRIB;
  }

  /**
   * Define o código indicador de método de apropriação de créditos comuns, no caso de incidência no regime nãocumulativo (COD_INC_TRIB = 1 ou 3):<br>
   * <ul>
   * <li>1 – Método de Apropriação Direta;
   * <li>2 – Método de Rateio Proporcional (Receita Bruta)</ul<br>
   * N 001* - N.
   *
   * @param r03_IND_APRO_CRED the new código indicador de método de apropriação de créditos comuns, no caso de incidência no regime nãocumulativo (COD_INC_TRIB = 1 ou 3):<br>
   *          <ul>
   *          <li>1 – Método de Apropriação Direta;
   *          <li>2 – Método de Rateio Proporcional (Receita Bruta)</ul<br>
   *          N 001* - N
   */
  public void setR03_IND_APRO_CRED(String r03_IND_APRO_CRED) {
    this.r03_IND_APRO_CRED = r03_IND_APRO_CRED;
  }

  /**
   * Define o código indicador do Tipo de Contribuição Apurada no Período
   * <ul>
   * <li>1 – Apuração da Contribuição Exclusivamente a Alíquota Básica
   * <li>2 – Apuração da Contribuição a Alíquotas Específicas (Diferenciadas e/ou por Unidade de Medida de Produto)
   * </ul>
   * <br>
   * N 001* - N.
   *
   * @param r04_COD_TIPO_CONT the new código indicador do Tipo de Contribuição Apurada no Período
   *          <ul>
   *          <li>1 – Apuração da Contribuição Exclusivamente a Alíquota Básica
   *          <li>2 – Apuração da Contribuição a Alíquotas Específicas (Diferenciadas e/ou por Unidade de Medida de Produto)
   *          </ul>
   *          <br>
   *          N 001* - N
   */
  public void setR04_COD_TIPO_CONT(String r04_COD_TIPO_CONT) {
    this.r04_COD_TIPO_CONT = r04_COD_TIPO_CONT;
  }

  /**
   * Define o código indicador do critério de escrituração e apuração adotado, no caso de incidência exclusivamente no regime cumulativo (COD_INC_TRIB = 2), pela pessoa jurídica submetida ao regime de tributação com base no lucro presumido:
   * <li>1 – Regime de Caixa – Escrituração consolidada (Registro F500);
   * <li>2 – Regime de Competência - Escrituração consolidada (Registro F550);
   * <li>9 – Regime de Competência - Escrituração detalhada, com base nos registros dos Blocos “A”, “C”, “D” e “F”.<br>
   * N 001* - N.
   *
   * @param r05_IND_REG_CUM the new código indicador do critério de escrituração e apuração adotado, no caso de incidência exclusivamente no regime cumulativo (COD_INC_TRIB = 2), pela pessoa jurídica submetida ao regime de tributação com base no lucro presumido:
   *          <li>1 – Regime de Caixa – Escrituração consolidada (Registro F500);
   *          <li>2 – Regime de Competência - Escrituração consolidada (Registro F550);
   *          <li>9 – Regime de Competência - Escrituração detalhada, com base nos registros dos Blocos “A”, “C”, “D” e “F”
   */
  public void setR05_IND_REG_CUM(String r05_IND_REG_CUM) {
    this.r05_IND_REG_CUM = r05_IND_REG_CUM;
  }

  /**
   * Recupera o rEGISTRO 0111: TABELA DE RECEITA BRUTA MENSAL PARA FINS DE RATEIO DE CRÉDITOS COMUNS.
   *
   * @return the rEGISTRO 0111: TABELA DE RECEITA BRUTA MENSAL PARA FINS DE RATEIO DE CRÉDITOS COMUNS
   */
  public SPEDContrib0111 getR0111() {
    return r0111;
  }

  /**
   * Define o rEGISTRO 0111: TABELA DE RECEITA BRUTA MENSAL PARA FINS DE RATEIO DE CRÉDITOS COMUNS.
   *
   * @param r0111 the new rEGISTRO 0111: TABELA DE RECEITA BRUTA MENSAL PARA FINS DE RATEIO DE CRÉDITOS COMUNS
   */
  public void setR0111(SPEDContrib0111 r0111) {
    this.r0111 = r0111;
  }

}