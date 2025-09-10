package com.satish.oopsconcept;

public class PolyMethOverHondaBike extends PolyMethOverBike{
    @Override
    int getMilage(String model) {
        if(model == "2012"){
            return 85;
        }
        return 0;
    }
}