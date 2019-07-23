package com.grinfelds;

public class Main {

    public static void main(String[] args) {
	int newScore = calculateScore("Tim", 500);
        System.out.println(newScore);
        calculateScore(500);
        calculateScore();
        double myCentimeters = calcFeetAndInchesToCentimeters(6,1);
        System.out.println(myCentimeters);
        double InchesToCentimeters = calcFeetAndInchesToCentimeters(73);
        System.out.println(InchesToCentimeters);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score );
        return score * 1000;

    }
    public static int calculateScore(int score) {
        System.out.println("UnnamedPlayer " + "scored " + score );
        return score * 1000;

    }
    public static int calculateScore() {
        System.out.println("No name, no score");
        return 0;

    }
    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet >= 0 && inches >= 0 && inches <=12) {
            return 2.54 * (inches + (feet * 12));
        }
        return -1;
    }
    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches >= 0) {
            return 2.54 * inches ;
        }
        return -1;
    }

}
