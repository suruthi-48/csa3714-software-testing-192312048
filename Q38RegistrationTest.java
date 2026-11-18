
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q38RegistrationTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Sivapriya");
        driver.findElement(By.id("last-name")).sendKeys("S");
        driver.findElement(By.id("job-title")).sendKeys("Student");

        driver.findElement(By.id("radio-button-1")).click();
        driver.findElement(By.id("checkbox-1")).click();

        driver.findElement(By.linkText("Submit")).click();

        System.out.println("Registration Form Submitted");

        driver.quit();
    }
}
