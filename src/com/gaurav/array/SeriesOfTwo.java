package com.gaurav.array;

public class SeriesOfTwo {
    public static void main(String[] args) {
        int[] seriesOfTwo = new int[10];
        seriesOfTwo[0] = 2;
        seriesOfTwo[1] = 4;
        seriesOfTwo[2] = 6;
        seriesOfTwo[3] = 8;
        seriesOfTwo[4] = 10;
        seriesOfTwo[5] = 12;
        seriesOfTwo[6] = 14;
        seriesOfTwo[7] = 16;
        seriesOfTwo[8] = 18;
        seriesOfTwo[9] = 20;

        for (int i : seriesOfTwo){
            System.out.println(i);
        }

        int[] seriesOfThree = new int[10];
        for(int i=0; i<=9; i++){
            seriesOfThree[i] = 3*(i  +1);
        }
        for(int num : seriesOfThree){
            System.out.println(num);
        }


    }
}