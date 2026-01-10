package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import br.eng.rodrigogml.rfw.kernel.exceptions.RFWException;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFiscalFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO B990: ENCERRAMENTO DO BLOCO B.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0
 */
public class SPEDFiscalB990 extends SPEDRegister {

  private static final long serialVersionUID = -6938310161356989207L;

  public SPEDFiscalB990(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 QTD_LIN_B Quantidade total de linhas do Bloco B
   */
  @SPEDField(maxLength = 255)
  private Integer r02_QTD_LIN_B_AUTO = null;

  @Override
  public String get01_Register() {
    return "B990";
  }

  public Integer getR02_QTD_LIN_B_AUTO() {
    return r02_QTD_LIN_B_AUTO;
  }

  public void setR02_QTD_LIN_B_AUTO(Integer r02_QTD_LIN_B) {
    this.r02_QTD_LIN_B_AUTO = r02_QTD_LIN_B;
  }

  @Override
  public void calculate(String uuid) throws RFWException {
    if (uuid == null || !uuid.equals(this.getLastUUID())) {
      super.calculate(uuid);
      int totalRegisters = ((SPEDFiscalFile) this.getSpedFile()).getRB001().countRegisters() + 1;
      this.r02_QTD_LIN_B_AUTO = totalRegisters;
    }
  }
}