package com.satish.staticconcept;

public class StaticKeywordForMethodTest {

    public static void main(String[] args) {
        //to call a static method we no need to create the object of a class
        //static method we can call with the help of ClassName ex: StaticKeywordForMethodTest.staticShow();
        //example
        StaticKeywordForMethodTest.staticShow();
    }

    static void staticShow(){
        System.out.println("Message from staticShow method");
    }

    void nonStaticShow(){
        System.out.println("Message from nonStaticShow method");
    }
}