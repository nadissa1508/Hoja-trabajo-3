import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest {

    @Test
    public void positiveTest() {
        QuickSort<Integer> quickSort = new QuickSort<>();
        Integer[] actual = {5, 1, 6, 2, 3, 4};
        Integer[] expected = {1, 2, 3, 4, 5, 6};

        quickSort.sort(actual);

        assertArrayEquals(expected, actual);
    }
}