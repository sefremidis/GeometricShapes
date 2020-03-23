
public interface Shape {

	public Point getOrigin();
	public double perimeter();
	public double area();
	public void moveTo(Point p);
	public void moveBy(double x, double y);
}
