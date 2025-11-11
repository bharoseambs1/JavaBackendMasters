package com.satish.java8features.optionalclass;

import java.util.Optional;

public class OptionalExample1 {
    public static void main(String[] args) {
            Optional<String> opt = Optional.of("Hello");
            System.out.println(opt.get());

            Optional<String> maybe = Optional.ofNullable("abc");
            System.out.println(maybe.isPresent()); //value != null -> abc != null -> true
        }
}