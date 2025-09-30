package com.prajakta.collection;
import java.util.Collections;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class SetCollections2 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(15, 5, 30, 10, 25));
        System.out.println("Set: " + numbers);
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}

