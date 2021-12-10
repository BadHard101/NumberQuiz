package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Question> questions = new ArrayList<>();
        for (int i = 0; i<5; i++)
        questions.add(new Question());;

        Game game = new Game("Quiz", questions);
        game.start();

    }
}
