package com.company;

public class Main32 {
    public static void main(String[] args) {
        int[] numbers = {34, 112, 8, 38, 42, 26};
        System.out.println("Max value in array is " + getMaxValue(numbers));
        System.out.println("Min value in array is " + getMinValue(numbers));
    }

    public static int getMaxValue(int[] numbers){
        int max;
        max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;

    }

    public static int getMinValue(int[] numbers){
        int min;
        min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }
}