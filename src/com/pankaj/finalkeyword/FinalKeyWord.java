package com.pankaj.finalkeyword;

public class FinalKeyWord {
    final int MAX_VALUE = 100;

    final void display() {
        System.out.println("Final method called. MAX_VALUE: " + MAX_VALUE);
    }

    public static void main(String[] args) {
        FinalKeyWord obj = new FinalKeyWord();
        obj.display();


    }
}