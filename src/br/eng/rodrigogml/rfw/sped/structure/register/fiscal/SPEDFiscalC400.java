package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C400: EQUIPAMENTO ECF (CÓDIGO 02, 2D e 60).<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalC400 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscalC400(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * C405: REDUÇÃO Z (CÓDIGO 02, 2D e 60)<br>
   * Chave: CRZ.
   */
  private final LinkedHashMap<String, SPEDFiscalC405> rc405 = new LinkedHashMap<String, SPEDFiscalC405>();

  /**
   * 02 COD_MOD Código do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002* - O
   */
  @SPEDField(maxLength = 2, minLength = 2)
  private String r02_COD_MOD = null;

  /**
   * 03 ECF_MOD Modelo do equipamento C 020 - O
   */
  @SPEDField(maxLength = 20)
  private String r03_ECF_MOD = null;

  /**
   * 04 ECF_FAB Número de série de fabricação do ECF C 021 - O
   */
  @SPEDField(maxLength = 21)
  private String r04_ECF_FAB = null;

  /**
   * 05 ECF_CX Número do caixa atribuído ao ECF N 003 - O
   */
  @SPEDField(maxLength = 3)
  private Integer r05_ECF_CX = null;

  @Override
  public String get01_Register() {
    return "C400";
  }

  /**
   * Recupera o 02 COD_MOD Código do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002* - O.
   *
   * @return the 02 COD_MOD Código do modelo do documento fiscal, conforme a Tabela 4
   */
  public String getR02_COD_MOD() {
    return r02_COD_MOD;
  }

  /**
   * Define o 02 COD_MOD Código do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002* - O.
   *
   * @param r02_COD_MOD the new 02 COD_MOD Código do modelo do documento fiscal, conforme a Tabela 4
   */
  public void setR02_COD_MOD(String r02_COD_MOD) {
    this.r02_COD_MOD = r02_COD_MOD;
  }

  /**
   * Recupera o 03 ECF_MOD Modelo do equipamento C 020 - O.
   *
   * @return the 03 ECF_MOD Modelo do equipamento C 020 - O
   */
  public String getR03_ECF_MOD() {
    return r03_ECF_MOD;
  }

  /**
   * Define o 03 ECF_MOD Modelo do equipamento C 020 - O.
   *
   * @param r03_ECF_MOD the new 03 ECF_MOD Modelo do equipamento C 020 - O
   */
  public void setR03_ECF_MOD(String r03_ECF_MOD) {
    this.r03_ECF_MOD = r03_ECF_MOD;
  }

  /**
   * Recupera o 04 ECF_FAB Número de série de fabricação do ECF C 021 - O.
   *
   * @return the 04 ECF_FAB Número de série de fabricação do ECF C 021 - O
   */
  public String getR04_ECF_FAB() {
    return r04_ECF_FAB;
  }

  /**
   * Define o 04 ECF_FAB Número de série de fabricação do ECF C 021 - O.
   *
   * @param r04_ECF_FAB the new 04 ECF_FAB Número de série de fabricação do ECF C 021 - O
   */
  public void setR04_ECF_FAB(String r04_ECF_FAB) {
    this.r04_ECF_FAB = r04_ECF_FAB;
  }

  /**
   * Recupera o 05 ECF_CX Número do caixa atribuído ao ECF N 003 - O.
   *
   * @return the 05 ECF_CX Número do caixa atribuído ao ECF N 003 - O
   */
  public Integer getR05_ECF_CX() {
    return r05_ECF_CX;
  }

  /**
   * Define o 05 ECF_CX Número do caixa atribuído ao ECF N 003 - O.
   *
   * @param r05_ECF_CX the new 05 ECF_CX Número do caixa atribuído ao ECF N 003 - O
   */
  public void setR05_ECF_CX(Integer r05_ECF_CX) {
    this.r05_ECF_CX = r05_ECF_CX;
  }

  /**
   * Recupera o c405: REDUÇÃO Z (CÓDIGO 02, 2D e 60)<br>
   * Chave: CRZ.
   *
   * @return the c405: REDUÇÃO Z (CÓDIGO 02, 2D e 60)<br>
   *         Chave: CRZ
   */
  public LinkedHashMap<String, SPEDFiscalC405> getRc405() {
    return rc405;
  }
}