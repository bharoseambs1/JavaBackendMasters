package com.satish.finalkeywordconcept;

public class FinalKeywordTest {
    int i = 10;
    final int j = 10;

    final float pi = 3.14f;

    public static void main(String[] args) {

        FinalKeywordTest obj1 = new FinalKeywordTest();
        obj1.i = 20;
        System.out.println(obj1.i);

        //obj1.j = 20;  //Cannot assign a value to final variable 'j'
        //System.out.println(obj1.j);
    }
}