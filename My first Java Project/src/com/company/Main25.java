package com.company;

import java.util.Scanner;

public class Main25 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = 0;
        int total_letters = 0;
        int total_words = 0;

        System.out.println("PLease write sentences or word : ");
        String someString = scn.nextLine();
        System.out.println("Please write some letter: ");
        char someChar = scn.next().charAt(0);
String [] words = someString.split(" ");
        for(int i = 0; i < someString.length(); i++) {
            if (someString.charAt(i) == someChar) {
                count++;
            }
            if (someString.charAt(i) != ' ') {
                total_letters++;
            }
            for(String element : words){
                if(!element.equals("")){
                    total_words++;
                }
            }
            System.out.println("In a sentences " + someString + " letter' " + someChar + " ' seems " + count + " times");
            System.out.println("Total letters in sentences " + someString + " " + total_letters + "PC");
            System.out.println("Total words: " + total_words);
       break;
        }
    }
}