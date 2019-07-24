package com.grinfelds;

public class Main {

    public static void main(String[] args) {
        System.out.println(isOdd(9));
        System.out.println(sumOdd(10,20));
        System.out.println(isPalindrome(1221));
        System.out.println(sumFirstAndLastDigit(10));
        System.out.println(getEvenDigitSum(6688));
        System.out.println(hasSharedDigit(15,25));
        System.out.println(hasSameLastDigit(156,446,333));
        System.out.println(isValid(500));
    }

    // Exercise 14

    public static boolean isOdd(int number) {
        if (number > 0) {
            if (number % 2 !=0){
                return true;
            }
            return false;
        }
        return false;

    }

    public static int sumOdd(int start, int end) {
        if (end < start || start <= 0 || end <= 0) {
            return -1;
        } else {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum = sum + i;
                }

            }

            return sum;
        }
    }

    //Exercise 15

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int tempNumber = Math.abs(number);
        while (tempNumber != 0 || tempNumber < 0){


            int lastDigit = tempNumber % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            tempNumber = tempNumber / 10;
           // System.out.println(number);
           // System.out.println(reverse);

        }
        if (Math.abs(number) ==reverse) {
            return true;
        } else {
            return false;
        }
    }

    // Exercise 16

    public static int sumFirstAndLastDigit(int number) {
        int firstNumber = number;

        if (number < 0) {
            return -1;
        } else {
            while (firstNumber >= 10) {

                System.out.println(firstNumber);
                firstNumber = firstNumber / 10;


            }
            return (number % 10) + firstNumber;
        }
    }

    // Exercise 17

    public static int getEvenDigitSum(int number) {
        int sum = 0;
         if (number < 0){
             return -1;
         }

        while (number != 0) {
            if ((number % 10) %2 == 0 && number % 10 != 0 ){
                sum = sum + number % 10;

            }
            number /= 10;

        }
        return sum;
    }

    // Exercise 18

    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a > 99 || b <10 || b > 99){
            return false;
        } else if (a%10 == b%10 || a/10 == b/10 ||a%10 == b/10 || a/10 == b%10){
            return true;
        }
        return false;
    }

    // Exercise 19

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (a < 10 || a > 1000 || b < 10 || b > 1000) {
            return false;
        } else if (a%10 == b%10 || c%10 == b%10 ||a%10 == c%10) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int a) {
        if (a < 10 || a > 1000){
            return false;
        }
        return true;
    }
}
