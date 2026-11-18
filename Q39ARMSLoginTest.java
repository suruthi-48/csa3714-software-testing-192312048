
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q39ARMSLoginTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.id("username")).sendKeys("wronguser");
        driver.findElement(By.id("password")).sendKeys("wrongpassword");

        driver.findElement(By.className("radius")).click();

        String message = driver.findElement(By.id("flash")).getText();

        System.out.println("Login Message: " + message);

        driver.quit();
    }
}
