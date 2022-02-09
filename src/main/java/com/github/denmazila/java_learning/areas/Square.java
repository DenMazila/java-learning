package com.github.denmazila.java_learning.areas;

public class Square extends Figure {

    private double size;

    public Square(double size) {
        this.size = size;
    }

    public double getArea()
    {
        return size * size;
    }
}
