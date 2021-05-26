package com.company.quiz;

import com.company.question.Question;
import com.company.question.mupltiplechoice.MultipleChoice;
import com.company.question.trueorfalse.TrueOrFalse;

import java.util.*;

public class Quiz {
    ArrayList<Question> questions = new ArrayList<>();
    List<String> userAnswers = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public void addQuestions(Question ... someQuestions) {
        questions.addAll(Arrays.asList(someQuestions));
    }

    public void askQuestions() {
        for (Question aQuestion : questions) {
            aQuestion.askQuestion();
            aQuestion.showAnswers();
            int userAnswer = in.nextInt();

            if (aQuestion instanceof TrueOrFalse) {
                boolean correctAnswer = ((TrueOrFalse) aQuestion).getAnswer();
                boolean userAnswerBoolean;
                while (userAnswer != 1 && userAnswer != 2) {
                    System.out.println("Please choose 1 for true or 2 for false.");
                    userAnswer = in.nextInt();
                }
                if (userAnswer == 1) {
                    userAnswerBoolean = true;
                    if (correctAnswer) {
                        userAnswers.add("correct");
                    }
                }
                if (userAnswer == 2) {
                    userAnswerBoolean = false;
                    if (!correctAnswer) {
                        userAnswers.add("correct");
                    }
                }
            }

            if (aQuestion instanceof MultipleChoice) {
                int maxAnswerRange = ((MultipleChoice) aQuestion).getPossibleAnswers().size();
                int correctAnswer = ((MultipleChoice) aQuestion).getPossibleAnswers().indexOf(((MultipleChoice) aQuestion).getAnswer());
                while (userAnswer > maxAnswerRange || userAnswer < 0) {
                    System.out.println("Please enter the number associated with your answer");
                    userAnswer = in.nextInt();
                }
                if (userAnswer - 1 == correctAnswer) {
                    userAnswers.add("correct");
                } else {
                    userAnswers.add("incorrect");
                }
            }
        }
        in.close();
    }

    public void gradeQuiz() {
        int correctAnswers = Collections.frequency(userAnswers, "correct");
        int totalNumberOfQuestions = questions.size();

        System.out.println("You answered " + correctAnswers + " correctly out of " + totalNumberOfQuestions + ". Good job?");
    }
}
