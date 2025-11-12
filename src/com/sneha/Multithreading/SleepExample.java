package com.sneha.Multithreading;

public class SleepExample extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running:" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);

            }
        }

    }

    public static void main(String[] args) {
        SleepExample t1 = new SleepExample();
        t1.start();
    }
}


