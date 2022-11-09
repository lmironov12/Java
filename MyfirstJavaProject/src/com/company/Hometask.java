package com.company;

public class Hometask {
    public static void main (String[] args){
        String FirstName = "Leonid";
        String LastName = "Mironov";
        int i = 0;
        while (true){
            if (i>9){
                break;
            }
        i++;
        System.out.println(FirstName);

        if (i==10){
            System.out.println(FirstName + " " + LastName);
        }
        }
    }
}

//Задание 2:
//С помощью Wild Cycle повторить своё имя 10 раз, но при этом на 11 раз вывести имя и фамилию.