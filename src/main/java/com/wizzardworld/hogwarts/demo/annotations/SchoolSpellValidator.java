package com.wizzardworld.hogwarts.demo.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class SchoolSpellValidator implements ConstraintValidator<SchoolSpellValidation, String>
    {
        public boolean isValid(String spell, ConstraintValidatorContext cxt) {
            List list = Arrays.asList(new String[]{"Lumos, Nox"});
            return list.contains(spell);
    }
}
