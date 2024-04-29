package com.example.shufflenumbers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.shufflenumbers.form.InputList;


@Controller
public class InputController {

    @ModelAttribute
    public InputList setupForm() {
        return new InputList();
    }

    @GetMapping({"/", "input"})
    public String getInput(Model model) {
        return "input";
    }

}
