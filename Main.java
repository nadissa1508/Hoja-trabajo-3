
/**
 * Universidad del Valle de Guatemala
 * @author Isabella Obando Guzman, 23074
 * @author Angie Nadissa Vela López, 23764
 * @description clase que verifica si existe el txt con 3000 numeros aleatorios
 * y permite que el usuario escoja el algoritmo sort que desee y lla cantidad de números a ordenar
 * @date creación 23/01/2024 última modificación 30/01/2024
 */

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void chooseSort(readGenerateDoc createDoc) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0, numElements = 0;

        System.out.println("\n\nEscoge el algoritmo de ordenamiento:");
        System.out.println("\n1. Merge Sort");
        System.out.println("\n2. Quick Sort");
        System.out.println("\n3. Heap Sort");
        System.out.println("\n4. Gnome Sort");
        System.out.println("\n5. Radix Sort");
        String option = scanner.nextLine();

        try {
            choice = Integer.parseInt(option);
        } catch (Exception e) {
            System.out.println("\nError, ingrese un numero");
        }

        if (choice < 1 || choice > 5) {
            System.out.println("\nError, opción incorrecta");
        } else {
            System.out.print("Elige la cantidad de elementos a ordenar: ");
            String num = scanner.nextLine();
            try {
                numElements = Integer.parseInt(num);
            } catch (Exception e) {
                System.out.println("\nError, ingrese un numero");
            }

            int[] arr = createDoc.readRandomNumbers("numeros.txt", numElements);

            System.out.println("Lista Original:");
            System.out.println(Arrays.toString(arr));

            if(choice == 1){
                MergeSort merge = new MergeSort();
                merge.mergeSort(arr, numElements);

            }else if(choice == 2){
                QuickSort quick = new QuickSort();
                quick.quickSort(arr, 0, numElements-1);
            }else if(choice == 3){
                HeapSort heap = new HeapSort();
                heap.sort(arr);
            }else if(choice == 4){
                GnomeSort gnome = new GnomeSort();
                gnome.gnomeSort(arr);
            }else if(choice == 5){
                RadixSort radix = new RadixSort();
                radix.radixSort(arr, numElements);
            }

            System.out.println("Lista ordenada:");
            System.out.println(Arrays.toString(arr));

        }

    }

    public static void main(String[] args) {

        File archivo = new File("numeros.txt");
        readGenerateDoc createDoc = new readGenerateDoc();

        if (archivo.exists()) {
            chooseSort(createDoc);
        } else {

            createDoc.generateRandomNumbers("numeros.txt", 3000, 0, 8000);
            chooseSort(createDoc);
        }

    }

    // private static int partition(int[] arr, int begin, int end) {
    //     int pivot = arr[end];
    //     int i = (begin - 1);

    //     for (int j = begin; j < end; j++) {
    //         if (arr[j] <= pivot) {
    //             i++;

    //             int swapTemp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = swapTemp;
    //         }
    //     }

    //     int swapTemp = arr[i + 1];
    //     arr[i + 1] = arr[end];
    //     arr[end] = swapTemp;

    //     return i + 1;
    // }
}