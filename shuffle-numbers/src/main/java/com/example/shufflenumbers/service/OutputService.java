package com.example.shufflenumbers.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.shufflenumbers.form.InputList;

@Service
public class OutputService {

    /**
     * 章と問題番号をハイフンで繋げたリストを取得する
     * 
     * @param inputList InputList型の変数
     * @return
     */
    public List<String> getQuestionList(InputList inputList) {
        List<String> result = new ArrayList<>();

        inputList.getRecords().forEach((record) -> {
            Optional.ofNullable(record.getQuestion()).ifPresent((question) -> {
                for (int i = 1; i <= question; i++) {
                    String addQuestion = String.valueOf(record.getChapter()) + " - " + i;
                    result.add(addQuestion);
                }
            });
        });

        return result;
    }

}
