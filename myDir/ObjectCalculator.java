/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ObjectCalculator

{

    public static void main(String args[])

    {

        ArrayList<GeometricObject> objects = new ArrayList<GeometricObject>();

        // Create a Scanner to read input from the keyboard

        Scanner scan = new Scanner(System.in);

        // Prompt the user for a radius, get the radius from

        // the keyboard, and add the circle to the list of objects.

        System.out.println("Please enter the radius of the circle: ");

        objects.add(new Circle(scan.nextDouble()));

        // Prompt the user for a side length for an equilateral triangle.

        // Create an equilateral triangle with that side length and

        // add it to the list of objects.

        System.out.println("Please enter the length of the equilateral triangle: ");

        objects.add(new EquilateralTriangle(scan.nextDouble()));

        // Prompt the user for the width and height of a rectangle.

        // Create a rectangle with that width and height and add it

        // to the list of objects.

        System.out.println("Please enter the height of the rectangle: ");

        double h = scan.nextDouble();

        System.out.println("Please enter the width of the rectangle: ");

        double w = scan.nextDouble();

        objects.add(new Rectangle(h, w));

        // Write a for loop that will print out all of the objects

        // in the list, along with their attributes (radius for circle,

        // width and height for rectangle, and side length for

        // equilateral triangle).

        for(int i =0; i < objects.size(); i++)
        {
            System.out.println(objects.get(i));
        }


        // Write code that will calculate and print the total perimeter

        // and total area of all the objects in the list.

        double totArea  = 0;
        double totPerimeter = 0;

        for(int i = 0; i< objects.size() ; i++)
        {
            totArea = totArea + objects.get(i).getArea();
            totPerimeter = totPerimeter + objects.get(i).getPerimeter();
        }

        System.out.format("%nTotal Area = %.2f and Total Perimeter = %.2f %n" , totArea, totPerimeter);

    }

}
