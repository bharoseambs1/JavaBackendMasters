package com.satish.java8features.comparablevscomparator;

public class Z implements ABC{
    @Override
    public void showMessage() {

    }

    @Override
    public String getMessage() {
        return "";
    }

    @Override
    public String editMessageDefault(String str) {
        return ABC.super.editMessageDefault(str);
    }

    public static void main(String[] args) {
        ABC a = new A();
        a.showMessage();
        System.out.println(a.getMessage());
        System.out.println(a.editMessageDefault(a.getMessage()));

        ABC y = new Y();
        y.showMessage();
        System.out.println(y.getMessage());
        System.out.println(ABC.editMessageStatic(y.getMessage()));
    }
}
