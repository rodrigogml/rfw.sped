package br.eng.rodrigogml.rfw.sped;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneOffset;

import br.eng.rodrigogml.rfw.kernel.exceptions.RFWException;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFiscalFile;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal0000;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal0001;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal0005;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal0100;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal0190;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal0200;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal1001;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal1010;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalH001;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalH005;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalH010;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalH020;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalK001;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalK100;

/**
 * Description: Classe para auxiliar na montagem e manipula��o do arquivo do SPED Fiscal atrav�s da estrutura {@link SPEDFiscalFile}.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (22 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDFiscalBuilder {

  /**
   * Construtor privado para classe exclusiva com m�todos est�ticos.
   */
  private SPEDFiscalBuilder() {
  }

  /**
   * REGISTRO 1001: ABERTURA DO BLOCO 1<Br>
   * <Br>
   * Observa��es:
   * <li>N�vel hier�rquico - 1</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   * <br>
   *
   * @param sped Arquivo do SPED.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal1001 add1001(SPEDFiscalFile sped) throws RFWException {
    SPEDFiscal1001 r1001 = sped.getR1001();
    if (r1001 == null) {
      r1001 = new SPEDFiscal1001(sped);
      sped.setR1001(r1001);
    }
    return r1001;
  }

  /**
   * REGISTRO 1010: OBRIGATORIEDADE DE REGISTROS DO BLOCO 1<br>
   * <br>
   *
   * <li>Obs.: At� 31/12/2021 o campo 08 referiu-se ao registro 1600.</li>
   * <li>N�vel hier�rquico - 2</li>
   * <li>Ocorr�ncia � 1</li>
   * <li>
   *
   * @param r1001 Registro 1001
   * @param indExp Reg. 1100 - Ocorreu averba��o (conclus�o) de exporta��o no per�odo?
   * @param indCCRF Reg 1200 � Existem informa��es acerca de cr�ditos de ICMS a serem controlados, definidos pela Sefaz?
   * @param indComb Reg. 1300 � � com�rcio varejista de combust�veis com movimenta��o e/ou estoque no per�odo?
   * @param indUsina Reg. 1390 � Usinas de a��car e/�lcool � O estabelecimento � produtor de a��car e/ou �lcool carburante com movimenta��o e/ou estoque no per�odo?
   * @param indVA Reg 1400 - Sendo o registro obrigat�rio em sua Unidade de Federa��o, existem informa��es a serem prestadas neste registro?
   * @param indEE Reg 1500 - A empresa � distribuidora de energia e ocorreu fornecimento de energia el�trica para consumidores de outra UF?
   * @param indCart Reg 1601 - Realizou vendas com instrumentos eletr�nicos de pagamento?
   * @param infForm Reg. 1700 - Foram emitidos documentos fiscais em papel no per�odo em unidade da federa��o que exija o controle de utiliza��o de documentos fiscais?
   * @param indAER Reg 1800 - A empresa prestou servi�os de transporte a�reo de cargas e de passageiros?
   * @param indGIAF1 Reg. 1960 - Possui informa��es GIAF1?
   * @param indGIAF3 Reg. 1970 - Possui informa��es GIAF3?
   * @param indGIAF4 Reg. 1980 - Possui informa��es GIAF4?
   * @param indRestRessarcComplICMS Reg. 1250 � Possui informa��es consolidadas de saldos de restitui��o, ressarcimento e complementa��o do ICMS?
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal1010 add1010(SPEDFiscal1001 r1001, boolean indExp, boolean indCCRF, boolean indComb, boolean indUsina, boolean indVA, boolean indEE, boolean indCart, boolean infForm, boolean indAER, boolean indGIAF1, boolean indGIAF3, boolean indGIAF4, boolean indRestRessarcComplICMS) throws RFWException {
    SPEDFiscal1010 r1010 = r1001.getR1010();
    if (r1010 == null) {
      r1010 = new SPEDFiscal1010(r1001.getSpedFile());
      r1001.setR1010(r1010);
    }

    r1010.setR02_IND_EXP((indExp ? "S" : "N"));
    r1010.setR03_IND_CCRF((indCCRF ? "S" : "N"));
    r1010.setR04_IND_COMB((indComb ? "S" : "N"));
    r1010.setR05_IND_USINA((indUsina ? "S" : "N"));
    r1010.setR06_IND_VA((indVA ? "S" : "N"));
    r1010.setR07_IND_EE((indEE ? "S" : "N"));
    r1010.setR08_IND_CART((indCart ? "S" : "N"));
    r1010.setR09_IND_FORM((infForm ? "S" : "N"));
    r1010.setR10_IND_AER((indAER ? "S" : "N"));
    r1010.setR11_IND_GIAF1((indGIAF1 ? "S" : "N"));
    r1010.setR12_IND_GIAF3((indGIAF3 ? "S" : "N"));
    r1010.setR13_IND_GIAF4((indGIAF4 ? "S" : "N"));
    r1010.setR14_IND_REST_RESSARC_COMPL_ICMS((indRestRessarcComplICMS ? "S" : "N"));

    return r1010;
  }

  /**
   * REGISTRO 0000: ABERTURA DO ARQUIVO DIGITAL E IDENTIFICA��O DA ENTIDADE<br>
   * <br>
   * Observa��es:
   * <li>N�vel hier�rquico - 0</li>
   * <li>Ocorr�ncia - um por arquivo.</li>
   *
   * @param sped Arquivo SPED.
   * @param r03_COD_FIN C�digo da finalidade do arquivo: 0 - Remessa do arquivo original; 1 - Remessa do arquivo substituto.
   * @param r04_DT_INI Data inicial das informa��es contidas no arquivo.
   * @param r05_DT_FIN Data final das informa��es contidas no arquivo.
   * @param r06_NOME Nome empresarial da entidade.
   * @param r07_CNPJ N�mero de inscri��o da entidade no CNPJ.
   * @param r08_CPF N�mero de inscri��o da entidade no CPF.
   * @param r09_UF Sigla da unidade da federa��o da entidade.
   * @param r10_IE Inscri��o Estadual da entidade.
   * @param r11_COD_MUN C�digo do munic�pio do domic�lio fiscal da entidade, conforme a tabela IBGE.
   * @param r12_IM Inscri��o Municipal da entidade.
   * @param r13_SUFRAMA Inscri��o da entidade na SUFRAMA.
   * @param r14_IND_PERFIL Perfil de apresenta��o do arquivo fiscal; A � Perfil A; B � Perfil B.; C � Perfil C.
   * @param r15_IND_ATIV Indicador de tipo de atividade: 0 � Industrial ou equiparado a industrial; 1 � Outros.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal0000 add0000(SPEDFiscalFile sped, Integer r03_COD_FIN, LocalDate r04_DT_INI, LocalDate r05_DT_FIN, String r06_NOME, String r07_CNPJ, String r08_CPF, String r09_UF, String r10_IE, String r11_COD_MUN, String r12_IM, String r13_SUFRAMA, String r14_IND_PERFIL, String r15_IND_ATIV) throws RFWException {
    SPEDFiscal0000 r0000 = sped.getR0000();
    if (r0000 == null) {
      r0000 = new SPEDFiscal0000(sped);
      sped.setR0000(r0000);
    }

    r0000.setR02_COD_VER("017"); // C�digo da vers�o depende do c�digo implementado, por isso � definido como constante no c�digo.
    r0000.setR03_COD_FIN(r03_COD_FIN);
    r0000.setR04_DT_INI(r04_DT_INI);
    r0000.setR05_DT_FIN(r05_DT_FIN);
    r0000.setR06_NOME(r06_NOME);
    r0000.setR07_CNPJ(r07_CNPJ);
    r0000.setR08_CPF(r08_CPF);
    r0000.setR09_UF(r09_UF);
    r0000.setR10_IE(r10_IE);
    r0000.setR11_COD_MUN(r11_COD_MUN);
    r0000.setR12_IM(r12_IM);
    r0000.setR13_SUFRAMA(r13_SUFRAMA);
    r0000.setR14_IND_PERFIL(r14_IND_PERFIL);
    r0000.setR15_IND_ATIV(r15_IND_ATIV);
    return r0000;
  }

  /**
   * REGISTRO 0001: ABERTURA DO BLOCO 0<Br>
   * <Br>
   * Observa��es:
   * <li>N�vel hier�rquico - 1</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   * <br>
   *
   * @param sped Arquivo SPED.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal0001 add0001(SPEDFiscalFile sped) throws RFWException {
    SPEDFiscal0001 r0001 = sped.getR0001();
    if (r0001 == null) {
      r0001 = new SPEDFiscal0001(sped);
      sped.setR0001(r0001);
    }
    return r0001;
  }

  /**
   * REGISTRO 0005: DADOS COMPLEMENTARES DA ENTIDADE<br>
   * <br>
   *
   * <li>Observa��es:</li>
   * <li>N�vel hier�rquico - 2</li>
   * <li>Ocorr�ncia � um por arquivo</li>
   *
   * @param r0001 Registro pai.
   * @param r02_FANTASIA Nome de fantasia associado ao nome empresarial.
   * @param r03_CEP C�digo de Endere�amento Postal.
   * @param r04_END Logradouro e endere�o do im�vel.
   * @param r05_NUM N�mero do im�vel.
   * @param r06_COMPL Dados complementares do endere�o.
   * @param r07_BAIRRO Bairro em que o im�vel est� situado.
   * @param r08_FONE N�mero do telefone (DDD+FONE).
   * @param r09_FAX N�mero do fax.
   * @param r10_EMAIL Endere�o do correio eletr�nico.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal0005 add0005(SPEDFiscal0001 r0001, String r02_FANTASIA, String r03_CEP, String r04_END, String r05_NUM, String r06_COMPL, String r07_BAIRRO, String r08_FONE, String r09_FAX, String r10_EMAIL) throws RFWException {
    SPEDFiscal0005 r0005 = r0001.getR0005();
    if (r0005 == null) {
      r0005 = new SPEDFiscal0005(r0001.getSpedFile());
      r0001.setR0005(r0005);
    }

    r0005.setR02_FANTASIA(r02_FANTASIA);
    r0005.setR03_CEP(r03_CEP);
    r0005.setR04_END(r04_END);
    r0005.setR05_NUM(r05_NUM);
    r0005.setR06_COMPL(r06_COMPL);
    r0005.setR07_BAIRRO(r07_BAIRRO);
    r0005.setR08_FONE(r08_FONE);
    r0005.setR09_FAX(r09_FAX);
    r0005.setR10_EMAIL(r10_EMAIL);
    return r0005;
  }

  /**
   * REGISTRO 0100: DADOS DO CONTABILISTA<br>
   * <br>
   *
   * Observa��es: Registro obrigat�rio
   * <li>N�vel hier�rquico - 0</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   *
   * @param r0001 Registro pai.
   * @param r02_NOME Nome do contabilista.
   * @param r03_CPF N�mero de inscri��o do contabilista no CPF.
   * @param r04_CRC N�mero de inscri��o do contabilista no Conselho Regional de Contabilidade.
   * @param r05_CNPJ N�mero de inscri��o do escrit�rio de contabilidade no CNPJ, se houver.
   * @param r06_CEP C�digo de Endere�amento Postal.
   * @param r07_END Logradouro e endere�o do im�vel.
   * @param r08_NUM N�mero do im�vel.
   * @param r09_COMPL Dados complementares do endere�o.
   * @param r10_BAIRRO Bairro em que o im�vel est� situado.
   * @param r11_FONE N�mero do telefone (DDD+FONE).
   * @param r12_FAX N�mero do fax.
   * @param r13_EMAIL Endere�o do correio eletr�nico.
   * @param r14_COD_MUN C�digo do munic�pio, conforme tabela IBGE.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal0100 add0100(SPEDFiscal0001 r0001, String r02_NOME, String r03_CPF, String r04_CRC, String r05_CNPJ, String r06_CEP, String r07_END, String r08_NUM, String r09_COMPL, String r10_BAIRRO, String r11_FONE, String r12_FAX, String r13_EMAIL, String r14_COD_MUN) throws RFWException {
    SPEDFiscal0100 r0100 = r0001.getR0100();
    if (r0100 == null) {
      r0100 = new SPEDFiscal0100(r0001.getSpedFile());
      r0001.setR0100(r0100);
    }

    r0100.setR02_NOME(r02_NOME);
    r0100.setR03_CPF(r03_CPF);
    r0100.setR04_CRC(r04_CRC);
    r0100.setR05_CNPJ(r05_CNPJ);
    r0100.setR06_CEP(r06_CEP);
    r0100.setR07_END(r07_END);
    r0100.setR08_NUM(r08_NUM);
    r0100.setR09_COMPL(r09_COMPL);
    r0100.setR10_BAIRRO(r10_BAIRRO);
    r0100.setR11_FONE(r11_FONE);
    r0100.setR12_FAX(r12_FAX);
    r0100.setR13_EMAIL(r13_EMAIL);
    r0100.setR14_COD_MUN(r14_COD_MUN);
    return r0100;
  }

  /**
   * REGISTRO H001: ABERTURA DO BLOCO H<Br>
   * <Br>
   * Observa��es:
   * <li>N�vel hier�rquico - 1</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   * <br>
   *
   * @param sped Arquivo do SPED.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalH001 addH001(SPEDFiscalFile sped) throws RFWException {
    SPEDFiscalH001 rh001 = sped.getRH001();
    if (rh001 == null) {
      rh001 = new SPEDFiscalH001(sped);
      sped.setRH001(rh001);
    }
    return rh001;
  }

  /**
   * REGISTRO H005: TOTAIS DO INVENT�RIO<br>
   * <Br>
   * Observa��es:
   * <li>N�vel hier�rquico - 2</li>
   * <li>Ocorr�ncia � 1:N</li><Br>
   * <Br>
   *
   * @param rh001 Registro pai.
   * @param uniqueID Identificador �nico do registro para identifica��o do registro internamente no desenvolvimento. Conte�do n�o � enviado ou escrito no conte�do do arquivo SPED.
   * @param r02_DT_INV Data do invent�rio.
   * @param r03_VL_INV Valor total do estoque.
   * @param r04_MOT_INV Informe o motivo do Invent�rio:
   *          <li>01 � No final no per�odo;</li>
   *          <li>02 � Na mudan�a de forma de tributa��o da mercadoria (ICMS);</li>
   *          <li>03 � Na solicita��o da baixa cadastral, paralisa��o tempor�ria e outras situa��es;</li>
   *          <li>04 � Na altera��o de regime de pagamento � condi��o do contribuinte;</li>
   *          <li>05 � Por determina��o dos fiscos;</li>
   *          <li>06 � Para controle das mercadorias sujeitas ao regime de substitui��o tribut�ria � restitui��o/ ressarcimento/ complementa��o.</li>
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalH005 addH005(SPEDFiscalH001 rh001, String uniqueID, LocalDate r02_DT_INV, BigDecimal r03_VL_INV, String r04_MOT_INV) throws RFWException {
    SPEDFiscalH005 rh005 = rh001.getRh005().get(uniqueID);
    if (rh005 == null) {
      rh005 = new SPEDFiscalH005(rh001.getSpedFile());
      rh001.getRh005().put(uniqueID, rh005);
    }

    rh005.setR02_DT_INV(r02_DT_INV);
    rh005.setR03_VL_INV(r03_VL_INV);
    rh005.setR04_MOT_INV(r04_MOT_INV);
    return rh005;
  }

  /**
   * REGISTRO H010: INVENT�RIO.<bR>
   * Observa��es:
   * <li>N�vel hier�rquico - 3</li>
   * <li>Ocorr�ncia - 1:N</li>
   *
   * @param rh005 Registro pai.
   * @param uniqueID Identificador �nico do registro para identifica��o do registro internamente no desenvolvimento. Conte�do n�o � enviado ou escrito no conte�do do arquivo SPED.
   * @param r02_COD_ITEM C�digo do item (campo 02 do Registro 0200).
   * @param r03_UNID Unidade do item.
   * @param r04_QTD Quantidade do item.
   * @param r05_VL_UNIT Valor unit�rio do item.
   * @param r06_VL_ITEM Valor do item.
   * @param r07_IND_PROP Indicador de propriedade/posse do item:
   *          <li>0- Item de propriedade do informante e em seu poder;
   *          <li>1- Item de propriedade do informante em posse de terceiros;
   *          <li>2- Item de propriedade de terceiros em posse do informante
   * @param r08_COD_PART C�digo do participante (campo 02 do Registro 0150):
   *          <li>propriet�rio/possuidor que n�o seja o informante do arquivo
   * @param r09_TXT_COMPL Descri��o complementar
   * @param r10_COD_CTA C�digo da conta anal�tica cont�bil debitada/creditada
   * @param r11_VL_ITEM_IR Valor do item para efeitos do Imposto de Renda.
   * @return
   * @throws RFWException
   * @throws RFWException
   */
  public static SPEDFiscalH010 addH010(SPEDFiscalH005 rh005, String uniqueID, String r02_COD_ITEM, String r03_UNID, BigDecimal r04_QTD, BigDecimal r05_VL_UNIT, BigDecimal r06_VL_ITEM, String r07_IND_PROP, String r08_COD_PART, String r09_TXT_COMPL, String r10_COD_CTA, BigDecimal r11_VL_ITEM_IR) throws RFWException, RFWException {
    SPEDFiscalH010 rh010 = rh005.getRh010().get(uniqueID);
    if (rh010 == null) {
      rh010 = new SPEDFiscalH010(rh005.getSpedFile());
      rh005.getRh010().put(uniqueID, rh010);
    }
    rh010.setR02_COD_ITEM(r02_COD_ITEM);
    rh010.setR03_UNID(r03_UNID);
    rh010.setR04_QTD(r04_QTD);
    rh010.setR05_VL_UNIT(r05_VL_UNIT);
    rh010.setR06_VL_ITEM(r06_VL_ITEM);
    rh010.setR07_IND_PROP(r07_IND_PROP);
    rh010.setR08_COD_PART(r08_COD_PART);
    rh010.setR09_TXT_COMPL(r09_TXT_COMPL);
    rh010.setR10_COD_CTA(r10_COD_CTA);
    rh010.setR11_VL_ITEM_IR(r11_VL_ITEM_IR);

    return rh010;
  }

  /**
   * REGISTRO 0190: IDENTIFICA��O DAS UNIDADES DE MEDIDA<br>
   * Observa��es:
   * <li>N�vel hier�rquico: 2</li>
   * <li>Ocorr�ncia: v�rios por arquivo</li>
   *
   * @param r0001 Registro pai.
   * @param unitSymbol Simbolo da Unidade de metida (uniqueID).
   * @param unitName Descri��o / Nome da unidade de medida.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal0190 add0190(SPEDFiscal0001 r0001, String unitSymbol, String unitName) throws RFWException {
    SPEDFiscal0190 r0190 = r0001.getR0190().get(unitSymbol);
    if (r0190 == null) {
      r0190 = new SPEDFiscal0190(r0001.getSpedFile());
      r0001.getR0190().put(unitSymbol, r0190);
      r0190.setR02_UNID(unitSymbol);
      r0190.setR03_DESCR(unitName);
    }
    return r0190;
  }

  /**
   * REGISTRO 0200: TABELA DE IDENTIFICA��O DO ITEM (PRODUTO E SERVI�OS)<br>
   * Observa��es:
   * <li>N�vel hier�rquico - 2</li>
   * <li>Ocorr�ncia - v�rios (por arquivo)</li>
   * <li>Tenta criar o registro 0190 para registrar a unidade de medida mencionada no atributo r06.
   *
   *
   * @param sped Arquivo SPED.
   * @param r02_COD_ITEM C�digo do item. (uniqueID)
   * @param r03_DESCR_ITEM Descri��o do item.
   * @param r04_COD_BARRA Representa��o alfanum�rico do c�digo de barra do produto, se houver.
   * @param r05_COD_ANT_ITEM C�digo anterior do item com rela��o � �ltima informa��o apresentada
   * @param r06_UNID_INV Unidade de medida utilizada na quantifica��o de estoques.
   * @param r07_TIPO_ITEM Tipo do item � Atividades Industriais, Comerciais e Servi�os:
   *          <li>00 � Mercadoria para Revenda;
   *          <li>01 � Mat�ria-prima;
   *          <li>02 � Embalagem;
   *          <li>03 � Produto em Processo;
   *          <li>04 � Produto Acabado;
   *          <li>05 � Subproduto;
   *          <li>06 � Produto Intermedi�rio;
   *          <li>07 � Material de Uso e Consumo;
   *          <li>08 � Ativo Imobilizado;
   *          <li>09 � Servi�os;
   *          <li>10 � Outros insumos;
   *          <li>99 � Outras
   * @param r08_COD_NCM C�digo da Nomenclatura Comum do Mercosul
   * @param r09_EX_IPI C�digo EX, conforme a TIPI
   * @param r10_COD_GEN C�digo do g�nero do item, conforme a Tabela 4.2.1
   * @param r11_COD_LST C�digo do servi�o conforme lista do Anexo I da Lei Complementar Federal n� 116/03.
   * @param r12_ALIQ_ICMS Al�quota de ICMS aplic�vel ao item nas opera��es internas
   * @param r13_CEST C�digo Especificador da Substitui��o Tribut�ria
   * @param r190_r03_DESCR Descri��o da unidade de medida:<br>
   *          <li>Utilizado em conjunto com outras informa��es para tentar gerar automaticamente o Registro 0190.</li>
   *
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal0200 add0200(SPEDFiscalFile sped, String r02_COD_ITEM, String r03_DESCR_ITEM, String r04_COD_BARRA, String r05_COD_ANT_ITEM, String r06_UNID_INV, String r07_TIPO_ITEM, String r08_COD_NCM, String r09_EX_IPI, String r10_COD_GEN, String r11_COD_LST, BigDecimal r12_ALIQ_ICMS, String r13_CEST, String r190_r03_DESCR) throws RFWException {
    final SPEDFiscal0001 r0001 = SPEDFiscalBuilder.add0001(sped);

    add0190(sped.getR0001(), r06_UNID_INV, r190_r03_DESCR);

    SPEDFiscal0200 r0200 = r0001.getR0200().get(r02_COD_ITEM);
    if (r0200 == null) {
      r0200 = new SPEDFiscal0200(sped);
      r0001.getR0200().put(r02_COD_ITEM, r0200);
    }

    r0200.setR02_COD_ITEM(r02_COD_ITEM);
    r0200.setR03_DESCR_ITEM(r03_DESCR_ITEM);
    r0200.setR04_COD_BARRA(r04_COD_BARRA);
    r0200.setR05_COD_ANT_ITEM(r05_COD_ANT_ITEM);
    r0200.setR06_UNID_INV(r06_UNID_INV);
    r0200.setR07_TIPO_ITEM(r07_TIPO_ITEM);
    r0200.setR08_COD_NCM(r08_COD_NCM);
    r0200.setR09_EX_IPI(r09_EX_IPI);
    r0200.setR10_COD_GEN(r10_COD_GEN);
    r0200.setR11_COD_LST(r11_COD_LST);
    r0200.setR12_ALIQ_ICMS(r12_ALIQ_ICMS);
    r0200.setR13_CEST(r13_CEST);
    return r0200;
  }

  /**
   * REGISTRO 0200: TABELA DE IDENTIFICA��O DO ITEM (PRODUTO E SERVI�OS)<br>
   * Observa��es:
   * <li>N�vel hier�rquico - 2</li>
   * <li>Ocorr�ncia - v�rios (por arquivo)</li>
   * <li>Por receber o registro 0190 diretamente, o atributo R06 � extra�do diretamente do registro de unidade de medida.
   *
   * @param r0190 Registro 0190 com as informa��es da unidade de medida do item.
   * @param r02_COD_ITEM C�digo do item. (uniqueID)
   * @param r03_DESCR_ITEM Descri��o do item.
   * @param r04_COD_BARRA Representa��o alfanum�rico do c�digo de barra do produto, se houver.
   * @param r05_COD_ANT_ITEM C�digo anterior do item com rela��o � �ltima informa��o apresentada
   * @param r07_TIPO_ITEM Tipo do item � Atividades Industriais, Comerciais e Servi�os:
   *          <li>00 � Mercadoria para Revenda;
   *          <li>01 � Mat�ria-prima;
   *          <li>02 � Embalagem;
   *          <li>03 � Produto em Processo;
   *          <li>04 � Produto Acabado;
   *          <li>05 � Subproduto;
   *          <li>06 � Produto Intermedi�rio;
   *          <li>07 � Material de Uso e Consumo;
   *          <li>08 � Ativo Imobilizado;
   *          <li>09 � Servi�os;
   *          <li>10 � Outros insumos;
   *          <li>99 � Outras
   * @param r08_COD_NCM C�digo da Nomenclatura Comum do Mercosul
   * @param r09_EX_IPI C�digo EX, conforme a TIPI
   * @param r10_COD_GEN C�digo do g�nero do item, conforme a Tabela 4.2.1
   * @param r11_COD_LST C�digo do servi�o conforme lista do Anexo I da Lei Complementar Federal n� 116/03.
   * @param r12_ALIQ_ICMS Al�quota de ICMS aplic�vel ao item nas opera��es internas
   * @param r13_CEST C�digo Especificador da Substitui��o Tribut�ria
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal0200 add0200(SPEDFiscal0190 r0190, String r02_COD_ITEM, String r03_DESCR_ITEM, String r04_COD_BARRA, String r05_COD_ANT_ITEM, String r07_TIPO_ITEM, String r08_COD_NCM, String r09_EX_IPI, String r10_COD_GEN, String r11_COD_LST, BigDecimal r12_ALIQ_ICMS, String r13_CEST) throws RFWException {
    final SPEDFiscal0001 r0001 = SPEDFiscalBuilder.add0001((SPEDFiscalFile) r0190.getSpedFile());

    SPEDFiscal0200 r0200 = r0001.getR0200().get(r02_COD_ITEM);
    if (r0200 == null) {
      r0200 = new SPEDFiscal0200(r0190.getSpedFile());
      r0001.getR0200().put(r02_COD_ITEM, r0200);
    }

    r0200.setR02_COD_ITEM(r02_COD_ITEM);
    r0200.setR03_DESCR_ITEM(r03_DESCR_ITEM);
    r0200.setR04_COD_BARRA(r04_COD_BARRA);
    r0200.setR05_COD_ANT_ITEM(r05_COD_ANT_ITEM);
    r0200.setR06_UNID_INV(r0190.getR02_UNID());
    r0200.setR07_TIPO_ITEM(r07_TIPO_ITEM);
    r0200.setR08_COD_NCM(r08_COD_NCM);
    r0200.setR09_EX_IPI(r09_EX_IPI);
    r0200.setR10_COD_GEN(r10_COD_GEN);
    r0200.setR11_COD_LST(r11_COD_LST);
    r0200.setR12_ALIQ_ICMS(r12_ALIQ_ICMS);
    r0200.setR13_CEST(r13_CEST);
    return r0200;
  }

  /**
   * REGISTRO H020: INFORMA��O COMPLEMENTAR DO INVENT�RIO Observa��es:
   * <li>N�vel hier�rquico: 2</li>
   * <li>Ocorr�ncia: v�rios por arquivo</li>
   *
   * @param r02_CST_ICMS
   * @param r03_BC_ICMS
   * @param r04_VL_ICMS
   *
   * @param rh010 Registro pai.
   * @param r02_CST_ICMS C�digo da Situa��o Tribut�ria referente ao ICMS, conforme a Tabela indicada no item 4.3.1
   * @param r03_BC_ICMS Informe a base de c�lculo do ICMS
   * @param r04_VL_ICMS Informe o valor do ICMS a ser debitado ou creditado
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalH020 addH020(SPEDFiscalH010 rh010, String r02_CST_ICMS, BigDecimal r03_BC_ICMS, BigDecimal r04_VL_ICMS) throws RFWException {
    SPEDFiscalH020 rh020 = new SPEDFiscalH020(rh010.getSpedFile());
    rh010.getRh020().add(rh020);
    rh020.setR02_CST_ICMS(r02_CST_ICMS);
    rh020.setR03_BC_ICMS(r03_BC_ICMS);
    rh020.setR04_VL_ICMS(r04_VL_ICMS);
    return rh020;
  }

  /**
   * REGISTRO K001: ABERTURA DO BLOCO K<Br>
   * <Br>
   * Observa��es:
   * <li>N�vel hier�rquico - 1</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   * <br>
   *
   * @param sped Arquivo do SPED.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalK001 addK001(SPEDFiscalFile sped) throws RFWException {
    SPEDFiscalK001 rk001 = sped.getRK001();
    if (rk001 == null) {
      rk001 = new SPEDFiscalK001(sped);
      sped.setRK001(rk001);
    }
    return rk001;
  }

  /**
   * REGISTRO K100: PER�ODO DE APURA��O DO ICMS/IPI<br>
   * Observa��es:
   * <li>N�vel hier�rquico - 2</li>
   * <li>Ocorr�ncia � V�rios</li>
   *
   * @param rk001 Registro Pai
   * @param r02_DT_INI Data inicial a que a apura��o se refere
   * @param r03_DT_FIN Data final a que a apura��o se refere
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalK100 addK100(SPEDFiscalK001 rk001, LocalDate r02_DT_INI, LocalDate r03_DT_FIN) throws RFWException {
    SPEDFiscal0000 r0000 = ((SPEDFiscalFile) rk001.getSpedFile()).getR0000();

    String uniqueID = r0000.getR04_DT_INI().atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli() + "|" + r0000.getR05_DT_FIN().atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();

    SPEDFiscalK100 rk100 = rk001.getRk100().get(uniqueID);
    if (rk100 == null) {
      rk100 = new SPEDFiscalK100(rk001.getSpedFile());
      rk001.getRk100().put(uniqueID, rk100);
      rk100.setR02_DT_INI(r02_DT_INI);
      rk100.setR03_DT_FIN(r03_DT_FIN);
    }
    return rk100;
  }
}
