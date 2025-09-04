package com.gaurav.constructor;

public class Car {
    private String model;
    private double price;


    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Car Model: " + model + ", Price: " + price);
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.displayDetails();

        Car c2 = new Car("Venue");
        c2.displayDetails();

        Car c3 = new Car("Venue", 1200000);
        c3.displayDetails();
    }
}
