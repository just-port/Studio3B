package com.company.question.trueorfalse;

public class TrueOrFalse {
    private final int questionId;
    private String prompt;
    private boolean answer;

    public TrueOrFalse(int questionId, String prompt, boolean answer) {
        this.questionId = questionId;
        this.prompt = prompt;
        this.answer = answer;
    }

    public int getQuestionId() {
        return questionId;
    }

    public String getPrompt() {
        return prompt;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setPrompt(String aPrompt) {
        prompt = aPrompt;
    }

    public void setAnswer(boolean anAnswer) {
        answer = anAnswer;
    }
}
