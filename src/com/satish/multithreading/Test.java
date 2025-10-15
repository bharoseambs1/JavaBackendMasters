package com.satish.multithreading;

public class Test {
    public static void main(String[] args) {
        //we can create the object of concreate/complete class
        //to create the objject we need to call the constructor of the class
        //when the constructor is called memory is allocated to the object--object is created
        //new keyword is used to create the object
        Demo demo = new Demo();
        Demo demo1 = new Demo();

        System.out.println("Thread name from main method: " + Thread.currentThread().getName());

        //demo.start();//start method internally calls the run method: then this thread is moved to the ready state
        //after some time the thread scheduler allocates the CPU to the thread
        //then the run method is executed
        demo.run();//run method is called directly: normal method call  --> 1 2 3 .. 19 20
        demo1.run();//run method is called directly: normal method call --> 1 2 3 .. 19 20
        System.out.println("########################################################");
        demo.start();//run method is called directly: normal method call  --> 1 2 3 .. 19 20
        demo1.start();//run method is called directly: normal method call --> 1 2 3 .. 19 20
    }
}
