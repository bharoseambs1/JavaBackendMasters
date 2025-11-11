package com.prajakta.java8features;

import java.util.*;


public class CreateStream {
                public static void main(String[] args) {
            List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
            names.stream().forEach(System.out::println);
        }
    }

