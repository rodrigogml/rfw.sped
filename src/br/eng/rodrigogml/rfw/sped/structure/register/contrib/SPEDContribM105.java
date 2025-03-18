package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO M105: DETALHAMENTO DA BASE DE CALCULO DO CR�DITO APURADO NO PER�ODO � PIS/PASEP.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribM105 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * C�digo da Base de C�lculo do Cr�dito apurado no per�odo, conforme a Tabela 4.3.7. C 002* - S
   */
  @SPEDField(maxLength = 2, minLength = 2, required = true)
  private String r02_NAT_BC_CRED = null;

  /**
   * C�digo da Situa��o Tribut�ria referente ao cr�dito de PIS/Pasep (Tabela 4.3.3) vinculado ao tipo de cr�dito escriturado em M100. N 002* - S
   */
  @SPEDField(maxLength = 2, minLength = 2, required = true)
  private BigDecimal r03_CST_PIS = null;

  /**
   * Valor Total da Base de C�lculo escriturada nos documentos e opera��es (Blocos �A�, �C�, �D� e �F�), referente ao CST_PIS informado no Campo 03. N - 02 N
   */
  @SPEDField(maxLength = 20, decimals = 2, required = false)
  private BigDecimal r04_VL_BC_PIS_TOT = null;

  /**
   * Parcela do Valor Total da Base de C�lculo informada no Campo 04, vinculada a receitas com incid�ncia cumulativa. Campo de preenchimento espec�fico para a pessoa jur�dica sujeita ao regime cumulativo e n�o-cumulativo da contribui��o (COD_INC_TRIB = 3 do Registro 0110) N - 02 N
   */
  @SPEDField(maxLength = 20, decimals = 2, required = false)
  private BigDecimal r05_VL_BC_PIS_CUM = null;

  /**
   * Valor Total da Base de C�lculo do Cr�dito, vinculada a receitas com incid�ncia n�o-cumulativa (Campo 04 � Campo 05). N - 02 N
   */
  @SPEDField(maxLength = 20, decimals = 2, required = false)
  private BigDecimal r06_VL_BC_PIS_NC = null;

  /**
   * Valor da Base de C�lculo do Cr�dito, vinculada ao tipo de Cr�dito escriturado em M100.
   * <li>Para os CST_PIS = �50�, �51�, �52�, �60�, �61� e �62�: Informar o valor do Campo 06 (VL_BC_PIS_NC);
   * <li>Para os CST_PIS = �53�, �54�, �55�, �56�, �63�, �64� �65� e �66� (Cr�dito sobre opera��es vinculadas a mais de um tipo de receita): Informar a parcela do valor do Campo 06 (VL_BC_PIS_NC) vinculada especificamente ao tipo de cr�dito escriturado em M100. O valor deste campo ser� transportado para o Campo 04 (VL_BC_PIS) do registro M100.<br>
   * N - 02 N
   */
  @SPEDField(maxLength = 20, decimals = 2, required = false)
  private BigDecimal r07_VL_BC_PIS = null;

  /**
   * Quantidade Total da Base de C�lculo do Cr�dito apurado em Unidade de Medida de Produto, escriturada nos documentos e opera��es (Blocos �A�, �C�, �D� e �F�), referente ao CST_PIS informado no Campo 03. N - 03 N
   */
  @SPEDField(maxLength = 20, decimals = 2, required = false)
  private BigDecimal r08_QUANT_BC_PIS_TOT = null;

  /**
   * Parcela da base de c�lculo do cr�dito em quantidade (campo 08) vinculada ao tipo de cr�dito escriturado em M100.
   * <li>Para os CST_PIS = �50�, �51� e �52�: Informar o valor do Campo 08 (QUANT_BC_PIS);
   * <li>Para os CST_PIS = �53�, �54�, �55� e �56� (cr�dito vinculado a mais de um tipo de receita): Informar a parcela do valor do Campo 08 (QUANT_BC_PIS) vinculada ao tipo de cr�dito escriturado em M100. O valor deste campo ser� transportado para o Campo 06 (QUANT_BC_PIS) do registro M100. <br>
   * N - 03 N
   */
  @SPEDField(maxLength = 20, decimals = 3, required = false)
  private BigDecimal r09_QUANT_BC_PIS = null;

  /**
   * Descri��o do cr�dito C 060 - N
   */
  @SPEDField(maxLength = 60, required = false)
  private String r10_DESC_CRED = null;

  @Override
  public String get01_Register() {
    return "M105";
  }

  /**
   * Recupera o c�digo da Base de C�lculo do Cr�dito apurado no per�odo, conforme a Tabela 4.3.7. C 002* - S.
   *
   * @return the c�digo da Base de C�lculo do Cr�dito apurado no per�odo, conforme a Tabela 4
   */
  public String getR02_NAT_BC_CRED() {
    return r02_NAT_BC_CRED;
  }

  /**
   * Define o c�digo da Base de C�lculo do Cr�dito apurado no per�odo, conforme a Tabela 4.3.7. C 002* - S.
   *
   * @param r02_NAT_BC_CRED the new c�digo da Base de C�lculo do Cr�dito apurado no per�odo, conforme a Tabela 4
   */
  public void setR02_NAT_BC_CRED(String r02_NAT_BC_CRED) {
    this.r02_NAT_BC_CRED = r02_NAT_BC_CRED;
  }

  /**
   * Recupera o c�digo da Situa��o Tribut�ria referente ao cr�dito de PIS/Pasep (Tabela 4.3.3) vinculado ao tipo de cr�dito escriturado em M100. N 002* - S.
   *
   * @return the c�digo da Situa��o Tribut�ria referente ao cr�dito de PIS/Pasep (Tabela 4
   */
  public BigDecimal getR03_CST_PIS() {
    return r03_CST_PIS;
  }

  /**
   * Define o c�digo da Situa��o Tribut�ria referente ao cr�dito de PIS/Pasep (Tabela 4.3.3) vinculado ao tipo de cr�dito escriturado em M100. N 002* - S.
   *
   * @param r03_CST_PIS the new c�digo da Situa��o Tribut�ria referente ao cr�dito de PIS/Pasep (Tabela 4
   */
  public void setR03_CST_PIS(BigDecimal r03_CST_PIS) {
    this.r03_CST_PIS = r03_CST_PIS;
  }

  /**
   * Recupera o valor Total da Base de C�lculo escriturada nos documentos e opera��es (Blocos �A�, �C�, �D� e �F�), referente ao CST_PIS informado no Campo 03. N - 02 N.
   *
   * @return the valor Total da Base de C�lculo escriturada nos documentos e opera��es (Blocos �A�, �C�, �D� e �F�), referente ao CST_PIS informado no Campo 03
   */
  public BigDecimal getR04_VL_BC_PIS_TOT() {
    return r04_VL_BC_PIS_TOT;
  }

  /**
   * Define o valor Total da Base de C�lculo escriturada nos documentos e opera��es (Blocos �A�, �C�, �D� e �F�), referente ao CST_PIS informado no Campo 03. N - 02 N.
   *
   * @param r04_VL_BC_PIS_TOT the new valor Total da Base de C�lculo escriturada nos documentos e opera��es (Blocos �A�, �C�, �D� e �F�), referente ao CST_PIS informado no Campo 03
   */
  public void setR04_VL_BC_PIS_TOT(BigDecimal r04_VL_BC_PIS_TOT) {
    this.r04_VL_BC_PIS_TOT = r04_VL_BC_PIS_TOT;
  }

  /**
   * Recupera o parcela do Valor Total da Base de C�lculo informada no Campo 04, vinculada a receitas com incid�ncia cumulativa. Campo de preenchimento espec�fico para a pessoa jur�dica sujeita ao regime cumulativo e n�o-cumulativo da contribui��o (COD_INC_TRIB = 3 do Registro 0110) N - 02 N.
   *
   * @return the parcela do Valor Total da Base de C�lculo informada no Campo 04, vinculada a receitas com incid�ncia cumulativa
   */
  public BigDecimal getR05_VL_BC_PIS_CUM() {
    return r05_VL_BC_PIS_CUM;
  }

  /**
   * Define o parcela do Valor Total da Base de C�lculo informada no Campo 04, vinculada a receitas com incid�ncia cumulativa. Campo de preenchimento espec�fico para a pessoa jur�dica sujeita ao regime cumulativo e n�o-cumulativo da contribui��o (COD_INC_TRIB = 3 do Registro 0110) N - 02 N.
   *
   * @param r05_VL_BC_PIS_CUM the new parcela do Valor Total da Base de C�lculo informada no Campo 04, vinculada a receitas com incid�ncia cumulativa
   */
  public void setR05_VL_BC_PIS_CUM(BigDecimal r05_VL_BC_PIS_CUM) {
    this.r05_VL_BC_PIS_CUM = r05_VL_BC_PIS_CUM;
  }

  /**
   * Recupera o valor Total da Base de C�lculo do Cr�dito, vinculada a receitas com incid�ncia n�o-cumulativa (Campo 04 � Campo 05). N - 02 N.
   *
   * @return the valor Total da Base de C�lculo do Cr�dito, vinculada a receitas com incid�ncia n�o-cumulativa (Campo 04 � Campo 05)
   */
  public BigDecimal getR06_VL_BC_PIS_NC() {
    return r06_VL_BC_PIS_NC;
  }

  /**
   * Define o valor Total da Base de C�lculo do Cr�dito, vinculada a receitas com incid�ncia n�o-cumulativa (Campo 04 � Campo 05). N - 02 N.
   *
   * @param r06_VL_BC_PIS_NC the new valor Total da Base de C�lculo do Cr�dito, vinculada a receitas com incid�ncia n�o-cumulativa (Campo 04 � Campo 05)
   */
  public void setR06_VL_BC_PIS_NC(BigDecimal r06_VL_BC_PIS_NC) {
    this.r06_VL_BC_PIS_NC = r06_VL_BC_PIS_NC;
  }

  /**
   * Recupera o valor da Base de C�lculo do Cr�dito, vinculada ao tipo de Cr�dito escriturado em M100.
   * <li>Para os CST_PIS = �50�, �51�, �52�, �60�, �61� e �62�: Informar o valor do Campo 06 (VL_BC_PIS_NC);
   * <li>Para os CST_PIS = �53�, �54�, �55�, �56�, �63�, �64� �65� e �66� (Cr�dito sobre opera��es vinculadas a mais de um tipo de receita): Informar a parcela do valor do Campo 06 (VL_BC_PIS_NC) vinculada especificamente ao tipo de cr�dito escriturado em M100. O valor deste campo ser� transportado para o Campo 04 (VL_BC_PIS) do registro M100.<br>
   * N - 02 N.
   *
   * @return the valor da Base de C�lculo do Cr�dito, vinculada ao tipo de Cr�dito escriturado em M100
   */
  public BigDecimal getR07_VL_BC_PIS() {
    return r07_VL_BC_PIS;
  }

  /**
   * Define o valor da Base de C�lculo do Cr�dito, vinculada ao tipo de Cr�dito escriturado em M100.
   * <li>Para os CST_PIS = �50�, �51�, �52�, �60�, �61� e �62�: Informar o valor do Campo 06 (VL_BC_PIS_NC);
   * <li>Para os CST_PIS = �53�, �54�, �55�, �56�, �63�, �64� �65� e �66� (Cr�dito sobre opera��es vinculadas a mais de um tipo de receita): Informar a parcela do valor do Campo 06 (VL_BC_PIS_NC) vinculada especificamente ao tipo de cr�dito escriturado em M100. O valor deste campo ser� transportado para o Campo 04 (VL_BC_PIS) do registro M100.<br>
   * N - 02 N.
   *
   * @param r07_VL_BC_PIS the new valor da Base de C�lculo do Cr�dito, vinculada ao tipo de Cr�dito escriturado em M100
   */
  public void setR07_VL_BC_PIS(BigDecimal r07_VL_BC_PIS) {
    this.r07_VL_BC_PIS = r07_VL_BC_PIS;
  }

  /**
   * Recupera o quantidade Total da Base de C�lculo do Cr�dito apurado em Unidade de Medida de Produto, escriturada nos documentos e opera��es (Blocos �A�, �C�, �D� e �F�), referente ao CST_PIS informado no Campo 03. N - 03 N.
   *
   * @return the quantidade Total da Base de C�lculo do Cr�dito apurado em Unidade de Medida de Produto, escriturada nos documentos e opera��es (Blocos �A�, �C�, �D� e �F�), referente ao CST_PIS informado no Campo 03
   */
  public BigDecimal getR08_QUANT_BC_PIS_TOT() {
    return r08_QUANT_BC_PIS_TOT;
  }

  /**
   * Define o quantidade Total da Base de C�lculo do Cr�dito apurado em Unidade de Medida de Produto, escriturada nos documentos e opera��es (Blocos �A�, �C�, �D� e �F�), referente ao CST_PIS informado no Campo 03. N - 03 N.
   *
   * @param r08_QUANT_BC_PIS_TOT the new quantidade Total da Base de C�lculo do Cr�dito apurado em Unidade de Medida de Produto, escriturada nos documentos e opera��es (Blocos �A�, �C�, �D� e �F�), referente ao CST_PIS informado no Campo 03
   */
  public void setR08_QUANT_BC_PIS_TOT(BigDecimal r08_QUANT_BC_PIS_TOT) {
    this.r08_QUANT_BC_PIS_TOT = r08_QUANT_BC_PIS_TOT;
  }

  /**
   * Recupera o parcela da base de c�lculo do cr�dito em quantidade (campo 08) vinculada ao tipo de cr�dito escriturado em M100.
   * <li>Para os CST_PIS = �50�, �51� e �52�: Informar o valor do Campo 08 (QUANT_BC_PIS);
   * <li>Para os CST_PIS = �53�, �54�, �55� e �56� (cr�dito vinculado a mais de um tipo de receita): Informar a parcela do valor do Campo 08 (QUANT_BC_PIS) vinculada ao tipo de cr�dito escriturado em M100. O valor deste campo ser� transportado para o Campo 06 (QUANT_BC_PIS) do registro M100. <br>
   * N - 03 N.
   *
   * @return the parcela da base de c�lculo do cr�dito em quantidade (campo 08) vinculada ao tipo de cr�dito escriturado em M100
   */
  public BigDecimal getR09_QUANT_BC_PIS() {
    return r09_QUANT_BC_PIS;
  }

  /**
   * Define o parcela da base de c�lculo do cr�dito em quantidade (campo 08) vinculada ao tipo de cr�dito escriturado em M100.
   * <li>Para os CST_PIS = �50�, �51� e �52�: Informar o valor do Campo 08 (QUANT_BC_PIS);
   * <li>Para os CST_PIS = �53�, �54�, �55� e �56� (cr�dito vinculado a mais de um tipo de receita): Informar a parcela do valor do Campo 08 (QUANT_BC_PIS) vinculada ao tipo de cr�dito escriturado em M100. O valor deste campo ser� transportado para o Campo 06 (QUANT_BC_PIS) do registro M100. <br>
   * N - 03 N.
   *
   * @param r09_QUANT_BC_PIS the new parcela da base de c�lculo do cr�dito em quantidade (campo 08) vinculada ao tipo de cr�dito escriturado em M100
   */
  public void setR09_QUANT_BC_PIS(BigDecimal r09_QUANT_BC_PIS) {
    this.r09_QUANT_BC_PIS = r09_QUANT_BC_PIS;
  }

  /**
   * Recupera o descri��o do cr�dito C 060 - N.
   *
   * @return the descri��o do cr�dito C 060 - N
   */
  public String getR10_DESC_CRED() {
    return r10_DESC_CRED;
  }

  /**
   * Define o descri��o do cr�dito C 060 - N.
   *
   * @param r10_DESC_CRED the new descri��o do cr�dito C 060 - N
   */
  public void setR10_DESC_CRED(String r10_DESC_CRED) {
    this.r10_DESC_CRED = r10_DESC_CRED;
  }

}