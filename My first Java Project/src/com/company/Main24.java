package com.company;

public class Main24 {
public static void main (String[] args) {
    String someString = "elephant";
    char someChar = 'e';
    int count = 0;
    int total_letters = 0;
    for (int i = 0; i < someString.length(); i++) {
        if (someString.charAt(i) == someChar) {
            count++;
        }
        if (someString.charAt(i) != ' '){
            total_letters++;
        }
    }
    System.out.println("In a sentences " + someString + "letter' " + someChar + " ' seems " + count + " times");
}
}






