package com.shradha.Inheritance;

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Child class of Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// Child class of Dog (Grandchild of Animal)
class BabyDog extends Dog {
    void weap() {
        System.out.println("BabyDog is weaping...");
    }
    public static void main(String[] args) {
        // Create BabyDog object
        BabyDog b = new BabyDog();

        // Call all methods
        b.eat();   // from Animal
        b.bark();  // from Dog
        b.weap();  // from BabyDog
    }
}

