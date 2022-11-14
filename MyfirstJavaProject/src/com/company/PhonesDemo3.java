package com.company;

public class PhonesDemo3 extends PhonesDemo2{
    public String system;
    public String cpu;

    PhonesDemo3(String model, int price, int memory, String system, String cpu){
        super(model, price, memory);
        this.system = system;
        this.cpu = cpu;

    }
}
