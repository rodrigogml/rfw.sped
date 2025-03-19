package br.eng.rodrigogml.rfw.sped;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.kernel.RFW;
import br.eng.rodrigogml.rfw.kernel.exceptions.RFWCriticalException;
import br.eng.rodrigogml.rfw.kernel.exceptions.RFWException;
import br.eng.rodrigogml.rfw.kernel.preprocess.PreProcess;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFiscalFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal0001;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal0460;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal0990;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal1990;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal9001;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal9900;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal9990;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscal9999;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalC001;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalC100;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalC190;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalC400;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalC405;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalC420;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalC800;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalC850;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalC990;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalD001;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalD990;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalE001;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalE100;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalE110;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalE116;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalE990;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalG001;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalG990;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalH990;
import br.eng.rodrigogml.rfw.sped.structure.register.fiscal.SPEDFiscalK990;

/**
 * Description: Classe para auxiliar na montagem e manipulação do arquivo do SPED Fiscal através da estrutura {@link SPEDFiscalFile}.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (22 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDFiscalBuilderOLD {

  /**
   * Construtor privado para classe exclusiva com métodos estáticos.
   */
  private SPEDFiscalBuilderOLD() {
  }

  /**
   * Este método finaliza um arquivo para ser exportado. A finalização inclui os seguintes passos:<br>
   * <li>Criar e/ou atualizar os blocos de nível hierarquico 0 do arquivo. Corrigindo os valores dos blocos de abertura (indicando se tem conteúdo ou não) e atualizando o total de registros no seu registro de fechamento.</li>
   *
   * @param sped
   */
  public static void finalizeFile(SPEDFiscalFile sped) {

  }

  public static SPEDFiscalC100 addC100(SPEDFiscalC001 rc001, boolean r02_IND_OPER, boolean r03_IND_EMIT, String r04_COD_PART, String r05_COD_MOD, String r06_COD_SIT, String r07_SER, String r08_NUM_DOC, String r09_CHV_NFE, LocalDate r10_DT_DOC, LocalDate r11_DT_E_S, BigDecimal r12_VL_DOC, String r13_IND_PGTO, BigDecimal r14_VL_DESC, BigDecimal r15_VL_ABAT_NT, BigDecimal r16_VL_MERC, String r17_IND_FRT, BigDecimal r18_VL_FRT, BigDecimal r19_VL_SEG, BigDecimal r20_VL_OUT_DA, BigDecimal r21_VL_BC_ICMS, BigDecimal r22_VL_ICMS, BigDecimal r23_VL_BC_ICMS_ST, BigDecimal r24_VL_ICMS_ST, BigDecimal r25_VL_IPI, BigDecimal r26_VL_PIS, BigDecimal r27_VL_COFINS, BigDecimal r28_VL_PIS_ST, BigDecimal r29_VL_COFINS_ST) throws RFWException {
    String rc100Key = "|";
    rc100Key += PreProcess.coalesce(r05_COD_MOD, "") + "|";
    rc100Key += PreProcess.coalesce(r04_COD_PART, "") + "|";
    rc100Key += PreProcess.coalesce(r08_NUM_DOC, "") + "|";
    rc100Key += PreProcess.coalesce(r09_CHV_NFE, "") + "|";

    SPEDFiscalC100 rc100 = rc001.getRc100().get(rc100Key);
    if (rc100 == null) {
      rc100 = new SPEDFiscalC100(rc001.getSpedFile());
      rc001.getRc100().put(rc100Key, rc100);
    }

    if (r02_IND_OPER) {
      rc100.setR02_IND_OPER("0");
    } else {
      rc100.setR02_IND_OPER("1");
    }
    if (r03_IND_EMIT) {
      rc100.setR03_IND_EMIT("0");
    } else {
      rc100.setR03_IND_EMIT("1");
    }
    rc100.setR04_COD_PART(r04_COD_PART);
    rc100.setR05_COD_MOD(r05_COD_MOD);
    rc100.setR06_COD_SIT(r06_COD_SIT);
    rc100.setR07_SER(r07_SER);
    rc100.setR08_NUM_DOC(r08_NUM_DOC);
    rc100.setR09_CHV_NFE(r09_CHV_NFE);
    rc100.setR10_DT_DOC(r10_DT_DOC);
    rc100.setR11_DT_E_S(r11_DT_E_S);
    rc100.setR12_VL_DOC(r12_VL_DOC);
    rc100.setR13_IND_PGTO(r13_IND_PGTO);
    rc100.setR14_VL_DESC(r14_VL_DESC);
    rc100.setR15_VL_ABAT_NT(r15_VL_ABAT_NT);
    rc100.setR16_VL_MERC(r16_VL_MERC);
    rc100.setR17_IND_FRT(r17_IND_FRT);
    rc100.setR18_VL_FRT(r18_VL_FRT);
    rc100.setR19_VL_SEG(r19_VL_SEG);
    rc100.setR20_VL_OUT_DA(r20_VL_OUT_DA);
    rc100.setR21_VL_BC_ICMS(r21_VL_BC_ICMS);
    rc100.setR22_VL_ICMS(r22_VL_ICMS);
    rc100.setR23_VL_BC_ICMS_ST(r23_VL_BC_ICMS_ST);
    rc100.setR24_VL_ICMS_ST(r24_VL_ICMS_ST);
    rc100.setR25_VL_IPI(r25_VL_IPI);
    rc100.setR26_VL_PIS(r26_VL_PIS);
    rc100.setR27_VL_COFINS(r27_VL_COFINS);
    rc100.setR28_VL_PIS_ST(r28_VL_PIS_ST);
    rc100.setR29_VL_COFINS_ST(r29_VL_COFINS_ST);

    return rc100;
  }

  /**
   * REGISTRO 0990: ENCERRAMENTO DO BLOCO 0<Br>
   * <Br>
   * Observações:
   * <li>Nível hierárquico - 1</li>
   * <li>Ocorrência – um por arquivo</li><Br>
   * <br>
   *
   * @param sped Arquivo do SPED.
   * @param lineCount quantidade de linhas (registros) a ser informada deve considerar também os próprios registros de abertura e encerramento do bloco. Para este cálculo, o registro 0000, mesmo não pertencendo ao bloco 0, deve ser somado.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal0990 add0990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscal0990 r0990 = sped.getR0990();
    if (r0990 == null) {
      r0990 = new SPEDFiscal0990(sped);
      sped.setR0990(r0990);

    }
    r0990.setR02_QTD_LIN_0(lineCount);
    return r0990;
  }

  /**
   * REGISTRO C001: ABERTURA DO BLOCO C<Br>
   * <Br>
   * Observações:
   * <li>Nível hierárquico - 1</li>
   * <li>Ocorrência – um por arquivo</li><Br>
   * <br>
   *
   * @param sped Arquivo do SPED.
   * @param hasContent Flag para indicar se o bloco tem ou não conteúdo.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalC001 addC001(SPEDFiscalFile sped, boolean hasContent) throws RFWException {
    SPEDFiscalC001 rc001 = sped.getRC001();
    if (rc001 == null) {
      rc001 = new SPEDFiscalC001(sped);
      sped.setRC001(rc001);

      if (hasContent) {
        rc001.setR02_IND_MOV("0");
      } else {
        rc001.setR02_IND_MOV("1");
      }
    }
    return rc001;
  }

  /**
   * REGISTRO C990: ENCERRAMENTO DO BLOCO C<Br>
   * <Br>
   * Observações: Registro obrigatório
   * <li>Nível hierárquico - 1</li>
   * <li>Ocorrência – um por arquivo</li><Br>
   *
   * @param sped Arquivo do SPED.
   * @param lineCount quantidade de linhas a ser informada deve considerar também os próprios registros de abertura e encerramento do bloco.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalC990 addC990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscalC990 rC990 = sped.getRC990();
    if (rC990 == null) {
      rC990 = new SPEDFiscalC990(sped);
      sped.setRC990(rC990);

    }
    rC990.setR02_QTD_LIN_C(lineCount);
    return rC990;
  }

  /**
   * REGISTRO D001: ABERTURA DO BLOCO D<Br>
   * <Br>
   * Observações:
   * <li>Nível hierárquico - 1</li>
   * <li>Ocorrência – um por arquivo</li><Br>
   * <br>
   *
   * @param sped Arquivo do SPED.
   * @param hasContent Flag para indicar se o bloco tem ou não conteúdo.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalD001 addD001(SPEDFiscalFile sped, boolean hasContent) throws RFWException {
    SPEDFiscalD001 rd001 = sped.getRD001();
    if (rd001 == null) {
      rd001 = new SPEDFiscalD001(sped);
      sped.setRD001(rd001);

      if (hasContent) {
        rd001.setR02_IND_MOV("0");
      } else {
        rd001.setR02_IND_MOV("1");
      }
    }
    return rd001;
  }

  /**
   * REGISTRO D990: ENCERRAMENTO DO BLOCO D<Br>
   * <Br>
   * Observações: Registro obrigatório
   * <li>Nível hierárquico - 1</li>
   * <li>Ocorrência – um por arquivo</li><Br>
   *
   * @param sped Arquivo do SPED.
   * @param lineCount quantidade de linhas a ser informada deve considerar também os próprios registros de abertura e encerramento do bloco.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalD990 addD990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscalD990 rd990 = sped.getRD990();
    if (rd990 == null) {
      rd990 = new SPEDFiscalD990(sped);
      sped.setRD990(rd990);

    }
    rd990.setR02_QTD_LIN_D(lineCount);
    return rd990;
  }

  /**
   * REGISTRO E001: ABERTURA DO BLOCO E<Br>
   * <Br>
   * Observações:
   * <li>Nível hierárquico - 1</li>
   * <li>Ocorrência – um por arquivo</li><Br>
   * <br>
   *
   * @param sped Arquivo do SPED.
   * @param hasContent Flag para indicar se o bloco tem ou não conteúdo.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalE001 addE001(SPEDFiscalFile sped, boolean hasContent) throws RFWException {
    SPEDFiscalE001 re001 = sped.getRE001();
    if (re001 == null) {
      re001 = new SPEDFiscalE001(sped);
      sped.setRE001(re001);

      if (hasContent) {
        re001.setR02_IND_MOV("0");
      } else {
        re001.setR02_IND_MOV("1");
      }
    }
    return re001;
  }

  /**
   * REGISTRO E990: ENCERRAMENTO DO BLOCO E<Br>
   * <Br>
   * Observações: Registro obrigatório
   * <li>Nível hierárquico - 1</li>
   * <li>Ocorrência – um por arquivo</li><Br>
   *
   * @param sped Arquivo do SPED.
   * @param lineCount quantidade de linhas a ser informada deve considerar também os próprios registros de abertura e encerramento do bloco.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalE990 addE990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscalE990 re990 = sped.getRE990();
    if (re990 == null) {
      re990 = new SPEDFiscalE990(sped);
      sped.setRE990(re990);

    }
    re990.setR02_QTD_LIN_E(lineCount);
    return re990;
  }

  /**
   * REGISTRO G001: ABERTURA DO BLOCO G<Br>
   * <Br>
   * Observações:
   * <li>Nível hierárquico - 1</li>
   * <li>Ocorrência – um por arquivo</li><Br>
   * <br>
   *
   * @param sped Arquivo do SPED.
   * @param hasContent Flag para indicar se o bloco tem ou não conteúdo.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalG001 addG001(SPEDFiscalFile sped, boolean hasContent) throws RFWException {
    SPEDFiscalG001 rg001 = sped.getRG001();
    if (rg001 == null) {
      rg001 = new SPEDFiscalG001(sped);
      sped.setRG001(rg001);

      if (hasContent) {
        rg001.setR02_IND_MOV("0");
      } else {
        rg001.setR02_IND_MOV("1");
      }
    }

    return rg001;
  }

  /**
   * REGISTRO G990: ENCERRAMENTO DO BLOCO G<Br>
   * <Br>
   * Observações: Registro obrigatório
   * <li>Nível hierárquico - 1</li>
   * <li>Ocorrência – um por arquivo</li><Br>
   *
   * @param sped Arquivo do SPED.
   * @param lineCount quantidade de linhas a ser informada deve considerar também os próprios registros de abertura e encerramento do bloco.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalG990 addG990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscalG990 rg990 = sped.getRG990();
    if (rg990 == null) {
      rg990 = new SPEDFiscalG990(sped);
      sped.setRG990(rg990);

    }
    rg990.setR02_QTD_LIN_G(lineCount);
    return rg990;
  }

  /**
   * REGISTRO H990: ENCERRAMENTO DO BLOCO H<Br>
   * <Br>
   * Observações: Registro obrigatório
   * <li>Nível hierárquico - 1</li>
   * <li>Ocorrência – um por arquivo</li><Br>
   *
   * @param sped Arquivo do SPED.
   * @param lineCount quantidade de linhas a ser informada deve considerar também os próprios registros de abertura e encerramento do bloco.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalH990 addH990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscalH990 rh990 = sped.getRH990();
    if (rh990 == null) {
      rh990 = new SPEDFiscalH990(sped);
      sped.setRH990(rh990);

    }
    rh990.setR02_QTD_LIN_H(lineCount);
    return rh990;
  }

  /**
   * REGISTRO K990: ENCERRAMENTO DO BLOCO K<Br>
   * <Br>
   * Observações: Registro obrigatório
   * <li>Nível hierárquico - 1</li>
   * <li>Ocorrência – um por arquivo</li><Br>
   *
   * @param sped Arquivo do SPED.
   * @param lineCount quantidade de linhas a ser informada deve considerar também os próprios registros de abertura e encerramento do bloco.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalK990 addK990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscalK990 rk990 = sped.getRK990();
    if (rk990 == null) {
      rk990 = new SPEDFiscalK990(sped);
      sped.setRK990(rk990);

    }
    rk990.setR02_QTD_LIN_K(lineCount);
    return rk990;
  }

  /**
   * REGISTRO 1990: ENCERRAMENTO DO BLOCO 1<Br>
   * <Br>
   * Observações: Registro obrigatório
   * <li>Nível hierárquico - 1</li>
   * <li>Ocorrência – um por arquivo</li><Br>
   *
   * @param sped Arquivo do SPED.
   * @param lineCount quantidade de linhas a ser informada deve considerar também os próprios registros de abertura e encerramento do bloco.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal1990 add1990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscal1990 r1990 = sped.getR1990();
    if (r1990 == null) {
      r1990 = new SPEDFiscal1990(sped);
      sped.setR1990(r1990);

    }
    r1990.setR02_QTD_LIN_1(lineCount);
    return r1990;
  }

  /**
   * REGISTRO 9001: ABERTURA DO BLOCO 9<Br>
   * <Br>
   * Observações:
   * <li>Nível hierárquico - 1</li>
   * <li>Ocorrência – um por arquivo</li><Br>
   * <br>
   *
   * @param sped Arquivo do SPED.
   * @param hasContent Flag para indicar se o bloco tem ou não conteúdo.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal9001 add9001(SPEDFiscalFile sped, boolean hasContent) throws RFWException {
    SPEDFiscal9001 r9001 = sped.getR9001();
    if (r9001 == null) {
      r9001 = new SPEDFiscal9001(sped);
      sped.setR9001(r9001);

      if (hasContent) {
        r9001.setR02_IND_MOV("0");
      } else {
        r9001.setR02_IND_MOV("1");
      }
    }
    return r9001;
  }

  /**
   * REGISTRO 9990: ENCERRAMENTO DO BLOCO 9<Br>
   * <Br>
   * Observações: Registro obrigatório
   * <li>Nível hierárquico - 1</li>
   * <li>Ocorrência – um por arquivo</li><Br>
   *
   * @param sped Arquivo do SPED.
   * @param lineCount quantidade de linhas a ser informada deve considerar também os próprios registros de abertura e encerramento do bloco.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal9990 add9990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscal9990 r9990 = sped.getR9990();
    if (r9990 == null) {
      r9990 = new SPEDFiscal9990(sped);
      sped.setR9990(r9990);

    }
    r9990.setR02_QTD_LIN_9(lineCount);
    return r9990;
  }

  /**
   * REGISTRO 9999: ENCERRAMENTO DO ARQUIVO DIGITAL<Br>
   * <Br>
   * Observações: Registro obrigatório
   * <li>Nível hierárquico - 0</li>
   * <li>Ocorrência – um por arquivo</li><Br>
   *
   * @param sped Arquivo do SPED.
   * @param lineCount quantidade de linhas a ser informada deve considerar também os próprios registros de abertura e encerramento do bloco.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal9999 add9999(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscal9999 r9999 = sped.getR9999();
    if (r9999 == null) {
      r9999 = new SPEDFiscal9999(sped);
      sped.setR9999(r9999);

    }
    r9999.setR02_QTD_LIN(lineCount);
    return r9999;
  }

  /**
   * REGISTRO E110: APURAÇÃO DO ICMS – OPERAÇÕES PRÓPRIAS<Br>
   * <br>
   * <li>Observações:</li>
   * <li>Nível hierárquico – 3 – registro obrigatório</li>
   * <li>Ocorrência – um por período</li>
   *
   * @param re100
   * @param r02_VL_TOT_DEBITOS
   * @param r03_VL_AJ_DEBITOS
   * @param r05_VL_ESTORNOS_CRED
   * @param r06_VL_TOT_CREDITOS
   * @param r07_VL_AJ_CREDITOS
   * @param r09_VL_ESTORNOS_DEB
   * @param r10_VL_SLD_CREDOR_ANT
   * @param r11_VL_SLD_APURADO
   * @param r12_VL_TOT_DED
   * @param r13_VL_ICMS_RECOLHER
   * @param r14_VL_SLD_CREDOR_TRANSPORTAR
   * @param r15_DEB_ESP
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalE110 addE110(SPEDFiscalE100 re100, BigDecimal r02_VL_TOT_DEBITOS, BigDecimal r03_VL_AJ_DEBITOS, BigDecimal r05_VL_ESTORNOS_CRED, BigDecimal r06_VL_TOT_CREDITOS, BigDecimal r07_VL_AJ_CREDITOS, BigDecimal r09_VL_ESTORNOS_DEB, BigDecimal r10_VL_SLD_CREDOR_ANT, BigDecimal r11_VL_SLD_APURADO, BigDecimal r12_VL_TOT_DED, BigDecimal r13_VL_ICMS_RECOLHER, BigDecimal r14_VL_SLD_CREDOR_TRANSPORTAR, BigDecimal r15_DEB_ESP) throws RFWException {
    SPEDFiscalE110 re110 = re100.getRe110();

    if (re110 == null) {
      re110 = new SPEDFiscalE110(re100.getSpedFile());
      re100.setRe110(re110);
    }
    re110.setR02_VL_TOT_DEBITOS(r02_VL_TOT_DEBITOS);
    re110.setR03_VL_AJ_DEBITOS(r03_VL_AJ_DEBITOS);
    re110.setR04_VL_TOT_AJ_DEBITOS(r03_VL_AJ_DEBITOS);
    re110.setR05_VL_ESTORNOS_CRED(r05_VL_ESTORNOS_CRED);
    re110.setR06_VL_TOT_CREDITOS(r06_VL_TOT_CREDITOS);
    re110.setR07_VL_AJ_CREDITOS(r07_VL_AJ_CREDITOS);
    re110.setR08_VL_TOT_AJ_CREDITOS(r07_VL_AJ_CREDITOS);
    re110.setR09_VL_ESTORNOS_DEB(r09_VL_ESTORNOS_DEB);
    re110.setR10_VL_SLD_CREDOR_ANT(r10_VL_SLD_CREDOR_ANT);
    re110.setR11_VL_SLD_APURADO(r11_VL_SLD_APURADO);
    re110.setR12_VL_TOT_DED(r12_VL_TOT_DED);
    re110.setR13_VL_ICMS_RECOLHER(r13_VL_ICMS_RECOLHER);
    re110.setR14_VL_SLD_CREDOR_TRANSPORTAR(r14_VL_SLD_CREDOR_TRANSPORTAR);
    re110.setR15_DEB_ESP(r15_DEB_ESP);

    return re110;
  }

  /**
   * REGISTRO E100: PERÍODO DA APURAÇÃO DO ICMS<Br>
   * <br>
   * <li>Observações:</li>
   * <li>Nível hierárquico – 2</li>
   * <li>Ocorrência – 1:N</li>
   * <li></li>
   *
   * @param re001 Registro E001
   * @param dt_ini
   * @param dt_fin
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalE100 addE100(SPEDFiscalE001 re001, LocalDate dt_ini, LocalDate dt_fin) throws RFWException {
    SPEDFiscalE100 re100 = re001.getRe100();
    if (re100 == null) {
      re100 = new SPEDFiscalE100(re001.getSpedFile());
      re001.setRe100(re100);
    }

    re100.setR02_DT_INI(dt_ini);
    re100.setR03_DT_FIN(dt_fin);

    return re100;
  }

  /**
   * REGISTRO 0460: TABELA DE OBSERVAÇÕES DO LANÇAMENTO FISCAL<br>
   * <br>
   * <li>Observações:</li>
   * <li>Nível hierárquico - 2</li>
   * <li>Ocorrência –vários (por arquivo)</li>
   *
   * @param r0001 Registro 0001
   * @param cod_obs
   * @param txt
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal0460 add0460(SPEDFiscal0001 r0001, String cod_obs, String txt) throws RFWException {
    SPEDFiscal0460 r0460 = r0001.getR0460().get(cod_obs);
    if (r0460 == null) {
      r0460 = new SPEDFiscal0460(r0001.getSpedFile());
      r0001.getR0460().put(cod_obs, r0460);
    }

    r0460.setR02_COD_OBS(cod_obs);
    r0460.setR03_TXT(txt);

    return r0460;
  }

  /**
   * Rotina que realiza o cálculo dos campos de somatórias com os registros escritos.
   *
   * @throws RFWException
   */
  public static void updateCalcFields(SPEDFiscalFile sped) throws RFWException {
    final LocalDate startDate = sped.getR0000().getR04_DT_INI();
    final LocalDate endDate = sped.getR0000().getR05_DT_FIN();

    /*
     * BLOCO E: APURAÇÃO DO ICMS E DO IPI
     */
    {
      SPEDFiscalE001 re001 = SPEDFiscalBuilderOLD.addE001(sped, true);
      SPEDFiscalE100 re100 = SPEDFiscalBuilderOLD.addE100(re001, startDate, endDate);
      final SPEDFiscalE110 re110 = SPEDFiscalBuilderOLD.addE110(re100, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO);

      BigDecimal totDebit = BigDecimal.ZERO;
      BigDecimal totCredit = BigDecimal.ZERO;

      { // Para calcular o total de imposto devido vamos varrer toda a declaração já feita no sped e calcular com base em vários registros.
        // =======> C420 - Vamos iterar os registros C420 para obter todos os valores de vendas tributadas dos Cupons Fiscais
        for (SPEDFiscalC400 rc400 : sped.getRC001().getRc400().values()) {
          for (SPEDFiscalC405 rc405 : rc400.getRc405().values()) {
            for (SPEDFiscalC420 rc420 : rc405.getRc420().values()) {
              if (rc420.getR02_COD_TOT_PAR().startsWith("T")) {
                // Se o totalizador começa com "T" é um totalizador de vendas tributas, o que vêm depois do "T" é a alíquota usada para o cálculo do débito do ICMS. Ex: "T0320"
                BigDecimal taxRatio = new BigDecimal(rc420.getR02_COD_TOT_PAR().substring(1)).divide(RFW.BIGHUNDRED, 2, RFW.getRoundingMode());
                totDebit = totDebit.add(taxRatio.multiply(rc420.getR03_VLR_ACUM_TOT()).divide(RFW.BIGHUNDRED, 2, RFW.getRoundingMode()));
              }
            }
          }
        }

        // =======> C850 (Somamos o C850 ao invés do C890 porque este só está presente para empresas do PERFIL_A)
        for (SPEDFiscalC800 rc800 : sped.getRC001().getRc800().values()) {
          for (SPEDFiscalC850 rc850 : rc800.getRc850().values()) {
            totDebit = totDebit.add(rc850.getR07_VL_ICMS());
          }
        }
      }
      { // Para calcular o total de imposto creditável vamos varrer toda a declaração já feita no sped
        // =======> C190
        for (SPEDFiscalC100 rc100 : sped.getRC001().getRc100().values()) {
          for (SPEDFiscalC190 rc190 : rc100.getRc190().values()) {
            totCredit = totCredit.add(rc190.getR07_VL_ICMS());
          }
        }
      }
      re110.setR02_VL_TOT_DEBITOS(totDebit);
      re110.setR06_VL_TOT_CREDITOS(totCredit);
      BigDecimal sldCredorTransp = BigDecimal.ZERO;
      {
        BigDecimal sldApurado = re110.getR02_VL_TOT_DEBITOS();
        sldApurado = sldApurado.subtract(re110.getR06_VL_TOT_CREDITOS());
        sldApurado = sldApurado.subtract(re110.getR08_VL_TOT_AJ_CREDITOS());
        if (sldApurado.signum() > 0) {
          re110.setR11_VL_SLD_APURADO(sldApurado);
        } else {
          re110.setR11_VL_SLD_APURADO(BigDecimal.ZERO);
          sldCredorTransp = sldApurado.negate();
        }
      }
      re110.setR12_VL_TOT_DED(BigDecimal.ZERO);
      re110.setR13_VL_ICMS_RECOLHER(re110.getR11_VL_SLD_APURADO().subtract(re110.getR12_VL_TOT_DED()));
      re110.setR14_VL_SLD_CREDOR_TRANSPORTAR(sldCredorTransp);
      re110.setR15_DEB_ESP(BigDecimal.ZERO);

      // Se o valor para pagamento ficou positivo, geramos a obrigação de pagamento
      if (re110.getR13_VL_ICMS_RECOLHER().signum() > 0) {
        LocalDate dueDate = endDate.withDayOfMonth(25).plusMonths(1);
        // final Calendar gc = GregorianCalendar.getInstance();
        // gc.setTime(endDate);
        // gc.set(Calendar.DAY_OF_MONTH, 25);
        // gc.add(Calendar.MONTH, 1); // Código de antes de converter para LocalDate (Guardado para caso de erro, pode ser apagado quando o novo código for testado)

        // Código Recolhimento Gare ICMS: 046-2 ICMS - Regime periódico de apuração
        SPEDFiscalBuilderOLD.recursiveE116Creator(re110, "000", re110.getR13_VL_ICMS_RECOLHER(), dueDate, "046-2", null, null, null, null, startDate);
      }

    }

    // Atualiza as contagens de linhas por bloco
    updateCloseRegistersLineCount(sped);
  }

  public static SPEDFiscalE116 recursiveE116Creator(SPEDFiscalE110 re110, String codOR, BigDecimal vlOr, LocalDate dtVcto, String codRec, String numProc, String indProc, String proc, String txtCompl, LocalDate mesRef) throws RFWException {
    SPEDFiscalE116 re116 = re110.getRe116();
    if (re116 == null) {
      re116 = new SPEDFiscalE116(re110.getSpedFile());
      re110.setRe116(re116);
    }

    re116.setR02_COD_OR(codOR);
    re116.setR03_VL_OR(vlOr);
    re116.setR04_DT_VCTO(dtVcto);
    re116.setR05_COD_REC(codRec);
    re116.setR06_NUM_PROC(numProc);
    re116.setR07_IND_PROC(indProc);
    re116.setR08_PROC(proc);
    re116.setR09_TXT_COMPL(txtCompl);
    re116.setR10_MES_REF(mesRef);

    return re116;
  }

  /**
   * Este método atualiza os atributos de quantidade de linhas dos registros de fechamento de blocos e arquivo.<br>
   * Note que ele só atualiza se o registro existir, nenhum registro novo é criado.<br>
   * <br>
   * Atualmente ele atualiza os seguintes blocos:<br>
   * <li>REGISTRO 0990: ENCERRAMENTO DO BLOCO 0</li><br>
   * <li>REGISTRO C990: ENCERRAMENTO DO BLOCO C</li><br>
   *
   * @throws RFWException
   */
  public static void updateCloseRegistersLineCount(SPEDFiscalFile sped) throws RFWException {
    int totalfile = 0;
    int block = 0;

    // Bloco 0
    if (sped.getR0001() == null) SPEDFiscalBuilder.add0001(sped);
    if (sped.getR0990() == null) SPEDFiscalBuilderOLD.add0990(sped, 0);
    totalfile += block = sped.getR0001().countRegisters() + 2; // Soma o registo de fechamento que não está incluso + Soma 1 porque o registro 0000 faz parte deste total
    sped.getR0990().setR02_QTD_LIN_0(block);

    // Bloco C
    if (sped.getRC001() == null) SPEDFiscalBuilderOLD.addC001(sped, false);
    if (sped.getRC990() == null) SPEDFiscalBuilderOLD.addC990(sped, 0);
    totalfile += block = sped.getRC001().countRegisters() + 1; // Soma o registo de fechamento que não está incluso
    sped.getRC990().setR02_QTD_LIN_C(block);

    // Bloco D
    if (sped.getRD001() == null) SPEDFiscalBuilderOLD.addD001(sped, false);
    if (sped.getRD990() == null) SPEDFiscalBuilderOLD.addD990(sped, 0);
    totalfile += block = sped.getRD001().countRegisters() + 1; // Soma o registo de fechamento que não está incluso
    sped.getRD990().setR02_QTD_LIN_D(block);

    // Bloco E
    if (sped.getRE001() == null) SPEDFiscalBuilderOLD.addE001(sped, false);
    if (sped.getRE990() == null) SPEDFiscalBuilderOLD.addE990(sped, 0);
    totalfile += block = sped.getRE001().countRegisters() + 1; // Soma o registo de fechamento que não está incluso
    sped.getRE990().setR02_QTD_LIN_E(block);

    // Bloco G
    if (sped.getRG001() == null) SPEDFiscalBuilderOLD.addG001(sped, false);
    if (sped.getRG990() == null) SPEDFiscalBuilderOLD.addG990(sped, 0);
    totalfile += block = sped.getRG001().countRegisters() + 1; // Soma o registo de fechamento que não está incluso
    sped.getRG990().setR02_QTD_LIN_G(block);

    // Bloco H
    if (sped.getRH001() == null) SPEDFiscalBuilder.addH001(sped);
    if (sped.getRH990() == null) SPEDFiscalBuilderOLD.addH990(sped, 0);
    totalfile += block = sped.getRH001().countRegisters() + 1; // Soma o registo de fechamento que não está incluso
    sped.getRH990().setR02_QTD_LIN_H(block);

    // Bloco K
    if (sped.getRK001() == null) SPEDFiscalBuilderOLD.addK001(sped, false);
    if (sped.getRK990() == null) SPEDFiscalBuilderOLD.addK990(sped, 0);
    totalfile += block = sped.getRK001().countRegisters() + 1; // Soma o registo de fechamento que não está incluso
    sped.getRK990().setR02_QTD_LIN_K(block);

    // Bloco 1
    if (sped.getR1001() == null) SPEDFiscalBuilder.add1001(sped);
    if (sped.getR1990() == null) SPEDFiscalBuilderOLD.add1990(sped, 0);
    totalfile += block = sped.getR1001().countRegisters() + 1; // Soma o registo de fechamento que não está incluso
    sped.getR1990().setR02_QTD_LIN_1(block);

    // ENCERRAMENTO DO ARQUIVO - Cria o registro para que seja contabilizado no bloco 9, mas só o atualiza no final, depois que o bloco 9 for escrito.
    if (sped.getR9999() == null) SPEDFiscalBuilderOLD.add9999(sped, 0);

    // Bloco 9
    if (sped.getR9990() == null) SPEDFiscalBuilderOLD.add9990(sped, 0); // Cria o fechamento antes para que seja contabilizado no método abaixo
    // SPEDFiscalBuilder.add9001(sped, true); // Cria o bloco 9 sobre todos os registros criados
    SPEDFiscalBuilderOLD.add9001(sped); // Cria o bloco 9 sobre todos os registros criados

    totalfile += block = sped.getR9001().countRegisters() + 2; // Soma o registo de fechamento do bloco "9990" que não está incluso. E soma o "9999" segundo o manual: "... Para este cálculo, o registro 9999, apesar de não pertencer ao Bloco 9, também deve ser contabilizado nesta soma."
    sped.getR9990().setR02_QTD_LIN_9(block);

    // ENCERRAMENTO DO ARQUIVO - atualização do conteúdo
    sped.getR9999().setR02_QTD_LIN(totalfile);
  }

  /**
   * Cria um registro automático, que conta todos os registros do {@link SPEDFiscalFile} automaticamente e cria os filhos 9900.
   *
   * @param sped
   * @return
   * @throws RFWException
   */
  @SuppressWarnings({ "rawtypes", "unchecked" })
  public static SPEDFiscal9001 add9001(SPEDFiscalFile sped) throws RFWException {
    /*
     * ATENÇÃO: Este método sempre cria um novo registro por se tratar da contagem dos outros registros. Toda vez que ele for chamado para ser criado, todo o arquivo é recontabilizado.
     */
    SPEDFiscal9001 r9001 = new SPEDFiscal9001(sped);
    r9001.setR02_IND_MOV("0");

    // Já nos incluímos no arquivo "sped" para que o próprio 9001 já seja contabilizado
    sped.setR9001(r9001);

    // Itera os registros de "sped"
    final Field[] fields = sped.getClass().getDeclaredFields();
    Arrays.sort(fields, SPEDRegister.fieldComparator);

    // Iteramos os métodos encontrados, e se estiverem no padrão "r####" contabilizaos ele, e seus filhos se for o caso
    for (int i = 0; i < fields.length; i++) {
      Field f = fields[i];
      if (f.getName().matches("r[A-Za-z0-9]{4}")) { // Atributos de subatributos
        Object value = null;
        try {
          Method mGet = sped.getClass().getMethod("getR" + f.getName().substring(1));
          value = mGet.invoke(sped);
        } catch (Exception e) {
          throw new RFWCriticalException("BISModules_000263", new String[] { f.getName() }, e);
        }
        if (value != null) {
          SPEDFiscal9900 regCounter = r9001.getR9900().get(f.getName().substring(1).toUpperCase());
          if (regCounter == null) {
            regCounter = addChild9900(r9001, f.getName().substring(1).toUpperCase(), 0);
            r9001.getR9900().put(f.getName().substring(1).toUpperCase(), regCounter);
          }
          if (value instanceof LinkedHashMap) {
            for (Object spedReg : ((LinkedHashMap<?, ?>) value).values()) {
              regCounter.setR03_QTD_REG_BLC(regCounter.getR03_QTD_REG_BLC() + 1);
              recursive9900Creater(sped, r9001, ((SPEDRegister) spedReg));
            }
          } else if (value instanceof ArrayList) {
            for (Object spedReg : (ArrayList<?>) value) {
              regCounter.setR03_QTD_REG_BLC(regCounter.getR03_QTD_REG_BLC() + 1);
              recursive9900Creater(sped, r9001, ((SPEDRegister) spedReg));
            }
          } else if (value instanceof SPEDRegister) {
            regCounter.setR03_QTD_REG_BLC(regCounter.getR03_QTD_REG_BLC() + 1);
            recursive9900Creater(sped, r9001, ((SPEDRegister) value));
          }
        }
      }
    }

    // Remove todos os contadores registros que foram criados mas terminaram com contagem 0 - isso ocorre nos atributos com coleções vazias
    final ArrayList mirrorList = new ArrayList(r9001.getR9900().values());
    for (int i = 0; i < mirrorList.size(); i++) {
      final SPEDFiscal9900 treg = (SPEDFiscal9900) mirrorList.get(i);
      if (treg.getR03_QTD_REG_BLC() == 0) {
        r9001.getR9900().remove(treg.getR02_REG_BLC());
      }
    }

    // Depois de todos contabilizados atualizamos a quantidade do próprio registro 9900, dpeois que os zerados foram removidos
    r9001.getR9900().get("9900").setR03_QTD_REG_BLC(r9001.getR9900().size());

    return r9001;
  }

  public static SPEDFiscal9900 addChild9900(SPEDFiscal9001 r9001, String block, Integer count) throws RFWException {
    SPEDFiscal9900 r9900 = r9001.getR9900().get(block);
    if (r9900 == null) {
      r9900 = new SPEDFiscal9900(r9001.getSpedFile());
      r9001.getR9900().put(block, r9900);
    }
    r9900.setR02_REG_BLC(block);
    r9900.setR03_QTD_REG_BLC(count);

    return r9900;
  }

  public static void recursive9900Creater(SPEDFiscalFile sped, SPEDFiscal9001 r9001, SPEDRegister reg) throws RFWException {
    // Itera os registros de "sped"
    final Field[] fields = reg.getClass().getDeclaredFields();
    Arrays.sort(fields, SPEDRegister.fieldComparator);

    // Iteramos os métodos encontrados, e se estiverem no padrão "r####" contabilizaos ele, e seus filhos se for o caso
    for (int i = 0; i < fields.length; i++) {
      Field f = fields[i];
      if (f.getName().matches("r[A-Za-z0-9]{4}")) { // Atributos de subatributos
        Object value = null;
        try {
          Method mGet = reg.getClass().getMethod("getR" + f.getName().substring(1));
          value = mGet.invoke(reg);
        } catch (Exception e) {
          throw new RFWCriticalException("BISModules_000263", new String[] { f.getName() }, e);
        }
        if (value != null) {
          SPEDFiscal9900 regCounter = r9001.getR9900().get(f.getName().substring(1).toUpperCase());
          if (regCounter == null) {
            regCounter = addChild9900(r9001, f.getName().substring(1).toUpperCase(), 0);
            r9001.getR9900().put(f.getName().substring(1).toUpperCase(), regCounter);
          }
          if (value instanceof LinkedHashMap) {
            for (Object spedReg : ((LinkedHashMap<?, ?>) value).values()) {
              regCounter.setR03_QTD_REG_BLC(regCounter.getR03_QTD_REG_BLC() + 1);
              recursive9900Creater(sped, r9001, ((SPEDRegister) spedReg));
            }
          } else if (value instanceof ArrayList) {
            for (Object spedReg : (ArrayList<?>) value) {
              regCounter.setR03_QTD_REG_BLC(regCounter.getR03_QTD_REG_BLC() + 1);
              recursive9900Creater(sped, r9001, ((SPEDRegister) spedReg));
            }
          } else if (value instanceof SPEDRegister) {
            regCounter.setR03_QTD_REG_BLC(regCounter.getR03_QTD_REG_BLC() + 1);
            recursive9900Creater(sped, r9001, ((SPEDRegister) value));
          }
        }
      }
    }
  }
}
