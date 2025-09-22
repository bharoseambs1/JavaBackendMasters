package com.gaurav.opps.Encapsulation;

public class BankAccount {

    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double availableBalance) {
        this.accountNumber = accountNumber;
        if(availableBalance >= 0) {
            this.balance = availableBalance;
        }else {
            System.out.println("balance not available");
        }

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Deposit should be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("withdrew: " + amount + ", New Balance: " + balance);
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("withdrawal amount should be positive");
        }
    }
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }

    // Main method to test
    public static void main(String[] args) {
        BankAccount account = new BankAccount(505, 1000);

        account.displayAccountInfo();

        account.deposit(100);
        account.withdraw(200);
        account.withdraw(5000);
        account.deposit(-1000);
    }
}
