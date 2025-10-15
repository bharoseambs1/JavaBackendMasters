package com.satish.multithreading.synchronization;

class Printer {
    // synchronized method
    synchronized void printDocuments(String docType) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " printing " + docType + " - page " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // synchronized block
    void printImages(String imgType) {
        synchronized (this) {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " printing " + imgType + " - image " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}