package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private String name;
    private ArrayList<Question> questionArrayList;
    private Scanner scanner;

    public Game(String name, ArrayList<Question> questionArrayList) {
        this.name = name;
        this.questionArrayList = questionArrayList;
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println();
        System.out.println("Hi! Let's play a game");
        System.out.println("~ ~ ~ To guess the number just enter <0> if number is lower or <1> if number is higher");
        System.out.println("To win the game, you have to guess 5 times in a row! Good luck ♥");
        System.out.println();

        for(Question q: questionArrayList) {
            if(q.getGen_num()>q.getNum())
                q.setCorrect(1);
            else
                q.setCorrect(0);

            System.out.println(q.getTitle());

            int x = scanner.nextInt();
            if (x==q.getCorrect()){
                System.out.println("YES!");
                Rating.counter++;
            }
            else {
                System.out.println("No. The hidden number was " + q.getGen_num());
                break;
            }
        }
        if(Rating.counter > 4) {
            System.out.println("Congrats! U won");
        } else {
            System.out.println("Unfortunately... You lost :c");
        }

    }

}