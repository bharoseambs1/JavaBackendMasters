package com.satish.multithreading;

import javax.swing.plaf.TableHeaderUI;

public class Demo extends Thread {
    String d1 = "Hello";
    String d2 = "World";

    void display(){
        System.out.println("Display method: " + d1 + " " + d2);
    }

    /*public Demo() {
    }*/

    /*public Demo(String d1, String d2) {
        this.d1 = d1;
        this.d2 = d2;
    }*/
    @Override
    public void run() {
        System.out.println("Thread name from run method: " + Thread.currentThread().getName());
        for (int i = 1; i <= 20; i++) {  //thread execution
            System.out.print(i + " ");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("");
    }
}