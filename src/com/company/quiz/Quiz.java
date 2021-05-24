package com.company.quiz;

import com.company.question.Question;

import java.util.ArrayList;

public class Quiz {
    private final int quizId;
    ArrayList<Question> questions;

    public Quiz(int id, ArrayList<Question> questionArrayList) {
        this.quizId = id;
        this.questions = questionArrayList;
    }

    public void addQuestion(Question aQuestion) {
        questions.add(aQuestion);
    }

    public void addMultipleQuestions(ArrayList<Question> questionArrayList) {
        questions.addAll(questionArrayList);
    }

    public int getQuizId() {
        return quizId;
    }
}
