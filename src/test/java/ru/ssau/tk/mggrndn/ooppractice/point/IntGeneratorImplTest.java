package ru.ssau.tk.mggrndn.ooppractice.point;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntGeneratorImplTest {
    IntGenerator func=new IntGeneratorImpl();
    @Test
    public void testNextInt() {
        assertEquals(func.nextInt(),0,0.0001);
        assertEquals(func.nextInt(),1,0.0001);
        assertEquals(func.nextInt(),2,0.0001);
        assertEquals(func.nextInt(),3,0.0001);
    }
}