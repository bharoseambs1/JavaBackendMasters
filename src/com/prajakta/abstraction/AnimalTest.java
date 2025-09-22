package com.prajakta.abstraction;

public class AnimalTest {
    public static void main(String[] args){

        Animal cat = new Cat();
        //cat.displayAnimalSound();
        System.out.println("cat Makes sound" +cat.makesound());


        Animal dog = new Dog();
        System.out.println("Dog Makes sound");// +dog.makesound());
        //dog.displayAnimalSound();

    }
}
