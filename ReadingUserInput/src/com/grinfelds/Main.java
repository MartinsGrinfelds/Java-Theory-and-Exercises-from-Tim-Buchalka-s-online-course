package com.grinfelds;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        System.out.println("Ēnter year or birth ");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your naem : ");
            String name = scanner.nextLine();
            int age = 2018 - yearOfBirth;

            System.out.println(name);
            System.out.println(age);

        }

//        int yearOfBirth = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("Enter your naem : ");
//        String name = scanner.nextLine();
//        int age = 2018 - yearOfBirth;
//
//        System.out.println(name);
//        System.out.println(age);

        scanner.close();

    }
}
