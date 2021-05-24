package com.company.question;

public class Question {
    private final int questionId;
    private String prompt;

    public Question(int questionId, String prompt, String answer) {
        this.questionId = questionId;
        this.prompt = prompt;
    }

    public Question(int questionId) {
        this.questionId = questionId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String aPrompt) {
        prompt = aPrompt;
    }
}
