package com.prajakta.multithreading;

class SchedulerDemo extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " with priority " + Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        SchedulerDemo t1 = new SchedulerDemo();
        SchedulerDemo t2 = new SchedulerDemo();
        SchedulerDemo t3 = new SchedulerDemo();
        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MAX_PRIORITY); // 10
        t1.start();
        t2.start();
        t3.start();
    }
}