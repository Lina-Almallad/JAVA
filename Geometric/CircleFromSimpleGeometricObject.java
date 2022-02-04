package com.company;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject{
    private double radius;
    public CircleFromSimpleGeometricObject(){
    }
    CircleFromSimpleGeometricObject(double radius){
        this.radius = radius;
    }
    CircleFromSimpleGeometricObject(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getDiameter(){
        return 2 * radius;
    }
    public double getPerimeter(){
        return radius * 2 * Math.PI;
    }
    public void printCircle(){
        System.out.println(getDateCreated() + " " + radius + "\r");
    }
}
