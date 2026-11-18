
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q41DropdownTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dropdown");

        Select dropdown = new Select(
            driver.findElement(By.id("dropdown"))
        );

        dropdown.selectByVisibleText("Option 1");

        System.out.println("Dropdown Selected Successfully");

        driver.quit();
    }
}
