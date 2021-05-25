package com.company;

import com.company.question.Question;
import com.company.question.mupltiplechoice.MultipleChoice;
import com.company.question.trueorfalse.TrueOrFalse;
import com.company.quiz.Quiz;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class QuizRunner {

    public static void main(String[] args) {

        TrueOrFalse q1 = new TrueOrFalse(101);
        q1.setPrompt("My day is going well?");
        q1.setAnswer("false");

        MultipleChoice q2 = new MultipleChoice(102, "In what year was I born?");
 //       q2.setPrompt("In what year was I born?");
        q2.setPossibleAnswers("1948");
        q2.setPossibleAnswers("1984");
        q2.setPossibleAnswers("2004");
        q2.setPossibleAnswers("The dawn of time?");
        q2.setAnswer("1984");

        ArrayList<Question> listOfQuestions = new ArrayList<>(asList(q1, q2));

        Quiz jeopardy = new Quiz(1, listOfQuestions);

        jeopardy.askQuestions();
    }
}
