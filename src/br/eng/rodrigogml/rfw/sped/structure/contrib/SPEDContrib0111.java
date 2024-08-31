package br.eng.rodrigogml.rfw.sped.structure.contrib;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO 0111: TABELA DE RECEITA BRUTA MENSAL PARA FINS DE RATEIO DE CR�DITOS COMUNS.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContrib0111 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * Receita Bruta N�o-Cumulativa - Tributada no Mercado Interno N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r02_REC_BRU_NCUM_TRIB_MI = null;

  /**
   * Receita Bruta N�o-Cumulativa � N�o Tributada no Mercado Interno (Vendas com suspens�o, al�quota zero, isen��o e sem incid�ncia das contribui��es) N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r03_REC_BRU_NCUM_NT_MI = null;

  /**
   * Receita Bruta N�o-Cumulativa � Exporta��o N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r04_REC_BRU_NCUM_EXP = null;

  /**
   * Receita Bruta Cumulativa N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r05_REC_BRU_CUM = null;

  /**
   * Receita Bruta Total N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r06_REC_BRU_TOTAL = null;

  @Override
  public String get01_Register() {
    return "0111";
  }

  /**
   * Recupera o receita Bruta N�o-Cumulativa - Tributada no Mercado Interno N - 02 S.
   *
   * @return the receita Bruta N�o-Cumulativa - Tributada no Mercado Interno N - 02 S
   */
  public BigDecimal getR02_REC_BRU_NCUM_TRIB_MI() {
    return r02_REC_BRU_NCUM_TRIB_MI;
  }

  /**
   * Define o receita Bruta N�o-Cumulativa - Tributada no Mercado Interno N - 02 S.
   *
   * @param r02_REC_BRU_NCUM_TRIB_MI the new receita Bruta N�o-Cumulativa - Tributada no Mercado Interno N - 02 S
   */
  public void setR02_REC_BRU_NCUM_TRIB_MI(BigDecimal r02_REC_BRU_NCUM_TRIB_MI) {
    this.r02_REC_BRU_NCUM_TRIB_MI = r02_REC_BRU_NCUM_TRIB_MI;
  }

  /**
   * Recupera o receita Bruta N�o-Cumulativa � N�o Tributada no Mercado Interno (Vendas com suspens�o, al�quota zero, isen��o e sem incid�ncia das contribui��es) N - 02 S.
   *
   * @return the receita Bruta N�o-Cumulativa � N�o Tributada no Mercado Interno (Vendas com suspens�o, al�quota zero, isen��o e sem incid�ncia das contribui��es) N - 02 S
   */
  public BigDecimal getR03_REC_BRU_NCUM_NT_MI() {
    return r03_REC_BRU_NCUM_NT_MI;
  }

  /**
   * Define o receita Bruta N�o-Cumulativa � N�o Tributada no Mercado Interno (Vendas com suspens�o, al�quota zero, isen��o e sem incid�ncia das contribui��es) N - 02 S.
   *
   * @param r03_REC_BRU_NCUM_NT_MI the new receita Bruta N�o-Cumulativa � N�o Tributada no Mercado Interno (Vendas com suspens�o, al�quota zero, isen��o e sem incid�ncia das contribui��es) N - 02 S
   */
  public void setR03_REC_BRU_NCUM_NT_MI(BigDecimal r03_REC_BRU_NCUM_NT_MI) {
    this.r03_REC_BRU_NCUM_NT_MI = r03_REC_BRU_NCUM_NT_MI;
  }

  /**
   * Recupera o receita Bruta N�o-Cumulativa � Exporta��o N - 02 S.
   *
   * @return the receita Bruta N�o-Cumulativa � Exporta��o N - 02 S
   */
  public BigDecimal getR04_REC_BRU_NCUM_EXP() {
    return r04_REC_BRU_NCUM_EXP;
  }

  /**
   * Define o receita Bruta N�o-Cumulativa � Exporta��o N - 02 S.
   *
   * @param r04_REC_BRU_NCUM_EXP the new receita Bruta N�o-Cumulativa � Exporta��o N - 02 S
   */
  public void setR04_REC_BRU_NCUM_EXP(BigDecimal r04_REC_BRU_NCUM_EXP) {
    this.r04_REC_BRU_NCUM_EXP = r04_REC_BRU_NCUM_EXP;
  }

  /**
   * Recupera o receita Bruta Cumulativa N - 02 S.
   *
   * @return the receita Bruta Cumulativa N - 02 S
   */
  public BigDecimal getR05_REC_BRU_CUM() {
    return r05_REC_BRU_CUM;
  }

  /**
   * Define o receita Bruta Cumulativa N - 02 S.
   *
   * @param r05_REC_BRU_CUM the new receita Bruta Cumulativa N - 02 S
   */
  public void setR05_REC_BRU_CUM(BigDecimal r05_REC_BRU_CUM) {
    this.r05_REC_BRU_CUM = r05_REC_BRU_CUM;
  }

  /**
   * Recupera o receita Bruta Total N - 02 S.
   *
   * @return the receita Bruta Total N - 02 S
   */
  public BigDecimal getR06_REC_BRU_TOTAL() {
    return r06_REC_BRU_TOTAL;
  }

  /**
   * Define o receita Bruta Total N - 02 S.
   *
   * @param r06_REC_BRU_TOTAL the new receita Bruta Total N - 02 S
   */
  public void setR06_REC_BRU_TOTAL(BigDecimal r06_REC_BRU_TOTAL) {
    this.r06_REC_BRU_TOTAL = r06_REC_BRU_TOTAL;
  }

}