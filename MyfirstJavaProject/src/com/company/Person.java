package com.company;

public class Person {
    public static void main(String[] args) {
        PersonDemo person1 = new PersonDemo();
        PersonDemo person2 = new PersonDemo();
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.height);
        person1.hairColor = "Brown";
        System.out.println(person2.weight);
        System.out.println(person1.height);
        System.out.println(person1.hairColor);
        person2.name = "John";
        person2.hairColor = "Black";
        System.out.println(person2.name + " " + person2.age + " " + person2.height + " " + person2.hairColor);
        person1.say(" John ");

    }
}
