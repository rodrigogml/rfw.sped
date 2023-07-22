package br.eng.rodrigogml.rfw.sped.structure.fiscal;

import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO 0001: ABERTURA DO BLOCO 0.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscal0001 extends SPEDRegister {

  /**
   * REGISTRO 0005: DADOS COMPLEMENTARES DA ENTIDADE
   */
  private SPEDFiscal0005 r0005 = null;

  /**
   * REGISTRO 0100: DADOS DO CONTABILISTA
   */
  private SPEDFiscal0100 r0100 = null;

  /**
   * REGISTRO 0150: TABELA DE CADASTRO DO PARTICIPANTE<br>
   * Chave: CNPJ ou CPF dependendo do tipo do participante.
   */
  private final LinkedHashMap<String, SPEDFiscal0150> r0150 = new LinkedHashMap<String, SPEDFiscal0150>();

  /**
   * REGISTRO 0190: IDENTIFICAÇÃO DAS UNIDADES DE MEDIDA
   */
  private final LinkedHashMap<String, SPEDFiscal0190> r0190 = new LinkedHashMap<String, SPEDFiscal0190>();

  /**
   * REGISTRO 0200: TABELA DE IDENTIFICAÇÃO DO ITEM (PRODUTO E SERVIÇOS)<br>
   * Chave: COD_ITEM. - O Código do Item é o ID do objeto ItemVO. Não utilizaremos os códigos dos produtos, mas sim converteremos tudo para a unidade de medida padrão do Item.
   */
  private final LinkedHashMap<String, SPEDFiscal0200> r0200 = new LinkedHashMap<String, SPEDFiscal0200>();

  /**
   * REGISTRO 0400: TABELA DE NATUREZA DA OPERAÇÃO/PRESTAÇÃO
   */
  private final LinkedHashMap<String, SPEDFiscal0400> r0400 = new LinkedHashMap<String, SPEDFiscal0400>();

  /**
   * REGISTRO 0450: TABELA DE INFORMAÇÃO COMPLEMENTAR DO DOCUMENTO FISCAL
   */
  private final LinkedHashMap<String, SPEDFiscal0450> r0450 = new LinkedHashMap<String, SPEDFiscal0450>();

  /**
   * REGISTRO 0460: TABELA DE OBSERVAÇÕES DO LANÇAMENTO FISCAL
   */
  private final LinkedHashMap<String, SPEDFiscal0460> r0460 = new LinkedHashMap<String, SPEDFiscal0460>();

  /**
   * REGISTRO 0500: PLANO DE CONTAS CONTÁBEIS
   */
  private final LinkedHashMap<String, SPEDFiscal0500> r0500 = new LinkedHashMap<String, SPEDFiscal0500>();

  /**
   * 02 IND_MOV Indicador de movimento:<br>
   * 0- Bloco com dados informados;<br>
   * 1- Bloco sem dados informados.<Br>
   * N 001 - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r02_IND_MOV = null;

  @Override
  public String get01_Register() {
    return "0001";
  }

  /**
   * Recupera o 02 IND_MOV Indicador de movimento:<br>
   * 0- Bloco com dados informados;<br>
   * 1- Bloco sem dados informados.<Br>
   * N 001 - O.
   *
   * @return the 02 IND_MOV Indicador de movimento:<br>
   *         0- Bloco com dados informados;<br>
   *         1- Bloco sem dados informados
   */
  public String getR02_IND_MOV() {
    return r02_IND_MOV;
  }

  /**
   * Define o 02 IND_MOV Indicador de movimento:<br>
   * 0- Bloco com dados informados;<br>
   * 1- Bloco sem dados informados.<Br>
   * N 001 - O.
   *
   * @param r02_IND_MOV the new 02 IND_MOV Indicador de movimento:<br>
   *          0- Bloco com dados informados;<br>
   *          1- Bloco sem dados informados
   */
  public void setR02_IND_MOV(String r02_IND_MOV) {
    this.r02_IND_MOV = r02_IND_MOV;
  }

  /**
   * Recupera o rEGISTRO 0005: DADOS COMPLEMENTARES DA ENTIDADE.
   *
   * @return the rEGISTRO 0005: DADOS COMPLEMENTARES DA ENTIDADE
   */
  public SPEDFiscal0005 getR0005() {
    return r0005;
  }

  /**
   * Define o rEGISTRO 0005: DADOS COMPLEMENTARES DA ENTIDADE.
   *
   * @param r0005 the new rEGISTRO 0005: DADOS COMPLEMENTARES DA ENTIDADE
   */
  public void setR0005(SPEDFiscal0005 r0005) {
    this.r0005 = r0005;
  }

  /**
   * Recupera o rEGISTRO 0100: DADOS DO CONTABILISTA.
   *
   * @return the rEGISTRO 0100: DADOS DO CONTABILISTA
   */
  public SPEDFiscal0100 getR0100() {
    return r0100;
  }

  /**
   * Define o rEGISTRO 0100: DADOS DO CONTABILISTA.
   *
   * @param r0100 the new rEGISTRO 0100: DADOS DO CONTABILISTA
   */
  public void setR0100(SPEDFiscal0100 r0100) {
    this.r0100 = r0100;
  }

  /**
   * Recupera o rEGISTRO 0200: TABELA DE IDENTIFICAÇÃO DO ITEM (PRODUTO E SERVIÇOS)<br>
   * Chave: COD_ITEM. - O Código do Item é o ID do objeto ItemVO. Não utilizaremos os códigos dos produtos, mas sim converteremos tudo para a unidade de medida padrão do Item.
   *
   * @return the rEGISTRO 0200: TABELA DE IDENTIFICAÇÃO DO ITEM (PRODUTO E SERVIÇOS)<br>
   *         Chave: COD_ITEM
   */
  public LinkedHashMap<String, SPEDFiscal0200> getR0200() {
    return r0200;
  }

  /**
   * Recupera o rEGISTRO 0150: TABELA DE CADASTRO DO PARTICIPANTE<br>
   * Chave: CNPJ ou CPF dependendo do tipo do participante.
   *
   * @return the rEGISTRO 0150: TABELA DE CADASTRO DO PARTICIPANTE<br>
   *         Chave: CNPJ ou CPF dependendo do tipo do participante
   */
  public LinkedHashMap<String, SPEDFiscal0150> getR0150() {
    return r0150;
  }

  /**
   * Recupera o rEGISTRO 0450: TABELA DE INFORMAÇÃO COMPLEMENTAR DO DOCUMENTO FISCAL.
   *
   * @return the rEGISTRO 0450: TABELA DE INFORMAÇÃO COMPLEMENTAR DO DOCUMENTO FISCAL
   */
  public LinkedHashMap<String, SPEDFiscal0450> getR0450() {
    return r0450;
  }

  /**
   * Recupera o rEGISTRO 0190: IDENTIFICAÇÃO DAS UNIDADES DE MEDIDA.
   *
   * @return the rEGISTRO 0190: IDENTIFICAÇÃO DAS UNIDADES DE MEDIDA
   */
  public LinkedHashMap<String, SPEDFiscal0190> getR0190() {
    return r0190;
  }

  /**
   * Recupera o rEGISTRO 0400: TABELA DE NATUREZA DA OPERAÇÃO/PRESTAÇÃO.
   *
   * @return the rEGISTRO 0400: TABELA DE NATUREZA DA OPERAÇÃO/PRESTAÇÃO
   */
  public LinkedHashMap<String, SPEDFiscal0400> getR0400() {
    return r0400;
  }

  /**
   * Recupera o rEGISTRO 0460: TABELA DE OBSERVAÇÕES DO LANÇAMENTO FISCAL.
   *
   * @return the rEGISTRO 0460: TABELA DE OBSERVAÇÕES DO LANÇAMENTO FISCAL
   */
  public LinkedHashMap<String, SPEDFiscal0460> getR0460() {
    return r0460;
  }

  /**
   * Recupera o rEGISTRO 0500: PLANO DE CONTAS CONTÁBEIS.
   *
   * @return the rEGISTRO 0500: PLANO DE CONTAS CONTÁBEIS
   */
  public LinkedHashMap<String, SPEDFiscal0500> getR0500() {
    return r0500;
  }
}