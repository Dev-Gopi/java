package com.opss.interfacejava;
interface FuncInterface{
    void print();
    default void run(){
        System.out.println("Run calling");
    }
}

public class FunctionalInterface {
    public static void main(String[] args) {
        FuncInterface obj = new FuncInterface(){
            @Override
            public void print() {
                System.out.println("Welcome into Functional Interface");
            }
        };
        obj.print();
        obj.run();

        FuncInterface objfunc=() -> System.out.println("Welcome into Functional Interface with lambda");
        objfunc.print();
        objfunc.run();
    }
}
