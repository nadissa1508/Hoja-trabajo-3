// Test Case 1: Empty array
int[] arr1 = {};
RadixSort.radixSort(arr1);
System.out.println("Sorted array (Test Case 1): ");
RadixSort.print(arr1, arr1.length);

// Test Case 2: Array with one element
int[] arr2 = {5};
RadixSort.radixSort(arr2);
System.out.println("Sorted array (Test Case 2): ");
RadixSort.print(arr2, arr2.length);

// Test Case 3: Array with duplicate elements
int[] arr3 = {7, 3, 9, 3, 1, 7};
RadixSort.radixSort(arr3);
System.out.println("Sorted array (Test Case 3): ");
RadixSort.print(arr3, arr3.length);

// Test Case 4: Array with negative numbers
int[] arr4 = {-5, -2, -8, -1, -3};
RadixSort.radixSort(arr4);
System.out.println("Sorted array (Test Case 4): ");
RadixSort.print(arr4, arr4.length);

// Test Case 5: Array with already sorted elements
int[] arr5 = {1, 2, 3, 4, 5};
RadixSort.radixSort(arr5);
System.out.println("Sorted array (Test Case 5): ");
RadixSort.print(arr5, arr5.length);