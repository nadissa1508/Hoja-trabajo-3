import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GnomeSortTest {

    @Test
    public void testEmptyArray() {
        int[] emptyArray = new int[0];
        assertArrayEquals(emptyArray, GnomeSort.gnomeSorting(emptyArray, 0));
    }

    @Test
    public void testSingleElementArray() {
        int[] singleElementArray = {1};
        assertArrayEquals(singleElementArray, GnomeSort.gnomeSorting(singleElementArray, 0));
    }

 
}
