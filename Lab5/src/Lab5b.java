/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */

public class Lab5b
{

    public static double dist(double[] a, double[] b)
    {
        double ab = Math.sqrt(

                (a[0]-b[0])*(a[0]-b[0]) +

                        (a[1]-b[1])*(a[1]-b[1]) +

                        (a[2]-b[2])*(a[2]-b[2]) );

        return ab;
    }

    public static void main(String args[])
    {

        double[] a = {1, 0, 0};

        double[] b = {0, 1, 1};

        double[] c = {1, 1, 1};

        double[] d = {0, 0, 1};

        double ab = dist(a,b);

        double ac = dist(a,c);

        double ad = dist(a,d);

        System.out.println("ab=" + ab + ", ac=" + ac + ", ad=" + ad);

    }

}
