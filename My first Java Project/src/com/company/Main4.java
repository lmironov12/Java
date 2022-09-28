package com.company;


import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a;
        System.out.print("Please enter first name: ");
        a = scn.nextInt();


        if (a > 5 && a < 10) {
            System.out.print("True");
        }
            else{
            System.out.print("False");
        }
    }
}


