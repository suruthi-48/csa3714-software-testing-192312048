
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q31ReverseWordTest {

    String reverse(String s) {
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    @Test
    void testReverse() {
        assertEquals("avaJ", reverse("Java"));
        assertEquals("olleH", reverse("Hello"));
        assertEquals("a", reverse("a"));
        assertEquals("", reverse(""));
    }
}
