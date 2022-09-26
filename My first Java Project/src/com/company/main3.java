package com.company;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int num, num2, num3, result;
        System.out.println("Please enter first number:");
        num = scn.nextInt();
        System.out.println("Please enter second number:");
        num2 = scn.nextInt();
        result = num + num2;
        System.out.print("Sum of two number is: " + result);
    }
}
