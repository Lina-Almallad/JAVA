package com.company.TestSimpleCircle;

public class Main {

    public static void main(String[] args) {
        com.company.SimpleCircle circle1 = new com.company.SimpleCircle();
        System.out.println("The area of the circle of radius" + circle1.radius + "is" + circle1.getArea());
        com.company.SimpleCircle circle2 = new com.company.SimpleCircle(25);
        System.out.println("The area of the circle of radius" + circle2.radius + "is" + circle2.getArea());
        com.company.SimpleCircle circle3 = new com.company.SimpleCircle(125);
        System.out.println("The area of the circle of radius" + circle3.radius + "is" + circle3.getArea());
        circle2.radius = 100;
        System.out.println("The area of the circle of radius" + circle2.radius + "is" + circle2.getArea());
    }
}
class SimpleCircle {
    double radius;
    SimpleCircle(){
        radius = 1;
    }
    SimpleCircle(double newRadius){
        radius = newRadius;
    }
    double getArea(){
        return radius * radius * Math.PI;
    }
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    void setRadius(double newRadius){
        radius = newRadius;
    }

}
