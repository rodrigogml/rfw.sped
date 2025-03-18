package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO 0200: TABELA DE IDENTIFICA��O DO ITEM (PRODUTO E SERVI�OS).<br>
 *
 * @author Rodrigo Leit�o
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscal0200 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  /**
   * 02 COD_ITEM C�digo do item C 060 - O
   */
  @SPEDField(maxLength = 60)
  private String r02_COD_ITEM = null;

  /**
   * 03 DESCR_ITEM Descri��o do item C - - O
   */
  @SPEDField(maxLength = 255)
  private String r03_DESCR_ITEM = null;

  /**
   * 04 COD_BARRA Representa��o alfanum�rico do c�digo de barra do produto, se houver C - - OC
   */
  @SPEDField(maxLength = 255, required = false)
  private String r04_COD_BARRA = null;

  /**
   * 05 COD_ANT_ITEM C�digo anterior do item com rela��o � �ltima informa��o apresentada. C 060 - N
   */
  @SPEDField(maxLength = 60, required = false)
  private String r05_COD_ANT_ITEM = null;

  /**
   * 06 UNID_INV Unidade de medida utilizada na quantifica��o de estoques. C 006 - O
   */
  @SPEDField(maxLength = 6)
  private String r06_UNID_INV = null;

  /**
   * 07 TIPO_ITEM Tipo do item � Atividades Industriais, Comerciais e Servi�os:<br>
   * 00 � Mercadoria para Revenda;<br>
   * 01 � Mat�ria-Prima;<br>
   * 02 � Embalagem;<br>
   * 03 � Produto em Processo;<br>
   * 04 � Produto Acabado;<br>
   * 05 � Subproduto;<br>
   * 06 � Produto Intermedi�rio;<br>
   * 07 � Material de Uso e Consumo;<br>
   * 08 � Ativo Imobilizado;<br>
   * 09 � Servi�os;<br>
   * 10 � Outros insumos;<br>
   * 99 � Outras<br>
   * N 2 - O
   */
  @SPEDField(maxLength = 2)
  private String r07_TIPO_ITEM = null;

  /**
   * 08 COD_NCM C�digo da Nomenclatura Comum do Mercosul C 008* - OC
   */
  @SPEDField(maxLength = 8, minLength = 8, required = false)
  private String r08_COD_NCM = null;

  /**
   * 09 EX_IPI C�digo EX, conforme a TIPI C 003 - OC
   */
  @SPEDField(maxLength = 3, required = false)
  private String r09_EX_IPI = null;

  /**
   * 10 COD_GEN C�digo do g�nero do item, conforme a Tabela 4.2.1 N 002* - OC
   */
  @SPEDField(maxLength = 2, minLength = 2, required = false)
  private String r10_COD_GEN = null;

  /**
   * 11 COD_LST C�digo do servi�o conforme lista do Anexo I da Lei Complementar Federal n� 116/03. C 005 OC
   */
  @SPEDField(maxLength = 5, required = false)
  private String r11_COD_LST = null;

  /**
   * 12 ALIQ_ICMS Al�quota de ICMS aplic�vel ao item nas opera��es internas N 006 02 OC
   */
  @SPEDField(maxLength = 6, decimals = 2, required = false)
  private BigDecimal r12_ALIQ_ICMS = null;

  /**
   * 13 CEST C�digo Especificador da Substitui��o Tribut�ria N 007* - OC
   */
  @SPEDField(maxLength = 7, minLength = 7, required = false)
  private String r13_CEST = null;

  @Override
  public String get01_Register() {
    return "0200";
  }

  /**
   * Recupera o 10 COD_GEN C�digo do g�nero do item, conforme a Tabela 4.2.1 N 002* - OC.
   *
   * @return the 10 COD_GEN C�digo do g�nero do item, conforme a Tabela 4
   */
  public String getR10_COD_GEN() {
    return r10_COD_GEN;
  }

  /**
   * Define o 10 COD_GEN C�digo do g�nero do item, conforme a Tabela 4.2.1 N 002* - OC.
   *
   * @param r10_COD_GEN the new 10 COD_GEN C�digo do g�nero do item, conforme a Tabela 4
   */
  public void setR10_COD_GEN(String r10_COD_GEN) {
    this.r10_COD_GEN = r10_COD_GEN;
  }

  /**
   * Recupera o 11 COD_LST C�digo do servi�o conforme lista do Anexo I da Lei Complementar Federal n� 116/03. C 005 OC.
   *
   * @return the 11 COD_LST C�digo do servi�o conforme lista do Anexo I da Lei Complementar Federal n� 116/03
   */
  public String getR11_COD_LST() {
    return r11_COD_LST;
  }

  /**
   * Define o 11 COD_LST C�digo do servi�o conforme lista do Anexo I da Lei Complementar Federal n� 116/03. C 005 OC.
   *
   * @param r11_COD_LST the new 11 COD_LST C�digo do servi�o conforme lista do Anexo I da Lei Complementar Federal n� 116/03
   */
  public void setR11_COD_LST(String r11_COD_LST) {
    this.r11_COD_LST = r11_COD_LST;
  }

  /**
   * Recupera o 12 ALIQ_ICMS Al�quota de ICMS aplic�vel ao item nas opera��es internas N 006 02 OC.
   *
   * @return the 12 ALIQ_ICMS Al�quota de ICMS aplic�vel ao item nas opera��es internas N 006 02 OC
   */
  public BigDecimal getR12_ALIQ_ICMS() {
    return r12_ALIQ_ICMS;
  }

  /**
   * Define o 12 ALIQ_ICMS Al�quota de ICMS aplic�vel ao item nas opera��es internas N 006 02 OC.
   *
   * @param r12_ALIQ_ICMS the new 12 ALIQ_ICMS Al�quota de ICMS aplic�vel ao item nas opera��es internas N 006 02 OC
   */
  public void setR12_ALIQ_ICMS(BigDecimal r12_ALIQ_ICMS) {
    this.r12_ALIQ_ICMS = r12_ALIQ_ICMS;
  }

  /**
   * Recupera o 02 COD_ITEM C�digo do item C 060 - O.
   *
   * @return the 02 COD_ITEM C�digo do item C 060 - O
   */
  public String getR02_COD_ITEM() {
    return r02_COD_ITEM;
  }

  /**
   * Recupera o 03 DESCR_ITEM Descri��o do item C - - O.
   *
   * @return the 03 DESCR_ITEM Descri��o do item C - - O
   */
  public String getR03_DESCR_ITEM() {
    return r03_DESCR_ITEM;
  }

  /**
   * Recupera o 04 COD_BARRA Representa��o alfanum�rico do c�digo de barra do produto, se houver C - - OC.
   *
   * @return the 04 COD_BARRA Representa��o alfanum�rico do c�digo de barra do produto, se houver C - - OC
   */
  public String getR04_COD_BARRA() {
    return r04_COD_BARRA;
  }

  /**
   * Recupera o 05 COD_ANT_ITEM C�digo anterior do item com rela��o � �ltima informa��o apresentada. C 060 - N.
   *
   * @return the 05 COD_ANT_ITEM C�digo anterior do item com rela��o � �ltima informa��o apresentada
   */
  public String getR05_COD_ANT_ITEM() {
    return r05_COD_ANT_ITEM;
  }

  /**
   * Recupera o 06 UNID_INV Unidade de medida utilizada na quantifica��o de estoques. C 006 - O.
   *
   * @return the 06 UNID_INV Unidade de medida utilizada na quantifica��o de estoques
   */
  public String getR06_UNID_INV() {
    return r06_UNID_INV;
  }

  /**
   * Recupera o 07 TIPO_ITEM Tipo do item � Atividades Industriais, Comerciais e Servi�os:<br>
   * 00 � Mercadoria para Revenda;<br>
   * 01 � Mat�ria-Prima;<br>
   * 02 � Embalagem;<br>
   * 03 � Produto em Processo;<br>
   * 04 � Produto Acabado;<br>
   * 05 � Subproduto;<br>
   * 06 � Produto Intermedi�rio;<br>
   * 07 � Material de Uso e Consumo;<br>
   * 08 � Ativo Imobilizado;<br>
   * 09 � Servi�os;<br>
   * 10 � Outros insumos;<br>
   * 99 � Outras<br>
   * N 2 - O.
   *
   * @return the 07 TIPO_ITEM Tipo do item � Atividades Industriais, Comerciais e Servi�os:<br>
   *         00 � Mercadoria para Revenda;<br>
   *         01 � Mat�ria-Prima;<br>
   *         02 � Embalagem;<br>
   *         03 � Produto em Processo;<br>
   *         04 � Produto Acabado;<br>
   *         05 � Subproduto;<br>
   *         06 � Produto Intermedi�rio;<br>
   *         07 � Material de Uso e Consumo;<br>
   *         08 � Ativo Imobilizado;<br>
   *         09 � Servi�os;<br>
   *         10 � Outros insumos;<br>
   *         99 � Outras<br>
   *         N 2 - O
   */
  public String getR07_TIPO_ITEM() {
    return r07_TIPO_ITEM;
  }

  /**
   * Recupera o 08 COD_NCM C�digo da Nomenclatura Comum do Mercosul C 008* - OC.
   *
   * @return the 08 COD_NCM C�digo da Nomenclatura Comum do Mercosul C 008* - OC
   */
  public String getR08_COD_NCM() {
    return r08_COD_NCM;
  }

  /**
   * Recupera o 09 EX_IPI C�digo EX, conforme a TIPI C 003 - OC.
   *
   * @return the 09 EX_IPI C�digo EX, conforme a TIPI C 003 - OC
   */
  public String getR09_EX_IPI() {
    return r09_EX_IPI;
  }

  /**
   * Define o 02 COD_ITEM C�digo do item C 060 - O.
   *
   * @param r02_COD_ITEM the new 02 COD_ITEM C�digo do item C 060 - O
   */
  public void setR02_COD_ITEM(String r02_COD_ITEM) {
    this.r02_COD_ITEM = r02_COD_ITEM;
  }

  /**
   * Define o 03 DESCR_ITEM Descri��o do item C - - O.
   *
   * @param r03_DESCR_ITEM the new 03 DESCR_ITEM Descri��o do item C - - O
   */
  public void setR03_DESCR_ITEM(String r03_DESCR_ITEM) {
    this.r03_DESCR_ITEM = r03_DESCR_ITEM;
  }

  /**
   * Define o 04 COD_BARRA Representa��o alfanum�rico do c�digo de barra do produto, se houver C - - OC.
   *
   * @param r04_COD_BARRA the new 04 COD_BARRA Representa��o alfanum�rico do c�digo de barra do produto, se houver C - - OC
   */
  public void setR04_COD_BARRA(String r04_COD_BARRA) {
    this.r04_COD_BARRA = r04_COD_BARRA;
  }

  /**
   * Define o 05 COD_ANT_ITEM C�digo anterior do item com rela��o � �ltima informa��o apresentada. C 060 - N.
   *
   * @param r05_COD_ANT_ITEM the new 05 COD_ANT_ITEM C�digo anterior do item com rela��o � �ltima informa��o apresentada
   */
  public void setR05_COD_ANT_ITEM(String r05_COD_ANT_ITEM) {
    this.r05_COD_ANT_ITEM = r05_COD_ANT_ITEM;
  }

  /**
   * Define o 06 UNID_INV Unidade de medida utilizada na quantifica��o de estoques. C 006 - O.
   *
   * @param r06_UNID_INV the new 06 UNID_INV Unidade de medida utilizada na quantifica��o de estoques
   */
  public void setR06_UNID_INV(String r06_UNID_INV) {
    this.r06_UNID_INV = r06_UNID_INV;
  }

  /**
   * Define o 07 TIPO_ITEM Tipo do item � Atividades Industriais, Comerciais e Servi�os:<br>
   * 00 � Mercadoria para Revenda;<br>
   * 01 � Mat�ria-Prima;<br>
   * 02 � Embalagem;<br>
   * 03 � Produto em Processo;<br>
   * 04 � Produto Acabado;<br>
   * 05 � Subproduto;<br>
   * 06 � Produto Intermedi�rio;<br>
   * 07 � Material de Uso e Consumo;<br>
   * 08 � Ativo Imobilizado;<br>
   * 09 � Servi�os;<br>
   * 10 � Outros insumos;<br>
   * 99 � Outras<br>
   * N 2 - O.
   *
   * @param r07_TIPO_ITEM the new 07 TIPO_ITEM Tipo do item � Atividades Industriais, Comerciais e Servi�os:<br>
   *          00 � Mercadoria para Revenda;<br>
   *          01 � Mat�ria-Prima;<br>
   *          02 � Embalagem;<br>
   *          03 � Produto em Processo;<br>
   *          04 � Produto Acabado;<br>
   *          05 � Subproduto;<br>
   *          06 � Produto Intermedi�rio;<br>
   *          07 � Material de Uso e Consumo;<br>
   *          08 � Ativo Imobilizado;<br>
   *          09 � Servi�os;<br>
   *          10 � Outros insumos;<br>
   *          99 � Outras<br>
   *          N 2 - O
   */
  public void setR07_TIPO_ITEM(String r07_TIPO_ITEM) {
    this.r07_TIPO_ITEM = r07_TIPO_ITEM;
  }

  /**
   * Define o 08 COD_NCM C�digo da Nomenclatura Comum do Mercosul C 008* - OC.
   *
   * @param r08_COD_NCM the new 08 COD_NCM C�digo da Nomenclatura Comum do Mercosul C 008* - OC
   */
  public void setR08_COD_NCM(String r08_COD_NCM) {
    this.r08_COD_NCM = r08_COD_NCM;
  }

  /**
   * Define o 09 EX_IPI C�digo EX, conforme a TIPI C 003 - OC.
   *
   * @param r09_EX_IPI the new 09 EX_IPI C�digo EX, conforme a TIPI C 003 - OC
   */
  public void setR09_EX_IPI(String r09_EX_IPI) {
    this.r09_EX_IPI = r09_EX_IPI;
  }

  /**
   * Recupera o 13 CEST C�digo Especificador da Substitui��o Tribut�ria N 007* - OC.
   *
   * @return the 13 CEST C�digo Especificador da Substitui��o Tribut�ria N 007* - OC
   */
  public String getR13_CEST() {
    return r13_CEST;
  }

  /**
   * Define o 13 CEST C�digo Especificador da Substitui��o Tribut�ria N 007* - OC.
   *
   * @param r13_CEST the new 13 CEST C�digo Especificador da Substitui��o Tribut�ria N 007* - OC
   */
  public void setR13_CEST(String r13_CEST) {
    this.r13_CEST = r13_CEST;
  }

}