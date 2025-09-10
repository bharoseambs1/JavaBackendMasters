package com.satish.oopsconcept;

public class PolyMethOverSuzukiBike extends PolyMethOverBike{
    @Override
    int getMilage(String model) {
        if(model == "2012"){
            return 90;
        }
        return 0;
    }
}
