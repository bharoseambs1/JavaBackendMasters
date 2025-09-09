package com.gaurav.staticconcept;

public class StaticForMethodTest {
    public static void main(String[] args) {
        StaticForMethodTest.staticDisplay();
        StaticForMethodTest obj = new StaticForMethodTest();
        obj.nonStaticShowDisplay();
    }
    static void staticDisplay(){
        System.out.println("Message from staticDisplay method");
    }
    void nonStaticShowDisplay(){
        System.out.println("Message from nonStaticShowDisplay method");
    }
}
