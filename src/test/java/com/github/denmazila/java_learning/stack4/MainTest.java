package com.github.denmazila.java_learning.stack4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testCheckBracketSequence() {
        char[] original1 = {'(', ')', '[', ']'};
        char[] original2 = {'(', '(', '[', ']'};
        char[] original3 = {'(', '[', ')', ']'};
        boolean s1 = Main.checkBracketSequence(original1);
        boolean s2 = Main.checkBracketSequence(original2);
        boolean s3 = Main.checkBracketSequence(original3);
        assertTrue(s1);
        assertEquals(s2, false);
        assertFalse(s3);
    }
}
