package com.example.shufflenumbers.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.shufflenumbers.form.InputList;
import com.example.shufflenumbers.service.OutputService;


@Controller
public class OutputController {

    private final OutputService outputService;

    public OutputController(OutputService outputService) {
        this.outputService = outputService;
    }

    @GetMapping("output")
    public String getOutput(Model model, InputList inputList) {
        List<String> questionList = outputService.getQuestionList(inputList);
        Collections.shuffle(questionList);
        model.addAttribute("questionList", questionList);
        return "output";
    }
    

}
