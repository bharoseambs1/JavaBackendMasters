package com.prajakta.java8features;

//Problem: Use stream().sorted(...) to get a sorted stream.
import java.util.*;
import java.util.stream.*;

public class StreamSortedExamle {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("c", "a", "b");
        List<String> sorted = input.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(sorted);

        // sort by length, then alphabetically
        List<String> fruits = Arrays.asList("apple","fig","banana","date");
        List<String> s2 = fruits.stream()
                .sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()))
                .collect(Collectors.toList());
        System.out.println(s2);
    }
}

//1. Stream.sorted() is lazy and returns a sorted stream.
//2. Use Comparator to control ordering in streams.