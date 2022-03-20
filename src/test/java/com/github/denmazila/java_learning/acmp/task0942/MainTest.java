package com.github.denmazila.java_learning.acmp.task0942;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testGetScore() {
        List<Integer> original = Arrays.asList(40, 30, 60);
        int sum = 0;
        int stud = 0;
        for (int i = 0; i < original.size(); i++) {
            sum += original.get(i);
            stud += sum;
        }
        assertEquals(Main.getScore(original), stud);
    }
    @Test
    void testPrintWinner (){
        assertEquals (Main.printWinner(240, 280, 250), 5);
        assertEquals (Main.printWinner(250, 300, 250), 1);
        assertEquals (Main.printWinner(250, 230, 250), 3);
    }
}