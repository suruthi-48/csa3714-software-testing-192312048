import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q36ARMSPortalTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        String title = driver.getTitle();

        System.out.println("Page Title: " + title);

        if (title != null && !title.isEmpty()) {
            System.out.println("Title Verified Successfully");
        } else {
            System.out.println("Title Verification Failed");
        }

        driver.quit();
    }
}