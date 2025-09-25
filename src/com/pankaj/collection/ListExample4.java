package com.pankaj.collection;
import java.util.*;
public class ListExample4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(45, 12, 78, 34, 2));
        Collections.sort(numbers);
        System.out.println("Ascending: " + numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending: " + numbers);
    }
}