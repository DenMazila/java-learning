package com.github.denmazila.java_learning.transactions;

import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Transaction add = new Refill(300, "Зарплата");
        Transaction buyCar = new Spending(100, "Купил машину");
        
        //...

        List<Transaction> transactions = Arrays.asList(add, buyCar);

        double diff = 0; //
        double a = 0;
        for (int i = 0; i < transactions.size(); i++) {
            Transaction transaction = transactions.get(i);
            //a = transactions.get(i).diff();
            diff += transaction.diff();
        }
        System.out.println(transactions);
        System.out.println(diff);

    }
}
