package com.satish.collection.hasmapvsconcurrenthashmap.concurrentmodificationexception;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class HashMapCMEExample {
    public static void main(String[] args) throws InterruptedException {
        // 1. Unsafe collection: HashMap is NOT thread-safe
        Map<String, Integer> userScores = new HashMap<>();
        userScores.put("Alice", 100);
        userScores.put("Bob", 150);
        userScores.put("Charlie", 200);

        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Thread 1: Iterating over the map
        Runnable iteratorTask = () -> {
            try {
                for (String name : userScores.keySet()) {
                    System.out.println("Reading: " + name);
                    // Artificially slow down iteration to increase chance of concurrent modification
                    Thread.sleep(100);
                }
            } catch (Exception e) {
                // This will be thrown by the fail-fast iterator
                System.err.println("\n*** EXCEPTION CAUGHT ***");
                e.printStackTrace(System.err);
            }
        };

        // Thread 2: Modifying the map
        Runnable modifierTask = () -> {
            try {
                // Wait for the other thread to start iterating
                Thread.sleep(50);
                // Structural modification while the other thread is iterating
                userScores.put("David", 250);
                System.out.println("\nModifier added 'David'");
            } catch (InterruptedException ignored) {}
        };

        executor.execute(iteratorTask);
        executor.execute(modifierTask);

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
    }
}