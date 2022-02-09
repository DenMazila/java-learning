package com.github.denmazila.java_learning.areas;

public class Round extends Figure {
    public double r;

    public Round(double r) {
       this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
}
