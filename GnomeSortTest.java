
// Test Case 1: Sorting an array with positive integers
int[] array1 = {5, 2, 8, 1, 9};
int[] sortedArray1 = GnomeSort.gnomeSort(array1);
// Expected output: [1, 2, 5, 8, 9]

// Test Case 2: Sorting an array with negative integers
int[] array2 = {-3, -7, -1, -5, -2};
int[] sortedArray2 = GnomeSort.gnomeSort(array2);
// Expected output: [-7, -5, -3, -2, -1]

// Test Case 3: Sorting an array with duplicate elements
int[] array3 = {4, 2, 6, 2, 1};
int[] sortedArray3 = GnomeSort.gnomeSort(array3);
// Expected output: [1, 2, 2, 4, 6]

// Test Case 4: Sorting an empty array
int[] array4 = {};
int[] sortedArray4 = GnomeSort.gnomeSort(array4);
// Expected output: []

// Test Case 5: Sorting an array with a single element
int[] array5 = {9};
int[] sortedArray5 = GnomeSort.gnomeSort(array5);
// Expected output: [9]