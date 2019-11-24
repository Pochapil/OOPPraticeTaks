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

    static double[] createArraySquareEquation(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                return new double[0];
            } else {
                return new double[]{-c / b};
            }
        } else {
            double d = b * b - 4 * a * c;
            if (d > 0) {
                d = Math.sqrt(d);
                return new double[]{(-1 * b + d) / (2 * a), (-1 * b - d) / (2 * a)};
            } else if (d == 0) {
                return new double[]{-b / (2 * a)};
            } else {
                return new double[0];
            }
        }
    }

    static int[] createArrayNotDivisibleByThree(int length) {
        var array = new int[length];
        int j = 1;
        for (int i = 0; i < length; i++) {
            if (j % 3 == 0) {
                j++;
            }
            array[i] = j++;
        }
        return array;
    }

    static double[] createArrayArithmeticProgression(int length, double first, double step) {
        var array = new double[length];
        for (int i = 0; i < length; i++) {
            array[i] = first + step * i;
        }
        return array;
    }

    static double[] createArrayGeometricProgression(int length, double first, double step) {
        var array = new double[length];
        array[0] = first;
        for (int i = 1; i < length; i++) {
            array[i] = array[i - 1] * step;
        }
        return array;
    }

    static int[] createArrayOfDividers(int number) {
        int j = 0;
        for (int i = 1; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                j++;
            }
        }
        var array = new int[2 * j];
        int k = 1;
        for (int i = 0; i < j; k++) {
            if (number % k == 0) {
                array[i++] = k;
                array[2 * j - i] = number / k;
            }
        }
        return array;
    }

    static int[] createArrayPrimeNumbers(int number) {
        if (number < 2) {
            return new int[0];
        } else {
            int count = 0;
            for (int i = 2; i <= number; i++) {
                if (Array.createArrayOfDividers(i).length == 2) {
                    count++;
                }
            }
            var array = new int[count];
            int k = 0;
            for (int i = 2; i <= number; i++) {
                if (Array.createArrayOfDividers(i).length == 2) {
                    array[k++] = i;
                }
            }
            return array;
        }
    }

    static int[] createArraySymmetric(int length) {
        var array = new int[length];
        int k = 1;
        for (int i = 0; i < Math.ceil(((double) length) / 2); i++) {
            array[i] = k++;
            array[length - i - 1] = array[i];
        }
        return array;
    }

    static void createArrayNegate(Number[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array instanceof Integer[]) {
                array[i] = -((Integer) array[i]);
            }
            if (array instanceof Double[]) {
                array[i] = -((Double) array[i]);
            }
        }
    }

    static boolean isArrayContains(Number[] array, Number number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(number)) {
                return true;
            }
        }
        return false;
    }

    static boolean isArrayContainsNull(Integer[] array) {
        for (Integer number : array) {
            if (number == null) {
                return true;
            }
        }
        return false;
    }

    static int countOfEvens(Number[] array) {
        int i = 0;
        for (Number number : array) {
            if (number instanceof Integer && (int) number % 2 == 0) {
                i++;
            }
        }
        return i;
    }

    static Integer maxOfArray(Integer[] array) {
        if (array.length == 0) {
            return null;
        }
        Integer max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

}
