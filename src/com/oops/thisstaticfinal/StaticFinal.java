package com.oops.thisstaticfinal;
class StaticClass {
    static public int rollNumber = 0;
    public String name;
    public static String collageName;
    public final String universityName = "Mak";
    StaticClass(String name){
        this.rollNumber++;
        this.name = name;;
    }
    void display(){
        System.out.println("Roll Number:- "+this.rollNumber+"\nName:- "+this.name+"\nCollage Name:- "+this.collageName+"\nUniversity Name:- "+this.universityName);
    }
}
public class StaticFinal {
    public static void main(String[] args) {
        StaticClass.collageName = "Global";
        StaticClass gopi = new StaticClass("Gopi");
        gopi.display();
        StaticClass suman = new StaticClass("Suman");
        suman.display();
        for (int i = 0; i < 10; i++) {
            check();
        }
    }
    static int idxNumber=0;
    int point = 0;
    static void check(){
        StaticFinal obj = new StaticFinal();
        idxNumber++;
        System.out.print(idxNumber+") ");
        obj.point++;
        System.out.println(obj.point+".");
    }
}
