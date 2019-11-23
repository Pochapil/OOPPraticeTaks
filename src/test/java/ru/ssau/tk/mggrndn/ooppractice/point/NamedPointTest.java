package ru.ssau.tk.mggrndn.ooppractice.point;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {
    NamedPoint firstPoint = new NamedPoint();
    NamedPoint secondPoint = new NamedPoint(1, 2, 3, "Pupa");
    NamedPoint thirdPoint = new NamedPoint(1, 2, 3);

    @Test
    public void testGetName() {
        assertEquals(firstPoint.getName(), "Origin");
        assertEquals(secondPoint.getName(), "Pupa");
        assertNull(thirdPoint.getName());
    }

    @Test
    public void testSetName() {
        firstPoint.setName("Hello");
        assertEquals(firstPoint.getName(), "Hello");
        secondPoint.setName(null);
        assertNull(secondPoint.getName());
        thirdPoint.setName("alpha");
        assertEquals(thirdPoint.getName(), "alpha");
    }

    @Test
    public void testReset() {
        firstPoint.reset();
        assertEquals(firstPoint.getName(), "Absent");
        thirdPoint.reset();
        assertEquals(thirdPoint.getName(), "Absent");
    }

    @Test
    public void testTestToString() {
        assertEquals(new NamedPoint(1, 2, 3, "Pupa").toString(), "Pupa [1.0, 2.0, 3.0]");
        assertEquals(new NamedPoint(1, 2, 3).toString(), "[1.0, 2.0, 3.0]");
    }
}