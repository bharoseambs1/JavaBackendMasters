package com.vikas.staticconcept;

public class MathUtil {
    public static int square(int number) {

        return number * number;
    }
    public static void main(String[] args) {

        int result = MathUtil.square(5);
        System.out.println("Square of 5 is: " + result);
    }
}

