package com.first.pkg;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class MySecondTest {

    @Test
    public void bTest() {
        assertTrue(6 > 5);
    }

    @Test
    public void cTest() {
        assertFalse(6 > 7);
    }
}
