package com.first.pkg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstTest {

    @Test
    public void aTest() {
        assertEquals("hello", "Hello".toLowerCase());
    }
}
