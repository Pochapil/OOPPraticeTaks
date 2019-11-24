package ru.ssau.tk.mggrndn.ooppractice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayTest {
    int length = 4;

    @Test
    public void testCreateArray() {
        var array = Array.createArray(length);
        assertEquals(array.length, length, 0.0001);
        for (int i = 0; i < length; i++) {
            //System.out.println(array[i]);
        }
        length = 5;
        array = Array.createArray(length);
        assertEquals(array.length, length, 0.0001);
    }

    @Test
    public void testCreateArrayTwoOneTwo() {
        var array = Array.createArrayTwoOneTwo(length);
        assertEquals(array[0], 2, 0.0001);
        assertEquals(array[length - 1], 2, 0.0001);
        for (int i = 1; i < length - 1; i++) {
            assertEquals(array[i], 1, 0.0001);
        }
        length = 5;
        array = Array.createArrayTwoOneTwo(length);
        assertEquals(array[0], 2, 0.0001);
        assertEquals(array[length - 1], 2, 0.0001);
        for (int i = 1; i < length - 1; i++) {
            assertEquals(array[i], 1, 0.0001);
        }
    }

    @Test
    public void testCreateArrayRisingOdd() {
        var array = Array.createArrayRisingOdd(length);
        for (int i = 0; i < length; i++) {
            assertEquals(array[i], 2 * i + 1, 0.0001);
        }
        length = 5;
        array = Array.createArrayRisingOdd(length);
        for (int i = 0; i < length; i++) {
            assertEquals(array[i], 2 * i + 1, 0.0001);
        }
    }

    @Test
    public void testCreateArrayDownEven() {
        var array = Array.createArrayDownEven(length);
        for (int i = 0; i < length; i++) {
            assertEquals(array[i], 2 * (length - i), 0.0001);
            //System.out.println(array[i]);
        }
        length = 5;
        array = Array.createArrayDownEven(length);
        for (int i = 0; i < length; i++) {
            assertEquals(array[i], 2 * (length - i), 0.0001);
        }
    }

    @Test
    public void testCreateArrayFibonacci() {
        var array = Array.createArrayFibonacci(length);
        assertEquals(array[0], 0, 0.0001);
        assertEquals(array[1], 1, 0.0001);
        for (int i = 2; i < length; i++) {
            assertEquals(array[i], array[i - 1] + array[i - 2], 0.0001);
        }
    }

    @Test
    public void testCreateArraySqr() {
        var array = Array.createArraySqr(length);
        for (int i = 0; i < length; i++) {
            assertEquals(array[i], i * i, 0.0001);
        }
    }

    @Test
    public void testCreateArraySquareEquation() {
        var array = Array.createArraySquareEquation(1, -2, 1);
        assertEquals(array[0], 1, 0.0001);
        assertEquals(array.length, 1, 0.0001);
        array = Array.createArraySquareEquation(0, 0, 2);
        assertEquals(array.length, 0, 0.0001);
        array = Array.createArraySquareEquation(2, 3, 2);
        assertEquals(array.length, 0, 0.0001);
        array = Array.createArraySquareEquation(1, -5, 6);
        assertEquals(array[0], 3, 0.0001);
        assertEquals(array[1], 2, 0.0001);
    }

    @Test
    public void testCreateArrayNotDivisibleByThree() {
        var array = Array.createArrayNotDivisibleByThree(length);
        for (int i = 0; i < length; i++) {
            assertTrue(array[i] % 3 != 0);
        }
    }

    @Test
    public void testCreateArrayArithmeticProgression() {
        var array = Array.createArrayArithmeticProgression(length, 1, 2);
        assertEquals(array[0], 1, 0.0001);
        for (int i = 1; i < length; i++) {
            assertEquals(array[i] - array[i - 1], 2, 0.0001);
        }
    }

    @Test
    public void testCreateArrayGeometricProgression() {
        var array = Array.createArrayGeometricProgression(length, 1, 2);
        assertEquals(array[0], 1, 0.0001);
        for (int i = 1; i < length; i++) {
            assertEquals(array[i] / array[i - 1], 2, 0.0001);
        }
    }

    @Test
    public void testCreateArrayOfDividers() {
        int number = 555;
        var array = Array.createArrayOfDividers(number);
        for (int i = 0; i < array.length; i++) {
            assertEquals(number % array[i], 0, 0.001);
        }
    }

    @Test
    public void testCreateArrayPrimeNumbers() {
        int number = 97;
        var array = Array.createArrayPrimeNumbers(97);
        for (int i = 0; i < array.length; i++) {
            assertEquals(Array.createArrayOfDividers(array[i]).length, 2, 0.0001);
            System.out.println(array[i]);
        }
    }

    @Test
    public void testCreateArraySymmetric() {
        length = 5;
        var array = Array.createArraySymmetric(length);
        for (int i = 0; i < array.length; i++) {
            assertEquals(array[i], array[length - i - 1], 0.001);
        }
    }

    @Test
    public void testCreateArrayNegate() {
        Double[] arrayDouble = new Double[]{2.3, 1.2, 4.5, 6.5};
        Integer[] arrayInt = new Integer[]{1, 2, 3, 4, 5};
        var arrayIntOrigin = new Integer[]{1, 2, 3, 4, 5};
        var arrayDoubleOrigin = new Double[]{2.3, 1.2, 4.5, 6.5};
        Array.createArrayNegate(arrayDouble);
        Array.createArrayNegate(arrayInt);
        for (int i = 0; i < arrayInt.length; i++) {
            assertEquals(arrayInt[i], -arrayIntOrigin[i], 0.001);
        }
        for (int i = 0; i < arrayDouble.length; i++) {
            assertEquals(arrayDouble[i], -arrayDoubleOrigin[i], 0.001);
        }
    }

    @Test
    public void testIsArrayContains() {
        Number[] array = new Number[]{1, 2, 3, 4.5};
        assertTrue(Array.isArrayContains(array, 4.5));
        assertTrue(Array.isArrayContains(array, 1));
        assertTrue(Array.isArrayContains(array, 2));
        assertFalse(Array.isArrayContains(array, 0));
    }

    @Test
    public void testIsArrayContainsNull() {
        assertTrue(Array.isArrayContainsNull(new Integer[]{1, 2, 3, 4, null}));
        assertFalse(Array.isArrayContainsNull(new Integer[]{1, 2, 3, 4}));
    }

}