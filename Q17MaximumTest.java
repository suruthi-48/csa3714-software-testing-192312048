
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q17MaximumTest {

    int maximum(int a, int b, int c) {
        if (a >= b && a >= c)
            return a;
        else if (b >= a && b >= c)
            return b;
        else
            return c;
    }

    @Test
    void testMaximum() {
        assertEquals(30, maximum(10, 20, 30));
        assertEquals(50, maximum(50, 20, 30));
        assertEquals(40, maximum(10, 40, 30));
        assertEquals(10, maximum(10, 10, 5));
    }
}
