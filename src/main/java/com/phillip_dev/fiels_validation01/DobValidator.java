package com.phillip_dev.fiels_validation01;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import jakarta.validation.ConstraintValidator;

public class DobValidator implements ConstraintValidator<DOB, Date>{
    public boolean isValid(Date value, jakarta.validation.ConstraintValidatorContext context) {
        long diff = new Date().getTime() - value.getTime();
        int age = (int) (TimeUnit.MILLISECONDS.toDays(diff) / 365);
        return age > 18;
    };
}
