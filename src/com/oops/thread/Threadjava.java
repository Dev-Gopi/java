package com.oops.thread;
class ThreadRun extends Thread{
    @Override
    public void run(){
        String name =Thread.currentThread().getName();
        for (int i = 0; i < 5; i++) {
            System.out.println(name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Threadjava {
    public static void main(String[] args) {
        ThreadRun obj0 = new  ThreadRun();
        ThreadRun obj1 = new  ThreadRun();
        obj0.setName("First");
        obj1.setName("Second");
        obj0.start();
        System.out.println(obj0.isAlive());
        obj1.start();
        System.out.println(obj1.isAlive());
        try {
            obj0.join();
            obj1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String name =Thread.currentThread().getName();
        for (int i = 0; i < 5; i++) {
            System.out.println(name);
        }
    }
}
