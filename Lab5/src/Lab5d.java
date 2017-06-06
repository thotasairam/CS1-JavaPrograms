/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */

import java.util.*;

public class Lab5d

{
    public static void processLine(String line)
    {
        // Create a scanner for the line of input you have read

        Scanner lineScan = new Scanner(line);

        // Write a while loop that will sum all of the

        // double values on the line (hint: create double

        // variables called "sum", "product", and "count".

        // Set sum and count to 0, and product to 1.

        // Then read as many double values

        // as you can using the while loop When you read

        // a number, add it to sum, multiply product by it,

        // and add 1 to count.

        double sum = 0;
        double count = 0;
        double product = 1;

        while(lineScan.hasNextLine())
        {
            double temp = lineScan.nextDouble();
            sum = sum + temp;
            count++;
            product = product * temp;
        }


        // Compute the average by dividing sum by count

        double average = (sum/count) ;

        // Print out the sum, product, and average on one line

        System.out.printf("Sum: %.2f Product: %.2f Average: %.2f %n" , sum, product, average);
    }

    public static void main(String args[])

    {

        // Scan the input

        Scanner scan = new Scanner(System.in);

        // Process each line separately

        // If the next token is a double, assume there is an input line

        while (scan.hasNextLine())
        {
            processLine(scan.nextLine());
        }

    }

}