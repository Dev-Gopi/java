package com.opss.inheritance;
class Engine{
    String engine = "Single cylinder engine";
}
class Bike extends Engine{
    String bike = "Royal enfield";
}

public class Single {
    public static void main(String[] args) {
        Bike obj = new Bike();
        System.out.println(obj.engine);
        System.out.println(obj.bike);
    }
}
