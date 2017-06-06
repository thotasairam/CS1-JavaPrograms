/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */

public class Circle extends GeometricObject {

    double r = 0;

    Circle(double r)
    {
        this.r = r;
    }

    @Override
    public double getArea() {

        return 3.14*r*r;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*r;
    }

    @Override
    public String toString()
    {
        return String.format("Circle: Radius =  %.2f Area = %.2f Perimeter = %.2f", r, getArea(), getPerimeter());
    }
}