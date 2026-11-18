
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q30StringLengthTest {

    int findLength(String s) {
        int count = 0;

        for (int i = 0; ; i++) {
            try {
                s.charAt(i);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }

    @Test
    void testLength() {
        assertEquals(5, findLength("Hello"));
        assertEquals(4, findLength("Java"));
        assertEquals(0, findLength(""));
        assertEquals(7, findLength("Eclipse"));
    }
}
