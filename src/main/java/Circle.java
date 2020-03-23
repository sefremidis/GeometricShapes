import static java.lang.Math.PI;

public class Circle implements Shape {

    private Point origin;
    private double radius;

    public Circle(Point origin, double radius) {
        this.origin = origin;
        this.radius = radius;
    }


    @Override
    public Point getOrigin() {
        return origin;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double area() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public void moveTo(Point p) {
        this.origin = p;
    }

    @Override
    public void moveBy(double x, double y) {
        this.origin.moveBy(x, y);
    }
}
