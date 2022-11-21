package com.company;

public class MainCountry {
    public static void main(String[] args) {
        PrintCapital country1 = new CountryResolve("Estonia");
        PrintCapital country2 = new CountryResolve("Finland");
        PrintCapital country3 = new CountryResolve("France");

        country1.printCapital("Tallinn");
        country2.printCapital("Helsinki");
        country3.printCapital("Paris");
    }
}
