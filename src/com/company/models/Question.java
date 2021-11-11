package com.company.models;

public class Question {
    private String text;
    private String[] variants;
    private int correctVariant;

    public Question(String text, String[] variants, int correctVariant) {
        this.text = text;
        this.variants = variants;
        this.correctVariant = correctVariant;

    }

    public String getText() {
        return text;
    }

    public String[] getVariants() {
        return variants;
    }

    public void setVariants(String[] variants) {
        this.variants = variants;
    }

    public int getCorrectVariant() {
        return correctVariant;
    }

    public String getCorrectVariantText() {
        return variants[correctVariant - 1];
    }

    public void setCorrectVariant(int correctVariant) {
        this.correctVariant = correctVariant;
    }

    @Override
    public String toString() {
        String s = text + "\n";
        for (int i = 0; i < variants.length; i++) {
            s += (i + 1) + ". " + variants[i] + "\n";
        }
        return s;
    }
}
