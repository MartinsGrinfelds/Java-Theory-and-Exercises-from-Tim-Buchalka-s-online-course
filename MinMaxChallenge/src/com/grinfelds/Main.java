package com.grinfelds;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int min = 0;
        int i = 1;
        boolean first = true;

        while (true) {

            System.out.println("Enter number #" + i);
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {

                int number = scanner.nextInt();

                if(first) {
                    first = false;
                    min= number;
                    max=number;
                }

                if (number >= max) {
                    max = number;
                }
                if (number < min) {
                        min = number;
                    }


                i++;

            } else {
                System.out.println("Invalid Number");
                break;
            }
            scanner.nextLine(); //handle the enter key.

        }
        System.out.println("min: " + min + " max: " + max);
        scanner.close();
    }
}
