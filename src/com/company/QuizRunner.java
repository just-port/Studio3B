package com.company;

import com.company.question.mupltiplechoice.MultipleChoice;
import com.company.question.trueorfalse.TrueOrFalse;
import com.company.quiz.Quiz;


public class QuizRunner {

    public static void main(String[] args) {

        TrueOrFalse q1 = new TrueOrFalse("1 + 1 - 1 = 3", false);

        MultipleChoice q2 = new MultipleChoice("In what year was I born?", "1984");
        q2.setPossibleAnswers("2284", "1984", "1684", "2084");

        TrueOrFalse q3 = new TrueOrFalse("1 = 2", false);
        TrueOrFalse q4 = new TrueOrFalse("1 + 1 = 2", true);

        Quiz jeopardy = new Quiz();

        jeopardy.addQuestions(q1, q2, q3, q4);

        jeopardy.askQuestions();
        jeopardy.gradeQuiz();
    }
}
