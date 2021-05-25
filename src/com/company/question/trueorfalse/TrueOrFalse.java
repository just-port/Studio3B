package com.company.question.trueorfalse;

import com.company.question.Question;

import static java.lang.String.valueOf;

public class TrueOrFalse extends Question {
    private int questionId;
    private String prompt;
    private boolean answer;

    public TrueOrFalse(int aQuestionId) {
        super(aQuestionId);
    }

    @Override
    public void setAnswer(String anAnswer) {
        answer = Boolean.getBoolean(anAnswer);
    }

    @Override
    public String getAnswer() {
        return valueOf(answer);
    }
}
