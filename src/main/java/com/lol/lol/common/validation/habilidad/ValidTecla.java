package com.lol.lol.common.validation.habilidad;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TeclaValidator.class)
public @interface ValidTecla {
    String message() default "Tecla incorrecta";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
