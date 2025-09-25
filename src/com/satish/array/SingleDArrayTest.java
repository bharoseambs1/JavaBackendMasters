package com.satish.array;

import java.util.Arrays;

public class SingleDArrayTest {
    public static void main(String[] args) {

       // int[] arr = {10, 20, 30, 40, 50};  //index values: 0 1 2 3 4
        //we are playing with multiple values
        //in these case we mostly used loops for, while, do-while, for each(collection)
       /* System.out.println(arr[0]); //10
        System.out.println(arr[3]); //40
        try {
            System.out.println(arr[-1]);
        }catch (Exception e){
            System.out.println(e);
        }*/
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        //at com.satish.array.SingleDArrayTest.main(SingleDArrayTest.java:11)

        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 5
        //at com.satish.array.SingleDArrayTest.main(SingleDArrayTest.java:11)

        //System.out.println(arr[4]); //code is not get executed: gaurav, vakas, 50


        //int[] seiesOfTwo = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        int[] seiesOfTwo = new int[10];  //0-9
        seiesOfTwo[0] = 2;
        seiesOfTwo[1] = 4;
        seiesOfTwo[2] = 6;
        seiesOfTwo[3] = 8;
        System.out.println("on line no 33");
        seiesOfTwo[4] = 10;
        seiesOfTwo[5] = 12;
        seiesOfTwo[6] = 14;
        seiesOfTwo[7] = 16;
        System.out.println("on line no 38");
        seiesOfTwo[8] = 18;
        try {
            seiesOfTwo[9] = 20;
            seiesOfTwo[10] = 22;
        }catch (Exception e){}


        //Arrays -- Collections
        System.out.println("on line no 43");
        for (int i : seiesOfTwo){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("####################Series of 3#################");


        int[] seiesOfThree = new int[10];  //0-9
        /*seiesOfThree[0] = 3;
        seiesOfThree[1] = 6;
        seiesOfThree[2] = 9;
        seiesOfThree[3] = 12;
        seiesOfThree[4] = 15;
        seiesOfThree[5] = 18;
        seiesOfThree[6] = 21;
        seiesOfThree[7] = 24;
        seiesOfThree[8] = 27;
        seiesOfThree[9] = 30;*/

        for(int i = 0; i <= 9; i++){
            seiesOfThree[i] = 3 * (i+1);
        }


        for(int i = 0; i <= 9; i++){
            System.out.println(seiesOfThree[i]);  //0,1,..,9  //seiesOfTwo[0] = 3 ...6..30
        }


        System.out.println(seiesOfThree);











    }
}