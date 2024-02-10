import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        WebElement element  =  driver.findElement(By.id("APjFqb"));

        /* "APjFqb" - googlebox id
         By --> locators
         diff types of locator - id,name,xpath,css selector,tag name,classname,linktext, partiallinktext

         */

        element.sendKeys("mobiles");
        element.sendKeys(Keys.ENTER);


       // driver.quit();


    }
}


