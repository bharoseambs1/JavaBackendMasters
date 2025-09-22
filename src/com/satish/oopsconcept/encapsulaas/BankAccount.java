package com.satish.oopsconcept.encapsulaas;

public class BankAccount {
    private long accountNumber;
    private long balance;

    void deposit(long accountNumber, int amount){
        this.balance += amount;
        System.out.println("balance in account number: " + accountNumber + " is: " + balance);
    }

    void withdraw(long withdrawAmt){
        if(balance > 0 && balance > withdrawAmt){
            System.out.println("balance available");
        }else{
            System.out.println("requested balance not available");
        }
    }
}