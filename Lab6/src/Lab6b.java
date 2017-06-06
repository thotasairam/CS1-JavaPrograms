/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */
import java.util.*;

public class Lab6b {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        // Read in the number of data points

        int numDataPoints = scan.nextInt();

        // Create an array to hold the data points, and another to

        // hold the second derivative

        double data[] = new double[numDataPoints];

        double secondDerivative[] = new double[numDataPoints];

        // Read in all of the data points using a for loop

        for (int i = 0; i < numDataPoints; i++) {
            data[i] = scan.nextDouble();
        }

        // Print out the data using printArray

        printArray(data);

        System.out.println();

        // Create the second derivatives and store them in the

        // secondDerivative array.

        // (Since the first and last elements of the array do

        // not have neighbors, set their second derivatives to 0.)

        for (int i = 0; i < secondDerivative.length; i++) {
            if (i == 0 || ((secondDerivative.length - 1) == i)) {
                secondDerivative[i] = 0;
            } else {
                secondDerivative[i] = data[i - 1] - (2 * data[i]) + data[i + 1];
            }
        }

        // Print the second derivative array by calling printArray

        printArray(secondDerivative);
        System.out.println();

    }

    public static void printArray(double[] arr) {

        // Print the values of arr on a single line with spaces between them.

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%.2f ", arr[i]);
        }

    }

}