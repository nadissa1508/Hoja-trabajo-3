import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HeapSortTest {

    @Test
    public void positiveTest() {
        HeapSort<Integer> heapSort = new HeapSort<>();
        Integer[] actual = {5, 1, 6, 2, 3, 4};
        Integer[] expected = {1, 2, 3, 4, 5, 6};

        heapSort.sort(actual);

        assertArrayEquals(expected, actual);
    }
}