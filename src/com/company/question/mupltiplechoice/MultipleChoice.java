package com.company.question.mupltiplechoice;

import com.company.question.Question;

import java.util.ArrayList;
import java.util.Arrays;

public class MultipleChoice extends Question {

    private ArrayList<String> possibleAnswers = new ArrayList<>();
    private String answer;

    public MultipleChoice(String aPrompt, String anAnswer) {
        super(aPrompt);
        answer = anAnswer;
    }

    @Override
    public void showAnswers() {
        int i = 0;
        for (String anAnswer : possibleAnswers) {
            System.out.println(i+1 + ". " + anAnswer);
            i++;
        }
    }

    public String getAnswer() {
        return answer;
    }

    public ArrayList<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(String ... someAnswers) {
        possibleAnswers.addAll(Arrays.asList(someAnswers));
    }
}
