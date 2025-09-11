package com.shradha.polymorphism;
//Polymorphic Array: Create an array of type Shape and store objects of Circle, Rectangle, and
//Triangle. Call the draw() method on each object.
// Parent class
class Shape1 {
    void draw() {
        System.out.println("Drawing a Shape...");
    }
}

// Subclass 1
class Circle1 extends Shape1 {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Subclass 2
class Rectangle1 extends Shape1 {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Subclass 3
class Triangle1 extends Shape1 {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }

    public static void main(String[] args) {
        // Polymorphic array
        Shape1[] shapes = { new Circle1(), new Rectangle1(), new Triangle1() };

        // Loop through and call draw()
        for (Shape1 s : shapes) {
            s.draw(); // Runtime polymorphism
        }
    }
}

