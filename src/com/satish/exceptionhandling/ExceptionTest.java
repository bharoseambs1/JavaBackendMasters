package com.satish.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
    static int age = 0;
    public static void main(String[] args) {
        String name = "Sachin";
        //Address add = null;
        Address add1 = new Address();
        add1.city = "New York";

        System.out.println("name length: "+name.length()); // NullPointerException
        //System.out.println("house number: "+add.houseNumber); // NullPointerException
        System.out.println("house number: "+add1.houseNumber); // 0
        System.out.println("city: "+add1.city.length()); // city: 8
        try {
            System.out.println("state: " + add1.state.length()); //nullPointerException
        }catch (NullPointerException ne){
            System.out.println(ne.getMessage());
        }
        System.out.println("#####################################");
        int[] numbers = {100, 220, 390};
        System.out.println("value on first index: "+numbers[0]); //100
        System.out.println("value on first index: "+numbers[1]); //220
        System.out.println("value on first index: "+numbers[2]); //390
        /*try {
            System.out.println("value on first index: " + numbers[3]); // ArrayIndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }*/
        System.out.println("#####################################");
        System.out.println("line 1 message");
        System.out.println("line 2 message");
        System.out.println("line 3 message");
        System.out.println("line 4 message");
        System.out.println("line 5 message");
        System.out.println("line 6 message");

        System.out.println(10 / 0);

        /*try {
            System.out.println("first line");
            System.out.println(10 / age); // ArithmeticException
            System.out.println("second line");
        } catch(ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }*/


        System.out.println("line 7 message");
        System.out.println("line 8 message");
        System.out.println("line 9 message");
        System.out.println("line 10 message");
        System.out.println("line 11 message");
        System.out.println("line 12 message");
        System.out.println("line 13 message");
        System.out.println("line 14 message");
        System.out.println("line 15 message");

        //File not found exception
        try {
            FileInputStream fis = new FileInputStream("E:\\Collabra\\abc.txt");
            int data = fis.read();
            while(data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } catch (IOException io){
            System.out.println("IOException occurred: " + io.getMessage());
        }
    }
}