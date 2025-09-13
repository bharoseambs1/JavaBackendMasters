package com.sneha.polymorphism;

import java.sql.Ref;

public class RuntimePolymorphismExample {
    public static void main(String[]args) {
        Shape ref;
        ref = new Circle();
        ref.draw();

        ref = new Rectangle();
        ref.draw();

        ref = new Triangle();
        ref.draw();
    }
}
