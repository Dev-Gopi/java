package com.oops.exceptionhandling;

public class ExceptionThrow {
    public static void main(String[] args) {
        ExptThrow obj = new ExptThrow();
        try {
            obj.call(10,0);
        } catch (java.lang.Exception e){
            e.printStackTrace();
        }
    }
}
class ExptThrow{
    int call(int num1,int num2) throws java.lang.Exception {
        int ans =0;
        ans = (num1/ num2);
        return ans;
    }
}