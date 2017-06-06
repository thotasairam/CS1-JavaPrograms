/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */

public class EquilateralTriangle extends GeometricObject {

    double length = 0;

    EquilateralTriangle(double l)
    {
        this.length = l;
    }

    @Override
    public double getArea() {
        double s = 3 * length / 2 ;
        return Math.sqrt(s*(s-length)*(s-length)*(s-length));
    }

    @Override
    public double getPerimeter() {
        return 3*length;
    }
    @Override
    public String toString()
    {
        return String.format("EquilateralTriangle: Length =  %.2f Area = %.2f Perimeter = %.2f",
                length, getArea(), getPerimeter());
    }

}