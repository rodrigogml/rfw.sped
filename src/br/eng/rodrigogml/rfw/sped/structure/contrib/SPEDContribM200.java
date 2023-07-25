package br.eng.rodrigogml.rfw.sped.structure.contrib;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO M200: CONSOLIDA��O DA CONTRIBUI��O PARA O PIS/PASEP DO PER�ODO.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribM200 extends SPEDRegister {

  /**
   * REGISTRO M205: CONTRIBUI��O PARA O PIS/PASEP A RECOLHER � DETALHAMENTO POR C�DIGO DE RECEITA <br>
   * Chave: "08" em caso de Contribui��o n�o cumulativa / "12" em caso de contribui��o cumulativa
   */
  private final LinkedHashMap<String, SPEDContribM205> rm205 = new LinkedHashMap<String, SPEDContribM205>();

  /**
   * REGISTRO M210: DETALHAMENTO DA CONTRIBUI��O PARA O PIS/PASEP DO PER�ODO<br>
   * Chave: COD_CONT + ALIQ_PIS_QUANT + ALIQ_PIS. Separados por "|".
   */
  private final LinkedHashMap<String, SPEDContribM210> rm210 = new LinkedHashMap<String, SPEDContribM210>();
  /**
   * Valor Total da Contribui��o N�o Cumulativa do Per�odo (recuperado do campo 13 do Registro M210, quando o campo �COD_CONT� = 01, 02, 03, 04, 32 e 71) N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r02_VL_TOT_CONT_NC_PER = null;

  /**
   * Valor do Cr�dito Descontado, Apurado no Pr�prio Per�odo da Escritura��o (recuperado do campo 14 do Registro M100) N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r03_VL_TOT_CRED_DESC = null;

  /**
   * Valor do Cr�dito Descontado, Apurado em Per�odo de Apura��o Anterior (recuperado do campo 13 do Registro 1100) N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r04_VL_TOT_CRED_DESC_ANT = null;

  /**
   * Valor Total da Contribui��o N�o Cumulativa Devida (02 � 03 - 04) N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r05_VL_TOT_CONT_NC_DEV = null;

  /**
   * Valor Retido na Fonte Deduzido no Per�odo N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r06_VL_RET_NC = null;

  /**
   * Outras Dedu��es no Per�odo N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r07_VL_OUT_DED_NC = null;

  /**
   * Valor da Contribui��o N�o Cumulativa a Recolher/Pagar (05 � 06 - 07) N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r08_VL_CONT_NC_REC = null;

  /**
   * Valor Total da Contribui��o Cumulativa do Per�odo (recuperado do campo 13 do Registro M210, quando o campo �COD_CONT� = 31, 32, 51, 52, 53, 54 e 72) N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r09_VL_TOT_CONT_CUM_PER = null;

  /**
   * Valor Retido na Fonte Deduzido no Per�odo N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r10_VL_RET_CUM = null;

  /**
   * Outras Dedu��es no Per�odo N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r11_VL_OUT_DED_CUM = null;

  /**
   * Valor da Contribui��o Cumulativa a Recolher/Pagar (09 - 10 � 11) N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r12_VL_CONT_CUM_REC = null;

  /**
   * Valor Total da Contribui��o a Recolher/Pagar no Per�odo (08 + 12) N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r13_VL_TOT_CONT_REC = null;

  @Override
  public String get01_Register() {
    return "M200";
  }

  /**
   * Recupera o valor Total da Contribui��o N�o Cumulativa do Per�odo (recuperado do campo 13 do Registro M210, quando o campo �COD_CONT� = 01, 02, 03, 04, 32 e 71) N - 02 S.
   *
   * @return the valor Total da Contribui��o N�o Cumulativa do Per�odo (recuperado do campo 13 do Registro M210, quando o campo �COD_CONT� = 01, 02, 03, 04, 32 e 71) N - 02 S
   */
  public BigDecimal getR02_VL_TOT_CONT_NC_PER() {
    return r02_VL_TOT_CONT_NC_PER;
  }

  /**
   * Define o valor Total da Contribui��o N�o Cumulativa do Per�odo (recuperado do campo 13 do Registro M210, quando o campo �COD_CONT� = 01, 02, 03, 04, 32 e 71) N - 02 S.
   *
   * @param r02_VL_TOT_CONT_NC_PER the new valor Total da Contribui��o N�o Cumulativa do Per�odo (recuperado do campo 13 do Registro M210, quando o campo �COD_CONT� = 01, 02, 03, 04, 32 e 71) N - 02 S
   */
  public void setR02_VL_TOT_CONT_NC_PER(BigDecimal r02_VL_TOT_CONT_NC_PER) {
    this.r02_VL_TOT_CONT_NC_PER = r02_VL_TOT_CONT_NC_PER;
  }

  /**
   * Recupera o valor do Cr�dito Descontado, Apurado no Pr�prio Per�odo da Escritura��o (recuperado do campo 14 do Registro M100) N - 02 S.
   *
   * @return the valor do Cr�dito Descontado, Apurado no Pr�prio Per�odo da Escritura��o (recuperado do campo 14 do Registro M100) N - 02 S
   */
  public BigDecimal getR03_VL_TOT_CRED_DESC() {
    return r03_VL_TOT_CRED_DESC;
  }

  /**
   * Define o valor do Cr�dito Descontado, Apurado no Pr�prio Per�odo da Escritura��o (recuperado do campo 14 do Registro M100) N - 02 S.
   *
   * @param r03_VL_TOT_CRED_DESC the new valor do Cr�dito Descontado, Apurado no Pr�prio Per�odo da Escritura��o (recuperado do campo 14 do Registro M100) N - 02 S
   */
  public void setR03_VL_TOT_CRED_DESC(BigDecimal r03_VL_TOT_CRED_DESC) {
    this.r03_VL_TOT_CRED_DESC = r03_VL_TOT_CRED_DESC;
  }

  /**
   * Recupera o valor do Cr�dito Descontado, Apurado em Per�odo de Apura��o Anterior (recuperado do campo 13 do Registro 1100) N - 02 S.
   *
   * @return the valor do Cr�dito Descontado, Apurado em Per�odo de Apura��o Anterior (recuperado do campo 13 do Registro 1100) N - 02 S
   */
  public BigDecimal getR04_VL_TOT_CRED_DESC_ANT() {
    return r04_VL_TOT_CRED_DESC_ANT;
  }

  /**
   * Define o valor do Cr�dito Descontado, Apurado em Per�odo de Apura��o Anterior (recuperado do campo 13 do Registro 1100) N - 02 S.
   *
   * @param r04_VL_TOT_CRED_DESC_ANT the new valor do Cr�dito Descontado, Apurado em Per�odo de Apura��o Anterior (recuperado do campo 13 do Registro 1100) N - 02 S
   */
  public void setR04_VL_TOT_CRED_DESC_ANT(BigDecimal r04_VL_TOT_CRED_DESC_ANT) {
    this.r04_VL_TOT_CRED_DESC_ANT = r04_VL_TOT_CRED_DESC_ANT;
  }

  /**
   * Recupera o valor Total da Contribui��o N�o Cumulativa Devida (02 � 03 - 04) N - 02 S.
   *
   * @return the valor Total da Contribui��o N�o Cumulativa Devida (02 � 03 - 04) N - 02 S
   */
  public BigDecimal getR05_VL_TOT_CONT_NC_DEV() {
    return r05_VL_TOT_CONT_NC_DEV;
  }

  /**
   * Define o valor Total da Contribui��o N�o Cumulativa Devida (02 � 03 - 04) N - 02 S.
   *
   * @param r05_VL_TOT_CONT_NC_DEV the new valor Total da Contribui��o N�o Cumulativa Devida (02 � 03 - 04) N - 02 S
   */
  public void setR05_VL_TOT_CONT_NC_DEV(BigDecimal r05_VL_TOT_CONT_NC_DEV) {
    this.r05_VL_TOT_CONT_NC_DEV = r05_VL_TOT_CONT_NC_DEV;
  }

  /**
   * Recupera o valor Retido na Fonte Deduzido no Per�odo N - 02 S.
   *
   * @return the valor Retido na Fonte Deduzido no Per�odo N - 02 S
   */
  public BigDecimal getR06_VL_RET_NC() {
    return r06_VL_RET_NC;
  }

  /**
   * Define o valor Retido na Fonte Deduzido no Per�odo N - 02 S.
   *
   * @param r06_VL_RET_NC the new valor Retido na Fonte Deduzido no Per�odo N - 02 S
   */
  public void setR06_VL_RET_NC(BigDecimal r06_VL_RET_NC) {
    this.r06_VL_RET_NC = r06_VL_RET_NC;
  }

  /**
   * Recupera o outras Dedu��es no Per�odo N - 02 S.
   *
   * @return the outras Dedu��es no Per�odo N - 02 S
   */
  public BigDecimal getR07_VL_OUT_DED_NC() {
    return r07_VL_OUT_DED_NC;
  }

  /**
   * Define o outras Dedu��es no Per�odo N - 02 S.
   *
   * @param r07_VL_OUT_DED_NC the new outras Dedu��es no Per�odo N - 02 S
   */
  public void setR07_VL_OUT_DED_NC(BigDecimal r07_VL_OUT_DED_NC) {
    this.r07_VL_OUT_DED_NC = r07_VL_OUT_DED_NC;
  }

  /**
   * Recupera o valor da Contribui��o N�o Cumulativa a Recolher/Pagar (05 � 06 - 07) N - 02 S.
   *
   * @return the valor da Contribui��o N�o Cumulativa a Recolher/Pagar (05 � 06 - 07) N - 02 S
   */
  public BigDecimal getR08_VL_CONT_NC_REC() {
    return r08_VL_CONT_NC_REC;
  }

  /**
   * Define o valor da Contribui��o N�o Cumulativa a Recolher/Pagar (05 � 06 - 07) N - 02 S.
   *
   * @param r08_VL_CONT_NC_REC the new valor da Contribui��o N�o Cumulativa a Recolher/Pagar (05 � 06 - 07) N - 02 S
   */
  public void setR08_VL_CONT_NC_REC(BigDecimal r08_VL_CONT_NC_REC) {
    this.r08_VL_CONT_NC_REC = r08_VL_CONT_NC_REC;
  }

  /**
   * Recupera o valor Total da Contribui��o Cumulativa do Per�odo (recuperado do campo 13 do Registro M210, quando o campo �COD_CONT� = 31, 32, 51, 52, 53, 54 e 72) N - 02 S.
   *
   * @return the valor Total da Contribui��o Cumulativa do Per�odo (recuperado do campo 13 do Registro M210, quando o campo �COD_CONT� = 31, 32, 51, 52, 53, 54 e 72) N - 02 S
   */
  public BigDecimal getR09_VL_TOT_CONT_CUM_PER() {
    return r09_VL_TOT_CONT_CUM_PER;
  }

  /**
   * Define o valor Total da Contribui��o Cumulativa do Per�odo (recuperado do campo 13 do Registro M210, quando o campo �COD_CONT� = 31, 32, 51, 52, 53, 54 e 72) N - 02 S.
   *
   * @param r09_VL_TOT_CONT_CUM_PER the new valor Total da Contribui��o Cumulativa do Per�odo (recuperado do campo 13 do Registro M210, quando o campo �COD_CONT� = 31, 32, 51, 52, 53, 54 e 72) N - 02 S
   */
  public void setR09_VL_TOT_CONT_CUM_PER(BigDecimal r09_VL_TOT_CONT_CUM_PER) {
    this.r09_VL_TOT_CONT_CUM_PER = r09_VL_TOT_CONT_CUM_PER;
  }

  /**
   * Recupera o valor Retido na Fonte Deduzido no Per�odo N - 02 S.
   *
   * @return the valor Retido na Fonte Deduzido no Per�odo N - 02 S
   */
  public BigDecimal getR10_VL_RET_CUM() {
    return r10_VL_RET_CUM;
  }

  /**
   * Define o valor Retido na Fonte Deduzido no Per�odo N - 02 S.
   *
   * @param r10_VL_RET_CUM the new valor Retido na Fonte Deduzido no Per�odo N - 02 S
   */
  public void setR10_VL_RET_CUM(BigDecimal r10_VL_RET_CUM) {
    this.r10_VL_RET_CUM = r10_VL_RET_CUM;
  }

  /**
   * Recupera o outras Dedu��es no Per�odo N - 02 S.
   *
   * @return the outras Dedu��es no Per�odo N - 02 S
   */
  public BigDecimal getR11_VL_OUT_DED_CUM() {
    return r11_VL_OUT_DED_CUM;
  }

  /**
   * Define o outras Dedu��es no Per�odo N - 02 S.
   *
   * @param r11_VL_OUT_DED_CUM the new outras Dedu��es no Per�odo N - 02 S
   */
  public void setR11_VL_OUT_DED_CUM(BigDecimal r11_VL_OUT_DED_CUM) {
    this.r11_VL_OUT_DED_CUM = r11_VL_OUT_DED_CUM;
  }

  /**
   * Recupera o valor da Contribui��o Cumulativa a Recolher/Pagar (09 - 10 � 11) N - 02 S.
   *
   * @return the valor da Contribui��o Cumulativa a Recolher/Pagar (09 - 10 � 11) N - 02 S
   */
  public BigDecimal getR12_VL_CONT_CUM_REC() {
    return r12_VL_CONT_CUM_REC;
  }

  /**
   * Define o valor da Contribui��o Cumulativa a Recolher/Pagar (09 - 10 � 11) N - 02 S.
   *
   * @param r12_VL_CONT_CUM_REC the new valor da Contribui��o Cumulativa a Recolher/Pagar (09 - 10 � 11) N - 02 S
   */
  public void setR12_VL_CONT_CUM_REC(BigDecimal r12_VL_CONT_CUM_REC) {
    this.r12_VL_CONT_CUM_REC = r12_VL_CONT_CUM_REC;
  }

  /**
   * Recupera o valor Total da Contribui��o a Recolher/Pagar no Per�odo (08 + 12) N - 02 S.
   *
   * @return the valor Total da Contribui��o a Recolher/Pagar no Per�odo (08 + 12) N - 02 S
   */
  public BigDecimal getR13_VL_TOT_CONT_REC() {
    return r13_VL_TOT_CONT_REC;
  }

  /**
   * Define o valor Total da Contribui��o a Recolher/Pagar no Per�odo (08 + 12) N - 02 S.
   *
   * @param r13_VL_TOT_CONT_REC the new valor Total da Contribui��o a Recolher/Pagar no Per�odo (08 + 12) N - 02 S
   */
  public void setR13_VL_TOT_CONT_REC(BigDecimal r13_VL_TOT_CONT_REC) {
    this.r13_VL_TOT_CONT_REC = r13_VL_TOT_CONT_REC;
  }

  /**
   * Recupera o rEGISTRO M205: CONTRIBUI��O PARA O PIS/PASEP A RECOLHER � DETALHAMENTO POR C�DIGO DE RECEITA <br>
   * Chave: "08" em caso de Contribui��o n�o cumulativa / "12" em caso de contribui��o cumulativa.
   *
   * @return the rEGISTRO M205: CONTRIBUI��O PARA O PIS/PASEP A RECOLHER � DETALHAMENTO POR C�DIGO DE RECEITA <br>
   *         Chave: "08" em caso de Contribui��o n�o cumulativa / "12" em caso de contribui��o cumulativa
   */
  public LinkedHashMap<String, SPEDContribM205> getRm205() {
    return rm205;
  }

  /**
   * Recupera o rEGISTRO M210: DETALHAMENTO DA CONTRIBUI��O PARA O PIS/PASEP DO PER�ODO<br>
   * Chave: COD_CONT + ALIQ_PIS_QUANT + ALIQ_PIS. Separados por "|".
   *
   * @return the rEGISTRO M210: DETALHAMENTO DA CONTRIBUI��O PARA O PIS/PASEP DO PER�ODO<br>
   *         Chave: COD_CONT + ALIQ_PIS_QUANT + ALIQ_PIS
   */
  public LinkedHashMap<String, SPEDContribM210> getRm210() {
    return rm210;
  }

}