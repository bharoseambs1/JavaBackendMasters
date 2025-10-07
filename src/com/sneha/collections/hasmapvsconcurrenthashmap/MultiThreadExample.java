package com.sneha.collections.hasmapvsconcurrenthashmap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadExample {
    public static void main(String[] args) throws InterruptedException {
        // Thread-safe map for shared access
        Map<String, Integer> counter = new ConcurrentHashMap<>();
        counter.put("count", 0);

        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Task to increment the counter 1000 times
        Runnable incrementTask = () -> {
            for (int i = 0; i < 1000; i++) {
                // compute() provides an atomic, thread-safe update
                counter.compute("count", (k, v) -> v + 1);
            }
        };

        // Run the task concurrently on 4 threads
        executor.submit(incrementTask);
        executor.submit(incrementTask);
        executor.submit(incrementTask);
        executor.submit(incrementTask);

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        // Final result is guaranteed to be correct (4 * 1000 = 4000)
        System.out.println("Final Count: " + counter.get("count"));
        // Output: Final Count: 4000 (Consistent and correct)

        // Note: Attempting to use a null value here would fail:
        // counter.put("Error", null); // Throws NullPointerException
    }
}
