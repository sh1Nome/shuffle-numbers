package com.example.shufflenumbers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class InputController {

    @GetMapping({"/", "input"})
    public String getInput() {
        return "input";
    }

}
