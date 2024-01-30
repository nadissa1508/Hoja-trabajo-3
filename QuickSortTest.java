import java.util.Arrays;

public class QuickSortTest {
    public static void main(String[] args) {
        // Test Case 1: Empty array
        int[] arr1 = {};
        QuickSort quickSort1 = new QuickSort();
        quickSort1.quickSort(arr1, 0, arr1.length - 1);
        System.out.println("Sorted array (Test Case 1): " + Arrays.toString(arr1));

        // Test Case 2: Array with one element
        int[] arr2 = {5};
        QuickSort quickSort2 = new QuickSort();
        quickSort2.quickSort(arr2, 0, arr2.length - 1);
        System.out.println("Sorted array (Test Case 2): " + Arrays.toString(arr2));

        // Test Case 3: Array with duplicate elements
        int[] arr3 = {7, 3, 9, 3, 1, 7};
        QuickSort quickSort3 = new QuickSort();
        quickSort3.quickSort(arr3, 0, arr3.length - 1);
        System.out.println("Sorted array (Test Case 3): " + Arrays.toString(arr3));

        // Test Case 4: Array with negative numbers
        int[] arr4 = {-5, -2, -8, -1, -3};
        QuickSort quickSort4 = new QuickSort();
        quickSort4.quickSort(arr4, 0, arr4.length - 1);
        System.out.println("Sorted array (Test Case 4): " + Arrays.toString(arr4));

        // Test Case 5: Array with already sorted elements
        int[] arr5 = {1, 2, 3, 4, 5};
        QuickSort quickSort5 = new QuickSort();
        quickSort5.quickSort(arr5, 0, arr5.length - 1);
        System.out.println("Sorted array (Test Case 5): " + Arrays.toString(arr5));
    }
}