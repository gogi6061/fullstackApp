package com.amiriskhakov.spring.fullstackapp.annotations;

import com.amiriskhakov.spring.fullstackapp.validations.EmailValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import javax.ejb.DependsOn;
import javax.persistence.SecondaryTable;
import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.FIELD,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmailValidator.class )
@Documented
public @interface ValidEmail {
    String message() default "Invalid Email";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
