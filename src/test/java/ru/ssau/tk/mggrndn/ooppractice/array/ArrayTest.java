package ru.ssau.tk.mggrndn.ooppractice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayTest {
    int length=4;
    @Test
    public void testCreateArray() {
        var array=Array.createArray(length);
        assertEquals(array.length,length,0.0001);
        for(int i=0;i<length;i++) {
            //System.out.println(array[i]);
        }
        length=5;
        array=Array.createArray(length);
        assertEquals(array.length,length,0.0001);
    }

    @Test
    public void testCreateArrayTwoOneTwo() {
        var array=Array.createArrayTwoOneTwo(length);
        assertEquals(array[0],2,0.0001);
        assertEquals(array[length-1],2,0.0001);
        for(int i=1;i<length-1;i++) {
            assertEquals(array[i],1,0.0001);
        }
        length=5;
        array=Array.createArrayTwoOneTwo(length);
        assertEquals(array[0],2,0.0001);
        assertEquals(array[length-1],2,0.0001);
        for(int i=1;i<length-1;i++) {
            assertEquals(array[i],1,0.0001);
        }
    }

    @Test
    public void testCreateArrayRisingOdd() {
        var array=Array.createArrayRisingOdd(length);
        for(int i=0;i<length;i++) {
            assertEquals(array[i],2*i+1,0.0001);
        }
        length=5;
        array=Array.createArrayRisingOdd(length);
        for(int i=0;i<length;i++) {
            assertEquals(array[i],2*i+1,0.0001);
        }
    }

    @Test
    public void testCreateArrayDownEven() {
        var array=Array.createArrayDownEven(length);
        for(int i=0;i<length;i++) {
            assertEquals(array[i],2*(length-i),0.0001);
            //System.out.println(array[i]);
        }
        length=5;
        array=Array.createArrayDownEven(length);
        for(int i=0;i<length;i++) {
            assertEquals(array[i],2*(length-i),0.0001);
        }
    }

    @Test
    public void testCreateArrayFibonacci() {
        var array=Array.createArrayFibonacci(length);
        assertEquals(array[0],0,0.0001);
        assertEquals(array[1],1,0.0001);
        for(int i=2;i<length;i++) {
            assertEquals(array[i],array[i-1]+array[i-2],0.0001);
        }
    }

    @Test
    public void testCreateArraySqr() {
        var array=Array.createArraySqr(length);
        for(int i=0;i<length;i++) {
            assertEquals(array[i], i*i, 0.0001);
        }
    }

}