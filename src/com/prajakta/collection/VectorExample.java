package com.prajakta.collection;

import java.util.*;
public class VectorExample {
    public static void main(String[] args) {
        List<String> list = new Vector<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Java"); // duplicate allowed
        list.add(null);
        System.out.println("Vector: " + list);
    }
}
