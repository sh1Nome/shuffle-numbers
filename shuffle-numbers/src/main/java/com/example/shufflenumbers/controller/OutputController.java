package com.example.shufflenumbers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.shufflenumbers.form.InputList;


@Controller
public class OutputController {

    @GetMapping("output")
    public String getOutput(Model model, InputList inputList) {
        model.addAttribute(inputList);
        return "output";
    }
    

}
