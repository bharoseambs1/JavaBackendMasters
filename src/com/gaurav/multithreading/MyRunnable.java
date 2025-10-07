package com.gaurav.multithreading;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
       System.out.println("MyRunnable is running");
    }

    public static void main(String[] args) {
      Thread thread = new Thread(new MyRunnable());
      thread.start();
    }
}
