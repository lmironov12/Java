package com.company;

import java.util.Arrays;

public class Massive2 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
