package com.vikas.inheritance.Hierarchical;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Truck truck = new Truck();

        car.start();
        car.playMusic();

        bike.start();
        bike.ride();

        truck.start();
        truck.loadCargo();
    }

}
