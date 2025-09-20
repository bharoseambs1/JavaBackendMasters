package com.gaurav.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindMinMaxFromSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(10, 5, 20, 50, 30));
        System.out.println("Set: " + numbers);

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }
}
