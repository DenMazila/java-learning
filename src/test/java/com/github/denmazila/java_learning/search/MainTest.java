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
        //assertThrows(Main.search(Arrays.asList(null,null), NullPointerException());
    }

    @Test
    public void testMin() {
        assertEquals(-100, Main.min(Arrays.asList(2, 10, 3, -100, 500)));
        assertEquals(-100, Main.min(Arrays.asList(2, 10, 3, -100, 500)));
        assertThrows(NullPointerException.class,
                () -> Main.min(Arrays.asList(null,7)),
                "Expected doThing() to throw, but it didn't"
        );

    }
}
