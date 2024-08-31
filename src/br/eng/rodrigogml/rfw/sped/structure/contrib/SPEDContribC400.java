package br.eng.rodrigogml.rfw.sped.structure.contrib;

import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;

/**
 * Description: REGISTRO C400: EQUIPAMENTO ECF (C�DIGOS 02 e 2D).<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribC400 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  /**
   * C405: REDU��O Z (C�DIGO 02, 2D e 60)<br>
   * Chave: CRZ.
   */
  private final LinkedHashMap<String, SPEDContribC405> rc405 = new LinkedHashMap<String, SPEDContribC405>();

  /**
   * C�digo do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002* - S
   */
  @SPEDField(maxLength = 2, minLength = 2, required = true)
  private String r02_COD_MOD = null;

  /**
   * Modelo do equipamento C 020 - S
   */
  @SPEDField(maxLength = 20, required = true)
  private String r03_ECF_MOD = null;

  /**
   * N�mero de s�rie de fabrica��o do ECF C 020 - S
   */
  @SPEDField(maxLength = 20, required = true)
  private String r04_ECF_FAB = null;

  /**
   * N�mero do caixa atribu�do ao ECF N 003 - S
   */
  @SPEDField(maxLength = 3, required = true)
  private Integer r05_ECF_CX = null;

  @Override
  public String get01_Register() {
    return "C400";
  }

  /**
   * Recupera o c�digo do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002* - S.
   *
   * @return the c�digo do modelo do documento fiscal, conforme a Tabela 4
   */
  public String getR02_COD_MOD() {
    return r02_COD_MOD;
  }

  /**
   * Define o c�digo do modelo do documento fiscal, conforme a Tabela 4.1.1 C 002* - S.
   *
   * @param r02_COD_MOD the new c�digo do modelo do documento fiscal, conforme a Tabela 4
   */
  public void setR02_COD_MOD(String r02_COD_MOD) {
    this.r02_COD_MOD = r02_COD_MOD;
  }

  /**
   * Recupera o modelo do equipamento C 020 - S.
   *
   * @return the modelo do equipamento C 020 - S
   */
  public String getR03_ECF_MOD() {
    return r03_ECF_MOD;
  }

  /**
   * Define o modelo do equipamento C 020 - S.
   *
   * @param r03_ECF_MOD the new modelo do equipamento C 020 - S
   */
  public void setR03_ECF_MOD(String r03_ECF_MOD) {
    this.r03_ECF_MOD = r03_ECF_MOD;
  }

  /**
   * Recupera o n�mero de s�rie de fabrica��o do ECF C 020 - S.
   *
   * @return the n�mero de s�rie de fabrica��o do ECF C 020 - S
   */
  public String getR04_ECF_FAB() {
    return r04_ECF_FAB;
  }

  /**
   * Define o n�mero de s�rie de fabrica��o do ECF C 020 - S.
   *
   * @param r04_ECF_FAB the new n�mero de s�rie de fabrica��o do ECF C 020 - S
   */
  public void setR04_ECF_FAB(String r04_ECF_FAB) {
    this.r04_ECF_FAB = r04_ECF_FAB;
  }

  /**
   * Recupera o n�mero do caixa atribu�do ao ECF N 003 - S.
   *
   * @return the n�mero do caixa atribu�do ao ECF N 003 - S
   */
  public Integer getR05_ECF_CX() {
    return r05_ECF_CX;
  }

  /**
   * Define o n�mero do caixa atribu�do ao ECF N 003 - S.
   *
   * @param r05_ECF_CX the new n�mero do caixa atribu�do ao ECF N 003 - S
   */
  public void setR05_ECF_CX(Integer r05_ECF_CX) {
    this.r05_ECF_CX = r05_ECF_CX;
  }

  /**
   * Recupera o c405: REDU��O Z (C�DIGO 02, 2D e 60)<br>
   * Chave: CRZ.
   *
   * @return the c405: REDU��O Z (C�DIGO 02, 2D e 60)<br>
   *         Chave: CRZ
   */
  public LinkedHashMap<String, SPEDContribC405> getRc405() {
    return rc405;
  }

}