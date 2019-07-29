package com.grinfelds;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int i = 1;
        while (i<=10) {
            System.out.println("Enter number #" + i);
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                i++;
            }
            else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); //handle the enter key.

        }
        System.out.println("sum: " + sum);
        scanner.close();




    }
//	    Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Ēnter year or birth ");
//
//        boolean hasNextInt = scanner.hasNextInt();
//
//        if (hasNextInt) {
//            int yearOfBirth = scanner.nextInt();
//            scanner.nextLine();
//
//            System.out.println("Enter your naem : ");
//            String name = scanner.nextLine();
//            int age = 2018 - yearOfBirth;
//
//            System.out.println(name);
//            System.out.println(age);
//
//        }
//
////        int yearOfBirth = scanner.nextInt();
////        scanner.nextLine();
////
////        System.out.println("Enter your naem : ");
////        String name = scanner.nextLine();
////        int age = 2018 - yearOfBirth;
////
////        System.out.println(name);
////        System.out.println(age);
//
//        scanner.close();
//
//    }
}
