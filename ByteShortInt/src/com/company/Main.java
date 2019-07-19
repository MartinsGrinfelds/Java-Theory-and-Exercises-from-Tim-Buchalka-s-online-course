package com.company;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
	    int myMinValue = -2_147_436_495;
	    int myMaxValue = 2_147_436_495;
	    int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);
	    // byte has a width of 8
	    byte myByteValue = 10;
	    byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);
	    //short has a width of 16
	    short myShortValue = 32767;
	    short myNewShortValue = (short) (myShortValue);
        System.out.println("myNewShortValue = " + myNewShortValue);
	    //long has a width of 64
	    long myLongValue = 100L;

	    //Problem
        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        long myLong = 50000L + 10L * (myByte + myShort + myInt);
        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));
        System.out.println("myLong = " + myLong);
        System.out.println(shortTotal);
    }
}
