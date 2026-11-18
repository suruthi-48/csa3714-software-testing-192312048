
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AnagramTest {

    @Test
    public void testAnagram() {
        assertTrue(Anagram.checkAnagram("listen", "silent"));
    }

    @Test
    public void testNotAnagram() {
        assertFalse(Anagram.checkAnagram("hello", "world"));
    }

    @Test
    public void testDifferentLength() {
        assertFalse(Anagram.checkAnagram("cat", "cats"));
    }

    @Test
    public void testUppercase() {
        assertTrue(Anagram.checkAnagram("Heart", "Earth"));
    }
}
