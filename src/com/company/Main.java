package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QuestionList questionList = new QuestionList();
        AnswerList answerList = new AnswerList();

        questionList.add(new Question("What is the capital of Australia?",
                new String[]{"Bogota", "Minsk", "Canberra", "Nassau"},
                2
        ));

        questionList.add(new Question("What is the capital of Brazil?",
                new String[]{"Canberra", "Minsk", "Brasilia", "Nassau"},
                2
        ));

        questionList.add(new Question("What is the capital of Bahamas?",
                new String[]{"Sofia", "Minsk", "Brasilia", "Nassau"},
                3
        ));

        for (int i = 0; i < questionList.size(); i++) {
            System.out.println((i + 1) + "." + questionList.get(i));
            System.out.print("Enter your choice: ");
            int ans = sc.nextInt();
            answerList.add(new Answer(questionList.get(i), ans));
        }

        int countOfCorrect = 0;
        for (int i = 0; i < answerList.size(); i++) {
            Answer answer = answerList.get(i);
            if (answer.isCorrect()) countOfCorrect++;
            else {
                System.out.println("Incorrect answer!");
                System.out.println(answer.getQuestionText());
                System.out.println("Correct answer: " + answer.getCorrectAnswer());
            }
        }
        System.out.printf("Count of correct answers: %d ", countOfCorrect);

    }
}
