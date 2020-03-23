public class Pentagon implements Shape {

    private Point origin;
    private double side;

    public Pentagon(Point point, double side){
        this.side = side;
        this.origin = point;
    }

    @Override
    public Point getOrigin() {
        return origin;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public void moveTo(Point p) {
        origin.setX(p.getX());
        origin.setY(p.getY());
    }

    @Override
    public void moveBy(double x, double y) {
        origin.moveBy(x, y);
    }
}
