package polkatta.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver){

        this.driver = driver;
    }

    By btnpostad = By.xpath("//a[contains(text(),'Post your ad')]");

    public WebElement presspostadbutton(){

        return driver.findElement(btnpostad);
    }
}
