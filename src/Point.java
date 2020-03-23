
public class Point {

	private double x, y;
	
	public Point() {
		x = y = 0.0;
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public void moveTo(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void moveBy(double dx, double dy) {
		x += dx;
		y += dy;
	}
	
	public String toString() {
		return "[Point: x=" + x + ", y=" + y + "]";
	}
}
