package com.opss.generics;
class MyGenerics<T>{
    T n;

    public T get() {
        return n;
    }

    public void set(T n) {
        this.n = n;
    }
}
class MyGenericsNumb<T extends Number>{
    T n;

    public T get() {
        return n;
    }

    public void set(T n) {
        this.n = n;
    }
}
public class Generics {
    public static void main(String[] args) {
        MyGenerics obj = new MyGenerics();
        obj.set("gopi");
        System.out.println(obj.get());
        obj.set(10);
        System.out.println(obj.get());
        MyGenericsNumb<Integer> obj1 = new MyGenericsNumb();
        obj1.set(10);
        System.out.println(obj.get());
        System.out.println(obj.getClass().getName());
        System.out.println(obj1.getClass().getName());
    }
}
