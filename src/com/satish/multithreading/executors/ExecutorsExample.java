package com.satish.multithreading.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsExample {
    public static void main(String[] args) {
        //Thread t1 = new Thread(new Task(2));
        //Executor
        //ExecutorService executorServiceFixed = Executors.newFixedThreadPool(2);
        ExecutorService executorServiceCache = Executors.newCachedThreadPool();
        for (int i = 0; i <= 10; i++) {
            //Thread t1 = new Thread(new Task(i));
            //t1.start();
            //executorServiceFixed.submit(new Task(i));
            executorServiceCache.submit(new Task(i));
        }


       /* ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        scheduledExecutorService.scheduleAtFixedRate(new Task(9), 0, 3, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();*/
        //executorServiceFixed.shutdown();
        //executorServiceCache.shutdown();

    }
}