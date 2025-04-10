package br.eng.rodrigogml.rfw.sped;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import br.eng.rodrigogml.rfw.kernel.exceptions.RFWCriticalException;
import br.eng.rodrigogml.rfw.kernel.exceptions.RFWException;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDContribFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContrib0001;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContrib0110;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContrib0111;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContrib0990;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContrib1001;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContrib1990;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContrib9001;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContrib9900;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContrib9990;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContrib9999;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribA001;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribA990;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribC001;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribC010;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribC100;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribC170;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribC400;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribC405;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribC481;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribC485;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribC990;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribD001;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribD990;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribF001;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribF990;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribI001;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribI990;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribM001;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribM200;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribM205;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribM210;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribM600;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribM605;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribM610;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribM990;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribP001;
import br.eng.rodrigogml.rfw.sped.structure.register.contrib.SPEDContribP990;

/**
 * Description: Classe para auxiliar na montagem e manipulação do arquivo do SPED de Contribuições através da estrutura {@link SPEDContribFile}.<br>
 *
 * @author Rodrigo GML
 * @since 1.0.0 (22 de jul. de 2023)
 * @version 1.0.0 - Rodrigo GML-(...)
 */
public class SPEDContribBuilder {

  /**
   * Construtor privado para classe exclusiva com métodos estáticos.
   */
  private SPEDContribBuilder() {
  }

  public static SPEDContrib0001 make0001(SPEDContribFile sped, boolean hasContent) {
    SPEDContrib0001 r0001 = sped.getR0001();
    if (r0001 == null) {
      r0001 = new SPEDContrib0001(sped);
      sped.setR0001(r0001);
      if (hasContent) {
        r0001.setR02_IND_MOV("0");
      } else {
        r0001.setR02_IND_MOV("1");
      }
    }
    return r0001;
  }

  public static SPEDContrib0990 make0990(SPEDContribFile sped, int lineCount) throws RFWException {
    SPEDContrib0990 r0990 = sped.getR0990();
    if (r0990 == null) {
      r0990 = new SPEDContrib0990(sped);
      sped.setR0990(r0990);
      r0990.setR02_QTD_LIN_0(lineCount);
    }
    return r0990;
  }

  public static SPEDContribA001 makeA001(SPEDContribFile sped, boolean hasContent) {
    SPEDContribA001 rA001 = sped.getRA001();
    if (rA001 == null) {
      rA001 = new SPEDContribA001(sped);
      sped.setrA001(rA001);
      if (hasContent) {
        rA001.setR02_IND_MOV("0");
      } else {
        rA001.setR02_IND_MOV("1");
      }
    }
    return rA001;
  }

  public static SPEDContribA990 makeA990(SPEDContribFile sped, int lineCount) throws RFWException {
    SPEDContribA990 ra990 = sped.getRA990();
    if (ra990 == null) {
      ra990 = new SPEDContribA990(sped);
      sped.setrA990(ra990);
      ra990.setR02_QTD_LIN_A(lineCount);
    }
    return ra990;
  }

  public static SPEDContribC001 makeC001(SPEDContribFile sped, boolean hasContent) {
    SPEDContribC001 rC001 = sped.getRC001();
    if (rC001 == null) {
      rC001 = new SPEDContribC001(sped);
      sped.setrC001(rC001);
      if (hasContent) {
        rC001.setR02_IND_MOV("0");
      } else {
        rC001.setR02_IND_MOV("1");
      }
    }
    return rC001;
  }

  public static SPEDContribC990 makeC990(SPEDContribFile sped, int lineCount) throws RFWException {
    SPEDContribC990 rc990 = sped.getRC990();
    if (rc990 == null) {
      rc990 = new SPEDContribC990(sped);
      sped.setrC990(rc990);
      rc990.setR02_QTD_LIN_C(lineCount);
    }
    return rc990;
  }

  public static SPEDContribD001 makeD001(SPEDContribFile sped, boolean hasContent) {
    SPEDContribD001 rD001 = sped.getRD001();
    if (rD001 == null) {
      rD001 = new SPEDContribD001(sped);
      sped.setrD001(rD001);
      if (hasContent) {
        rD001.setR02_IND_MOV("0");
      } else {
        rD001.setR02_IND_MOV("1");
      }
    }
    return rD001;
  }

