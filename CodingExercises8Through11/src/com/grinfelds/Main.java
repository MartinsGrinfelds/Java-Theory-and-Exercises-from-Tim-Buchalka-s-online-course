package com.grinfelds;

public class Main {

    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(5, 5));
        printYearsAndDays(12345678);
        printEqual(1, 2, 2);
        isCatPlaying(false, 40);
    }

    // Exercise Eight

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }

        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }

        return x * y;
    }

    // Exercise Nine

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long remDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remDays + " d");
        }
    }

    // Exercise Ten

    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        } else {
            if (a == b && b == c) {
                System.out.println("All numbers are equal");
            } else if (a != b && a != c && b != c) {
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
        }
    }

    // Exercise Eleven

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer == false && temperature <= 35 && temperature >=25 ) {
            System.out.println(1);
            return true;
        } else if (summer == true && temperature <=45 && temperature >=25) {
            System.out.println(1);
            return true;
        } else {
            System.out.println(0);
            return false;
        }
    }

}
