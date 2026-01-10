package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import br.eng.rodrigogml.rfw.kernel.exceptions.RFWException;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO B001: ABERTURA DO BLOCO B.<br>
 *
 * Este registro tem por objetivo identificar a abertura do bloco B, indicando se há informações sobre documentos fiscais.
 *
 * @author Rodrigo Leitão
 * @since 10.0
 */
public class SPEDFiscalB001 extends SPEDRegister {

  private static final long serialVersionUID = 2309986752084142019L;

  public SPEDFiscalB001(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 IND_DAD Indicador de movimento:
   * <li>0 - Bloco com dados informados</li>
   * <li>1 - Bloco sem dados informados</li> C 001 - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r02_IND_DAD_AUTO = null;

  @Override
  public String get01_Register() {
    return "B001";
  }

  public String getR02_IND_DAD_AUTO() {
    return r02_IND_DAD_AUTO;
  }

  public void setR02_IND_DAD_AUTO(String r02_IND_DAD) {
    this.r02_IND_DAD_AUTO = r02_IND_DAD;
  }

  @Override
  public void calculate(String uuid) throws RFWException {
    if (uuid == null || !uuid.equals(this.getLastUUID())) {
      super.calculate(uuid);
      r02_IND_DAD_AUTO = "1";
    }
  }
}