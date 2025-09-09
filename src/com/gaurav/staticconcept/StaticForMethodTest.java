package com.gaurav.staticconcept;

import com.satish.staticconcept.StaticKeywordForMethodTest;

public class StaticForMethodTest {

    public static void main(String[] args) {

        StaticForMethodTest.staticDisplay();
    }

    static void staticDisplay(){
        System.out.println("Message from staticDisplay method");
    }

    void nonStaticShowDisplay(){
        System.out.println("Message from nonStaticShowDisplay method");
    }
}
