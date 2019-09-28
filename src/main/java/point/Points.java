package point;

public class Points {
    private Points() {
    }

    static Point sum(Point firstPoint, Point secondPoint) {
        return new Point(firstPoint.x + secondPoint.x, firstPoint.y + secondPoint.y, firstPoint.z + secondPoint.z);
    }

    static Point subtract(Point firstPoint, Point secondPoint) {
        return new Point(firstPoint.x - secondPoint.x, firstPoint.y - secondPoint.y, firstPoint.z - secondPoint.z);
    }

    static Point multiply(Point firstPoint, Point secondPoint) {
        return new Point(firstPoint.x * secondPoint.x, firstPoint.y * secondPoint.y, firstPoint.z * secondPoint.z);
    }

    static Point divide(Point firstPoint, Point secondPoint) {
        return new Point(firstPoint.x / secondPoint.x, firstPoint.y / secondPoint.y, firstPoint.z / secondPoint.z);
    }

    static Point enlarge(Point point, double multiplier) {
        return new Point(point.x * multiplier, point.y * multiplier, point.z * multiplier);
    }

    static double length(Point point) {
        return point.length();
    }

    static double scalarProduct(Point firstPoint, Point secondPoint) {
        return firstPoint.x * secondPoint.x + firstPoint.y * secondPoint.y + firstPoint.z * secondPoint.z;
    }

    static Point vectorProduct(Point firstPoint, Point secondPoint) {
        return new Point(firstPoint.y * secondPoint.z - secondPoint.y * firstPoint.z, secondPoint.x * firstPoint.z - firstPoint.x * secondPoint.z, firstPoint.x * secondPoint.y - secondPoint.x * firstPoint.y);
    }


}

