/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */

import java.util.Scanner;

public class Program2{

    public static void main(String[] args){

        double n, r, p, e, l, i, c, t;
        Scanner scan = new Scanner(System.in);

        System.out.println("Program 2 (Drake Equation) by Sai Ram Thota");
        System.out.println();
        System.out.println("Enter the following: ");

        System.out.print("R: Average Rate of Milky Way star Formation in stars/year:");
        r = scan.nextDouble();

        System.out.print("P: Fraction of formed stars that have planets:");
        p = scan.nextDouble();

        System.out.print("E: Average number of planets per star that can support life:");
        e = scan.nextDouble();

        System.out.print("L: fraction of life-supporting planets that actually develop life:");
        l = scan.nextDouble();

        System.out.print("I: fraction of life bearing planets where civilizations develop:");
        i = scan.nextDouble();

        System.out.print("C: fraction of civilizations that have detectable communications:");
        c = scan.nextDouble();

        System.out.print("T: length of time (in years) over which civilizations release signals:");
        t = scan.nextDouble();

        System.out.println();
        System.out.println("N = " + r + " * " + p +" * " +  e +" * " + l + " * " + i + " * " + c + " * " + t);

        //Calculating the Drake equations result using the formula N = R * P * E * L * I * C * T
        n = r * p * e * l * i * c * t;

        System.out.print("  = " + n + " detectable civilizations in the Milky Way galaxy");
    }
}