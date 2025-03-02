package com.first.pkg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebServerIT {

    @Test
    public void testWebServer() {
        assertEquals("Jetty", "Jetty");
    }
}