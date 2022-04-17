package com.github.denmazila.java_learning.stack4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testCheckBracketSequence() {
        char[] original1 = {'(', ')', '[', ']'};
        char[] original2 = {'(', '(', '[', ']'};
        char[] original3 = {'(', '[', ')', ']'};
        MyStack stack1 = new MyStack(4);
        MyStack stack2 = new MyStack(4);
        MyStack stack3 = new MyStack(4);
        boolean s1 = Main.checkBracketSequence(4, stack1, original1);
        boolean s2 = Main.checkBracketSequence(4, stack2, original2);
        boolean s3 = Main.checkBracketSequence(4, stack3, original3);
        assertEquals(s1, true);
        assertEquals(s2, false);
        assertFalse(s3);
    }
}
