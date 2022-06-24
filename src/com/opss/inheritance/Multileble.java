package com.opss.inheritance;
class Cpu{
    String cpu = "Inter Core i3 11gen";
    Cpu(){
    }
}
class Motherboard extends Cpu{
    String motherboard = "Gigabyte GA-H61M S1 Motherboard";
    Motherboard(){
        super();
    }
}
class Computer extends Motherboard{
    String computer = "Hp";
    Computer(){
        super();
    }
}
public class Multileble {
    public static void main(String[] args) {
        Computer obj = new Computer();
        System.out.println(obj.computer);
        System.out.println(obj.motherboard);
        System.out.println(obj.cpu);
    }
}
