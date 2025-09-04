package com.gaurav.constructor;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public static void compareAreas(Rectangle r1, Rectangle r2) {
        if (r1.area() > r2.area()) {
            System.out.println("Rectangle 1 has a larger area.");
        } else if (r1.area() < r2.area()) {
            System.out.println("Rectangle 2 has a larger area.");
        } else {
            System.out.println("Both rectangles have equal area.");
        }
    }
    public void display() {
        System.out.println("Length: " + length + ", Width: " + width +
                ", Area: " + area() + ", Perimeter: " + perimeter());
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 4);
        Rectangle r2 = new Rectangle(6, 3);

        r1.display();
        r2.display();

        Rectangle.compareAreas(r1, r2);
    }
}
