/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */

import java.util.*;

public class Lab3
{

    public static void main (String[] args)
    {

        System.out.println("Lab 3 for  Sai Ram Thota");

        Scanner keyboard = new Scanner(System.in);

        int iX = 0;

        double dY = 0;

        String title;

        // Declare integer variable iA, iB and

        // double variables dA, dB here.

        // Initialize all variables with zero.

        int iA = 0, iB =0;
        double dA =0, dB = 0;

        // Prompt user for input

        System.out.println("Enter the title and section of the course. ");

        // Read user String input and store value into variable title

        title = keyboard.nextLine();

        // Prompt user for input

        System.out.println("Enter two integer numbers : ");

        // Read user int input and store value into variable iA

        iA = keyboard.nextInt();

        // Read in the second int value that the user

        // enters and store it in iB

        // Similar to the statement above

        iB = keyboard.nextInt();

        // Prompt the user to provide a double value

        // Similar to statements above

        System.out.println("Enter a double value: ");

        // Read user double input and store value into variable dA

        dA = keyboard.nextDouble();

        // Prompt the user to provide a second double value

        // Similar to statements above

        System.out.println("Enter another double value: ");

        // Read in the second double value that the user

        // enters and store it in dB

        // Similar to the statement above

        dB = keyboard.nextDouble();

        System.out.println("Title: " + title);

        iX = iA + iB;

        System.out.println("iA + iB = " + iX);

        // Calculate iA - iB and assign the results to iX here

        iX = iA - iB;

        System.out.println("iA - iB = " + iX);

        // Calculate iA * iB and assign the results to iX here

        iX =iA * iB;

        System.out.println("iA * iB = " + iX);

        // Calculate iA / iB and assign the results to iX here

        iX = iA / iB;

        System.out.println("iA / iB = " + iX);

        // Calculate iA % iB and assign the results to iX here

        iX = iA % iB;

        System.out.println("iA % iB = " + iX);

        // Calculate dA + dB and assign the results to dY here

        dY = dA + dB;

        System.out.println("dA + dB = " + dY);

        // Calculate dA - dB and assign the results to dY here

        dY = dA - dB;

        System.out.println("dA - dB = " + dY);

        // Calculate dA * dB and assign the results to dY here

        dY = dA * dB;

        System.out.println("dA * dB = " + dY);

        // Calculate dA / dB and assign the results to dY here

        dY = dA / dB;

        System.out.println("dA / dB = " + dY);

        // Calculate dA % dB and assign the results to dY here

        dY = dA % dB;

        System.out.println("dA % dB = " + dY);

    } // End of public static void main

} // End of public class Lab3