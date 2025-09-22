package com.prajakta.multiinheritace;

public class Babydog extends Dog {
    void weap() {
        System.out.println("Weap");
    }

    public static void main(String[] args) {
        Babydog b = new Babydog();
        b.eat();
        b.bark();
        b.weap();

    }
}
