package com.satish.multithreading.practice;

public class CustomRunnableTest {
    public static void main(String[] args) {
        //void customRun();

        CustomRunnable cr = () -> {System.out.println("message from main method of custom runnable interface");};
        cr.customRun();
    }
}
