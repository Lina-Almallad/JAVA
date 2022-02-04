package com.company;

public class Main {

    public static void main(String[] args) {
	CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(1);
    System.out.println(circle.toString());
    System.out.println(circle.getColor());
    System.out.println(circle.getRadius());
    System.out.println(circle.getArea());
    System.out.println(circle.getDiameter());
    RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2, 4);
    System.out.println(rectangle.toString());
    System.out.println(rectangle.getArea());
    System.out.println(rectangle.getPerimeter());
    }
}
