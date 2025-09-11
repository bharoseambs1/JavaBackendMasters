package com.shradha.Inheritance;
//Hierarchical Inheritance: Create a base class Vehicle.
// Subclasses: Car, Bike, and Truck.
// Each subclass should have its own method. Show how different objects call different methods.
// Base class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Subclass 1
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven...");
    }
}

// Subclass 2
class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is being ridden...");
    }
}

// Subclass 3
class Truck extends Vehicle {
    void load() {
        System.out.println("Truck is loading goods...");
    }
// Main method
    public static void main(String[] args) {
        // Car object
        Car car = new Car();
        car.start();  // from Vehicle
        car.drive();  // specific to Car

        System.out.println();

        // Bike object
        Bike bike = new Bike();
        bike.start(); // from Vehicle
        bike.ride();  // specific to Bike

        System.out.println();

        // Truck object
        Truck truck = new Truck();
        truck.start(); // from Vehicle
        truck.load();  // specific to Truck
    }
}

