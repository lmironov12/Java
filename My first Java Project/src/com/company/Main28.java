package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main28 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
                "November,", "December"};
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter name of month");
        String month = scn.nextLine();
//        for(int i = 0; i< months.length; i++){
//            if(months[i].equals(month)){
//                System.out.println(i+1);
//    }
//}

        if(Arrays.asList(months).contains(month)) {
            System.out.println(Arrays.asList(months).indexOf(month) + 1);
        }else{
            int i=0;
            for (String element: months) {
                months[i] = element.toLowerCase();
                i++;
            }
            if(Arrays.asList(months).contains(month)) {
                System.out.println(Arrays.asList(months).indexOf(month) + 1);
            }else{
                System.out.println("Error!");
            }
        }
    }
}
