package com.grinfelds;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //inputThenPrintSumAndAverage();
        System.out.println(getBucketCount(3.4,2.1,1.5,0));
        System.out.println(getBucketCount(3.4,1.5));

    }



    //Exercise 27

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        int sum = 0;
        int i = 0;
        while (true) {
            //System.out.println("Enter number #" + i);
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                i++;
                int number = scanner.nextInt();
                sum += number;
                average = (double) sum/i;


            }
            else {
                //System.out.println("Invalid Number");
                break;
            }
            scanner.nextLine(); //handle the enter key.

        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
        scanner.close();
    }

    //Exercise 28

    public static int getBucketCount(double width, double height,double areaPerBucket, int extraBuckets){
        if (width <= 0 || height <= 0 || areaPerBucket <=0 || extraBuckets <0){
            return -1;
        }

            return (int) (Math.ceil((width*height)/areaPerBucket) - extraBuckets);

    }

    public static int getBucketCount(double width, double height,double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <=0){
            return -1;
        }

        return (int) (Math.ceil((width*height)/areaPerBucket));

    }

    public static int getBucketCount(double area ,double areaPerBucket){
        if (area <= 0 || areaPerBucket <=0){
            return -1;
        }

        return (int) (Math.ceil((area)/areaPerBucket) );

    }

}
