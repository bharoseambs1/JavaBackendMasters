package com.satish.collection;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Java"); // duplicate allowed
        list.add(null);
        System.out.println("ArrayList: " + list);

        //default size of arraylist is 10
        //it increases by 50% when it reaches its capacity
    }
}
