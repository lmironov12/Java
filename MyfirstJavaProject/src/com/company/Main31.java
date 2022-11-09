package com.company;

public class Main31 {
    public static void main(String[] args) {

        int num1, num2;
        num1 = num2 = 5;
        int summa = function(num1, num2);
        System.out.println(summa);
    }
    public static int function(int num1, int num2){
    int result;
    result = num1 + num2;
    return result;

    }
    public static void function2(int num1, int num2){
        int result = num1 + num2;
        result = num1 + num2;
        System.out.println(result);
    }
}

