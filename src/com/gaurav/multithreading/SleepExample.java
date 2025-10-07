package com.gaurav.multithreading;

public class SleepExample {
    public void run(){
        for(int i=1; i<=5; i++){
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
       SleepExample example = new SleepExample();
            example.run();
    }
}
