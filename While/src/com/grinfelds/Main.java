package com.grinfelds;

public class Main {

    public static void main(String[] args) {

//	int count = 1;

//	while(count != 6) {
//        System.out.println(count);
//        count++;
//    }

//	while(true) {
//	    if(count ==6) {
//	        break;
//        }
//        System.out.println(count);
//	    count++;
//    }

//	do {
//        System.out.println(count);
//        count++;
//    } while(count != 6);

        System.out.println(isEvenNumber(44));

        int countFoundNum = 0;
        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println(number);
            countFoundNum++;
            if (countFoundNum == 5) {
                break;
            }
        }
        System.out.println(countFoundNum);

        System.out.println(sumDigits(125));
        System.out.println(timSumDigits(425681));

    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    // My solution

    public static int sumDigits(int number) {
        int sum = 0;
        if (number >= 10) {

            for (int i =0; i < Integer.toString(number).length() ;i++) {
                System.out.println(Integer.toString(number).charAt(i));
                sum = sum + Character.getNumericValue((Integer.toString(number).charAt(i))) ;
                System.out.println(sum);
            }
            return sum;
        }
        return -1;
    }

    // Tim's solution

    private static int timSumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;

        while(number > 0){

            int digit = number % 10;
            sum += digit;

            number /= 10;
        }

        return sum;
    }


}
