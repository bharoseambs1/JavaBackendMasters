package com.prajakta.collection;
import java.util.*;
public class SetCollections1 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(50, 10, 40, 30, 20));
        System.out.println("Original Set: " + numbers);
        List<Integer> list = new ArrayList<>(numbers);
        Collections.sort(list);
        System.out.println("Sorted List (from Set): " + list);
    }
}
