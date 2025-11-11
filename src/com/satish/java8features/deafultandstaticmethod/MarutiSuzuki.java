package com.satish.java8features.deafultandstaticmethod;

public class MarutiSuzuki implements VehicleDetails{
    @Override
    public int getVehicleAvg() {
        return 25;
    }

    @Override
    public String getVehicleColor() {
        return "";
    }

    @Override
    public long getVehiclePrice() {
        return 1800000;
    }
}