  public static SPEDContribD990 makeD990(SPEDContribFile sped, int lineCount) throws RFWException {
    SPEDContribD990 rd990 = sped.getRD990();
    if (rd990 == null) {
      rd990 = new SPEDContribD990(sped);
      sped.setrD990(rd990);
      rd990.setR02_QTD_LIN_D(lineCount);
    }
    return rd990;
  }

  public static SPEDContribF990 makeF990(SPEDContribFile sped, int lineCount) throws RFWException {
    SPEDContribF990 rf990 = sped.getRF990();
    if (rf990 == null) {
      rf990 = new SPEDContribF990(sped);
      sped.setrF990(rf990);
      rf990.setR02_QTD_LIN_F(lineCount);
    }
    return rf990;
  }

  public static SPEDContribI990 makeI990(SPEDContribFile sped, int lineCount) throws RFWException {
    SPEDContribI990 ri990 = sped.getRI990();
    if (ri990 == null) {
      ri990 = new SPEDContribI990(sped);
      sped.setrI990(ri990);
      ri990.setR02_QTD_LIN_I(lineCount);
    }
    return ri990;
  }

  public static SPEDContribI001 makeI001(SPEDContribFile sped, boolean hasContent) {
    SPEDContribI001 rI001 = sped.getRI001();
    if (rI001 == null) {
      rI001 = new SPEDContribI001(sped);
      sped.setrI001(rI001);
      if (hasContent) {
        rI001.setR02_IND_MOV("0");
      } else {
        rI001.setR02_IND_MOV("1");
      }
    }
    return rI001;
  }

  public static SPEDContribP001 makeP001(SPEDContribFile sped, boolean hasContent) {
    SPEDContribP001 rP001 = sped.getRP001();
    if (rP001 == null) {
      rP001 = new SPEDContribP001(sped);
      sped.setrP001(rP001);
      if (hasContent) {
        rP001.setR02_IND_MOV("0");
      } else {
        rP001.setR02_IND_MOV("1");
      }
    }
    return rP001;
  }

  public static SPEDContribF001 makeF001(SPEDContribFile sped, boolean hasContent) {
    SPEDContribF001 rF001 = sped.getRF001();
    if (rF001 == null) {
      rF001 = new SPEDContribF001(sped);
      sped.setrF001(rF001);
      if (hasContent) {
        rF001.setR02_IND_MOV("0");
      } else {
        rF001.setR02_IND_MOV("1");
      }
    }
    return rF001;
  }

  public static SPEDContribM990 makeM990(SPEDContribFile sped, int lineCount) throws RFWException {
    SPEDContribM990 rm990 = sped.getRM990();
    if (rm990 == null) {
      rm990 = new SPEDContribM990(sped);
      sped.setrM990(rm990);
      rm990.setR02_QTD_LIN_M(lineCount);
    }
    return rm990;
  }

  public static SPEDContribP990 makeP990(SPEDContribFile sped, int lineCount) throws RFWException {
    SPEDContribP990 rp990 = sped.getRP990();
    if (rp990 == null) {
      rp990 = new SPEDContribP990(sped);
      sped.setrP990(rp990);
      rp990.setR02_QTD_LIN_P(lineCount);
    }
    return rp990;
  }

  public static SPEDContribM001 makeM001(SPEDContribFile sped, boolean hasContent) throws RFWException {
    SPEDContribM001 rm001 = sped.getRM001();
    if (rm001 == null) {
      rm001 = new SPEDContribM001(sped);
      sped.setrM001(rm001);
      if (hasContent) {
        rm001.setR02_IND_MOV("0");
      } else {
        rm001.setR02_IND_MOV("1");
      }
    }
    return rm001;
  }

  public static SPEDContrib1001 make1001(SPEDContribFile sped, boolean hasContent) throws RFWException {
    SPEDContrib1001 r1001 = sped.getR1001();
    if (r1001 == null) {
      r1001 = new SPEDContrib1001(sped);
      sped.setR1001(r1001);

      if (hasContent) {
        r1001.setR02_IND_MOV("0");
      } else {
        r1001.setR02_IND_MOV("1");
      }
    }
    return r1001;
  }

