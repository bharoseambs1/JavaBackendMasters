package com.sneha.collections.map;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {  //doubly linked list it introduced in jdk 1.2
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
