package com.gaurav.opps;

public class BabyDog extends Dog {
    void weaap(){
        System.out.println("weaping");
    }

    public static void main(String[] args) {
        BabyDog obj = new BabyDog();
        obj.eat();
        obj.bark();
        obj.weaap();
    }
}
