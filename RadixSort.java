
/**
 * Universidad del Valle de Guatemala
 * @author Isabella Obando Guzman, 23074
 * @author Angie Nadissa Vela López, 23764
 * @description clase que realiza el algoritmo de ordenamiento RadixSort
 * codigo obtenido de https://www.geeksforgeeks.org/radix-sort/ 
 * @date creación 23/01/2024 última modificación 30/01/2024
 */

 import java.util.Arrays;

 public class RadixSort<T extends Comparable<T>> implements ISort<T> {
     @Override
     public void sort(T[] array) {
         // Verifica si el array está vacío o tiene un solo elemento
         if (array == null || array.length <= 1) {
             return;
         }
 
         // Encuentra el elemento máximo para determinar el número de dígitos
         T max = array[0];
         for (T element : array) {
             if (element.compareTo(max) > 0) {
                 max = element;
             }
         }
 
         // Realiza el radix sort
         for (int exp = 1; ((Integer) max) / exp > 0; exp *= 10) {
             countSort(array, exp);
         }
     }
 
     private void countSort(T[] array, int exp) {
         int n = array.length;
         T[] output = Arrays.copyOf(array, n);
 
         int[] count = new int[10];
         Arrays.fill(count, 0);
 
         for (int i = 0; i < n; i++) {
             count[((Integer) array[i]) / exp % 10]++;
         }
 
         for (int i = 1; i < 10; i++) {
             count[i] += count[i - 1];
         }
 
         for (int i = n - 1; i >= 0; i--) {
             output[count[((Integer) array[i]) / exp % 10] - 1] = array[i];
             count[((Integer) array[i]) / exp % 10]--;
         }
 
         System.arraycopy(output, 0, array, 0, n);
     }
 
    
 }
 