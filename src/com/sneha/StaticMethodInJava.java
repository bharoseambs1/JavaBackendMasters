package com.sneha;



public class StaticMethodInJava {
    public static void main(String[] args) {
        StaticMethodInJava.staticShowJava();
    }

    static void staticShowJava(){
        System.out.println("Message from staticShowJava( method");
    }

    void nonStaticShowJava(){
        System.out.println("Message from nonStaticShowJava method");
    }
}


