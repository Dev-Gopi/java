package com.oops.thisstaticfinal;
class StudentData{
    Thisjava obj;
    StudentData(Thisjava obj){
        this.obj = obj;
    }
    void display(){
        if(this.obj.rollNumber==10){
            System.out.println("Student Name is Gopi");
        } else if (this.obj.rollNumber==20) {
            System.out.println("Student Name is Ram");
        } else {
            System.out.println("Student Name Not Found");
        }
    }
}
public class Thisjava {
    public static int rollNumber = 10;

    public static void main(String[] args) {
        Thisjava obj = new Thisjava();
        obj.call();
    }
    void call(){
        StudentData obj = new StudentData(this);
        obj.display();
    }
}
