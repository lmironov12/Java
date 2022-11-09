package com.company;

public class Mathematics {
    public static void main(String[] args) {
        float num1 = 5.8f;
        System.out.println("Round " + Math.round(num1));

        float num2 = 5.1f;
        System.out.println("Ceil " + Math.ceil(num2));

        float num3 = 5.9f;
        System.out.println("Floor " + Math.floor(num3));

        int num4 = 50;
        int num5 = 60;

        System.out.println("Max is " + Math.max(num4, num5));
        System.out.println("Min is " + Math.min(num4, num5));
        System.out.println("Pow is " + Math.pow(9, 4));
        System.out.println("Sqrt is " + Math.sqrt(9));

        int num6;
        for (int i = 0; i < 10; i++) {
            num6 = (int) Math.round(Math.random() * 100);
            System.out.println("Random is " + num6);
        }
    }
}
