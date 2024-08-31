package br.eng.rodrigogml.rfw.sped.structure.fiscal;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO 1001: ABERTURA DO BLOCO 1.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscal1001 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  /**
   * REGISTRO 1010: OBRIGATORIEDADE DE REGISTROS DO BLOCO 1.
   */
  private SPEDFiscal1010 r1010 = null;

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
    return "1001";
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
   * Recupera o rEGISTRO 1010: OBRIGATORIEDADE DE REGISTROS DO BLOCO 1.
   *
   * @return the rEGISTRO 1010: OBRIGATORIEDADE DE REGISTROS DO BLOCO 1
   */
  public SPEDFiscal1010 getR1010() {
    return r1010;
  }

  /**
   * Define o rEGISTRO 1010: OBRIGATORIEDADE DE REGISTROS DO BLOCO 1.
   *
   * @param r1010 the new rEGISTRO 1010: OBRIGATORIEDADE DE REGISTROS DO BLOCO 1
   */
  public void setR1010(SPEDFiscal1010 r1010) {
    this.r1010 = r1010;
  }

}