package com.company.CircleStatic;

public class Main {

    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is " + CircleWithStaticMembers.numberOfObjects);
        CircleWithStaticMembers c1 = new CircleWithStaticMembers();
        System.out.println(c1.radius + " " + c1.numberOfObjects);
        CircleWithStaticMembers c2 = new CircleWithStaticMembers();
        c1.radius = 9;
        System.out.println("____________________________");
        System.out.println(c1.radius + " " + c1.numberOfObjects);
        System.out.println(c2.radius + " " + c2.numberOfObjects);
    }
}
