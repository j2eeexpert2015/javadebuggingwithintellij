package org.debugtutorial.util;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorUtilTest {
    @Test
    public void testAdd() {
        assertEquals(5, CalculatorUtil.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, CalculatorUtil.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, CalculatorUtil.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, CalculatorUtil.divide(6, 3));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            CalculatorUtil.divide(1, 0);
        });
    }

    @Test
    public void testDivideWithExceptionHandling() {
        assertEquals(2, CalculatorUtil.divideWithExceptionHandling(6, 3));
    }

    @Test
    public void testDivideWithExceptionHandlingZero() {
        assertThrows(RuntimeException.class, () -> {
            CalculatorUtil.divideWithExceptionHandling(1, 0);
        });
    }

    @Test
    public void testSquare() {
        assertEquals(9, CalculatorUtil.square(3));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, CalculatorUtil.factorial(5));
    }
}
