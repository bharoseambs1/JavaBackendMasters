package com.prajakta.collection;

import java.util.*;
public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Java"); // duplicate allowed
        list.add(null);
        System.out.println("LinkedList: " + list);
    }
}
