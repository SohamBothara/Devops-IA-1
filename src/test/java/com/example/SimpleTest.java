package com.example;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.*;

public class SimpleTest {

    @BeforeClass
    public void setup() {
        System.out.println("Setup before tests");
    }

    @BeforeMethod
    public void beforeEach() {
        System.out.println("Starting a test");
    }

    @Test
    public void testAddition() {
        int a = 2 + 3;
        assertEquals(a, 5, "2+3 should be 5");
    }

    @Test
    public void testString() {
        String s = "hello".toUpperCase();
        assertEquals(s, "HELLO");
    }

    @Test
    public void testSoftAssert() {
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(1 + 1 == 2, "basic math");
        sa.assertEquals("abc".length(), 3);
        sa.assertAll();
    }

    @AfterMethod
    public void afterEach() {
        System.out.println("Finished a test");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Cleanup after tests");
    }
}
