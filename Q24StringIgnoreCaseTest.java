
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q24StringIgnoreCaseTest {

    boolean compare(String a, String b) {
        return a.equalsIgnoreCase(b);
    }

    @Test
    void testCompare() {
        assertTrue(compare("Hello", "hello"));
        assertTrue(compare("JAVA", "java"));
        assertFalse(compare("Hello", "World"));
        assertTrue(compare("", ""));
    }
}
