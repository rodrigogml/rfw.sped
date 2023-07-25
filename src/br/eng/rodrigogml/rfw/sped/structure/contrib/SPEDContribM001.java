package br.eng.rodrigogml.rfw.sped.structure.contrib;

import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO M001: ABERTURA DO BLOCO M.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribM001 extends SPEDRegister {

  /**
   * REGISTRO M100: CRÉDITO DE PIS/PASEP RELATIVO AO PERÍODO<br>
   * Chave: r02_COD_CRED
   */
  private final LinkedHashMap<String, SPEDContribM100> rm100 = new LinkedHashMap<String, SPEDContribM100>();

  /**
   * REGISTRO M200: CONSOLIDAÇÃO DA CONTRIBUIÇÃO PARA O PIS/PASEP DO PERÍODO
   */
  private SPEDContribM200 rm200 = null;

  /**
   * REGISTRO M400: RECEITAS ISENTAS, NÃO ALCANÇADAS PELA INCIDÊNCIA DA CONTRIBUIÇÃO, SUJEITAS A ALÍQUOTA ZERO OU DE VENDAS COM SUSPENSÃO – PIS/PASEP<br>
   * Chave: CST do PIS
   */
  private final LinkedHashMap<String, SPEDContribM400> rm400 = new LinkedHashMap<String, SPEDContribM400>();

  /**
   * REGISTRO M600: CONSOLIDAÇÃO DA CONTRIBUIÇÃO PARA A SEGURIDADE SOCIAL - COFINS DO PERÍODO
   *
   */
  private SPEDContribM600 rm600 = null;

  /**
   * REGISTRO M800: RECEITAS ISENTAS, NÃO ALCANÇADAS PELA INCIDÊNCIA DA CONTRIBUIÇÃO, SUJEITAS A ALÍQUOTA ZERO OU DE VENDAS COM SUSPENSÃO – COFINS<br>
   * Chave: CST do PIS
   */
  private final LinkedHashMap<String, SPEDContribM800> rm800 = new LinkedHashMap<String, SPEDContribM800>();

  /**
   * Indicador de movimento:
   * <li>0- Bloco com dados informados;
   * <li>1- Bloco sem dados informados<br>
   * C 001 - S
   */
  @SPEDField(maxLength = 1, minLength = 1, required = true)
  private String r02_IND_MOV = null;

  @Override
  public String get01_Register() {
    return "M001";
  }

  /**
   * Recupera o indicador de movimento:
   * <li>0- Bloco com dados informados;
   * <li>1- Bloco sem dados informados<br>
   * C 001 - S.
   *
   * @return the indicador de movimento:
   *         <li>0- Bloco com dados informados;
   *         <li>1- Bloco sem dados informados<br>
   *         C 001 - S
   */
  public String getR02_IND_MOV() {
    return r02_IND_MOV;
  }

  /**
   * Define o indicador de movimento:
   * <li>0- Bloco com dados informados;
   * <li>1- Bloco sem dados informados<br>
   * C 001 - S.
   *
   * @param r02_IND_MOV the new indicador de movimento:
   *          <li>0- Bloco com dados informados;
   *          <li>1- Bloco sem dados informados<br>
   *          C 001 - S
   */
  public void setR02_IND_MOV(String r02_IND_MOV) {
    this.r02_IND_MOV = r02_IND_MOV;
  }

  /**
   * Recupera o rEGISTRO M200: CONSOLIDAÇÃO DA CONTRIBUIÇÃO PARA O PIS/PASEP DO PERÍODO.
   *
   * @return the rEGISTRO M200: CONSOLIDAÇÃO DA CONTRIBUIÇÃO PARA O PIS/PASEP DO PERÍODO
   */
  public SPEDContribM200 getRm200() {
    return rm200;
  }

  /**
   * Define o rEGISTRO M200: CONSOLIDAÇÃO DA CONTRIBUIÇÃO PARA O PIS/PASEP DO PERÍODO.
   *
   * @param rm200 the new rEGISTRO M200: CONSOLIDAÇÃO DA CONTRIBUIÇÃO PARA O PIS/PASEP DO PERÍODO
   */
  public void setRm200(SPEDContribM200 rm200) {
    this.rm200 = rm200;
  }

  /**
   * Recupera o rEGISTRO M400: RECEITAS ISENTAS, NÃO ALCANÇADAS PELA INCIDÊNCIA DA CONTRIBUIÇÃO, SUJEITAS A ALÍQUOTA ZERO OU DE VENDAS COM SUSPENSÃO – PIS/PASEP<br>
   * Chave: CST do PIS.
   *
   * @return the rEGISTRO M400: RECEITAS ISENTAS, NÃO ALCANÇADAS PELA INCIDÊNCIA DA CONTRIBUIÇÃO, SUJEITAS A ALÍQUOTA ZERO OU DE VENDAS COM SUSPENSÃO – PIS/PASEP<br>
   *         Chave: CST do PIS
   */
  public LinkedHashMap<String, SPEDContribM400> getRm400() {
    return rm400;
  }

  /**
   * Recupera o rEGISTRO M600: CONSOLIDAÇÃO DA CONTRIBUIÇÃO PARA A SEGURIDADE SOCIAL - COFINS DO PERÍODO.
   *
   * @return the rEGISTRO M600: CONSOLIDAÇÃO DA CONTRIBUIÇÃO PARA A SEGURIDADE SOCIAL - COFINS DO PERÍODO
   */
  public SPEDContribM600 getRm600() {
    return rm600;
  }

  /**
   * Define o rEGISTRO M600: CONSOLIDAÇÃO DA CONTRIBUIÇÃO PARA A SEGURIDADE SOCIAL - COFINS DO PERÍODO.
   *
   * @param rm600 the new rEGISTRO M600: CONSOLIDAÇÃO DA CONTRIBUIÇÃO PARA A SEGURIDADE SOCIAL - COFINS DO PERÍODO
   */
  public void setRm600(SPEDContribM600 rm600) {
    this.rm600 = rm600;
  }

  /**
   * Recupera o rEGISTRO M800: RECEITAS ISENTAS, NÃO ALCANÇADAS PELA INCIDÊNCIA DA CONTRIBUIÇÃO, SUJEITAS A ALÍQUOTA ZERO OU DE VENDAS COM SUSPENSÃO – COFINS<br>
   * Chave: CST do PIS.
   *
   * @return the rEGISTRO M800: RECEITAS ISENTAS, NÃO ALCANÇADAS PELA INCIDÊNCIA DA CONTRIBUIÇÃO, SUJEITAS A ALÍQUOTA ZERO OU DE VENDAS COM SUSPENSÃO – COFINS<br>
   *         Chave: CST do PIS
   */
  public LinkedHashMap<String, SPEDContribM800> getRm800() {
    return rm800;
  }

  /**
   * Recupera o rEGISTRO M100: CRÉDITO DE PIS/PASEP RELATIVO AO PERÍODO<br>
   * Chave: r02_COD_CRED.
   *
   * @return the rEGISTRO M100: CRÉDITO DE PIS/PASEP RELATIVO AO PERÍODO<br>
   *         Chave: r02_COD_CRED
   */
  public LinkedHashMap<String, SPEDContribM100> getRm100() {
    return rm100;
  }
}