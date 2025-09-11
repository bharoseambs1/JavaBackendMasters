package com.shradha.polymorphism;
//Real-life Example: Create a base class Bank with method getRateOfInterest().
// Subclasses: SBI, ICICI, HDFC.
// Override the method to return different interest rates.
// Demonstrate run-time polymorphism.
// Base class
class Bank {
    double getRateOfInterest() {
        return 0.0; // default
    }
}

// Subclass SBI
class SBI extends Bank {
    @Override
    double getRateOfInterest() {
        return 6.5;
    }
}

// Subclass ICICI
class ICICI extends Bank {
    @Override
    double getRateOfInterest() {
        return 7.0;
    }
}

// Subclass HDFC
class HDFC extends Bank {
    @Override
    double getRateOfInterest() {
        return 6.8;
    }

    public static void main(String[] args) {
        Bank bank; // parent reference

        bank = new SBI();
        System.out.println("SBI Rate of Interest: " + bank.getRateOfInterest() + "%");

        bank = new ICICI();
        System.out.println("ICICI Rate of Interest: " + bank.getRateOfInterest() + "%");

        bank = new HDFC();
        System.out.println("HDFC Rate of Interest: " + bank.getRateOfInterest() + "%");
    }
}

