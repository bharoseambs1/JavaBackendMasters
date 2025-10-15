package com.satish.multithreading.practice;

class DownloadTask extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Downloading file part " + i);
            try {
                Thread.sleep(5000); // simulating time to download
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Download completed by " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println("Main thread started");
        DownloadTask t1 = new DownloadTask();
        t1.start();
        System.out.println("Main thread finished");
    }
}