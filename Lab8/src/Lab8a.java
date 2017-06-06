/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */

public class Lab8a {

    public static void main(String[] args)
    {

        // Read an integer from the command line

        int tableSize = Integer.parseInt(args[0]);

        // Create a 2D array of ints to hold the addition table

        int table[][] = new int[tableSize][tableSize];

        // Fill out the table using a nested loop so that

        // table[r][c] = r + c

        for(int r = 0; r < table.length; r++)
        {
            for (int c = 0; c < table[r].length; c++)
            {
                table[r][c] = r + c;
            }
        }

        // Iterate over the table, printing each value

        // so that columns align (hint: use a nested loop,

        // and printf)

        for(int r = 0; r < table.length; r++)
        {
            for (int c = 0; c < table[r].length; c++)
            {
                System.out.printf("%3d ", table[r][c]);
            }
            System.out.print("\n");
        }

    }
}
