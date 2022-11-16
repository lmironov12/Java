package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Reader {
    public static void main(String[] args) {
        BufferedReader file = null;
        try {
            file = new BufferedReader(new FileReader("src/com/company/Leonid.txt"));
            String line;
            while ((line = file.readLine()) != null){
                System.out.println(line);
                String [] parts = line.split(" ");
                System.out.println(Arrays.toString(parts));
            }
        }catch (IOException e) {
            System.out.println(e);
        }
    }
}
