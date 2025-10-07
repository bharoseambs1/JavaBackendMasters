package com.gaurav.multithreading;

public class PriorityExample extends Thread{
    @Override
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        PriorityExample thread1 = new PriorityExample();
        PriorityExample thread2 = new PriorityExample();
        PriorityExample thread3 = new PriorityExample();

        thread1.setName("Low-Priority-Thread");
        thread2.setName("Medium-Priority-Thread");
        thread3.setName("High-Priority-Thread");

        thread1.setPriority(Thread.MIN_PRIORITY); // 1
        thread2.setPriority(Thread.NORM_PRIORITY); // 5
        thread3.setPriority(Thread.MAX_PRIORITY); // 10

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
