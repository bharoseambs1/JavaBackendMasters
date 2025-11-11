package com.prajakta.multithreading;

class DaemonExample extends Thread {
    /*public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread running...");
        } else {
            System.out.println("User thread running...");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread name: " + Thread.currentThread().getName());
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {
        DaemonExample t1 = new DaemonExample();
        DaemonExample t2 = new DaemonExample();

        t1.setDaemon(true); // Must be set before start()
        t1.start();
        t2.start();
    }
}*/
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread is running: " + Thread.currentThread().getName());
        } else {
            System.out.println("User thread is running: " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        DaemonExample daemonThread = new DaemonExample();
        DaemonExample userThread = new DaemonExample();

        daemonThread.setDaemon(true);

        daemonThread.start();
        userThread.start();
    }
}
