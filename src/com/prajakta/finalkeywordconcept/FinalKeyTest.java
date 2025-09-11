package com.prajakta.finalkeywordconcept;

public class FinalKeyTest {
    int a = 10;
    final int b = 10;

    final float pi = 3.14f;

    public static void main(String[] args) {

        FinalKeyTest obj1 = new FinalKeyTest();
        obj1.a = 20;
        System.out.println(obj1.b);

        //obj1.b = 20;  //Cannot assign a value to final variable 'j'
        //System.out.println(obj1.b);
    }
}