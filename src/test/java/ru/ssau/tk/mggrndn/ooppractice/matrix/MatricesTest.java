package ru.ssau.tk.mggrndn.ooppractice.matrix;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MatricesTest {
    Matrix first = new Matrix(new double[][]{{1, 2}, {3, 4}});
    Matrix second = new Matrix(new double[][]{{1, 2, 3}, {2, 3, 4}, {2, 3, 5}});
    Matrix third = new Matrix(new double[][]{{1, 2}, {2, 3}});
    Matrix four = new Matrix(new double[][]{{1, 2}, {2, 3}, {5, 6}});

    @Test
    public void testSumMatrix() {
        assertNull(Matrices.sumMatrix(first, second));
        Matrix result = Matrices.sumMatrix(first, third);
        assertEquals(result.getAt(0, 0), 2, 0.001);
        assertEquals(result.getAt(1, 1), 7, 0.001);
        assertEquals(first.getAt(0, 0), 1, 0.001);
    }

    @Test
    public void testMultiplicationMatrix() {
        assertNull(Matrices.multiplicationMatrix(first, second));
        Matrix result = Matrices.multiplicationMatrix(first, third);
        assertEquals(result.getAt(0, 0), 5, 0.001);
        assertEquals(result.getAt(1, 1), 18, 0.001);
        assertEquals(first.getAt(0, 0), 1, 0.001);
        result = Matrices.multiplicationMatrix(second, four);
        assertEquals(result.getAt(0, 0), 1 * 1 + 2 * 2 + 3 * 5, 0.001);
    }

    @Test
    public void testMultiplicationMatrixAtNumber() {
        Matrix result = Matrices.multiplicationMatrixAtNumber(first, 3);
        assertEquals(result.getAt(0, 0), first.getAt(0, 0) * 3, 0.001);
        assertEquals(result.getAt(1, 1), first.getAt(1, 1) * 3, 0.001);
    }
}