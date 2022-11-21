package com.company;

public class Maininterface {
    public static void main(String[] args) {
        Printinterface car1 = new Myinterface("Audi", "A6");
        Printinterface bike1 = new Myinterface("Suzuki", "Z1");
        car1.printCar();
        bike1.printBike();
        Readinterface car2 = new Myinterface();
        car2.readCar();
        Readinterface bike2 = new Myinterface();
        bike2.readBike();
    }
}
