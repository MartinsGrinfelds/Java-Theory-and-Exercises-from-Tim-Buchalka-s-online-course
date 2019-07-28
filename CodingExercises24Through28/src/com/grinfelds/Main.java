package com.grinfelds;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1,2,3));
        System.out.println(getLargestPrime(21));
        printSquareStar(7);
    }

    // E24

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if((bigCount < 0) || (smallCount < 0) || (goal < 0))
            return false;
        int bigFlour = bigCount * 5;
        int smallFlour = smallCount * 1;
        int sumBigSmallKilos = bigFlour + smallFlour;
        if(bigFlour == goal){
            return true;
        }
        if(sumBigSmallKilos >= goal){
            if((bigFlour % goal == 0)){
                return true;
            }
            if((bigFlour < goal) && (smallFlour != 0)){
                return true;
            }
            if((bigFlour > goal)){
                if((bigFlour % goal !=0) && (smallFlour < goal) && (bigFlour % 2 ==0)){
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    // E25

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int i;
        int copyOfInput = number;
        for (i = 2; i <= copyOfInput; i++) {
            if (copyOfInput % i == 0) {
                copyOfInput /= i; i--;
            }
        }
        return i;
    }

    // Diagonal Star

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            // Loop denoting rows
            for (int i = 0; i < number; i++) {

                // Loop denoting columns
                for (int j = 0; j < number; j++) {

                    // Checking boundary conditions
                    // and main diagonal and
                    // secondary diagonal conditions
                    if (i == 0 || j == 0 || i == j || i == number - 1 || j == number - 1 || i + j == number - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }



}
