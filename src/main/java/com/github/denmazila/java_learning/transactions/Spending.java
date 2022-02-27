package com.github.denmazila.java_learning.transactions;

public class Spending extends Transaction {
    private final double spendingAmount;
    private final String title;

    public Spending(double spendingAmount, String title) {
        this.spendingAmount = spendingAmount;
        this.title = title;
    }

    @Override
    public double diff() {
        return spendingAmount * -1;
    }
}
