package com.github.denmazila.java_learning.acmp.task0033;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Acmp0033CowboysTest {

    @Test
    void TestCalculateTheNumberOfMissedShotsA (){
        int expected = 4;
        int actual = Acmp0033Cowboys.calculateTheNumberOfMissedShotsA(5);
        assertEquals(expected, actual);
    }

    @Test
    void TestCalculateTheNumberOfMissedShotsB (){
        int expected = 5;
        int actual = Acmp0033Cowboys.calculateTheNumberOfMissedShotsB(6);
        assertEquals(expected, actual);
    }
}
