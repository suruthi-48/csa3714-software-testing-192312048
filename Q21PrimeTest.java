
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q21PrimeTest {

    boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    @Test
    void testPrime() {
        assertTrue(isPrime(7));
        assertTrue(isPrime(13));
        assertFalse(isPrime(10));
        assertFalse(isPrime(1));
        assertFalse(isPrime(0));
        assertFalse(isPrime(-5));
    }
}
