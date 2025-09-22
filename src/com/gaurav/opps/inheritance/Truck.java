package com.gaurav.opps.inheritance;

public class Truck extends Vehicle{

    void heavyLoad(){
        System.out.println("Truck is commerical vehicle");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.starter();
        car.running();

        Bike bike = new Bike();
        bike.heroBike();
        bike.running();

        Truck t = new Truck();
        t.heavyLoad();
        t.running();
    }
}
