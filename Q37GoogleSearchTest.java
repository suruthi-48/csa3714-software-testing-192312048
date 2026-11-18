
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q37GoogleSearchTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));

        searchBox.sendKeys("Selenium Automation");

        searchBox.submit();

        System.out.println("Google Search Successful");

        System.out.println("Page Title: " + driver.getTitle());

        driver.quit();
    }
}
