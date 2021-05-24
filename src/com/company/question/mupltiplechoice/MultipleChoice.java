package com.company.question.mupltiplechoice;

import com.company.question.Question;

import java.util.HashMap;

public class MultipleChoice extends Question {
    private String prompt;
    private HashMap<String, Boolean> answers = new HashMap<>();

    public MultipleChoice(int questionId) {
        super(questionId);
    }
    public void setAnswers(String answer, boolean isCorrect) {
        answers.put(answer, isCorrect);
    }
}
