package com.grinfelds;

public class Main {

    public static void main(String[] args) {

        //exercise 31

        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
        Wall wall1 = new Wall(-1.25, -1.25);
        System.out.println("width= " + wall1.getWidth());
        System.out.println("height= " + wall1.getHeight());
        System.out.println("area= " + wall1.getArea());

//OUTPUT:
//
//        area= 20.0
//        width= 5.0
//        height= 0.0
//        area= 0.0


        //exercise 32

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

//        OUTPUT
//
//        distance(0,0)= 7.810249675906654
//        distance(second)= 5.0
//        distance(2,2)= 5.0
//        distance()= 0.0


        // exercise 33

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

//     OUTPUT
//
//                total= 38.5
//        total= 36.45

        // exercise 34

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());

//     OUTPUT
//
//        one.real= 2.0
//        one.imaginary= 2.0
//        one.real= -0.5
//        one.imaginary= 3.5
//        number.real= 3.0
//        number.imaginary= -5.0

    }
}
