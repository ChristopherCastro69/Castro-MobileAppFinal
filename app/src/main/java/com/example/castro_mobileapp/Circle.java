package com.example.castro_mobileapp;


public class Circle {
    double radius;

    public void setRadius(double r) {
        this.radius = r;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

