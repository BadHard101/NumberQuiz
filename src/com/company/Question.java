package com.company;

public class Question {

    private int num = (int) (Math.random()*100);
    private int gen_num = (int) (Math.random()*100);
    private int correct;
    private String title = ("Is number higher or lower then " + num + " out of 100?");

    public int getNum() {
        return num;
    }

    public int getGen_num() {
        return gen_num;
    }

    public String getTitle() {
        return title;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public int getCorrect() {
        return correct;
    }
}