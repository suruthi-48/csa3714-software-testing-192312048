
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q34SimpleInterestTest {

    double calculateSI(double p, double t, boolean senior) {
        double rate;

        if (senior)
            rate = 12;
        else
            rate = 10;

        return (p * rate * t) / 100;
    }

    @Test
    void testInterest() {
        assertEquals(1200, calculateSI(10000, 1, true), 0.01);
        assertEquals(1000, calculateSI(10000, 1, false), 0.01);
        assertEquals(2400, calculateSI(10000, 2, true), 0.01);
        assertEquals(0, calculateSI(10000, 0, false), 0.01);
    }
}
