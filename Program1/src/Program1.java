/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */
import java.util.Scanner;

// The class declaration.

// All Java programs have a class with a main method

public class Program1 {

    // The main method of the class. Program execution starts here.

    public static void main(String[] args) {

        // Declare Variables.

        // Variables are storage locations in the computer. In Java

        // a variable holds a specific type of data stuch as String

        // or double.

        String name; // a String holds a list of letters

        double age; // a double holds a number with a decimal part

        String major; // a second String to hold your major

        // Print your name

        System.out.println("Program 1 by Sai Ram Thota\n");

        // Create a scanner to read input from the keyboard

        Scanner scan = new Scanner(System.in);

        // Print out a "prompt" telling the user that they need

        // to type in their name.

        System.out.println("What is your name?");

        // Wait for the user to type a line of input and then

        // set the variable "name" to have this value.

        name = scan.nextLine();

        // Prompt the user for their major, and read the response

        System.out.println("What is your major?");

        major = scan.nextLine();

        // Prompt user for thier age, and read the response as a double

        // (double in this case means double-precision floating point number.)

        System.out.println("How old are you?");

        age = scan.nextDouble();

        // Print the output

        System.out.print("\n" + name + " is majoring in " + major + ",");

        System.out.print(" and is ");

        System.out.println(age + " years old.");

    } // End of main method

} // End of Program1 class