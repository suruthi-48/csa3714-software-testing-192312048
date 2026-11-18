
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q18EvenOddTest {

    String check(int n) {
        if (n % 2 == 0)
            return "Even";
        else
            return "Odd";
    }

    @Test
    void testEvenOdd() {
        assertEquals("Even", check(10));
        assertEquals("Odd", check(7));
        assertEquals("Even", check(0));
        assertEquals("Odd", check(-3));
    }
}
