package com.satish.multithreading.practice;

class LogWriter implements Runnable {
    private String message;
    public LogWriter(String message) {
        this.message = message;
    }
    public void run() {
        System.out.println("Logging message: " + message + " by " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new LogWriter("Error in Module-1"));
        Thread t2 = new Thread(new LogWriter("Warning in Module-2"));
        t1.start();
        t2.start();
    }
}