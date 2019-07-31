package com.grinfelds;

public class Main {

    public static void main(String[] args) {

        // EXERCISE 35

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
        System.out.println();


//        OUTPUT
//
//        circle.radius= 3.75
//        circle.area= 44.178646691106465
//        cylinder.radius= 5.55
//        cylinder.height= 7.25
//        cylinder.area= 96.76890771219959
//        cylinder.volume= 701.574580913447


        // EXERCISE 36

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());


//        OUTPUT
//
//        rectangle.width= 5.0
//        rectangle.length= 10.0
//        rectangle.area= 50.0
//        cuboid.width= 5.0
//        cuboid.length= 10.0
//        cuboid.area= 50.0
//        cuboid.height= 5.0
//        cuboid.volume= 250.0

    }
}
