package com.prajakta.collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ListCollections1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(50, 10, 40, 30, 20));
        System.out.println("Original List: " + numbers);
        Collections.sort(numbers); // Ascending
        System.out.println("Sorted Ascending: " + numbers);
        Collections.sort(numbers, Collections.reverseOrder()); // Descending
        System.out.println("Sorted Descending: " + numbers);
        Collections.reverse(numbers); // Reverse
        System.out.println("Reversed List: " + numbers);
    }
}
