package com.company;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int date;
        System.out.print("When is Happy New Year?");
        date = scn.nextInt();

         switch (date){
            case 1:
                System.out.print ("Happy New Year!");
                break;
            default:
                System.out.print("We work");
    }
    }}

//     Если дата равна 1, то будет то выводим Happy New Year, а иначе мы работаем.
