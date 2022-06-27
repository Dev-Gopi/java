package com.opss.inheritance;
class Electricity{
    String electricity = "240V Power";
}
class Heater extends Electricity{
    String heater = "Room heater";
    Heater(){
        super();
    }
}class Mobile extends Electricity{
    String mobile = "I phone";
    Mobile(){
        super();
    }
}

public class Hierarchy {
    public static void main(String[] args) {
        Heater objhe = new Heater();
        System.out.println(objhe.electricity);
        System.out.println(objhe.heater);
        Mobile objmo = new Mobile();
        System.out.println(objmo.electricity);
        System.out.println(objmo.mobile);
    }
}
