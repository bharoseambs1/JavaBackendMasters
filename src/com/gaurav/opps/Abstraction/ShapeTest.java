package com.gaurav.opps.Abstraction;

public class ShapeTest {

    public static void main(String[] args) {
        // Create objects
        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(4);

        // Display info + areas
        rectangle.displayShapeInfo();
        System.out.println("Rectangle Area: " + rectangle.getArea());

        circle.displayShapeInfo();
        System.out.println("Circle Area: " + circle.getArea());
    }
}
