package ru.ssau.tk.mggrndn.ooppractice.array;

public class Array {
    static double[] createArray(int length) {
        double[] array = new double[length];
        for (int i = 0; i < length; i++) {
            array[i] = Math.random() * 100;
        }
        return array;
    }

    static double[] createArrayTwoOneTwo(int length) {
        double[] array = new double[length];
        array[0] = 2;
        array[length - 1] = 2;
        for (int i = 1; i < length - 1; i++) {
            array[i] = 1;
        }
        return array;
    }

    static double[] createArrayRisingOdd(int length) {
        double[] array = new double[length];
        for (int i = 0; i < length; i++) {
            array[i] = i * 2 + 1;
        }
        return array;
    }

    static double[] createArrayDownEven(int length) {
        double[] array = new double[length];
        for (int i = 0; i < length; i++) {
            array[i] = (length - i) * 2;
        }
        return array;
    }

    static int[] createArrayFibonacci(int length) {
        int[] array = new int[length];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    static int[] createArraySqr(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i * i;
        }
        return array;
    }
}
