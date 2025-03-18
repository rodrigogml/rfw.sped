package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO 0460: TABELA DE OBSERVAÇÕES DO LANÇAMENTO FISCAL.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscal0460 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  /**
   * 02 COD_OBS Código da Observação do lançamento fiscal. C 006 - O
   */
  @SPEDField(maxLength = 6)
  private String r02_COD_OBS = null;

  /**
   * 03 TXT Descrição da observação vinculada ao lançamento fiscal C - - O
   */
  @SPEDField(maxLength = 5000)
  private String r03_TXT = null;

  @Override
  public String get01_Register() {
    return "0460";
  }

  /**
   * Recupera o 02 COD_OBS Código da Observação do lançamento fiscal. C 006 - O.
   *
   * @return the 02 COD_OBS Código da Observação do lançamento fiscal
   */
  public String getR02_COD_OBS() {
    return r02_COD_OBS;
  }

  /**
   * Define o 02 COD_OBS Código da Observação do lançamento fiscal. C 006 - O.
   *
   * @param r02_COD_OBS the new 02 COD_OBS Código da Observação do lançamento fiscal
   */
  public void setR02_COD_OBS(String r02_COD_OBS) {
    this.r02_COD_OBS = r02_COD_OBS;
  }

  /**
   * Recupera o 03 TXT Descrição da observação vinculada ao lançamento fiscal C - - O.
   *
   * @return the 03 TXT Descrição da observação vinculada ao lançamento fiscal C - - O
   */
  public String getR03_TXT() {
    return r03_TXT;
  }

  /**
   * Define o 03 TXT Descrição da observação vinculada ao lançamento fiscal C - - O.
   *
   * @param r03_TXT the new 03 TXT Descrição da observação vinculada ao lançamento fiscal C - - O
   */
  public void setR03_TXT(String r03_TXT) {
    this.r03_TXT = r03_TXT;
  }

}