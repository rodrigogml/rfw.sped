package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO K010: INDICADOR DO TIPO DE LEIAUTE ADOTADO NA INFORMAÇÃO DO BLOCO K.<br>
 *
 * Este registro indica o tipo de leiaute que o contribuinte adotou na informação do bloco K.
 *
 * Observações: obrigatoriedade a partir de 2023.
 *
 * @author Rodrigo Leitão
 * @since 10.0
 */
public class SPEDFiscalK010 extends SPEDRegister {

  private static final long serialVersionUID = 4422927272082549003L;

  public SPEDFiscalK010(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 IND_TP_LEIAUTE Indicador de tipo de leiaute adotado:
   * <li>0 – Leiaute simplificado</li>
   * <li>1 - Leiaute completo</li>
   * <li>2 – Leiaute restrito aos saldos de estoque</li> C 001 - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r02_IND_TP_LEIAUTE = null;

  @Override
  public String get01_Register() {
    return "K010";
  }

  /**
   * # 02 IND_TP_LEIAUTE Indicador de tipo de leiaute adotado:
   * <li>0 – Leiaute simplificado</li>
   * <li>1 - Leiaute completo</li>
   * <li>2 – Leiaute restrito aos saldos de estoque</li> C 001 - O.
   *
   * @return the 02 IND_TP_LEIAUTE Indicador de tipo de leiaute adotado:
   *         <li>0 – Leiaute simplificado</li>
   *         <li>1 - Leiaute completo</li>
   *         <li>2 – Leiaute restrito aos saldos de estoque</li> C 001 - O
   */
  public String getR02_IND_TP_LEIAUTE() {
    return r02_IND_TP_LEIAUTE;
  }

  /**
   * # 02 IND_TP_LEIAUTE Indicador de tipo de leiaute adotado:
   * <li>0 – Leiaute simplificado</li>
   * <li>1 - Leiaute completo</li>
   * <li>2 – Leiaute restrito aos saldos de estoque</li> C 001 - O.
   *
   * @param r02_IND_TP_LEIAUTE the new 02 IND_TP_LEIAUTE Indicador de tipo de leiaute adotado:
   *          <li>0 – Leiaute simplificado</li>
   *          <li>1 - Leiaute completo</li>
   *          <li>2 – Leiaute restrito aos saldos de estoque</li> C 001 - O
   */
  public void setR02_IND_TP_LEIAUTE(String r02_IND_TP_LEIAUTE) {
    this.r02_IND_TP_LEIAUTE = r02_IND_TP_LEIAUTE;
  }
}
