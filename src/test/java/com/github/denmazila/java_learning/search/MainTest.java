package com.github.denmazila.java_learning.search;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testSearch() {
        assertTrue(Main.search(Arrays.asList(2, 10, 3, -100, 500), 3));
        assertFalse(Main.search(Arrays.asList(2, 10, 3, -100, 500), 88));
        assertFalse(Main.search(List.of(), 88));
        //assertFalse(Main.search(Arrays.asList(null,null), 88));
    }

    @Test
    public void testMin() {
        assertEquals(-100, Main.min(Arrays.asList(2, 10, 3, -100, 500)));
        assertEquals(-100, Main.min(Arrays.asList(2, 10, 3, -100, 500)));
    }
}
