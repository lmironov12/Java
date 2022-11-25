package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDate object = LocalDate.now();
        LocalTime object2 = LocalTime.now();
        LocalDateTime object3 = LocalDateTime.now();

        System.out.println(object3);
        DateTimeFormatter format_object3 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatted_object3 = object3.format(format_object3);
        System.out.println(formatted_object3);

//        System.out.println(object);
//        System.out.println(object2);

    }
}
