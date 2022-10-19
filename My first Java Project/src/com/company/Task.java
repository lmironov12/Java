//Ввести одну цифру от 1 до 12 и вывести название месяца
package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
                "November,", "December"};
        Scanner scn = new Scanner(System.in);
        int num;
        System.out.println("Please enter one digit from 1 until 12 and get a name of month: ");
        num = scn.nextInt();
        while(true){
            if(num>12 || num<1){
                System.out.println("Wrong digit, try to use from 1 until 12");
                num = scn.nextInt();
            }else{
                System.out.println(month[num-1]);
            break;
            }
        }
    }
}






