package br.eng.rodrigogml.rfw.sped.structure.contrib;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO M605: COFINS A RECOLHER � DETALHAMENTO POR C�DIGO DE RECEITA.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribM605 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * Informar o n�mero do campo do registro �M600� (Campo 08 (contribui��o n�o cumulativa) ou Campo 12 (contribui��o cumulativa)), objeto de detalhamento neste registro. C 002* - S
   */
  @SPEDField(maxLength = 2, minLength = 2, required = true)
  private String r02_NUM_CAMPO = null;

  /**
   * Informar o c�digo da receita referente � contribui��o a recolher, detalhada neste registro. C 006* - S
   */
  @SPEDField(maxLength = 6, minLength = 6, required = true)
  private String r03_COD_REC = null;

  /**
   * Valor do D�bito correspondente ao c�digo do Campo 03, conforme informa��o na DCTF. N - 02 S
   */
  @SPEDField(maxLength = 20, decimals = 2, required = true)
  private BigDecimal r04_VL_DEBITO = null;

  @Override
  public String get01_Register() {
    return "M605";
  }

  /**
   * Recupera o informar o n�mero do campo do registro �M600� (Campo 08 (contribui��o n�o cumulativa) ou Campo 12 (contribui��o cumulativa)), objeto de detalhamento neste registro. C 002* - S.
   *
   * @return the informar o n�mero do campo do registro �M600� (Campo 08 (contribui��o n�o cumulativa) ou Campo 12 (contribui��o cumulativa)), objeto de detalhamento neste registro
   */
  public String getR02_NUM_CAMPO() {
    return r02_NUM_CAMPO;
  }

  /**
   * Define o informar o n�mero do campo do registro �M600� (Campo 08 (contribui��o n�o cumulativa) ou Campo 12 (contribui��o cumulativa)), objeto de detalhamento neste registro. C 002* - S.
   *
   * @param r02_NUM_CAMPO the new informar o n�mero do campo do registro �M600� (Campo 08 (contribui��o n�o cumulativa) ou Campo 12 (contribui��o cumulativa)), objeto de detalhamento neste registro
   */
  public void setR02_NUM_CAMPO(String r02_NUM_CAMPO) {
    this.r02_NUM_CAMPO = r02_NUM_CAMPO;
  }

  /**
   * Recupera o informar o c�digo da receita referente � contribui��o a recolher, detalhada neste registro. C 006* - S.
   *
   * @return the informar o c�digo da receita referente � contribui��o a recolher, detalhada neste registro
   */
  public String getR03_COD_REC() {
    return r03_COD_REC;
  }

  /**
   * Define o informar o c�digo da receita referente � contribui��o a recolher, detalhada neste registro. C 006* - S.
   *
   * @param r03_COD_REC the new informar o c�digo da receita referente � contribui��o a recolher, detalhada neste registro
   */
  public void setR03_COD_REC(String r03_COD_REC) {
    this.r03_COD_REC = r03_COD_REC;
  }

  /**
   * Recupera o valor do D�bito correspondente ao c�digo do Campo 03, conforme informa��o na DCTF. N - 02 S.
   *
   * @return the valor do D�bito correspondente ao c�digo do Campo 03, conforme informa��o na DCTF
   */
  public BigDecimal getR04_VL_DEBITO() {
    return r04_VL_DEBITO;
  }

  /**
   * Define o valor do D�bito correspondente ao c�digo do Campo 03, conforme informa��o na DCTF. N - 02 S.
   *
   * @param r04_VL_DEBITO the new valor do D�bito correspondente ao c�digo do Campo 03, conforme informa��o na DCTF
   */
  public void setR04_VL_DEBITO(BigDecimal r04_VL_DEBITO) {
    this.r04_VL_DEBITO = r04_VL_DEBITO;
  }

}