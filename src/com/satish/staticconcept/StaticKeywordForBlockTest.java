package com.satish.staticconcept;

public class StaticKeywordForBlockTest {

    public static void main(String[] args) {
        System.out.println("message from main method");
    }

    static {
        System.out.println("message from static block - 1");
        System.out.println("to initiate/instantiate/initialization or invoke of static variable and methods");
        System.out.println("static block execute before main method and if we have multiple block it will execute by top to bottom sequence");
    }

    static {
        System.out.println("message from static block - 2");
    }

    //non-static block
    /*{
        System.out.println("message from non static block - 1");
    }*/
}