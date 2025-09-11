package com.vikas.inheritance.multilevel;

public class Test {
    public static void main(String[] args) {
        BabyDog babyDog = new BabyDog();

        babyDog.eat();  // Inherited from Animal class
        babyDog.bark(); // Inherited from Dog class
        babyDog.weep(); // Defined in BabyDog class

    }
}
