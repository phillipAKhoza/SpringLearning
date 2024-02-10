package com.phillip_dev.markssubmittionproj;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ScoreValidator implements ConstraintValidator<Score, Integer> {
    
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        if(value <=100 && value>=0){
            return true;
        }
        return false;
    }
}
