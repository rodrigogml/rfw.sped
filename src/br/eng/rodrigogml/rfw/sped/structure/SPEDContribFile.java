package br.eng.rodrigogml.rfw.sped.structure;

import br.eng.rodrigogml.rfw.kernel.exceptions.RFWException;
import br.eng.rodrigogml.rfw.sped.structure.contrib.SPEDContrib0000;
import br.eng.rodrigogml.rfw.sped.structure.contrib.SPEDContrib0001;
import br.eng.rodrigogml.rfw.sped.structure.contrib.SPEDContrib0990;
import br.eng.rodrigogml.rfw.sped.structure.contrib.SPEDContrib1001;
import br.eng.rodrigogml.rfw.sped.structure.contrib.SPEDContrib1990;
import br.eng.rodrigogml.rfw.sped.structure.contrib.SPEDContrib9001;
import br.eng.rodrigogml.rfw.sped.structure.contrib.SPEDContrib9990;
import br.eng.rodrigogml.rfw.sped.structure.contrib.SPEDContrib9999;
import br.eng.rodrigogml.rfw.sped.structure.contrib.SPEDContribA001;
import br.eng.rodrigogml.rfw.sped.structure.contrib.SPEDContribA990;
import br.eng.rodrigogml.rfw.sped.structure.contrib.SPEDContribC001;
import br.eng.rodrigogml.rfw.sped.structure.contrib.SPEDContribC990;
import br.eng.rodrigogml.rfw.sped.structure.contrib.SPEDContribD001;
import br.eng.rodrigogml.rfw.sped.structure.contrib.SPEDContribD990;
import br.eng.rodrigogml.rfw.sped.structure.contrib.SPEDContribF001;
import br.eng.rodrigogml.rfw.sped.structure.contrib.SPEDContribF990;
import br.eng.rodrigogml.rfw.sped.structure.contrib.SPEDContribI001;
import br.eng.rodrigogml.rfw.sped.structure.contrib.SPEDContribI990;
import br.eng.rodrigogml.rfw.sped.structure.contrib.SPEDContribM001;
import br.eng.rodrigogml.rfw.sped.structure.contrib.SPEDContribM990;
import br.eng.rodrigogml.rfw.sped.structure.contrib.SPEDContribP001;
import br.eng.rodrigogml.rfw.sped.structure.contrib.SPEDContribP990;

