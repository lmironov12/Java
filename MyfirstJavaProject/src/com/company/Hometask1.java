package com.company;

import java.util.Scanner;

public class Hometask1 {
    public static void main (String[] args){
        int num1, num2, result;
        boolean isTrue = true;
        Scanner scn = new Scanner(System.in);
        System.out.println("This is a game!");
        System.out.println("Game rules: First number is secret. Sum of two numbers must be lowe than 100");
        num1 = (int) Math.round(Math.random() * 100);
        System.out.println("This is a game! ");
        System.out.println("PLease enter second number ");
        num2 = scn.nextInt();
        while(isTrue) {
            if (num2 < 15) {
                System.out.println("Second number must be bigger than 15");
                System.out.println("Please enter second number again");
                num2 = scn.nextInt();
            } else {
                result = num1 = num2;
                if (result < 100) {
                    System.out.println("You have won the game because sum of two number was " + result);
                } else {
                    System.out.println("Game over because sum of two number was " + result);
                }
                break;
            }
        }
    }
}






//Задание:
//Сумма двух чисел должна быть меньше 100. Если больше - проиграл.
//Одно число вводит пользователь, другое случайное. Число, которое вводит пользователь не должно быть больше 15.
