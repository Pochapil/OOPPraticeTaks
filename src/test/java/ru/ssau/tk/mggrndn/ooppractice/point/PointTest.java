package ru.ssau.tk.mggrndn.ooppractice.point;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointTest {
    Point firstPoint = new Point(1, 2, 3);
    Point secondPoint = new Point(1.2, 2.1, 3.9);
    Point thirdPoint = new Point(9.9, 3, 3.0);

    @Test
    void checkClass() {
        assertEquals(secondPoint.length(), Math.sqrt(1.2 * 1.2 + 2.1 * 2.1 + 3.9 * 3.9), 0.001);
        System.out.println(firstPoint.x);
        assertEquals(thirdPoint.length(), Math.sqrt(9.9 * 9.9 + 3 * 3 + 3.0 * 3.0), 0.001);
    }

    @Test
    public void testTestToString() {
        assertEquals(firstPoint.toString(), "[1.0, 2.0, 3.0]");
        assertEquals(secondPoint.toString(), "[1.2, 2.1, 3.9]");
    }
}