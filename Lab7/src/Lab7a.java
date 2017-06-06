/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */

import java.util.*;

public class Lab7a {

    public static void main(String args[]) {

        ArrayList<Double> list = createSquaresList(10);

        printList(list);

        removeElement(list, 4);

        printList(list);

        swapElements(list, 2, 6);

        printList(list);

        double max = getMaxValue(list);

        double ave = getAverage(list);

        // Print the max and average

        System.out.printf("Max: %.2f %nAvg: %.2f %n", max, ave);

        int idx1 = linearSearch(list, 4);

        int idx2 = linearSearch(list, 75);

        // Print the two indices

        System.out.printf("Index1 : %d %nIndex2 : %d %n", idx1, idx2);
    }

    public static ArrayList<Double> createSquaresList(int n) {

        // Create an ArrayList with the squares of n numbers, 0 to n-1

        // Return the ArrayList

        ArrayList<Double> temp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            temp.add((double) i * i);
        }

        return temp;

    }

    public static double getMaxValue(ArrayList<Double> list) {
        double max = 0;
        for (double temp : list) {
            if (temp > max) {
                max = temp;
            } else {
                continue;
            }
        }

        return max;

    }

    public static double getAverage(ArrayList<Double> list) {

        double sum = 0;
        for (double temp : list) {
            sum = sum + temp;
        }

        return (sum / list.size());

    }

    public static void removeElement(ArrayList<Double> list, int index) {

        // Remove the specified element, replacing it with the last element

        // in the array. Do not use list.remove(index). Instead,

        // swap elements index and list.size()-1. Then, remove the

        // last element in the list.

        swapElements(list, index, list.size() - 1);

        list.remove(list.size() - 1);

    }

    public static void swapElements(ArrayList<Double> list, int a, int b) {

        // Write code that swaps elements a and b of the ArrayList

        // Hint: you need a temporary variable.

        double temp = list.get(a);

        list.set(a, list.get(b));
        list.set(b, temp);

    }

    public static int linearSearch(ArrayList<Double> list, double val) {

        // Use a linear search to find the index of a particular value.

        // Return that index, or -1 if the value is not found.

        // Do not use list.indexOf(val)
        int index = -1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == val) {
                index = i;
            }
        }

        if (index > 0 && index < list.size()) {
            return index;
        } else {
            return index;
        }

    }

    public static void printList(ArrayList<Double> list) {

        // Print out the number of the list on one line, separated by

        // a comma and space, with a newline at the end.
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.printf("%.2f%n", list.get(i));
            } else {
                System.out.printf("%.2f, ", list.get(i));
            }
        }
    }

}