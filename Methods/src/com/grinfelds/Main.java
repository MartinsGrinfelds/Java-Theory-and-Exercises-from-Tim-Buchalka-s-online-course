package com.grinfelds;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was = " + highScore);


        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("one", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("two", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("three", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("bobby", position);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {

            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was = " + finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int position) {

        System.out.println(name + " managed to get into position " + position + " on the high score table");

    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }

        return 4;
    }
}
