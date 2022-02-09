package com.github.denmazila.java_learning.areas;

public class Main {
    public static void main(String[] args) {

        Figure myBigSquare = new Square(8.0);
        Figure myMagicSquare = new Triangle(2.0, 7.0);
        Figure myRound = new Round(1.0);


        System.out.println(myBigSquare.getArea());
        System.out.println(myMagicSquare.getArea());
        System.out.println(myRound.getArea());

    }
}
