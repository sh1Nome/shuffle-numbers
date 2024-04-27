package com.example.shufflenumbers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class OutputController {

    @GetMapping("output")
    public String getOutput() {
        return "output";
    }
    

}
