package com.repo.tools.annotation;

import com.repo.tools.annotation.handler.EmailValidHandler;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmailValidHandler.class)
public @interface EmailValid {
    Class<?>[] groups() default {};
    String message() default "Invalid email";
    Class<? extends Payload>[] payload() default {};
}
