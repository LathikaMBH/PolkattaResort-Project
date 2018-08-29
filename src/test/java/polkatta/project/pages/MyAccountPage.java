package polkatta.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {

    WebDriver driver;

    public MyAccountPage(WebDriver driver){

        this.driver = driver;
    }

    By btneditbutton = By.xpath("//*[@value='Edit']");

    public WebElement presseditbutton(){

        return driver.findElement(btneditbutton);
    }
}
