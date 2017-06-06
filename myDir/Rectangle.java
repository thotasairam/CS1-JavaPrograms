/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */

public class Rectangle extends GeometricObject {

    double height = 0;
    double width = 0;

    Rectangle(double height, double width)
    {
        this.height = height;
        this.width =width;
    }

    @Override
    public double getArea() {

        return width*height;
    }

    @Override
    public double getPerimeter() {
        return 2*(height+width);
    }

    @Override
    public String toString()
    {
        return String.format("Rectangle: Height =  %.2f Width = %.2f Area = %.2f Perimeter = %.2f",
                height,width, getArea(), getPerimeter());
    }

}