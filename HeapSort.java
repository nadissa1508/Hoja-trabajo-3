/**
 * Universidad del Valle de Guatemala
 * 
 * @author Isabella Obando Guzman, 23074
 * @author Angie Nadissa Vela López, 23764
 * @description clase que realiza el algoritmo de ordenamiento HeapSort
 *              codigo obtenido de https://www.geeksforgeeks.org/heap-sort/
 * @date creación 23/01/2024 última modificación 30/01/2024
 */

 import java.util.Arrays;
 public class HeapSort<T extends Comparable<T>> implements ISort<T> {
 
     @Override
     public void sort(T[] array) {
         int N = array.length;
 
         // Build heap (rearrange array)
         for (int i = N / 2 - 1; i >= 0; i--)
             heapify(array, N, i);
 
         // One by one extract an element from heap
         for (int i = N - 1; i > 0; i--) {
             T temp = array[0];
             array[0] = array[i];
             array[i] = temp;
 
             heapify(array, i, 0);
         }
     }
 
     void heapify(T[] array, int N, int i) {
         int largest = i;
         int l = 2 * i + 1;
         int r = 2 * i + 2;
 
         if (l < N && array[l].compareTo(array[largest]) > 0)
             largest = l;
 
         if (r < N && array[r].compareTo(array[largest]) > 0)
             largest = r;
 
         if (largest != i) {
             T swap = array[i];
             array[i] = array[largest];
             array[largest] = swap;
 
             heapify(array, N, largest);
         }
     }
 }
 