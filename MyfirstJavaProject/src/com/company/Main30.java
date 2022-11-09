package com.company;

import org.w3c.dom.html.HTMLImageElement;

public class Main30 {
    public static void main(String[] args){
        print();
        print2("Leonid");
        print3("Hello", "World");
        print4("Happy", "new",  "year");
        print5(18,30);
    }

    public static void print(){
        System.out.println("Hello World");
    }

    public static void print2(String message){
        System.out.println("Hello " + message);
    }

    public static void print3 (String message, String message2){
        System.out.println(message + " " + message2);
    }
    public static void print4 (String message,String message2, String message3) {
    System.out.println(message + " " + message2 + " " + message3);
    }
    public static void print5 (int hours, int minutes){
        System.out.println (hours + ":" + minutes);
    }
}





