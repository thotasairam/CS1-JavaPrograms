/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */
import java.util.*;

public class Class
{
    public String className;
    public String classSection;
    public ArrayList<String> assignments;
    public ArrayList<Double> possible;
    public ArrayList<Student> students;
    public double possiblePoints;
    public double average;

    public Class(String className, String classSection, ArrayList<String> assignments, ArrayList<Double> possible, ArrayList<Student> students)
    {
        this.className = className;
        this.classSection = classSection;
        this.assignments = assignments;
        this.possible = possible;
        this.students = students;
        this.possiblePoints = calculatePossiblePoints(possible);
        this.average = calculateAverage(students);
    }

    public void searchAssignment(String assignment)
    {
        for (int i = 0; i < assignments.size(); i++)
        {
            if (assignments.get(i).equalsIgnoreCase(assignment))
            {
                System.out.println(assignment + ": " + possible.get(i) + " points");
                System.out.println("grade breakdown");

                int countA = 0;
                int countB = 0;
                int countC = 0;
                int countD = 0;
                int countF = 0;

                for (Student s : students)
                {
                    char letterGrade = s.calculateLetterGrade(100 * s.grades.get(i) / possible.get(i));
                    if (letterGrade == 'A')
                        countA++;
                    else if (letterGrade == 'B')
                        countB++;
                    else if (letterGrade == 'C')
                        countC++;
                    else if (letterGrade == 'D')
                        countD++;
                    else
                        countF++;
                }

                System.out.println("A: " + countA);
                System.out.println("B: " + countB);
                System.out.println("C: " + countC);
                System.out.println("D: " + countD);
                System.out.println("F: " + countF);
                return;
            }
        }
        System.out.println("The assignment " + assignment + " was not found.");
    }

    public void searchPartialStudent(String name)
    {
        for (Student s: students)
        {
            if(s.firstName.toLowerCase().contains(name.toLowerCase()))
            {
                System.out.printf("%-10s	%-9s	%-6s	%-5s \n", "First Name", "Last Name", "Points", "Grade");
                System.out.println("----------	---------	------	-----");
                System.out.printf("%-10s	%-9s	%-4.2f	%-5s \n", s.firstName, s.lastName, s.total, s.letterGrade);
                return;
            }
            else if(s.lastName.toLowerCase().contains(name.toLowerCase()))
            {
                System.out.printf("%-10s	%-9s	%-6s	%-5s \n", "First Name", "Last Name", "Points", "Grade");
                System.out.println("----------	---------	------	-----");
                System.out.printf("%-10s	%-9s	%-4.2f	%-5s \n", s.firstName, s.lastName, s.total, s.letterGrade);
                return;
            }
        }
        System.out.println("Student Not found!");

    }

    public void searchStudent(String firstName, String lastName)
    {
        for (Student s : students)
        {
            if ((s.firstName).equalsIgnoreCase(firstName) && (s.lastName).equalsIgnoreCase(lastName))
            {
                System.out.println("Grades for " + firstName + " " + lastName);
                System.out.println();
                System.out.printf("%-10s	%-6s	%-8s \n", "Assignment", "Points", "Possible");
                System.out.println("----------	------	--------");
                for (int i = 0; i < assignments.size(); i++)
                    System.out.printf("%-10s	%-6s	%-8s \n", assignments.get(i), (s.grades).get(i), possible.get(i));
                System.out.println();
                System.out.println("Final Grade: " + s.letterGrade);
                return;
            }
        }
        System.out.println("The student " + firstName + " " + lastName + " was not found.");
    }

    public void printAssignments()
    {
        System.out.printf("%-10s	%-6s \n", "Assignment", "Points");
        System.out.println("---------	------");
        for (int i = 0; i < assignments.size(); i++)
            System.out.printf("%-10s	%-4.2f \n", assignments.get(i), possible.get(i));
    }

    public void printReport()
    {
        System.out.println("Grade breakdown for " + className + ", " + classSection);
        double low = (students.get(0)).average;
        double high = 0;
        for (int i = 0; i < students.size(); i++)
        {
            if (low > (students.get(i)).average)
                low = (students.get(i)).average;
            if (high < (students.get(i)).average)
                high = (students.get(i)).average;
        }

        System.out.println("Low: " + low + "%");
        System.out.println("High: " + high + "%");
        System.out.println("Average: " + average + "%");

        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;

        for (Student s : students)
        {
            if (s.letterGrade == 'A')
                countA++;
            else if (s.letterGrade == 'B')
                countB++;
            else if (s.letterGrade == 'C')
                countC++;
            else if (s.letterGrade == 'D')
                countD++;
            else
                countF++;
        }

        System.out.println("A: " + countA);
        System.out.println("B: " + countB);
        System.out.println("C: " + countC);
        System.out.println("D: " + countD);
        System.out.println("F: " + countF);
    }

    public void printStudents()
    {
        System.out.println("Student Grades for " + className + ", " + classSection);
        System.out.println("Total points possible: " + possiblePoints);

        System.out.printf("%-10s	%-10s	%-6s	%-5s \n", "First Name", "Last Name", "Points", "Grade");
        System.out.println("--------	----------	------	-----");
        for (Student s : students)
            System.out.printf("%-10s	%-10s	%-4.2f	%-5s \n", s.firstName, s.lastName, s.total, s.letterGrade);
    }

    private double calculatePossiblePoints(ArrayList<Double> possible)
    {
        double total = 0;
        for (double p : possible)
            total += p;
        return total;
    }

    private double calculateAverage(ArrayList<Student> students)
    {
        double total = 0;
        for (Student s : students)
            total += s.average;
        return total / students.size();
    }
}
