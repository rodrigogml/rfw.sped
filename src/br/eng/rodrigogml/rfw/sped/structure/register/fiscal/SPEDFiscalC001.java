package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.util.LinkedHashMap;

import br.eng.rodrigogml.rfw.kernel.exceptions.RFWException;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C001: ABERTURA DO BLOCO C.<br>
 *
 * @author Rodrigo Leit�o
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalC001 extends SPEDRegister {

  private static final long serialVersionUID = -3626025977953151576L;

  public SPEDFiscalC001(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * REGISTRO C100: NOTA FISCAL (C�DIGO 01), NOTA FISCAL AVULSA (C�DIGO 1B), NOTA FISCAL DE PRODUTOR (C�DIGO 04), NF-e (C�DIGO 55) e NFC-e (C�DIGO 65)<br>
   * Chave: "|" + R05_COD_MOD + "|" R04_COD_PART + "|" + R08_NUM_DOC + "|" + R09_CHV_NFE + "|".
   */
  private final LinkedHashMap<String, SPEDFiscalC100> rc100 = new LinkedHashMap<String, SPEDFiscalC100>();

  /**
   * REGISTRO C400: EQUIPAMENTO ECF (C�DIGO 02, 2D e 60)<br>
   * Chave: COD_MOD, ECF_MOD e ECF_FAB. Separados por "|".
   */
  private final LinkedHashMap<String, SPEDFiscalC400> rc400 = new LinkedHashMap<String, SPEDFiscalC400>();

  /**
   * REGISTRO C800: CUPOM FISCAL ELETR�NICO � SAT (CF-E-SAT) (C�DIGO 59)<br>
   * Chave: COD_SIT + NUM_CFE + NUM_SAT + DT_DOC. Separados por "|". Para cupons cancelados REG, COD_MOD, COD_SIT, NUM_CFE, NR_SAT e CHV_CFE.
   */
  private final LinkedHashMap<String, SPEDFiscalC800> rc800 = new LinkedHashMap<String, SPEDFiscalC800>();

  /**
   * REGISTRO C860: IDENTIFICA��O DO EQUIPAMENTO SAT-CF-E<br>
   * Chave: NR_SAT. O registro c860 � �nico por equipamento por isso a chave � apenas o n�mero de s�rie do equipamento.
   */
  private final LinkedHashMap<String, SPEDFiscalC860> rc860 = new LinkedHashMap<String, SPEDFiscalC860>();

  /**
   * 02 IND_MOV Indicador de movimento:<br>
   * 0- Bloco com dados informados;<br>
   * 1- Bloco sem dados informados.<Br>
   * N 001 - O
   */
  @SPEDField(maxLength = 1, minLength = 1)
  private String r02_IND_MOV_AUTO = null;

  @Override
  public String get01_Register() {
    return "C001";
  }

  /**
   * Recupera o 02 IND_MOV Indicador de movimento:<br>
   * 0- Bloco com dados informados;<br>
   * 1- Bloco sem dados informados.<Br>
   * N 001 - O.
   *
   * @return the 02 IND_MOV Indicador de movimento:<br>
   *         0- Bloco com dados informados;<br>
   *         1- Bloco sem dados informados
   */
  public String getR02_IND_MOV_AUTO() {
    return r02_IND_MOV_AUTO;
  }

  /**
   * Define o 02 IND_MOV Indicador de movimento:<br>
   * 0- Bloco com dados informados;<br>
   * 1- Bloco sem dados informados.<Br>
   * N 001 - O.
   *
   * @param r02_IND_MOV the new 02 IND_MOV Indicador de movimento:<br>
   *          0- Bloco com dados informados;<br>
   *          1- Bloco sem dados informados
   */
  public void setR02_IND_MOV_AUTO(String r02_IND_MOV) {
    this.r02_IND_MOV_AUTO = r02_IND_MOV;
  }

  /**
   * Recupera o rEGISTRO C100: NOTA FISCAL (C�DIGO 01), NOTA FISCAL AVULSA (C�DIGO 1B), NOTA FISCAL DE PRODUTOR (C�DIGO 04), NF-e (C�DIGO 55) e NFC-e (C�DIGO 65)<br>
   * Chave: Para NFe: CHV_NFE. Separados por "|".
   *
   * @return the rEGISTRO C100: NOTA FISCAL (C�DIGO 01), NOTA FISCAL AVULSA (C�DIGO 1B), NOTA FISCAL DE PRODUTOR (C�DIGO 04), NF-e (C�DIGO 55) e NFC-e (C�DIGO 65)<br>
   *         Chave: Para NFe: CHV_NFE
   */
  public LinkedHashMap<String, SPEDFiscalC100> getRc100() {
    return rc100;
  }

  /**
   * Recupera o rEGISTRO C400: EQUIPAMENTO ECF (C�DIGO 02, 2D e 60)<br>
   * Chave: COD_MOD, ECF_MOD e ECF_FAB. Separados por "|".
   *
   * @return the rEGISTRO C400: EQUIPAMENTO ECF (C�DIGO 02, 2D e 60)<br>
   *         Chave: COD_MOD, ECF_MOD e ECF_FAB
   */
  public LinkedHashMap<String, SPEDFiscalC400> getRc400() {
    return rc400;
  }

  /**
   * Recupera o rEGISTRO C800: CUPOM FISCAL ELETR�NICO � SAT (CF-E-SAT) (C�DIGO 59)<br>
   * Chave: COD_SIT + NUM_CFE + NUM_SAT + DT_DOC. Separados por "|". Para cupons cancelados REG, COD_MOD, COD_SIT, NUM_CFE, NR_SAT e CHV_CFE.
   *
   * @return the rEGISTRO C800: CUPOM FISCAL ELETR�NICO � SAT (CF-E-SAT) (C�DIGO 59)<br>
   *         Chave: COD_SIT + NUM_CFE + NUM_SAT + DT_DOC
   */
  public LinkedHashMap<String, SPEDFiscalC800> getRc800() {
    return rc800;
  }

  /**
   * Recupera o rEGISTRO C860: IDENTIFICA��O DO EQUIPAMENTO SAT-CF-E<br>
   * Chave: NR_SAT. O registro c860 � �nico por equipamento por isso a chave � apenas o n�mero de s�rie do equipamento.
   *
   * @return the rEGISTRO C860: IDENTIFICA��O DO EQUIPAMENTO SAT-CF-E<br>
   *         Chave: NR_SAT
   */
  public LinkedHashMap<String, SPEDFiscalC860> getRc860() {
    return rc860;
  }

  @Override
  public void calculate(String uuid) throws RFWException {
    if (uuid == null || !uuid.equals(this.getLastUUID())) {
      super.calculate(uuid);
      // Verifica se h� conte�do nos registros
      boolean hasContent = !rc100.isEmpty() ||
          !rc400.isEmpty() ||
          !rc800.isEmpty() ||
          !rc860.isEmpty();
      r02_IND_MOV_AUTO = hasContent ? "0" : "1";
    }
  }
}