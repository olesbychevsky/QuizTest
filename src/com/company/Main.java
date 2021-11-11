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

        Test test = new Test(questionList,sc);
        test.run();

    }
}
