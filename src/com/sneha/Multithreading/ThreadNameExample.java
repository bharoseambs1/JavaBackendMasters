package com.sneha.Multithreading;

public class ThreadNameExample extends Thread {
    public void run() {
        System.out.println("Running thread:" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadNameExample t1 = new ThreadNameExample();
        ThreadNameExample t2 = new ThreadNameExample();

        t1.setName("satish-Thread-1");
        t2.setName("satish-Thread-2");

        t1.start();
        t2.start();
    }
}











