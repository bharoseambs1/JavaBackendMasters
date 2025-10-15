package com.satish.multithreading.executors;

public class Task implements Runnable{

    private int taskId;

    public Task(int taskId){
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is running on thread: " + Thread.currentThread().getName());
    }
}