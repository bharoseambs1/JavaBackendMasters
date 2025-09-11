package com.shradha.polymorphism;
//Method Overriding (Run-time Polymorphism): Create a class Shape with method draw().
// Subclasses: Circle, Rectangle, Triangle override draw().
// Use dynamic method dispatch (Shape ref = new Circle();) to call overridden methods.
// Parent class
class Shape {
    void draw() {
        System.out.println("Drawing a shape...");
    }
}

    // Child class 1
    class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a Circle");
        }
    }

    // Child class 2
    class Rectangle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a Rectangle");
        }
    }

    // Child class 3
    class Triangle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a Triangle");
        }


        public static void main(String[] args) {
            Shape ref; // parent class reference

            // Reference points to Circle object
            ref = new Circle();
            ref.draw(); // Calls Circle's draw()

            // Reference points to Rectangle object
            ref = new Rectangle();
            ref.draw(); // Calls Rectangle's draw()

            // Reference points to Triangle object
            ref = new Triangle();
            ref.draw(); // Calls Triangle's draw()
        }

    }
