import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Escoge el algoritmo de ordenamiento:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Heap Sort");
        System.out.println("4. Gnome Sort");
        System.out.println("5. Radix Sort");
        int choice = scanner.nextInt();


        System.out.print("Elige el numero de elementos: ");
        int numElements = scanner.nextInt();
        int[] arr = new int[numElements];


        // Generate random numbers
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100); // numbers between 0 and 99
        }


        System.out.println("Lista Original:");
        System.out.println(Arrays.toString(arr));


        switch (choice) {
            case 1:
                bubbleSort(arr);
                break;
            case 2:
                quickSort(arr, 0, arr.length - 1);
                break;
            case 3: 
                 heapSort(arr);
                break;
            case 4:
                gnomeSort(arr);
                break;
            case 5:
                radixSort(arr);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
                return;
        }


        System.out.println("Sorted list:");
        System.out.println(Arrays.toString(arr));
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);


        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;


                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }


        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;


        return i + 1;
    }
}