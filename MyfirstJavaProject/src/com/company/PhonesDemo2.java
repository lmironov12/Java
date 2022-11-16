package com.company;

public class PhonesDemo2 {
    public String model;
    public int price;
    public int memory;

    PhonesDemo2(){

    }
PhonesDemo2(String model, int price, int memory){
    this.model = model;
    this.price = price;
    this.memory = memory;
}

    PhonesDemo2(String model, int price){
        this.model = model;
        this.price = price;
    }

    public String Calling (String number){
        return number;
    }
}
