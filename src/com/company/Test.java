package com.company;

import java.util.Scanner;

public class Test {

    private static int MAX_MARK = 100;
    QuestionList questionList;
    AnswerList answerList = new AnswerList();
    Scanner sc;

    public Test(QuestionList questionList, Scanner sc) {
        this.questionList = questionList;
        this.sc = sc;
    }

    private void makeExame() {
        for (int i = 0; i < questionList.size(); i++) {
            System.out.println((i + 1) + "." + questionList.get(i));
            System.out.print("Enter your choice: ");
            int ans = sc.nextInt();
            answerList.add(new Answer(questionList.get(i), ans));
        }
    }

    private void showResult() {
        int countOfCorrect = 0;
        for (int i = 0; i < answerList.size(); i++) {
            Answer answer = answerList.get(i);
            if (answer.isCorrect()) countOfCorrect++;
            else {
                System.out.println("Incorrect answer:");
                System.out.println(answer.getQuestionText());
                System.out.println("Correct answer: " + answer.getCorrectAnswer());
            }
        }
        double mark = calculateMark(countOfCorrect);
        System.out.printf("Mark: %.1f ", mark);
    }

    private double calculateMark(int countOfCorrect) {
        double parts = ((double) countOfCorrect) / questionList.size();
        return parts * MAX_MARK;
    }

    private void reset() {
        answerList = new AnswerList();
    }

    public void run() {
        makeExame();
        showResult();
        reset();
    }


}
