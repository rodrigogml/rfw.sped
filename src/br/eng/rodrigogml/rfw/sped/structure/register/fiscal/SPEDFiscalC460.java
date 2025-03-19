package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField.SPEDFIELDTYPE;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C460: DOCUMENTO FISCAL EMITIDO POR ECF (CÓDIGO 02, 2D e 60).<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalC460 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscalC460(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * REGISTRO C470: ITENS DO DOCUMENTO FISCAL EMITIDO POR ECF (CÓDIGO 02 e 2D)<br>
   */
  private final ArrayList<SPEDFiscalC470> rc470 = new ArrayList<SPEDFiscalC470>();

  /**
   * 02 COD_MOD Código do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002* - O
   */
  @SPEDField(maxLength = 2, minLength = 2)
  private String r02_COD_MOD = null;

  /**
   * 03 COD_SIT Código da situação do documento fiscal, conforme a Tabela 4.1.2 N 002* - O
   */
  @SPEDField(maxLength = 2, minLength = 2)
  private String r03_COD_SIT = null;

  /**
   * 04 NUM_DOC Número do documento fiscal (COO) N 009 - O
   */
  @SPEDField(maxLength = 9)
  private Integer r04_NUM_DOC = null;

  /**
   * 05 DT_DOC Data da emissão do documento fiscal N 008* - O (Não obrigatório apra cupons cancelados.)
   */
  @SPEDField(maxLength = 8, required = false)
  private LocalDate r05_DT_DOC = null;

  /**
   * 06 VL_DOC Valor total do documento fiscal N - 02 O (Não obrigatório apra cupons cancelados.)
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r06_VL_DOC = null;

  /**
   * 07 VL_PIS Valor do PIS N - 02 OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r07_VL_PIS = null;

  /**
   * 08 VL_COFINS Valor da COFINS N - 02 OC
   */
  @SPEDField(maxLength = 255, decimals = 2, required = false)
  private BigDecimal r08_VL_COFINS = null;

  /**
   * 09 CPF_CNPJ CPF ou CNPJ do adquirente N 014 - OC
   */
  @SPEDField(maxLength = 14, type = SPEDFIELDTYPE.CNPJCPF, required = false)
  private String r09_CPF_CNPJ = null;

  /**
   * 10 NOM_ADQ Nome do adquirente C 060 - OC
   */
  @SPEDField(maxLength = 255, required = false)
  private String r10_NOM_ADQ = null;

  @Override
  public String get01_Register() {
    return "C460";
  }

  /**
   * Recupera o 02 COD_MOD Código do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002* - O.
   *
   * @return the 02 COD_MOD Código do modelo do documento fiscal, conforme a Tabela 4
   */
  public String getR02_COD_MOD() {
    return r02_COD_MOD;
  }

  /**
   * Define o 02 COD_MOD Código do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002* - O.
   *
   * @param r02_COD_MOD the new 02 COD_MOD Código do modelo do documento fiscal, conforme a Tabela 4
   */
  public void setR02_COD_MOD(String r02_COD_MOD) {
    this.r02_COD_MOD = r02_COD_MOD;
  }

  /**
   * Recupera o 03 COD_SIT Código da situação do documento fiscal, conforme a Tabela 4.1.2 N 002* - O.
   *
   * @return the 03 COD_SIT Código da situação do documento fiscal, conforme a Tabela 4
   */
  public String getR03_COD_SIT() {
    return r03_COD_SIT;
  }

  /**
   * Define o 03 COD_SIT Código da situação do documento fiscal, conforme a Tabela 4.1.2 N 002* - O.
   *
   * @param r03_COD_SIT the new 03 COD_SIT Código da situação do documento fiscal, conforme a Tabela 4
   */
  public void setR03_COD_SIT(String r03_COD_SIT) {
    this.r03_COD_SIT = r03_COD_SIT;
  }

  /**
   * Recupera o 04 NUM_DOC Número do documento fiscal (COO) N 009 - O.
   *
   * @return the 04 NUM_DOC Número do documento fiscal (COO) N 009 - O
   */
  public Integer getR04_NUM_DOC() {
    return r04_NUM_DOC;
  }

  /**
   * Define o 04 NUM_DOC Número do documento fiscal (COO) N 009 - O.
   *
   * @param r04_NUM_DOC the new 04 NUM_DOC Número do documento fiscal (COO) N 009 - O
   */
  public void setR04_NUM_DOC(Integer r04_NUM_DOC) {
    this.r04_NUM_DOC = r04_NUM_DOC;
  }

  /**
   * Recupera o 05 DT_DOC Data da emissão do documento fiscal N 008* - O (Não obrigatório apra cupons cancelados.).
   *
   * @return the 05 DT_DOC Data da emissão do documento fiscal N 008* - O (Não obrigatório apra cupons cancelados
   */
  public LocalDate getR05_DT_DOC() {
    return r05_DT_DOC;
  }

  /**
   * Define o 05 DT_DOC Data da emissão do documento fiscal N 008* - O (Não obrigatório apra cupons cancelados.).
   *
   * @param r05_DT_DOC the new 05 DT_DOC Data da emissão do documento fiscal N 008* - O (Não obrigatório apra cupons cancelados
   */
  public void setR05_DT_DOC(LocalDate r05_DT_DOC) {
    this.r05_DT_DOC = r05_DT_DOC;
  }

  /**
   * Recupera o 06 VL_DOC Valor total do documento fiscal N - 02 O (Não obrigatório apra cupons cancelados.).
   *
   * @return the 06 VL_DOC Valor total do documento fiscal N - 02 O (Não obrigatório apra cupons cancelados
   */
  public BigDecimal getR06_VL_DOC() {
    return r06_VL_DOC;
  }

  /**
   * Define o 06 VL_DOC Valor total do documento fiscal N - 02 O (Não obrigatório apra cupons cancelados.).
   *
   * @param r06_VL_DOC the new 06 VL_DOC Valor total do documento fiscal N - 02 O (Não obrigatório apra cupons cancelados
   */
  public void setR06_VL_DOC(BigDecimal r06_VL_DOC) {
    this.r06_VL_DOC = r06_VL_DOC;
  }

  /**
   * Recupera o 07 VL_PIS Valor do PIS N - 02 OC.
   *
   * @return the 07 VL_PIS Valor do PIS N - 02 OC
   */
  public BigDecimal getR07_VL_PIS() {
    return r07_VL_PIS;
  }

  /**
   * Define o 07 VL_PIS Valor do PIS N - 02 OC.
   *
   * @param r07_VL_PIS the new 07 VL_PIS Valor do PIS N - 02 OC
   */
  public void setR07_VL_PIS(BigDecimal r07_VL_PIS) {
    this.r07_VL_PIS = r07_VL_PIS;
  }

  /**
   * Recupera o 08 VL_COFINS Valor da COFINS N - 02 OC.
   *
   * @return the 08 VL_COFINS Valor da COFINS N - 02 OC
   */
  public BigDecimal getR08_VL_COFINS() {
    return r08_VL_COFINS;
  }

  /**
   * Define o 08 VL_COFINS Valor da COFINS N - 02 OC.
   *
   * @param r08_VL_COFINS the new 08 VL_COFINS Valor da COFINS N - 02 OC
   */
  public void setR08_VL_COFINS(BigDecimal r08_VL_COFINS) {
    this.r08_VL_COFINS = r08_VL_COFINS;
  }

  /**
   * Recupera o 09 CPF_CNPJ CPF ou CNPJ do adquirente N 014 - OC.
   *
   * @return the 09 CPF_CNPJ CPF ou CNPJ do adquirente N 014 - OC
   */
  public String getR09_CPF_CNPJ() {
    return r09_CPF_CNPJ;
  }

  /**
   * Define o 09 CPF_CNPJ CPF ou CNPJ do adquirente N 014 - OC.
   *
   * @param r09_CPF_CNPJ the new 09 CPF_CNPJ CPF ou CNPJ do adquirente N 014 - OC
   */
  public void setR09_CPF_CNPJ(String r09_CPF_CNPJ) {
    this.r09_CPF_CNPJ = r09_CPF_CNPJ;
  }

  /**
   * Recupera o 10 NOM_ADQ Nome do adquirente C 060 - OC.
   *
   * @return the 10 NOM_ADQ Nome do adquirente C 060 - OC
   */
  public String getR10_NOM_ADQ() {
    return r10_NOM_ADQ;
  }

  /**
   * Define o 10 NOM_ADQ Nome do adquirente C 060 - OC.
   *
   * @param r10_NOM_ADQ the new 10 NOM_ADQ Nome do adquirente C 060 - OC
   */
  public void setR10_NOM_ADQ(String r10_NOM_ADQ) {
    this.r10_NOM_ADQ = r10_NOM_ADQ;
  }

  /**
   * Recupera o rEGISTRO C470: ITENS DO DOCUMENTO FISCAL EMITIDO POR ECF (CÓDIGO 02 e 2D)<br>
   * .
   *
   * @return the rEGISTRO C470: ITENS DO DOCUMENTO FISCAL EMITIDO POR ECF (CÓDIGO 02 e 2D)<br>
   */
  public ArrayList<SPEDFiscalC470> getRc470() {
    return rc470;
  }

}