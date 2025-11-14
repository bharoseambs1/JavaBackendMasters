package com.prajakta.java8features.predefinedfunctionalinterfaces;

//  Predicate — filter by condition

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        Predicate<Integer> isEven = n -> n % 2 == 0;
        List<Integer> evens = nums.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(evens);
    }
}
/*Step-by-step Explanation:
   1. Predicate isEven returns true for evens.
   2. filter(isEven) retains those elements.
   3. collect produces the list.*/

