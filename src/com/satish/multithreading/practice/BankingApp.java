package com.satish.multithreading.practice;

public class BankingApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread t1 = new Thread(() -> account.withdraw("User1", 7000));
        Thread t2 = new Thread(() -> account.withdraw("User2", 5000));
        t1.start();
        t2.start();
    }
}

//java 8 features lambda expression
//void run();