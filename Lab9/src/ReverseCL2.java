/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */

public class ReverseCL2
{

    public static void main(String[] args)
    {

        if(args.length==0)
        {
            System.out.println("Usage: java ReverseCL2 <any word>");
        }
        else {
            String s = args[0];

            String rev = "";

            for (int i = 0; i < s.length(); i++)
            {

                rev = s.charAt(i) + rev;

            }

            System.out.println(rev);
        }

    }

}