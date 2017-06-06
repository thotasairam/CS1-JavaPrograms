/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */
import java.util.Scanner;

public class ReverseKeyboard
{

    public static void main(String[] args)
    {

        System.out.println("Please enter a string: ");

        Scanner n = new Scanner(System.in);

        String s = n.nextLine();

        String rev = "";

        for (int i = 0; i < s.length(); i++)
        {

            rev = s.charAt(i) + rev;

        }

        System.out.println(rev);

    }

}