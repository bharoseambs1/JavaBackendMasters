package com.prajakta.collection;
import java.util.*;
public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(30); // duplicate ignored
        System.out.println("TreeSet: " + set);
    }
}
