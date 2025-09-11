package com.satish.oopsconcept;

import java.io.File;

public class PolyMailUtil {
    //method overloading
    void sendMail(String to, String subject, String body){  //number
        System.out.println("mail sent without attachment");
    }

    void sendMail(String to, String subject, String body, File file){
        System.out.println("mail sent with attachment");
    }
    //method overloading  --  order of parameter
    int getAdd(int x, int y){
        return x + y;
    }

    float getAdd(float x, int y){
        return x + y;
    }

    //method overloading -- order of parameter
    double getSubstraction(float f, double d){
        return f - d;
    }

    float getSubstraction(double d, float f){
        return (float) d - f;
    }

}