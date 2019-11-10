package ru.ssau.tk.mggrndn.ooppractice.point;

public class IntGeneratorImpl implements IntGenerator {
    private int count=0;
    @Override
    public int nextInt() {
        return count++;
    }
}
