/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */
import java.util.Scanner;

public class Lab4b
{

    public static void main(String[] args)

    {

        // Declare variables

        Scanner scan = new Scanner(System.in);

        double degreeCelsius = 0;

        double degreeFahrenheit;

        // Print to the screen the header of the output table

        // as seen in the sample run below.

        // There are two lines in the header.

        // Make sure it has the right spacing to line up with the table.

        System.out.println("Celsius    | Fahrenheit");
        System.out.println("-----------+-----------");


        // Write your loop here

        // We want to loop until there are no more inputs to be read.

        while(scan.hasNext() == true)
        {

            // Check to see if the input is a double.

            // If a double read in and store in degreeCelsius.

            // If not a double print an error message and quit.

            if(scan.hasNextDouble() == false)
            {
                System.out.println("Please enter a valid double.");
                System.exit(0);
            }
            else
            {
                degreeCelsius = scan.nextDouble();
            }
            // Convert input degrees Celsius to degrees Fahrenheit

            // and store in degreeFahrenheit. The formula is given by

            // f = c * (9.0/5.0) + 32.0

            degreeFahrenheit = (degreeCelsius * (9.0/5.0)) + 32.0;

            // Display to the screen the output as shown in the

            // sample run below. Use System.out.printf. Make sure

            // that everything lines up properly.

            System.out.printf("%11.2f|%11.2f%n", degreeCelsius, degreeFahrenheit);

        } // End of loop

    } // End of main method

} // End class