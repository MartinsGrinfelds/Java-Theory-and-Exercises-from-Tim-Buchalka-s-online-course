package com.grinfelds;

public class Main {

    public static void main(String[] args) {

        printConversion(42);
        printMegaBytesAndKiloBytes(5000);
        shouldWakeUp(false, 6);
        isLeapYear(1924);
        areEqualByThreeDecimalPlaces(0.0,0.0);
        hasEqualSum(1,4,5);
        hasTeen(22,23,34);
        isTeen(12);
    }


    // First exercise

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            return Math.round((1 / 1.609) * kilometersPerHour);
        }
        return -1;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        } else {
            System.out.println("Invalid value");
        }

    }

    //Second exercise

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes >= 0) {
            System.out.println(kiloBytes + " KB = " + (kiloBytes / 1024) + " MB and " + (kiloBytes % 1024) + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }

    // Third exercise

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (barking == true && ((hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay > 22 && hourOfDay <= 23))) {
            System.out.println(1);
            return true;

        }
        System.out.println(0);
        return false;
    }

    // Fourth exercise

    public static boolean isLeapYear(int year) {

        if ((year >= 1 && year <= 9999) && ((year % 4) == 0)) {
            if ((year % 100) == 0) {
                if ((year % 400) == 0) {
                    System.out.println(1);
                    return true;
                }
                System.out.println(0);
                return false;
            }
            System.out.println(1);
            return true;
        }
        System.out.println(0);
        return false;
    }

    //Fifth exercise

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        if ((int)(first * 1000) == (int)(second * 1000)) {
            System.out.println(1);
            return true;
        }
        System.out.println(0);
        return false;
    }

    // Sixth exercise

    public static boolean hasEqualSum(int one, int two, int three) {

        if ((one + two) == three) {
            System.out.println(1);
            return true;
        }
        System.out.println(0);
        return false;

    }

    // Seventh exercise

    public static boolean hasTeen(int one, int two, int three) {

        if ((one >=13 && one <= 19) || (two >=13 && two <= 19) || (three >=13 && three <= 19)) {
            System.out.println(1);
            return true;
        }
        System.out.println(0);
            return false;
    }
    public static boolean isTeen(int one) {

        if ((one >=13 && one <= 19)) {
            System.out.println(1);
            return true;
        }
        System.out.println(0);
        return false;
    }
}
