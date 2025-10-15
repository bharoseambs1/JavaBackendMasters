package com.satish.multithreading.runnablevscallable;

import java.util.concurrent.*;

public class MyCallableTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Callable Task executed by: " + Thread.currentThread().getName();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(new MyCallableTask());
        System.out.println("Doing other work...");
        String result = future.get();
        System.out.println(result);
        executor.shutdown();
    }
}
