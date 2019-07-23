package com.grinfelds;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(2);
        printNumberInWord(8);
        System.out.println(getDaysInMonth(2,1924));
    }

    private static void printDayOfTheWeek(int day) {

        switch (day) {

            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thu");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            default:
                System.out.println("Invalid Value");
        }

    }

    // Exercise 12

    public static void printNumberInWord(int number) {

        switch (number) {

            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }

    }

    // Exercise 13

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;
            }
            return false;

        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1  || month > 12 || year < 1 || year > 9999) {
            return -1;
        } else {


            switch (month) {

                case 1:
                   return 31;

                case 2:
                    if (isLeapYear(year) == true) {
                        return 29;
                    } else {
                        return 28;
                    }

                case 3:
                    return 31;

                case 4:
                    return 30;

                case 5:
                    return 31;

                case 6:
                    return 30;

                case 7:
                    return 31;

                case 8:
                    return 31;

                case 9:
                    return 30;

                case 10:
                    return 31;

                case 11:
                    return 30;

                case 12:
                    return 31;

                default:
                    return -1;
            }

        }
    }
}


