package com.satish.oopsconcept.encapsulaas;

import javax.swing.*;

public class Circle {
    private int radius;
    private final float pi = 3.14f;

    public Circle(int radius) { //pi * r2
        this.radius = radius;
    }

    float calculateArea(){
        return pi * (this.radius * this.radius);
    }
}