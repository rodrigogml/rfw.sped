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
import br.eng.rodrigogml.rfw.sped.structure.SPEDFiscalFile;
import br.eng.rodrigogml.rfw.sped.structure.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscal0001;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscal0460;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscal0990;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscal1001;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscal1010;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscal1990;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscal9001;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscal9900;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscal9990;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscal9999;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalC001;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalC100;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalC190;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalC400;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalC405;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalC420;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalC800;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalC850;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalC990;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalD001;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalD990;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalE001;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalE100;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalE110;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalE116;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalE990;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalG001;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalG990;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalH001;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalH990;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalK001;
import br.eng.rodrigogml.rfw.sped.structure.fiscal.SPEDFiscalK990;

/**
 * Description: Classe para auxiliar na montagem e manipulação do arquivo do SPED Fiscal através da estrutura {@link SPEDFiscalFile}.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalBuilder {

  private SPEDFiscalBuilder() {
  }

  public static SPEDFiscal0001 make0001(SPEDFiscalFile sped, boolean hasContent) throws RFWException {
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

  public static SPEDFiscal0990 make0990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscal0990 r0990 = sped.getR0990();
    if (r0990 == null) {
      r0990 = new SPEDFiscal0990();
      sped.setR0990(r0990);

    }
    r0990.setR02_QTD_LIN_0(lineCount);
    return r0990;
  }

  public static SPEDFiscalC001 makeC001(SPEDFiscalFile sped, boolean hasContent) throws RFWException {
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

  public static SPEDFiscalC990 makeC990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscalC990 rC990 = sped.getRC990();
    if (rC990 == null) {
      rC990 = new SPEDFiscalC990();
      sped.setRC990(rC990);

    }
    rC990.setR02_QTD_LIN_C(lineCount);
    return rC990;
  }

  public static SPEDFiscalD001 makeD001(SPEDFiscalFile sped, boolean hasContent) throws RFWException {
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

  public static SPEDFiscalD990 makeD990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscalD990 rd990 = sped.getRD990();
    if (rd990 == null) {
      rd990 = new SPEDFiscalD990();
      sped.setRD990(rd990);

    }
    rd990.setR02_QTD_LIN_D(lineCount);
    return rd990;
  }

  public static SPEDFiscalE001 makeE001(SPEDFiscalFile sped, boolean hasContent) throws RFWException {
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

  public static SPEDFiscalE990 makeE990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscalE990 re990 = sped.getRE990();
    if (re990 == null) {
      re990 = new SPEDFiscalE990();
      sped.setRE990(re990);

    }
    re990.setR02_QTD_LIN_E(lineCount);
    return re990;
  }

  public static SPEDFiscalG001 makeG001(SPEDFiscalFile sped, boolean hasContent) throws RFWException {
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

  public static SPEDFiscalG990 makeG990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscalG990 rg990 = sped.getRG990();
    if (rg990 == null) {
      rg990 = new SPEDFiscalG990();
      sped.setRG990(rg990);

    }
    rg990.setR02_QTD_LIN_G(lineCount);
    return rg990;
  }

  public static SPEDFiscalH001 makeH001(SPEDFiscalFile sped, boolean hasContent) throws RFWException {
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

  public static SPEDFiscalH990 makeH990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscalH990 rh990 = sped.getRH990();
    if (rh990 == null) {
      rh990 = new SPEDFiscalH990();
      sped.setRH990(rh990);

    }
    rh990.setR02_QTD_LIN_H(lineCount);
    return rh990;
  }

  public static SPEDFiscalK001 makeK001(SPEDFiscalFile sped, boolean hasContent) throws RFWException {
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

  public static SPEDFiscalK990 makeK990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscalK990 rk990 = sped.getRK990();
    if (rk990 == null) {
      rk990 = new SPEDFiscalK990();
      sped.setRK990(rk990);

    }
    rk990.setR02_QTD_LIN_K(lineCount);
    return rk990;
  }

  public static SPEDFiscal1001 make1001(SPEDFiscalFile sped, boolean hasContent) throws RFWException {
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

  public static SPEDFiscal1990 make1990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscal1990 r1990 = sped.getR1990();
    if (r1990 == null) {
      r1990 = new SPEDFiscal1990();
      sped.setR1990(r1990);

    }
    r1990.setR02_QTD_LIN_1(lineCount);
    return r1990;
  }

  /**
   * Cria um registro automático, que conta todos os registros do {@link SPEDFiscalFile} automaticamente e cria os filhos 9900.
   *
   * @param sped
   * @return
   * @throws RFWException
   */
  @SuppressWarnings({ "rawtypes", "unchecked" })
  public static SPEDFiscal9001 make9001(SPEDFiscalFile sped) throws RFWException {
    /*
     * ATENÇÃO: Este método sempre cria um novo registro por se tratar da contagem dos outros registros. Toda vez que ele for chamado para ser criado, todo o arquivo é recontabilizado.
     */
    SPEDFiscal9001 r9001 = new SPEDFiscal9001();
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
            regCounter = makeChild9900(r9001, f.getName().substring(1).toUpperCase(), 0);
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

  public static SPEDFiscal9990 make9990(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscal9990 r9990 = sped.getR9990();
    if (r9990 == null) {
      r9990 = new SPEDFiscal9990();
      sped.setR9990(r9990);

    }
    r9990.setR02_QTD_LIN_9(lineCount);
    return r9990;
  }

  public static SPEDFiscal9999 make9999(SPEDFiscalFile sped, int lineCount) throws RFWException {
    SPEDFiscal9999 r9999 = sped.getR9999();
    if (r9999 == null) {
      r9999 = new SPEDFiscal9999();
      sped.setR9999(r9999);

    }
    r9999.setR02_QTD_LIN(lineCount);
    return r9999;
  }

  public static SPEDFiscal9900 makeChild9900(SPEDFiscal9001 r9001, String block, Integer count) throws RFWException {
    SPEDFiscal9900 r9900 = r9001.getR9900().get(block);
    if (r9900 == null) {
      r9900 = new SPEDFiscal9900();
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
            regCounter = makeChild9900(r9001, f.getName().substring(1).toUpperCase(), 0);
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

  public static SPEDFiscalE110 makeE110(SPEDFiscalFile sped, LocalDate startDate, LocalDate endDate) throws RFWException {
    final SPEDFiscalE100 re100 = makeE100(sped, startDate, endDate);
    SPEDFiscalE110 re110 = re100.getRe110();

    if (re110 == null) {
      re110 = new SPEDFiscalE110();
      re100.setRe110(re110);

      re110.setR02_VL_TOT_DEBITOS(BigDecimal.ZERO);
      re110.setR03_VL_AJ_DEBITOS(BigDecimal.ZERO);
      re110.setR04_VL_TOT_AJ_DEBITOS(BigDecimal.ZERO);
      re110.setR05_VL_ESTORNOS_CRED(BigDecimal.ZERO);
      re110.setR06_VL_TOT_CREDITOS(BigDecimal.ZERO);
      re110.setR07_VL_AJ_CREDITOS(BigDecimal.ZERO);
      re110.setR08_VL_TOT_AJ_CREDITOS(BigDecimal.ZERO);
      re110.setR09_VL_ESTORNOS_DEB(BigDecimal.ZERO);
      re110.setR10_VL_SLD_CREDOR_ANT(BigDecimal.ZERO);
      re110.setR11_VL_SLD_APURADO(BigDecimal.ZERO);
      re110.setR12_VL_TOT_DED(BigDecimal.ZERO);
      re110.setR13_VL_ICMS_RECOLHER(BigDecimal.ZERO);
      re110.setR14_VL_SLD_CREDOR_TRANSPORTAR(BigDecimal.ZERO);
      re110.setR15_DEB_ESP(BigDecimal.ZERO);
    }

    return re110;
  }

  public static SPEDFiscalE100 makeE100(SPEDFiscalFile sped, LocalDate startDate, LocalDate endDate) throws RFWException {
    final SPEDFiscalE001 re001 = makeE001(sped, true);

    SPEDFiscalE100 re100 = re001.getRe100();
    if (re100 == null) {
      re100 = new SPEDFiscalE100();
      re001.setRe100(re100);

      re100.setR02_DT_INI(startDate);
      re100.setR03_DT_FIN(endDate);
    }

    return re100;
  }

  public static SPEDFiscalE116 recursiveE116Creator(SPEDFiscalE110 re110, String codOR, BigDecimal vlOr, LocalDate dtVcto, String codRec, String numProc, String indProc, String proc, String txtCompl, LocalDate mesRef) throws RFWException {
    SPEDFiscalE116 re116 = re110.getRe116();
    if (re116 == null) {
      re116 = new SPEDFiscalE116();
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

  public static SPEDFiscal1010 make1010(SPEDFiscalFile sped, boolean indExp, boolean indCCRF, boolean indComb, boolean indUsina, boolean indVA, boolean indEE, boolean indCart, boolean infForm, boolean indAER, boolean indGIAF1, boolean indGIAF3, boolean indGIAF4, boolean indRestRessarcComplICMS) throws RFWException {
    final SPEDFiscal1001 r1001 = make1001(sped, true);
    SPEDFiscal1010 r1010 = r1001.getR1010();
    if (r1010 == null) {
      r1010 = new SPEDFiscal1010();
      r1001.setR1010(r1010);

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
    }

    return r1010;
  }

  public static SPEDFiscal0460 make0460(SPEDFiscalFile sped, String codObs, String txt) throws RFWException {
    final SPEDFiscal0001 r0001 = make0001(sped, true);

    SPEDFiscal0460 r0460 = r0001.getR0460().get(codObs);
    if (r0460 == null) {
      r0460 = new SPEDFiscal0460();
      r0001.getR0460().put(codObs, r0460);

      r0460.setR02_COD_OBS(codObs);
      r0460.setR03_TXT(txt);
    }

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
      final SPEDFiscalE110 re110 = makeE110(sped, startDate, endDate);

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
        SPEDFiscalBuilder.recursiveE116Creator(re110, "000", re110.getR13_VL_ICMS_RECOLHER(), dueDate, "046-2", null, null, null, null, startDate);
      }

    }

    // Atualiza as contagens de linhas por bloco
    updateCloseRegistersLineCount(sped);
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
    if (sped.getR0001() == null) SPEDFiscalBuilder.make0001(sped, false);
    if (sped.getR0990() == null) SPEDFiscalBuilder.make0990(sped, 0);
    totalfile += block = sped.getR0001().countRegisters() + 2; // Soma o registo de fechamento que não está incluso + Soma 1 porque o registro 0000 faz parte deste total
    sped.getR0990().setR02_QTD_LIN_0(block);

    // Bloco C
    if (sped.getRC001() == null) SPEDFiscalBuilder.makeC001(sped, false);
    if (sped.getRC990() == null) SPEDFiscalBuilder.makeC990(sped, 0);
    totalfile += block = sped.getRC001().countRegisters() + 1; // Soma o registo de fechamento que não está incluso
    sped.getRC990().setR02_QTD_LIN_C(block);

    // Bloco D
    if (sped.getRD001() == null) SPEDFiscalBuilder.makeD001(sped, false);
    if (sped.getRD990() == null) SPEDFiscalBuilder.makeD990(sped, 0);
    totalfile += block = sped.getRD001().countRegisters() + 1; // Soma o registo de fechamento que não está incluso
    sped.getRD990().setR02_QTD_LIN_D(block);

    // Bloco E
    if (sped.getRE001() == null) SPEDFiscalBuilder.makeE001(sped, false);
    if (sped.getRE990() == null) SPEDFiscalBuilder.makeE990(sped, 0);
    totalfile += block = sped.getRE001().countRegisters() + 1; // Soma o registo de fechamento que não está incluso
    sped.getRE990().setR02_QTD_LIN_E(block);

    // Bloco G
    if (sped.getRG001() == null) SPEDFiscalBuilder.makeG001(sped, false);
    if (sped.getRG990() == null) SPEDFiscalBuilder.makeG990(sped, 0);
    totalfile += block = sped.getRG001().countRegisters() + 1; // Soma o registo de fechamento que não está incluso
    sped.getRG990().setR02_QTD_LIN_G(block);

    // Bloco H
    if (sped.getRH001() == null) SPEDFiscalBuilder.makeH001(sped, false);
    if (sped.getRH990() == null) SPEDFiscalBuilder.makeH990(sped, 0);
    totalfile += block = sped.getRH001().countRegisters() + 1; // Soma o registo de fechamento que não está incluso
    sped.getRH990().setR02_QTD_LIN_H(block);

    // Bloco K
    if (sped.getRK001() == null) SPEDFiscalBuilder.makeK001(sped, false);
    if (sped.getRK990() == null) SPEDFiscalBuilder.makeK990(sped, 0);
    totalfile += block = sped.getRK001().countRegisters() + 1; // Soma o registo de fechamento que não está incluso
    sped.getRK990().setR02_QTD_LIN_K(block);

    // Bloco 1
    if (sped.getR1001() == null) SPEDFiscalBuilder.make1001(sped, false);
    if (sped.getR1990() == null) SPEDFiscalBuilder.make1990(sped, 0);
    totalfile += block = sped.getR1001().countRegisters() + 1; // Soma o registo de fechamento que não está incluso
    sped.getR1990().setR02_QTD_LIN_1(block);

    // ENCERRAMENTO DO ARQUIVO - Cria o registro para que seja contabilizado no bloco 9, mas só o atualiza no final, depois que o bloco 9 for escrito.
    if (sped.getR9999() == null) SPEDFiscalBuilder.make9999(sped, 0);

    // Bloco 9
    if (sped.getR9990() == null) SPEDFiscalBuilder.make9990(sped, 0); // Cria o fechamento antes para que seja contabilizado no método abaixo
    SPEDFiscalBuilder.make9001(sped); // Cria o bloco 9 sobre todos os registros criados

    totalfile += block = sped.getR9001().countRegisters() + 2; // Soma o registo de fechamento do bloco "9990" que não está incluso. E soma o "9999" segundo o manual: "... Para este cálculo, o registro 9999, apesar de não pertencer ao Bloco 9, também deve ser contabilizado nesta soma."
    sped.getR9990().setR02_QTD_LIN_9(block);

    // ENCERRAMENTO DO ARQUIVO - atualização do conteúdo
    sped.getR9999().setR02_QTD_LIN(totalfile);
  }
}
