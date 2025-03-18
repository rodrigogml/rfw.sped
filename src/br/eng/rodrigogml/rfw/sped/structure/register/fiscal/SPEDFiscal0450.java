package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO 0450: TABELA DE INFORMAÇÃO COMPLEMENTAR DO DOCUMENTO FISCAL.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscal0450 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  /**
   * 02 COD_INF Código da informação complementar do documento fiscal. C 006 - O
   */
  @SPEDField(maxLength = 6)
  private String r02_COD_INF = null;

  /**
   * 03 TXT Texto livre da informação complementar existente no documento fiscal, inclusive espécie de normas legais, poder normativo, número, capitulação, data e demais referências pertinentes com indicação referentes ao tributo. C - - O
   */
  @SPEDField(maxLength = 5000)
  private String r03_TXT = null;

  @Override
  public String get01_Register() {
    return "0450";
  }

  /**
   * Recupera o 02 COD_INF Código da informação complementar do documento fiscal. C 006 - O.
   *
   * @return the 02 COD_INF Código da informação complementar do documento fiscal
   */
  public String getR02_COD_INF() {
    return r02_COD_INF;
  }

  /**
   * Define o 02 COD_INF Código da informação complementar do documento fiscal. C 006 - O.
   *
   * @param r02_COD_INF the new 02 COD_INF Código da informação complementar do documento fiscal
   */
  public void setR02_COD_INF(String r02_COD_INF) {
    this.r02_COD_INF = r02_COD_INF;
  }

  /**
   * Recupera o 03 TXT Texto livre da informação complementar existente no documento fiscal, inclusive espécie de normas legais, poder normativo, número, capitulação, data e demais referências pertinentes com indicação referentes ao tributo. C - - O.
   *
   * @return the 03 TXT Texto livre da informação complementar existente no documento fiscal, inclusive espécie de normas legais, poder normativo, número, capitulação, data e demais referências pertinentes com indicação referentes ao tributo
   */
  public String getR03_TXT() {
    return r03_TXT;
  }

  /**
   * Define o 03 TXT Texto livre da informação complementar existente no documento fiscal, inclusive espécie de normas legais, poder normativo, número, capitulação, data e demais referências pertinentes com indicação referentes ao tributo. C - - O.
   *
   * @param r03_TXT the new 03 TXT Texto livre da informação complementar existente no documento fiscal, inclusive espécie de normas legais, poder normativo, número, capitulação, data e demais referências pertinentes com indicação referentes ao tributo
   */
  public void setR03_TXT(String r03_TXT) {
    this.r03_TXT = r03_TXT;
  }

}