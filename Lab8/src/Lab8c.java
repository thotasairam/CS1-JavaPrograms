/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */

public class Lab8c {

    public static void main(String[] args)

    {

        int SIZE = Integer.parseInt(args[0]);

        // Create a 3-dimensional array of double where

        // the size of each dimension is SIZE:

        double table[][][] = new double[SIZE][SIZE][SIZE];

        // Fill in the table using a 3-deep nested loop so that

        // table[a][b][c] = 1.5 for all a,b,c

        for (int i = 0; i < table.length; i++)
        {
            for (int j = 0; j < table.length; j++)
            {
                for (int k = 0; k< table.length; k++)
                {
                    table[i][j][k] = 1.5;
                    System.out.printf("%3.2f ", table[i][j][k]);
                }
                System.out.print("\n");
            }
        }

    }

}
//750 is the highest number that this program runs without an error
