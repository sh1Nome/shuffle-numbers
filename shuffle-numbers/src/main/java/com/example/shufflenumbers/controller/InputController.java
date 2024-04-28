package com.example.shufflenumbers.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.shufflenumbers.form.InputList;
import com.example.shufflenumbers.form.InputRecord;


@Controller
public class InputController {

    @ModelAttribute
    public InputList setupForm() {
        InputList inputList = new InputList();
        inputList.setRecords(new ArrayList<>());
        InputRecord inputRecord = new InputRecord();
        inputList.getRecords().add(inputRecord);
        return inputList;
    }

    @GetMapping({"/", "input"})
    public String getInput(Model model) {
        return "input";
    }

}
