package br.eng.rodrigogml.rfw.sped.structure.fiscal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO H005: TOTAIS DO INVENTÁRIO.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalH005 extends SPEDRegister {

  /**
   * REGISTRO H010: INVENTÁRIO
   */
  private final LinkedHashMap<Long, SPEDFiscalH010> rh010 = new LinkedHashMap<Long, SPEDFiscalH010>();

  /**
   * 02 DT_INV Data do inventário N 008* - O
   */
  @SPEDField(maxLength = 8, minLength = 8)
  private LocalDate r02_DT_INV = null;

  /**
   * 03 VL_INV Valor total do estoque N - 02 O
   */
  @SPEDField(maxLength = 255, decimals = 2)
  private BigDecimal r03_VL_INV = null;

  /**
   * 04 MOT_INV Informe o motivo do Inventário:<br>
   * 01 – No final no período;<br>
   * 02 – Na mudança de forma de tributação da mercadoria (ICMS);<br>
   * 03 – Na solicitação da baixa cadastral, paralisação temporária e outras situações;<br>
   * 04 – Na alteração de regime de pagamento – condição do contribuinte;<br>
   * 05 – Por determinação dos fiscos. C 002* - O<br>
   */
  @SPEDField(maxLength = 2, minLength = 2)
  private String r04_MOT_INV = null;

  @Override
  public String get01_Register() {
    return "H005";
  }

  /**
   * Recupera o 02 DT_INV Data do inventário N 008* - O.
   *
   * @return the 02 DT_INV Data do inventário N 008* - O
   */
  public LocalDate getR02_DT_INV() {
    return r02_DT_INV;
  }

  /**
   * Define o 02 DT_INV Data do inventário N 008* - O.
   *
   * @param r02_DT_INV the new 02 DT_INV Data do inventário N 008* - O
   */
  public void setR02_DT_INV(LocalDate r02_DT_INV) {
    this.r02_DT_INV = r02_DT_INV;
  }

  /**
   * Recupera o 03 VL_INV Valor total do estoque N - 02 O.
   *
   * @return the 03 VL_INV Valor total do estoque N - 02 O
   */
  public BigDecimal getR03_VL_INV() {
    return r03_VL_INV;
  }

  /**
   * Define o 03 VL_INV Valor total do estoque N - 02 O.
   *
   * @param r03_VL_INV the new 03 VL_INV Valor total do estoque N - 02 O
   */
  public void setR03_VL_INV(BigDecimal r03_VL_INV) {
    this.r03_VL_INV = r03_VL_INV;
  }

  /**
   * Recupera o 04 MOT_INV Informe o motivo do Inventário:<br>
   * 01 – No final no período;<br>
   * 02 – Na mudança de forma de tributação da mercadoria (ICMS);<br>
   * 03 – Na solicitação da baixa cadastral, paralisação temporária e outras situações;<br>
   * 04 – Na alteração de regime de pagamento – condição do contribuinte;<br>
   * 05 – Por determinação dos fiscos. C 002* - O<br>
   * .
   *
   * @return the 04 MOT_INV Informe o motivo do Inventário:<br>
   *         01 – No final no período;<br>
   *         02 – Na mudança de forma de tributação da mercadoria (ICMS);<br>
   *         03 – Na solicitação da baixa cadastral, paralisação temporária e outras situações;<br>
   *         04 – Na alteração de regime de pagamento – condição do contribuinte;<br>
   *         05 – Por determinação dos fiscos
   */
  public String getR04_MOT_INV() {
    return r04_MOT_INV;
  }

  /**
   * Define o 04 MOT_INV Informe o motivo do Inventário:<br>
   * 01 – No final no período;<br>
   * 02 – Na mudança de forma de tributação da mercadoria (ICMS);<br>
   * 03 – Na solicitação da baixa cadastral, paralisação temporária e outras situações;<br>
   * 04 – Na alteração de regime de pagamento – condição do contribuinte;<br>
   * 05 – Por determinação dos fiscos. C 002* - O<br>
   * .
   *
   * @param r04_MOT_INV the new 04 MOT_INV Informe o motivo do Inventário:<br>
   *          01 – No final no período;<br>
   *          02 – Na mudança de forma de tributação da mercadoria (ICMS);<br>
   *          03 – Na solicitação da baixa cadastral, paralisação temporária e outras situações;<br>
   *          04 – Na alteração de regime de pagamento – condição do contribuinte;<br>
   *          05 – Por determinação dos fiscos
   */
  public void setR04_MOT_INV(String r04_MOT_INV) {
    this.r04_MOT_INV = r04_MOT_INV;
  }

  /**
   * Recupera o rEGISTRO H010: INVENTÁRIO.
   *
   * @return the rEGISTRO H010: INVENTÁRIO
   */
  public LinkedHashMap<Long, SPEDFiscalH010> getRh010() {
    return rh010;
  }

}