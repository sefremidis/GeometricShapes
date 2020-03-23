
public class RightTriangle implements Shape {

	private Point origin;
	private Integer sideA;
	private Integer sideB;
	
	public RightTriangle(Point origin, Integer sideA, Integer sideB) {
		this.origin = origin;
		this.sideA = sideA;
		this.sideB = sideB;
	}
	
	@Override
	public Point getOrigin() {
		// TODO Auto-generated method stub
		return this.origin;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return sideA + sideB + Math.sqrt((Math.pow(sideA, 2) + Math.pow(sideB, 2)));
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (sideA * sideB) / 2;
	}

	@Override
	public void moveTo(Point p) {
		// TODO Auto-generated method stub
		this.origin = p;
	}

	@Override
	public void moveBy(double x, double y) {
		// TODO Auto-generated method stub
		origin.moveBy(x, y);
	}

}
