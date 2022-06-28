package com.oops.stringjava;

public class Stringjava {
    public static void main(String[] args) {
        String name = "gopi";
        System.out.println(name);
        name = name.concat("ram");
        System.out.println(name);

        String name1 = new String("gopi");
        System.out.println(name1);
        name1 = name1.concat("ram");
        System.out.println(name1);

        StringBuffer name2 = new StringBuffer("gopi");
        System.out.println(name2);
        name2.append("ram");
        System.out.println(name2);
        name2.reverse();
        System.out.println(name2);

        StringBuilder name3 = new StringBuilder("gopi");
        System.out.println(name3);
        name3.append("ram");
        System.out.println(name3);
        name3.reverse();
        System.out.println(name3);
    }
}
