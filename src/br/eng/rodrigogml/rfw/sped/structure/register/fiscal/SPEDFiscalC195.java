package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C195: OBSERVAÇOES DO LANÇAMENTO FISCAL (CÓDIGO 01, 1B, 04 E 55).<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalC195 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscalC195(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 COD_OBS Código da observação do lançamento fiscal (campo 02 do Registro 0460) C 006 - O O
   */
  @SPEDField(maxLength = 6)
  private String r02_COD_OBS = null;

  /**
   * 03 TXT_COMPL Descrição complementar do código de observação. C - - OC OC
   */
  @SPEDField(maxLength = 5000, required = false)
  private String r03_TXT_COMPL = null;

  @Override
  public String get01_Register() {
    return "C195";
  }

  /**
   * Recupera o 02 COD_OBS Código da observação do lançamento fiscal (campo 02 do Registro 0460) C 006 - O O.
   *
   * @return the 02 COD_OBS Código da observação do lançamento fiscal (campo 02 do Registro 0460) C 006 - O O
   */
  public String getR02_COD_OBS() {
    return r02_COD_OBS;
  }

  /**
   * Define o 02 COD_OBS Código da observação do lançamento fiscal (campo 02 do Registro 0460) C 006 - O O.
   *
   * @param r02_COD_OBS the new 02 COD_OBS Código da observação do lançamento fiscal (campo 02 do Registro 0460) C 006 - O O
   */
  public void setR02_COD_OBS(String r02_COD_OBS) {
    this.r02_COD_OBS = r02_COD_OBS;
  }

  /**
   * Recupera o 03 TXT_COMPL Descrição complementar do código de observação. C - - OC OC.
   *
   * @return the 03 TXT_COMPL Descrição complementar do código de observação
   */
  public String getR03_TXT_COMPL() {
    return r03_TXT_COMPL;
  }

  /**
   * Define o 03 TXT_COMPL Descrição complementar do código de observação. C - - OC OC.
   *
   * @param r03_TXT_COMPL the new 03 TXT_COMPL Descrição complementar do código de observação
   */
  public void setR03_TXT_COMPL(String r03_TXT_COMPL) {
    this.r03_TXT_COMPL = r03_TXT_COMPL;
  }

}