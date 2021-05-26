package com.company.question.trueorfalse;

import com.company.question.Question;

public class TrueOrFalse extends Question {

    private boolean answer;

    public TrueOrFalse(String prompt, boolean anAnswer) {
        super(prompt);
        answer = anAnswer;
    }

    @Override
    public void showAnswers() {
        System.out.println("1. True\n2. False");
    }

    public void setAnswer(boolean anAnswer) {
        answer = anAnswer;
    }

    public boolean getAnswer() {
        return answer;
    }
}
