package br.eng.rodrigogml.rfw.sped.structure.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description: Annotation usada para definir os atirbutos de validação dos campos do arquivo de SPED para automação dos métodos de escrita e parser do arquivo.<br>
 *
 * @author Rodrigo Leitão
 * @since 7.1.0 (07/02/2016)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface SPEDField {

  public static enum SPEDFIELDTYPE {
    NONE, CNPJ, CPF, EMAIL, IE, UF, CNPJCPF
  }

  SPEDFIELDTYPE type() default SPEDFIELDTYPE.NONE;

  int maxLength();

  int minLength() default -1;

  int decimals() default -1;

  boolean required() default true;

}
