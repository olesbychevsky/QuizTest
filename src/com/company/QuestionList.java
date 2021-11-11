package com.company;

import java.util.Arrays;

public class QuestionList {
    private Question[] questions = new Question[0];

    public int size() {
        return questions.length;
    }

    public Question get(int index) {
        return questions[index];
    }

    public void add(Question q) {
        questions = Arrays.copyOf(questions, questions.length + 1);
        questions[questions.length - 1] = q;
    }
}
