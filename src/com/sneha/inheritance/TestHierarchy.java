package com.sneha.inheritance;

public class TestHierarchy {
    public static void main(String[]args) {
        Car c = new Car();
        c.start();
        c.driveCar();

        Bike b = new Bike();
        b.start();
        b.rideBike();

        Truck t = new Truck();
        t.start();
        t.loadTruck();
    }
}
