package com.company;

public class Fiobonachhi {
    public static void main(String[] args) {
        int num1, num2, result;
        num1 = 0;
        num2 = 1;
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 0; i < 10; i++) {
            result = num1 + num2;
            System.out.print(result + " ");
            num1 = num2;
            num2 = result;
        }
    }
}


