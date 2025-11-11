package com.prajakta.java8features;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class FilterElements {

    public static void main(String[] args) {
            List<String> names = Arrays.asList("Al", "Bob", "Charlie", "Dave");
            Predicate<String> longerThan3 = s-> s.length() > 3;
            List<String> result = names.stream()
                    .filter(longerThan3)
                    .collect(Collectors.toList());
            System.out.println(result);
        }
    }

