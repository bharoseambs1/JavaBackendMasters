package com.satish.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        /*Parent obj = new Child();
        try {
            obj.show();
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }*/

        /*try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }

        //try {  simple try-catch
        //try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) { try with resource
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }*/

        /*try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Logging exception");
            try{
                throw e;
            }catch (ArithmeticException ae){
                System.out.println("Rethrown exception caught: " + ae.getMessage());
                ae.printStackTrace();
            }// rethrowing
        }

        System.out.println("Rest of the code");*/


        System.out.println(test());  //


    }

    static int test() {
        try {
            return 10;
        } catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            return 20;
        }
    }

}