package com.opss.interfacejava;
interface Calculator{
    public void sum(int ... num);
    public void sub(int num, int num0);
    public void mux(int num, int num0);
    public void div(int num, int num0);
}
class Calimp implements Calculator{

    @Override
    public void sum(int... num) {
        int num0 = 0;
        for (int val:
             num) {
            num0 += val;
        }
        System.out.println("the sum is "+num0);
    }

    @Override
    public void sub(int num, int num0) {
        System.out.println("the sub is "+(num-num0));
    }

    @Override
    public void mux(int num, int num0) {
        System.out.println("the mux is "+(num*num0));
    }

    @Override
    public void div(int num, int num0) {
        System.out.println("the div is "+(num/num0));
    }
}
public class Interfacejava {
    public static void main(String[] args) {
        Calimp obj = new Calimp();
        obj.sum(10,20,30);
        obj.sub(10,5);
        obj.mux(30,20);
        obj.div(100,10);
    }
}
