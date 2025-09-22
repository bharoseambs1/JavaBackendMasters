package com.gaurav.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMinMaxFrequency {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 20, 40, 10, 50);
        System.out.println(numbers);

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        int freq = Collections.frequency(numbers, 20);

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Frequency of 20: " + freq);
    }
}
