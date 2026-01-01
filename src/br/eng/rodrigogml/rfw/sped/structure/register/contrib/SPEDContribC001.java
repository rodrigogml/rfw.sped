package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C001: ABERTURA DO BLOCO C.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribC001 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  public SPEDContribC001(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * REGISTRO C010: IDENTIFICAÇÃO DO ESTABELECIMENTO<br>
   * Chave: CNPJ do estabelecimento.
   */
  private final LinkedHashMap<String, SPEDContribC010> rc010 = new LinkedHashMap<String, SPEDContribC010>();

  /**
   * Indicador de movimento:
   * <li>0 - Bloco com dados informados;
   * <li>1 - Bloco sem dados informados<br>
   * C 001* - S
   */
  @SPEDField(maxLength = 1, minLength = 1, required = true)
  private String r02_IND_MOV = null;

  @Override
  public String get01_Register() {
    return "C001";
  }

  /**
   * Recupera o indicador de movimento:
   * <li>0 - Bloco com dados informados;
   * <li>1 - Bloco sem dados informados<br>
   * C 001* - S.
   *
   * @return the indicador de movimento:
   *         <li>0 - Bloco com dados informados;
   *         <li>1 - Bloco sem dados informados<br>
   *         C 001* - S
   */
  public String getR02_IND_MOV() {
    return r02_IND_MOV;
  }

  /**
   * Define o indicador de movimento:
   * <li>0 - Bloco com dados informados;
   * <li>1 - Bloco sem dados informados<br>
   * C 001* - S.
   *
   * @param r02_IND_MOV the new indicador de movimento:
   *          <li>0 - Bloco com dados informados;
   *          <li>1 - Bloco sem dados informados<br>
   *          C 001* - S
   */
  public void setR02_IND_MOV(String r02_IND_MOV) {
    this.r02_IND_MOV = r02_IND_MOV;
  }

  /**
   * Recupera o rEGISTRO C010: IDENTIFICAÇÃO DO ESTABELECIMENTO<br>
   * Chave: CNPJ do estabelecimento.
   *
   * @return the rEGISTRO C010: IDENTIFICAÇÃO DO ESTABELECIMENTO<br>
   *         Chave: CNPJ do estabelecimento
   */
  public LinkedHashMap<String, SPEDContribC010> getRc010() {
    return rc010;
  }

}