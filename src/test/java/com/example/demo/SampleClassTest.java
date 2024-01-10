/*
 * Copyright (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SampleClassTest {

    // Sample class to be tested
    public static class SampleClass {
        public int add(int a, int b) {
            return a + b;
        }
    }

    // Test method 1
    @Test
    public void testAddPositiveNumbers() {
        SampleClass sample = new SampleClass();
        int result = sample.add(2, 3);
        assertEquals(5, result);
    }

    // Test method 2
    @Test
    public void testAddNegativeNumbers() {
        SampleClass sample = new SampleClass();
        int result = sample.add(-2, -3);
        assertEquals(-5, result);
    }

    // Add more test methods as needed

}
