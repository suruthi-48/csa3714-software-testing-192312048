
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q32StringCompareTest {

    boolean compare(String a, String b) {
        return a.equals(b);
    }

    @Test
    void testCompare() {
        assertTrue(compare("Java", "Java"));
        assertFalse(compare("Java", "java"));
        assertFalse(compare("Hello", "World"));
        assertTrue(compare("", ""));
    }
}
