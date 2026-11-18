
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q42CheckboxRadioTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        driver.findElement(By.id("checkbox-1")).click();

        System.out.println("Checkbox Selected");

        driver.get("https://formy-project.herokuapp.com/radio-button");

        driver.findElement(By.id("radio-button-1")).click();

        System.out.println("Radio Button Selected");

        driver.quit();
    }
}
