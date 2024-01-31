
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
     public static void chooseSort(ISort<Integer> sortingAlgorithm, readGenerateDoc createDoc) {
         Scanner scanner = new Scanner(System.in);
         int numElements = 0;
 
         System.out.println("\n\nEscoge el algoritmo de ordenamiento:");
         System.out.println("\n1. Merge Sort");
         System.out.println("\n2. Quick Sort");
         System.out.println("\n3. Heap Sort");
         System.out.println("\n4. Gnome Sort");
         System.out.println("\n5. Radix Sort");
         String option = scanner.nextLine();
 
         int choice = 0;
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
             Integer[] arr = Arrays.stream(createDoc.readRandomNumbers("numeros.txt", numElements))
                       .boxed()
                       .toArray(Integer[]::new);
             
             System.out.println("Lista Original:");
             System.out.println(Arrays.toString(arr));
 
             sortingAlgorithm.sort(arr);
 
             System.out.println("Lista ordenada:");
             System.out.println(Arrays.toString(arr));
         }
     }
 
     public static void main(String[] args) {
         File archivo = new File("numeros.txt");
         readGenerateDoc createDoc = new readGenerateDoc();
 
         if (archivo.exists()) {
             // Crear instancias de las clases de ordenamiento
             ISort<Integer> mergeSort = new MergeSort<>();
             ISort<Integer> quickSort = new QuickSort<>();
             ISort<Integer> heapSort = new HeapSort<>();
             ISort<Integer> gnomeSort = new GnomeSort<>();
             ISort<Integer> radixSort = new RadixSort<>();
 
             chooseSort(mergeSort, createDoc); // Puedes cambiar el algoritmo pasando la instancia correspondiente
         } else {
             createDoc.generateRandomNumbers("numeros.txt", 3000, 0, 8000);
             // Repite para cada algoritmo de ordenamiento si es necesario
             chooseSort(new MergeSort<>(), createDoc);
         }
     }
 
 }