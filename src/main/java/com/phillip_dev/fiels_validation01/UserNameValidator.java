package com.phillip_dev.fiels_validation01;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UserNameValidator implements ConstraintValidator<UserName, String>{
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value.matches("$ % # @ ^ *")) return true;
        return false;
    }
}
