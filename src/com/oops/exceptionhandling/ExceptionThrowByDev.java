package com.oops.exceptionhandling;
class MyException extends Throwable {
    MyException(String msg){
        System.err.println(msg);
    }
    @Override
    public void printStackTrace(){
        System.err.println("Sorry You Cannot Proceed For Next Process");
    }
}
public class ExceptionThrowByDev {
    int age =10;
    public static void main(String[] args) {
        ExceptionThrowByDev obj = new ExceptionThrowByDev();
        try {
            obj.call(obj.age);
        } catch (com.oops.exceptionhandling.MyException e){
            e.printStackTrace();
        }
    }
    public void call(int age) throws MyException{
        if (age<18){
            throw new MyException("Invalid Age");
        }
    }
}
