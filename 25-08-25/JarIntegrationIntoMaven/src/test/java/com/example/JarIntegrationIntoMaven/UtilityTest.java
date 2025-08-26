package com.example.JarIntegrationIntoMaven;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class UtilityTest {

    @Test
    public void testAdd() {
        assertEquals(30, UtilityClass.add(10, 20));
    }

    @Test
    public void testSub() {
        assertEquals(10, UtilityClass.sub(30, 20));
    }

    @Test
    public void testMul() {
        assertEquals(200, UtilityClass.mul(10, 20));
    }

    @Test
    public void testDiv() {
        assertEquals(2, UtilityClass.div(40, 20));
    }
}
