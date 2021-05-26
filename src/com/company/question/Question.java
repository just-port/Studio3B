package com.company.question;

public abstract class Question {

    private String prompt;

    public Question(String prompt) {
        this.prompt = prompt;
    }

    public void askQuestion() {
        System.out.println(prompt);
    }

    public abstract void showAnswers();

    public void setPrompt(String aPrompt) {
        prompt = aPrompt;
    }

}
