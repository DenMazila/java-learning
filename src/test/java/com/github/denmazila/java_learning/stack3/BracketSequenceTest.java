package com.github.denmazila.java_learning.stack3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketSequenceTest {

    @Test
    void TestBracketSequenceCheck(){
        char [] original1 = {'(','(','(',')'};
        char [] original2 = {'(','(',')',')'};
        MyStack stack1 = new MyStack(4);
        //BracketSequence.stackСreation(original1,stack1);
        boolean s = BracketSequence.bracketSequenceCheck(4, MyStack BracketSequence.stackСreation(original1,stack1));
        assertEquals(s, false);

    }

}
