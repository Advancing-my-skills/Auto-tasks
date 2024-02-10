
import org.openqa.selenium.chrome.ChromeDriver;

    public class Task_b {
        public static void main(String[] args) {
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://www.demoblaze.com/");
            driver.manage().window().maximize();

            String expectedTitle = "STORE";
            String actualTitle = driver.getTitle();

            if (actualTitle.equals(expectedTitle)) {
                System.out.println("Page landed on correct website");
            } else {
                System.out.println("Page not landed on correct website");
            }
            driver.quit();
        }
    }
