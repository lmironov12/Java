package com.company;

public class CountryResolve implements PrintCapital{
    String country;
    CountryResolve(String country){
        this.country = country;
    }
    @Override
    public void printCapital(String capital){

        System.out.println("The capital of " + country + " is " + capital);
    }
}
