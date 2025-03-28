package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO F010: IDENTIFICA��O DO ESTABELECIMENTO.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribF010 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  public SPEDContribF010(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * N�mero de inscri��o do estabelecimento no CNPJ. N 014* - S
   */
  @SPEDField(maxLength = 14, minLength = 14, required = true)
  private String r02_CNPJ = null;

  @Override
  public String get01_Register() {
    return "F010";
  }

  /**
   * Recupera o n�mero de inscri��o do estabelecimento no CNPJ. N 014* - S.
   *
   * @return the n�mero de inscri��o do estabelecimento no CNPJ
   */
  public String getR02_CNPJ() {
    return r02_CNPJ;
  }

  /**
   * Define o n�mero de inscri��o do estabelecimento no CNPJ. N 014* - S.
   *
   * @param r02_CNPJ the new n�mero de inscri��o do estabelecimento no CNPJ
   */
  public void setR02_CNPJ(String r02_CNPJ) {
    this.r02_CNPJ = r02_CNPJ;
  }
}