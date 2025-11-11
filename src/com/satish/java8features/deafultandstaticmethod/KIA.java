package com.satish.java8features.deafultandstaticmethod;

public class KIA implements VehicleDetails{
    @Override
    public int getVehicleAvg() {
        return 22;
    }

    @Override
    public long getVehiclePrice() {
        return 2500000;
    }

    @Override
    public String getVehicleColor() {
        return "Black";
    }
    //auto drive mode KIA + 4

    @Override
    public int autoDriveModeAddedChargesDefault(){
        return 6;
    }

    public static void main(String[] args) {
        KIA kia = new KIA();
        System.out.println("KIA Vehicle Avg: " + kia.getVehicleAvg());
        System.out.println("KIA Vehicle Price: " + kia.getVehiclePrice());
        System.out.println("KIA Vehicle Color: " + kia.getVehicleColor());
        System.out.println("KIA Auto Drive Mode Added Charges (Default): " + kia.autoDriveModeAddedChargesDefault());
        System.out.println("Auto Drive Mode Added Charges (Static): " + VehicleDetails.autoDriveModeAddedChargesStatic());
    }
}