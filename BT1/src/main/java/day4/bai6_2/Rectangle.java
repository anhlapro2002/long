package day4.bai6_2;

import day4.bai6_2.GeometricObject;

public class Rectangle implements GeometricObject {
    private double length,width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

