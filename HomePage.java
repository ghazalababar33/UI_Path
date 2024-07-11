package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");
    public Homepage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthenticationLink).click();
       return new LoginPage(driver);
    }
}
