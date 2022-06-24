package com.opss.encapsulationjava;
class Encap{
    private int rollNumber;
    private String studentName;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
public class Encapsulationjava {
    public static void main(String[] args) {
        Encap obj = new Encap();
        obj.setRollNumber(10);
        obj.setStudentName("Gopi");
        System.out.println(obj.getRollNumber());
        System.out.println(obj.getStudentName());
    }
}
