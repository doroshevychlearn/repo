package com.repo.tools.annotation.handler;

import com.repo.tools.annotation.EmailValid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import static java.util.Objects.nonNull;


public class EmailValidHandler implements ConstraintValidator<EmailValid, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        boolean result;
        if(nonNull(s) && s.length() > 0 && s.contains("@") && s.contains(".")){
            result = true;
        }else{
            throw new IllegalArgumentException(constraintValidatorContext.getDefaultConstraintMessageTemplate());
        }
        return result;
    }

    @Override
    public void initialize(EmailValid constraintAnnotation) {

    }
}
