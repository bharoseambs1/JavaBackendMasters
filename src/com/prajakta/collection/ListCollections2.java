package com.prajakta.collection;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class ListCollections2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 20, 40, 10, 50);
        System.out.println("List: " + numbers);
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        int freq = Collections.frequency(numbers, 20);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Frequency of 20: " + freq);
    }
}
