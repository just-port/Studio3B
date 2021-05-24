package com.company.question;

public class Question {
    private final int questionId;
    private String prompt;
    private String answer;

    public Question(int questionId, String prompt, String answer) {
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

    public String getAnswer() {
        return answer;
    }

    public void setPrompt(String aPrompt) {
        prompt = aPrompt;
    }

    public void setAnswer(String anAnswer) {
        answer = anAnswer;
    }
}
