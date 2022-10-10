package com.company;

import java.util.Scanner;

public class Main9 {
    public static void main(String [] args){
        int num1, num2, result;
        char sym;
        Scanner scn = new Scanner (System.in);
        System.out.print( "Please enter first number: " + "\n");
        num1 = scn.nextInt();
        System.out.print( "Please enter symbol: " + "\n");
        sym = scn.next().charAt(0);
        System.out.print ("Please enter second number:" + "\n");
        num2 = scn.nextInt();

        if(sym != '*' && sym != '/' && sym != '+' && sym != '-') {
            System.out.print("Wrong operation!" + "\n");
            System.out.print("Try to use (*, /, +, -)" + "\n");
            sym = scn.next().charAt(0);
        }
            switch (sym){
                case '*':
                    result=  num1 * num2;
                    System.out.println ("Result is " + result);
                    break;
                case '/':
                    result = num1 / num2;
                    System.out.println ("Result is " + result);
                    break;
                case '+':
                    result = num1 + num2;
                    System.out.println ("Result is " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println ("Result is " + result);
                    break;
        }  System.out.print("Hello World");
    }
}
