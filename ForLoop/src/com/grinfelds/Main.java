package com.grinfelds;

public class Main {

    public static void main(String[] args) {
        System.out.println("a =10000; ir = 2% ->" + calculateInterest(10000,2));

        for(int i = 0; i < 5; i++) {
            System.out.println("Looop  " + i + " Hi");
        }

        for(int i = 2; i < 9; i++) {
            System.out.println(String.format("%.2f",calculateInterest(10000,i)));
        }

        for(int i = 8; i > 1; i--) {
            System.out.println(String.format("%.2f",calculateInterest(10000,i)));
        }
        int count =0;
        for (int i=10; i <50;i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i + " is a prime");
                if (count == 10) {
                    System.out.println(1);
                    break;
                }
            }

        }
    }

    public static double calculateInterest (double amount, double interestRate) {
        return(amount * (interestRate/100));


    }

    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for (int i =2; i <=(long) Math.sqrt(n);i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
