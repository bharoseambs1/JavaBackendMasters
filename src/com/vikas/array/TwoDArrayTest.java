package com.vikas.array;

public class TwoDArrayTest {

    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        int value = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = value++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " \t");
            }
            System.out.println();
        }
    }
}