import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void positiveTest() {
        // Arrange
        int[] actual = {5, 1, 6, 2, 3, 4};
        int[] expected = {1, 2, 3, 4, 5, 6};
        MergeSort mergeSort = new MergeSort();

        // Act
        mergeSort.mergeSort(actual, actual.length);

        // Assert
        assertArrayEquals(expected, actual);
    }
}