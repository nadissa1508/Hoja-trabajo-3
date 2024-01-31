import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GnomeSortTest {

    @Test
    public void positiveTest() {
        GnomeSort<Integer> gnomeSort = new GnomeSort<>();
        Integer[] actual = {5, 1, 6, 2, 3, 4};
        Integer[] expected = {1, 2, 3, 4, 5, 6};

        gnomeSort.sort(actual);

        assertArrayEquals(expected, actual);
    }
}