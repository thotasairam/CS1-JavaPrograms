/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class PlanetSort {

    public static void main(String args[]) throws Exception
    {
        //Initializing all variables
        String filePath = "";
        String sortKey = "";
        Scanner n = new Scanner(System.in);
        BufferedReader in = null;
        ArrayList<Planet> myPlanets = new ArrayList<Planet>();



        if(args.length > 0) //commandLine input
        {
            if(args.length == 1) //error output
            {
                System.out.println("Invalid command line input.");
                System.out.println("Please rerun the program, using: java Planet <file path> <sorting key>");
                System.out.println("You can also run the program, without command line argument by: java Planet");
                System.exit(0);
            }
            else
            {
                filePath = args[0];
                sortKey = args[1];
            }
        }
        else //promptingUser input
        {
            System.out.println("Please give the <file path> or <file name>(if the file exists in the same directory): ");

            filePath = n.nextLine();

            System.out.println("Please enter the sorting key: ");

            sortKey = n.nextLine();
        }

        try{

            in = new BufferedReader(new FileReader(filePath));
            String read = null;
            while((read = in.readLine()) != null)
            {
                String[] inputValues = read.split(",");

                //storing the values in myPlanets (ArrayList of class Planet)
                myPlanets.add(new Planet(inputValues[0],
                        Integer.parseInt(inputValues[1]),
                        Double.parseDouble(inputValues[2]),
                        Double.parseDouble(inputValues[3]),
                        Double.parseDouble(inputValues[4])));
            }

            switch (sortKey)
            {
                case "planetName": Collections.sort(myPlanets, new planetNameComparator()); break;
                case "yearDiscovered": Collections.sort(myPlanets, new yearComparator()); break;
                case "mass" : Collections.sort(myPlanets, new massComparator()); break;
                case "radius": Collections.sort(myPlanets, new radiusComparator()); break;
                case "orbitPeriod": Collections.sort(myPlanets, new orbitPeriodComparator()); break;
                default: System.out.println("Invalid Sorting key. " +
                        "Please rerun using \"planetName\", \"yearDiscovered\", \"mass\", \"radius\", \"orbitPeriod\"");
                    System.exit(0);
            }

            System.out.println("Planet sorting program by Sai Ram Thota\n");

            System.out.printf("%-20s %-20s %-20s %-20s %-20s %n %n", "Name", "Discovered", "Mass", "Radius", "Orbit");

            for (int i =0; i<myPlanets.size(); i++)
                System.out.printf( "%-20s %-20s %-20s %-20s %-20s %n", myPlanets.get(i).getPlanetName(), myPlanets.get(i).getYearDiscovered(),
                        myPlanets.get(i).getMass(), myPlanets.get(i).getRadius(), myPlanets.get(i).getOrbitPeriod());


        }
        catch (IOException e){
            System.out.print(e);
        }

    }
}

class planetNameComparator implements Comparator<Planet>
{
    @Override
    public int compare(Planet a, Planet b)
    {
        return a.getPlanetName().compareToIgnoreCase(b.getPlanetName());
    }
}


class yearComparator implements Comparator<Planet>
{
    @Override
    public int compare(Planet a, Planet b)
    {
        if(a.getYearDiscovered() < b.getYearDiscovered())
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}

class massComparator implements Comparator<Planet>
{
    @Override
    public int compare(Planet a, Planet b)
    {
        if(a.getMass() < b.getMass())
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}

class radiusComparator implements Comparator<Planet>
{
    @Override
    public int compare(Planet a, Planet b)
    {
        if(a.getRadius() < b.getRadius())
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}

class orbitPeriodComparator implements Comparator<Planet>
{
    @Override
    public int compare(Planet a, Planet b)
    {
        if(a.getOrbitPeriod() < b.getOrbitPeriod())
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}
