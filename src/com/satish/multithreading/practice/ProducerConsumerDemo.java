package com.satish.multithreading.practice;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) resource.produce(i);
        });
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) resource.consume();
        });
        producer.start();
        consumer.start();
    }
}