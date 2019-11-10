package ru.ssau.tk.mggrndn.ooppractice.operation;

public class TangentOperation extends Operation {
    @Override
    double apply(double number) {
        return Math.tan(number);
    }
}
