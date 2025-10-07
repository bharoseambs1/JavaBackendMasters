package com.gaurav.multithreading;

public class ThreadNameExample extends Thread{
    @Override
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadNameExample thread1 = new ThreadNameExample();
        ThreadNameExample thread2 = new ThreadNameExample();
        thread1.setName("Gaurav-Thread-1");
        thread2.setName("Gaurav-Thread-2");
        thread1.start();
        thread2.start();
    }
}
