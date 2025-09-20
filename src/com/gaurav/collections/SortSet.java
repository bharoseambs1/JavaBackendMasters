package com.gaurav.collections;

import java.util.*;

public class SortSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(10,20, 50, 40 ,30));
        System.out.println("Original Set: " + numbers);

        List<Integer> list = new ArrayList<>(numbers);
        Collections.sort(list);

        System.out.println("Sorted List (from Set): " + list);

    }
}
