package com.opss.accessspecifiers;

public class AccessSpecifiers {
    public static void main(String[] args) {
        Details obj = new Details();
        obj.roll = "1";
        obj.name = "Gopinath Bhowmick";
        obj.setAmount("20000");
        obj.age = "22";
    }
}
class Details{
    public String name;
    String roll;
    private String amount;

    protected String age;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
