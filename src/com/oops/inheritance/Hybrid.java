package com.oops.inheritance;
interface Oil{
    void start();
}
class HybridEngine implements Oil{
    @Override
    public void start(){
        System.out.println("Oil Engine Start");
    }
}
interface Battery extends Oil{
    void start();
}
class HybridCar extends HybridEngine implements Battery{
    @Override
    public void start() {
        super.start();
        System.out.println("Battery Engine Start");
    }
}
public class Hybrid {
    public static void main(String[] args) {
        HybridCar obj = new HybridCar();
        obj.start();
    }
}
