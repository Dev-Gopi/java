package com.oops.inheritance;
class Electricity{
    String electricity = "240V Power";
}
class Heater extends Electricity{
    String heater = "Room heater";
}
class Mobile extends Electricity{
    String mobile = "I phone";
}

public class Hierarchy {
    public static void main(String[] args) {
        //we cannot use parents class ref to invoke child class object - why
        Heater objhe = new Heater();
        System.out.println(objhe.electricity);
        System.out.println(objhe.heater);
        Mobile objmo = new Mobile();
        System.out.println(objmo.electricity);
        System.out.println(objmo.mobile);
    }
}
