
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q28ArmstrongTest {

    boolean isArmstrong(int n) {
        if (n < 0)
            return false;

        int temp = n, sum = 0;
        int digits = String.valueOf(n).length();

        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp = temp / 10;
        }
        return sum == n;
    }

    @Test
    void testArmstrong() {
        assertTrue(isArmstrong(153));
        assertTrue(isArmstrong(370));
        assertTrue(isArmstrong(9474));
        assertTrue(isArmstrong(0));
        assertFalse(isArmstrong(123));
        assertFalse(isArmstrong(-153));
    }
}
