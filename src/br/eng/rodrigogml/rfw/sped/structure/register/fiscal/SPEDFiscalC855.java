package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C855: OBSERVA��ES DO LAN�AMENTO FISCAL (C�DIGO 59).<br>
 *
 * @author Rodrigo Leit�o
 * @since (24 de out. de 2024)
 */
public class SPEDFiscalC855 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscalC855(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * REGISTRO C857: OUTRAS OBRIGA��ES TRIBUT�RIAS, AJUSTES E INFORMA��ES DE VALORES PROVENIENTES DE DOCUMENTO FISCAL.<br>
   * Chave: COD_AJ.
   */
  private final LinkedHashMap<String, SPEDFiscalC857> rc857 = new LinkedHashMap<String, SPEDFiscalC857>();

  /**
   * C�digo da observa��o do lan�amento fiscal (campo 02 do Registro 0460) C 006 - O O
   */
  @SPEDField(maxLength = 6, minLength = 6, required = true)
  private String r02_COD_OBS = null;

  /**
   * Descri��o complementar do c�digo de observa��o. C - - OC OC
   */
  @SPEDField(maxLength = 200, required = true)
  private String r03_TXT_COMPL = null;

  @Override
  public String get01_Register() {
    return "C855";
  }

  /**
   * # c�digo da observa��o do lan�amento fiscal (campo 02 do Registro 0460) C 006 - O O.
   *
   * @return the c�digo da observa��o do lan�amento fiscal (campo 02 do Registro 0460) C 006 - O O
   */
  public String getR02_COD_OBS() {
    return r02_COD_OBS;
  }

  /**
   * # c�digo da observa��o do lan�amento fiscal (campo 02 do Registro 0460) C 006 - O O.
   *
   * @param r02_COD_OBS the new c�digo da observa��o do lan�amento fiscal (campo 02 do Registro 0460) C 006 - O O
   */
  public void setR02_COD_OBS(String r02_COD_OBS) {
    this.r02_COD_OBS = r02_COD_OBS;
  }

  /**
   * # descri��o complementar do c�digo de observa��o. C - - OC OC.
   *
   * @return the descri��o complementar do c�digo de observa��o
   */
  public String getR03_TXT_COMPL() {
    return r03_TXT_COMPL;
  }

  /**
   * # descri��o complementar do c�digo de observa��o. C - - OC OC.
   *
   * @param r03_TXT_COMPL the new descri��o complementar do c�digo de observa��o
   */
  public void setR03_TXT_COMPL(String r03_TXT_COMPL) {
    this.r03_TXT_COMPL = r03_TXT_COMPL;
  }

  /**
   * # rEGISTRO C857: OUTRAS OBRIGA��ES TRIBUT�RIAS, AJUSTES E INFORMA��ES DE VALORES PROVENIENTES DE DOCUMENTO FISCAL.<br>
   * Chave: COD_AJ.
   *
   * @return the rEGISTRO C857: OUTRAS OBRIGA��ES TRIBUT�RIAS, AJUSTES E INFORMA��ES DE VALORES PROVENIENTES DE DOCUMENTO FISCAL
   */
  public LinkedHashMap<String, SPEDFiscalC857> getRc857() {
    return rc857;
  }

}