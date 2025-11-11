package com.prajakta.java8features.predefinedfunctionalinterfaces;
//Consumer — print each element with a suffix
import java.util.*;
import java.util.function.Consumer;

public class Consumer1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Consumer<String> printOk = s -> System.out.println(s + " (ok)");
        names.stream().forEach(printOk);
    }
}
/*Step-by-step Explanation:
 1. Define Consumer printOk that prints modified string.
 2. names.stream() creates a stream.
 3. forEach(printOk) applies the consumer to every element*/

