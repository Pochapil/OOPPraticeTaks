package ru.ssau.tk.mggrndn.ooppractice.operation;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TangentOperationTest {
    TangentOperation func=new TangentOperation();
    @Test
    public void testApply() {
        assertEquals(func.apply(0),0,0.0001);
        assertEquals(func.apply(4),Math.tan(4),0.0001);
        assertEquals(func.apply(4421),Math.tan(4421),0.0001);
        assertEquals(func.apply(Double.NEGATIVE_INFINITY),Double.NaN,0.0001);
        assertEquals(func.apply(Double.POSITIVE_INFINITY),Double.NaN,0.0001);
        assertEquals(func.apply(Double.NaN),Double.NaN,0.0001);
    }
}