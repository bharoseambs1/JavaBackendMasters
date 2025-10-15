package com.satish.multithreading.practice;

class SharedResource {
    private int data;
    private boolean hasData = false;
    synchronized void produce(int value) {          //i=1, 2
        try {
            while (hasData) wait(); // wait if data is not consumed yet  wait
            data = value;           //data=1,2,3
            System.out.println("Produced: " + data);  //Produced: 1,2
            hasData = true;         //hasData=true, true
            notify(); // notify consumer
        } catch (InterruptedException e) { e.printStackTrace(); }
    }
    synchronized void consume() {
        try {
            while (!hasData) wait(); // wait if no data is produced
            System.out.println("Consumed: " + data); //Consumed: 1
            hasData = false;            //hasData=false
            notify(); // notify producer
        } catch (InterruptedException e) { e.printStackTrace(); }
    }
}