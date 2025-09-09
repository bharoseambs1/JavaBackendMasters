package com.satish.finalkeywordconcept;

public class Parent {

    public void show(){
        System.out.println("Message from show method");
    }

    public String getMessage(){
      return "Message from getMessage method";
    }

    public final String getBankDetails(){
        return "get message from Bank Details";
    }
}