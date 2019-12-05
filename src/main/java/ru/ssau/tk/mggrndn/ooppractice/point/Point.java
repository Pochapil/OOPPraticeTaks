package ru.ssau.tk.mggrndn.ooppractice.point;

public class Point {
    public final double x;
    public final double y;
    public final double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public String toString() {
        return "[" + this.x + ", " + this.y + ", " + this.z + "]";
    }
}
