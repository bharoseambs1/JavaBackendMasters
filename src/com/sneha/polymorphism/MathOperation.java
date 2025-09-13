package com.sneha.polymorphism;

public class MathOperation {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b, double c) {
        return a + b + c;
    }
    public static void main(String[]args) {
        MathOperation math = new MathOperation();

        int sumInt = math.add(10,20);

        double sumDouble = math.add(1.5,2.5,3.0);

        System.out.println("Sum of two integers:" + sumInt);
        System.out.println("Sum of three doubles:" + sumDouble);
    }
}
