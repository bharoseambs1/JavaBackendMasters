package com.prajakta.java8features;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapElementsWithFunction {

        public static void main(String[] args) {
            List<String> names = Arrays.asList("alice", "bob", "charlie");
            Function<String, String> toUpper = String::toUpperCase;
            List<String> upper = names.stream()
                    .map(toUpper)
                    .collect(Collectors.toList());
            System.out.println(upper);
        }
    }

