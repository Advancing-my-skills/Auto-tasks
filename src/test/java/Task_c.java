import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_c {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("Artificial Intelligence");
        searchInput.submit();
        WebElement historyLink = driver.findElement(By.linkText("History"));
        historyLink.click();
        System.out.println("Title of the History section: " + driver.getTitle());
        driver.quit();

        }
    }