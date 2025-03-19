package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.time.LocalDate;
import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * REGISTRO K100: PERÍODO DE APURAÇÃO DO ICMS/IPI
 */
public class SPEDFiscalK100 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscalK100(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 DT_INI Data inicial a que a apuração se refere N 8 - O
   */
  @SPEDField(decimals = 0, maxLength = 8, required = true)
  private LocalDate r02_DT_INI = null;

  /**
   * 03 DT_FIN Data final a que a apuração se refere N 8 - O
   */
  @SPEDField(decimals = 0, maxLength = 8, required = true)
  private LocalDate r03_DT_FIN = null;

  /**
   * REGISTRO K200: ESTOQUE ESCRITURADO<br>
   * Chave: COD_ITEM
   */
  private final LinkedHashMap<String, SPEDFiscalK200> rk200 = new LinkedHashMap<String, SPEDFiscalK200>();

  @Override
  public String get01_Register() {
    return "K100";
  }

  /**
   * Recupera o 02 DT_INI Data inicial a que a apuração se refere N 8 - O.
   *
   * @return the 02 DT_INI Data inicial a que a apuração se refere N 8 - O
   */
  public LocalDate getR02_DT_INI() {
    return r02_DT_INI;
  }

  /**
   * Define o 02 DT_INI Data inicial a que a apuração se refere N 8 - O.
   *
   * @param r02_DT_INI the new 02 DT_INI Data inicial a que a apuração se refere N 8 - O
   */
  public void setR02_DT_INI(LocalDate r02_DT_INI) {
    this.r02_DT_INI = r02_DT_INI;
  }

  /**
   * Recupera o 03 DT_FIN Data final a que a apuração se refere N 8 - O.
   *
   * @return the 03 DT_FIN Data final a que a apuração se refere N 8 - O
   */
  public LocalDate getR03_DT_FIN() {
    return r03_DT_FIN;
  }

  /**
   * Define o 03 DT_FIN Data final a que a apuração se refere N 8 - O.
   *
   * @param r03_DT_FIN the new 03 DT_FIN Data final a que a apuração se refere N 8 - O
   */
  public void setR03_DT_FIN(LocalDate r03_DT_FIN) {
    this.r03_DT_FIN = r03_DT_FIN;
  }

  /**
   * Recupera o rEGISTRO K200: ESTOQUE ESCRITURADO<br>
   * Chave: DT_EST, COD_ITEM, IND_EST e COD_PART concatenados com '|' entre eles.
   *
   * @return the rEGISTRO K200: ESTOQUE ESCRITURADO<br>
   *         Chave: DT_EST, COD_ITEM, IND_EST e COD_PART concatenados com '|' entre eles
   */
  public LinkedHashMap<String, SPEDFiscalK200> getRk200() {
    return rk200;
  }
}