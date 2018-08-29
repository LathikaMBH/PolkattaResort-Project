package polkatta.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountEditPage {

    WebDriver driver;

    public MyAccountEditPage(WebDriver driver){

        this.driver = driver;
    }

    By btnsavead = By.xpath("//*[@name='postad']");

    public WebElement presssavebutton(){

        return driver.findElement(btnsavead);
    }
}
