
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q27AverageTest {

    double average(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return (double) sum / a.length;
    }

    @Test
    void testAverage() {
        assertEquals(20.0, average(new int[]{10, 20, 30}), 0.01);
        assertEquals(5.0, average(new int[]{5, 5, 5, 5}), 0.01);
        assertEquals(0.0, average(new int[]{0, 0}), 0.01);
    }
}
