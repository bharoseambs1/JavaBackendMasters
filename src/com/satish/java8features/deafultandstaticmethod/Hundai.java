package com.satish.java8features.deafultandstaticmethod;

public abstract class Hundai implements VehicleDetails {
    @Override
    public int getVehicleAvg() {
        return 20;
    }

    @Override
    public String getVehicleColor() {
        return "White";
    }

//    @Override
//    public long getVehiclePrice() {
//        return 5;
//    }

}