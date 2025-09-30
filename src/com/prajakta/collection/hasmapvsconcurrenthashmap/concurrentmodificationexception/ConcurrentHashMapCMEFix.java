package com.prajakta.collection.hasmapvsconcurrenthashmap.concurrentmodificationexception;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentHashMapCMEFix {
    public static void main(String[] args) throws InterruptedException {
        // 2. Safe collection: ConcurrentHashMap is thread-safe
        Map<String, Integer> userScores = new ConcurrentHashMap<>();
        userScores.put("Alice", 100);
        userScores.put("Bob", 150);
        userScores.put("Charlie", 200);

        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Thread 1: Iterating over the map (Fail-safe)
        Runnable iteratorTask = () -> {
            System.out.println("\n--- Iterator Thread Start ---");
            for (String name : userScores.keySet()) {
                System.out.println("Reading: " + name);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {}
            }
            System.out.println("--- Iterator Thread End ---");
        };

        // Thread 2: Modifying the map (Safe modification)
        Runnable modifierTask = () -> {
            try {
                Thread.sleep(50);
                // Structural modification while the other thread is iterating
                userScores.put("David", 250);
                System.out.println("\nModifier added 'David' (Modification is safe)");
            } catch (InterruptedException ignored) {}
        };

        executor.execute(iteratorTask);
        executor.execute(modifierTask);

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);

        System.out.println("\nFinal Map Size: " + userScores.size());
    }
}