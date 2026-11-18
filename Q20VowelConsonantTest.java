
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q20VowelConsonantTest {

    int[] count(String s) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    @Test
    void testCount() {
        assertArrayEquals(new int[]{2, 3}, count("Hello"));
        assertArrayEquals(new int[]{5, 0}, count("aeiou"));
        assertArrayEquals(new int[]{0, 4}, count("bcdf"));
        assertArrayEquals(new int[]{0, 0}, count("123"));
    }
}
