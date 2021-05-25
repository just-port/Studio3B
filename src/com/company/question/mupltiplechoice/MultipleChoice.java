package com.company.question.mupltiplechoice;

import com.company.question.Question;

import java.util.ArrayList;

public class MultipleChoice extends Question {
    private String prompt;
    private ArrayList<String> possibleAnswers = new ArrayList<>();
    private String answer;

    public MultipleChoice(int questionId, String aPrompt) {
        super(questionId);
        prompt = aPrompt;
    }
    public void setPossibleAnswers(String answer) {
        possibleAnswers.add(answer);
    }

    public ArrayList<String> getPossibleAnswers() {
        return possibleAnswers;
    }
}
