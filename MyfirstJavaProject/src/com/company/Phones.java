package com.company;

public class Phones {
    public static void main(String[] args) {
        PhonesDemo iPhone = new PhonesDemo();
        PhonesDemo Samsung = new PhonesDemo();
        PhonesDemo2 Nokia = new PhonesDemo2();
        //Create Object

        PhonesDemo Xiaomi = new PhonesDemo("Xiamoi AA", 499, 64);
        PhonesDemo Google = new PhonesDemo("Google PXL", 999, 65);

        PhonesDemo2 Motorola = new PhonesDemo2("Motorola X6", 99, 2);
        PhonesDemo2 StreetPhone = new PhonesDemo2("StreetPhone GGlass",1 );

        PhonesDemo3 Huawei = new PhonesDemo3("Huawei XP400", 379, 65, "Android", "Intelcore");

        Nokia.model = "Nokia 3310";
        Nokia.price = 79;
        Nokia.memory = 1;
        iPhone.model = "iPhone 13 Pro";
        iPhone.price = 1190;
        Samsung.model = "Samsung Galaxy S";
        Samsung.price = 1390;

        System.out.println("History of smartphones:");
        System.out.println(iPhone.model + " " + iPhone.price + "$ " + iPhone.memory + "GB ");
        System.out.println(Samsung.model + " " + Samsung.price + "$ " + Samsung.memory + "GB ");
        System.out.println(Xiaomi.model + " " + Xiaomi.price + "$ " + Xiaomi.memory2 + "GB ");
        System.out.println(Google.model + " " + Google.price + "$ " + Google.memory2 + "GB ");
        System.out.println(Nokia.model + " " + Nokia.price + "$ " + Nokia.memory + "GB ");

        System.out.println(Huawei.model + " " + Huawei.price + "$ " + Huawei.memory + "GB " + Huawei.system + " " + Huawei.cpu);

        System.out.println(StreetPhone.model + " " + StreetPhone.price + "$ ");
        System.out.println(Nokia.Calling("Calling +372 5841 5871"));



    }
}
