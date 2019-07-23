package com.grinfelds;

public class Main {

    public static void main(String[] args) {
	   int value = 3;
	   if (value == 1) {
           System.out.println(1);
       } else if (value ==2) {
           System.out.println(2);
       } else {
           System.out.println("Was not 1 or 2");
       }

	   int switchValue = 3;

	   switch(switchValue) {
           case 1:
               System.out.println(1);
               break;

           case 2:
               System.out.println(2);
               break;

           case 3: case 4: case 5:
               System.out.println("3 or 4 or 5");
               System.out.println(switchValue);
               break;

           default:
               System.out.println("not 1 or 2");
       }

       char switchChar = 'g';

	   switch (switchChar) {

           case 'a': case 'b': case 'c': case 'd': case 'e':
               System.out.println(switchChar);
               break;

           default:
               System.out.println("Not found");
               break;
       }

       String month = "jaNuARy";
        System.out.println(month.toLowerCase());

    }
}
