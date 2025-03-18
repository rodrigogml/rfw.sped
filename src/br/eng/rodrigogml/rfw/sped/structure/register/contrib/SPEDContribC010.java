package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C010: IDENTIFICA��O DO ESTABELECIMENTO.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribC010 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * REGISTRO C100: NOTA FISCAL (C�DIGO 01), NOTA FISCAL AVULSA (C�DIGO 1B), NOTA FISCAL DE PRODUTOR (C�DIGO 04), NF-e (C�DIGO 55) e NFC-e (C�DIGO 65)<br>
   * Chave: Para NFe: CHV_NFE. Separados por "|".
   */
  private final LinkedHashMap<String, SPEDContribC100> rc100 = new LinkedHashMap<String, SPEDContribC100>();

  /**
   * REGISTRO C400: EQUIPAMENTO ECF (C�DIGO 02, 2D e 60)<br>
   * Chave: COD_MOD, ECF_MOD e ECF_FAB. Separados por "|".
   */
  private final LinkedHashMap<String, SPEDContribC400> rc400 = new LinkedHashMap<String, SPEDContribC400>();

  /**
   * REGISTRO C860: IDENTIFICA��O DO EQUIPAMENTO SAT-CF-E<br>
   * Chave: NR_SAT, DT_DOC. Separados por "|".
   */
  private final LinkedHashMap<String, SPEDContribC860> rc860 = new LinkedHashMap<String, SPEDContribC860>();

  /**
   * N�mero de inscri��o do estabelecimento no CNPJ. N 014* - S
   */
  @SPEDField(maxLength = 14, minLength = 14, required = true)
  private String r02_CNPJ = null;

  /**
   * Indicador da apura��o das contribui��es e cr�ditos, na escritura��o das opera��es por NF-e e ECF, no per�odo:
   * <li>1 � Apura��o com base nos registros de consolida��o das opera��es por NF-e (C180 e C190) e por ECF (C490);
   * <li>2 � Apura��o com base no registro individualizado de NF-e (C100 e C170) e de ECF (C400)<br>
   * C 001* - N
   */
  @SPEDField(maxLength = 1, minLength = 1, required = false)
  private String r03_IND_ESCRI = null;

  @Override
  public String get01_Register() {
    return "C010";
  }

  /**
   * Recupera o n�mero de inscri��o do estabelecimento no CNPJ. N 014* - S.
   *
   * @return the n�mero de inscri��o do estabelecimento no CNPJ
   */
  public String getR02_CNPJ() {
    return r02_CNPJ;
  }

  /**
   * Define o n�mero de inscri��o do estabelecimento no CNPJ. N 014* - S.
   *
   * @param r02_CNPJ the new n�mero de inscri��o do estabelecimento no CNPJ
   */
  public void setR02_CNPJ(String r02_CNPJ) {
    this.r02_CNPJ = r02_CNPJ;
  }

  /**
   * Recupera o indicador da apura��o das contribui��es e cr�ditos, na escritura��o das opera��es por NF-e e ECF, no per�odo:
   * <li>1 � Apura��o com base nos registros de consolida��o das opera��es por NF-e (C180 e C190) e por ECF (C490);
   * <li>2 � Apura��o com base no registro individualizado de NF-e (C100 e C170) e de ECF (C400)<br>
   * C 001* - N.
   *
   * @return the indicador da apura��o das contribui��es e cr�ditos, na escritura��o das opera��es por NF-e e ECF, no per�odo:
   *         <li>1 � Apura��o com base nos registros de consolida��o das opera��es por NF-e (C180 e C190) e por ECF (C490);
   *         <li>2 � Apura��o com base no registro individualizado de NF-e (C100 e C170) e de ECF (C400)<br>
   *         C 001* - N
   */
  public String getR03_IND_ESCRI() {
    return r03_IND_ESCRI;
  }

  /**
   * Define o indicador da apura��o das contribui��es e cr�ditos, na escritura��o das opera��es por NF-e e ECF, no per�odo:
   * <li>1 � Apura��o com base nos registros de consolida��o das opera��es por NF-e (C180 e C190) e por ECF (C490);
   * <li>2 � Apura��o com base no registro individualizado de NF-e (C100 e C170) e de ECF (C400)<br>
   * C 001* - N.
   *
   * @param r03_IND_ESCRI the new indicador da apura��o das contribui��es e cr�ditos, na escritura��o das opera��es por NF-e e ECF, no per�odo:
   *          <li>1 � Apura��o com base nos registros de consolida��o das opera��es por NF-e (C180 e C190) e por ECF (C490);
   *          <li>2 � Apura��o com base no registro individualizado de NF-e (C100 e C170) e de ECF (C400)<br>
   *          C 001* - N
   */
  public void setR03_IND_ESCRI(String r03_IND_ESCRI) {
    this.r03_IND_ESCRI = r03_IND_ESCRI;
  }

  /**
   * Recupera o rEGISTRO C100: NOTA FISCAL (C�DIGO 01), NOTA FISCAL AVULSA (C�DIGO 1B), NOTA FISCAL DE PRODUTOR (C�DIGO 04), NF-e (C�DIGO 55) e NFC-e (C�DIGO 65)<br>
   * Chave: Para NFe: CHV_NFE. Separados por "|".
   *
   * @return the rEGISTRO C100: NOTA FISCAL (C�DIGO 01), NOTA FISCAL AVULSA (C�DIGO 1B), NOTA FISCAL DE PRODUTOR (C�DIGO 04), NF-e (C�DIGO 55) e NFC-e (C�DIGO 65)<br>
   *         Chave: Para NFe: CHV_NFE
   */
  public LinkedHashMap<String, SPEDContribC100> getRc100() {
    return rc100;
  }

  /**
   * Recupera o rEGISTRO C400: EQUIPAMENTO ECF (C�DIGO 02, 2D e 60)<br>
   * Chave: COD_MOD, ECF_MOD e ECF_FAB. Separados por "|".
   *
   * @return the rEGISTRO C400: EQUIPAMENTO ECF (C�DIGO 02, 2D e 60)<br>
   *         Chave: COD_MOD, ECF_MOD e ECF_FAB
   */
  public LinkedHashMap<String, SPEDContribC400> getRc400() {
    return rc400;
  }

  /**
   * Recupera o rEGISTRO C860: IDENTIFICA��O DO EQUIPAMENTO SAT-CF-E<br>
   * Chave: NR_SAT, DT_DOC. Separados por "|".
   *
   * @return the rEGISTRO C860: IDENTIFICA��O DO EQUIPAMENTO SAT-CF-E<br>
   *         Chave: NR_SAT, DT_DOC
   */
  public LinkedHashMap<String, SPEDContribC860> getRc860() {
    return rc860;
  }

}