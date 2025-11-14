package com.prajakta.java8features.predefinedfunctionalinterfaces;
// Function — map objects to DTO strings

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Function1 {
    static class User { String first; String last; User(String f, String l){first=f; last=l;} }
    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User("A","X"), new User("B","Y"));
        Function<User, String> toLabel = u -> u.first + " " + u.last;
        List<String> labels = users.stream().map(toLabel).collect(Collectors.toList());
        System.out.println(labels);
    }

}
/*1. Define Function to transform each User.
 2. map(toLabel) applies conversion.
 3. collect stores results.*/
