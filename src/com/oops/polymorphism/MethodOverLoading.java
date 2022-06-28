package com.oops.polymorphism;
class MethodOver{
    public void room(int count){
        System.out.println(count);
    }
    public void room(int count, String size, int l, int w){
        System.out.println(count+" "+size+" "+l+" "+w);
    }
    public void room(int count, String ac, String fridge){
        System.out.println(count+" "+ac+" "+fridge);
    }
    public void room(int count, String size, int l, int w, String ac, String fridge){
        System.out.println(count+" "+size+" "+l+" "+w+" "+ac+" "+fridge);
    }

    public void room(int count, String size, int l, int w, String ac, String fridge, String washingMachine){
        System.out.println(count+" "+size+" "+l+" "+" "+w+" "+ac+" "+fridge+" "+washingMachine);
    }
}

public class MethodOverLoading {
    public static void main(String[] args) {
        MethodOver obj = new MethodOver();
        obj.room(1);
        obj.room(1,"small",8,4);
        obj.room(1,"ac","fridge");
        obj.room(1,"small",8,4,"ac","fridge");
        obj.room(1,"small",8,4,"ac","fridge","washingMachine");
    }
}
