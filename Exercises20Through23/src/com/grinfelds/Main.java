package com.grinfelds;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(50,25));
        printFactors(10);
        System.out.println(isPerfectNumber(10));
        numberToWords(10);
        System.out.println(reverse(10));
        System.out.println(getDigitCount(10));

    }

    // E20

    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        } else  {
            //if (first == 0)
            //  return second;

            while (second != 0) {
                if (first > second)
                    first = first - second;
                else
                    second =second - first;
            }

            return first;
        }
    }

    //E21

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i < number +1;i++){
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

    }

    //E22

    public static boolean isPerfectNumber(int number){
        if (number < 1){
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number ;i++){
            if (number % i == 0) {
                sum = sum + i;
                System.out.println(i);
            }
        }

        if(number == sum) {
            return true;
        }
        return false;
    }

    //E23

    public static void numberToWords(int number) {
        int reversed = reverse(number);
        int a = getDigitCount(number);
        int b = getDigitCount(reversed);
        if (number < 0){
            System.out.println("Invalid Value");
        } else if (number == 0) System.out.println("Zero");

        else {


            while (reversed != 0){
                int x;
                x = reversed % 10;
                switch (x){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println(-1);
                }
                reversed /= 10;
            }
          //  while(reversed>0);
            for (int i = a; i != b; b++) {
                System.out.println("Zero");
            }
        }

    }

    public static int reverse (int number) {
        int reverse = 0;
        int tempNumber = number;
        while (tempNumber != 0 || tempNumber < 0){


            int lastDigit = tempNumber % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            tempNumber = tempNumber / 10;
            // System.out.println(number);
            // System.out.println(reverse);

        }
        return reverse;
    }

    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        }
        return Integer.toString(number).length();
    }
}

