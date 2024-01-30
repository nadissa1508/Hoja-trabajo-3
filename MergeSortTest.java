import java.util.Arrays;

public class MergeSortTest {
    public static void main(String[] args) {
        // Test Case 1: Empty array
        int[] arr1 = {};
        MergeSort.mergeSort(arr1, arr1.length);
        System.out.println("Sorted array (Test Case 1): " + Arrays.toString(arr1));

        // Test Case 2: Array with one element
        int[] arr2 = {5};
        MergeSort.mergeSort(arr2, arr2.length);
        System.out.println("Sorted array (Test Case 2): " + Arrays.toString(arr2));

        // Test Case 3: Array with duplicate elements
        int[] arr3 = {7, 3, 9, 3, 1, 7};
        MergeSort.mergeSort(arr3, arr3.length);
        System.out.println("Sorted array (Test Case 3): " + Arrays.toString(arr3));

        // Test Case 4: Array with negative numbers
        int[] arr4 = {-5, -2, -8, -1, -3};
        MergeSort.mergeSort(arr4, arr4.length);
        System.out.println("Sorted array (Test Case 4): " + Arrays.toString(arr4));

        // Test Case 5: Array with already sorted elements
        int[] arr5 = {1, 2, 3, 4, 5};
        MergeSort.mergeSort(arr5, arr5.length);
        System.out.println("Sorted array (Test Case 5): " + Arrays.toString(arr5));
    }
}