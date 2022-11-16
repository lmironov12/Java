package com.company;

public class MainPolymorphism {
    public static void main(String[] args) {
        Figure[] arr = new Figure[]{new Circle(), new Triangle(), new Ellipse()};
        for(int i = 0; i < arr.length; i++) {
            arr[i].draw();
        }
    }
}
