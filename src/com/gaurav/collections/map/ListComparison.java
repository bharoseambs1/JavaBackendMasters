package com.gaurav.collections.map;

// Demonstrates basic operations and performance differences between ArrayList and LinkedList

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComparison {
    public static void main(String[] args) {
        // ArrayList: backed by a dynamic array, fast random access, slower insert/remove in middle
        List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add(1, "X"); // Insert at index 1
        System.out.println("ArrayList: " + arrayList);  //A:0 X:1 B:2 C:3
        System.out.println("Accessing element at index 3: " + arrayList.get(3)); // Accessing element at index 3

        // LinkedList: backed by doubly-linked list, fast insert/remove at ends, slower random access
        List<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add(1, "X"); // Insert at index 1
        System.out.println("LinkedList: " + linkedList);
        System.out.println("Accessing element at index 3 from LinkedList: " + linkedList.get(3));

        // Accessing element at index 2
        System.out.println("ArrayList get(2): " + arrayList.get(2)); // Fast
        System.out.println("LinkedList get(2): " + linkedList.get(2)); // Slower

        // Removing element at index 1
        arrayList.remove(1); // Slower for large lists
        linkedList.remove(1); // Faster for large lists
        System.out.println("ArrayList after remove: " + arrayList);
        System.out.println("LinkedList after remove: " + linkedList);

        // Iterating over both lists
        System.out.print("ArrayList iteration: ");
        for (String s : arrayList) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.print("LinkedList iteration: ");
        for (String s : linkedList) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
