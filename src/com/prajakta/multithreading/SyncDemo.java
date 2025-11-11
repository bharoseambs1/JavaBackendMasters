package com.prajakta.multithreading;


    public class SyncDemo {
        public static void main(String[] args) {
            Printer printer = new Printer();
            UserThread t1 = new UserThread(printer, "Document");
            UserThread t2 = new UserThread(printer, "Image");
            t1.start();
            t2.start();
        }
    }




