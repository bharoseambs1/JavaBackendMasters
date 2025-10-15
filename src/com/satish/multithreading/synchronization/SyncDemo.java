package com.satish.multithreading.synchronization;

import java.util.logging.Logger;

public class SyncDemo {
    public static void main(String[] args) {
        Printer printer = new Printer();

        UserThread t1 = new UserThread(printer, "Document");
        UserThread t2 = new UserThread(printer, "Image");

        t1.start();
        t2.start();
        t2.start();

        //t2.setDaemon(true);
        /*Logger log = new Logger();

        System.Logger*/

        //t1, t2 thread schedular will decide the execution order
        //if t1 is executing and t2 comes for execution then t2 will wait until t1 completes its execution
        //after t1 completes its execution then t2 will start its execution
    }
}