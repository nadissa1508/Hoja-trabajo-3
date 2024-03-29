
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

        System.out.println("\n\nEscoge el algoritmo de ordenamiento:");
        System.out.println("1. Merge Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Heap Sort");
        System.out.println("4. Gnome Sort");
        System.out.println("5. Radix Sort");

        String option = scanner.nextLine();

        int choice = 0, numElements = 0;
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

            Integer[] arr = Arrays.stream(createDoc.readRandomNumbers("numeros.txt", numElements)).boxed().toArray(Integer[]::new);

            System.out.println("Lista Original:");
            System.out.println(Arrays.toString(arr));

            ISort<Integer> sortingAlgorithm = null;

            if (choice == 1) {
                sortingAlgorithm = new MergeSort<>();
            } else if (choice == 2) {
                sortingAlgorithm = new QuickSort<>();
            } else if (choice == 3) {
                sortingAlgorithm = new HeapSort<>();
            } else if (choice == 4) {
                sortingAlgorithm = new GnomeSort<>();
            } else if (choice == 5) {
                sortingAlgorithm = new RadixSort<>();
            }

            System.out.println("Lista ordenada:");
            sortingAlgorithm.sort(arr);
            System.out.println(Arrays.toString(arr));
        }

    }

    public static void main(String[] args) {
        File archivo = new File("numeros.txt");
        readGenerateDoc createDoc = new readGenerateDoc();

        if (archivo.exists()) {
            // El archivo ya existe, el usuario puede elegir el algoritmo
            chooseSort(createDoc);
        } else {
            // El archivo no existe, generamos números aleatorios y el usuario elige el
            // algoritmo
            createDoc.generateRandomNumbers("numeros.txt", 3000, 0, 8000);
            chooseSort(createDoc);
        }
    }

}