package com.opss.inheritance;
class Engine{
    String engine = "Single cylinder engine";
    Engine(){
    }
}
class Bike extends Engine{
    String bike = "Royal enfield";
    Bike(){
        super();
    }
}
public class Single {
    public static void main(String[] args) {
        Bike obj = new Bike();
        System.out.println(obj.engine);
        System.out.println(obj.bike);
    }
}
