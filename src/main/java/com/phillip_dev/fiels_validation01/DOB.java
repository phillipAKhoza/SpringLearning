package com.phillip_dev.fiels_validation01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DobValidator.class)
public @interface DOB {
    String message() default "INVALID AGE";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
