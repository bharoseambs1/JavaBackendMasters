package com.prajakta.array;

public class SeriesOfFive {
    public static void main(String[] args) {
        int[] tableoffive = new int[10];

        System.out.println("Table Of Five");

        for(int i = 0; i <= 9; i++){
            tableoffive[i] = 5 * (i+1);
        }

        for(int i = 0; i <= 9; i++){
            System.out.println(tableoffive[i]);
        }

        System.out.println(tableoffive);


        int[] tableofsix = new int[10];

        System.out.println("Table Of Six");

        for(int i = 0; i <= 9; i++){
            tableofsix[i] = 6 * (i+1);
        }

        for(int i = 0; i <= 9; i++){
            System.out.println(tableofsix[i]);
        }

        System.out.println(tableoffive);
    }
}
