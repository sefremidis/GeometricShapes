public class EquilateralTriangle implements Shape {

    private Point origin;
    private double side;

    public EquilateralTriangle(Point p, double s) {
        origin = p;
        side = s;
    }

    @Override
    public Point getOrigin() {
        return origin;
    }

    @Override
    public double perimeter() {
        return side * 3;
    }

    @Override
    public double area() {
        return Math.sqrt(3.0) / 4 * Math.pow(side, 2);
    }

    @Override
    public void moveTo(Point p) {
        origin.moveTo(p.getX(), p.getY());
    }

    @Override
    public void moveBy(double x, double y) {
        origin.moveBy(x, y);
    }
}
