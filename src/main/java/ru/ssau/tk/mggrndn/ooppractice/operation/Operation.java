package ru.ssau.tk.mggrndn.ooppractice.operation;

public abstract class Operation {
    abstract double apply(double number);

    double applyTriple(double number) {
        return apply(apply(apply(number)));
    }
}
