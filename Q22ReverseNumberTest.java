
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q22ReverseNumberTest {

    int reverse(int n) {
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }

    @Test
    void testReverse() {
        assertEquals(543, reverse(345));
        assertEquals(1, reverse(100));
        assertEquals(0, reverse(0));
        assertEquals(21, reverse(120));
    }
}
