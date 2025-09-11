package com.shradha.polymorphism;
//Method Overloading (Compile-time Polymorphism): Create a class MathOperation with a
//method add(int, int) and add(double, double, double). Demonstrate method overloading.

// Class with overloaded methods
class MathOperation {

    // Method 1: Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add three doubles
    double add(double x, double y, double z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        MathOperation math = new MathOperation();

        // Calling add(int, int)
        int sum1 = math.add(10, 20);
        System.out.println("Sum of integers: " + sum1);

        // Calling add(double, double, double)
        double sum2 = math.add(5.5, 2.5, 3.0);
        System.out.println("Sum of doubles: " + sum2);
    }
}