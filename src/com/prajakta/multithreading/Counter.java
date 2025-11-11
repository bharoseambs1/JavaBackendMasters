package com.prajakta.multithreading;

public class Counter {
    private int count = 0;

    public void increment() {
        count++; // not thread-safe
    }

    public int getCount() {
        return count;
    }
}

