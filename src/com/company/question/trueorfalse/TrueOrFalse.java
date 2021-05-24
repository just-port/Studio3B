package com.company.question.trueorfalse;

import com.company.question.Question;

public class TrueOrFalse extends Question {
    private int questionId;
    private String prompt;
    private boolean answer;

    public TrueOrFalse(int aQuestionId) {
        super(aQuestionId);
    }

    public void setAnswer(boolean b) {
        answer = b;
    }

    public boolean getAnswer() {
        return answer;
    }
}
