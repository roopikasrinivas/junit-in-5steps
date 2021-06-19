package com.junit;

import static org.junit.Assert.*;

import org.junit.*;

public class AssertTest {

    @Test
    public void test1() {
        System.out.println("Test1");
        assertEquals(1, 1);
        assertArrayEquals(new int[]{1, 2}, new int[]{1, 2});
        assertTrue(1 == 1);
    }

    @Test
    public void test2() {
        System.out.println("Test2");
        assertEquals(true, 2 >= 1);
        assertNotNull(0);
        assertNull(null);
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void before() {
        System.out.println("Before Test");
    }

    @After
    public void after() {
        System.out.println("After Test");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }
}
