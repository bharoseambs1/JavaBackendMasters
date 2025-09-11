package com.satish.oopsconcept;

public class PolyMethOverTest {
    public static void main(String[] args) {

        String name = "hondabike"; //Bike, HondaBike
        PolyMethOverBike bikeObj;

        if(name.equalsIgnoreCase("Bike")){
            bikeObj = new PolyMethOverBike();
        }else if(name.equalsIgnoreCase("HondaBike")){
            bikeObj = new PolyMethOverHondaBike();
        }else{
            bikeObj = new PolyMethOverSuzukiBike();
        }

        System.out.println(bikeObj.getMilage("2012"));  //85        //bike:80, hondabike:85, nonbikeandhondabike:90
    }
}
