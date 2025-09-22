package com.sneha.polymorphism;

public class Main {
    public static void main(String[] args) {
        Bank bank;

        bank = new SBI();
        System.out.println("SBI Rate of Interst:" + bank.getRateOfInterst() + "%");

        bank = new ICICI();
        System.out.println("ICICI Rate of Interst:" + bank.getRateOfInterst() + "%");

        bank = new HDFC();
        System.out.println("HDFC Rate of Interst:" + bank.getRateOfInterst() + "%");
    }
}




