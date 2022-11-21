package com.wizzardworld.hogwarts.demo.controllers;

import com.wizzardworld.hogwarts.demo.model.Spells;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class GreetingsController {

    @PostMapping("/")
    public Spells getSpells(@Valid @RequestBody Spells spell) {
        Spells spellObj = new Spells();
        spellObj.setSpell(spell.getSpell());
        return spellObj;
    }

}
