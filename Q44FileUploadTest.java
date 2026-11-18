
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q44FileUploadTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/upload");

        driver.findElement(By.id("file-upload"))
            .sendKeys("C:\\Users\\YourName\\Desktop\\test.txt");

        driver.findElement(By.id("file-submit")).click();

        System.out.println("File Uploaded Successfully");

        driver.quit();
    }
}
