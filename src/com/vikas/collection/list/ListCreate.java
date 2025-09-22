package com.vikas.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListCreate {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");
        System.out.println("Fruits List:");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}