import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RadixSortTest {

  


    @Test
    public void testLargeNumbers() {
        int[] arr = {Integer.MAX_VALUE, 0, Integer.MIN_VALUE + 1};
        RadixSort.radixSort(arr, arr.length);
        assertArrayEquals(new int[]{Integer.MIN_VALUE + 1, 0, Integer.MAX_VALUE}, arr);
    }

    @Test
    public void testSortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        RadixSort.radixSort(arr, arr.length);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    
}
