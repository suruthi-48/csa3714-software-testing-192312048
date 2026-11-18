
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q29TemperatureTest {

    double convert(double c) {
        return (c * 9 / 5) + 32;
    }

    @Test
    void testTemperature() {
        assertEquals(32, convert(0), 0.01);
        assertEquals(212, convert(100), 0.01);
        assertEquals(98.6, convert(37), 0.01);
        assertEquals(-40, convert(-40), 0.01);
    }
}
