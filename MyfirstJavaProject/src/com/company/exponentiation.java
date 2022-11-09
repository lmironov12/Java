package com.company;

public class exponentiation {
    public static void main(String[] args) {
        int num = 5;
        int result = 1;
        int range = 1;

        while (true) {
            result = result * num;
            System.out.println(num + "**" + range + " = " + result);
            range++;
            if (range > 3) {
                break;
            }
        }
    }
}
