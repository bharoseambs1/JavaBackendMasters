package com.satish.java8features.deafultandstaticmethod;

public interface VehicleDetails {
    int getVehicleAvg();
    String getVehicleColor();
    long getVehiclePrice();
    //int audoDriveModeAddedCharges();
    default int autoDriveModeAddedChargesDefault(){
        return 4;
    }

    static int autoDriveModeAddedChargesStatic(){
        return 4;
    }
}