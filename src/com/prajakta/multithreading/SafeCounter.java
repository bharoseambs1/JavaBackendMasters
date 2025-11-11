package com.prajakta.multithreading;

public class SafeCounter {
    private int count = 0;

    // synchronized method makes it thread-safe
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

