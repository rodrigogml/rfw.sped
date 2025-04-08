package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import br.eng.rodrigogml.rfw.kernel.exceptions.RFWException;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFiscalFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO E990: ENCERRAMENTO DO BLOCO E.<br>
 *
 * @author Rodrigo Leit�o
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalE990 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscalE990(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 QTD_LIN_E Quantidade total de linhas do Bloco E N - - O O
   */
  @SPEDField(maxLength = 255)
  private Integer r02_QTD_LIN_E_AUTO = null;

  @Override
  public String get01_Register() {
    return "E990";
  }

  /**
   * Recupera o 02 QTD_LIN_E Quantidade total de linhas do Bloco E N - - O O.
   *
   * @return the 02 QTD_LIN_E Quantidade total de linhas do Bloco E N - - O O
   */
  public Integer getR02_QTD_LIN_E_AUTO() {
    return r02_QTD_LIN_E_AUTO;
  }

  /**
   * Define o 02 QTD_LIN_E Quantidade total de linhas do Bloco E N - - O O.
   *
   * @param r02_QTD_LIN_0 the new 02 QTD_LIN_E Quantidade total de linhas do Bloco E N - - O O
   */
  public void setR02_QTD_LIN_E_AUTO(Integer r02_QTD_LIN_0) {
    this.r02_QTD_LIN_E_AUTO = r02_QTD_LIN_0;
  }

  @Override
  public void calculate(String uuid) throws RFWException {
    if (uuid == null || !uuid.equals(this.getLastUUID())) { // Se UUID recebido for diferente da �ltima rodada de c�lculo, devemos realizar os c�lculos.
      super.calculate(uuid); // Chama o c�lculo da classe pai para salvar o UUID e calcular os registros filhos recursivamente
      int totalRegisters = ((SPEDFiscalFile) this.getSpedFile()).getRE001().countRegisters() + 1; // Soma o registo de fechamento que n�o est� incluso
      this.r02_QTD_LIN_E_AUTO = totalRegisters;
    }
  }
}