package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.time.LocalDate;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C113: DOCUMENTO FISCAL REFERENCIADO.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalC113 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  /**
   * 02 IND_OPER Indicador do tipo de operação: 0- Entrada/aquisição; 1- Saída/prestação C 001* - O O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r02_IND_OPER = null;

  /**
   * 03 IND_EMIT Indicador do emitente do título: 0- Emissão própria; 1- Terceiros C 001* - O O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r03_IND_EMIT = null;

  /**
   * 04 COD_PART Código do participante emitente (campo 02 do Registro 0150) do documento referenciado. C 060 - O O
   */
  @SPEDField(maxLength = 60)
  private String r04_COD_PART = null;

  /**
   * 05 COD_MOD Código do documento fiscal, conforme a Tabela 4.1.1 C 002* - O O
   */
  @SPEDField(maxLength = 2, minLength = 2)
  private String r05_COD_MOD = null;

  /**
   * 06 SER Série do documento fiscal C 004 - OC OC
   */
  @SPEDField(maxLength = 4, required = false)
  private String r06_SER = null;

  /**
   * 07 SUB Subsérie do documento fiscal N 003 - OC OC
   */
  @SPEDField(maxLength = 3, required = false)
  private String r07_SUB = null;

  /**
   * 08 NUM_DOC Número do documento fiscal N 009 - O O
   */
  @SPEDField(maxLength = 9)
  private String r08_NUM_DOC = null;

  /**
   * 09 DT_DOC Data da emissão do documento fiscal. N 008* - O O
   */
  @SPEDField(maxLength = 8, minLength = 8)
  private LocalDate r09_DT_DOC = null;

  @Override
  public String get01_Register() {
    return "C113";
  }

  /**
   * Recupera o 02 IND_OPER Indicador do tipo de operação: 0- Entrada/aquisição; 1- Saída/prestação C 001* - O O.
   *
   * @return the 02 IND_OPER Indicador do tipo de operação: 0- Entrada/aquisição; 1- Saída/prestação C 001* - O O
   */
  public String getR02_IND_OPER() {
    return r02_IND_OPER;
  }

  /**
   * Define o 02 IND_OPER Indicador do tipo de operação: 0- Entrada/aquisição; 1- Saída/prestação C 001* - O O.
   *
   * @param r02_IND_OPER the new 02 IND_OPER Indicador do tipo de operação: 0- Entrada/aquisição; 1- Saída/prestação C 001* - O O
   */
  public void setR02_IND_OPER(String r02_IND_OPER) {
    this.r02_IND_OPER = r02_IND_OPER;
  }

  /**
   * Recupera o 03 IND_EMIT Indicador do emitente do título: 0- Emissão própria; 1- Terceiros C 001* - O O.
   *
   * @return the 03 IND_EMIT Indicador do emitente do título: 0- Emissão própria; 1- Terceiros C 001* - O O
   */
  public String getR03_IND_EMIT() {
    return r03_IND_EMIT;
  }

  /**
   * Define o 03 IND_EMIT Indicador do emitente do título: 0- Emissão própria; 1- Terceiros C 001* - O O.
   *
   * @param r03_IND_EMIT the new 03 IND_EMIT Indicador do emitente do título: 0- Emissão própria; 1- Terceiros C 001* - O O
   */
  public void setR03_IND_EMIT(String r03_IND_EMIT) {
    this.r03_IND_EMIT = r03_IND_EMIT;
  }

  /**
   * Recupera o 04 COD_PART Código do participante emitente (campo 02 do Registro 0150) do documento referenciado. C 060 - O O.
   *
   * @return the 04 COD_PART Código do participante emitente (campo 02 do Registro 0150) do documento referenciado
   */
  public String getR04_COD_PART() {
    return r04_COD_PART;
  }

  /**
   * Define o 04 COD_PART Código do participante emitente (campo 02 do Registro 0150) do documento referenciado. C 060 - O O.
   *
   * @param r04_COD_PART the new 04 COD_PART Código do participante emitente (campo 02 do Registro 0150) do documento referenciado
   */
  public void setR04_COD_PART(String r04_COD_PART) {
    this.r04_COD_PART = r04_COD_PART;
  }

  /**
   * Recupera o 05 COD_MOD Código do documento fiscal, conforme a Tabela 4.1.1 C 002* - O O.
   *
   * @return the 05 COD_MOD Código do documento fiscal, conforme a Tabela 4
   */
  public String getR05_COD_MOD() {
    return r05_COD_MOD;
  }

  /**
   * Define o 05 COD_MOD Código do documento fiscal, conforme a Tabela 4.1.1 C 002* - O O.
   *
   * @param r05_COD_MOD the new 05 COD_MOD Código do documento fiscal, conforme a Tabela 4
   */
  public void setR05_COD_MOD(String r05_COD_MOD) {
    this.r05_COD_MOD = r05_COD_MOD;
  }

  /**
   * Recupera o 06 SER Série do documento fiscal C 004 - OC OC.
   *
   * @return the 06 SER Série do documento fiscal C 004 - OC OC
   */
  public String getR06_SER() {
    return r06_SER;
  }

  /**
   * Define o 06 SER Série do documento fiscal C 004 - OC OC.
   *
   * @param r06_SER the new 06 SER Série do documento fiscal C 004 - OC OC
   */
  public void setR06_SER(String r06_SER) {
    this.r06_SER = r06_SER;
  }

  /**
   * Recupera o 07 SUB Subsérie do documento fiscal N 003 - OC OC.
   *
   * @return the 07 SUB Subsérie do documento fiscal N 003 - OC OC
   */
  public String getR07_SUB() {
    return r07_SUB;
  }

  /**
   * Define o 07 SUB Subsérie do documento fiscal N 003 - OC OC.
   *
   * @param r07_SUB the new 07 SUB Subsérie do documento fiscal N 003 - OC OC
   */
  public void setR07_SUB(String r07_SUB) {
    this.r07_SUB = r07_SUB;
  }

  /**
   * Recupera o 08 NUM_DOC Número do documento fiscal N 009 - O O.
   *
   * @return the 08 NUM_DOC Número do documento fiscal N 009 - O O
   */
  public String getR08_NUM_DOC() {
    return r08_NUM_DOC;
  }

  /**
   * Define o 08 NUM_DOC Número do documento fiscal N 009 - O O.
   *
   * @param r08_NUM_DOC the new 08 NUM_DOC Número do documento fiscal N 009 - O O
   */
  public void setR08_NUM_DOC(String r08_NUM_DOC) {
    this.r08_NUM_DOC = r08_NUM_DOC;
  }

  /**
   * Recupera o 09 DT_DOC Data da emissão do documento fiscal. N 008* - O O.
   *
   * @return the 09 DT_DOC Data da emissão do documento fiscal
   */
  public LocalDate getR09_DT_DOC() {
    return r09_DT_DOC;
  }

  /**
   * Define o 09 DT_DOC Data da emissão do documento fiscal. N 008* - O O.
   *
   * @param r09_DT_DOC the new 09 DT_DOC Data da emissão do documento fiscal
   */
  public void setR09_DT_DOC(LocalDate r09_DT_DOC) {
    this.r09_DT_DOC = r09_DT_DOC;
  }

}