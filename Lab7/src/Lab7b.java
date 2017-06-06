/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */

import java.util.*;

public class Lab7b {

    public static void main(String args[]) {

        // Create a new HashMap called "songStars"

        HashMap<String, Integer> songStars = new HashMap<String, Integer>();

        // Yes, you should listen to all these on Youtube.

        songStars.put("The ballad of Bilbo Baggins", 5);

        songStars.put("A still more glorious dawn", 4);

        songStars.put("A finite simple group of order two", 4);

        songStars.put("Code monkey", 4);

        songStars.put("Fish heads", 2);

        songStars.put("I'll form the head", 3);

        songStars.put("Honeybee", 5);

        songStars.put("Silver apples of the moon", 4);

        // Get the number of stars for "Code monkey", and print the # of stars

        System.out.println(songStars.get("Code monkey"));

        // Remove the song "Honeybee"

        songStars.remove("Honeybee");

        // Determine if "Honeybee" is still in the table.

        // If it is in the table, print "Honeybee still in table".

        // Otherwise print "Successfully removed Honeybee".

        if (songStars.containsKey("Honeybee")) {
            System.out.println("Honeybee still in table");
        } else {
            System.out.println("Successfully removed Honeybee");
        }

    }

}