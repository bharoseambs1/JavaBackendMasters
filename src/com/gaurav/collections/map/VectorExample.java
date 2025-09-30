package com.gaurav.collections.map;

import java.util.List;
import java.util.Vector;

// Vector is synchronized, thread-safe but slower than ArrayList
// Vector is a legacy class, it was introduced in JDK 1.0
// It is similar to ArrayList but with two main differences:
// 1. Synchronization: Vector is synchronized, meaning it is thread-safe and can be
//    safely accessed by multiple threads simultaneously. ArrayList, on the other hand,
//    is not synchronized and is not thread-safe.
// 2. Growth Policy: When a Vector needs to grow, it doubles its size by default.
//    In contrast, an ArrayList increases its size by 50% when it needs to grow.
// Because of these differences, Vectors are generally slower than ArrayLists
// due to the overhead of synchronization. Therefore, if thread safety is not a concern,
// it is recommended to use ArrayList for better performance.
public class VectorExample {  //legacy class, synchronized it introduced in jdk 1.0
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