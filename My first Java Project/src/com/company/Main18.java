package com.company;

import java.util.Arrays;

public class Main18{
public static void main (String[] args) {
    int[] A12 = {1, 2, 3, 4, 5, 6, 7, 18};
    int[] B12;
    int count = 0;
    for (int i = 0; i < A12.length; i++) {
        if (A12[i] >= 18) {
            count++;
        }
    }
    B12 = new int[count];
    int index = 0;
    for (int i = 0; i < A12.length; i++) {
        if (A12[i] >= 18) {
            B12[index] = A12[i];
            index++;
        }
    }
        System.out.println(Arrays.toString(A12));
        System.out.println(Arrays.toString(B12));

        }
    }

