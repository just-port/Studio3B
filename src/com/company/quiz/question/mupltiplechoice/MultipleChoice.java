package com.company.quiz.question.mupltiplechoice;

import java.util.ArrayList;

public class MultipleChoice {
    private final int questionId;
    private String prompt;
    private ArrayList<String> answers;

    public MultipleChoice(int questionId, String prompt, ArrayList<String> answers) {
        this.questionId = questionId;
        this.prompt = prompt;
        this.answers = answers;
    }

    public int getQuestionId() {
        return questionId;
    }

    public String getPrompt() {
        return prompt;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setPrompt(String aPrompt) {
        prompt = aPrompt;
    }

    public void setAnswers(ArrayList<String> someAnswers) {
        answers = someAnswers;
    }
}
