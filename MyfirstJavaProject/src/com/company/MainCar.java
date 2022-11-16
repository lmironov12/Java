package com.company;

public class MainCar {
    public static void main(String[] args) {
        MainCar2 car1 = new MainCar2();
        MainCar2 car2 = new MainCar2("BMW", "X5");

        MainEngine car3 = new MainEngine("Audi", "Mercedes-Benz","Diesel");
        MainGearbox car4 = new MainGearbox("Opel", "Astra", "Atomatic");

        car1.mark = "Audi";
        car1.model = "A7";

        System.out.println(car1.mark + " " + car1.model);
        System.out.println(car2.mark + " " + car2.model);
        System.out.println(car3.mark + " " + car3.model + " " + car3.FuelType);
        System.out.println(car4.mark + " " + car4.model + " " + car4.Gearbox);

    }
}
