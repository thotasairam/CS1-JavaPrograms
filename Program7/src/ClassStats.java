/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */
import java.util.*;
import java.io.*;

public class ClassStats
{
    public static Class c;

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        try
        {
            File loadFilePath = new File(args[0]);

            loadFile(loadFilePath);

            System.out.println("Class Stats program by Sai Ram Thota");
            System.out.println("loaded '" + loadFilePath.getName()+ "'");

            while (true)
            {
                System.out.print("> ");
                String input = scan.nextLine();
                String[] tokens = input.split(" ");

                if (tokens.length == 1)
                {
                    if (tokens[0].equalsIgnoreCase("exit"))
                        System.exit(1);
                    else if (tokens[0].equalsIgnoreCase("help"))
                        usage();
                    else if (tokens[0].equalsIgnoreCase("students"))
                        c.printStudents();
                    else if (tokens[0].equalsIgnoreCase("assignments"))
                        c.printAssignments();
                    else if (tokens[0].equalsIgnoreCase("report"))
                        c.printReport();
                    else
                    {
                        usage();
                    }
                }

                else if (tokens[0].equalsIgnoreCase("search"))
                    c.searchPartialStudent(tokens[1]);

                else if (tokens[0].equalsIgnoreCase("student"))
                    c.searchStudent(tokens[1], tokens[2]);

                else if (tokens[0].equalsIgnoreCase("assignment"))
                {
                    String assignment = "";
                    for (int i = 1; i < tokens.length; i++)
                        assignment += tokens[i] + " ";
                    c.searchAssignment(assignment.trim());
                }

            }
        }

        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }

    public static void usage()
    {
        System.out.println("Accepted commands :");
        System.out.println("exit");
        System.out.println("help");
        System.out.println("search [partial name]");
        System.out.println("students");
        System.out.println("assignments");
        System.out.println("report");
        System.out.println("student [student name]");
        System.out.println("assignments [assignment name]");

    }

    public static void loadFile(File file) throws FileNotFoundException
    {
        Scanner scan = new Scanner(file);
        String className = "";
        String classSection = "";
        ArrayList<String> assignments = new ArrayList<>();
        ArrayList<Double> possible = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; scan.hasNextLine(); i++)
        {
            String x = scan.nextLine();
            String[] tokens = x.split(",");
            if (i == 0)
            {
                className = tokens[0];
                classSection = tokens[1];
                for (int j = 2; j < tokens.length; j++)
                {
                    assignments.add(tokens[j]);
                }
            }
            else if (i == 1)
            {
                for (int j = 2; j < tokens.length; j++)
                {
                    possible.add(Double.parseDouble(tokens[j]));
                }
            }
            else
            {
                ArrayList<Double> grades = new ArrayList<>();
                for (int j = 2; j < tokens.length; j++)
                {
                    grades.add(Double.parseDouble(tokens[j]));
                }
                Student a = new Student(tokens[0], tokens[1], grades, possible);
                students.add(a);
            }
        }
        c = new Class(className, classSection, assignments, possible, students);
    }
}