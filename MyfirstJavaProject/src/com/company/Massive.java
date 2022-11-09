package com.company;

import java.util.Arrays;

public class Massive {
 public static void main (String [] args){
     int array [] = new int[] {1,2,3,4,5,6,7,8,9,10,12,};
     System.out.println (Arrays.toString(array));
     int array2 [] = {1,2,3,4,5};
     System.out.println(array2[3]);
     float array3 [] = {1.5f, 1.6f, 1.7f};
     System.out.println (Arrays.toString(array3));
     int [][] array4 = new int [][] {{1,2,3}, {4,5,6}, {6,7,8}};
    System.out.println(array4[2][2]);

    int[] array5 = new int[5];
    array5 [0] = 10;
    array5 [1] = 20;
    array5 [2] = 30;
    array5 [3] = 40;
    array5 [4] = 50;
    System.out.println(Arrays.toString(array5));

    String[] cars = new String[5];
    cars [0] = "Audi";
    cars [1] = "BMW";
    cars [2] = "Bentley";
    cars [3] = "Acura";
    cars [4] = "Rolls Royce";
    System.out.println(Arrays.toString(cars));
    }
}

