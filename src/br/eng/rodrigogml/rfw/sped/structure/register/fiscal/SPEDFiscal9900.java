package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.lang.reflect.Method;

import br.eng.rodrigogml.rfw.kernel.exceptions.RFWCriticalException;
import br.eng.rodrigogml.rfw.kernel.exceptions.RFWException;
import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFiscalFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO 9900: REGISTROS DO ARQUIVO.<br>
 *
 * @author Rodrigo Leitão
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscal9900 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscal9900(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * 02 REG_BLC Registro que será totalizado no próximo campo. C 004 - O
   */
  @SPEDField(maxLength = 4, minLength = 4)
  private String r02_REG_BLC = null;

  /**
   * 03 QTD_REG_BLC Total de registros do tipo informado no campo anterior. N - - O
   */
  @SPEDField(maxLength = 255)
  private Integer r03_QTD_REG_BLC_AUTO = null;

  @Override
  public String get01_Register() {
    return "9900";
  }

  /**
   * Recupera o 02 REG_BLC Registro que será totalizado no próximo campo. C 004 - O.
   *
   * @return the 02 REG_BLC Registro que será totalizado no próximo campo
   */
  public String getR02_REG_BLC() {
    return r02_REG_BLC;
  }

  /**
   * Define o 02 REG_BLC Registro que será totalizado no próximo campo. C 004 - O.
   *
   * @param r02_REG_BLC the new 02 REG_BLC Registro que será totalizado no próximo campo
   */
  public void setR02_REG_BLC(String r02_REG_BLC) {
    this.r02_REG_BLC = r02_REG_BLC;
  }

  /**
   * Recupera o 03 QTD_REG_BLC Total de registros do tipo informado no campo anterior. N - - O.
   *
   * @return the 03 QTD_REG_BLC Total de registros do tipo informado no campo anterior
   */
  public Integer getR03_QTD_REG_BLC_AUTO() {
    return r03_QTD_REG_BLC_AUTO;
  }

  /**
   * Define o 03 QTD_REG_BLC Total de registros do tipo informado no campo anterior. N - - O.
   *
   * @param r03_QTD_REG_BLC the new 03 QTD_REG_BLC Total de registros do tipo informado no campo anterior
   */
  public void setR03_QTD_REG_BLC_AUTO(Integer r03_QTD_REG_BLC) {
    this.r03_QTD_REG_BLC_AUTO = r03_QTD_REG_BLC;
  }

  @Override
  public void calculate(String uuid) throws RFWException {
    try {
      if (uuid == null || !uuid.equals(this.getLastUUID())) { // Se UUID recebido for diferente da última rodada de cálculo, devemos realizar os cálculos.
        super.calculate(uuid); // Chama o cálculo da classe pai para salvar o UUID e calcular os registros filhos recursivamente
        SPEDFiscalFile file = (SPEDFiscalFile) this.getSpedFile();
        Method m = SPEDFiscalFile.class.getMethod("getR" + this.getR02_REG_BLC());
        SPEDRegister reg = (SPEDRegister) m.invoke(file);
        int totalRegisters = reg.countRegisters();
        this.r03_QTD_REG_BLC_AUTO = totalRegisters;
      }
    } catch (RFWException e) {
      throw e;
    } catch (Exception e) {
      throw new RFWCriticalException("Falha ao calcular valores automáticos do Registro SPED: ${0} / ${1}", new String[] { this.getClass().getName(), this.getR02_REG_BLC() });
    }
  }

}