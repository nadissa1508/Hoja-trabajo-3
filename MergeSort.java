/**
 * Universidad del Valle de Guatemala
 * 
 * @author Isabella Obando Guzman, 23074
 * @author Angie Nadissa Vela López, 23764
 * @description clase que realiza el algoritmo de ordenamiento MergeSort
 *              codigo obtenido de https://www.baeldung.com/java-merge-sort
 * @date creación 23/01/2024 última modificación 30/01/2024
 */

 import java.util.Arrays;
 public class MergeSort<T extends Comparable<T>> implements ISort<T> {
 
     @Override
     public void sort(T[] array) {
         mergeSort(array, array.length);
     }
 
     private void mergeSort(T[] a, int n) {
         if (n < 2) {
             return;
         }
         int mid = n / 2;
         T[] l = Arrays.copyOfRange(a, 0, mid);
         T[] r = Arrays.copyOfRange(a, mid, n);
 
         mergeSort(l, mid);
         mergeSort(r, n - mid);
 
         merge(a, l, r, mid, n - mid);
     }
 
     private void merge(T[] a, T[] l, T[] r, int left, int right) {
         int i = 0, j = 0, k = 0;
         while (i < left && j < right) {
             if (l[i].compareTo(r[j]) <= 0) {
                 a[k++] = l[i++];
             } else {
                 a[k++] = r[j++];
             }
         }
         while (i < left) {
             a[k++] = l[i++];
         }
         while (j < right) {
             a[k++] = r[j++];
         }
     }
 }
 