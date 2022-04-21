package com.github.denmazila.java_learning.acmp.task0023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Acmp0023Test {

    @Test
    void testCalculatingTheSum(){
       int actual = 18;
       int expected = Acmp0023.calculatingTheSum(10);
       assertEquals(expected, actual);
    }

}
