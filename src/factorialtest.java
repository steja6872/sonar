package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class factorialtest {

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, Factorial.compute(0));
    }

    @Test
    public void testFactorialOfFive() {
        assertEquals(120, Factorial.compute(5));
    }

    @Test
    public void testFactorialOfNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Factorial.compute(-1);
        });
        assertEquals("Number must be non-negative", exception.getMessage());
    }
}