  public static SPEDContrib1990 make1990(SPEDContribFile sped, int lineCount) throws RFWException {
    SPEDContrib1990 r1990 = sped.getR1990();
    if (r1990 == null) {
      r1990 = new SPEDContrib1990(sped);
      sped.setR1990(r1990);
      r1990.setR02_QTD_LIN_1(lineCount);
    }
    return r1990;
  }

  public static SPEDContrib9990 make9990(SPEDContribFile sped, int lineCount) throws RFWException {
    SPEDContrib9990 r9990 = sped.getR9990();
    if (r9990 == null) {
      r9990 = new SPEDContrib9990(sped);
      sped.setR9990(r9990);
      r9990.setR02_QTD_LIN_9(lineCount);
    }
    return r9990;
  }

  public static SPEDContrib9999 make9999(SPEDContribFile sped, int lineCount) throws RFWException {
    SPEDContrib9999 r9999 = sped.getR9999();
    if (r9999 == null) {
      r9999 = new SPEDContrib9999(sped);
      sped.setR9999(r9999);
      r9999.setR02_QTD_LIN(lineCount);
    }
    return r9999;
  }

  /**
   * Cria um registro automático, que conta todos os registros do {@link SPEDContribFile} automaticamente e cria os filhos 9900.
   */
  @SuppressWarnings({ "rawtypes", "unchecked" })
  public static SPEDContrib9001 make9001(SPEDContribFile sped) throws RFWException {
    /*
     * ATENÇÃO: Este método sempre cria um novo registro por se tratar da contagem dos outros registros. Toda vez que ele for chamado para ser criado, todo o arquivo é recontabilizado.
     */
    SPEDContrib9001 r9001 = new SPEDContrib9001(sped);
    r9001.setR02_IND_MOV("0");

    // Já nos incluímos no arquivo "sped" para que o próprio 9001 já seja contabilizado
    sped.setR9001(r9001);

    // Itera os registros de "sped"
    final Field[] fields = sped.getClass().getDeclaredFields();
    Arrays.sort(fields, SPEDRegister.fieldComparator);

    // Iteramos os métodos encontrados, e se estiverem no padrão "r####" contabilizaos ele, e seus filhos se for o caso
    for (int i = 0; i < fields.length; i++) {
      Field f = fields[i];
      if (f.getName().matches("r[A-Za-z0-9]{4}(\\Q_AUTO\\E)?")) { // Atributos de subatributos
        Object value = null;
        try {
          Method mGet = sped.getClass().getMethod("getR" + f.getName().substring(1));
          value = mGet.invoke(sped);
        } catch (Exception e) {
          throw new RFWCriticalException("BISModules_000263", new String[] { f.getName() }, e);
        }
        if (value != null) {
          SPEDContrib9900 regCounter = r9001.getR9900().get(f.getName().substring(1).toUpperCase());
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
      final SPEDContrib9900 treg = (SPEDContrib9900) mirrorList.get(i);
      if (treg.getR03_QTD_REG_BLC() == 0) {
        r9001.getR9900().remove(treg.getR02_REG_BLC());
      }
    }

    // Depois de todos contabilizados atualizamos a quantidade do próprio registro 9900, dpeois que os zerados foram removidos
    r9001.getR9900().get("9900").setR03_QTD_REG_BLC(r9001.getR9900().size());

    return r9001;
  }

  public static SPEDContrib9900 makeChild9900(SPEDContrib9001 r9001, String block, Integer count) throws RFWException {
    SPEDContrib9900 r9900 = r9001.getR9900().get(block);
    if (r9900 == null) {
      r9900 = new SPEDContrib9900(r9001.getSpedFile());
      r9001.getR9900().put(block, r9900);
    }
    r9900.setR02_REG_BLC(block);
    r9900.setR03_QTD_REG_BLC(count);

    return r9900;
  }

  public static void recursive9900Creater(SPEDContribFile sped, SPEDContrib9001 r9001, SPEDRegister reg) throws RFWException {
    // Itera os registros de "sped"
    final Field[] fields = reg.getClass().getDeclaredFields();
    Arrays.sort(fields, SPEDRegister.fieldComparator);

    // Iteramos os métodos encontrados, e se estiverem no padrão "r####" contabilizamos ele, e seus filhos se for o caso
    for (int i = 0; i < fields.length; i++) {
      Field f = fields[i];
      if (f.getName().matches("r[A-Za-z0-9]{4}(\\Q_AUTO\\E)?")) { // Atributos de subatributos
        Object value = null;
        try {
          Method mGet = reg.getClass().getMethod("getR" + f.getName().substring(1));
          value = mGet.invoke(reg);
        } catch (Exception e) {
          throw new RFWCriticalException("BISModules_000263", new String[] { f.getName() }, e);
        }
        if (value != null) {
          SPEDContrib9900 regCounter = r9001.getR9900().get(f.getName().substring(1).toUpperCase());
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

  /**
   * Rotina que cria e realiza o cálculo dos campos de somatórias depois que os registros foram escritos
   *
   * @param sped
   * @param codCtaC170
   * @param codCtaC481
   * @param codCtaC485
   * @throws RFWException
   */
  public static void updateCalcFields(SPEDContribFile sped, String codCtaC170, String codCtaC481, String codCtaC485) throws RFWException {
    // ATENÇÃO: Este loop abaixo tem a finalidade de remover as notas que não geram crédito, e deve ser feito antes de realizar os cálculos necessários. Cuidado ao aproveitar o loop abaixo para outra funções
    final SPEDContribC001 tc001 = sped.getRC001();
    for (Entry<String, SPEDContribC010> tc010Set : new ArrayList<Entry<String, SPEDContribC010>>(tc001.getRc010().entrySet())) {
      SPEDContribC010 tc010 = tc010Set.getValue();
      for (Entry<String, SPEDContribC100> tc100Set : new ArrayList<Entry<String, SPEDContribC100>>(tc010.getRc100().entrySet())) {
        SPEDContribC100 tc100 = tc100Set.getValue();
        // Todos os documentos que não gerarem crédito de PIS/COFINS não devem constar no arquivo.
        if (tc100.getR26_VL_PIS().compareTo(BigDecimal.ZERO) == 0 && tc100.getR27_VL_COFINS().compareTo(BigDecimal.ZERO) == 0) {
          tc010.getRc100().remove(tc100Set.getKey());
        }

        // Se temos um código de conta aproveitamos a iteração do C100 para escreve-las no C170. Note que essa função não atrapalha o loop da remoção das notas sem créditos
        if (codCtaC170 != null) {
          for (SPEDContribC170 tc170 : new ArrayList<SPEDContribC170>(tc100.getRc170())) {
            tc170.setR37_COD_CTA(codCtaC170);
          }
        }
      }

      // Se temos um código de conta aproveitamos a iteração do C100 para escreve-las no C170. Note que essa função não atrapalha o loop da remoção das notas sem créditos
      if (codCtaC481 != null || codCtaC485 != null) {
        for (Entry<String, SPEDContribC400> tc400Set : new ArrayList<Entry<String, SPEDContribC400>>(tc010.getRc400().entrySet())) {
          SPEDContribC400 tc400 = tc400Set.getValue();
          for (Entry<String, SPEDContribC405> tc405Set : new ArrayList<Entry<String, SPEDContribC405>>(tc400.getRc405().entrySet())) {
            SPEDContribC405 tc405 = tc405Set.getValue();
            if (codCtaC481 != null) {
              for (Entry<String, SPEDContribC481> tc481Set : new ArrayList<Entry<String, SPEDContribC481>>(tc405.getRc481().entrySet())) {
                SPEDContribC481 tc481 = tc481Set.getValue();
                tc481.setR10_COD_CTA(codCtaC481);
              }
            }
            if (codCtaC485 != null) {
              for (Entry<String, SPEDContribC485> tc485Set : new ArrayList<Entry<String, SPEDContribC485>>(tc405.getRc485().entrySet())) {
                SPEDContribC485 tc485 = tc485Set.getValue();
                tc485.setR10_COD_CTA(codCtaC485);
              }
            }
          }
        }
      }
    }

    // Atualiza total do registro 0111
    final SPEDContrib0001 t0001 = sped.getR0001();
    if (t0001 != null) {
      final SPEDContrib0110 t0110 = t0001.getR0110();
      if (t0110 != null) {
        final SPEDContrib0111 t0111 = t0110.getR0111();
        if (t0111 != null) {
          BigDecimal total = BigDecimal.ZERO;
          if (t0111.getR02_REC_BRU_NCUM_TRIB_MI() != null) total = total.add(t0111.getR02_REC_BRU_NCUM_TRIB_MI());
          if (t0111.getR03_REC_BRU_NCUM_NT_MI() != null) total = total.add(t0111.getR03_REC_BRU_NCUM_NT_MI());
          if (t0111.getR04_REC_BRU_NCUM_EXP() != null) total = total.add(t0111.getR04_REC_BRU_NCUM_EXP());
          if (t0111.getR05_REC_BRU_CUM() != null) total = total.add(t0111.getR05_REC_BRU_CUM());
          t0111.setR06_REC_BRU_TOTAL(total);
        }
      }
    }

    final SPEDContribM001 tm001 = sped.getRM001();
    if (tm001 != null) {
      final SPEDContribM200 tm200 = tm001.getRm200();
      if (tm200 != null) {
        for (SPEDContribM210 tm210 : tm200.getRm210().values()) {
          // Totaliza o Registro R13
          BigDecimal tot = tm210.getR11_VL_CONT_APUR();
          if (tm210.getR12_VL_AJUS_ACRES() != null) tot = tot.add(tm210.getR12_VL_AJUS_ACRES());
          if (tm210.getR13_VL_AJUS_REDUC() != null) tot = tot.subtract(tm210.getR13_VL_AJUS_REDUC());
          if (tm210.getR14_VL_CONT_DIFER() != null) tot = tot.subtract(tm210.getR14_VL_CONT_DIFER());
          if (tm210.getR15_VL_CONT_DIFER_ANT() != null) tot = tot.subtract(tm210.getR15_VL_CONT_DIFER_ANT());
          tm210.setR16_VL_CONT_PER(tot);

          switch (tm210.getR02_COD_CONT()) {
            case "01":
            case "02":
            case "03":
            case "04":
            case "32":
            case "71":
              tm200.setR02_VL_TOT_CONT_NC_PER(tm200.getR02_VL_TOT_CONT_NC_PER().add(tot));
              break;
            case "31":
              // case "32": //O número 32 está nos dois casos no manual, mas como é pra "vendas à Zona Franca de manaus" simplesmente comentei desse lado até descobrir melhor o que fazer
            case "51":
            case "52":
            case "54":
            case "72":
              tm200.setR09_VL_TOT_CONT_CUM_PER(tm200.getR02_VL_TOT_CONT_NC_PER().add(tot));
              break;
          }
        }

        tm200.setR05_VL_TOT_CONT_NC_DEV(tm200.getR02_VL_TOT_CONT_NC_PER().subtract(tm200.getR03_VL_TOT_CRED_DESC()).subtract(tm200.getR04_VL_TOT_CRED_DESC_ANT()));
        tm200.setR08_VL_CONT_NC_REC(tm200.getR05_VL_TOT_CONT_NC_DEV().subtract(tm200.getR06_VL_RET_NC()).subtract(tm200.getR07_VL_OUT_DED_NC()));
        tm200.setR12_VL_CONT_CUM_REC(tm200.getR09_VL_TOT_CONT_CUM_PER().subtract(tm200.getR10_VL_RET_CUM()).subtract(tm200.getR11_VL_OUT_DED_CUM()));
        tm200.setR13_VL_TOT_CONT_REC(tm200.getR08_VL_CONT_NC_REC().add(tm200.getR12_VL_CONT_CUM_REC()));

        { // =======> REGISTRO M205: CONTRIBUIÇÃO PARA O PIS/PASEP A RECOLHER – DETALHAMENTO POR CÓDIGO DE RECEITA
          // Cria os registro M205 dependendo dos valores definidos no M200
          if (tm200.getR12_VL_CONT_CUM_REC().compareTo(BigDecimal.ZERO) > 0) {
            SPEDContribM205 tm205 = new SPEDContribM205(sped);
            tm205.setR02_NUM_CAMPO("12");
            tm205.setR03_COD_REC("810902");
            tm205.setR04_VL_DEBITO(tm200.getR12_VL_CONT_CUM_REC());
            tm200.getRm205().put("12", tm205);
          }
          if (tm200.getR08_VL_CONT_NC_REC().compareTo(BigDecimal.ZERO) > 0) {
            SPEDContribM205 tm205 = new SPEDContribM205(sped);
            tm205.setR02_NUM_CAMPO("08");
            tm205.setR03_COD_REC("691201");
            tm205.setR04_VL_DEBITO(tm200.getR08_VL_CONT_NC_REC());
            tm200.getRm205().put("08", tm205);
          }
        }
      }

      final SPEDContribM600 tm600 = tm001.getRm600();
      if (tm600 != null) {
        for (SPEDContribM610 tm610 : tm600.getRm610().values()) {
          // Totaliza o Registro R13
          BigDecimal tot = tm610.getR11_VL_CONT_APUR();
          if (tm610.getR12_VL_AJUS_ACRES() != null) tot = tot.add(tm610.getR12_VL_AJUS_ACRES());
          if (tm610.getR13_VL_AJUS_REDUC() != null) tot = tot.subtract(tm610.getR13_VL_AJUS_REDUC());
          if (tm610.getR14_VL_CONT_DIFER() != null) tot = tot.subtract(tm610.getR14_VL_CONT_DIFER());
          if (tm610.getR15_VL_CONT_DIFER_ANT() != null) tot = tot.subtract(tm610.getR15_VL_CONT_DIFER_ANT());
          tm610.setR16_VL_CONT_PER(tot);

          switch (tm610.getR02_COD_CONT()) {
            case "01":
            case "02":
            case "03":
            case "04":
            case "32":
            case "71":
              tm600.setR02_VL_TOT_CONT_NC_PER(tm600.getR02_VL_TOT_CONT_NC_PER().add(tot));
              break;
            case "31":
              // case "32": //O número 32 está nos dois casos no manual, mas como é pra "vendas à Zona Franca de manaus" simplesmente comentei desse lado até descobrir melhor o que fazer
            case "51":
            case "52":
            case "54":
            case "72":
              tm600.setR09_VL_TOT_CONT_CUM_PER(tm600.getR02_VL_TOT_CONT_NC_PER().add(tot));
              break;
          }
        }

        tm600.setR05_VL_TOT_CONT_NC_DEV(tm600.getR02_VL_TOT_CONT_NC_PER().subtract(tm600.getR03_VL_TOT_CRED_DESC()).subtract(tm600.getR04_VL_TOT_CRED_DESC_ANT()));
        tm600.setR08_VL_CONT_NC_REC(tm600.getR05_VL_TOT_CONT_NC_DEV().subtract(tm600.getR06_VL_RET_NC()).subtract(tm600.getR07_VL_OUT_DED_NC()));
        tm600.setR12_VL_CONT_CUM_REC(tm600.getR09_VL_TOT_CONT_CUM_PER().subtract(tm600.getR10_VL_RET_CUM()).subtract(tm600.getR11_VL_OUT_DED_CUM()));
        tm600.setR13_VL_TOT_CONT_REC(tm600.getR08_VL_CONT_NC_REC().add(tm600.getR12_VL_CONT_CUM_REC()));

        { // =======> REGISTRO M205: CONTRIBUIÇÃO PARA O PIS/PASEP A RECOLHER – DETALHAMENTO POR CÓDIGO DE RECEITA
          // Cria os registro M205 dependendo dos valores definidos no M200
          if (tm600.getR12_VL_CONT_CUM_REC().compareTo(BigDecimal.ZERO) > 0) {
            SPEDContribM605 tm605 = new SPEDContribM605(sped);
            tm605.setR02_NUM_CAMPO("12");
            tm605.setR03_COD_REC("217201");
            tm605.setR04_VL_DEBITO(tm600.getR12_VL_CONT_CUM_REC());
            tm600.getRm605().put("12", tm605);
          }
          if (tm600.getR08_VL_CONT_NC_REC().compareTo(BigDecimal.ZERO) > 0) {
            SPEDContribM605 tm605 = new SPEDContribM605(sped);
            tm605.setR02_NUM_CAMPO("08");
            tm605.setR03_COD_REC("585601");
            tm605.setR04_VL_DEBITO(tm600.getR08_VL_CONT_NC_REC());
            tm600.getRm605().put("08", tm605);
          }
        }
      }
    }

    // Atualiza as contagens de linhas por bloco no fim do método porque criamos novos blocos (como o M205) neste método
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
   * @param sped
   * @throws RFWException
   */
  public static void updateCloseRegistersLineCount(SPEDContribFile sped) throws RFWException {
    int totalfile = 0;
    int block = 0;

    // Bloco 0
    if (sped.getR0001() == null) SPEDContribBuilder.make0001(sped, false);
    if (sped.getR0990() == null) SPEDContribBuilder.make0990(sped, 0);
    totalfile += block = sped.getR0001().countRegisters() + 2; // Soma o registo de fechamento que não está incluso + Soma 1 porque o registro 0000 faz parte deste total
    sped.getR0990().setR02_QTD_LIN_0(block);

    // Bloco A
    if (sped.getRA001() == null) SPEDContribBuilder.makeA001(sped, false);
    if (sped.getRA990() == null) SPEDContribBuilder.makeA990(sped, 0);
    totalfile += block = sped.getRA001().countRegisters() + 1; // Soma o registo de fechamento que não está incluso
    sped.getRA990().setR02_QTD_LIN_A(block);

    // Bloco C
    if (sped.getRC001() == null) SPEDContribBuilder.makeC001(sped, false);
    if (sped.getRC990() == null) SPEDContribBuilder.makeC990(sped, 0);
    totalfile += block = sped.getRC001().countRegisters() + 1; // Soma o registo de fechamento que não está incluso
    sped.getRC990().setR02_QTD_LIN_C(block);

    // Bloco D
    if (sped.getRD001() == null) SPEDContribBuilder.makeD001(sped, false);
    if (sped.getRD990() == null) SPEDContribBuilder.makeD990(sped, 0);
    totalfile += block = sped.getRD001().countRegisters() + 1; // Soma o registo de fechamento que não está incluso
    sped.getRD990().setR02_QTD_LIN_D(block);

    // Bloco F
    if (sped.getRF001() == null) SPEDContribBuilder.makeF001(sped, false);
    if (sped.getRF990() == null) SPEDContribBuilder.makeF990(sped, 0);
    totalfile += block = sped.getRF001().countRegisters() + 1; // Soma o registo de fechamento que não está incluso
    sped.getRF990().setR02_QTD_LIN_F(block);

    // Bloco I
    if (sped.getRI001() == null) SPEDContribBuilder.makeI001(sped, false);
    if (sped.getRI990() == null) SPEDContribBuilder.makeI990(sped, 0);
    totalfile += block = sped.getRI001().countRegisters() + 1; // Soma o registo de fechamento que não está incluso
    sped.getRI990().setR02_QTD_LIN_I(block);

    // Bloco M
    if (sped.getRM001() == null) SPEDContribBuilder.makeM001(sped, false);
    if (sped.getRM990() == null) SPEDContribBuilder.makeM990(sped, 0);
    totalfile += block = sped.getRM001().countRegisters() + 1; // Soma o registo de fechamento que não está incluso
    sped.getRM990().setR02_QTD_LIN_M(block);

    // Bloco P
    if (sped.getRP001() == null) SPEDContribBuilder.makeP001(sped, false);
    if (sped.getRP990() == null) SPEDContribBuilder.makeP990(sped, 0);
    totalfile += block = sped.getRP001().countRegisters() + 1; // Soma o registo de fechamento que não está incluso
    sped.getRP990().setR02_QTD_LIN_P(block);

    // Bloco 1
    if (sped.getR1001() == null) SPEDContribBuilder.make1001(sped, false);
    if (sped.getR1990() == null) SPEDContribBuilder.make1990(sped, 0);
    totalfile += block = sped.getR1001().countRegisters() + 1; // Soma o registo de fechamento que não está incluso
    sped.getR1990().setR02_QTD_LIN_1(block);

    // ENCERRAMENTO DO ARQUIVO - Cria o registro para que seja contabilizado no bloco 9, mas só o atualiza no final, depois que o bloco 9 for escrito.
    if (sped.getR9999() == null) SPEDContribBuilder.make9999(sped, 0);

    // Bloco 9
    if (sped.getR9990() == null) SPEDContribBuilder.make9990(sped, 0); // Cria o fechamento antes para que seja contabilizado no método abaixo
    SPEDContribBuilder.make9001(sped); // Cria o bloco 9 sobre todos os registros criados

    totalfile += block = sped.getR9001().countRegisters() + 2; // Soma o registo de fechamento do bloco "9990" que não está incluso. E soma o "9999" segundo o manual: "... Para este cálculo, o registro 9999, apesar de não pertencer ao Bloco 9, também deve ser contabilizado nesta soma."
    sped.getR9990().setR02_QTD_LIN_9(block);

    // ENCERRAMENTO DO ARQUIVO - atualização do conteúdo
    sped.getR9999().setR02_QTD_LIN(totalfile);
  }
}
