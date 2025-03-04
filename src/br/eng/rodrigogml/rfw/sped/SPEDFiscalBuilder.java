package br.eng.rodrigogml.rfw.sped;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.eng.rodrigogml.rfw.kernel.exceptions.RFWException;
import br.eng.rodrigogml.rfw.kernel.preprocess.PreProcess;
import br.eng.rodrigogml.rfw.sped.structure.SPEDFiscalFile;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscal0000;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscal0001;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscal0005;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscal0100;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscal0460;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscal0990;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscal1001;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscal1010;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscal1990;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscal9001;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscal9990;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscal9999;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalC001;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalC100;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalC990;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalD001;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalD990;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalE001;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalE100;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalE110;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalE990;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalG001;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalG990;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalH001;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalH990;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalK001;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalK990;

/**
 * Description: Classe para auxiliar na montagem e manipula��o do arquivo do SPED Fiscal atrav�s da estrutura {@link SPEDFiscalFile}.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (22 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDFiscalBuilder {

  /**
   * Construtor privado para classe exclusiva com m�todos est�ticos.
   */
  private SPEDFiscalBuilder() {
  }

  /**
   * Este m�todo finaliza um arquivo para ser exportado. A finaliza��o inclui os seguintes passos:<br>
   * <li>Criar e/ou atualizar os blocos de n�vel hierarquico 0 do arquivo. Corrigindo os valores dos blocos de abertura (indicando se tem conte�do ou n�o) e atualizando o total de registros no seu registro de fechamento.</li>
   *
   * @param sped
   */
  public static void finalizeFile(SPEDFiscalFile sped) {

  }

  /**
   * REGISTRO 0001: ABERTURA DO BLOCO 0<Br>
   * <Br>
   * Observa��es:
   * <li>N�vel hier�rquico - 1</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   * <br>
   *
   * @param sped Arquivo do SPED.
   * @param hasContent flag para indicar se o bloco tem conte�do.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal0001 add0001(SPEDFiscalFile sped, boolean hasContent) throws RFWException {
    SPEDFiscal0001 r0001 = sped.getR0001();
    if (r0001 == null) {
      r0001 = new SPEDFiscal0001();
      sped.setR0001(r0001);

      if (hasContent) {
        r0001.setR02_IND_MOV("0");
      } else {
        r0001.setR02_IND_MOV("1");
      }
    }
    return r0001;
  }

  public static SPEDFiscalC100 addC100(SPEDFiscalC001 rc001, boolean r02_IND_OPER, boolean r03_IND_EMIT, String r04_COD_PART, String r05_COD_MOD, String r06_COD_SIT, String r07_SER, String r08_NUM_DOC, String r09_CHV_NFE, LocalDate r10_DT_DOC, LocalDate r11_DT_E_S, BigDecimal r12_VL_DOC, String r13_IND_PGTO, BigDecimal r14_VL_DESC, BigDecimal r15_VL_ABAT_NT, BigDecimal r16_VL_MERC, String r17_IND_FRT, BigDecimal r18_VL_FRT, BigDecimal r19_VL_SEG, BigDecimal r20_VL_OUT_DA, BigDecimal r21_VL_BC_ICMS, BigDecimal r22_VL_ICMS, BigDecimal r23_VL_BC_ICMS_ST, BigDecimal r24_VL_ICMS_ST, BigDecimal r25_VL_IPI, BigDecimal r26_VL_PIS, BigDecimal r27_VL_COFINS, BigDecimal r28_VL_PIS_ST, BigDecimal r29_VL_COFINS_ST) throws RFWException {
    String rc100Key = "|";
    rc100Key += PreProcess.coalesce(r05_COD_MOD, "") + "|";
    rc100Key += PreProcess.coalesce(r04_COD_PART, "") + "|";
    rc100Key += PreProcess.coalesce(r08_NUM_DOC, "") + "|";
    rc100Key += PreProcess.coalesce(r09_CHV_NFE, "") + "|";

    SPEDFiscalC100 rc100 = rc001.getRc100().get(rc100Key);
    if (rc100 == null) {
      rc100 = new SPEDFiscalC100();
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
   * Observa��es:
   * <li>N�vel hier�rquico - 1</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   * <br>
   *
   * @param sped Arquivo do SPED.
   * @param lineCount quantidade de linhas (registros) a ser informada deve considerar tamb�m os pr�prios registros de abertura e encerramento do bloco. Para este c�lculo, o registro 0000, mesmo n�o pertencendo ao bloco 0, deve ser somado.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal0990 add0990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscal0990 r0990 = sped.getR0990();
    if (r0990 == null) {
      r0990 = new SPEDFiscal0990();
      sped.setR0990(r0990);

    }
    r0990.setR02_QTD_LIN_0(lineCount);
    return r0990;
  }

  /**
   * REGISTRO C001: ABERTURA DO BLOCO C<Br>
   * <Br>
   * Observa��es:
   * <li>N�vel hier�rquico - 1</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   * <br>
   *
   * @param sped Arquivo do SPED.
   * @param hasContent Flag para indicar se o bloco tem ou n�o conte�do.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalC001 addC001(SPEDFiscalFile sped, boolean hasContent) throws RFWException {
    SPEDFiscalC001 rc001 = sped.getRC001();
    if (rc001 == null) {
      rc001 = new SPEDFiscalC001();
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
   * Observa��es: Registro obrigat�rio
   * <li>N�vel hier�rquico - 1</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   *
   * @param sped Arquivo do SPED.
   * @param lineCount quantidade de linhas a ser informada deve considerar tamb�m os pr�prios registros de abertura e encerramento do bloco.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalC990 addC990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscalC990 rC990 = sped.getRC990();
    if (rC990 == null) {
      rC990 = new SPEDFiscalC990();
      sped.setRC990(rC990);

    }
    rC990.setR02_QTD_LIN_C(lineCount);
    return rC990;
  }

  /**
   * REGISTRO D001: ABERTURA DO BLOCO D<Br>
   * <Br>
   * Observa��es:
   * <li>N�vel hier�rquico - 1</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   * <br>
   *
   * @param sped Arquivo do SPED.
   * @param hasContent Flag para indicar se o bloco tem ou n�o conte�do.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalD001 addD001(SPEDFiscalFile sped, boolean hasContent) throws RFWException {
    SPEDFiscalD001 rd001 = sped.getRD001();
    if (rd001 == null) {
      rd001 = new SPEDFiscalD001();
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
   * Observa��es: Registro obrigat�rio
   * <li>N�vel hier�rquico - 1</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   *
   * @param sped Arquivo do SPED.
   * @param lineCount quantidade de linhas a ser informada deve considerar tamb�m os pr�prios registros de abertura e encerramento do bloco.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalD990 addD990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscalD990 rd990 = sped.getRD990();
    if (rd990 == null) {
      rd990 = new SPEDFiscalD990();
      sped.setRD990(rd990);

    }
    rd990.setR02_QTD_LIN_D(lineCount);
    return rd990;
  }

  /**
   * REGISTRO E001: ABERTURA DO BLOCO E<Br>
   * <Br>
   * Observa��es:
   * <li>N�vel hier�rquico - 1</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   * <br>
   *
   * @param sped Arquivo do SPED.
   * @param hasContent Flag para indicar se o bloco tem ou n�o conte�do.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalE001 addE001(SPEDFiscalFile sped, boolean hasContent) throws RFWException {
    SPEDFiscalE001 re001 = sped.getRE001();
    if (re001 == null) {
      re001 = new SPEDFiscalE001();
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
   * Observa��es: Registro obrigat�rio
   * <li>N�vel hier�rquico - 1</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   *
   * @param sped Arquivo do SPED.
   * @param lineCount quantidade de linhas a ser informada deve considerar tamb�m os pr�prios registros de abertura e encerramento do bloco.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalE990 addE990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscalE990 re990 = sped.getRE990();
    if (re990 == null) {
      re990 = new SPEDFiscalE990();
      sped.setRE990(re990);

    }
    re990.setR02_QTD_LIN_E(lineCount);
    return re990;
  }

  /**
   * REGISTRO G001: ABERTURA DO BLOCO G<Br>
   * <Br>
   * Observa��es:
   * <li>N�vel hier�rquico - 1</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   * <br>
   *
   * @param sped Arquivo do SPED.
   * @param hasContent Flag para indicar se o bloco tem ou n�o conte�do.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalG001 addG001(SPEDFiscalFile sped, boolean hasContent) throws RFWException {
    SPEDFiscalG001 rg001 = sped.getRG001();
    if (rg001 == null) {
      rg001 = new SPEDFiscalG001();
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
   * Observa��es: Registro obrigat�rio
   * <li>N�vel hier�rquico - 1</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   *
   * @param sped Arquivo do SPED.
   * @param lineCount quantidade de linhas a ser informada deve considerar tamb�m os pr�prios registros de abertura e encerramento do bloco.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalG990 addG990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscalG990 rg990 = sped.getRG990();
    if (rg990 == null) {
      rg990 = new SPEDFiscalG990();
      sped.setRG990(rg990);

    }
    rg990.setR02_QTD_LIN_G(lineCount);
    return rg990;
  }

  /**
   * REGISTRO H001: ABERTURA DO BLOCO H<Br>
   * <Br>
   * Observa��es:
   * <li>N�vel hier�rquico - 1</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   * <br>
   *
   * @param sped Arquivo do SPED.
   * @param hasContent Flag para indicar se o bloco tem ou n�o conte�do.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalH001 addH001(SPEDFiscalFile sped, boolean hasContent) throws RFWException {
    SPEDFiscalH001 rh001 = sped.getRH001();

    if (rh001 == null) {
      rh001 = new SPEDFiscalH001();
      sped.setRH001(rh001);

      if (hasContent) {
        rh001.setR02_IND_MOV("0");
      } else {
        rh001.setR02_IND_MOV("1");
      }
    }

    return rh001;
  }

  /**
   * REGISTRO H990: ENCERRAMENTO DO BLOCO H<Br>
   * <Br>
   * Observa��es: Registro obrigat�rio
   * <li>N�vel hier�rquico - 1</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   *
   * @param sped Arquivo do SPED.
   * @param lineCount quantidade de linhas a ser informada deve considerar tamb�m os pr�prios registros de abertura e encerramento do bloco.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalH990 addH990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscalH990 rh990 = sped.getRH990();
    if (rh990 == null) {
      rh990 = new SPEDFiscalH990();
      sped.setRH990(rh990);

    }
    rh990.setR02_QTD_LIN_H(lineCount);
    return rh990;
  }

  /**
   * REGISTRO K001: ABERTURA DO BLOCO K<Br>
   * <Br>
   * Observa��es:
   * <li>N�vel hier�rquico - 1</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   * <br>
   *
   * @param sped Arquivo do SPED.
   * @param hasContent Flag para indicar se o bloco tem ou n�o conte�do.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalK001 addK001(SPEDFiscalFile sped, boolean hasContent) throws RFWException {
    SPEDFiscalK001 rk001 = sped.getRK001();
    if (rk001 == null) {
      rk001 = new SPEDFiscalK001();
      sped.setRK001(rk001);

      if (hasContent) {
        rk001.setR02_IND_MOV("0");
      } else {
        rk001.setR02_IND_MOV("1");
      }
    }

    return rk001;
  }

  /**
   * REGISTRO K990: ENCERRAMENTO DO BLOCO K<Br>
   * <Br>
   * Observa��es: Registro obrigat�rio
   * <li>N�vel hier�rquico - 1</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   *
   * @param sped Arquivo do SPED.
   * @param lineCount quantidade de linhas a ser informada deve considerar tamb�m os pr�prios registros de abertura e encerramento do bloco.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscalK990 addK990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscalK990 rk990 = sped.getRK990();
    if (rk990 == null) {
      rk990 = new SPEDFiscalK990();
      sped.setRK990(rk990);

    }
    rk990.setR02_QTD_LIN_K(lineCount);
    return rk990;
  }

  /**
   * REGISTRO 1001: ABERTURA DO BLOCO 1<Br>
   * <Br>
   * Observa��es:
   * <li>N�vel hier�rquico - 1</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   * <br>
   *
   * @param sped Arquivo do SPED.
   * @param hasContent Flag para indicar se o bloco tem ou n�o conte�do.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal1001 add1001(SPEDFiscalFile sped, boolean hasContent) throws RFWException {
    SPEDFiscal1001 r1001 = sped.getR1001();
    if (r1001 == null) {
      r1001 = new SPEDFiscal1001();
      sped.setR1001(r1001);

      if (hasContent) {
        r1001.setR02_IND_MOV("0");
      } else {
        r1001.setR02_IND_MOV("1");
      }
    }
    return r1001;
  }

  /**
   * REGISTRO 1990: ENCERRAMENTO DO BLOCO 1<Br>
   * <Br>
   * Observa��es: Registro obrigat�rio
   * <li>N�vel hier�rquico - 1</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   *
   * @param sped Arquivo do SPED.
   * @param lineCount quantidade de linhas a ser informada deve considerar tamb�m os pr�prios registros de abertura e encerramento do bloco.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal1990 add1990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscal1990 r1990 = sped.getR1990();
    if (r1990 == null) {
      r1990 = new SPEDFiscal1990();
      sped.setR1990(r1990);

    }
    r1990.setR02_QTD_LIN_1(lineCount);
    return r1990;
  }

  /**
   * REGISTRO 9001: ABERTURA DO BLOCO 9<Br>
   * <Br>
   * Observa��es:
   * <li>N�vel hier�rquico - 1</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   * <br>
   *
   * @param sped Arquivo do SPED.
   * @param hasContent Flag para indicar se o bloco tem ou n�o conte�do.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal9001 add9001(SPEDFiscalFile sped, boolean hasContent) throws RFWException {
    SPEDFiscal9001 r9001 = sped.getR9001();
    if (r9001 == null) {
      r9001 = new SPEDFiscal9001();
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
   * Observa��es: Registro obrigat�rio
   * <li>N�vel hier�rquico - 1</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   *
   * @param sped Arquivo do SPED.
   * @param lineCount quantidade de linhas a ser informada deve considerar tamb�m os pr�prios registros de abertura e encerramento do bloco.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal9990 add9990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscal9990 r9990 = sped.getR9990();
    if (r9990 == null) {
      r9990 = new SPEDFiscal9990();
      sped.setR9990(r9990);

    }
    r9990.setR02_QTD_LIN_9(lineCount);
    return r9990;
  }

  /**
   * REGISTRO 9999: ENCERRAMENTO DO ARQUIVO DIGITAL<Br>
   * <Br>
   * Observa��es: Registro obrigat�rio
   * <li>N�vel hier�rquico - 0</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   *
   * @param sped Arquivo do SPED.
   * @param lineCount quantidade de linhas a ser informada deve considerar tamb�m os pr�prios registros de abertura e encerramento do bloco.
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal9999 add9999(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscal9999 r9999 = sped.getR9999();
    if (r9999 == null) {
      r9999 = new SPEDFiscal9999();
      sped.setR9999(r9999);

    }
    r9999.setR02_QTD_LIN(lineCount);
    return r9999;
  }

  /**
   * REGISTRO 0100: DADOS DO CONTABILISTA<br>
   * <br>
   *
   * Observa��es: Registro obrigat�rio
   * <li>N�vel hier�rquico - 0</li>
   * <li>Ocorr�ncia � um por arquivo</li><Br>
   *
   * @param r0001 Registro 0001
   * @param r02_NOME
   * @param r03_CPF
   * @param r04_CRC
   * @param r05_CNPJ
   * @param r06_CEP
   * @param r07_END
   * @param r08_NUM
   * @param r09_COMPL
   * @param r10_BAIRRO
   * @param r11_FONE
   * @param r12_FAX
   * @param r13_EMAIL
   * @param r14_COD_MUN
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal0100 add0100(SPEDFiscal0001 r0001, String r02_NOME, String r03_CPF, String r04_CRC, String r05_CNPJ, String r06_CEP, String r07_END, String r08_NUM, String r09_COMPL, String r10_BAIRRO, String r11_FONE, String r12_FAX, String r13_EMAIL, String r14_COD_MUN) throws RFWException {
    SPEDFiscal0100 r0100 = r0001.getR0100();
    if (r0100 == null) {
      r0100 = new SPEDFiscal0100();
      r0001.setR0100(r0100);
    }

    r0100.setR02_NOME(r02_NOME);
    r0100.setR03_CPF(r03_CPF);
    r0100.setR04_CRC(r04_CRC);
    r0100.setR05_CNPJ(r05_CNPJ);
    r0100.setR06_CEP(r06_CEP);
    r0100.setR07_END(r07_END);
    r0100.setR08_NUM(r08_NUM);
    r0100.setR09_COMPL(r09_COMPL);
    r0100.setR10_BAIRRO(r10_BAIRRO);
    r0100.setR11_FONE(r11_FONE);
    r0100.setR12_FAX(r12_FAX);
    r0100.setR13_EMAIL(r13_EMAIL);
    r0100.setR14_COD_MUN(r14_COD_MUN);
    return r0100;
  }

  /**
   * REGISTRO 0000: ABERTURA DO ARQUIVO DIGITAL E IDENTIFICA��O DA ENTIDADE<br>
   * <br>
   * Observa��es:
   * <li>N�vel hier�rquico - 0</li>
   * <li>Ocorr�ncia - um por arquivo.</li>
   *
   * @param sped
   * @param r03_COD_FIN
   * @param r04_DT_INI
   * @param r05_DT_FIN
   * @param r06_NOME
   * @param r07_CNPJ
   * @param r08_CPF
   * @param r09_UF
   * @param r10_IE
   * @param r11_COD_MUN
   * @param r12_IM
   * @param r13_SUFRAMA
   * @param r14_IND_PERFIL
   * @param r15_IND_ATIV
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal0000 add0000(SPEDFiscalFile sped, Integer r03_COD_FIN, LocalDate r04_DT_INI, LocalDate r05_DT_FIN, String r06_NOME, String r07_CNPJ, String r08_CPF, String r09_UF, String r10_IE, String r11_COD_MUN, String r12_IM, String r13_SUFRAMA, String r14_IND_PERFIL, String r15_IND_ATIV) throws RFWException {
    SPEDFiscal0000 r0000 = sped.getR0000();
    if (r0000 == null) {
      r0000 = new SPEDFiscal0000();
      sped.setR0000(r0000);
    }

    r0000.setR02_COD_VER("017");
    r0000.setR03_COD_FIN(r03_COD_FIN);
    r0000.setR04_DT_INI(r04_DT_INI);
    r0000.setR05_DT_FIN(r05_DT_FIN);
    r0000.setR06_NOME(r06_NOME);
    r0000.setR07_CNPJ(r07_CNPJ);
    r0000.setR08_CPF(r08_CPF);
    r0000.setR09_UF(r09_UF);
    r0000.setR10_IE(r10_IE);
    r0000.setR11_COD_MUN(r11_COD_MUN);
    r0000.setR12_IM(r12_IM);
    r0000.setR13_SUFRAMA(r13_SUFRAMA);
    r0000.setR14_IND_PERFIL(r14_IND_PERFIL);
    r0000.setR15_IND_ATIV(r15_IND_ATIV);
    return r0000;
  }

  // public static SPEDFiscal9900 addChild9900(SPEDFiscal9001 r9001, String block, Integer count) throws RFWException {
  // SPEDFiscal9900 r9900 = r9001.getR9900().get(block);
  // if (r9900 == null) {
  // r9900 = new SPEDFiscal9900();
  // r9001.getR9900().put(block, r9900);
  // }
  // r9900.setR02_REG_BLC(block);
  // r9900.setR03_QTD_REG_BLC(count);
  //
  // return r9900;
  // }

  // public static void recursive9900Creater(SPEDFiscalFile sped, SPEDFiscal9001 r9001, SPEDRegister reg) throws RFWException {
  // // Itera os registros de "sped"
  // final Field[] fields = reg.getClass().getDeclaredFields();
  // Arrays.sort(fields, SPEDRegister.fieldComparator);
  //
  // // Iteramos os m�todos encontrados, e se estiverem no padr�o "r####" contabilizaos ele, e seus filhos se for o caso
  // for (int i = 0; i < fields.length; i++) {
  // Field f = fields[i];
  // if (f.getName().matches("r[A-Za-z0-9]{4}")) { // Atributos de subatributos
  // Object value = null;
  // try {
  // Method mGet = reg.getClass().getMethod("getR" + f.getName().substring(1));
  // value = mGet.invoke(reg);
  // } catch (Exception e) {
  // throw new RFWCriticalException("BISModules_000263", new String[] { f.getName() }, e);
  // }
  // if (value != null) {
  // SPEDFiscal9900 regCounter = r9001.getR9900().get(f.getName().substring(1).toUpperCase());
  // if (regCounter == null) {
  // regCounter = addChild9900(r9001, f.getName().substring(1).toUpperCase(), 0);
  // r9001.getR9900().put(f.getName().substring(1).toUpperCase(), regCounter);
  // }
  // if (value instanceof LinkedHashMap) {
  // for (Object spedReg : ((LinkedHashMap<?, ?>) value).values()) {
  // regCounter.setR03_QTD_REG_BLC(regCounter.getR03_QTD_REG_BLC() + 1);
  // recursive9900Creater(sped, r9001, ((SPEDRegister) spedReg));
  // }
  // } else if (value instanceof ArrayList) {
  // for (Object spedReg : (ArrayList<?>) value) {
  // regCounter.setR03_QTD_REG_BLC(regCounter.getR03_QTD_REG_BLC() + 1);
  // recursive9900Creater(sped, r9001, ((SPEDRegister) spedReg));
  // }
  // } else if (value instanceof SPEDRegister) {
  // regCounter.setR03_QTD_REG_BLC(regCounter.getR03_QTD_REG_BLC() + 1);
  // recursive9900Creater(sped, r9001, ((SPEDRegister) value));
  // }
  // }
  // }
  // }
  // }

  /**
   * REGISTRO E110: APURA��O DO ICMS � OPERA��ES PR�PRIAS<Br>
   * <br>
   * <li>Observa��es:</li>
   * <li>N�vel hier�rquico � 3 � registro obrigat�rio</li>
   * <li>Ocorr�ncia � um por per�odo</li>
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
      re110 = new SPEDFiscalE110();
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
   * REGISTRO E100: PER�ODO DA APURA��O DO ICMS<Br>
   * <br>
   * <li>Observa��es:</li>
   * <li>N�vel hier�rquico � 2</li>
   * <li>Ocorr�ncia � 1:N</li>
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
      re100 = new SPEDFiscalE100();
      re001.setRe100(re100);
    }

    re100.setR02_DT_INI(dt_ini);
    re100.setR03_DT_FIN(dt_fin);

    return re100;
  }

  /**
   * REGISTRO 1010: OBRIGATORIEDADE DE REGISTROS DO BLOCO 1<br>
   * <br>
   *
   * <li>Obs.: At� 31/12/2021 o campo 08 referiu-se ao registro 1600.</li>
   * <li>N�vel hier�rquico - 2</li>
   * <li>Ocorr�ncia � 1</li>
   * <li>
   *
   * @param r1001 Registro 1001
   * @param indExp
   * @param indCCRF
   * @param indComb
   * @param indUsina
   * @param indVA
   * @param indEE
   * @param indCart
   * @param infForm
   * @param indAER
   * @param indGIAF1
   * @param indGIAF3
   * @param indGIAF4
   * @param indRestRessarcComplICMS
   * @return
   * @throws RFWException
   */
  public static SPEDFiscal1010 add1010(SPEDFiscal1001 r1001, boolean indExp, boolean indCCRF, boolean indComb, boolean indUsina, boolean indVA, boolean indEE, boolean indCart, boolean infForm, boolean indAER, boolean indGIAF1, boolean indGIAF3, boolean indGIAF4, boolean indRestRessarcComplICMS) throws RFWException {
    SPEDFiscal1010 r1010 = r1001.getR1010();
    if (r1010 == null) {
      r1010 = new SPEDFiscal1010();
      r1001.setR1010(r1010);
    }

    r1010.setR02_IND_EXP((indExp ? "S" : "N"));
    r1010.setR03_IND_CCRF((indCCRF ? "S" : "N"));
    r1010.setR04_IND_COMB((indComb ? "S" : "N"));
    r1010.setR05_IND_USINA((indUsina ? "S" : "N"));
    r1010.setR06_IND_VA((indVA ? "S" : "N"));
    r1010.setR07_IND_EE((indEE ? "S" : "N"));
    r1010.setR08_IND_CART((indCart ? "S" : "N"));
    r1010.setR09_IND_FORM((infForm ? "S" : "N"));
    r1010.setR10_IND_AER((indAER ? "S" : "N"));
    r1010.setR11_IND_GIAF1((indGIAF1 ? "S" : "N"));
    r1010.setR12_IND_GIAF3((indGIAF3 ? "S" : "N"));
    r1010.setR13_IND_GIAF4((indGIAF4 ? "S" : "N"));
    r1010.setR14_IND_REST_RESSARC_COMPL_ICMS((indRestRessarcComplICMS ? "S" : "N"));

    return r1010;
  }

  /**
   * REGISTRO 0460: TABELA DE OBSERVA��ES DO LAN�AMENTO FISCAL<br>
   * <br>
   * <li>Observa��es:</li>
   * <li>N�vel hier�rquico - 2</li>
   * <li>Ocorr�ncia �v�rios (por arquivo)</li>
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
      r0460 = new SPEDFiscal0460();
      r0001.getR0460().put(cod_obs, r0460);
    }

    r0460.setR02_COD_OBS(cod_obs);
    r0460.setR03_TXT(txt);

    return r0460;
  }

  /**
   * REGISTRO 0005: DADOS COMPLEMENTARES DA ENTIDADE<br>
   * <br>
   *
   * <li>Observa��es:</li>
   * <li>N�vel hier�rquico - 2</li>
   * <li>Ocorr�ncia � um por arquivo</li>
   *
   * @param r0001
   * @param r02_FANTASIA
   * @param r03_CEP
   * @param r04_END
   * @param r05_NUM
   * @param r06_COMPL
   * @param r07_BAIRRO
   * @param r08_FONE
   * @param r09_FAX
   * @param r10_EMAIL
   * @return
   * @throws RFWException
   * @throws RFWException
   */
  public static SPEDFiscal0005 add0005(SPEDFiscal0001 r0001, String r02_FANTASIA, String r03_CEP, String r04_END, String r05_NUM, String r06_COMPL, String r07_BAIRRO, String r08_FONE, String r09_FAX, String r10_EMAIL) throws RFWException, RFWException {
    SPEDFiscal0005 r0005 = r0001.getR0005();
    if (r0005 == null) {
      r0005 = new SPEDFiscal0005();
      r0001.setR0005(r0005);
    }

    r0005.setR02_FANTASIA(r02_FANTASIA);
    r0005.setR03_CEP(r03_CEP);
    r0005.setR04_END(r04_END);
    r0005.setR05_NUM(r05_NUM);
    r0005.setR06_COMPL(r06_COMPL);
    r0005.setR07_BAIRRO(r07_BAIRRO);
    r0005.setR08_FONE(r08_FONE);
    r0005.setR09_FAX(r09_FAX);
    r0005.setR10_EMAIL(r10_EMAIL);
    return r0005;
  }

  // /**
  // * Cria um registro autom�tico, que conta todos os registros do {@link SPEDFiscalFile} automaticamente e cria os filhos 9900.
  // *
  // * @param sped
  // * @return
  // * @throws RFWException
  // */
  // @SuppressWarnings({ "rawtypes", "unchecked" })
  // public static SPEDFiscal9001 add9001(SPEDFiscalFile sped) throws RFWException {
  // /*
  // * ATEN��O: Este m�todo sempre cria um novo registro por se tratar da contagem dos outros registros. Toda vez que ele for chamado para ser criado, todo o arquivo � recontabilizado.
  // */
  // SPEDFiscal9001 r9001 = new SPEDFiscal9001();
  // r9001.setR02_IND_MOV("0");
  //
  // // J� nos inclu�mos no arquivo "sped" para que o pr�prio 9001 j� seja contabilizado
  // sped.setR9001(r9001);
  //
  // // Itera os registros de "sped"
  // final Field[] fields = sped.getClass().getDeclaredFields();
  // Arrays.sort(fields, SPEDRegister.fieldComparator);
  //
  // // Iteramos os m�todos encontrados, e se estiverem no padr�o "r####" contabilizaos ele, e seus filhos se for o caso
  // for (int i = 0; i < fields.length; i++) {
  // Field f = fields[i];
  // if (f.getName().matches("r[A-Za-z0-9]{4}")) { // Atributos de subatributos
  // Object value = null;
  // try {
  // Method mGet = sped.getClass().getMethod("getR" + f.getName().substring(1));
  // value = mGet.invoke(sped);
  // } catch (Exception e) {
  // throw new RFWCriticalException("BISModules_000263", new String[] { f.getName() }, e);
  // }
  // if (value != null) {
  // SPEDFiscal9900 regCounter = r9001.getR9900().get(f.getName().substring(1).toUpperCase());
  // if (regCounter == null) {
  // regCounter = addChild9900(r9001, f.getName().substring(1).toUpperCase(), 0);
  // r9001.getR9900().put(f.getName().substring(1).toUpperCase(), regCounter);
  // }
  // if (value instanceof LinkedHashMap) {
  // for (Object spedReg : ((LinkedHashMap<?, ?>) value).values()) {
  // regCounter.setR03_QTD_REG_BLC(regCounter.getR03_QTD_REG_BLC() + 1);
  // recursive9900Creater(sped, r9001, ((SPEDRegister) spedReg));
  // }
  // } else if (value instanceof ArrayList) {
  // for (Object spedReg : (ArrayList<?>) value) {
  // regCounter.setR03_QTD_REG_BLC(regCounter.getR03_QTD_REG_BLC() + 1);
  // recursive9900Creater(sped, r9001, ((SPEDRegister) spedReg));
  // }
  // } else if (value instanceof SPEDRegister) {
  // regCounter.setR03_QTD_REG_BLC(regCounter.getR03_QTD_REG_BLC() + 1);
  // recursive9900Creater(sped, r9001, ((SPEDRegister) value));
  // }
  // }
  // }
  // }
  //
  // // Remove todos os contadores registros que foram criados mas terminaram com contagem 0 - isso ocorre nos atributos com cole��es vazias
  // final ArrayList mirrorList = new ArrayList(r9001.getR9900().values());
  // for (int i = 0; i < mirrorList.size(); i++) {
  // final SPEDFiscal9900 treg = (SPEDFiscal9900) mirrorList.get(i);
  // if (treg.getR03_QTD_REG_BLC() == 0) {
  // r9001.getR9900().remove(treg.getR02_REG_BLC());
  // }
  // }
  //
  // // Depois de todos contabilizados atualizamos a quantidade do pr�prio registro 9900, dpeois que os zerados foram removidos
  // r9001.getR9900().get("9900").setR03_QTD_REG_BLC(r9001.getR9900().size());
  //
  // return r9001;
  // }

}
