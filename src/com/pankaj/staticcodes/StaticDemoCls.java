package com.pankaj.staticcodes;

public class StaticDemoCls {
    static int a = 10; // Static variable

    static { // Static block
        System.out.println("Static block executed. Value of a: " + a);
    }

    public static void display() { // Static method
        System.out.println("Static method called. Value of a: " + a);
    }

    public static void main(String[] args) {
        System.out.println("Main method started.");
        display(); // Calling static method
        System.out.println("Main method ended.");
    }
}