/**
 * Description: Objeto que representa um arquivo do SPEDFiscal.
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDContribFile {

  /**
   * REGISTRO 0000: Abertura do Arquivo Digital e Identificação da Pessoa Jurídica<br>
   *
   */
  private SPEDContrib0000 r0000 = null;

  /**
   * REGISTRO 0001: ABERTURA DO BLOCO 0
   */
  private SPEDContrib0001 r0001 = null;

  /**
   * REGISTRO 0990: ENCERRAMENTO DO BLOCO 0
   */
  private SPEDContrib0990 r0990 = null;

  /**
   * REGISTRO A001: ABERTURA DO BLOCO A
   */
  private SPEDContribA001 rA001 = null;

  /**
   * REGISTRO A990: ENCERRAMENTO DO BLOCO A
   */
  private SPEDContribA990 rA990 = null;

  /**
   * REGISTRO C001: ABERTURA DO BLOCO C
   */
  private SPEDContribC001 rC001 = null;

  /**
   * REGISTRO C990: ENCERRAMENTO DO BLOCO C
   */
  private SPEDContribC990 rC990 = null;

  /**
   * REGISTRO D001: ABERTURA DO BLOCO D
   */
  private SPEDContribD001 rD001 = null;

  /**
   * REGISTRO D990: ENCERRAMENTO DO BLOCO D
   */
  private SPEDContribD990 rD990 = null;

  /**
   * REGISTRO F001: ABERTURA DO BLOCO F
   */
  private SPEDContribF001 rF001 = null;

  /**
   * REGISTRO F990: ENCERRAMENTO DO BLOCO F
   */
  private SPEDContribF990 rF990 = null;

  /**
   * REGISTRO I001: ABERTURA DO BLOCO I
   */
  private SPEDContribI001 rI001 = null;

  /**
   * REGISTRO I990: ENCERRAMENTO DO BLOCO I
   */
  private SPEDContribI990 rI990 = null;

  /**
   * REGISTRO M001: ABERTURA DO BLOCO M
   */
  private SPEDContribM001 rM001 = null;

  /**
   * REGISTRO M990: ENCERRAMENTO DO BLOCO M
   */
  private SPEDContribM990 rM990 = null;

  /**
   * REGISTRO P001: ABERTURA DO BLOCO P
   */
  private SPEDContribP001 rP001 = null;

  /**
   * REGISTRO P990: ENCERRAMENTO DO BLOCO P
   */
  private SPEDContribP990 rP990 = null;

  /**
   * REGISTRO 1001: ABERTURA DO BLOCO 1
   */
  private SPEDContrib1001 r1001 = null;

  /**
   * REGISTRO 1990: ENCERRAMENTO DO BLOCO 1
   */
  private SPEDContrib1990 r1990 = null;

  /**
   * REGISTRO 9001: ABERTURA DO BLOCO 9
   */
  private SPEDContrib9001 r9001 = null;

  /**
   * REGISTRO 9990: ENCERRAMENTO DO BLOCO 9
   */
  private SPEDContrib9990 r9990 = null;

  /**
   * REGISTRO 9999: ENCERRAMENTO DO ARQUIVO DIGITAL.
   */
  private SPEDContrib9999 r9999 = null;

  public String writeToFile() throws RFWException {
    final StringBuilder buff = new StringBuilder();

    // Abertura do Arquivo
    this.r0000.writeFileRegister(buff);

    // Bloco 0
    this.r0001.writeFileRegister(buff);
    this.r0990.writeFileRegister(buff);

    // Bloco A
    this.rA001.writeFileRegister(buff);
    this.rA990.writeFileRegister(buff);

    // Bloco C
    this.rC001.writeFileRegister(buff);
    this.rC990.writeFileRegister(buff);

    // Bloco D
    this.rD001.writeFileRegister(buff);
    this.rD990.writeFileRegister(buff);

    // Bloco F
    this.rF001.writeFileRegister(buff);
    this.rF990.writeFileRegister(buff);

    // Bloco I
    this.rI001.writeFileRegister(buff);
    this.rI990.writeFileRegister(buff);

    // Bloco M
    this.rM001.writeFileRegister(buff);
    this.rM990.writeFileRegister(buff);

    // Bloco P
    this.rP001.writeFileRegister(buff);
    this.rP990.writeFileRegister(buff);

    // Bloco 1
    this.r1001.writeFileRegister(buff);
    this.r1990.writeFileRegister(buff);

    // Bloco 9
    this.r9001.writeFileRegister(buff);
    this.r9990.writeFileRegister(buff);

    // Encerramento do Arquivo
    this.r9999.writeFileRegister(buff);

    return buff.toString();
  }

  /**
   * Recupera o rEGISTRO 0000: Abertura do Arquivo Digital e Identificação da Pessoa Jurídica<br>
   * .
   *
   * @return the rEGISTRO 0000: Abertura do Arquivo Digital e Identificação da Pessoa Jurídica<br>
   */
  public SPEDContrib0000 getR0000() {
    return r0000;
  }

  /**
   * Define o rEGISTRO 0000: Abertura do Arquivo Digital e Identificação da Pessoa Jurídica<br>
   * .
   *
   * @param r0000 the new rEGISTRO 0000: Abertura do Arquivo Digital e Identificação da Pessoa Jurídica<br>
   */
  public void setR0000(SPEDContrib0000 r0000) {
    this.r0000 = r0000;
  }

  /**
   * Recupera o rEGISTRO 0001: ABERTURA DO BLOCO 0.
   *
   * @return the rEGISTRO 0001: ABERTURA DO BLOCO 0
   */
  public SPEDContrib0001 getR0001() {
    return r0001;
  }

  /**
   * Define o rEGISTRO 0001: ABERTURA DO BLOCO 0.
   *
   * @param r0001 the new rEGISTRO 0001: ABERTURA DO BLOCO 0
   */
  public void setR0001(SPEDContrib0001 r0001) {
    this.r0001 = r0001;
  }

  /**
   * Recupera o rEGISTRO 0990: ENCERRAMENTO DO BLOCO 0.
   *
   * @return the rEGISTRO 0990: ENCERRAMENTO DO BLOCO 0
   */
  public SPEDContrib0990 getR0990() {
    return r0990;
  }

  /**
   * Define o rEGISTRO 0990: ENCERRAMENTO DO BLOCO 0.
   *
   * @param r0990 the new rEGISTRO 0990: ENCERRAMENTO DO BLOCO 0
   */
  public void setR0990(SPEDContrib0990 r0990) {
    this.r0990 = r0990;
  }

  /**
   * Define o rEGISTRO C001: ABERTURA DO BLOCO C.
   *
   * @param rC001 the new rEGISTRO C001: ABERTURA DO BLOCO C
   */
  public void setRC001(SPEDContribC001 rC001) {
    this.rC001 = rC001;
  }

  /**
   * Define o rEGISTRO C990: ENCERRAMENTO DO BLOCO C.
   *
   * @param rC990 the new rEGISTRO C990: ENCERRAMENTO DO BLOCO C
   */
  public void setRC990(SPEDContribC990 rC990) {
    this.rC990 = rC990;
  }

  /**
   * Define o rEGISTRO 9001: ABERTURA DO BLOCO 9.
   *
   * @param r9001 the new rEGISTRO 9001: ABERTURA DO BLOCO 9
   */
  public void setR9001(SPEDContrib9001 r9001) {
    this.r9001 = r9001;
  }

  /**
   * Define o rEGISTRO 9990: ENCERRAMENTO DO BLOCO 9.
   *
   * @param r9990 the new rEGISTRO 9990: ENCERRAMENTO DO BLOCO 9
   */
  public void setR9990(SPEDContrib9990 r9990) {
    this.r9990 = r9990;
  }

  /**
   * Define o rEGISTRO 9999: ENCERRAMENTO DO ARQUIVO DIGITAL.
   *
   * @param r9999 the new rEGISTRO 9999: ENCERRAMENTO DO ARQUIVO DIGITAL
   */
  public void setR9999(SPEDContrib9999 r9999) {
    this.r9999 = r9999;
  }

  /**
   * Recupera o rEGISTRO C001: ABERTURA DO BLOCO C.
   *
   * @return the rEGISTRO C001: ABERTURA DO BLOCO C
   */
  public SPEDContribC001 getRC001() {
    return rC001;
  }

  public void setrC001(SPEDContribC001 rC001) {
    this.rC001 = rC001;
  }

  public void setrC990(SPEDContribC990 rC990) {
    this.rC990 = rC990;
  }

  /**
   * Recupera o rEGISTRO 9001: ABERTURA DO BLOCO 9.
   *
   * @return the rEGISTRO 9001: ABERTURA DO BLOCO 9
   */
  public SPEDContrib9001 getR9001() {
    return r9001;
  }

  /**
   * Recupera o rEGISTRO 9990: ENCERRAMENTO DO BLOCO 9.
   *
   * @return the rEGISTRO 9990: ENCERRAMENTO DO BLOCO 9
   */
  public SPEDContrib9990 getR9990() {
    return r9990;
  }

  /**
   * Recupera o rEGISTRO 9999: ENCERRAMENTO DO ARQUIVO DIGITAL.
   *
   * @return the rEGISTRO 9999: ENCERRAMENTO DO ARQUIVO DIGITAL
   */
  public SPEDContrib9999 getR9999() {
    return r9999;
  }

  /**
   * Recupera o rEGISTRO 1001: ABERTURA DO BLOCO 1.
   *
   * @return the rEGISTRO 1001: ABERTURA DO BLOCO 1
   */
  public SPEDContrib1001 getR1001() {
    return r1001;
  }

  /**
   * Define o rEGISTRO 1001: ABERTURA DO BLOCO 1.
   *
   * @param r1001 the new rEGISTRO 1001: ABERTURA DO BLOCO 1
   */
  public void setR1001(SPEDContrib1001 r1001) {
    this.r1001 = r1001;
  }

  /**
   * Recupera o rEGISTRO 1990: ENCERRAMENTO DO BLOCO 1.
   *
   * @return the rEGISTRO 1990: ENCERRAMENTO DO BLOCO 1
   */
  public SPEDContrib1990 getR1990() {
    return r1990;
  }

  /**
   * Define o rEGISTRO 1990: ENCERRAMENTO DO BLOCO 1.
   *
   * @param r1990 the new rEGISTRO 1990: ENCERRAMENTO DO BLOCO 1
   */
  public void setR1990(SPEDContrib1990 r1990) {
    this.r1990 = r1990;
  }

  /**
   * Recupera o rEGISTRO A001: ABERTURA DO BLOCO A.
   *
   * @return the rEGISTRO A001: ABERTURA DO BLOCO A
   */
  public SPEDContribA001 getRA001() {
    return rA001;
  }

  public void setrA001(SPEDContribA001 rA001) {
    this.rA001 = rA001;
  }

  /**
   * Recupera o rEGISTRO A990: ENCERRAMENTO DO BLOCO A.
   *
   * @return the rEGISTRO A990: ENCERRAMENTO DO BLOCO A
   */
  public SPEDContribA990 getRA990() {
    return rA990;
  }

  public void setrA990(SPEDContribA990 rA990) {
    this.rA990 = rA990;
  }

  /**
   * Recupera o rEGISTRO D001: ABERTURA DO BLOCO D.
   *
   * @return the rEGISTRO D001: ABERTURA DO BLOCO D
   */
  public SPEDContribD001 getRD001() {
    return rD001;
  }

  public void setrD001(SPEDContribD001 rD001) {
    this.rD001 = rD001;
  }

  /**
   * Recupera o rEGISTRO D990: ENCERRAMENTO DO BLOCO D.
   *
   * @return the rEGISTRO D990: ENCERRAMENTO DO BLOCO D
   */
  public SPEDContribD990 getRD990() {
    return rD990;
  }

  public void setrD990(SPEDContribD990 rD990) {
    this.rD990 = rD990;
  }

  /**
   * Recupera o rEGISTRO F001: ABERTURA DO BLOCO F.
   *
   * @return the rEGISTRO F001: ABERTURA DO BLOCO F
   */
  public SPEDContribF001 getRF001() {
    return rF001;
  }

  public void setrF001(SPEDContribF001 rF001) {
    this.rF001 = rF001;
  }

  /**
   * Recupera o rEGISTRO F990: ENCERRAMENTO DO BLOCO F.
   *
   * @return the rEGISTRO F990: ENCERRAMENTO DO BLOCO F
   */
  public SPEDContribF990 getRF990() {
    return rF990;
  }

  public void setrF990(SPEDContribF990 rF990) {
    this.rF990 = rF990;
  }

  /**
   * Recupera o rEGISTRO I001: ABERTURA DO BLOCO I.
   *
   * @return the rEGISTRO I001: ABERTURA DO BLOCO I
   */
  public SPEDContribI001 getRI001() {
    return rI001;
  }

  public void setrI001(SPEDContribI001 rI001) {
    this.rI001 = rI001;
  }

  /**
   * Recupera o rEGISTRO I990: ENCERRAMENTO DO BLOCO I.
   *
   * @return the rEGISTRO I990: ENCERRAMENTO DO BLOCO I
   */
  public SPEDContribI990 getRI990() {
    return rI990;
  }

  public void setrI990(SPEDContribI990 rI990) {
    this.rI990 = rI990;
  }

  /**
   * Recupera o rEGISTRO M001: ABERTURA DO BLOCO M.
   *
   * @return the rEGISTRO M001: ABERTURA DO BLOCO M
   */
  public SPEDContribM001 getRM001() {
    return rM001;
  }

  public void setrM001(SPEDContribM001 rM001) {
    this.rM001 = rM001;
  }

  /**
   * Recupera o rEGISTRO M990: ENCERRAMENTO DO BLOCO M.
   *
   * @return the rEGISTRO M990: ENCERRAMENTO DO BLOCO M
   */
  public SPEDContribM990 getRM990() {
    return rM990;
  }

  public void setrM990(SPEDContribM990 rM990) {
    this.rM990 = rM990;
  }

  /**
   * Recupera o rEGISTRO P001: ABERTURA DO BLOCO P.
   *
   * @return the rEGISTRO P001: ABERTURA DO BLOCO P
   */
  public SPEDContribP001 getRP001() {
    return rP001;
  }

  public void setrP001(SPEDContribP001 rP001) {
    this.rP001 = rP001;
  }

  /**
   * Recupera o rEGISTRO P990: ENCERRAMENTO DO BLOCO P.
   *
   * @return the rEGISTRO P990: ENCERRAMENTO DO BLOCO P
   */
  public SPEDContribP990 getRP990() {
    return rP990;
  }

  public void setrP990(SPEDContribP990 rP990) {
    this.rP990 = rP990;
  }

  /**
   * Recupera o rEGISTRO C990: ENCERRAMENTO DO BLOCO C.
   *
   * @return the rEGISTRO C990: ENCERRAMENTO DO BLOCO C
   */
  public SPEDContribC990 getRC990() {
    return rC990;
  }
}