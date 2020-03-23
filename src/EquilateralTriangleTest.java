import static org.junit.Assert.*;

import org.junit.Test;

public class EquilateralTriangleTest {

    @Test
    public void perimeterTest() {
        double side = 5.0;

        EquilateralTriangle triangle = new EquilateralTriangle(new Point(), side);

        assertEquals(triangle.perimeter(), side * 3, 0.001);
    }

    @Test
    public void PointChangedTest() {
        EquilateralTriangle triangle = new EquilateralTriangle(new Point(2.0, 8.0), 3.0);

        Point p = new Point(5.0, 12.0);
        triangle.moveTo(p);

        assertEquals(triangle.getOrigin(), p);
    }
}
