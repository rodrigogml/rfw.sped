package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C990: ENCERRAMENTO DO BLOCO C.<br>
 *
 * @author Rodrigo Leit�o
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalC990 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscalC990(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 QTD_LIN_C Quantidade total de linhas do Bloco C N - - O O
   */
  @SPEDField(maxLength = 255)
  private Integer r02_QTD_LIN_C = null;

  @Override
  public String get01_Register() {
    return "C990";
  }

  /**
   * Recupera o 02 QTD_LIN_C Quantidade total de linhas do Bloco C N - - O O.
   *
   * @return the 02 QTD_LIN_C Quantidade total de linhas do Bloco C N - - O O
   */
  public Integer getR02_QTD_LIN_C() {
    return r02_QTD_LIN_C;
  }

  /**
   * Define o 02 QTD_LIN_C Quantidade total de linhas do Bloco C N - - O O.
   *
   * @param r02_QTD_LIN_0 the new 02 QTD_LIN_C Quantidade total de linhas do Bloco C N - - O O
   */
  public void setR02_QTD_LIN_C(Integer r02_QTD_LIN_0) {
    this.r02_QTD_LIN_C = r02_QTD_LIN_0;
  }

}