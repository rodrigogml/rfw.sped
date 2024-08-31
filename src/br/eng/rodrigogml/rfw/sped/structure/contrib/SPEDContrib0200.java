package br.eng.rodrigogml.rfw.sped.structure.contrib;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO 0200: TABELA DE IDENTIFICA��O DO ITEM (PRODUTOS E SERVI�OS).<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContrib0200 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * C�digo do item C 060 - S
   */
  @SPEDField(maxLength = 60, required = true)
  private String r02_COD_ITEM = null;

  /**
   * Descri��o do item C - - S
   */
  @SPEDField(maxLength = 250, required = true)
  private String r03_DESCR_ITEM = null;

  /**
   * Representa��o alfanum�rico do c�digo de barra do produto, se houver. C - - N
   */
  @SPEDField(maxLength = 100, required = false)
  private String r04_COD_BARRA = null;

  /**
   * C�digo anterior do item com rela��o � �ltima informa��o apresentada. C 060 - N
   */
  @SPEDField(maxLength = 60, required = false)
  private String r05_COD_ANT_ITEM = null;

  /**
   * Unidade de medida utilizada na quantifica��o de estoques. C 006 - N
   */
  @SPEDField(maxLength = 6, required = false)
  private String r06_UNID_INV = null;

  /**
   * Tipo do item � Atividades Industriais, Comerciais e Servi�os:
   * <li>00 � Mercadoria para Revenda;
   * <li>01 � Mat�ria-Prima;
   * <li>02 � Embalagem;
   * <li>03 � Produto em Processo;
   * <li>04 � Produto Acabado;
   * <li>05 � Subproduto;
   * <li>06 � Produto Intermedi�rio;
   * <li>07 � Material de Uso e Consumo;
   * <li>08 � Ativo Imobilizado;
   * <li>09 � Servi�os;
   * <li>10 � Outros insumos;
   * <li>99 � Outras<br>
   * N 002* - S
   */
  @SPEDField(maxLength = 2, minLength = 2, required = true)
  private String r07_TIPO_ITEM = null;

  /**
   * C�digo da Nomenclatura Comum do Mercosul C 008 - N
   */
  @SPEDField(maxLength = 8, required = false)
  private String r08_COD_NCM = null;

  /**
   * C�digo EX, conforme a TIPI C 003 - N
   */
  @SPEDField(maxLength = 3, required = false)
  private String r09_EX_IPI = null;

  /**
   * C�digo do g�nero do item, conforme a Tabela 4.2.1. N 002* - N
   */
  @SPEDField(maxLength = 2, minLength = 2, required = false)
  private String r10_COD_GEN = null;

  /**
   * C�digo do servi�o conforme lista do Anexo I da Lei Complementar Federal n� 116/03.
   * <ul>
   *
   * <pre>
   * Obs: A partir do per�odo de apura��o maio de 2015 (vers�o 2.11 do PVA), o c�digo a ser informado neste campo poder� ser informado 05 (cinco) caracteres, no formato �XX.XX�, conforme a codifica��o adotada na Lei Complementar n� 116/2003 e na EFD-ICMS/IPI.
   * </pre>
   * </ul>
   * <br>
   * N 005 N
   */
  @SPEDField(maxLength = 5, required = false)
  private String r11_COD_LST = null;

  /**
   * Al�quota de ICMS aplic�vel ao item nas opera��es internas N 006 02 N
   */
  @SPEDField(maxLength = 6, decimals = 2, required = false)
  private BigDecimal r12_ALIQ_ICMS = null;

  @Override
  public String get01_Register() {
    return "0200";
  }

  /**
   * Recupera o c�digo do item C 060 - S.
   *
   * @return the c�digo do item C 060 - S
   */
  public String getR02_COD_ITEM() {
    return r02_COD_ITEM;
  }

  /**
   * Define o c�digo do item C 060 - S.
   *
   * @param r02_COD_ITEM the new c�digo do item C 060 - S
   */
  public void setR02_COD_ITEM(String r02_COD_ITEM) {
    this.r02_COD_ITEM = r02_COD_ITEM;
  }

  /**
   * Recupera o descri��o do item C - - S.
   *
   * @return the descri��o do item C - - S
   */
  public String getR03_DESCR_ITEM() {
    return r03_DESCR_ITEM;
  }

  /**
   * Define o descri��o do item C - - S.
   *
   * @param r03_DESCR_ITEM the new descri��o do item C - - S
   */
  public void setR03_DESCR_ITEM(String r03_DESCR_ITEM) {
    this.r03_DESCR_ITEM = r03_DESCR_ITEM;
  }

  /**
   * Recupera o representa��o alfanum�rico do c�digo de barra do produto, se houver. C - - N.
   *
   * @return the representa��o alfanum�rico do c�digo de barra do produto, se houver
   */
  public String getR04_COD_BARRA() {
    return r04_COD_BARRA;
  }

  /**
   * Define o representa��o alfanum�rico do c�digo de barra do produto, se houver. C - - N.
   *
   * @param r04_COD_BARRA the new representa��o alfanum�rico do c�digo de barra do produto, se houver
   */
  public void setR04_COD_BARRA(String r04_COD_BARRA) {
    this.r04_COD_BARRA = r04_COD_BARRA;
  }

  /**
   * Recupera o c�digo anterior do item com rela��o � �ltima informa��o apresentada. C 060 - N.
   *
   * @return the c�digo anterior do item com rela��o � �ltima informa��o apresentada
   */
  public String getR05_COD_ANT_ITEM() {
    return r05_COD_ANT_ITEM;
  }

  /**
   * Define o c�digo anterior do item com rela��o � �ltima informa��o apresentada. C 060 - N.
   *
   * @param r05_COD_ANT_ITEM the new c�digo anterior do item com rela��o � �ltima informa��o apresentada
   */
  public void setR05_COD_ANT_ITEM(String r05_COD_ANT_ITEM) {
    this.r05_COD_ANT_ITEM = r05_COD_ANT_ITEM;
  }

  /**
   * Recupera o unidade de medida utilizada na quantifica��o de estoques. C 006 - N.
   *
   * @return the unidade de medida utilizada na quantifica��o de estoques
   */
  public String getR06_UNID_INV() {
    return r06_UNID_INV;
  }

  /**
   * Define o unidade de medida utilizada na quantifica��o de estoques. C 006 - N.
   *
   * @param r06_UNID_INV the new unidade de medida utilizada na quantifica��o de estoques
   */
  public void setR06_UNID_INV(String r06_UNID_INV) {
    this.r06_UNID_INV = r06_UNID_INV;
  }

  /**
   * Recupera o tipo do item � Atividades Industriais, Comerciais e Servi�os:
   * <li>00 � Mercadoria para Revenda;
   * <li>01 � Mat�ria-Prima;
   * <li>02 � Embalagem;
   * <li>03 � Produto em Processo;
   * <li>04 � Produto Acabado;
   * <li>05 � Subproduto;
   * <li>06 � Produto Intermedi�rio;
   * <li>07 � Material de Uso e Consumo;
   * <li>08 � Ativo Imobilizado;
   * <li>09 � Servi�os;
   * <li>10 � Outros insumos;
   * <li>99 � Outras<br>
   * N 002* - S.
   *
   * @return the tipo do item � Atividades Industriais, Comerciais e Servi�os:
   *         <li>00 � Mercadoria para Revenda;
   *         <li>01 � Mat�ria-Prima;
   *         <li>02 � Embalagem;
   *         <li>03 � Produto em Processo;
   *         <li>04 � Produto Acabado;
   *         <li>05 � Subproduto;
   *         <li>06 � Produto Intermedi�rio;
   *         <li>07 � Material de Uso e Consumo;
   *         <li>08 � Ativo Imobilizado;
   *         <li>09 � Servi�os;
   *         <li>10 � Outros insumos;
   *         <li>99 � Outras<br>
   *         N 002* - S
   */
  public String getR07_TIPO_ITEM() {
    return r07_TIPO_ITEM;
  }

  /**
   * Define o tipo do item � Atividades Industriais, Comerciais e Servi�os:
   * <li>00 � Mercadoria para Revenda;
   * <li>01 � Mat�ria-Prima;
   * <li>02 � Embalagem;
   * <li>03 � Produto em Processo;
   * <li>04 � Produto Acabado;
   * <li>05 � Subproduto;
   * <li>06 � Produto Intermedi�rio;
   * <li>07 � Material de Uso e Consumo;
   * <li>08 � Ativo Imobilizado;
   * <li>09 � Servi�os;
   * <li>10 � Outros insumos;
   * <li>99 � Outras<br>
   * N 002* - S.
   *
   * @param r07_TIPO_ITEM the new tipo do item � Atividades Industriais, Comerciais e Servi�os:
   *          <li>00 � Mercadoria para Revenda;
   *          <li>01 � Mat�ria-Prima;
   *          <li>02 � Embalagem;
   *          <li>03 � Produto em Processo;
   *          <li>04 � Produto Acabado;
   *          <li>05 � Subproduto;
   *          <li>06 � Produto Intermedi�rio;
   *          <li>07 � Material de Uso e Consumo;
   *          <li>08 � Ativo Imobilizado;
   *          <li>09 � Servi�os;
   *          <li>10 � Outros insumos;
   *          <li>99 � Outras<br>
   *          N 002* - S
   */
  public void setR07_TIPO_ITEM(String r07_TIPO_ITEM) {
    this.r07_TIPO_ITEM = r07_TIPO_ITEM;
  }

  /**
   * Recupera o c�digo da Nomenclatura Comum do Mercosul C 008 - N.
   *
   * @return the c�digo da Nomenclatura Comum do Mercosul C 008 - N
   */
  public String getR08_COD_NCM() {
    return r08_COD_NCM;
  }

  /**
   * Define o c�digo da Nomenclatura Comum do Mercosul C 008 - N.
   *
   * @param r08_COD_NCM the new c�digo da Nomenclatura Comum do Mercosul C 008 - N
   */
  public void setR08_COD_NCM(String r08_COD_NCM) {
    this.r08_COD_NCM = r08_COD_NCM;
  }

  /**
   * Recupera o c�digo EX, conforme a TIPI C 003 - N.
   *
   * @return the c�digo EX, conforme a TIPI C 003 - N
   */
  public String getR09_EX_IPI() {
    return r09_EX_IPI;
  }

  /**
   * Define o c�digo EX, conforme a TIPI C 003 - N.
   *
   * @param r09_EX_IPI the new c�digo EX, conforme a TIPI C 003 - N
   */
  public void setR09_EX_IPI(String r09_EX_IPI) {
    this.r09_EX_IPI = r09_EX_IPI;
  }

  /**
   * Recupera o c�digo do g�nero do item, conforme a Tabela 4.2.1. N 002* - N.
   *
   * @return the c�digo do g�nero do item, conforme a Tabela 4
   */
  public String getR10_COD_GEN() {
    return r10_COD_GEN;
  }

  /**
   * Define o c�digo do g�nero do item, conforme a Tabela 4.2.1. N 002* - N.
   *
   * @param r10_COD_GEN the new c�digo do g�nero do item, conforme a Tabela 4
   */
  public void setR10_COD_GEN(String r10_COD_GEN) {
    this.r10_COD_GEN = r10_COD_GEN;
  }

  /**
   * Recupera o c�digo do servi�o conforme lista do Anexo I da Lei Complementar Federal n� 116/03.
   * <ul>
   *
   * <pre>
   *  Obs: A partir do per�odo de apura��o maio de 2015 (vers�o 2.11 do PVA), o c�digo a ser informado neste campo poder� ser informado 05 (cinco) caracteres, no formato �XX.XX�, conforme a codifica��o adotada na Lei Complementar n� 116/2003 e na EFD-ICMS/IPI.
   * </pre>
   * </ul>
   * <br>
   * N 005 N.
   *
   * @return the c�digo do servi�o conforme lista do Anexo I da Lei Complementar Federal n� 116/03
   */
  public String getR11_COD_LST() {
    return r11_COD_LST;
  }

  /**
   * Define o c�digo do servi�o conforme lista do Anexo I da Lei Complementar Federal n� 116/03.
   * <ul>
   *
   * <pre>
   *  Obs: A partir do per�odo de apura��o maio de 2015 (vers�o 2.11 do PVA), o c�digo a ser informado neste campo poder� ser informado 05 (cinco) caracteres, no formato �XX.XX�, conforme a codifica��o adotada na Lei Complementar n� 116/2003 e na EFD-ICMS/IPI.
   * </pre>
   * </ul>
   * <br>
   * N 005 N.
   *
   * @param r11_COD_LST the new c�digo do servi�o conforme lista do Anexo I da Lei Complementar Federal n� 116/03
   */
  public void setR11_COD_LST(String r11_COD_LST) {
    this.r11_COD_LST = r11_COD_LST;
  }

  /**
   * Recupera o al�quota de ICMS aplic�vel ao item nas opera��es internas N 006 02 N.
   *
   * @return the al�quota de ICMS aplic�vel ao item nas opera��es internas N 006 02 N
   */
  public BigDecimal getR12_ALIQ_ICMS() {
    return r12_ALIQ_ICMS;
  }

  /**
   * Define o al�quota de ICMS aplic�vel ao item nas opera��es internas N 006 02 N.
   *
   * @param r12_ALIQ_ICMS the new al�quota de ICMS aplic�vel ao item nas opera��es internas N 006 02 N
   */
  public void setR12_ALIQ_ICMS(BigDecimal r12_ALIQ_ICMS) {
    this.r12_ALIQ_ICMS = r12_ALIQ_ICMS;
  }
}