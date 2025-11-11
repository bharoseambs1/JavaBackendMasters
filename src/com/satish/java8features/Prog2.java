package com.satish.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Prog2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Al", "Bob", "Charlie", "Dave");
        Predicate<String> longerThan3 = s -> s.length() > 3;
        Set<String> result = names
                .stream()
                .filter(longerThan3)
                .collect(Collectors.toSet());
        System.out.println(result);


        List<String> names1 = Arrays.asList("alice", "bob", "charlie");
        Function<String, String> toUpper = String::toUpperCase;
        List<String> upper = names1.stream()
                .map(toUpper)
                .collect(Collectors.toList());
        System.out.println(upper);


        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> res = nums  //collection:1,2,3,4,5,6,7
                .stream()       //main stream:1,2,3,4,5,6,7
                .skip(2)     //substream it will skip first two i.e. 1,2 =>  3,4,5,6,7
                .limit(3)  // substream it will take only first three i.e. 3,4,5 => 3,4,5
                .collect(Collectors.toList());  //collect method used for to covert stream to collection

        //res = 3,4,5
    }
}