/**
 * Universidad del Valle de Guatemala
 * 
 * @author Isabella Obando Guzman, 23074
 * @author Angie Nadissa Vela López, 23764
 * @description clase que realiza el algoritmo de ordenamiento QuickSort
 * codigo obtenido de https://www.baeldung.com/java-quicksort
 * @date creación 23/01/2024 última modificación 30/01/2024
 */

 import java.util.Arrays;
 public class QuickSort<T extends Comparable<T>> implements ISort<T> {
 
     @Override
     public void sort(T[] array) {
         quickSort(array, 0, array.length - 1);
     }
 
     private void quickSort(T[] arr, int begin, int end) {
         if (begin < end) {
             int partitionIndex = partition(arr, begin, end);
 
             quickSort(arr, begin, partitionIndex - 1);
             quickSort(arr, partitionIndex + 1, end);
         }
     }
 
     private int partition(T[] arr, int begin, int end) {
         T pivot = arr[end];
         int i = (begin - 1);
 
         for (int j = begin; j < end; j++) {
             if (arr[j].compareTo(pivot) <= 0) {
                 i++;
 
                 T swapTemp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = swapTemp;
             }
         }
 
         T swapTemp = arr[i + 1];
         arr[i + 1] = arr[end];
         arr[end] = swapTemp;
 
         return i + 1;
     }
 }
 