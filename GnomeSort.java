/**
 * Universidad del Valle de Guatemala
 * @author Isabella Obando Guzman, 23074
 * @author Angie Nadissa Vela López, 23764
 * @description clase que realiza el algoritmo de ordenamiento GnomeSort
 * codigo obtenido de https://github.com/Kumar-laxmi/Algorithms/blob/main/Java/Sorting/Gnome_Sorting.java 
 * @date creación 23/01/2024 última modificación 30/01/2024
 */

// Remove the unnecessary opening curly brace
// {
//Importing Scanner Class to get input from the user.
import java.util.Scanner;

// Remove the duplicate class declaration
public class GnomeSort {
    public static void main(String[] args) {
        // Initializing the Scanner Class
        Scanner sc = new Scanner(System.in);

        // Reading the size of the array to be sorted
        System.out.print("Enter Size of the Array = ");
        int size_of_array = sc.nextInt();

        // Initializing the gnome_sort array
        int gnome_sort[] = new int[size_of_array];

        // Reading elements from user using for loop and putting it into the gnome_sort
        // array
        for (int i = 0; i < size_of_array; i++) {
            System.out.print("Enter the array element " + (i + 1) + " = ");
            gnome_sort[i] = sc.nextInt();
        }

        // Since no input needed after this,so we are closing the scanner class.
        sc.close();

        // Printing the array elements before sorting.
        System.out.println("\nBefore Gnome sorting the array elements are");
        for (int i = 0; i < size_of_array; i++) {
            System.out.print(gnome_sort[i] + " ");
        }

        // For iterating the gnome_sort array we need a variable that is called as
        // pointer variable
        int pointer = 0;

        // Calling the Gnome_Sorting function which performs the GNOME sort recursively
        // and storing the sorted array in the result array
        int result[] = gnomeSorting(gnome_sort, pointer);

        // Printing the array elements after gnome sorting
        System.out.println("\nAfter Gnome Sorting the array Elements are");
        for (int i = 0; i < size_of_array; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public int[] gnomeSort(int[] array) {
        // Lógica de Gnome Sort
        int pointer = 0;
        return gnomeSorting(array, pointer);
    }

    // Function which performs the Gnome Sort
    // To keep the function safe and accessible inside this class only, I declared
    // it as private you can declare it as public too.
    private static int[] gnomeSorting(int recursive_gnome[], int position) {
        // BASE CASE of recursion
        if (position < recursive_gnome.length) {
            // position == 0 --> It is the starting of the array so no elements on left side
            // of the array it is the greatest we can increment.
            // recursive_gnome[position] >= recursive_gnome[position-1] --> The elements are
            // already in sorted position so no need to swap, we can increment.
            if (position == 0 || recursive_gnome[position] >= recursive_gnome[position - 1]) {
                // Recursively calling the gnomeSorting function
                gnomeSorting(recursive_gnome, position + 1);
            } else {
                // Swapping the elements because the array element in left side is higher than
                // the right side.
                int temp = recursive_gnome[position];
                recursive_gnome[position] = recursive_gnome[position - 1];
                recursive_gnome[position - 1] = temp;

                // Recursively calling the gnomeSorting function
                gnomeSorting(recursive_gnome, position - 1);
            }
        }

        // Returning the sorted array by gnome sorting.
        return recursive_gnome;
    }
}