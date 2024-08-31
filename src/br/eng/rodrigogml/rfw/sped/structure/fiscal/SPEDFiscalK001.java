package br.eng.rodrigogml.rfw.sped.structure.fiscal;

import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO K001: ABERTURA DO BLOCO K.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalK001 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  /**
   * 02 IND_MOV Indicador de movimento:<br>
   * 0- Bloco com dados informados;<br>
   * 1- Bloco sem dados informados.<Br>
   * N 001 - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r02_IND_MOV = null;

  /**
   * REGISTRO K100: PERÍODO DE APURAÇÃO DO ICMS/IPI<br>
   * Chave: Campos DT_INI + '|' + DT_FIN contatenados no formato "long" do objeto Date.
   */
  private final LinkedHashMap<String, SPEDFiscalK100> rk100 = new LinkedHashMap<String, SPEDFiscalK100>();

  @Override
  public String get01_Register() {
    return "K001";
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
   * Recupera o rEGISTRO K100: PERÍODO DE APURAÇÃO DO ICMS/IPI<br>
   * Chave: Campos DT_INI + '|' + DT_FIN contatenados no formato "long" do objeto Date.
   *
   * @return the rEGISTRO K100: PERÍODO DE APURAÇÃO DO ICMS/IPI<br>
   *         Chave: Campos DT_INI + '|' + DT_FIN contatenados no formato "long" do objeto Date
   */
  public LinkedHashMap<String, SPEDFiscalK100> getRk100() {
    return rk100;
  }

}