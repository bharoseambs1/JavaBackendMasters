package com.gaurav.array;
public class SeriesOfSix {
    public static void main(String[] args) {
        int[] seriesOfSix = new int[10];
        for (int i = 0; i < 10; i++) {
            seriesOfSix[i] = 6 * (i + 1);
        }
        for (int num : seriesOfSix) {
            System.out.println(num);
        }
    }
}