package br.eng.rodrigogml.rfw.sped.structure.fiscal;

import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO H001: ABERTURA DO BLOCO H.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalH001 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  /**
   * REGISTRO H005: TOTAIS DO INVENTÁRIO<br>
   * Chave: ID do inventário: {@link StockInventoryVO} usado para a geração do registro.
   */
  private final LinkedHashMap<String, SPEDFiscalH005> rh005 = new LinkedHashMap<String, SPEDFiscalH005>();

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
    return "H001";
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
   * Recupera o rEGISTRO H005: TOTAIS DO INVENTÁRIO<br>
   * Chave: ID do inventário: {@link StockInventoryVO} usado para a geração do registro.
   *
   * @return the rEGISTRO H005: TOTAIS DO INVENTÁRIO<br>
   *         Chave: ID do inventário: {@link StockInventoryVO} usado para a geração do registro
   */
  public LinkedHashMap<String, SPEDFiscalH005> getRh005() {
    return rh005;
  }
}