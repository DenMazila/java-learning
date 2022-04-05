package com.github.denmazila.java_learning.stack3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketSequenceTest {

    @Test
    void testBracketSequenceCheck() {
        char[] original1 = {'(', '(', '(', ')' };
        char[] original2 = {'(', '(', ')', ')' };
        MyStack stack1 = new MyStack(4);
        MyStack stack2 = new MyStack(4);
        BracketSequence.createStack(original1, stack1);
        BracketSequence.createStack(original2, stack2);
        boolean s1 = BracketSequence.checkBracketSequence(4, stack1);
        boolean s2 = BracketSequence.checkBracketSequence(4, stack2);
        assertFalse(s1);
        assertEquals(s2, true);

    }

}
