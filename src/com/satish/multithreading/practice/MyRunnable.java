package com.satish.multithreading.practice;

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " running: " + i);
        }
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "Worker-1");
        Thread t2 = new Thread(new MyRunnable(), "Worker-2");
        t1.start();
        t2.start();
    }
}
