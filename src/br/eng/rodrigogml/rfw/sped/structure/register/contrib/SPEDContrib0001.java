package br.eng.rodrigogml.rfw.sped.structure.register.contrib;

import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO 0001: ABERTURA DO BLOCO 0.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (25 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContrib0001 extends SPEDRegister {

  private static final long serialVersionUID = -4577645791345055257L;

  public SPEDContrib0001(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * REGISTRO 0100: DADOS DO CONTABILISTA
   */
  private SPEDContrib0100 r0100 = null;

  /**
   * REGISTRO 0110: REGIMES DE APURAÇÃO DA CONTRIBUIÇÃO SOCIAL E DE APROPRIAÇÃO DE CRÉDITO
   */
  private SPEDContrib0110 r0110 = null;

  /**
   * REGISTRO 0140: TABELA DE CADASTRO DE ESTABELECIMENTO<br>
   * Chave da Hash: CNPJ do estabelecimento
   */
  private final LinkedHashMap<String, SPEDContrib0140> r0140 = new LinkedHashMap<String, SPEDContrib0140>();

  /**
   * REGISTRO 0500: PLANO DE CONTAS CONTÁBEIS
   */
  private final LinkedHashMap<String, SPEDContrib0500> r0500 = new LinkedHashMap<String, SPEDContrib0500>();

  /**
   * Indicador de movimento:<br>
   * <ul>
   * <li>0 - Bloco com dados informados;
   * <li>1 – Bloco sem dados informados.
   * </ul>
   * <br>
   * N 001 - S
   */
  @SPEDField(maxLength = 1, minLength = 1, required = true)
  private String r02_IND_MOV = null;

  @Override
  public String get01_Register() {
    return "0001";
  }

  /**
   * Recupera o indicador de movimento:<br>
   * <ul>
   * <li>0 - Bloco com dados informados;
   * <li>1 – Bloco sem dados informados.
   * </ul>
   * <br>
   * N 001 - S.
   *
   * @return the indicador de movimento:<br>
   *         <ul>
   *         <li>0 - Bloco com dados informados;
   *         <li>1 – Bloco sem dados informados
   */
  public String getR02_IND_MOV() {
    return r02_IND_MOV;
  }

  /**
   * Define o indicador de movimento:<br>
   * <ul>
   * <li>0 - Bloco com dados informados;
   * <li>1 – Bloco sem dados informados.
   * </ul>
   * <br>
   * N 001 - S.
   *
   * @param r02_IND_MOV the new indicador de movimento:<br>
   *          <ul>
   *          <li>0 - Bloco com dados informados;
   *          <li>1 – Bloco sem dados informados
   */
  public void setR02_IND_MOV(String r02_IND_MOV) {
    this.r02_IND_MOV = r02_IND_MOV;
  }

  /**
   * Define o rEGISTRO 0100: DADOS DO CONTABILISTA.
   *
   * @param r0100 the new rEGISTRO 0100: DADOS DO CONTABILISTA
   */
  public void setR0100(SPEDContrib0100 r0100) {
    this.r0100 = r0100;
  }

  /**
   * Recupera o rEGISTRO 0100: DADOS DO CONTABILISTA.
   *
   * @return the rEGISTRO 0100: DADOS DO CONTABILISTA
   */
  public SPEDContrib0100 getR0100() {
    return r0100;
  }

  /**
   * Recupera o rEGISTRO 0110: REGIMES DE APURAÇÃO DA CONTRIBUIÇÃO SOCIAL E DE APROPRIAÇÃO DE CRÉDITO.
   *
   * @return the rEGISTRO 0110: REGIMES DE APURAÇÃO DA CONTRIBUIÇÃO SOCIAL E DE APROPRIAÇÃO DE CRÉDITO
   */
  public SPEDContrib0110 getR0110() {
    return r0110;
  }

  /**
   * Define o rEGISTRO 0110: REGIMES DE APURAÇÃO DA CONTRIBUIÇÃO SOCIAL E DE APROPRIAÇÃO DE CRÉDITO.
   *
   * @param r0110 the new rEGISTRO 0110: REGIMES DE APURAÇÃO DA CONTRIBUIÇÃO SOCIAL E DE APROPRIAÇÃO DE CRÉDITO
   */
  public void setR0110(SPEDContrib0110 r0110) {
    this.r0110 = r0110;
  }

  /**
   * Recupera o rEGISTRO 0140: TABELA DE CADASTRO DE ESTABELECIMENTO<br>
   * Chave da Hash: CNPJ do estabelecimento.
   *
   * @return the rEGISTRO 0140: TABELA DE CADASTRO DE ESTABELECIMENTO<br>
   *         Chave da Hash: CNPJ do estabelecimento
   */
  public LinkedHashMap<String, SPEDContrib0140> getR0140() {
    return r0140;
  }

  public LinkedHashMap<String, SPEDContrib0500> getR0500() {
    return r0500;
  }

}