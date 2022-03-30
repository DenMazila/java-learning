package com.github.denmazila.java_learning.acmp.task0013;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void testIntegerToArrayConversionHiddenNumber() {
        int[] expected = {1, 2, 3, 4};
        int[] actual = Main.integerToArrayConversionHiddenNumber(1234);
        assertArrayEquals(expected, actual);
    }

    @Test
    void tesIntegerToArrayConversionSuggestedTumber() {
        int[] expected = {5, 6, 7, 8};
        int s = 5678;
        int[] actual = Main.integerToArrayConversionSuggestedTumber(s);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testNumberOfExactMatches() {
        int[] original1 = {1, 2, 3, 4};
        int[] original2 = {4, 5, 3, 6};
        assertEquals(Main.numberOfExactMatches(original1, original1), 4);
        assertEquals(Main.numberOfExactMatches(original1, original2), 1);
    }

    @Test
    void testNumberOfIndirectMatches() {
        int[] original1 = {1, 2, 3, 4};
        int[] original2 = {4, 5, 3, 6};
        assertEquals(Main.numberOfIndirectMatches(original1, original1), 0);
        assertEquals(Main.numberOfIndirectMatches(original1, original2), 1);
    }
}