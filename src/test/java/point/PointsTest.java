package point;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointsTest {
    Point firstPoint = new Point(1, 2, 3);
    Point secondPoint = new Point(2, 3, 4);

    @Test
    public void testSum() {
        assertTrue(Points.equalsApproximately(Points.sum(firstPoint, secondPoint), new Point(3, 5, 7)));
    }

    @Test
    public void testSubtract() {
        assertTrue(Points.equalsApproximately(Points.subtract(secondPoint,firstPoint), new Point(1, 1, 1)));
    }

    @Test
    public void testMultiply() {
        assertTrue(Points.equalsApproximately(Points.multiply(secondPoint,firstPoint), new Point(2, 6, 12)));
    }

    @Test
    public void testDivide() {
        assertTrue(Points.equalsApproximately(Points.divide(secondPoint,firstPoint), new Point(2/(double)1, 3/(double)2, 4/(double)3)));
    }

    @Test
    public void testEnlarge() {
        assertTrue(Points.equalsApproximately(Points.enlarge(firstPoint,2), new Point(2, 4, 6)));;
    }

    @Test
    public void testLength() {
        assertEquals(Points.length(firstPoint),Math.sqrt(1*1+2*2+3*3),0.01);
    }

    @Test
    public void testScalarProduct() {
        assertEquals(Points.scalarProduct(firstPoint,secondPoint),1*2+2*3+3*4 ,0.01);
    }

    @Test
    public void testVectorProduct() {
        assertTrue(Points.equalsApproximately(Points.vectorProduct(firstPoint,secondPoint), new Point(2*4-3*3, 2*3-1*4, 1*3-2*2)));;
    }
}