package com.satish.java8features.comparablevscomparator;

public class A implements ABC{
    @Override
    public void showMessage() {
        System.out.println("Hello from A");
    }

    @Override
    public String getMessage() {
        return "Message from A";
    }
}