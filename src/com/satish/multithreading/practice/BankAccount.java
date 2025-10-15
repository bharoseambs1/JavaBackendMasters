package com.satish.multithreading.practice;

class BankAccount {
    private int balance = 10000;
    synchronized void withdraw(String user, int amount) {   //t1 User1, 7000                    //t2 User2, 5000
        System.out.println(user + " is checking balance...");  //User1 is checking balance...    //User2 is checking balance...
        if (balance >= amount) {                    //10000 >= 7000                             //3000 >= 5000
            System.out.println(user + " is withdrawing " + amount);  //User1 is withdrawing 7000
            balance -= amount;              //balance = 10000 - 7000 = 3000
            System.out.println(user + " completed withdrawal. Remaining balance: " + balance);  //User1 completed withdrawal. Remaining balance: 3000
        } else {
            System.out.println("Insufficient balance for " + user);                 //Insufficient balance for User2
        }
    }
}