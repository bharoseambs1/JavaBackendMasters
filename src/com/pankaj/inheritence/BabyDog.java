package com.pankaj.inheritence;

public class BabyDog extends Dog {
    void weep() {
        System.out.println("Baby Dog is weeping");
    }
    public static void main(String[] args) {
        BabyDog babyDog = new BabyDog();
        babyDog.eat();  // Inherited from Animal class
        babyDog.bark(); // Inherited from Dog class
        babyDog.weep(); // Defined in BabyDog class
    }
}
