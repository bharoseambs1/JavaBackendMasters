package com.gaurav.opps.polymorphism;

public class AddMethodOverload {

    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation();
        int add = mathOperation.add(10,10);
        System.out.println(add);

        double add1 = mathOperation.add(10.0,10.0,10.0);
        System.out.println(add1);
    }
}
