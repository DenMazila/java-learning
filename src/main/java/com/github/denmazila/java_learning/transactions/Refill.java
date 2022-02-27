package com.github.denmazila.java_learning.transactions;

public class Refill extends Transaction {
    private final int refillAmount;
    private final String title;

    public Refill(int refillAmount, String title) {
        this.refillAmount = refillAmount;
        this.title = title;
    }

    @Override
    public double diff() {
        return refillAmount;
    }
}
