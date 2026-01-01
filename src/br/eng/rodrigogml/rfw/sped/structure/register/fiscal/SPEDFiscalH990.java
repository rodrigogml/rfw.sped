package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import br.eng.rodrigogml.rfw.kernel.exceptions.RFWException;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFiscalFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO H990: ENCERRAMENTO DO BLOCO H.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalH990 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscalH990(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 QTD_LIN_H Quantidade total de linhas do Bloco H N - - O O
   */
  @SPEDField(maxLength = 255)
  private Integer r02_QTD_LIN_H_AUTO = null;

  @Override
  public String get01_Register() {
    return "H990";
  }

  /**
   * Recupera o 02 QTD_LIN_H Quantidade total de linhas do Bloco H N - - O O.
   *
   * @return the 02 QTD_LIN_H Quantidade total de linhas do Bloco H N - - O O
   */
  public Integer getR02_QTD_LIN_H_AUTO() {
    return r02_QTD_LIN_H_AUTO;
  }

  /**
   * Define o 02 QTD_LIN_H Quantidade total de linhas do Bloco H N - - O O.
   *
   * @param r02_QTD_LIN_0 the new 02 QTD_LIN_H Quantidade total de linhas do Bloco H N - - O O
   */
  public void setR02_QTD_LIN_H_AUTO(Integer r02_QTD_LIN_0) {
    this.r02_QTD_LIN_H_AUTO = r02_QTD_LIN_0;
  }

  @Override
  public void calculate(String uuid) throws RFWException {
    if (uuid == null || !uuid.equals(this.getLastUUID())) { // Se UUID recebido for diferente da última rodada de cálculo, devemos realizar os cálculos.
      super.calculate(uuid); // Chama o cálculo da classe pai para salvar o UUID e calcular os registros filhos recursivamente
      int totalRegisters = ((SPEDFiscalFile) this.getSpedFile()).getRH001().countRegisters() + 1; // Soma o registo de fechamento que não está incluso
      this.r02_QTD_LIN_H_AUTO = totalRegisters;
    }
  }
}