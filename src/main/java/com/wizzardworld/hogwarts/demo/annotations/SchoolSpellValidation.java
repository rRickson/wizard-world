package com.wizzardworld.hogwarts.demo.annotations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // Type of when it triggers.
@Documented //Part of the contractor
@Constraint(validatedBy = SchoolSpellValidator.class)
public @interface SchoolSpellValidation {

    public String message() default "Your School don't have access to this magic";
    //represents group of constraints
    public Class<?>[] groups() default {};
    // payload?
    public Class<? extends Payload>[] payload() default {};

}
