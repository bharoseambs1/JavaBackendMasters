package com.prajakta.java8features.predefinedfunctionalinterfaces;

//Supplier — generate a stream of random integers

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Supplier1 {
    public static void main(String[] args) {
        Supplier<Integer> rand = () -> new Random().nextInt(100);
        List<Integer> five = Stream.generate(rand).limit(5).collect(Collectors.toList());
        System.out.println(five);
    }
}
/*Step-by-step Explanation:
        1. Supplier provides a new random int on each call.
        2. Stream.generate(rand) creates an infinite stream.
        3. limit(5) bounds it; collect gathers results.*/

