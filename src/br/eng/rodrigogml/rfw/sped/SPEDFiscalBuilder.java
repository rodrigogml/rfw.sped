package br.eng.rodrigogml.rfw.sped;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneOffset;

import br.eng.rodrigogml.rfw.kernel.RFW;
import br.eng.rodrigogml.rfw.kernel.exceptions.RFWCriticalException;
import br.eng.rodrigogml.rfw.kernel.exceptions.RFWException;
import br.eng.rodrigogml.rfw.kernel.preprocess.PreProcess;
import br.eng.rodrigogml.rfw.kernel.utils.RUTypes;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFiscalFile;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal0000;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal0001;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal0005;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal0100;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal0150;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal0190;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal0200;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal0400;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal0450;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal0460;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal0500;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal1001;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal1010;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalC001;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalC100;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalC110;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalC800;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalC850;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalC855;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalC857;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalC860;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalC890;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalH001;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalH005;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalH010;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalH020;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalK001;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalK100;

/**
 * Description: Classe para auxiliar na montagem e manipulação do arquivo do SPED Fiscal através da estrutura {@link SPEDFiscalFile}.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (22 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDFiscalBuilder {

  /**
   * Construtor privado para classe exclusiva com métodos estáticos.
   */
  private SPEDFiscalBuilder() {
  }

  /**
   * REGISTRO 1001: ABERTURA DO BLOCO 1<Br>
   * <Br>
   * Observações:
   * <li>Nível hierárquico - 1</li>
   * <li>Ocorrência – um por arquivo</li><Br>
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
   * <li>Obs.: Até 31/12/2021 o campo 08 referiu-se ao registro 1600.</li>
   * <li>Nível hierárquico - 2</li>
   * <li>Ocorrência – 1</li>
   * <li>
   *
   * @param r1001 Registro 1001
   * @param indExp Reg. 1100 - Ocorreu averbação (conclusão) de exportação no período?
   * @param indCCRF Reg 1200 – Existem informações acerca de créditos de ICMS a serem controlados, definidos pela Sefaz?
   * @param indComb Reg. 1300 – É comércio varejista de combustíveis com movimentação e/ou estoque no período?
   * @param indUsina Reg. 1390 – Usinas de açúcar e/álcool – O estabelecimento é produtor de açúcar e/ou álcool carburante com movimentação e/ou estoque no período?
   * @param indVA Reg 1400 - Sendo o registro obrigatório em sua Unidade de Federação, existem informações a serem prestadas neste registro?
   * @param indEE Reg 1500 - A empresa é distribuidora de energia e ocorreu fornecimento de energia elétrica para consumidores de outra UF?
   * @param indCart Reg 1601 - Realizou vendas com instrumentos eletrônicos de pagamento?
   * @param infForm Reg. 1700 - Foram emitidos documentos fiscais em papel no período em unidade da federação que exija o controle de utilização de documentos fiscais?
   * @param indAER Reg 1800 - A empresa prestou serviços de transporte aéreo de cargas e de passageiros?
   * @param indGIAF1 Reg. 1960 - Possui informações GIAF1?
   * @param indGIAF3 Reg. 1970 - Possui informações GIAF3?
   * @param indGIAF4 Reg. 1980 - Possui informações GIAF4?
   * @param indRestRessarcComplICMS Reg. 1250 – Possui informações consolidadas de saldos de restituição, ressarcimento e complementação do ICMS?
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
   * REGISTRO 0000: ABERTURA DO ARQUIVO DIGITAL E IDENTIFICAÇÃO DA ENTIDADE<br>
   * <br>
   * Observações:
   * <li>Nível hierárquico - 0</li>
   * <li>Ocorrência - um por arquivo.</li>
   *
   * @param sped Arquivo SPED.
   * @param r03_COD_FIN Código da finalidade do arquivo: 0 - Remessa do arquivo original; 1 - Remessa do arquivo substituto.
   * @param r04_DT_INI Data inicial das informações contidas no arquivo.
   * @param r05_DT_FIN Data final das informações contidas no arquivo.
   * @param r06_NOME Nome empresarial da entidade.
   * @param r07_CNPJ Número de inscrição da entidade no CNPJ.
   * @param r08_CPF Número de inscrição da entidade no CPF.
   * @param r09_UF Sigla da unidade da federação da entidade.
   * @param r10_IE Inscrição Estadual da entidade.
   * @param r11_COD_MUN Código do município do domicílio fiscal da entidade, conforme a tabela IBGE.
   * @param r12_IM Inscrição Municipal da entidade.
   * @param r13_SUFRAMA Inscrição da entidade na SUFRAMA.
   * @param r14_IND_PERFIL Perfil de apresentação do arquivo fiscal; A – Perfil A; B – Perfil B.; C – Perfil C.
   * @param r15_IND_ATIV Indicador de tipo de atividade: 0 – Industrial ou equiparado a industrial; 1 – Outros.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal0000 add0000(SPEDFiscalFile sped, Integer r03_COD_FIN, LocalDate r04_DT_INI, LocalDate r05_DT_FIN, String r06_NOME, String r07_CNPJ, String r08_CPF, String r09_UF, String r10_IE, String r11_COD_MUN, String r12_IM, String r13_SUFRAMA, String r14_IND_PERFIL, String r15_IND_ATIV) throws RFWException {
    SPEDFiscal0000 r0000 = sped.getR0000();
    if (r0000 == null) {
      r0000 = new SPEDFiscal0000(sped);
      sped.setR0000(r0000);
    }

    r0000.setR02_COD_VER("017"); // Código da versão depende do código implementado, por isso é definido como constante no código.
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
   * Observações:
   * <li>Nível hierárquico - 1</li>
   * <li>Ocorrência – um por arquivo</li><Br>
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
   * <li>Observações:</li>
   * <li>Nível hierárquico - 2</li>
   * <li>Ocorrência – um por arquivo</li>
   *
   * @param r0001 Registro pai.
   * @param r02_FANTASIA Nome de fantasia associado ao nome empresarial.
   * @param r03_CEP Código de Endereçamento Postal.
   * @param r04_END Logradouro e endereço do imóvel.
   * @param r05_NUM Número do imóvel.
   * @param r06_COMPL Dados complementares do endereço.
   * @param r07_BAIRRO Bairro em que o imóvel está situado.
   * @param r08_FONE Número do telefone (DDD+FONE).
   * @param r09_FAX Número do fax.
   * @param r10_EMAIL Endereço do correio eletrônico.
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
   * Observações: Registro obrigatório
   * <li>Nível hierárquico - 0</li>
   * <li>Ocorrência – um por arquivo</li><Br>
   *
   * @param r0001 Registro pai.
   * @param r02_NOME Nome do contabilista.
   * @param r03_CPF Número de inscrição do contabilista no CPF.
   * @param r04_CRC Número de inscrição do contabilista no Conselho Regional de Contabilidade.
   * @param r05_CNPJ Número de inscrição do escritório de contabilidade no CNPJ, se houver.
   * @param r06_CEP Código de Endereçamento Postal.
   * @param r07_END Logradouro e endereço do imóvel.
   * @param r08_NUM Número do imóvel.
   * @param r09_COMPL Dados complementares do endereço.
   * @param r10_BAIRRO Bairro em que o imóvel está situado.
   * @param r11_FONE Número do telefone (DDD+FONE).
   * @param r12_FAX Número do fax.
   * @param r13_EMAIL Endereço do correio eletrônico.
   * @param r14_COD_MUN Código do município, conforme tabela IBGE.
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
   * Observações:
   * <li>Nível hierárquico - 1</li>
   * <li>Ocorrência – um por arquivo</li><Br>
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
   * REGISTRO H005: TOTAIS DO INVENTÁRIO<br>
   * <Br>
   * Observações:
   * <li>Nível hierárquico - 2</li>
   * <li>Ocorrência – 1:N</li><Br>
   * <Br>
   *
   * @param rh001 Registro pai.
   * @param uniqueID Identificador único do registro para identificação do registro internamente no desenvolvimento. Conteúdo não é enviado ou escrito no conteúdo do arquivo SPED.
   * @param r02_DT_INV Data do inventário.
   * @param r03_VL_INV Valor total do estoque.
   * @param r04_MOT_INV Informe o motivo do Inventário:
   *          <li>01 – No final no período;</li>
   *          <li>02 – Na mudança de forma de tributação da mercadoria (ICMS);</li>
   *          <li>03 – Na solicitação da baixa cadastral, paralisação temporária e outras situações;</li>
   *          <li>04 – Na alteração de regime de pagamento – condição do contribuinte;</li>
   *          <li>05 – Por determinação dos fiscos;</li>
   *          <li>06 – Para controle das mercadorias sujeitas ao regime de substituição tributária – restituição/ ressarcimento/ complementação.</li>
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
   * REGISTRO H010: INVENTÁRIO.<bR>
   * Observações:
   * <li>Nível hierárquico - 3</li>
   * <li>Ocorrência - 1:N</li>
   *
   * @param rh005 Registro pai.
   * @param uniqueID Identificador único do registro para identificação do registro internamente no desenvolvimento. Conteúdo não é enviado ou escrito no conteúdo do arquivo SPED.
   * @param r02_COD_ITEM Código do item (campo 02 do Registro 0200).
   * @param r03_UNID Unidade do item.
   * @param r04_QTD Quantidade do item.
   * @param r05_VL_UNIT Valor unitário do item.
   * @param r06_VL_ITEM Valor do item.
   * @param r07_IND_PROP Indicador de propriedade/posse do item:
   *          <li>0- Item de propriedade do informante e em seu poder;
   *          <li>1- Item de propriedade do informante em posse de terceiros;
   *          <li>2- Item de propriedade de terceiros em posse do informante
   * @param r08_COD_PART Código do participante (campo 02 do Registro 0150):
   *          <li>proprietário/possuidor que não seja o informante do arquivo
   * @param r09_TXT_COMPL Descrição complementar
   * @param r10_COD_CTA Código da conta analítica contábil debitada/creditada
   * @param r11_VL_ITEM_IR Valor do item para efeitos do Imposto de Renda.
   * @return
   * @throws RFWException
   * @throws RFWException
   */
  public static SPEDFiscalH010 addH010(SPEDFiscalH005 rh005, String uniqueID, String r02_COD_ITEM, String r03_UNID, BigDecimal r04_QTD, BigDecimal r05_VL_UNIT, BigDecimal r06_VL_ITEM, String r07_IND_PROP, String r08_COD_PART, String r09_TXT_COMPL, String r10_COD_CTA, BigDecimal r11_VL_ITEM_IR) throws RFWException {
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
   * REGISTRO 0190: IDENTIFICAÇÃO DAS UNIDADES DE MEDIDA<br>
   * Observações:
   * <li>Nível hierárquico: 2</li>
   * <li>Ocorrência: vários por arquivo</li>
   *
   * @param r0001 Registro pai.
   * @param unitSymbol Simbolo da Unidade de metida (uniqueID).
   * @param unitName Descrição / Nome da unidade de medida.
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
   * REGISTRO 0200: TABELA DE IDENTIFICAÇÃO DO ITEM (PRODUTO E SERVIÇOS)<br>
   * Observações:
   * <li>Nível hierárquico - 2</li>
   * <li>Ocorrência - vários (por arquivo)</li> <Br>
   * <bR>
   * Tenta criar o registro 0190 para registrar a unidade de medida mencionada no atributo r06.
   *
   *
   * @param sped Arquivo SPED.
   * @param r02_COD_ITEM Código do item. (uniqueID)
   * @param r03_DESCR_ITEM Descrição do item.
   * @param r04_COD_BARRA Representação alfanumérico do código de barra do produto, se houver.
   * @param r05_COD_ANT_ITEM Código anterior do item com relação à última informação apresentada
   * @param r06_UNID_INV Unidade de medida utilizada na quantificação de estoques.
   * @param r07_TIPO_ITEM Tipo do item – Atividades Industriais, Comerciais e Serviços:
   *          <li>00 – Mercadoria para Revenda;
   *          <li>01 – Matéria-prima;
   *          <li>02 – Embalagem;
   *          <li>03 – Produto em Processo;
   *          <li>04 – Produto Acabado;
   *          <li>05 – Subproduto;
   *          <li>06 – Produto Intermediário;
   *          <li>07 – Material de Uso e Consumo;
   *          <li>08 – Ativo Imobilizado;
   *          <li>09 – Serviços;
   *          <li>10 – Outros insumos;
   *          <li>99 – Outras
   * @param r08_COD_NCM Código da Nomenclatura Comum do Mercosul
   * @param r09_EX_IPI Código EX, conforme a TIPI
   * @param r10_COD_GEN Código do gênero do item, conforme a Tabela 4.2.1
   * @param r11_COD_LST Código do serviço conforme lista do Anexo I da Lei Complementar Federal nº 116/03.
   * @param r12_ALIQ_ICMS Alíquota de ICMS aplicável ao item nas operações internas
   * @param r13_CEST Código Especificador da Substituição Tributária
   * @param r190_r03_DESCR Descrição da unidade de medida:<br>
   *          <li>Utilizado em conjunto com outras informações para tentar gerar automaticamente o Registro 0190.</li>
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
   * REGISTRO 0200: TABELA DE IDENTIFICAÇÃO DO ITEM (PRODUTO E SERVIÇOS)<br>
   * Observações:
   * <li>Nível hierárquico - 2</li>
   * <li>Ocorrência - vários (por arquivo)</li>
   * <li>Por receber o registro 0190 diretamente, o atributo R06 é extraído diretamente do registro de unidade de medida.
   *
   * @param r0190 Registro 0190 com as informações da unidade de medida do item.
   * @param r02_COD_ITEM Código do item. (uniqueID)
   * @param r03_DESCR_ITEM Descrição do item.
   * @param r04_COD_BARRA Representação alfanumérico do código de barra do produto, se houver.
   * @param r05_COD_ANT_ITEM Código anterior do item com relação à última informação apresentada
   * @param r07_TIPO_ITEM Tipo do item – Atividades Industriais, Comerciais e Serviços:
   *          <li>00 – Mercadoria para Revenda;
   *          <li>01 – Matéria-prima;
   *          <li>02 – Embalagem;
   *          <li>03 – Produto em Processo;
   *          <li>04 – Produto Acabado;
   *          <li>05 – Subproduto;
   *          <li>06 – Produto Intermediário;
   *          <li>07 – Material de Uso e Consumo;
   *          <li>08 – Ativo Imobilizado;
   *          <li>09 – Serviços;
   *          <li>10 – Outros insumos;
   *          <li>99 – Outras
   * @param r08_COD_NCM Código da Nomenclatura Comum do Mercosul
   * @param r09_EX_IPI Código EX, conforme a TIPI
   * @param r10_COD_GEN Código do gênero do item, conforme a Tabela 4.2.1
   * @param r11_COD_LST Código do serviço conforme lista do Anexo I da Lei Complementar Federal nº 116/03.
   * @param r12_ALIQ_ICMS Alíquota de ICMS aplicável ao item nas operações internas
   * @param r13_CEST Código Especificador da Substituição Tributária
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
   * REGISTRO H020: INFORMAÇÃO COMPLEMENTAR DO INVENTÁRIO Observações:
   * <li>Nível hierárquico: 2</li>
   * <li>Ocorrência: vários por arquivo</li>
   *
   * @param r02_CST_ICMS
   * @param r03_BC_ICMS
   * @param r04_VL_ICMS
   *
   * @param rh010 Registro pai.
   * @param r02_CST_ICMS Código da Situação Tributária referente ao ICMS, conforme a Tabela indicada no item 4.3.1
   * @param r03_BC_ICMS Informe a base de cálculo do ICMS
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
   * Observações:
   * <li>Nível hierárquico - 1</li>
   * <li>Ocorrência – um por arquivo</li><Br>
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
   * REGISTRO K100: PERÍODO DE APURAÇÃO DO ICMS/IPI<br>
   * Observações:
   * <li>Nível hierárquico - 2</li>
   * <li>Ocorrência – Vários</li>
   *
   * @param rk001 Registro Pai
   * @param r02_DT_INI Data inicial a que a apuração se refere
   * @param r03_DT_FIN Data final a que a apuração se refere
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

  /**
   * REGISTRO C850: REGISTRO ANALÍTICO DO CF-E-SAT (CODIGO 59)<bR>
   * Observações:
   * <li>Nível hierárquico: 3</li>
   * <li>Ocorrência – 1:N</li><Br>
   * <Br>
   * A documentação determinar que esse registro não deve se repetir para os mesmos: r02_CST_ICMS, r03_CFOP e r04_ALIQ_ICMS. Logo, o método considera o valor recebido nos três arqumentos para gerar a chave de unicidade e identificação no registro pai, com o seguinte código:<br>
   * <code>String uniqueID = r02_CST_ICMS + "|" + r03_CFOP + "|" + r04_ALIQ_ICMS.setScale(2, RFW.getRoundingMode()).toString();</code><Br>
   * <Br>
   * Considerando:
   * <li>r04_ALIQ_ICMS - se passado nulo, será substituído por BigDecimal.Zero para gerar a chave.</li> <Br>
   * <br>
   *
   * @param rc800 Registro pai.
   * @param r02_CST_ICMS Código da Situação Tributária, conforme a Tabela indicada no item 4.3.1.
   * @param r03_CFOP Código Fiscal de Operação e Prestação do agrupamento de itens.
   * @param r04_ALIQ_ICMS Alíquota do ICMS.
   * @param r05_VL_OPR_SUM (O valor deste atributo é sumarizado com o valor já existente do mesmo registro) “Valor total do CF-e” na combinação de CST_ICMS, CFOP e alíquota do ICMS, correspondente ao somatório do valor líquido dos itens.
   * @param r06_VL_BC_ICMS_SUM (O valor deste atributo é sumarizado com o valor já existente do mesmo registro) Valor acumulado da base de cálculo do ICMS, referente à combinação de CST_ICMS, CFOP, e alíquota do ICMS.
   * @param r07_VL_ICMS_SUM (O valor deste atributo é sumarizado com o valor já existente do mesmo registro) Parcela correspondente ao “Valor do ICMS” referente à combinação de CST_ICMS, CFOP e alíquota do ICMS.
   * @param r08_COD_OBS Código da observação do lançamento fiscal (campo 02 do registro 0460)
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalC850 addC850(SPEDFiscalC800 rc800, String r02_CST_ICMS, String r03_CFOP, BigDecimal r04_ALIQ_ICMS, BigDecimal r05_VL_OPR_SUM, BigDecimal r06_VL_BC_ICMS_SUM, BigDecimal r07_VL_ICMS_SUM, String r08_COD_OBS) throws RFWException {
    PreProcess.requiredNonNullCritical(r02_CST_ICMS, "r02_CST_ICMS não pode ser nulo!");
    PreProcess.requiredNonNullCritical(r03_CFOP, "r03_CFOP não pode ser nulo!");

    if (r04_ALIQ_ICMS == null) r04_ALIQ_ICMS = BigDecimal.ZERO;

    String uniqueID = r02_CST_ICMS + "|" + r03_CFOP + "|" + r04_ALIQ_ICMS.setScale(2, RFW.getRoundingMode()).toString();
    SPEDFiscalC850 rc850 = rc800.getRc850().get(uniqueID);
    if (rc850 == null) {
      rc850 = new SPEDFiscalC850(rc800.getSpedFile());
      rc800.getRc850().put(uniqueID, rc850);

      // Por fazer parte da chave os atributos R02, R03 e R04 nunca são alterados e por isso estão dentro do IF de criação do Registro
      rc850.setR02_CST_ICMS(r02_CST_ICMS);
      rc850.setR03_CFOP(r03_CFOP);
      rc850.setR04_ALIQ_ICMS(r04_ALIQ_ICMS);
      rc850.setR05_VL_OPR(BigDecimal.ZERO); // inicia zerado para ser sumarizado conforme lógica abaixo
      rc850.setR06_VL_BC_ICMS(BigDecimal.ZERO); // Inicia zerado para ser sumarizado conforme lógica abaixo
      rc850.setR07_VL_ICMS(BigDecimal.ZERO); // Inicia zerado para ser sumarizado conforme lógica abaixo
    }

    if (r05_VL_OPR_SUM != null) rc850.setR05_VL_OPR(rc850.getR05_VL_OPR().add(r05_VL_OPR_SUM));
    if (r06_VL_BC_ICMS_SUM != null) rc850.setR06_VL_BC_ICMS(rc850.getR06_VL_BC_ICMS().add(r06_VL_BC_ICMS_SUM));
    if (r07_VL_ICMS_SUM != null) rc850.setR07_VL_ICMS(rc850.getR07_VL_ICMS().add(r07_VL_ICMS_SUM));
    rc850.setR08_COD_OBS(r08_COD_OBS);

    return rc850;
  }

  /**
   * REGISTRO C800: CUPOM FISCAL ELETRÔNICO – SAT (CF-E-SAT) (CÓDIGO 59)<br>
   * Observações:
   * <li>Nível hierárquico: 2</li>
   * <li>Ocorrência: Vários</li> <br>
   * <br>
   * Este método não substitui nenhum valor caso o registro já esteja criado para a chave única.<Br>
   * <br>
   * Embora a documentação defina: "Não poderão ser informados dois ou mais registros com a mesma combinação de COD_SIT + NUM_CFE + NUM_SAT + DT_DOC.", apenas a utilização dos campos "NUM_CFE + NUM_SAT" são suficientes para identificar o registro, e são eles os utilizados como chave única durante a criação da uniqueID. Com o código:<br>
   * <code>final String uniqueID = r04_NUM_CFE + "|" + r10_NR_SAT;</code>
   *
   * @param rc001 Registro pai.
   * @param r02_COD_MOD Código do modelo do documento fiscal, conforme a Tabela 4.1.1
   * @param r03_COD_SIT Código da situação do documento fiscal, conforme a Tabela 4.1.2
   * @param r04_NUM_CFE Número do Cupom Fiscal Eletrônico
   * @param r05_DT_DOC Data da emissão do Cupom Fiscal Eletrônico
   * @param r06_VL_CFE Valor total do Cupom Fiscal Eletrônico
   * @param r07_VL_PIS Valor total do PIS
   * @param r08_VL_COFINS Valor total da COFINS
   * @param r09_CNPJ_CPF CNPJ ou CPF do destinatário
   * @param r10_NR_SAT Número de Série do equipamento SAT
   * @param r11_CHV_CFE Chave do Cupom Fiscal Eletrônico
   * @param r12_VL_DESC Valor total de descontos
   * @param r13_VL_MERC Valor total das mercadorias e serviços
   * @param r14_VL_OUT_DA Valor total de outras despesas acessórias e acréscimos
   * @param r15_VL_ICMS Valor do ICMS
   * @param r16_VL_PIS_ST Valor total do PIS retido por subst. trib.
   * @param r17_VL_COFINS_ST Valor total da COFINS retido por subst. trib.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalC800 addC800(SPEDFiscalC001 rc001, String r02_COD_MOD, String r03_COD_SIT, Long r04_NUM_CFE, LocalDate r05_DT_DOC, BigDecimal r06_VL_CFE, BigDecimal r07_VL_PIS, BigDecimal r08_VL_COFINS, String r09_CNPJ_CPF, String r10_NR_SAT, String r11_CHV_CFE, BigDecimal r12_VL_DESC, BigDecimal r13_VL_MERC, BigDecimal r14_VL_OUT_DA, BigDecimal r15_VL_ICMS, BigDecimal r16_VL_PIS_ST, BigDecimal r17_VL_COFINS_ST) throws RFWException {
    final String uniqueID = r04_NUM_CFE + "|" + r10_NR_SAT; // Só esses dois valores já garantem a unicidade do registro
    SPEDFiscalC800 rc800 = rc001.getRc800().get(uniqueID);
    if (rc800 == null) {
      rc800 = new SPEDFiscalC800(rc001.getSpedFile());
      rc001.getRc800().put(uniqueID, rc800);

      rc800.setR02_COD_MOD(r02_COD_MOD);
      rc800.setR03_COD_SIT(r03_COD_SIT);
      rc800.setR04_NUM_CFE(r04_NUM_CFE);

      rc800.setR10_NR_SAT(r10_NR_SAT);
      rc800.setR11_CHV_CFE(r11_CHV_CFE);

      // Este campos só devem ser escriturados para cupons vendidos
      if ("00".equals(r03_COD_SIT)) { // 00 = Documento regular
        rc800.setR05_DT_DOC(RUTypes.formatToddMMyyyy(r05_DT_DOC));
        rc800.setR06_VL_CFE(r06_VL_CFE);
        rc800.setR07_VL_PIS(r07_VL_PIS);
        rc800.setR08_VL_COFINS(r08_VL_COFINS);
        rc800.setR09_CNPJ_CPF(r09_CNPJ_CPF);
        rc800.setR12_VL_DESC(r12_VL_DESC);
        rc800.setR13_VL_MERC(r13_VL_MERC);
        rc800.setR14_VL_OUT_DA(r14_VL_OUT_DA);
        rc800.setR15_VL_ICMS(r15_VL_ICMS);
        rc800.setR16_VL_PIS_ST(r16_VL_PIS_ST);
        rc800.setR17_VL_COFINS_ST(r17_VL_COFINS_ST);
      }
    }
    return rc800;
  }

  /**
   * REGISTRO C001: ABERTURA DO BLOCO C<Br>
   * <Br>
   * Observações:
   * <li>Nível hierárquico - 1</li>
   * <li>Ocorrência – um por arquivo</li><Br>
   * <br>
   *
   * @param sped Arquivo SPED.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalC001 addC001(SPEDFiscalFile sped) throws RFWException {
    SPEDFiscalC001 rc001 = sped.getRC001();
    if (rc001 == null) {
      rc001 = new SPEDFiscalC001(sped);
      sped.setRC001(rc001);
    }
    return rc001;
  }

  /**
   * REGISTRO 0460: TABELA DE OBSERVAÇÕES DO LANÇAMENTO FISCAL<br>
   * <br>
   * <li>Observações:</li>
   * <li>Nível hierárquico - 2</li>
   * <li>Ocorrência –vários (por arquivo)</li>
   *
   * @param r0001 Registro pai.
   * @param r02_COD_OBS Código da Observação do lançamento fiscal.
   * @param r03_TXT Descrição da observação vinculada ao lançamento fiscal.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal0460 add0460(SPEDFiscal0001 r0001, String r02_COD_OBS, String r03_TXT) throws RFWException {
    SPEDFiscal0460 r0460 = r0001.getR0460().get(r02_COD_OBS);
    if (r0460 == null) {
      r0460 = new SPEDFiscal0460(r0001.getSpedFile());
      r0001.getR0460().put(r02_COD_OBS, r0460);
      r0460.setR02_COD_OBS(r02_COD_OBS);
      r0460.setR03_TXT(r03_TXT);
    }
    return r0460;
  }

  /**
   * REGISTRO C855: OBSERVAÇÕES DO LANÇAMENTO FISCAL (CÓDIGO 59)<Br>
   * Observações:<Br>
   * <li>Nível hierárquico - 3</li>
   * <li>Ocorrência - 1:N</li>
   *
   * @param rc800 Registro pai.
   * @param r02_COD_OBS Código da observação do lançamento fiscal (campo 02 do Registro 0460)
   * @param r03_TXT_COMPL Descrição complementar do código de observação.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalC855 addC855(SPEDFiscalC800 rc800, String r02_COD_OBS, String r03_TXT_COMPL) throws RFWException {
    SPEDFiscalC855 rc855 = rc800.getRc855().get(r02_COD_OBS);
    if (rc855 == null) {
      rc855 = new SPEDFiscalC855(rc800.getSpedFile());
      rc800.getRc855().put(r02_COD_OBS, rc855);
      rc855.setR02_COD_OBS(r02_COD_OBS);
      rc855.setR03_TXT_COMPL(r03_TXT_COMPL);
    }
    return rc855;
  }

  /**
   * REGISTRO C857: OUTRAS OBRIGAÇÕES TRIBUTÁRIAS, AJUSTES E INFORMAÇÕES DE VALORES PROVENIENTES DE DOCUMENTO FISCAL.<bR>
   * Observações:
   * <li>Nível hierárquico - 4</li>
   * <li>Ocorrência - 1:N</li> <Br>
   * <bR>
   * O uniqueID para identificar o registro é criado a partir do valor de r02_COD_AJ. Sempre que um registro existente for encontrado, os valores dos campos r05_VL_BC_ICMS_SUM e r07_VL_ICMS_SUM são acumulados com os valores já existentes no registro.
   *
   * @param rc855 Registro pai.
   * @param r02_COD_AJ Código do ajustes/benefício/incentivo, conforme tabela indicada no item 5.3.
   * @param r03_DESCR_COMPL_AJ Descrição complementar do ajuste do documento fiscal
   * @param r04_COD_ITEM Código do item (campo 02 do Registro 0200)
   * @param r05_VL_BC_ICMS_SUM Base de cálculo do ICMS ou do ICMS ST.
   * @param r06_ALIQ_ICMS Alíquota do ICMS.
   * @param r07_VL_ICMS_SUM Valor do ICMS ou do ICMS ST
   * @param r08_VL_OUTROS Outros valores
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalC857 addC857(SPEDFiscalC855 rc855, String r02_COD_AJ, String r03_DESCR_COMPL_AJ, String r04_COD_ITEM, BigDecimal r05_VL_BC_ICMS_SUM, BigDecimal r06_ALIQ_ICMS, BigDecimal r07_VL_ICMS_SUM, BigDecimal r08_VL_OUTROS) throws RFWException {
    SPEDFiscalC857 rc857 = rc855.getRc857().get(r02_COD_AJ);
    if (rc857 == null) {
      rc857 = new SPEDFiscalC857(rc855.getSpedFile());
      rc855.getRc857().put(r02_COD_AJ, rc857);
      rc857.setR02_COD_AJ(r02_COD_AJ);
      rc857.setR03_DESCR_COMPL_AJ(r03_DESCR_COMPL_AJ);
      rc857.setR04_COD_ITEM(r04_COD_ITEM);
      rc857.setR05_VL_BC_ICMS(BigDecimal.ZERO);
      rc857.setR06_ALIQ_ICMS(r06_ALIQ_ICMS);
      rc857.setR07_VL_ICMS(BigDecimal.ZERO);
      rc857.setR08_VL_OUTROS(r08_VL_OUTROS);
    }

    if (r05_VL_BC_ICMS_SUM != null) rc857.setR05_VL_BC_ICMS(rc857.getR05_VL_BC_ICMS().add(r05_VL_BC_ICMS_SUM));
    if (r07_VL_ICMS_SUM != null) rc857.setR07_VL_ICMS(rc857.getR07_VL_ICMS().add(r07_VL_ICMS_SUM));
    return rc857;
  }

  /**
   * REGISTRO C890: RESUMO DIÁRIO DO CF-E-SAT (CÓDIGO 59) POR EQUIPAMENTO SATCF-E<br>
   * Observações:
   * <li>Nível hierárquico: 3</li>
   * <li>Ocorrência - 1:N</li> <bR>
   * <bR>
   * O campo VL_ICMS - Parcela correspondente ao "Valor do ICMS" referente à combinação de CST_ICMS, CFOP e alíquota do ICMS, é calculado automaticamente a partir da multiplicação dos campos r04_ALIQ_ICMS e r06_VL_BC_ICMS.<Br>
   * <br>
   *
   * @param rc860 Registro pai.
   * @param r02_CST_ICMS Código da Situação Tributária, conforme a Tabela indicada no item 4.3.1
   * @param r03_CFOP Código Fiscal de Operação e Prestação do agrupamento de itens
   * @param r04_ALIQ_ICMS Alíquota do ICMS
   * @param r05_VL_OPR_SUM “Valor total do CF-e” na combinação de CST_ICMS, CFOP e ALÍQUOTA DO ICMS, correspondente ao somatório do valor líquido dos itens
   * @param r06_VL_BC_ICMS Valor acumulado da base de cálculo do ICMS, referente à combinação de CST_ICMS, CFOP e ALÍQUOTA DO ICMS.
   * @param r08_COD_OBS Código da observação do lançamento fiscal (campo 02 do registro 0460)
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalC890 addC890(SPEDFiscalC860 rc860, String r02_CST_ICMS, String r03_CFOP, BigDecimal r04_ALIQ_ICMS, BigDecimal r05_VL_OPR_SUM, BigDecimal r06_VL_BC_ICMS, String r08_COD_OBS) throws RFWException {
    if (r04_ALIQ_ICMS == null) r04_ALIQ_ICMS = BigDecimal.ZERO;
    String uniqueID = r02_CST_ICMS + "|" + r03_CFOP + "|" + r04_ALIQ_ICMS.setScale(2, RFW.getRoundingMode()).toString();
    SPEDFiscalC890 rc890 = rc860.getRc890().get(uniqueID);
    if (rc890 == null) {
      rc890 = new SPEDFiscalC890(rc860.getSpedFile());
      rc860.getRc890().put(uniqueID, rc890);

      rc890.setR02_CST_ICMS(r02_CST_ICMS);
      rc890.setR03_CFOP(r03_CFOP);
      rc890.setR04_ALIQ_ICMS(r04_ALIQ_ICMS);
      rc890.setR05_VL_OPR(BigDecimal.ZERO); // inicia zerado para ser sumarizado conforme lógica abaixo
      rc890.setR06_VL_BC_ICMS(BigDecimal.ZERO); // Inicia zerado para ser sumarizado conforme lógica abaixo
      rc890.setR07_VL_ICMS_AUTO(BigDecimal.ZERO); // Inicia zerado para ser sumarizado conforme lógica abaixo
      rc890.setR08_COD_OBS(r08_COD_OBS);
    }

    rc890.setR05_VL_OPR(rc890.getR05_VL_OPR().add(r05_VL_OPR_SUM));
    rc890.setR06_VL_BC_ICMS(rc890.getR06_VL_BC_ICMS().add(r06_VL_BC_ICMS));

    return rc890;
  }

  /**
   * REGISTRO C860: IDENTIFICAÇÃO DO EQUIPAMENTO SAT-CF-E <br>
   * Observações:
   * <li>Nível hierárquico: 2</li>
   * <li>Ocorrência - vários (por arquivo)</li> <Br>
   * <br>
   * O registro é identificado pelo valor do atributo r03_NR_SAT, e sempre quem este método for chamado passando o mesmo valor de r03_NR_SAT, o 'range' de número do documento (definidos pelos campos r05 e r06) são atualizados de forma que o range definido no registro inclua do número de documento mais baixo até o mais alto recebido.<Br>
   * <bR>
   *
   * @param rc001 Registro pai.
   * @param r02_COD_MOD Código do modelo do documento fiscal, conforme a Tabela 4.1.1
   * @param r03_NR_SAT Número de Série do equipamento SAT
   * @param r04_DT_DOC Data de emissão dos documentos fiscais
   * @param r05_DOC_INI Número do documento inicial
   * @param r06_DOC_FIM Número do documento final
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalC860 addC860(SPEDFiscalC001 rc001, String r02_COD_MOD, String r03_NR_SAT, LocalDate r04_DT_DOC, Long r05_DOC_INI, Long r06_DOC_FIM) throws RFWException {
    SPEDFiscalC860 rc860 = new SPEDFiscalC860(rc001.getSpedFile());
    rc860 = rc001.getRc860().get(r03_NR_SAT);
    if (rc860 == null) {
      rc860 = new SPEDFiscalC860(rc001.getSpedFile());
      rc001.getRc860().put(r03_NR_SAT, rc860);

      rc860.setR02_COD_MOD(r02_COD_MOD);
      rc860.setR03_NR_SAT(r03_NR_SAT);
      rc860.setR04_DT_DOC(r04_DT_DOC);
      rc860.setR05_DOC_INI(r05_DOC_INI); // O documento inicial deve ser atualizado depois conforme novos cupons forem sendo adicionados aos registros filhos
      rc860.setR06_DOC_FIM(r06_DOC_FIM);// O documento final deve ser atualizado depois conforme novos cupons forem sendo adicionados aos registros filhos
    } else {
      // Caso já existia, atualizamos os campos de "cupom incial" e "cupom final" para incluir a numeração deste cupom dentro do "range" definido no registro
      if (rc860.getR05_DOC_INI().compareTo(r05_DOC_INI) > 0) rc860.setR05_DOC_INI(r05_DOC_INI);
      if (rc860.getR06_DOC_FIM().compareTo(r06_DOC_FIM) < 0) rc860.setR06_DOC_FIM(r06_DOC_FIM);
    }

    return rc860;
  }

  /**
   * REGISTRO C100: NOTA FISCAL (CÓDIGO 01), NOTA FISCAL AVULSA (CÓDIGO 1B), NOTA FISCAL DE PRODUTOR (CÓDIGO 04), NF-e (CÓDIGO 55) e NFC-e (CÓDIGO 65).<br>
   * Observações:
   * <li>Nível hierárquico – 2</li>
   * <li>Ocorrência – vários (por arquivo)</li><br>
   * <br>
   *
   * @param rc001 Registro pai.
   * @param r02_IND_OPER Indicador do tipo de operação: 0 - Entrada; 1 - Saída
   * @param r03_IND_EMIT Indicador do emitente do documento fiscal: 0 - Emissão própria; 1 - Terceiros
   * @param r04_COD_PART Código do participante (campo 02 do Registro 0150):
   *          <li>- do emitente do documento ou do remetente das mercadorias, no caso de entradas;
   *          <li>- do adquirente, no caso de saídas
   * @param r05_COD_MOD Código do modelo do documento fiscal, conforme a Tabela 4.1.1
   * @param r06_COD_SIT Código da situação do documento fiscal, conforme a Tabela 4.1.2
   * @param r07_SER Série do documento fiscal
   * @param r08_NUM_DOC Número do documento fiscal
   * @param r09_CHV_NFE Chave da Nota Fiscal Eletrônica
   * @param r10_DT_DOC Data da emissão do documento fiscal
   * @param r11_DT_E_S Data da entrada ou da saída
   * @param r12_VL_DOC Valor total do documento fiscal
   * @param r13_IND_PGTO Indicador do tipo de pagamento: 0 - À vista; 1 - A prazo; 9 - Sem pagamento<bR>
   *          Obs.: A partir de 01/07/2012 passará a ser: Indicador do tipo de pagamento: 0 - À vista; 1 - A prazo; 2 - Outros
   * @param r14_VL_DESC Valor total do desconto
   * @param r15_VL_ABAT_NT Abatimento não tributado e não comercial Por exemplo: desconto ICMS nas remessas para ZFM.
   * @param r16_VL_MERC Valor total das mercadorias e serviços
   * @param r17_IND_FRT Obs: A partir de 01/01/2018 passará a ser: Indicador do tipo de frete:
   *          <li>0 - Contratação do Frete por conta do Remetente (CIF);
   *          <li>1 - Contratação do Frete por conta do Destinatário (FOB);
   *          <li>2 - Contratação do Frete por conta de Terceiros;
   *          <li>3 - Transporte Próprio por conta do Remetente;
   *          <li>4 - Transporte Próprio por conta do Destinatário;
   *          <li>9 - Sem Ocorrência de Transporte.
   * @param r18_VL_FRT Valor do frete indicado no documento fiscal
   * @param r19_VL_SEG Valor do seguro indicado no documento fiscal
   * @param r20_VL_OUT_DA Valor de outras despesas acessórias
   * @param r21_VL_BC_ICMS Valor da base de cálculo do ICMS
   * @param r22_VL_ICMS Valor do ICMS
   * @param r23_VL_BC_ICMS_ST Valor da base de cálculo do ICMS substituição tributária
   * @param r24_VL_ICMS_ST Valor do ICMS retido por substituição tributária
   * @param r25_VL_IPI Valor total do IPI
   * @param r26_VL_PIS Valor total do PIS
   * @param r27_VL_COFINS Valor total da COFINS
   * @param r28_VL_PIS_ST Valor total do PIS retido por substituição tributária
   * @param r29_VL_COFINS_ST Valor total da COFINS retido por substituição tributária
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalC100 addC100(SPEDFiscalC001 rc001, String r02_IND_OPER, String r03_IND_EMIT, String r04_COD_PART, String r05_COD_MOD, String r06_COD_SIT, String r07_SER, String r08_NUM_DOC, String r09_CHV_NFE, LocalDate r10_DT_DOC, LocalDate r11_DT_E_S, BigDecimal r12_VL_DOC, String r13_IND_PGTO, BigDecimal r14_VL_DESC, BigDecimal r15_VL_ABAT_NT, BigDecimal r16_VL_MERC, String r17_IND_FRT, BigDecimal r18_VL_FRT, BigDecimal r19_VL_SEG, BigDecimal r20_VL_OUT_DA, BigDecimal r21_VL_BC_ICMS, BigDecimal r22_VL_ICMS, BigDecimal r23_VL_BC_ICMS_ST, BigDecimal r24_VL_ICMS_ST, BigDecimal r25_VL_IPI, BigDecimal r26_VL_PIS, BigDecimal r27_VL_COFINS, BigDecimal r28_VL_PIS_ST, BigDecimal r29_VL_COFINS_ST) throws RFWException {
    String uniqueID = null;
    switch (r05_COD_MOD) {
      case "01": // Modelo 1/1A - Nota de Talão equivalente a NFe
        uniqueID = "MODEL01|" + r04_COD_PART + "|" + r08_NUM_DOC;
        break;
      case "55": // NFe
        uniqueID = "MODEL55|" + r09_CHV_NFE;
        break;
      case "65": // NFCe
        // Ainda não preparado
        break;
    }
    if (uniqueID == null) {
      throw new RFWCriticalException("RFW.SPED não preparado para trabalhar com o modelo de NF '${0}' no registro C100!", new String[] { r05_COD_MOD });
    }

    SPEDFiscalC100 rc100 = rc001.getRc100().get(uniqueID);
    if (rc100 == null) {
      rc100 = new SPEDFiscalC100(rc001.getSpedFile());
      rc001.getRc100().put(uniqueID, rc100);

      rc100.setR02_IND_OPER(r02_IND_OPER);
      rc100.setR03_IND_EMIT(r03_IND_EMIT);
      rc100.setR04_COD_PART(r04_COD_PART);
      rc100.setR05_COD_MOD(r05_COD_MOD);
      rc100.setR06_COD_SIT(r06_COD_SIT);
      rc100.setR07_SER(r07_SER);
      rc100.setR08_NUM_DOC(r08_NUM_DOC);
      rc100.setR09_CHV_NFE(r09_CHV_NFE);
      rc100.setR10_DT_DOC(r10_DT_DOC);
      rc100.setR11_DT_E_S(r11_DT_E_S);
      rc100.setR12_VL_DOC(r12_VL_DOC);
      rc100.setR13_IND_PGTO(r13_IND_PGTO);
      rc100.setR14_VL_DESC(r14_VL_DESC);
      rc100.setR15_VL_ABAT_NT(r15_VL_ABAT_NT);
      rc100.setR16_VL_MERC(r16_VL_MERC);
      rc100.setR17_IND_FRT(r17_IND_FRT);
      rc100.setR18_VL_FRT(r18_VL_FRT);
      rc100.setR19_VL_SEG(r19_VL_SEG);
      rc100.setR20_VL_OUT_DA(r20_VL_OUT_DA);
      rc100.setR21_VL_BC_ICMS(r21_VL_BC_ICMS);
      rc100.setR22_VL_ICMS(r22_VL_ICMS);
      rc100.setR23_VL_BC_ICMS_ST(r23_VL_BC_ICMS_ST);
      rc100.setR24_VL_ICMS_ST(r24_VL_ICMS_ST);
      rc100.setR25_VL_IPI(r25_VL_IPI);
      rc100.setR26_VL_PIS(r26_VL_PIS);
      rc100.setR27_VL_COFINS(r27_VL_COFINS);
      rc100.setR28_VL_PIS_ST(r28_VL_PIS_ST);
      rc100.setR29_VL_COFINS_ST(r29_VL_COFINS_ST);
    }
    return rc100;
  }

  /**
   * REGISTRO 0150: TABELA DE CADASTRO DO PARTICIPANTE<bR>
   * Observações:
   * <li>Nível hierárquico - 2</li>
   * <li>Ocorrência –vários por arquivo</li><br>
   * <br>
   * Não permite dois registros com o mesmo CPF ou CNPJ, assim o registro é identificado pelo documento informado em r05_CNPJ ou r06_CPF.
   *
   * @param r0001 Registro pai.
   * @param r02_COD_PART Código de identificação do participante no arquivo.
   * @param r03_NOME Nome pessoal ou empresarial do participante.
   * @param r04_COD_PAIS Código do país do participante, conforme a tabela indicada no item 3.2.1
   * @param r05_CNPJ CNPJ do participante.
   * @param r06_CPF CPF do participante.
   * @param r07_IE Inscrição Estadual do participante.
   * @param r08_COD_MUN Código do município, conforme a tabela IBGE
   * @param r09_SUFRAMA Número de inscrição do participante na SUFRAMA.
   * @param r10_END Logradouro e endereço do imóvel
   * @param r11_NUM Número do imóvel
   * @param r12_COMPL Dados complementares do endereço
   * @param r13_BAIRRO Bairro em que o imóvel está situado
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal0150 add0150(SPEDFiscal0001 r0001, String r02_COD_PART, String r03_NOME, String r04_COD_PAIS, String r05_CNPJ, String r06_CPF, String r07_IE, String r08_COD_MUN, String r09_SUFRAMA, String r10_END, String r11_NUM, String r12_COMPL, String r13_BAIRRO) throws RFWException {
    SPEDFiscal0150 r0150 = null;
    String doc = r05_CNPJ;
    if (r05_CNPJ == null) doc = r06_CPF;
    r0150 = r0001.getR0150().get(doc);
    if (r0150 == null) {
      r0150 = new SPEDFiscal0150(r0001.getSpedFile());
      r0001.getR0150().put(r02_COD_PART, r0150);
      r0150.setR02_COD_PART(r02_COD_PART);
      r0150.setR03_NOME(r03_NOME);
      r0150.setR04_COD_PAIS(r04_COD_PAIS);
      r0150.setR05_CNPJ(r05_CNPJ);
      r0150.setR06_CPF(r06_CPF);
      r0150.setR07_IE(r07_IE);
      r0150.setR08_COD_MUN(r08_COD_MUN);
      r0150.setR09_SUFRAMA(r09_SUFRAMA);
      r0150.setR10_END(r10_END);
      r0150.setR11_NUM(r11_NUM);
      r0150.setR12_COMPL(r12_COMPL);
      r0150.setR13_BAIRRO(r13_BAIRRO);
    }
    return r0150;
  }

  /**
   * REGISTRO 0500: PLANO DE CONTAS CONTÁBEIS<br>
   * <br>
   * Observações:
   * <li>Nível hierárquico - 2</li>
   * <li>Ocorrência - vários (por arquivo)</li><br>
   * <bR>
   * Registro único por r06_COD_CTA. Caso o mesmo r06_COD_CTA seja passado de um registro existente, será retornado o registro existente e nenhum novo será criado.
   *
   * @param r0001 Registro pai.
   * @param r02_DT_ALT Data da inclusão/alteração
   * @param r03_COD_NAT_CC Código da natureza da conta/grupo de contas:
   *          <li>01 - Contas de ativo;
   *          <li>02 - Contas de passivo;
   *          <li>03 - Patrimônio líquido;
   *          <li>04 - Contas de resultado;
   *          <li>05 - Contas de compensação;
   *          <li>09 - Outras.
   * @param r04_IND_CTA Indicador do tipo de conta: S - Sintética (grupo de contas); A - Analítica (conta).
   * @param r05_NÍVEL Nível da conta analítica/grupo de contas.
   * @param r06_COD_CTA Código da conta analítica/grupo de contas.
   * @param r07_NOME_CTA Nome da conta analítica/grupo de contas
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal0500 add0500(SPEDFiscal0001 r0001, LocalDate r02_DT_ALT, String r03_COD_NAT_CC, String r04_IND_CTA, String r05_NÍVEL, String r06_COD_CTA, String r07_NOME_CTA) throws RFWException {
    SPEDFiscal0500 r0500 = r0001.getR0500().get(r06_COD_CTA);
    if (r0500 == null) {
      r0500 = new SPEDFiscal0500(r0001.getSpedFile());
      r0001.getR0500().put(r06_COD_CTA, r0500);
      r0500.setR02_DT_ALT(r02_DT_ALT);
      r0500.setR03_COD_NAT_CC(r03_COD_NAT_CC);
      r0500.setR04_IND_CTA(r04_IND_CTA);
      r0500.setR05_NÍVEL(r05_NÍVEL);
      r0500.setR06_COD_CTA(r06_COD_CTA);
      r0500.setR07_NOME_CTA(r07_NOME_CTA);
    }
    return r0500;
  }

  /**
   * REGISTRO 0400: TABELA DE NATUREZA DA OPERAÇÃO/PRESTAÇÃO<bR>
   * Observações:
   * <li>Nível hierárquico - 2</li>
   * <li>Ocorrência – vários (por arquivo)</li> <br>
   * <br>
   * Registro único por r02_COD_NAT. Caso o mesmo r02_COD_NAT seja passado de um registro existente, será retornado o registro existente e nenhum novo será criado.
   *
   * @param r0001 Registro pai.
   * @param r02_COD_NAT Código da natureza da operação/prestação
   * @param r03_DESCR_NAT Descrição da natureza da operação/prestação
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal0400 add0400(SPEDFiscal0001 r0001, String r02_COD_NAT, String r03_DESCR_NAT) throws RFWException {
    SPEDFiscal0400 r0400 = r0001.getR0400().get(r02_COD_NAT);
    if (r0400 == null) {
      r0400 = new SPEDFiscal0400(r0001.getSpedFile());
      r0001.getR0400().put(r02_COD_NAT, r0400);
      r0400.setR02_COD_NAT(r02_COD_NAT);
      r0400.setR03_DESCR_NAT(r03_DESCR_NAT);
    }

    return r0400;
  }

  /**
   * REGISTRO 0450: TABELA DE INFORMAÇÃO COMPLEMENTAR DO DOCUMENTO FISCAL<br>
   * Observações:
   * <li>Nível hierárquico - 2</li>
   * <li>Ocorrência –vários (por arquivo)</li>
   *
   * <br>
   * <bR>
   * Registro único por r02_COD_INF. Caso o mesmo r02_COD_INF seja passado de um registro existente, será retornado o registro existente e nenhum novo será criado.
   *
   *
   * @param r0001 Registro pai.
   * @param r02_COD_INF Código da informação complementar do documento fiscal.
   * @param r03_TXT Texto livre da informação complementar existente no documento fiscal, inclusive espécie de normas legais, poder normativo, número, capitulação, data e demais referências pertinentes com indicações referentes ao tributo.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal0450 add(SPEDFiscal0001 r0001, String r02_COD_INF, String r03_TXT) throws RFWException {
    SPEDFiscal0450 r0450 = r0001.getR0450().get(r02_COD_INF);
    if (r0450 == null) {
      r0450 = new SPEDFiscal0450(r0001.getSpedFile());
      r0001.getR0450().put(r02_COD_INF, r0450);
      r0450.setR02_COD_INF(r02_COD_INF);
      r0450.setR03_TXT(r03_TXT);
    }
    return r0450;
  }

  /**
   * REGISTRO C110: INFORMAÇÃO COMPLEMENTAR DA NOTA FISCAL (CÓDIGO 01, 1B, 04 e 55).<br>
   * Observações:
   * <li>Nível hierárquico - 3</li>
   * <li>Ocorrência - 1:N</li> <br>
   * <bR>
   * Registro único por r02_COD_INF. Caso o mesmo r02_COD_INF seja passado de um registro existente, será retornado o registro existente e nenhum novo será criado.
   *
   *
   * @param rc100 Registro pai.
   * @param r02_COD_INF Código da informação complementar do documento fiscal (campo 02 do Registro 0450)
   * @param r03_TXT_COMPL Descrição complementar do código de referência
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalC110 addC110(SPEDFiscalC100 rc100, String r02_COD_INF, String r03_TXT_COMPL) throws RFWException {
    SPEDFiscalC110 rc110 = rc100.getRc110().get(r02_COD_INF);
    if (rc110 == null) {
      rc110 = new SPEDFiscalC110(rc100.getSpedFile());
      rc100.getRc110().put(r02_COD_INF, rc110);
      rc110.setR02_COD_INF(r02_COD_INF);
      rc110.setR03_TXT_COMPL(r03_TXT_COMPL);
    }
    return rc110;
  }
}
