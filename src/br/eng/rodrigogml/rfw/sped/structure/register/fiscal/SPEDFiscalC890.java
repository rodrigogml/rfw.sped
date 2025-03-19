package br.eng.rodrigogml.rfw.sped.structure.register.fiscal;

import java.math.BigDecimal;

import br.eng.rodrigogml.rfw.sped.structure.annotation.SPEDField;
import br.eng.rodrigogml.rfw.sped.structure.file.SPEDFile;
import br.eng.rodrigogml.rfw.sped.structure.register.SPEDRegister;

/**
 * Description: REGISTRO C890: RESUMO DI�RIO DO CF-E-SAT (C�DIGO 59) POR EQUIPAMENTO SAT-CF-E.<br>
 *
 * @author Rodrigo Leit�o
 * @since 10.0 (22 de jul. de 2023)
 */
public class SPEDFiscalC890 extends SPEDRegister {

  private static final long serialVersionUID = 6202927272082549003L;

  public SPEDFiscalC890(SPEDFile spedFile) {
    super(spedFile);
  }

  /**
   * C�digo da Situa��o Tribut�ria, conforme a Tabela indicada no item 4.3.1 N 003 - O
   */
  @SPEDField(maxLength = 3, minLength = 3, required = true)
  private String r02_CST_ICMS = null;

  /**
   * C�digo Fiscal de Opera��o e Presta��o do agrupamento de itens N 004 - O
   */
  @SPEDField(maxLength = 4, minLength = 4, required = true)
  private String r03_CFOP = null;

  /**
   * Al�quota do ICMS N 006 02 OC
   */
  @SPEDField(maxLength = 6, decimals = 2, required = true)
  private BigDecimal r04_ALIQ_ICMS = null;

  /**
   * �Valor total do CF-e� na combina��o de CST_ICMS, CFOP e AL�QUOTA DO ICMS, correspondente ao somat�rio do valor l�quido dos itens. N - 02 O
   */
  @SPEDField(required = true, decimals = 2, maxLength = 10)
  private BigDecimal r05_VL_OPR = null;

  /**
   * Valor acumulado da base de c�lculo do ICMS, referente � combina��o de CST_ICMS, CFOP e AL�QUOTA DO ICMS. N - 2 O
   */
  @SPEDField(required = true, decimals = 2, maxLength = 10)
  private BigDecimal r06_VL_BC_ICMS = null;

  /**
   * Parcela correspondente ao "Valor do ICMS" referente � combina��o de CST_ICMS, CFOP e al�quota do ICMS. N - 02 O
   */
  @SPEDField(decimals = 2, required = true, maxLength = 10)
  private BigDecimal r07_VL_ICMS = null;

  /**
   * C�digo da observa��o do lan�amento fiscal (campo 02 do registro 0460) C 006 - OC
   */
  @SPEDField(maxLength = 6, required = false)
  private String r08_COD_OBS = null;

  @Override
  public String get01_Register() {
    return "C890";
  }

  /**
   * Recupera o c�digo da Situa��o Tribut�ria, conforme a Tabela indicada no item 4.3.1 N 003 - O.
   *
   * @return the c�digo da Situa��o Tribut�ria, conforme a Tabela indicada no item 4
   */
  public String getR02_CST_ICMS() {
    return r02_CST_ICMS;
  }

  /**
   * Define o c�digo da Situa��o Tribut�ria, conforme a Tabela indicada no item 4.3.1 N 003 - O.
   *
   * @param r02_CST_ICMS the new c�digo da Situa��o Tribut�ria, conforme a Tabela indicada no item 4
   */
  public void setR02_CST_ICMS(String r02_CST_ICMS) {
    this.r02_CST_ICMS = r02_CST_ICMS;
  }

  /**
   * Recupera o c�digo Fiscal de Opera��o e Presta��o do agrupamento de itens N 004 - O.
   *
   * @return the c�digo Fiscal de Opera��o e Presta��o do agrupamento de itens N 004 - O
   */
  public String getR03_CFOP() {
    return r03_CFOP;
  }

  /**
   * Define o c�digo Fiscal de Opera��o e Presta��o do agrupamento de itens N 004 - O.
   *
   * @param r03_CFOP the new c�digo Fiscal de Opera��o e Presta��o do agrupamento de itens N 004 - O
   */
  public void setR03_CFOP(String r03_CFOP) {
    this.r03_CFOP = r03_CFOP;
  }

