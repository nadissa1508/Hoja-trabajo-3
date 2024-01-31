import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void positiveTest() {
 
        Integer[] actual = {5, 1, 6, 2, 3, 4};
        Integer[] expected = {1, 2, 3, 4, 5, 6};
        ISort<Integer> mergeSort = new MergeSort<>();
   
        mergeSort.sort(actual);
        assertArrayEquals(expected, actual);
    }
}

