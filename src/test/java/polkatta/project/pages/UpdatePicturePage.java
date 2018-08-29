package polkatta.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdatePicturePage {

    WebDriver driver;

    public UpdatePicturePage(WebDriver driver){

        this.driver = driver;
    }

    By btnupdatepicture = By.xpath("//*[@value='Finish editing']");

    public WebElement pressupdatepicturebutton(){

        return driver.findElement(btnupdatepicture);
    }


}
