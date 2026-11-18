
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q33VotingTest {

    String checkVoting(int age) {
        if (age >= 18)
            return "Eligible";
        else
            return "Not Eligible";
    }

    @Test
    void testVoting() {
        assertEquals("Eligible", checkVoting(18));
        assertEquals("Eligible", checkVoting(25));
        assertEquals("Not Eligible", checkVoting(17));
        assertEquals("Not Eligible", checkVoting(10));
    }
}
