package com.company.collection;

import com.company.models.Answer;

import java.util.Arrays;

public class AnswerList {
    private Answer[] answers = new Answer[0];

    public int size() {
        return answers.length;
    }

    public Answer get(int index) {
        return answers[index];
    }

    public void add(Answer q) {
        answers = Arrays.copyOf(answers, answers.length + 1);
        answers[answers.length - 1] = q;
    }
}
