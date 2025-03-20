package br.eng.rodrigogml.rfw.sped.structure.file;

import java.io.Serializable;
import java.util.HashSet;

import br.eng.rodrigogml.rfw.kernel.exceptions.RFWException;
import br.eng.rodrigogml.rfw.kernel.utils.RUGenerators;
import br.eng.rodrigogml.rfw.kernel.utils.RUString;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal0000;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal0001;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal0990;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal1001;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal1990;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal9001;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal9990;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal9999;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalC001;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalC990;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalD001;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalD990;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalE001;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalE990;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalG001;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalG990;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalH001;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalH990;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalK001;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalK990;

/**
 * Description: Objeto que representa um arquivo do SPEDFiscal.
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalFile implements Serializable, SPEDFile {

  private static final long serialVersionUID = -8840157009790781701L;

  /**
   * Esta lista permite o controle de quais objetos já foram sumarizados em registros "pai". Por exemplo, o registro C405 tem os filhos C420 e C410, ambos chamam o método makeC405(...) que além de criar sumarizam valores no C405. Esta lista permite que o método makeC405 crie objetos de controle para saber quais objetos já foram sumarizados evitando que o valor seja adicionado duas vezes.<br>
   * Sempre utilize o objeto no formato: [registro] + "|" + [chave de identificação livre para cada registro]<br>
   * Exemplo: "C405|454567", onde 454567 é o ID do ciVO recebido no método.
   */
  private final HashSet<String> sumControl = new HashSet<String>();

  /**
   * REGISTRO 0000: ABERTURA DO ARQUIVO DIGITAL E IDENTIFICAÇÃO DA ENTIDADE<br>
   *
   */
  private SPEDFiscal0000 r0000 = null;

  /**
   * REGISTRO 0001: ABERTURA DO BLOCO 0
   */
  private SPEDFiscal0001 r0001 = null;

  /**
   * REGISTRO 0990: ENCERRAMENTO DO BLOCO 0
   */
  private SPEDFiscal0990 r0990 = null;

  /**
   * REGISTRO C001: ABERTURA DO BLOCO C
   */
  private SPEDFiscalC001 rC001 = null;

  /**
   * REGISTRO C990: ENCERRAMENTO DO BLOCO C
   */
  private SPEDFiscalC990 rC990 = null;

  /**
   * REGISTRO D001: ABERTURA DO BLOCO D
   */
  private SPEDFiscalD001 rD001 = null;

  /**
   * REGISTRO D990: ENCERRAMENTO DO BLOCO D
   */
  private SPEDFiscalD990 rD990 = null;

  /**
   * REGISTRO E001: ABERTURA DO BLOCO E
   */
  private SPEDFiscalE001 rE001 = null;

  /**
   * REGISTRO E990: ENCERRAMENTO DO BLOCO E
   */
  private SPEDFiscalE990 rE990 = null;

  /**
   * REGISTRO G001: ABERTURA DO BLOCO G
   */
  private SPEDFiscalG001 rG001 = null;

  /**
   * REGISTRO G990: ENCERRAMENTO DO BLOCO G
   */
  private SPEDFiscalG990 rG990 = null;

  /**
   * REGISTRO H001: ABERTURA DO BLOCO H
   */
  private SPEDFiscalH001 rH001 = null;

  /**
   * REGISTRO H990: ENCERRAMENTO DO BLOCO H
   */
  private SPEDFiscalH990 rH990 = null;

  /**
   * REGISTRO K001: ABERTURA DO BLOCO K
   */
  private SPEDFiscalK001 rK001 = null;

  /**
   * REGISTRO K990: ENCERRAMENTO DO BLOCO K
   */
  private SPEDFiscalK990 rK990 = null;

  /**
   * REGISTRO 1001: ABERTURA DO BLOCO 1
   */
  private SPEDFiscal1001 r1001 = null;

  /**
   * REGISTRO 1990: ENCERRAMENTO DO BLOCO 1
   */
  private SPEDFiscal1990 r1990 = null;

  /**
   * REGISTRO 9001: ABERTURA DO BLOCO 9
   */
  private SPEDFiscal9001 r9001 = null;

  /**
   * REGISTRO 9990: ENCERRAMENTO DO BLOCO 9
   */
  private SPEDFiscal9990 r9990 = null;

  /**
   * REGISTRO 9999: ENCERRAMENTO DO ARQUIVO DIGITAL.
   */
  private SPEDFiscal9999 r9999 = null;

  /**
   * Força o recálculo de todos os campos automáticos do arquivo.
   *
   * @throws RFWException
   */
  public void calculateFields() throws RFWException {
    String uuid = RUGenerators.generateUUID();

    if (this.r0000 != null) this.r0000.calculate(uuid);

    // Bloco 0
    if (this.r0001 != null) this.r0001.calculate(uuid);
    if (this.r0990 != null) this.r0990.calculate(uuid);

    // Bloco C
    if (this.rC001 != null) this.rC001.calculate(uuid);
    if (this.rC990 != null) this.rC990.calculate(uuid);

    // Bloco D
    if (this.rD001 != null) this.rD001.calculate(uuid);
    if (this.rD990 != null) this.rD990.calculate(uuid);

    // Bloco E
    if (this.rE001 != null) this.rE001.calculate(uuid);
    if (this.rE990 != null) this.rE990.calculate(uuid);

    // Bloco G
    if (this.rG001 != null) this.rG001.calculate(uuid);
    if (this.rG990 != null) this.rG990.calculate(uuid);

    // Bloco H
    if (this.rH001 != null) this.rH001.calculate(uuid);
    if (this.rH990 != null) this.rH990.calculate(uuid);

    // Bloco K
    if (this.rK001 != null) this.rK001.calculate(uuid);
    if (this.rK990 != null) this.rK990.calculate(uuid);

    // Bloco 1
    if (this.r1001 != null) this.r1001.calculate(uuid);
    if (this.r1990 != null) this.r1990.calculate(uuid);

    // Bloco 9
    if (this.r9001 != null) this.r9001.calculate(uuid);
    if (this.r9990 != null) this.r9990.calculate(uuid);

    // Encerramento do Arquivo
    if (this.r9999 != null) this.r9999.calculate(uuid);
  }

  /**
   * Escreve o conteúdo em formato do arquivo SPED.<br>
   * Força a atualização (re-cálculo) de todos os registros antes.
   *
   * @return
   * @throws RFWException
   */
  public String writeToFile() throws RFWException {
    calculateFields();

    final StringBuilder buff = new StringBuilder();

    // Abertura do Arquivo
    this.r0000.writeFileRegister(buff);

    // Bloco 0
    this.r0001.writeFileRegister(buff);
    this.r0990.writeFileRegister(buff);

    // Bloco C
    this.rC001.writeFileRegister(buff);
    this.rC990.writeFileRegister(buff);

    // Bloco D
    this.rD001.writeFileRegister(buff);
    this.rD990.writeFileRegister(buff);

    // Bloco E
    this.rE001.writeFileRegister(buff);
    this.rE990.writeFileRegister(buff);

    // Bloco G
    this.rG001.writeFileRegister(buff);
    this.rG990.writeFileRegister(buff);

    // Bloco H
    this.rH001.writeFileRegister(buff);
    this.rH990.writeFileRegister(buff);

    // Bloco K
    this.rK001.writeFileRegister(buff);
    this.rK990.writeFileRegister(buff);

    // Bloco 1
    this.r1001.writeFileRegister(buff);
    this.r1990.writeFileRegister(buff);

    // Bloco 9
    this.r9001.writeFileRegister(buff);
    this.r9990.writeFileRegister(buff);

    // Encerramento do Arquivo
    this.r9999.writeFileRegister(buff);

    return RUString.removeAccents(buff.toString());
  }

  /**
   * Recupera o rEGISTRO 0000: ABERTURA DO ARQUIVO DIGITAL E IDENTIFICAÇÃO DA ENTIDADE<br>
   * .
   *
   * @return the rEGISTRO 0000: ABERTURA DO ARQUIVO DIGITAL E IDENTIFICAÇÃO DA ENTIDADE<br>
   */
  public SPEDFiscal0000 getR0000() {
    return r0000;
  }

  /**
   * Define o rEGISTRO 0000: ABERTURA DO ARQUIVO DIGITAL E IDENTIFICAÇÃO DA ENTIDADE<br>
   * .
   *
   * @param r0000 the new rEGISTRO 0000: ABERTURA DO ARQUIVO DIGITAL E IDENTIFICAÇÃO DA ENTIDADE<br>
   */
  public void setR0000(SPEDFiscal0000 r0000) {
    this.r0000 = r0000;
  }

  /**
   * Recupera o rEGISTRO 0001: ABERTURA DO BLOCO 0.
   *
   * @return the rEGISTRO 0001: ABERTURA DO BLOCO 0
   */
  public SPEDFiscal0001 getR0001() {
    return r0001;
  }

  /**
   * Define o rEGISTRO 0001: ABERTURA DO BLOCO 0.
   *
   * @param r0001 the new rEGISTRO 0001: ABERTURA DO BLOCO 0
   */
  public void setR0001(SPEDFiscal0001 r0001) {
    this.r0001 = r0001;
  }

  /**
   * Recupera o rEGISTRO 0990: ENCERRAMENTO DO BLOCO 0.
   *
   * @return the rEGISTRO 0990: ENCERRAMENTO DO BLOCO 0
   */
  public SPEDFiscal0990 getR0990() {
    return r0990;
  }

  /**
   * Define o rEGISTRO 0990: ENCERRAMENTO DO BLOCO 0.
   *
   * @param r0990 the new rEGISTRO 0990: ENCERRAMENTO DO BLOCO 0
   */
  public void setR0990(SPEDFiscal0990 r0990) {
    this.r0990 = r0990;
  }

  /**
   * Recupera o rEGISTRO C001: ABERTURA DO BLOCO C.
   *
   * @return the rEGISTRO C001: ABERTURA DO BLOCO C
   */
  public SPEDFiscalC001 getRC001() {
    return rC001;
  }

  /**
   * Define o rEGISTRO C001: ABERTURA DO BLOCO C.
   *
   * @param rC001 the new rEGISTRO C001: ABERTURA DO BLOCO C
   */
  public void setRC001(SPEDFiscalC001 rC001) {
    this.rC001 = rC001;
  }

  /**
   * Recupera o rEGISTRO C990: ENCERRAMENTO DO BLOCO C.
   *
   * @return the rEGISTRO C990: ENCERRAMENTO DO BLOCO C
   */
  public SPEDFiscalC990 getRC990() {
    return rC990;
  }

  /**
   * Define o rEGISTRO C990: ENCERRAMENTO DO BLOCO C.
   *
   * @param rC990 the new rEGISTRO C990: ENCERRAMENTO DO BLOCO C
   */
  public void setRC990(SPEDFiscalC990 rC990) {
    this.rC990 = rC990;
  }

  /**
   * Recupera o rEGISTRO D001: ABERTURA DO BLOCO D.
   *
   * @return the rEGISTRO D001: ABERTURA DO BLOCO D
   */
  public SPEDFiscalD001 getRD001() {
    return rD001;
  }

  /**
   * Define o rEGISTRO D001: ABERTURA DO BLOCO D.
   *
   * @param rD001 the new rEGISTRO D001: ABERTURA DO BLOCO D
   */
  public void setRD001(SPEDFiscalD001 rD001) {
    this.rD001 = rD001;
  }

  /**
   * Recupera o rEGISTRO D990: ENCERRAMENTO DO BLOCO D.
   *
   * @return the rEGISTRO D990: ENCERRAMENTO DO BLOCO D
   */
  public SPEDFiscalD990 getRD990() {
    return rD990;
  }

  /**
   * Define o rEGISTRO D990: ENCERRAMENTO DO BLOCO D.
   *
   * @param rD990 the new rEGISTRO D990: ENCERRAMENTO DO BLOCO D
   */
  public void setRD990(SPEDFiscalD990 rD990) {
    this.rD990 = rD990;
  }

  /**
   * Recupera o rEGISTRO E001: ABERTURA DO BLOCO E.
   *
   * @return the rEGISTRO E001: ABERTURA DO BLOCO E
   */
  public SPEDFiscalE001 getRE001() {
    return rE001;
  }

  /**
   * Define o rEGISTRO E001: ABERTURA DO BLOCO E.
   *
   * @param rE001 the new rEGISTRO E001: ABERTURA DO BLOCO E
   */
  public void setRE001(SPEDFiscalE001 rE001) {
    this.rE001 = rE001;
  }

  /**
   * Recupera o rEGISTRO E990: ENCERRAMENTO DO BLOCO E.
   *
   * @return the rEGISTRO E990: ENCERRAMENTO DO BLOCO E
   */
  public SPEDFiscalE990 getRE990() {
    return rE990;
  }

  /**
   * Define o rEGISTRO E990: ENCERRAMENTO DO BLOCO E.
   *
   * @param rE990 the new rEGISTRO E990: ENCERRAMENTO DO BLOCO E
   */
  public void setRE990(SPEDFiscalE990 rE990) {
    this.rE990 = rE990;
  }

  /**
   * Recupera o rEGISTRO G001: ABERTURA DO BLOCO G.
   *
   * @return the rEGISTRO G001: ABERTURA DO BLOCO G
   */
  public SPEDFiscalG001 getRG001() {
    return rG001;
  }

  /**
   * Define o rEGISTRO G001: ABERTURA DO BLOCO G.
   *
   * @param rG001 the new rEGISTRO G001: ABERTURA DO BLOCO G
   */
  public void setRG001(SPEDFiscalG001 rG001) {
    this.rG001 = rG001;
  }

  /**
   * Recupera o rEGISTRO G990: ENCERRAMENTO DO BLOCO G.
   *
   * @return the rEGISTRO G990: ENCERRAMENTO DO BLOCO G
   */
  public SPEDFiscalG990 getRG990() {
    return rG990;
  }

  /**
   * Define o rEGISTRO G990: ENCERRAMENTO DO BLOCO G.
   *
   * @param rG990 the new rEGISTRO G990: ENCERRAMENTO DO BLOCO G
   */
  public void setRG990(SPEDFiscalG990 rG990) {
    this.rG990 = rG990;
  }

  /**
   * Recupera o rEGISTRO H001: ABERTURA DO BLOCO H.
   *
   * @return the rEGISTRO H001: ABERTURA DO BLOCO H
   */
  public SPEDFiscalH001 getRH001() {
    return rH001;
  }

  /**
   * Define o rEGISTRO H001: ABERTURA DO BLOCO H.
   *
   * @param rH001 the new rEGISTRO H001: ABERTURA DO BLOCO H
   */
  public void setRH001(SPEDFiscalH001 rH001) {
    this.rH001 = rH001;
  }

  /**
   * Recupera o rEGISTRO H990: ENCERRAMENTO DO BLOCO H.
   *
   * @return the rEGISTRO H990: ENCERRAMENTO DO BLOCO H
   */
  public SPEDFiscalH990 getRH990() {
    return rH990;
  }

  /**
   * Define o rEGISTRO H990: ENCERRAMENTO DO BLOCO H.
   *
   * @param rH990 the new rEGISTRO H990: ENCERRAMENTO DO BLOCO H
   */
  public void setRH990(SPEDFiscalH990 rH990) {
    this.rH990 = rH990;
  }

  /**
   * Recupera o rEGISTRO K001: ABERTURA DO BLOCO K.
   *
   * @return the rEGISTRO K001: ABERTURA DO BLOCO K
   */
  public SPEDFiscalK001 getRK001() {
    return rK001;
  }

  /**
   * Define o rEGISTRO K001: ABERTURA DO BLOCO K.
   *
   * @param rK001 the new rEGISTRO K001: ABERTURA DO BLOCO K
   */
  public void setRK001(SPEDFiscalK001 rK001) {
    this.rK001 = rK001;
  }

  /**
   * Recupera o rEGISTRO K990: ENCERRAMENTO DO BLOCO K.
   *
   * @return the rEGISTRO K990: ENCERRAMENTO DO BLOCO K
   */
  public SPEDFiscalK990 getRK990() {
    return rK990;
  }

  /**
   * Define o rEGISTRO K990: ENCERRAMENTO DO BLOCO K.
   *
   * @param rK990 the new rEGISTRO K990: ENCERRAMENTO DO BLOCO K
   */
  public void setRK990(SPEDFiscalK990 rK990) {
    this.rK990 = rK990;
  }

  /**
   * Recupera o rEGISTRO 1001: ABERTURA DO BLOCO 1.
   *
   * @return the rEGISTRO 1001: ABERTURA DO BLOCO 1
   */
  public SPEDFiscal1001 getR1001() {
    return r1001;
  }

  /**
   * Define o rEGISTRO 1001: ABERTURA DO BLOCO 1.
   *
   * @param r1001 the new rEGISTRO 1001: ABERTURA DO BLOCO 1
   */
  public void setR1001(SPEDFiscal1001 r1001) {
    this.r1001 = r1001;
  }

  /**
   * Recupera o rEGISTRO 1990: ENCERRAMENTO DO BLOCO 1.
   *
   * @return the rEGISTRO 1990: ENCERRAMENTO DO BLOCO 1
   */
  public SPEDFiscal1990 getR1990() {
    return r1990;
  }

  /**
   * Define o rEGISTRO 1990: ENCERRAMENTO DO BLOCO 1.
   *
   * @param r1990 the new rEGISTRO 1990: ENCERRAMENTO DO BLOCO 1
   */
  public void setR1990(SPEDFiscal1990 r1990) {
    this.r1990 = r1990;
  }

  /**
   * Recupera o rEGISTRO 9001: ABERTURA DO BLOCO 9.
   *
   * @return the rEGISTRO 9001: ABERTURA DO BLOCO 9
   */
  public SPEDFiscal9001 getR9001() {
    return r9001;
  }

  /**
   * Define o rEGISTRO 9001: ABERTURA DO BLOCO 9.
   *
   * @param r9001 the new rEGISTRO 9001: ABERTURA DO BLOCO 9
   */
  public void setR9001(SPEDFiscal9001 r9001) {
    this.r9001 = r9001;
  }

  /**
   * Recupera o rEGISTRO 9990: ENCERRAMENTO DO BLOCO 9.
   *
   * @return the rEGISTRO 9990: ENCERRAMENTO DO BLOCO 9
   */
  public SPEDFiscal9990 getR9990() {
    return r9990;
  }

  /**
   * Define o rEGISTRO 9990: ENCERRAMENTO DO BLOCO 9.
   *
   * @param r9990 the new rEGISTRO 9990: ENCERRAMENTO DO BLOCO 9
   */
  public void setR9990(SPEDFiscal9990 r9990) {
    this.r9990 = r9990;
  }

  /**
   * Recupera o rEGISTRO 9999: ENCERRAMENTO DO ARQUIVO DIGITAL.
   *
   * @return the rEGISTRO 9999: ENCERRAMENTO DO ARQUIVO DIGITAL
   */
  public SPEDFiscal9999 getR9999() {
    return r9999;
  }

  /**
   * Define o rEGISTRO 9999: ENCERRAMENTO DO ARQUIVO DIGITAL.
   *
   * @param r9999 the new rEGISTRO 9999: ENCERRAMENTO DO ARQUIVO DIGITAL
   */
  public void setR9999(SPEDFiscal9999 r9999) {
    this.r9999 = r9999;
  }

  /**
   * Recupera o esta lista permite o controle de quais objetos já foram sumarizados em registros "pai". Por exemplo, o registro C405 tem os filhos C420 e C410, ambos chamam o método makeC405(..) que além de criar sumarizam valores no C405. Esta lista permite que o método makeC405 crie objetos de controle para saber quais objetos já foram sumarizados evitando que o valor seja dicionado duas
   * vezes.<br>
   * Sempre utilize o objeto no formato: [registro] + "|" + [chave de identificação livre para cada registro]<br>
   * Exemplo: "C405|454567", onde 454567 é o ID do ciVO recebido no método.
   *
   * @return the esta lista permite o controle de quais objetos já foram sumarizados em registros "pai"
   */
  public HashSet<String> getSumControl() {
    return sumControl;
  }
}