package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO 9999: ENCERRAMENTO DO ARQUIVO DIGITAL..<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscal9999 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscal9999(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 QTD_LIN Quantidade total de linhas do arquivo digital. N - - O O
   */
  @SPEDField(maxLength = 255)
  private Integer r02_QTD_LIN = null;

  @Override
  public String get01_Register() {
    return "9999";
  }

  /**
   * Recupera o 02 QTD_LIN Quantidade total de linhas do arquivo digital. N - - O O.
   *
   * @return the 02 QTD_LIN Quantidade total de linhas do arquivo digital
   */
  public Integer getR02_QTD_LIN() {
    return r02_QTD_LIN;
  }

  /**
   * Define o 02 QTD_LIN Quantidade total de linhas do arquivo digital. N - - O O.
   *
   * @param r02_QTD_LIN_0 the new 02 QTD_LIN Quantidade total de linhas do arquivo digital
   */
  public void setR02_QTD_LIN(Integer r02_QTD_LIN_0) {
    this.r02_QTD_LIN = r02_QTD_LIN_0;
  }

}