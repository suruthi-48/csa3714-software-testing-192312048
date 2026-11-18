
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q26LargestArrayTest {

    int largest(int[] a) {
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    @Test
    void testLargest() {
        assertEquals(50, largest(new int[]{10, 20, 50, 30}));
        assertEquals(9, largest(new int[]{9, 2, 5}));
        assertEquals(-1, largest(new int[]{-5, -1, -10}));
        assertEquals(7, largest(new int[]{7}));
    }
}
