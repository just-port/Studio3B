package com.company.quiz;

import com.company.question.Question;
import com.company.question.mupltiplechoice.MultipleChoice;
import com.company.question.trueorfalse.TrueOrFalse;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private final int quizId;
    ArrayList<Question> questions;
    ArrayList<String> userAnswers;

    public Quiz(int id, ArrayList<Question> questionArrayList) {
        this.quizId = id;
        this.questions = questionArrayList;
        userAnswers = new ArrayList<>();
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

    public void askQuestions() {
        int i = 0;
        for (Question aQuestion : questions) {



            if (aQuestion instanceof TrueOrFalse) {
                Scanner in = new Scanner(System.in);
                System.out.println(aQuestion.getPrompt() + "\n1: True\n2: False");
                int userSelection = in.nextInt();

                while (userSelection != 1 && userSelection != 2) {
                    System.out.println("Please choose 1 for true or 2 for false.");
                    userSelection = in.nextInt();
                }

                if (userSelection == 1) {
                    userAnswers.add(i, "true");
                } else {
                    userAnswers.add(i, "false");
                }
            }

            if (aQuestion instanceof MultipleChoice) {
                int numberOfPossibleAnswers = ((MultipleChoice) aQuestion).getPossibleAnswers().size()-1;
                while ()

            }
        }
    }
}
