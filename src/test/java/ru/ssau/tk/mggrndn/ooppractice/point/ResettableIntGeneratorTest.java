package ru.ssau.tk.mggrndn.ooppractice.point;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ResettableIntGeneratorTest {
    IntGenerator func = new ResettableIntGenerator();

    @Test
    public void testNextInt() {
        assertEquals(func.nextInt(),0,0.0001);
        assertEquals(func.nextInt(),1,0.0001);
        assertEquals(func.nextInt(),2,0.0001);
    }

    @Test
    public void testReset() {
        ((Resettable) func).reset();
        assertEquals(func.nextInt(),0,0.0001);
        assertEquals(func.nextInt(),1,0.0001);
        ((Resettable) func).reset();
        assertEquals(func.nextInt(),0,0.0001);
        assertEquals(func.nextInt(),1,0.0001);
    }
}