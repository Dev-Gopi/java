package com.opss.inheritance;
interface Run{
    void call();
}
interface Start{
    void call();
}
class Game implements Run,Start{

    @Override
    public void call() {
        System.out.println("Multiple");
    }
}
public class Multiple {
    public static void main(String[] args) {
        Game obj = new Game();
        obj.call();
    }
}
