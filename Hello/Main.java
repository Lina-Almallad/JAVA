package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println("Welcome to Java");

    }
}
class circle {
    double radius = 1;
    circle(){

    }
    circle(double newRadius){
        radius = newRadius;
    }
    double getArea(){
        return radius * radius * Math.PI;
    }
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    double setRadius(double newRadius){
        return radius = newRadius;
    }
}
