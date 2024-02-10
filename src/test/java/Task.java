import org.openqa.selenium.By;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task {
    public static void main(String[] args) {

        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        System.out.println("Current Page URL: " + driver.getCurrentUrl());

        driver.navigate().refresh();
        driver.quit();
    }
}
