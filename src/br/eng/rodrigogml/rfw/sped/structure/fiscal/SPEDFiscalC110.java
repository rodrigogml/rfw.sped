package br.eng.rodrigogml.rfw.sped.structure.fiscal;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO C110: INFORMAÇÃO COMPLEMENTAR DA NOTA FISCAL (CÓDIGO 01, 1B, 04 e 55)..<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalC110 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  /**
   * REGISTRO C113: DOCUMENTO FISCAL REFERENCIADO.
   */
  private final LinkedHashMap<String, SPEDFiscalC113> rc113 = new LinkedHashMap<String, SPEDFiscalC113>();

  /**
   * REGISTRO C114: INFORMAÇÃO COMPLEMENTAR DA NOTA FISCAL (CÓDIGO 01, 1B, 04 e 55).
   */
  private final ArrayList<SPEDFiscalC114> rc114 = new ArrayList<SPEDFiscalC114>();

  /**
   * REGISTRO C116: CUPOM FISCAL ELETRÔNICO REFERENCIADO.
   */
  private final ArrayList<SPEDFiscalC116> rc116 = new ArrayList<SPEDFiscalC116>();

  /**
   * 02 COD_INF Código da informação complementar do documento fiscal (campo 02 do Registro 0450) C 006 - O O
   */
  @SPEDField(maxLength = 6, required = true)
  private String r02_COD_INF = null;

  /**
   * 03 TXT_COMPL Descrição complementar do código de referência. C - - OC OC
   */
  @SPEDField(maxLength = 65000, required = false)
  private String r03_TXT_COMPL = null;

  @Override
  public String get01_Register() {
    return "C110";
  }

  /**
   * Recupera o 02 COD_INF Código da informação complementar do documento fiscal (campo 02 do Registro 0450) C 006 - O O.
   *
   * @return the 02 COD_INF Código da informação complementar do documento fiscal (campo 02 do Registro 0450) C 006 - O O
   */
  public String getR02_COD_INF() {
    return r02_COD_INF;
  }

  /**
   * Define o 02 COD_INF Código da informação complementar do documento fiscal (campo 02 do Registro 0450) C 006 - O O.
   *
   * @param r02_COD_INF the new 02 COD_INF Código da informação complementar do documento fiscal (campo 02 do Registro 0450) C 006 - O O
   */
  public void setR02_COD_INF(String r02_COD_INF) {
    this.r02_COD_INF = r02_COD_INF;
  }

  /**
   * Recupera o 03 TXT_COMPL Descrição complementar do código de referência. C - - OC OC.
   *
   * @return the 03 TXT_COMPL Descrição complementar do código de referência
   */
  public String getR03_TXT_COMPL() {
    return r03_TXT_COMPL;
  }

  /**
   * Define o 03 TXT_COMPL Descrição complementar do código de referência. C - - OC OC.
   *
   * @param r03_TXT_COMPL the new 03 TXT_COMPL Descrição complementar do código de referência
   */
  public void setR03_TXT_COMPL(String r03_TXT_COMPL) {
    this.r03_TXT_COMPL = r03_TXT_COMPL;
  }

  /**
   * Recupera o rEGISTRO C114: INFORMAÇÃO COMPLEMENTAR DA NOTA FISCAL (CÓDIGO 01, 1B, 04 e 55).
   *
   * @return the rEGISTRO C114: INFORMAÇÃO COMPLEMENTAR DA NOTA FISCAL (CÓDIGO 01, 1B, 04 e 55)
   */
  public ArrayList<SPEDFiscalC114> getRc114() {
    return rc114;
  }

  /**
   * Recupera o rEGISTRO C113: DOCUMENTO FISCAL REFERENCIADO.
   *
   * @return the rEGISTRO C113: DOCUMENTO FISCAL REFERENCIADO
   */
  public LinkedHashMap<String, SPEDFiscalC113> getRc113() {
    return rc113;
  }

  /**
   * Recupera o rEGISTRO C116: CUPOM FISCAL ELETRÔNICO REFERENCIADO.
   *
   * @return the rEGISTRO C116: CUPOM FISCAL ELETRÔNICO REFERENCIADO
   */
  public ArrayList<SPEDFiscalC116> getRc116() {
    return rc116;
  }
}