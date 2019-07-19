package com.grinfelds;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;// + 2;
        System.out.println("1+2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + "- 1 = " + result);

        previousResult = result;

        result = result *10;
        System.out.println(previousResult + "* 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + "/ 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + "% 3 = " + result);

        previousResult = result;

        result = result + 1;
        System.out.println("Result = " + result);
        result++;
        System.out.println("Result = " + result);
        result--;
        System.out.println("Result = " + result);

        result += 2;
        System.out.println("Result = " + result);
        result *= 10;
        System.out.println("Result = " + result);
        result-=10;
        System.out.println("Result = " + result);
        result/=10;
        System.out.println("Result = " + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score");

        int scndTopScore = 81;
        if ((topScore > scndTopScore) && (topScore <100))
            System.out.println("Greater than second top score and < 100");

        if((topScore > 90)|| (scndTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is an error");

        boolean isCar= false;
        if (isCar == true)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");

        double myDouble = 20;
        double mySecondDouble = 80;
        double myTotal = (25*(myDouble+mySecondDouble)) % 40;
        System.out.println("myTotal = " + myTotal);
        if (myTotal <=20)
            System.out.println("Total was over the limit");
    }
}
