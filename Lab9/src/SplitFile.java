/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */

import java.util.*;

import java.io.*;

public class SplitFile
{

    public static void main(String[] args)

    {

        // Usage statement (3 inputs needed)

        if(args.length == 0 || args.length == 1 || args.length ==2)
        {
            System.out.println("Usage: java SplitFile <filename> <filename> <filename>");
            System.exit(0);
        }

        PrintWriter file1 = null;

        PrintWriter file2 = null;

        try {

            // Open Scanner for file named args[0]

            Scanner scan = new Scanner(new File(args[0]));

            // Open a PrintWriter for file named args[1]

            file1 = new PrintWriter(new File(args[1]));

            // Open a PrintWriter for file named args[2]

            file2 = new PrintWriter(args[2]);

            while (scan.hasNextLine())
            {

                // Read a line from scan

                // Write that line to file1

                file1.println(scan.nextLine());

                if (scan.hasNextLine())
                {

                    // Read a line from scan

                    // Write that line to file2

                    file2.println(scan.nextLine());
                }

            }

        }

        // Catch the IOException
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        // Create a finally block that closes the two PrintWriters

        finally {
            if (file1 != null) {
                System.out.println("Closing PrintWriter file1");
                file1.close();
            }
            else {
                System.out.println("PrintWriter for file1 not open");
            }

            if (file2 != null)
            {
                System.out.println("Closing PrintWriter file2");
                file2.close();
            }
            else
            {
                System.out.println("PrintWriter for file2 not open");
            }
        }
    }

}
