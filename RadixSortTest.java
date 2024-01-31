import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RadixSortTest {

    @Test
    public void positiveTest() {
        RadixSort<Integer> radixSort = new RadixSort<>();
        Integer[] actual = {5, 1, 6, 2, 3, 4};
        Integer[] expected = {1, 2, 3, 4, 5, 6};

        radixSort.sort(actual);

        assertArrayEquals(expected, actual);
    }
}