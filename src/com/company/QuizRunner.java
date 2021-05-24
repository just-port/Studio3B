package com.company;

import com.company.question.Question;
import com.company.question.mupltiplechoice.MultipleChoice;
import com.company.question.trueorfalse.TrueOrFalse;
import com.company.quiz.Quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static java.util.Arrays.asList;

public class QuizRunner {

    public static void main(String[] args) {

        TrueOrFalse q1 = new TrueOrFalse(101);
        q1.setPrompt("My day is going well?");
        q1.setAnswer(false);

        MultipleChoice q2 = new MultipleChoice(102);
        q2.setPrompt("In what year was I born?");
        q2.setAnswers("1948", false);
        q2.setAnswers("1984", true);
        q2.setAnswers("2004", false);
        q2.setAnswers("The dawn of time?", false);

        ArrayList<Question> listOfQuestions = new ArrayList<>(asList(q1, q2));

        Quiz jeopardy = new Quiz(1, listOfQuestions);
    }
}
