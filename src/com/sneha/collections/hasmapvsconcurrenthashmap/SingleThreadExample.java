package com.sneha.collections.hasmapvsconcurrenthashmap;

import java.util.HashMap;
import java.util.Map;

public class SingleThreadExample {
    public static void main(String[] args) {
        // Safe and fast in a single-threaded context.
        Map<String, Integer> userPoints = new HashMap<>();

        userPoints.put("Alice", 100);
        userPoints.put("Bob", 150);
        userPoints.put(null, 50); // Null key is allowed

        System.out.println("Alice's Points: " + userPoints.get("Alice"));
        // Output: Alice's Points: 100
    }
}
// Note: If multiple threads access this map without external synchronization,
// the data can be corrupted, leading to an inconsistent state or infinite loops.