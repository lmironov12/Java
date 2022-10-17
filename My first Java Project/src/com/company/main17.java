package com.company;

public class main17 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            if (i!=0 && i!=1) {
                sum += array[i];
            }
        }
            System.out.println(sum);
        }
    }


//Нужно найти сумму всех значений данного массива