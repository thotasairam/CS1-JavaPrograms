/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */

import java.util.*;

import java.io.*;

public class Interleave

{

    public static void main(String[] args)

    {

        // Usage statement (2 inputs needed)

        if(args.length == 0 || args.length == 1)
        {
            System.out.println("Usage: java InterLeave <filename> <filename>");
            System.exit(0);
        }

        try {

            // Open scanner for file named args[0]

            Scanner scan1 = new Scanner(new File(args[0]));

            // Open scanner for file named args[1]

            Scanner scan2 = new Scanner(new File(args[1]));

            boolean moreLines = true;
            String s1 = "";
            String s2 = "";

            while (moreLines)
            {

                moreLines = false;

                // If scan1 has another line then read that line, copy it

                // to the console, and set moreLines to true

                if(scan1.hasNextLine())
                {
                    s1 = s1 + scan1.nextLine();
                    moreLines = true;
                }

                // If the second scanner, scan2, has another line,

                // then get that line, copy it to the console, and set

                // moreLines to true.

                if (scan2.hasNextLine())
                {
                    s2 = s2 + scan2.nextLine();
                    moreLines = true;
                }

            }

            System.out.println(s1);
            System.out.println(s2);

        }
        catch (IOException ex)
        {
            System.out.println("Please enter a valid file name which is in the same directory as Interleave.java");

        }

    }

}