package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import br.eng.rodrigogml.rfw.kernel.exceptions.RFWException;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFiscalFile;
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

  @Override
  public void calculate(String uuid) throws RFWException {
    if (uuid == null || !uuid.equals(this.getLastUUID())) { // Se UUID recebido for diferente da última rodada de cálculo, devemos realizar os cálculos.
      super.calculate(uuid); // Chama o cálculo da classe pai para salvar o UUID e calcular os registros filhos recursivamente
      int totalRegisters = 1; // Soma o registo de fechamento que não está incluso
      if (((SPEDFiscalFile) this.getSpedFile()).getR0990() != null) totalRegisters += ((SPEDFiscalFile) this.getSpedFile()).getR0990().getR02_QTD_LIN_0_AUTO();
      if (((SPEDFiscalFile) this.getSpedFile()).getRC990() != null) totalRegisters += ((SPEDFiscalFile) this.getSpedFile()).getRC990().getR02_QTD_LIN_C_AUTO();
      if (((SPEDFiscalFile) this.getSpedFile()).getRD990() != null) totalRegisters += ((SPEDFiscalFile) this.getSpedFile()).getRD990().getR02_QTD_LIN_D_AUTO();
      if (((SPEDFiscalFile) this.getSpedFile()).getRE990() != null) totalRegisters += ((SPEDFiscalFile) this.getSpedFile()).getRE990().getR02_QTD_LIN_E_AUTO();
      if (((SPEDFiscalFile) this.getSpedFile()).getRG990() != null) totalRegisters += ((SPEDFiscalFile) this.getSpedFile()).getRG990().getR02_QTD_LIN_G_AUTO();
      if (((SPEDFiscalFile) this.getSpedFile()).getRH990() != null) totalRegisters += ((SPEDFiscalFile) this.getSpedFile()).getRH990().getR02_QTD_LIN_H_AUTO();
      if (((SPEDFiscalFile) this.getSpedFile()).getRK990() != null) totalRegisters += ((SPEDFiscalFile) this.getSpedFile()).getRK990().getR02_QTD_LIN_K_AUTO();
      if (((SPEDFiscalFile) this.getSpedFile()).getR1990() != null) totalRegisters += ((SPEDFiscalFile) this.getSpedFile()).getR1990().getR02_QTD_LIN_1_AUTO();
      if (((SPEDFiscalFile) this.getSpedFile()).getR9990() != null) totalRegisters += ((SPEDFiscalFile) this.getSpedFile()).getR9990().getR02_QTD_LIN_9_AUTO();
      this.r02_QTD_LIN = totalRegisters;
    }
  }
}