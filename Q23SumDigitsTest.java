
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q23SumDigitsTest {

    int sumDigits(int n) {
        int sum = 0;
        n = Math.abs(n);

        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    @Test
    void testSum() {
        assertEquals(15, sumDigits(12345));
        assertEquals(6, sumDigits(123));
        assertEquals(0, sumDigits(0));
        assertEquals(6, sumDigits(-123));
    }
}
