package com.sneha.Multithreading;

public class DeamonThreadExample extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
         System.out.println("Daemon thread executing...");
    }else {
        System.out.println("User thread executing...");
    }
}

public static void main(String[] args) {
    DeamonThreadExample t1 = new DeamonThreadExample();
    DeamonThreadExample t2 = new DeamonThreadExample();

    t1.setDaemon(true);
    t1.start();
    t2.start();
}
}







