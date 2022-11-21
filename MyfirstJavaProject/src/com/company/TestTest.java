package com.company;

import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class TestTest {

    @Test
    public void sum() {
        test a = new test();
        int actual = a.sum(10);
        int expected = 55;
        assertEquals(expected, actual);
    }
}