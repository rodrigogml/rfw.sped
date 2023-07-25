package br.eng.rodrigogml.rfw.sped.structure.contrib;

import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO 9001: ABERTURA DO BLOCO 9.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContrib9001 extends SPEDRegister {

  /**
   * REGISTRO 9900: REGISTROS DO ARQUIVO
   */
  private LinkedHashMap<String, SPEDContrib9900> r9900 = new LinkedHashMap<String, SPEDContrib9900>();

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
    return "9001";
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

  /**
   * Recupera o rEGISTRO 9900: REGISTROS DO ARQUIVO.
   *
   * @return the rEGISTRO 9900: REGISTROS DO ARQUIVO
   */
  public LinkedHashMap<String, SPEDContrib9900> getR9900() {
    return r9900;
  }

  /**
   * Define o rEGISTRO 9900: REGISTROS DO ARQUIVO.
   *
   * @param r9900 the new rEGISTRO 9900: REGISTROS DO ARQUIVO
   */
  public void setR9900(LinkedHashMap<String, SPEDContrib9900> r9900) {
    this.r9900 = r9900;
  }
}