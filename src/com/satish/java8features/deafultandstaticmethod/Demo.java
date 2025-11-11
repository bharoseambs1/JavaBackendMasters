package com.satish.java8features.deafultandstaticmethod;

public abstract class Demo implements VehicleDetailsChild{
    @Override
    public int getVechileManufacturingYear() {
        return 0;
    }

    @Override
    public int getVehicleAvg() {
        return 0;
    }

    @Override
    public String getVehicleColor() {
        return "";
    }

  /*  @Override
    public long getVehiclePrice() {
        return 0;
    }*/
}
