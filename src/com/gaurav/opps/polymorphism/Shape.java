package com.gaurav.opps.polymorphism;

public class Shape {

    void draw(){
        System.out.println("Drwaning shaper");
    }

    public static void main(String[] args) {
        Shape ref = new Circle();
        ref.draw();

        Shape ref1 = new Rectangle();
        ref1.draw();

        Shape ref2 = new Triangle();
        ref2.draw();
    }

}
