package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import br.eng.rodrigogml.rfw.kernel.exceptions.RFWException;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO 1001: ABERTURA DO BLOCO 1.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscal1001 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscal1001(SPEDFile spedFile) {
    super(spedFile);
  }

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
  private String r02_IND_MOV_AUTO = null;

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
  public String getR02_IND_MOV_AUTO() {
    return r02_IND_MOV_AUTO;
  }

  /**
   * Define o 02 IND_MOV Indicador de movimento:<br>
   * 0- Bloco com dados informados;<br>
   * 1- Bloco sem dados informados.<Br>
   * N 001 - O.
   *
   * @param r02_IND_MOV_AUTO the new 02 IND_MOV Indicador de movimento:<br>
   *          0- Bloco com dados informados;<br>
   *          1- Bloco sem dados informados
   */
  public void setR02_IND_MOV_AUTO(String r02_IND_MOV_AUTO) {
    this.r02_IND_MOV_AUTO = r02_IND_MOV_AUTO;
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

  @Override
  public void calculate(String uuid) throws RFWException {
    if (uuid == null || !uuid.equals(this.getLastUUID())) {
      super.calculate(uuid);

      if (this.r1010 != null) {
        this.r02_IND_MOV_AUTO = "0";
      } else {
        this.r02_IND_MOV_AUTO = "1";
      }
    }
  }

}