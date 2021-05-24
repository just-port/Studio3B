package com.company.question.checkbox;

import com.company.question.Question;

import java.util.HashMap;

public class Checkbox extends Question {
    private String prompt;
    HashMap<String, Boolean> answers = new HashMap<>();

    public Checkbox(int questionId) {
        super(questionId);
    }
}
