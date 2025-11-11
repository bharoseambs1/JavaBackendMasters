package com.satish.java8features.optionalclass;

import java.util.Optional;
public class OptionalExample3 {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        Optional<String> empty1 = Optional.ofNullable(null);

        System.out.println(empty.orElse("accountant"));
        System.out.println(empty1.orElse("accountant for empty1"));

        System.out.println(empty.orElseGet(() -> expensiveDefault()));
    }
    static String expensiveDefault() {
        System.out.println("Generating expensive default...");
        return "expensive-default";
    }
}