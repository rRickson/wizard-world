package com.wizzardworld.hogwarts.demo.model;

import com.wizzardworld.hogwarts.demo.annotations.SchoolSpellValidation;
import org.springframework.validation.annotation.Validated;

@Validated
public class Spells {
    private Integer id;

    @SchoolSpellValidation()
    private String spell;

    private String school;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
