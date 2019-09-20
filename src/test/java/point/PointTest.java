package point;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    Point firstPoint = new Point(1, 2, 3);
    Point secondPoint = new Point(1.2, 2.1, 3.9);
    Point thirdPoint = new Point(9.9, 3, 3.0);

    @Test
    void checkClass()
    {
        System.out.println(firstPoint.x);
    }
}