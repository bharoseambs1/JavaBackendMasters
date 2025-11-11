package com.prajakta.java8features;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class ForeachWithConsumer {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("A","B","C");
        AtomicInteger index = new AtomicInteger(0);
        Consumer<String> printWithIndex = s->
                System.out.println(index.getAndIncrement() + ": " + s);
        names.stream().forEach(printWithIndex);
    }
}
