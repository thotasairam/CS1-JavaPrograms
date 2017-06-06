// Point3D

/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */

public class Point3D {

    public double x;
    public double y;
    public double z;

    public Point3D()
    {
        x = 0.0;
        y = 0.0;
        z = 0.0;
    }

    public Point3D(double a)
    {
        x = a ;
        y = a ;
        z = a ;
    }

    public Point3D (double xx , double yy , double zz)
    {
        x = xx;
        y = yy;
        z = zz;
    }

    public static void main(String[] args)
    {
        //Three ways to initialize Point3D
        Point3D p = new Point3D();

        Point3D origin = new Point3D(0.0);

        p.x = 3.0;
        p.y = 4.0;
        p.z = 5.0;

        Point3D q = new Point3D(6.0, -7.0, 8.2);

        System.exit(0);
    }
}
