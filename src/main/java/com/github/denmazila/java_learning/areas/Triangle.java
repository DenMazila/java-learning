package com.github.denmazila.java_learning.areas;

public class Triangle extends Figure {
    public double side1;
    public double side2;

    public Triangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }
}