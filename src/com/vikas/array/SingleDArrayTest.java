package com.vikas.array;

public class SingleDArrayTest {

    public static void main(String[] args) {

        System.out.println("*********** Series of 5 ***********");

        int[] seiesOfFive = new int[10];  //0-9

        for (int i = 0; i <= 9; i++) {
            seiesOfFive[i] = 5 * (i + 1);
        }
        for (int i = 0; i <= 9; i++) {
            System.out.println(seiesOfFive[i]);
        }
        System.out.println(seiesOfFive);

        System.out.println("*********** Series of 6 ***********");

        int[] seiesOfSix = new int[10];

        int sixTable = 6;

        for (int i = 0; i <= 9; i++) {
            System.out.println(sixTable * (i + 1));
        }

    }
}