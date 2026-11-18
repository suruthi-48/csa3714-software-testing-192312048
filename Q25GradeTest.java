
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q25GradeTest {

    String grade(int marks) {
        if (marks < 0 || marks > 100)
            return "Invalid";
        else if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 50)
            return "C";
        else
            return "Fail";
    }

    @Test
    void testGrade() {
        assertEquals("A", grade(95));
        assertEquals("B", grade(80));
        assertEquals("C", grade(60));
        assertEquals("Fail", grade(35));
        assertEquals("Invalid", grade(110));
        assertEquals("Invalid", grade(-5));
    }
}
