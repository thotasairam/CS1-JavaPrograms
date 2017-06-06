/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */
import java.util.*;

public class Student
{
    public String firstName = "";
    public String lastName = "";
    public ArrayList<Double> grades = new ArrayList<>();
    public double total;
    public double average;
    public char letterGrade;
    public double possiblePoints;

    public Student(String firstName, String lastName, ArrayList<Double> grades, ArrayList<Double> possible)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
        this.possiblePoints = calculatePossiblePoints(possible);
        this.average = calculateAverage(grades);
        this.letterGrade = calculateLetterGrade(average);
    }

    public double calculatePossiblePoints(ArrayList<Double> possible)
    {
        double sum = 0;
        for (double d : possible){
            sum += d;
        }
        return sum;
    }

    public double calculateAverage(ArrayList<Double> grades)
    {
        double sum = 0;
        for (double g : grades){
            sum += g;
        }
        total = sum;
        return 100 * sum / possiblePoints;
    }

    public char calculateLetterGrade(double average)
    {
        if (average >= 90)
            return 'A';
        else if (average >= 80 && average < 90)
            return 'B';
        else if (average >= 70 && average < 80)
            return 'C';
        else if (average >= 60 && average < 70)
            return 'D';
        else
            return 'F';
    }
}
