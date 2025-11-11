package com.satish.java8features.comparablevscomparator;

public class Y implements ABC{
    @Override
    public void showMessage() {
        System.out.println("Hello from Y");
    }

    @Override
    public String getMessage() {
        return "Message from Y";
    }
}