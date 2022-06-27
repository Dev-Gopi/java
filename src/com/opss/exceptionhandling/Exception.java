package com.opss.exceptionhandling;

public class Exception {
    int num1 = 10;
    int num2 = 0;

    public static void main(String[] args) {
        int ans = 0;
        Exception obj = new Exception();
        try {
            ans = (obj.num1/ obj.num2);
        } catch (java.lang.Exception e){
            e.printStackTrace();
        }
    }
}
