package com.gaurav.multithreading;

public class DaemonExample extends Thread{
    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread is running: " + Thread.currentThread().getName());
        } else {
            System.out.println("User thread is running: " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        DaemonExample daemonThread = new DaemonExample();
        DaemonExample userThread = new DaemonExample();

        daemonThread.setDaemon(true);

        daemonThread.start();
        userThread.start();
    }
}
