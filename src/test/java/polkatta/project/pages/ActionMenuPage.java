package polkatta.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionMenuPage {

    WebDriver driver;

    public ActionMenuPage(WebDriver driver){

        this.driver = driver;
    }

    By btnvieweditdelete = By.xpath("//*[contains(text(),'View / Edit / Delete ads')]");

    public WebElement pressvieweditdeletebutton(){

        return driver.findElement(btnvieweditdelete);
    }
}
