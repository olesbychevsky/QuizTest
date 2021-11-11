package com.company.models;

import com.company.models.Question;

public class Answer {
    private Question question;
    private int answer;

    public Answer(Question question, int answer) {
        this.question = question;
        this.answer = answer;
    }

    public boolean isCorrect() {
        return question.getCorrectVariant() == answer;
    }

    public String getCorrectAnswer() {
        return question.getCorrectVariant() + ". " + question.getCorrectVariantText();
    }

    public String getQuestionText() {
        return question.getText();
    }
}
