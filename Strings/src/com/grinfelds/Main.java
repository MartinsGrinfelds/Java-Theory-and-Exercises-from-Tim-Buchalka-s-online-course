package com.grinfelds;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("myString = " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString = " + myString);
        myString = myString + "\u00A9 2015";
        System.out.println("myString = " + myString);

        String numberString ="250.55";
        numberString = numberString + "49.95";
        System.out.println("Result = " +numberString);

        String lastString = "10";
        int myInt =50;
        lastString = lastString + myInt;
        System.out.println("LastString = " + lastString);
        double doubleNum = 120.47d;
        lastString = lastString + doubleNum;
        System.out.println("LastString = " + lastString);

    }
}
