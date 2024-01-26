package com.lol.lol.validation.habilidad;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Objects;

public class TeclaValidator implements ConstraintValidator<ValidTecla, String>{

    @Override
    public void initialize(ValidTecla constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String tecla, ConstraintValidatorContext context) {
        return (tecla.equals("Q") || tecla.equals("W") || tecla.equals("E") || tecla.equals("R") );
    }

}
