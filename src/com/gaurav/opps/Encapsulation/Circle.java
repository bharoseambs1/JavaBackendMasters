package com.gaurav.opps.Encapsulation;

public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius should be positive");
            this.radius = 1;
        }
    }

    public double calculateCircle(){
        return Math.PI *radius *radius;
    }

    public void circleInfo() {
        System.out.println("Circle Radius: " + radius + ", Area: " +  calculateCircle());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(2);
        c1.circleInfo();

        Circle c2 = new Circle(-3);
        c2.circleInfo();
    }
}
