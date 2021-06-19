package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTest {

    private MyMath myMath = new MyMath();

    @Test
    public void sumWithOneNumber() {
        int result = myMath.sum(new int[]{1});
        assertEquals(1, result);
    }

    @Test
    public void sumWithThreeNumbers() {
        int result = myMath.sum(new int[]{1, 2, 3});
        assertEquals(6, result);
    }
}
