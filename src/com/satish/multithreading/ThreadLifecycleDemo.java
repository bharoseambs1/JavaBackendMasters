package com.satish.multithreading;

class ThreadLifecycleDemo extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is in RUNNABLE state.");

        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " is now in TIMED_WAITING state (sleeping).");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println(Thread.currentThread().getName() + " has completed execution and moved to TERMINATED state.");
    }

    public static void main(String[] args) {
        ThreadLifecycleDemo t1 = new ThreadLifecycleDemo();
        System.out.println("Thread state before start: " + t1.getState());

        t1.start();
        System.out.println("Thread state after start: " + t1.getState());

        try {
            Thread.sleep(500);
            System.out.println("Thread state during execution: " + t1.getState());
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread state after completion: " + t1.getState());
    }
}