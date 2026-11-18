
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Q45ScreenshotTest {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        TakesScreenshot screenshot = (TakesScreenshot) driver;

        File source = screenshot.getScreenshotAs(OutputType.FILE);

        File destination = new File("screenshot.png");

        Files.copy(
            source.toPath(),
            destination.toPath(),
            StandardCopyOption.REPLACE_EXISTING
        );

        System.out.println("Screenshot Saved Successfully");
        System.out.println("Location: " + destination.getAbsolutePath());

        driver.quit();
    }
}
