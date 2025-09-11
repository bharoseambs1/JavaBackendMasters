package com.gaurav.opps.polymorphism;

public class BankMain {
    public static void main(String[] args) {

        Bank bank;
        bank = new SBI();
        System.out.println("SBI bank interest Rate: " + bank.getRateOfInterest());

        bank = new ICICI();
        System.out.println("ICICI bank interest Rate: " + bank.getRateOfInterest());

        bank = new HDFC();
        System.out.println("HDFC bank interest Rate: " + bank.getRateOfInterest());
    }

    }

