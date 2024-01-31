/**
 * Universidad del Valle de Guatemala
 * @author Isabella Obando Guzman, 23074
 * @author Angie Nadissa Vela López, 23764
 * @description clase que realiza el algoritmo de ordenamiento GnomeSort
 * codigo obtenido de https://github.com/Kumar-laxmi/Algorithms/blob/main/Java/Sorting/Gnome_Sorting.java 
 * @date creación 23/01/2024 última modificación 30/01/2024
 */
import java.util.Arrays;
public class GnomeSort<T extends Comparable<T>> implements ISort<T> {

    @Override
    public void sort(T[] array) {
        // Lógica del Gnome Sort
        int position = 0;
        gnomeSorting(array, position);
    }

    private static <T extends Comparable<T>> void gnomeSorting(T[] recursiveGnome, int position) {
        // BASE CASE de la recursión
        if (position < recursiveGnome.length) {
            if (position == 0 || recursiveGnome[position].compareTo(recursiveGnome[position - 1]) >= 0) {
                gnomeSorting(recursiveGnome, position + 1);
            } else {
                T temp = recursiveGnome[position];
                recursiveGnome[position] = recursiveGnome[position - 1];
                recursiveGnome[position - 1] = temp;

                gnomeSorting(recursiveGnome, position - 1);
            }
        }
    }
}
