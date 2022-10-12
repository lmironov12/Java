package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main16{
    public static void main (String[] args) {
    String names[];
        Scanner scn = new Scanner(System.in);
        System.out.println ("Please enter length of array");
        int length  = scn.nextInt();
        names = new String [length];
        for(int i=0; i< names.length; i++){
            System.out.print("Names[" + i + "] = ");
            names[i] = scn.next();
        }
        System.out.print (Arrays.toString(names));
    }
}

