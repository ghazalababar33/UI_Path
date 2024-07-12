package base;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
import pages.Homepage;
public class BaseTests {
    private WebDriver driver;
    private Homepage homepage;
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.findElement(By.linkText("Shifting Content")).click();
        driver.findElement(By.linkText(("Example 1: Menu Element"))).click();
        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
        System.out.println("Number of menu items: " + menuItems.size());

        //WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        //inputsLink.click();
        //WebElement inputsLink = driver.findElement(By.linkText("Angie"));
        //inputsLink.click();

        System.out.println(driver.getTitle());
        //driver.quit();
    }

    public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
