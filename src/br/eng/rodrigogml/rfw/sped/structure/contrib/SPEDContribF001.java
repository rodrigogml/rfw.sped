package br.eng.rodrigogml.rfw.sped.structure.contrib;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO F001: ABERTURA DO BLOCO F.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribF001 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * Indicador de movimento:
   * <li>0- Bloco com dados informados;
   * <li>1- Bloco sem dados informados<br>
   * C 001 - S
   */
  @SPEDField(maxLength = 1, minLength = 1, required = true)
  private String r02_IND_MOV = null;

  @Override
  public String get01_Register() {
    return "F001";
  }

  /**
   * Recupera o indicador de movimento:
   * <li>0- Bloco com dados informados;
   * <li>1- Bloco sem dados informados<br>
   * C 001 - S.
   *
   * @return the indicador de movimento:
   *         <li>0- Bloco com dados informados;
   *         <li>1- Bloco sem dados informados<br>
   *         C 001 - S
   */
  public String getR02_IND_MOV() {
    return r02_IND_MOV;
  }

  /**
   * Define o indicador de movimento:
   * <li>0- Bloco com dados informados;
   * <li>1- Bloco sem dados informados<br>
   * C 001 - S.
   *
   * @param r02_IND_MOV the new indicador de movimento:
   *          <li>0- Bloco com dados informados;
   *          <li>1- Bloco sem dados informados<br>
   *          C 001 - S
   */
  public void setR02_IND_MOV(String r02_IND_MOV) {
    this.r02_IND_MOV = r02_IND_MOV;
  }

}