  /**
   * Recupera o al�quota do ICMS N 006 02 OC.
   *
   * @return the al�quota do ICMS N 006 02 OC
   */
  public BigDecimal getR04_ALIQ_ICMS() {
    return r04_ALIQ_ICMS;
  }

  /**
   * Define o al�quota do ICMS N 006 02 OC.
   *
   * @param r04_ALIQ_ICMS the new al�quota do ICMS N 006 02 OC
   */
  public void setR04_ALIQ_ICMS(BigDecimal r04_ALIQ_ICMS) {
    this.r04_ALIQ_ICMS = r04_ALIQ_ICMS;
  }

  /**
   * Recupera o �Valor total do CF-e� na combina��o de CST_ICMS, CFOP e AL�QUOTA DO ICMS, correspondente ao somat�rio do valor l�quido dos itens. N - 02 O.
   *
   * @return the �Valor total do CF-e� na combina��o de CST_ICMS, CFOP e AL�QUOTA DO ICMS, correspondente ao somat�rio do valor l�quido dos itens
   */
  public BigDecimal getR05_VL_OPR() {
    return r05_VL_OPR;
  }

  /**
   * Define o �Valor total do CF-e� na combina��o de CST_ICMS, CFOP e AL�QUOTA DO ICMS, correspondente ao somat�rio do valor l�quido dos itens. N - 02 O.
   *
   * @param r05_VL_OPR the new �Valor total do CF-e� na combina��o de CST_ICMS, CFOP e AL�QUOTA DO ICMS, correspondente ao somat�rio do valor l�quido dos itens
   */
  public void setR05_VL_OPR(BigDecimal r05_VL_OPR) {
    this.r05_VL_OPR = r05_VL_OPR;
  }

  /**
   * Recupera o valor acumulado da base de c�lculo do ICMS, referente � combina��o de CST_ICMS, CFOP e AL�QUOTA DO ICMS. N - 2 O.
   *
   * @return the valor acumulado da base de c�lculo do ICMS, referente � combina��o de CST_ICMS, CFOP e AL�QUOTA DO ICMS
   */
  public BigDecimal getR06_VL_BC_ICMS() {
    return r06_VL_BC_ICMS;
  }

  /**
   * Define o valor acumulado da base de c�lculo do ICMS, referente � combina��o de CST_ICMS, CFOP e AL�QUOTA DO ICMS. N - 2 O.
   *
   * @param r06_VL_BC_ICMS the new valor acumulado da base de c�lculo do ICMS, referente � combina��o de CST_ICMS, CFOP e AL�QUOTA DO ICMS
   */
  public void setR06_VL_BC_ICMS(BigDecimal r06_VL_BC_ICMS) {
    this.r06_VL_BC_ICMS = r06_VL_BC_ICMS;
  }

  /**
   * Recupera o parcela correspondente ao "Valor do ICMS" referente � combina��o de CST_ICMS, CFOP e al�quota do ICMS. N - 02 O.
   *
   * @return the parcela correspondente ao "Valor do ICMS" referente � combina��o de CST_ICMS, CFOP e al�quota do ICMS
   */
  public BigDecimal getR07_VL_ICMS() {
    return r07_VL_ICMS;
  }

  /**
   * Define o parcela correspondente ao "Valor do ICMS" referente � combina��o de CST_ICMS, CFOP e al�quota do ICMS. N - 02 O.
   *
   * @param r07_VL_ICMS the new parcela correspondente ao "Valor do ICMS" referente � combina��o de CST_ICMS, CFOP e al�quota do ICMS
   */
  public void setR07_VL_ICMS(BigDecimal r07_VL_ICMS) {
    this.r07_VL_ICMS = r07_VL_ICMS;
  }

  /**
   * Recupera o c�digo da observa��o do lan�amento fiscal (campo 02 do registro 0460) C 006 - OC.
   *
   * @return the c�digo da observa��o do lan�amento fiscal (campo 02 do registro 0460) C 006 - OC
   */
  public String getR08_COD_OBS() {
    return r08_COD_OBS;
  }

  /**
   * Define o c�digo da observa��o do lan�amento fiscal (campo 02 do registro 0460) C 006 - OC.
   *
   * @param r08_COD_OBS the new c�digo da observa��o do lan�amento fiscal (campo 02 do registro 0460) C 006 - OC
   */
  public void setR08_COD_OBS(String r08_COD_OBS) {
    this.r08_COD_OBS = r08_COD_OBS;
  }

}