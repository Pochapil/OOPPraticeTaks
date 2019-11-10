package ru.ssau.tk.mggrndn.ooppractice.operation;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IdenticalOperationTest {
    IdenticalOperation func=new IdenticalOperation();
    @Test
    public void testApply() {
        assertEquals(func.apply(0),0,0.0001);
        assertEquals(func.apply(4),4,0.0001);
        assertEquals(func.apply(Double.NEGATIVE_INFINITY),Double.NEGATIVE_INFINITY,0.0001);
        assertEquals(func.apply(Double.POSITIVE_INFINITY),Double.POSITIVE_INFINITY,0.0001);
        assertEquals(func.apply(Double.NaN),Double.NaN,0.0001);
    }
    @Test
    public void testApplyTriple() {
        assertEquals(func.applyTriple(0),0,0.0001);
        assertEquals(func.applyTriple(4),4,0.0001);
        assertEquals(func.applyTriple(Double.NEGATIVE_INFINITY),Double.NEGATIVE_INFINITY,0.0001);
        assertEquals(func.applyTriple(Double.POSITIVE_INFINITY),Double.POSITIVE_INFINITY,0.0001);
        assertEquals(func.applyTriple(Double.NaN),Double.NaN,0.0001);
    }
}