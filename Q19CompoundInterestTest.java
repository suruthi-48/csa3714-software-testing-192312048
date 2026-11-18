
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q19CompoundInterestTest {

    double calculateCI(double p, double r, double t) {
        double amount = p * Math.pow(1 + r / 100, t);
        return amount - p;
    }

    @Test
    void testCompoundInterest() {
        assertEquals(210, calculateCI(1000, 10, 2), 0.01);
        assertEquals(100, calculateCI(1000, 10, 1), 0.01);
        assertEquals(0, calculateCI(1000, 0, 2), 0.01);
    }
}
